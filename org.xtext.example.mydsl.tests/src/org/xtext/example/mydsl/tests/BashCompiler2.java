
  
package org.xtext.example.mydsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Display;
import org.xtext.example.mydsl.myDsl.Div;
import org.xtext.example.mydsl.myDsl.Insert;
import org.xtext.example.mydsl.myDsl.JSonAttribut;
import org.xtext.example.mydsl.myDsl.JSonEnum;
import org.xtext.example.mydsl.myDsl.JSonEnumField;
import org.xtext.example.mydsl.myDsl.JSonFile;
import org.xtext.example.mydsl.myDsl.JSonNull;
import org.xtext.example.mydsl.myDsl.JSonObject;
import org.xtext.example.mydsl.myDsl.JSonOperator;
import org.xtext.example.mydsl.myDsl.JSonString;
import org.xtext.example.mydsl.myDsl.JsonArray;
import org.xtext.example.mydsl.myDsl.JsonBoolean;
import org.xtext.example.mydsl.myDsl.JsonInteger;
import org.xtext.example.mydsl.myDsl.Load;
import org.xtext.example.mydsl.myDsl.MainGrammar;
import org.xtext.example.mydsl.myDsl.Modify;
import org.xtext.example.mydsl.myDsl.Mult;
import org.xtext.example.mydsl.myDsl.Projection;
import org.xtext.example.mydsl.myDsl.Subset;
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.myDsl.Sub;
import org.xtext.example.mydsl.myDsl.Sum;


public class BashCompiler2 {
	
	long startTime = System.nanoTime();
	private MainGrammar _model;
	private String tmpCode="";
	private int lvlIndenteCode =0;
	int multipleElement = 0;

