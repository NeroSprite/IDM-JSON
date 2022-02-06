package org.xtext.example.mydsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character.Subset;

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
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.myDsl.Sub;
import org.xtext.example.mydsl.myDsl.Sum;

import com.google.common.io.Files;

public class JavaCompiler {
	private MainGrammar _model;
	private String tmpCode="";
	private int lvlIndenteCode =0;

	JavaCompiler(MainGrammar model) {	
		_model = model;	
	}

	public void compileAndRun() throws IOException {
		//Varialbe
		String javaCodeFinal = "";
		String jsonReferenceTMP = "";
		int i = 0;


		//Debut Generation code

		javaCodeFinal+="import org.json.JSONArray;\nimport org.json.JSONObject;\nimport org.json.simple.parser.JSONParser;\nimport java.io.FileWriter;\nimport java.io.FileReader;\nimport java.io.IOException;\n\n";
		javaCodeFinal+="public class Java {\n";
		lvlIndenteCode++;
		javaCodeFinal+=indentCode(lvlIndenteCode)+"public static void main(String args[]) {\n";
		lvlIndenteCode++;
		EList<EObject> mainGrammar = _model.getMain();
		for (EObject main : mainGrammar) { 
			if (main instanceof JSonFile) {
				JSonFile f = (JSonFile) main;
				javaCodeFinal+=JsonFileToJava(f);
			}

			if(main instanceof Commandes) {
				Commandes com = (Commandes) main;
				if( com instanceof Load) {
					Load l = (Load) com;
					javaCodeFinal += indentCode(lvlIndenteCode)+"try {\n";
					lvlIndenteCode++;
					javaCodeFinal += indentCode(lvlIndenteCode)+"JSONParser parser = new JSONParser();" +  "\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"Object paser"+l.getName()+" = parser.parse(new FileReader( \"" + l.getPath()+"/"+l.getName() + ".json\"));\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"JSONObject "+ l.getName()+" =  (JSONObject) paser" +l.getName()+";" + "\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"} catch (Exception io) {\n";
					lvlIndenteCode++;
					javaCodeFinal += indentCode(lvlIndenteCode)+"io.getMessage();\n";
					lvlIndenteCode--;
					javaCodeFinal += indentCode(lvlIndenteCode)+"}\n";
				}
				if( com instanceof Store) {
					Store l = (Store) com;
					javaCodeFinal += indentCode(lvlIndenteCode)+"try {\n";
					lvlIndenteCode++;
					javaCodeFinal += indentCode(lvlIndenteCode)+"String path"+l.getName()+" =\""+l.getPath()+"/"+l.getName()+".json\";\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"FileWriter file"+l.getName()+" = new FileWriter(path"+l.getName()+");\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"String json"+l.getName()+" = "+l.getName()+".toString();\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"file"+l.getName()+".write(json"+l.getName()+");\n";
					javaCodeFinal += indentCode(lvlIndenteCode)+"file"+l.getName()+".close();\n";
					lvlIndenteCode--;
					javaCodeFinal += indentCode(lvlIndenteCode)+"} catch (IOException io) {\n";
					lvlIndenteCode++;
					javaCodeFinal += indentCode(lvlIndenteCode)+"io.getMessage();\n";
					lvlIndenteCode--;
					javaCodeFinal += indentCode(lvlIndenteCode)+"}\n";
					
					
					//javaCodeFinal += "private static FileWriter "+l.getName()+"; " + "\n";
					//javaCodeFinal += l.getName()+" = new FileWriter(" + l.getPath()+"/"+l.getName() + ".json); \n";
					//javaCodeFinal += l.getName()+".white(jsonfile.toJSONString());" + "\n";
				}
				if( com instanceof Display) {
					Display l = (Display) com;
					
					//for (JSonFile jo : l.getJsonfile()) { 
						//jsonReferenceTMP = jo.getName();
						//javaCodeFinal+=JsonFileToJava(jo);
						javaCodeFinal += indentCode(lvlIndenteCode)+"System.out.println("+l.getName()+"); \n";
					//}
				}
				if( com instanceof Subset) {
					Subset l = (Subset) com;
					javaCodeFinal += "//TODO";
				}
				if( com instanceof Projection) {
					Projection l = (Projection) com;
					javaCodeFinal += "//TODO";
				}
				if( com instanceof Insert) {
					Insert l = (Insert) com;
					javaCodeFinal += "//TODO";
				}
				if( com instanceof Remove) {
					Remove l = (Remove) com;
					javaCodeFinal += "//TODO";
				}
				if( com instanceof Modify) {
					Modify l = (Modify) com;
					javaCodeFinal += "//TODO";
				}
			}
		}
		javaCodeFinal+=indentCode(lvlIndenteCode)+"}\n";
		lvlIndenteCode--;
		javaCodeFinal+=indentCode(lvlIndenteCode)+"}";

		//String javaCode = "import pd.read_csv(\"" + csvFilename + "\")\n" +
		//		"print(df)";	

		// serialize code into Python filename
		String JAVA_OUTPUT = "Java.java";
		String JAVA_INPUT = "javac -cp json.jar:json-simple.jar Java.java";
		/*
		FileWriter fw = new FileWriter(PYTHON_OUTPUT);
		fw.write(pythonCode);
		fw.flush();
		fw.close();	
		 */
		// or shorter
		Files.write(javaCodeFinal.getBytes(), new File(JAVA_OUTPUT));

		// execute the generated Python code
		// roughly: exec "python foo.py"

		Process p = Runtime.getRuntime().exec(JAVA_INPUT);

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

	public String JsonFileToJava(JSonFile f) {
		String javaCodeFinal = "";
		String jsonReferenceTMP = "";
		javaCodeFinal += indentCode(lvlIndenteCode)+"JSONObject "+ f.getName() +" = new JSONObject(); \n";
		jsonReferenceTMP = f.getName();
		EList<JSonObject> list = f.getContient();
		for (JSonObject jo : list) { 
			if( jo instanceof JsonArray) {
				JsonArray a = (JsonArray) jo;

				int arrayPosition = 0;

				javaCodeFinal+=jsonArrayRecursive(a,a);
				javaCodeFinal+=indentCode(lvlIndenteCode)+f.getName()+".put(\""+a.getName()+"\","+a.getName()+"); \n";
				tmpCode ="";
			}
			if( jo instanceof JsonInteger) {
				JsonInteger a = (JsonInteger) jo;
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double("+a.getValue()+")); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put(\""+a.getName()+"\","+a.getName()+"); \n";
			}
			if( jo instanceof JsonBoolean) {
				JsonBoolean a = (JsonBoolean) jo;
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Boolean("+a.getValue()+")); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put(\""+a.getName()+"\","+a.getName()+"); \n";
			}
			if( jo instanceof JSonEnum) {
				JSonEnum a = (JSonEnum) jo;
				javaCodeFinal+=jsonEnumList(a);
				javaCodeFinal+=indentCode(lvlIndenteCode)+f.getName()+".put(\""+a.getName()+"\","+a.getName()+"); \n";
				tmpCode ="";
			}
			if( jo instanceof JSonString) {
				JSonString a = (JSonString) jo;
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", \""+a.getValue()+"\"); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put(\""+a.getName()+"\","+a.getName()+"); \n";

			}
			if( jo instanceof JSonNull) {
				JSonNull a = (JSonNull) jo;
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", \"null\"); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put(\""+a.getName()+"\","+a.getName()+"); \n";
			}
			if( jo instanceof Sum) {
				Sum a = (Sum) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				javaCodeFinal += Operation(sumlist,"+");
				javaCodeFinal += ")); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
			if( jo instanceof Div) {
				Div a = (Div) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				javaCodeFinal += Operation(sumlist,"/");
				javaCodeFinal += ")); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
			if( jo instanceof Mult) {
				Mult a = (Mult) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				javaCodeFinal += Operation(sumlist,"*");
				javaCodeFinal += ")); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
			if( jo instanceof Sub) {
				Sub a = (Sub) jo;
				EList<JSonOperator> sumlist = a.getListInterger();
				javaCodeFinal+= indentCode(lvlIndenteCode)+"JSONObject "+a.getName()+"= new JSONObject().put(\""+a.getName()+"\", new Double(";
				javaCodeFinal += Operation(sumlist,"-");
				javaCodeFinal += ")); \n";
				javaCodeFinal+= indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+"); \n";
			}
		}
		return javaCodeFinal;

	}

	public String jsonEnumList(JSonEnum a) {
		tmpCode += indentCode(lvlIndenteCode)+"JSONArray "+ a.getName() +" = new JSONArray(); \n";
		EList<JSonEnumField> listArray = a.getContient();
		for (JSonEnumField att : listArray) {
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
		}

		return tmpCode;

	}

	public String jsonArrayRecursive(JsonArray a,JsonArray f ) {
		tmpCode += indentCode(lvlIndenteCode)+"JSONArray "+ a.getName() +" = new JSONArray(); \n";
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
