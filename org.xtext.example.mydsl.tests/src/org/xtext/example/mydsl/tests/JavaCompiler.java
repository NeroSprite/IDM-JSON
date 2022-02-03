package org.xtext.example.mydsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character.Subset;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Display;
import org.xtext.example.mydsl.myDsl.Div;
import org.xtext.example.mydsl.myDsl.Insert;
import org.xtext.example.mydsl.myDsl.JSonAttribut;
import org.xtext.example.mydsl.myDsl.JSonEnum;
import org.xtext.example.mydsl.myDsl.JSonFile;
import org.xtext.example.mydsl.myDsl.JSonNull;
import org.xtext.example.mydsl.myDsl.JSonObject;
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
		javaCodeFinal+="public class Java {\n";
		lvlIndenteCode++;
		javaCodeFinal+=indentCode(lvlIndenteCode)+"public static void main(String args[]) {\n";
		lvlIndenteCode++;
		if (_model instanceof JSonFile) {
			JSonFile f = (JSonFile) _model;
			javaCodeFinal += indentCode(lvlIndenteCode)+"JSONObject "+ f.getName() +" = new JSONObject(); \n";
			jsonReferenceTMP = f.getName();
			EList<JSonObject> list = f.getContient();
			/*int p = 0;
			while(list.size() == p) {
				javaCodeFinal+=list.get(p)+"\n";
				p++;
			}*/
			for (JSonObject jo : list) { 
				if( jo instanceof JsonArray) {
					JsonArray a = (JsonArray) jo;
					
					javaCodeFinal+=jsonArrayRecursive(a,a);
					javaCodeFinal+=indentCode(lvlIndenteCode)+f.getName()+".put("+a.getName()+"); \n";
					tmpCode ="";
				}
				if( jo instanceof JsonInteger) {
					JsonInteger a = (JsonInteger) jo;
					javaCodeFinal = indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+", new Double("+a.getValue()+")); \n";
				}
				if( jo instanceof JsonBoolean) {
					JsonBoolean a = (JsonBoolean) jo;
					javaCodeFinal = indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+", new Boolean("+a.getValue()+")); \n";
				}
				if( jo instanceof JSonEnum) {
					JSonEnum a = (JSonEnum) jo;
					javaCodeFinal += indentCode(lvlIndenteCode)+"JSONObject "+ a.getName() +" = new JSONObject(); \n";
					jsonReferenceTMP = a.getName();
				}
				if( jo instanceof JSonString) {
					JSonString a = (JSonString) jo;
					javaCodeFinal = indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+", " + a.getValue()+"); \n";
				}
				if( jo instanceof JSonNull) {
					JSonNull a = (JSonNull) jo;
					javaCodeFinal = indentCode(lvlIndenteCode)+jsonReferenceTMP+".put("+a.getName()+", null); \n";
				}
				if( jo instanceof Sum) {
					Sum a = (Sum) jo;
					javaCodeFinal += indentCode(lvlIndenteCode)+"//TODO";
				}
				if( jo instanceof Div) {
					Div a = (Div) jo;
					javaCodeFinal += indentCode(lvlIndenteCode)+"//TODO";
				}
				if( jo instanceof Mult) {
					Mult a = (Mult) jo;
					javaCodeFinal += indentCode(lvlIndenteCode)+"//TODO";
				}
				if( jo instanceof Sub) {
					Sub a = (Sub) jo;
					javaCodeFinal += indentCode(lvlIndenteCode)+"//TODO";
				}
			}

		}

		if(_model instanceof Commandes) {
			if( _model instanceof Load) {
				Load l = (Load) _model;
				javaCodeFinal += "JSONParser parser = new JSONParser();" +  "\n";
				javaCodeFinal += "Object "+l.getName()+" = parser.parse(new FileReader( " + l.getPath()+"/"+l.getName() + ".json)\n";
				javaCodeFinal += "JSONObject jsonObject =  (JSONObject) " +l.getName()+";" + "\n";
			}
			if( _model instanceof Store) {
				Store l = (Store) _model;
				javaCodeFinal += "private static FileWriter file; " + "\n";
				javaCodeFinal += "file = new FileWriter(" + l.getPath()+"/"+l.getName() + ".json); \n";
				javaCodeFinal += "fils.white(jsonfile.toJSONString());" + "\n";
			}
			if( _model instanceof Display) {
				Display l = (Display) _model;
				javaCodeFinal += "System.out.println("+ jsonReferenceTMP+"); \n";
			}
			if( _model instanceof Subset) {
				Subset l = (Subset) _model;
				javaCodeFinal += "//TODO";
			}
			if( _model instanceof Projection) {
				Projection l = (Projection) _model;
				javaCodeFinal += "//TODO";
			}
			if( _model instanceof Insert) {
				Insert l = (Insert) _model;
				javaCodeFinal += "//TODO";
			}
			if( _model instanceof Remove) {
				Remove l = (Remove) _model;
				javaCodeFinal += "//TODO";
			}
			if( _model instanceof Modify) {
				Modify l = (Modify) _model;
				javaCodeFinal += "//TODO";
			}
		}
		javaCodeFinal+=indentCode(lvlIndenteCode)+"}\n";
		lvlIndenteCode--;
		javaCodeFinal+=indentCode(lvlIndenteCode)+"}";

		//String javaCode = "import pd.read_csv(\"" + csvFilename + "\")\n" +
		//		"print(df)";	

		// serialize code into Python filename
		String JAVA_OUTPUT = "Java.java";			
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

		Process p = Runtime.getRuntime().exec("java " + JAVA_OUTPUT);

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
	
	public String jsonArrayRecursive(JsonArray a,JsonArray f ) {
		tmpCode += indentCode(lvlIndenteCode)+"JSONArray "+ a.getName() +" = new JSONArray(); \n";
		EList<JSonAttribut> listArray = a.getContient();
		for (JSonAttribut att : listArray) {
			if( att instanceof JsonBoolean) {
				JsonBoolean b = (JsonBoolean) att;
				tmpCode += indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+", new Boolean("+b.getValue()+")); \n";
			}
			else if( att instanceof JsonInteger) {
				JsonInteger b = (JsonInteger) att;
				tmpCode+= indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+", new Double("+b.getValue()+")); \n";
			}

			else if( att instanceof JSonString) {
				JSonString b = (JSonString) att;
				tmpCode += indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+", " + b.getValue()+"); \n";
			}
			else if( att instanceof JSonNull) {
				JSonNull b = (JSonNull) att;
				tmpCode += indentCode(lvlIndenteCode)+a.getName()+".put("+b.getName()+", null); \n";
			}
			else if( att instanceof JsonArray) {
				JsonArray b = (JsonArray) att;
				tmpCode= jsonArrayRecursive(b,a);
				//tmpCode ="";
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
