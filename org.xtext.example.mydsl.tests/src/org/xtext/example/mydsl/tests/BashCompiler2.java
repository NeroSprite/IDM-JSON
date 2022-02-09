
  
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
					bashCodeFinal += indentCode(lvlIndenteCode)+"try {\n";
					lvlIndenteCode++;
					bashCodeFinal += indentCode(lvlIndenteCode)+"JSONParser parser = new JSONParser();" +  "\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"Object paser"+l.getName()+" = parser.parse(new FileReader( \"" + l.getPath()+"/"+l.getName() + ".json\"));\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"JSONObject "+ l.getName()+" =  (JSONObject) paser" +l.getName()+";" + "\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"} catch (Exception io) {\n";
					lvlIndenteCode++;
					bashCodeFinal += indentCode(lvlIndenteCode)+"io.getMessage();\n";
					lvlIndenteCode--;
					bashCodeFinal += indentCode(lvlIndenteCode)+"}\n";
				}
				if( com instanceof Store) {
					Store l = (Store) com;
					bashCodeFinal += indentCode(lvlIndenteCode)+"try {\n";
					lvlIndenteCode++;
					bashCodeFinal += indentCode(lvlIndenteCode)+"String path"+l.getName()+" =\""+l.getPath()+"/"+l.getName()+".json\";\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"FileWriter file"+l.getName()+" = new FileWriter(path"+l.getName()+");\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"String json"+l.getName()+" = "+l.getName()+".toString();\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"file"+l.getName()+".write(json"+l.getName()+");\n";
					bashCodeFinal += indentCode(lvlIndenteCode)+"file"+l.getName()+".close();\n";
					lvlIndenteCode--;
					bashCodeFinal += indentCode(lvlIndenteCode)+"} catch (IOException io) {\n";
					lvlIndenteCode++;
					bashCodeFinal += indentCode(lvlIndenteCode)+"io.getMessage();\n";
					lvlIndenteCode--;
					bashCodeFinal += indentCode(lvlIndenteCode)+"}\n";


					//bashCodeFinal += "private static FileWriter "+l.getName()+"; " + "\n";
					//bashCodeFinal += l.getName()+" = new FileWriter(" + l.getPath()+"/"+l.getName() + ".json); \n";
					//bashCodeFinal += l.getName()+".white(jsonfile.toJSONString());" + "\n";
				}
				if( com instanceof Display) {
					Display l = (Display) com;

					//for (JSonFile jo : l.getJsonfile()) { 
					//jsonReferenceTMP = jo.getName();
					//bashCodeFinal+=JsonFileToJava(jo);
					bashCodeFinal += indentCode(lvlIndenteCode)+"System.out.println("+l.getName()+"); \n";
					//}
				}
				if( com instanceof Subset) {
					Subset l = (Subset) com;

					bashCodeFinal+= indentCode(lvlIndenteCode)+"//Subset \n";
					bashCodeFinal += subsetFonction(l.getNodenamesub(),l.getKeynamesub());
				}
				if( com instanceof Projection) {
					Projection l = (Projection) com;
					bashCodeFinal+= indentCode(lvlIndenteCode)+"//Projection \n";
					bashCodeFinal += projectionFonction(l.getNodename(),l.getKeyname());
					//bashCodeFinal += indentCode(lvlIndenteCode)+"return IntStream.range(0, "+l.getNodename()+".length())\n"
					//		+ "      .mapToObj(index -> ((JSONObject)"+l.getNodename()+".get(index)).optString("+l.getKeyname()+"))\n"
					//		+ "      .collect(Collectors.toList());";
				}
				if( com instanceof Insert) {
					Insert l = (Insert) com;
					bashCodeFinal+= indentCode(lvlIndenteCode)+"//Insert \n";
					bashCodeFinal += insertFonction(l.getTargetNode(),l.getNameObject());
				}
				if( com instanceof Remove) {
					Remove l = (Remove) com;
					bashCodeFinal+= indentCode(lvlIndenteCode)+"//Remove \n";
					bashCodeFinal += removeFonction(l.getTargetNode(),l.getNameObjectRemove());

				}
				if( com instanceof Modify) {
					Modify l = (Modify) com;
					bashCodeFinal+= indentCode(lvlIndenteCode)+"//Modify \n";
					bashCodeFinal += removeFonction(l.getTargetNode(),l.getNameObjectRemove());
					bashCodeFinal += insertFonction(l.getTargetNode(),l.getNameObject());
				}
			}
		}

		//String javaCode = "import pd.read_csv(\"" + csvFilename + "\")\n" +
		//		"print(df)";	

		// serialize code into Python filename
		Path BASH_OUTPUT = Paths.get("exampleBash.sh");		
		String BASH_INPUT = "./exampleBash.sh";	
		
		/*resolve
		FileWriter fw = new FileWriter(PYTHON_OUTPUT);
		fw.write(pythonCode);
		fw.flush();
		fw.close();	
		*/
		// or shorter
		
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
		
		// execute the generated Python code
		// roughly: exec "python foo.py"
		
		Process p = Runtime.getRuntime().exec(BASH_INPUT);
	    
		// output
	    BufferedReader stdInput = new BufferedReader(new 
	         InputStreamReader(p.getInputStream()));
	
	    // error
	    BufferedReader stdError = new BufferedReader(new 
	         InputStreamReader(p.getErrorStream()));
	
	    String o;
		while ((o = stdInput.readLine()) != null) {
	        System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
	}

	//TODO
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

	//TODO
	public String subsetFonction(String TargetNode, EList<String> eList) {

		String tmp = "";
		tmp += indentCode(lvlIndenteCode)+"JSONObject search"+multipleElement +" = new JSONObject(); \n";
		for (String NameObject : eList) { 
			tmp+= indentCode(lvlIndenteCode)+"for(int i=0;i<"+TargetNode+".length();i++) {\n";
			lvlIndenteCode++;
			tmp+= indentCode(lvlIndenteCode)+"JSONObject jsonObj"+multipleElement +" = "+TargetNode+".getJSONObject(i);\n";
			tmp += indentCode(lvlIndenteCode) + "String k"+multipleElement+" = jsonObj"+multipleElement +".keys().next();\n";
			tmp+= indentCode(lvlIndenteCode)+"if(\""+NameObject+"\".equals(k"+multipleElement+")) {\n";
			lvlIndenteCode++;   
			tmp+= indentCode(lvlIndenteCode)+"search"+multipleElement+".put(k"+multipleElement+", jsonObj"+multipleElement+".getString(k"+multipleElement+"));\n";
			lvlIndenteCode--;
			tmp+= indentCode(lvlIndenteCode)+"}\n";
			lvlIndenteCode--;
			tmp+= indentCode(lvlIndenteCode)+"}\n";
		}
		multipleElement++;
		return tmp;
	}

	public String projectionFonction(String TargetNode, String NameObject) {
		String tmp = "";
		tmp += indentCode(lvlIndenteCode)+"JSONObject search"+multipleElement +" = new JSONObject(); \n";
		tmp+= indentCode(lvlIndenteCode)+"for(int i=0;i<"+TargetNode+".length();i++) {\n";
		lvlIndenteCode++;
		tmp+= indentCode(lvlIndenteCode)+"JSONObject jsonObj"+multipleElement +" = "+TargetNode+".getJSONObject(i);\n";
		tmp += indentCode(lvlIndenteCode) + "String k"+multipleElement+" = jsonObj"+multipleElement +".keys().next();\n";
		tmp+= indentCode(lvlIndenteCode)+"if(\""+NameObject+"\".equals(k"+multipleElement+")) {\n";
		lvlIndenteCode++;   
		tmp+= indentCode(lvlIndenteCode)+"search"+multipleElement+".put(k"+multipleElement+", jsonObj"+multipleElement+".getString(k"+multipleElement+"));\n";
		lvlIndenteCode--;
		tmp+= indentCode(lvlIndenteCode)+"}\n";
		lvlIndenteCode--;
		tmp+= indentCode(lvlIndenteCode)+"}\n";
		multipleElement++;
		return tmp;
	}


	public String removeFonction(String TargetNode, String NameObject) {
		String tmp = "";
		tmp+= indentCode(lvlIndenteCode)+"int index"+multipleElement+" = 0; \n";
		tmp+= indentCode(lvlIndenteCode)+"for(int i=0;i<"+TargetNode+".length();i++) {\n";
		lvlIndenteCode++;
		tmp+= indentCode(lvlIndenteCode)+"if("+NameObject+".equals("+TargetNode+".get(i))) {\n";
		lvlIndenteCode++;    
		tmp+= indentCode(lvlIndenteCode)+"index"+multipleElement+" = i;\n";
		lvlIndenteCode--;
		tmp+= indentCode(lvlIndenteCode)+"}\n";
		lvlIndenteCode--;
		tmp+= indentCode(lvlIndenteCode)+"}\n";
		tmp += indentCode(lvlIndenteCode)+TargetNode+".remove(index"+multipleElement+"); \n";
		multipleElement++;
		return tmp;
	}


	public String insertFonction(String TargetNode, String NameObject){
		String tmp = "";
		tmp += indentCode(lvlIndenteCode)+TargetNode+".put("+NameObject+"); \n";
		return tmp;
	}

	//TODO
	public String JsonFileToBash(JSonFile f) {
		String bashCodeFinal = "";
		String jsonReferenceTMP = "";
		bashCodeFinal += "echo '{\n";
		EList<JSonObject> list = f.getContient();
		for (int i = 0; i < list.size(); i++) { 
			JSonObject jo = list.get(i);
			System.out.println(list.size());
			if( jo instanceof JsonArray) {
				JsonArray a = (JsonArray) jo;

				int arrayPosition = 0;

				bashCodeFinal+=jsonArrayRecursive(a,a);
				tmpCode ="";
			}
			if( jo instanceof JSonEnum) {
				JSonEnum a = (JSonEnum) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode) + "\"" + a.getName() + "\": [" + jsonEnumList(a) + "]\n";
				tmpCode ="";
			}
			if( jo instanceof JsonInteger) {
				JsonInteger a = (JsonInteger) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP + "\"" + a.getName() + "\" : " + a.getValue();
				if(i != list.size()) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof JsonBoolean) {
				JsonBoolean a = (JsonBoolean) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP + "\"" + a.getName() + "\" : " + a.getValue();
				if(i != list.size()) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
		
			if( jo instanceof JSonString) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP + "\"" + a.getName() + "\" : \"" + a.getValue() + "\"" ;
				if(i != list.size()) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";

			}
			if( jo instanceof JSonNull) {
				JSonString a = (JSonString) jo;
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP + "\"" + a.getName() + "\" : null\n" ;
				if((i -1 ) != list.size()) {
					bashCodeFinal+= ",";
				}
				bashCodeFinal+= "\n";
			}
			if( jo instanceof Sum) {
				Sum a = (Sum) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				bashCodeFinal += Operation(sumlist,"+");
				bashCodeFinal += ")); \n";
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
			if( jo instanceof Div) {
				Div a = (Div) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				bashCodeFinal += Operation(sumlist,"/");
				bashCodeFinal += ")); \n";
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
			if( jo instanceof Mult) {
				Mult a = (Mult) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				bashCodeFinal += Operation(sumlist,"*");
				bashCodeFinal += ")); \n";
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
			if( jo instanceof Sub) {
				Sub a = (Sub) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				bashCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				bashCodeFinal += Operation(sumlist,"-");
				bashCodeFinal += ")); \n";
				bashCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
		}
		bashCodeFinal += "}'";
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

	public String jsonArrayRecursive(JsonArray a,JsonArray f ) {
		tmpCode += indentCode(lvlIndenteCode)+ a.getName() +" : [ \n";
		EList<JSonAttribut> listArray = a.getContient();
		for (JSonAttribut att : listArray) {
			if( att instanceof JsonBoolean) {
				JsonBoolean b = (JsonBoolean) att;
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", new Boolean("+b.getValue()+")); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
			else if( att instanceof JsonInteger) {
				JsonInteger b = (JsonInteger) att;//
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", new Double("+b.getValue()+")); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}

			else if( att instanceof JSonString) {
				JSonString b = (JSonString) att;
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", \""+b.getValue()+"\"); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
			else if( att instanceof JSonNull) {
				JSonNull b = (JSonNull) att;
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", \"null\"); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
			else if( att instanceof JsonArray) {
				JsonArray b = (JsonArray) att;
				tmpCode= jsonArrayRecursive(b,a);
				//tmpCode ="";
			}
			else if( att instanceof JSonEnum) {
				JSonEnum b = (JSonEnum) att;
				tmpCode += indentCode(lvlIndenteCode)+"JSONArray "+ b.getName() +" = new JSONArray(); \n";

				jsonEnumList(b);
				tmpCode+=indentCode(lvlIndenteCode)+f.getName()+".put("+b.getName()+"); \n";

			}
			else if( att instanceof Sum) {
				Sum b = (Sum) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", new Double(";
				tmpCode += Operation(sumlist,"+");
				tmpCode += ")); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
			else if( att instanceof Div) {
				Div b = (Div) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", new Double(";
				tmpCode += Operation(sumlist,"/");
				tmpCode += ")); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
			else if( att instanceof Mult) {
				Mult b = (Mult) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", new Double(";
				tmpCode += Operation(sumlist,"*");
				tmpCode += ")); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
			else if( att instanceof Sub) {
				Sub b = (Sub) att;
				EList<JSonOperator> sumlist = b.getListInterger();
				tmpCode+= indentCode(lvlIndenteCode)+"JSONObject "+b.getName()+"= new JSONObject().put(\""+b.getName()+"\", new Double(";
				tmpCode += Operation(sumlist,"-");
				tmpCode += ")); \n";
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+"); \n";
			}
		}
		if(!a.equals(f)) {
			tmpCode += indentCode(lvlIndenteCode)+f.getName()+".put("+a.getName()+"); \n";
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