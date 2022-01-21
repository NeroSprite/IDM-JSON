package fr.istic.idm.group10.jsondsl.tests;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character.Subset;

import com.google.common.io.Files;

public class BashCompiler {
	private MainGrammar _model;

	BashCompiler(MainGrammar model) {	
		_model = model;	
	}
	
	public void compileAndRun() throws IOException {
	
		// code generation
		
		String bashCodeFinal = "";
		
		// String csvFilename = _model.getData();
		
		if (_model instanceof JSonFile) {
			JSonFile j = (JSonFile) _model;
			j.getContient();
		}
		if(_model instanceof Commandes) {
			if( _model instanceof Load) {
				Load l = (Load) _model;
				bashCodeFinal += "//TODO";
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
		String BASH_OUTPUT = "exampleBash.sh";		
		String BASH_INPUT = "./exampleBash";	
		
		/*
		FileWriter fw = new FileWriter(PYTHON_OUTPUT);
		fw.write(pythonCode);
		fw.flush();
		fw.close();	
		*/
		// or shorter
		Files.write(bashCodeFinal.getBytes(), new File(BASH_OUTPUT));
		
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