	BashCompiler2(MainGrammar model) {	
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
		//Varialbe
		String bashCodeFinal = "";
		String jsonReferenceTMP = "";

		//Debut Generation code
		lvlIndenteCode++;
		EList<EObject> mainGrammar = _model.getMain();
		for (EObject main : mainGrammar) { 
			if (main instanceof JSonFile) {
				JSonFile f = (JSonFile) main;
				bashCodeFinal+=JsonFileToBash(f);
			}

			if(main instanceof Commandes) {
				Commandes com = (Commandes) main;
				if( com instanceof Load) {
					Load l = (Load) com;
					bashCodeFinal+= l.getName()+"=$(cat "+l.getPath()+"/"+l.getName()+".json)\n";
				}
				if( com instanceof Store) {
					Store l = (Store) com;
					bashCodeFinal += "echo \"$"+l.getContenu()+"\" >> "+l.getPath()+"/"+l.getName()+".json\n";
					}
				if( com instanceof Display) {
					Display l = (Display) com;
					bashCodeFinal += indentCode(lvlIndenteCode)+ "echo \"$"+l.getName()+"\" \n";
				}
				if( com instanceof Subset) {
					Subset l = (Subset) com;
					bashCodeFinal += subsetFonction(l.getNodenamesub(),l.getKeynamesub());
				}
				if( com instanceof Projection) {
					Projection l = (Projection) com;
					bashCodeFinal+= "echo \"$"+l.getNodename()+ "\" | jq \'."+l.getKeyname()+"\'";
				}
				if( com instanceof Insert) {
					Insert l = (Insert) com;
					bashCodeFinal += insertFonction(l.getTargetNode(),l.getNameObject());
				}
				if( com instanceof Remove) {
					Remove l = (Remove) com;
					bashCodeFinal += removeFonction(l.getTargetNode(),l.getNameObjectRemove());
				}
				if( com instanceof Modify) {
					Modify l = (Modify) com;
					bashCodeFinal += modifyFonction(l.getTargetNode(),l.getNameObjectRemove(),l.getNameObject());
				}
			}
		}

		long endTime = System.nanoTime();
		String timeEnding = "JQ time execution : "+ ((endTime - startTime))+"  //divide by 1000000 to get milliseconds.";
		Path TIME_OUTPUT = Paths.get("TimeExecutionBash");	

		Path BASH_OUTPUT = Paths.get("exampleBash.sh");		
		String BASH_INPUT = "./exampleBash.sh";	
		
		
		Set<PosixFilePermission> perms = new HashSet<>();
		perms.add(PosixFilePermission.OWNER_READ);
	    perms.add(PosixFilePermission.OWNER_WRITE);
	    perms.add(PosixFilePermission.OWNER_EXECUTE);

	    perms.add(PosixFilePermission.OTHERS_READ);
	    perms.add(PosixFilePermission.OTHERS_WRITE);
	    perms.add(PosixFilePermission.OTHERS_EXECUTE);

	    perms.add(PosixFilePermission.GROUP_READ);
	    perms.add(PosixFilePermission.GROUP_WRITE);
	    perms.add(PosixFilePermission.GROUP_EXECUTE);
		
	    Files.deleteIfExists(BASH_OUTPUT);
		Files.createFile(BASH_OUTPUT);
		Files.setPosixFilePermissions(BASH_OUTPUT, perms);
		Files.write(BASH_OUTPUT, bashCodeFinal.getBytes());
		
		Files.setPosixFilePermissions(TIME_OUTPUT, perms);
		Files.write(TIME_OUTPUT, timeEnding.getBytes());
		
		Process p = Runtime.getRuntime().exec(BASH_INPUT);
	    
		// output
	    BufferedReader stdInput = new BufferedReader(new 
	         InputStreamReader(p.getInputStream()));
	
	    // error
	    BufferedReader stdError = new BufferedReader(new 
	         InputStreamReader(p.getErrorStream()));
	
	    String o;
		while ((o = stdInput.readLine()) != null) {
	       // System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
	}

	
	public String Operation(EList<JSonOperator> sumlist, String operator) {
		String res = "";
		for (JSonOperator jo : sumlist) { 
			if( jo instanceof JsonInteger) {
				JsonInteger a = (JsonInteger) jo;
				res+= a.getValue()+operator;
			}
			else if( jo instanceof Sum) {
				Sum a = (Sum) jo;
				res+= "("+Operation(a.getListInterger(), "+")+")+";
			}
			else if( jo instanceof Div) {
				Div a = (Div) jo;
				res+= "("+Operation(a.getListInterger(), "/")+")+";
			}
			else if( jo instanceof Mult) {
				Mult a = (Mult) jo;
				res+= "("+Operation(a.getListInterger(), "*")+")+";
			}
			else if( jo instanceof Sub) {
				Sub a = (Sub) jo;
				res+= "("+Operation(a.getListInterger(), "-")+")+";
			}

		}
		if(sumlist.size()!=0) {
			res=res.substring(0,res.length()-1);
		}
		return res;
	}


	public String subsetFonction(String TargetNode, EList<String> eList) {
		String tmp = "";
		for (String NameObject : eList) { 
			tmp+= "echo \"$"+TargetNode+ "\" | jq \'."+NameObject+"\'\n";
		}
		multipleElement++;
		return tmp;
	}

	public String removeFonction(String TargetNode, String NameObject) {
		String tmp = "";
		tmp += indentCode(lvlIndenteCode)+TargetNode+"=\"\"\n";
		return tmp;
	}

	public String insertFonction(String TargetNode, String NameObject){
		String tmp = "";
		tmp += indentCode(lvlIndenteCode)+TargetNode+"=\"$"+ TargetNode +" $"+ NameObject +"\"\n";
		return tmp;
	}
	
	public String modifyFonction(String TargetNode,String NameObjectRemove, String NameObject){
		String tmp = "";
		tmp += indentCode(lvlIndenteCode)+TargetNode+"=\"$"+ NameObject +"\"\n";
		return tmp;
	}


	public String JsonFileToBash(JSonFile f) {
		String bashCodeFinal = "";
		String jsonReferenceTMP = "";
		
		EList<JSonObject> list = f.getContient();
		bashCodeFinal+=declarationCompositionJson(list);
		
		bashCodeFinal += f.getName()+ "=\'{\n";
		for (int i = 0; i < list.size(); i++) { 
			JSonObject jo = list.get(i);
			//System.out.println(list.size());
			if( jo instanceof JsonArray) {
				JsonArray a = (JsonArray) jo;
				//TODO
				int arrayPosition = 0;
				
				bashCodeFinal+= indentCode(lvlIndenteCode) + " \"" + a.getName() + "\": {\n" + jsonArrayRecursive(a,a);
				bashCodeFinal+= indentCode(lvlIndenteCode)+ "}\n";
				
				tmpCode ="";
			}
			if( jo instanceof JSonEnum) {
				JSonEnum a = (JSonEnum) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode) + " \"" + a.getName() + "\": [" + jsonEnumList(a) + "]\n";
				tmpCode ="";
			}
			if( jo instanceof JsonInteger) {
				JsonInteger a = (JsonInteger) jo;
				
				bashCodeFinal+= indentCode(lvlIndenteCode) + " \"" + a.getName() + "\" : " + a.getValue();
				if(i < list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof JsonBoolean) {
				JsonBoolean a = (JsonBoolean) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode) + " \"" + a.getName() + "\" : " + a.getValue();
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
		
			if( jo instanceof JSonString) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode) + " \"" + a.getName() + "\" : \"" + a.getValue() + "\"" ;
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";

			}
			if( jo instanceof JSonNull) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode) + " \"" + a.getName() + "\" : null\n" ;
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Sum) {
				Sum a = (Sum) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode) + "\"" + a.getName() + "\" : " + Operation(sumlist,"+");
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Div) {
				Div a = (Div) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode) + "\"" + a.getName() + "\" : " + Operation(sumlist,"/");
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
				
			}
			if( jo instanceof Mult) {
				Mult a = (Mult) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode) + "\"" + a.getName() + "\" : " + Operation(sumlist,"*");
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
				
			}
			if( jo instanceof Sub) {
				Sub a = (Sub) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode) + "\"" + a.getName() + "\" : " + Operation(sumlist,"-");
				if(i <= list.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
				
			}
		}
		bashCodeFinal += "}\'\n";
		lvlIndenteCode--;
		return bashCodeFinal;

	}
	
	
	
	public String declarationCompositionJson(EList<JSonObject> list2) {
		String bashCodeFinal = "";
		String jsonReferenceTMP = "";
		
		for (int i = 0; i < list2.size(); i++) { 
			JSonObject jo = list2.get(i);
			//System.out.println(list.size());
			if( jo instanceof JsonArray) {
				JsonArray a = (JsonArray) jo;
				//TODO
				int arrayPosition = 0;
				bashCodeFinal+=declarationCompositionJsonAttribut(a.getContient());
				bashCodeFinal+= a.getName() + "='{\n" + jsonArrayRecursive(a,a);
				bashCodeFinal+= indentCode(lvlIndenteCode)+ "}'\n";
				
				tmpCode ="";
			}
			if( jo instanceof JSonEnum) {
				JSonEnum a = (JSonEnum) jo;
				bashCodeFinal+=a.getName() + "= '[" + jsonEnumList(a) + "]'\n";
				tmpCode ="";
			}
			if( jo instanceof JsonInteger) {
				JsonInteger a = (JsonInteger) jo;
				
				bashCodeFinal+=a.getName() + "=" + a.getValue();
				if(i < list2.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof JsonBoolean) {
				JsonBoolean a = (JsonBoolean) jo;
				bashCodeFinal+="" + a.getName() + "=" + a.getValue();
				if(i <= list2.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
		
			if( jo instanceof JSonString) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+=  a.getName() + "=\"" + a.getValue() + "\"" ;
				if(i <= list2.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";

			}
			if( jo instanceof JSonNull) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+=  a.getName() + "=null\n" ;
				if(i <= list2.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Sum) {
				Sum a = (Sum) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"+")+")'";
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Div) {
				Div a = (Div) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"/")+")'";
				bashCodeFinal+= "\n";
				
			}
			if( jo instanceof Mult) {
				Mult a = (Mult) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"*")+")'";
				bashCodeFinal+= "\n";
				
			}
			if( jo instanceof Sub) {
				Sub a = (Sub) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"-")+")'";
				bashCodeFinal+= "\n";
				
			}
		}
		lvlIndenteCode--;
		return bashCodeFinal;

	}
	
	public String declarationCompositionJsonAttribut(EList<JSonAttribut> eList) {
		String bashCodeFinal = "";
		String jsonReferenceTMP = "";
		
		for (int i = 0; i < eList.size(); i++) { 
			JSonAttribut jo = eList.get(i);
			//System.out.println(list.size());
			if( jo instanceof JsonArray) {
				JsonArray a = (JsonArray) jo;
				//TODO
				int arrayPosition = 0;
				declarationCompositionJsonAttribut(a.getContient());
				bashCodeFinal+= a.getName() + "='{\n" + jsonArrayRecursive(a,a);
				bashCodeFinal+= indentCode(lvlIndenteCode)+ "}'\n";
				
				tmpCode ="";
			}
			if( jo instanceof JSonEnum) {
				JSonEnum a = (JSonEnum) jo;
				bashCodeFinal+=a.getName() + "= '[" + jsonEnumList(a) + "]'\n";
				tmpCode ="";
			}
			if( jo instanceof JsonInteger) {
				JsonInteger a = (JsonInteger) jo;
				
				bashCodeFinal+=a.getName() + "=" + a.getValue();
				if(i < eList.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof JsonBoolean) {
				JsonBoolean a = (JsonBoolean) jo;
				bashCodeFinal+="" + a.getName() + "=" + a.getValue();
				if(i <= eList.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
		
			if( jo instanceof JSonString) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+=  a.getName() + "=\"" + a.getValue() + "\"" ;
				if(i <= eList.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";

			}
			if( jo instanceof JSonNull) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+=  a.getName() + "=null\n" ;
				if(i <= eList.size()-1) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Sum) {
				Sum a = (Sum) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"+")+")'";
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Div) {
				Div a = (Div) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"/")+")'";
				bashCodeFinal+= "\n";
				
			}
			if( jo instanceof Mult) {
				Mult a = (Mult) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"*")+")'";
				bashCodeFinal+= "\n";
				
			}
			if( jo instanceof Sub) {
				Sub a = (Sub) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+=a.getName() + "='(" + Operation(sumlist,"-")+")'";
				bashCodeFinal+= "\n";
				
			}
		}
		lvlIndenteCode--;
		return bashCodeFinal;

	}
	
	
	
	
	
	public String jsonEnumList(JSonEnum a) {
		EList<JSonEnumField> listEnum = a.getContient();
		for(int i = 0; i < listEnum.size(); i++) {
			JSonEnumField att = listEnum.get(i);
			if( att instanceof JsonBoolean) {
				JsonBoolean b = (JsonBoolean) att;
				tmpCode+= b.getValue();
				if(i + 1 != listEnum.size()) {
					tmpCode+= ",";
				}
				multipleElement++;
			}
			else if( att instanceof JsonInteger) {
				JsonInteger b = (JsonInteger) att;//
				tmpCode+= b.getValue();
				if(i + 1 != listEnum.size()) {
					tmpCode+= ",";
				}
				multipleElement++;
			}
			else if( att instanceof JSonString) {
				JSonString b = (JSonString) att;
				tmpCode+= "\"" + b.getValue() + "\"";
				if(i + 1 != listEnum.size()) {
					tmpCode+= ",";
				}
				multipleElement++;
			}
			else if( att instanceof JSonNull) {
				tmpCode+= "null";
				if(i + 1 != listEnum.size()) {
					tmpCode+= ",";
				}
				multipleElement++;
			}
		}
		return tmpCode;

	}
	
	//TODO
	public String declarationComposition(JsonArray a,JsonArray f ) {
		tmpCode="";
		lvlIndenteCode++;
		EList<JSonAttribut> listArray = a.getContient();
		int i = 0;
		for (JSonAttribut att : listArray) {
			
			if( att instanceof JsonBoolean) {
				JsonBoolean b = (JsonBoolean) att;
				tmpCode+= indentCode(lvlIndenteCode) + "" + b.getName() + " : " + b.getValue()+"";
			}
			else if( att instanceof JsonInteger) {
				JsonInteger b = (JsonInteger) att;//
				tmpCode+= indentCode(lvlIndenteCode) + "" + b.getName() + " : " + b.getValue();
			}

			else if( att instanceof JSonString) {
				JSonString b = (JSonString) att;
				tmpCode+= indentCode(lvlIndenteCode) + "" + b.getName() + " : \"" + b.getValue()+"\"";
			}
			else if( att instanceof JSonNull) {
				JSonNull b = (JSonNull) att;
				tmpCode+= indentCode(lvlIndenteCode) + "" + b.getName() + " : null";
			}
			else if( att instanceof JsonArray) {
				JsonArray b = (JsonArray) att;
				tmpCode+= indentCode(lvlIndenteCode)+"\"" + b.getName() + "\": {\n " + jsonArrayRecursive(b,b) +"\n" ;
				tmpCode+= indentCode(lvlIndenteCode)+"}\n";
			}
			else if( att instanceof JSonEnum) {
				JSonEnum b = (JSonEnum) att;
				tmpCode+= indentCode(lvlIndenteCode) + "\"" + b.getName() + "\": [" + jsonEnumList(b) + "]\n";
			}
			else if( att instanceof Sum) {
				Sum b = (Sum) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"+")+")";
			}
			else if( att instanceof Div) {
				Div b = (Div) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"/")+")";
			}
			else if( att instanceof Mult) {
				Mult b = (Mult) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"*")+")";
			}
			else if( att instanceof Sub) {
				Sub b = (Sub) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"-")+")";
			}
			if(i + 1 != listArray.size()) {
				tmpCode+= " ,\n";
			}
			i++;
		}
		lvlIndenteCode--;
		if(!a.equals(f)) {
		}
		return tmpCode;
	}
	
	
	

	public String jsonArrayRecursive(JsonArray a,JsonArray f ) {
		tmpCode="";
		lvlIndenteCode++;
		EList<JSonAttribut> listArray = a.getContient();
		int i = 0;
		for (JSonAttribut att : listArray) {
			
			if( att instanceof JsonBoolean) {
				JsonBoolean b = (JsonBoolean) att;
				tmpCode+= indentCode(lvlIndenteCode) + "\"" + b.getName() + "\" : " + b.getValue()+"";
			}
			else if( att instanceof JsonInteger) {
				JsonInteger b = (JsonInteger) att;//
				tmpCode+= indentCode(lvlIndenteCode) + "\"" + b.getName() + "\" : " + b.getValue();
			}

			else if( att instanceof JSonString) {
				JSonString b = (JSonString) att;
				tmpCode+= indentCode(lvlIndenteCode) + "\"" + b.getName() + "\" : \"" + b.getValue()+"\"";
			}
			else if( att instanceof JSonNull) {
				JSonNull b = (JSonNull) att;
				tmpCode+= indentCode(lvlIndenteCode) + "\"" + b.getName() + "\" : null";
			}
			else if( att instanceof JsonArray) {
				JsonArray b = (JsonArray) att;
				tmpCode+= indentCode(lvlIndenteCode)+"\"" + b.getName() + "\": {\n " + jsonArrayRecursive(b,b) +"\n" ;
				tmpCode+= indentCode(lvlIndenteCode)+"}\n";
			}
			else if( att instanceof JSonEnum) {
				JSonEnum b = (JSonEnum) att;
				tmpCode+= indentCode(lvlIndenteCode) + "\"" + b.getName() + "\": [" + jsonEnumList(b) + "]\n";
			}
			else if( att instanceof Sum) {
				Sum b = (Sum) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"+")+")";
			}
			else if( att instanceof Div) {
				Div b = (Div) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"/")+")";
			}
			else if( att instanceof Mult) {
				Mult b = (Mult) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"*")+")";
			}
			else if( att instanceof Sub) {
				Sub b = (Sub) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+ "\"" + b.getName() + "\" : (" + Operation(sumlist,"-")+")";
			}
			if(i + 1 != listArray.size()) {
				tmpCode+= " ,\n";
			}
			i++;
		}
		lvlIndenteCode--;
		if(!a.equals(f)) {
		}
		return tmpCode;
	}



	public String indentCode(int lvl) {
		String res = "";
		for(int i=0;i<lvl;i++) {
			res+="	";
		}
		return res;
	}


}