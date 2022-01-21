package org.xtext.example.mydsl.tests;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.myDsl.MainGrammar;

import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
public class ParsingExampleTest {
	
	
	@Inject
	ParseHelper<MainGrammar> parseHelper;
	
	@Test
	public void loadModel() throws Exception {
		MainGrammar result = parseHelper.parse("Load { path \"foo1.json\" , name \"nameFile\" }");
		 
		Assertions.assertNotNull(result);
		EList<Resource.Diagnostic> errors = result.eResource().getErrors();
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors");			
		Assertions.assertEquals("Load \"foo1.json\" , \"nameFile\"", result);	
	}
	
	


}
