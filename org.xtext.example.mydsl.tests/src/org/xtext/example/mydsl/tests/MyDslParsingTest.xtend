/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import org.xtext.example.mydsl.tests.JavaCompiler
import org.xtext.example.mydsl.myDsl.MainGrammar

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<MainGrammar> parseHelper
	/* 
	@Test
	def void loadModel() {
		val result = parseHelper.parse("Commandes { Load { path \"foo.json\" , name \"nameFile\" } }");
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
				
		val JavaCompiler cmpJava = new JavaCompiler(result)
		cmpJava.compileAndRun
	}*/
	/* 
	@Test
	def void DisplayModel() {
		val result = parseHelper.parse("Display { jsonfile JSonFile \"Test\" { String \"Test\" \"HelloWorld\" } }");
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
				
		val JavaCompiler cmpJava = new JavaCompiler(result)
		cmpJava.compileAndRun
	}*/
	
	/*
	@Test
	def void ArrayTest() {
		val result = parseHelper.parse("JSonFile \"File\" {
	JSonArray \"MyArray\" {
		Integer \"MyInteger\" 2  ,
		Integer \"MyInteger\" 5 ,
		Boolean \"MyBoolean\" false ,
		Null \"MyNullObject\",
		JSonArray \"MyArray2\" {
		Integer \"MyInteger2\" 2 ,
		JSonArray \"MyArray3\" {
		Integer \"MyInteger3\" 2 ,
		Sum\"Name\"[
		Integer \"fr\" 1,
		Integer \"Name\" 5,
		Div\"Name2\"[
		Integer \"fr2\" 1,
		Integer \"Name3\" 5
		],
		Mult\"Name2\"[
		Integer \"fr2\" 1,
		Integer \"Name3\" 5,
		Integer \"Name3\" 2
	]
		]}
		}
	}
}");
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
				
		val JavaCompiler cmpJava = new JavaCompiler(result)
		cmpJava.compileAndRun
	}*/
	
	
	/*
	
	@Test
	def void OperationTest() {
		val result = parseHelper.parse("JSonFile \"Name\" {
	Sum\"Name\"[
		Integer \"fr\" 1,
		Integer \"Name\" 5 ,
Div\"Name2\"[
		Integer \"fr2\" 1,
		Integer \"Name3\" 5
	]
	]
}");
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
			
		val JavaCompiler cmpJava = new JavaCompiler(result)
		cmpJava.compileAndRun
	}
	*/
	
	
	
	@Test
	def void DEBUGtest() {
		val result = parseHelper.parse("JSonFile \"File\" {
	JSonArray \"MyArray\" {
		Integer \"MyInteger\" 2  
		}
	
}");
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
				
		val JavaCompiler cmpJava = new JavaCompiler(result)
		cmpJava.compileAndRun
	}
	
}