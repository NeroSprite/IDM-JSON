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

import org.eclipse.emf.common.util.EList;
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
import org.xtext.example.mydsl.myDsl.Subset;
import org.xtext.example.mydsl.myDsl.Sum;

//import com.google.common.io.Files;

public class BashCompiler {
	
	private MainGrammar _model;

	BashCompiler(MainGrammar model) {	
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
	
		// code generation
		
		String bashCodeFinal = "";
		String jsonReferenceTMP = "";
		// String csvFilename = _model.getData();
		
		if (_model instanceof JSonFile) {
			JSonFile f = (JSonFile) _model;
			bashCodeFinal += "echo '{";
			//jsonReferenceTMP = f.getName();
			EList<JSonObject> list = f.getContient();
			for (JSonObject jo : list) { 
				if( jo instanceof JsonArray) {
					/*JsonArray a = (JsonArray) jo;
					
					bashCodeFinal+=jsonArrayRecursive(a,a);
					bashCodeFinal+=indentCode(lvlIndenteCode)+f.getName()+".put("+a.getName()+"); \n";
					tmpCode ="";*/
				}
				if( jo instanceof JsonInteger) {
					JsonInteger a = (JsonInteger) jo;
					bashCodeFinal += jsonReferenceTMP + "\"" + a.getName() + "\" : \"" + a.getValue() + "\"" ;
				}
				if( jo instanceof JsonBoolean) {
					JsonBoolean a = (JsonBoolean) jo;
					bashCodeFinal += jsonReferenceTMP + "\"" + a.getName() + "\" : \"" + a.getValue() + "\"" ;
				}
				if( jo instanceof JSonEnum) {
					JSonEnum a = (JSonEnum) jo;
					bashCodeFinal += "JSONObject "+ a.getName() +" = new JSONObject(); \n";
					jsonReferenceTMP = a.getName();
				}
				if( jo instanceof JSonString) {
					JSonString a = (JSonString) jo;
					bashCodeFinal += jsonReferenceTMP + "\"" + a.getName() + "\" : \"" + a.getValue() + "\"" ;
				}
				if( jo instanceof JSonNull) {
					JSonNull a = (JSonNull) jo;
					bashCodeFinal += jsonReferenceTMP + "\"" + a.getName() + "\" : null" ;
				}
				if( jo instanceof Sum) {
					Sum a = (Sum) jo;
					bashCodeFinal += "TODO";
				}
				if( jo instanceof Div) {
					Div a = (Div) jo;
					bashCodeFinal += "//TODO";
				}
				if( jo instanceof Mult) {
					Mult a = (Mult) jo;
					bashCodeFinal += "//TODO";
				}
				if( jo instanceof Sub) {
					Sub a = (Sub) jo;
					bashCodeFinal += "//TODO";
				}
			}
			
			bashCodeFinal += "}'";

		}
		
		if(_model instanceof Commandes) {
			if( _model instanceof Load) {
				Load l = (Load) _model;
				bashCodeFinal += "cat " + l.getPath() + " | jq '.' \n";
			}
			if( _model instanceof Store) {
				Store l = (Store) _model;
				bashCodeFinal += "//TODO";
			}
			if( _model instanceof Display) {
				Display l = (Display) _model;
				bashCodeFinal += "//TODO";
			}
			if( _model instanceof Subset) {
				Subset l = (Subset) _model;
				bashCodeFinal += "//TODO";
			}
			if( _model instanceof Projection) {
				Projection l = (Projection) _model;
				bashCodeFinal += "//TODO";
			}
			if( _model instanceof Insert) {
				Insert l = (Insert) _model;
				bashCodeFinal += "//TODO";
			}
			if( _model instanceof Remove) {
				Remove l = (Remove) _model;
				bashCodeFinal += "//TODO";
			}
			if( _model instanceof Modify) {
				Modify l = (Modify) _model;
				bashCodeFinal += "//TODO";
			}
		}
		//String javaCode = "import pd.read_csv(\"" + csvFilename + "\")\n" +
		//		"print(df)";	
		
		// serialize code into Bash filename
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
	

}
