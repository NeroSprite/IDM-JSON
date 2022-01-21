package org.xtext.example.mydsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character.Subset;

import org.eclipse.emf.common.command.Command;
import org.xtext.example.mydsl.myDsl.Commandes;
import org.xtext.example.mydsl.myDsl.Display;
import org.xtext.example.mydsl.myDsl.Div;
import org.xtext.example.mydsl.myDsl.Insert;
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

	JavaCompiler(MainGrammar model) {	
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
	
		// code generation
		
		String javaCodeFinal = "";
		String jsonReferenceTMP = "";
		
		// String csvFilename = _model.getData();
		
		if (_model instanceof JSonFile) {
			JSonFile f = (JSonFile) _model;
			javaCodeFinal += "JSONObject "+ f.getName() +" = new JSONObject(); \n";
			jsonReferenceTMP = f.getName();
			if( _model instanceof JSonObject) {
				JSonObject o = (JSonObject) _model;
				if( _model instanceof JsonArray) {
					JsonArray a = (JsonArray) _model;
					javaCodeFinal += "JSONArray "+ a.getName() +" = new JSONArray(); \n";
					javaCodeFinal += jsonReferenceTMP+".put("+a.getName()+"); \n";
					jsonReferenceTMP = a.getName();
				}
				if( _model instanceof JsonInteger) {
					JsonInteger a = (JsonInteger) _model;
					javaCodeFinal = jsonReferenceTMP+".put("+a.getName()+", new Double("+a.getValue()+")); \n";
				}
				if( _model instanceof JsonBoolean) {
					JsonBoolean a = (JsonBoolean) _model;
					javaCodeFinal = jsonReferenceTMP+".put("+a.getName()+", new Boolean("+a.getValue()+")); \n";
				}
				if( _model instanceof JSonEnum) {
					JSonEnum a = (JSonEnum) _model;
					javaCodeFinal += "JSONObject "+ a.getName() +" = new JSONObject(); \n";
					jsonReferenceTMP = a.getName();
				}
				if( _model instanceof JSonString) {
					JSonString a = (JSonString) _model;
					javaCodeFinal = jsonReferenceTMP+".put("+a.getName()+", " + a.getValue()+"); \n";
				}
				if( _model instanceof JSonNull) {
					JSonNull a = (JSonNull) _model;
					javaCodeFinal = jsonReferenceTMP+".put("+a.getName()+", null); \n";
				}
				if( _model instanceof Sum) {
					Sum a = (Sum) _model;
					javaCodeFinal += "//TODO";
				}
				if( _model instanceof Div) {
					Div a = (Div) _model;
					javaCodeFinal += "//TODO";
				}
				if( _model instanceof Mult) {
					Mult a = (Mult) _model;
					javaCodeFinal += "//TODO";
				}
				if( _model instanceof Sub) {
					Sub a = (Sub) _model;
					javaCodeFinal += "//TODO";
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
	

}
