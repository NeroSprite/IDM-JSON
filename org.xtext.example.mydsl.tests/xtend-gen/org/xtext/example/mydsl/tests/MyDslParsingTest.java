/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.myDsl.MainGrammar;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  private ParseHelper<MainGrammar> parseHelper;
  
  /**
   * @Test
   * def void DEBUGtest() {
   * val result = parseHelper.parse("JSonFile \"File\" {
   * JSonArray \"MyArray\" {
   * Integer \"MyInteger\" 2
   * }
   * 
   * }");
   * Assertions.assertNotNull(result)
   * val errors = result.eResource.errors
   * Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
   * 
   * val BashCompiler2 cmpBash = new BashCompiler2(result)
   * cmpBash.compileAndRun
   * val JavaCompiler cmpJava = new JavaCompiler(result)
   * cmpJava.compileAndRun
   * }
   */
  @Test
  public void Array2Test() {
    try {
      final MainGrammar result = this.parseHelper.parse("JSonFile \"File\" {\n\tJSonArray \"MyArray\" {\n\t\tInteger \"MyInteger\" 2  ,\n\t\tInteger \"MyInteger2\" 5 ,\n\t\tBoolean \"MyBoolean\" false ,\n\t\tNull \"MyNullObject\",\n\t\tJSonArray \"MyArray2\" {\n\t\tInteger \"integ1\" 2 ,\n\t\tJSonArray \"MyArray3\" {\n\t\tInteger \"integ2\" 2 ,\n\t\tSum\"sum\"[\n\t\tInteger \"sum1\" 1,\n\t\tInteger \"sum2\" 5,\n\t\tDiv\"divi\"[\n\t\tInteger \"divi1\" 1,\n\t\tInteger \"divi2\" 5\n\t\t],\n\t\tMult\"multi\"[\n\t\tInteger \"mult1\" 1,\n\t\tInteger \"mult2\" 5,\n\t\tInteger \"mult3\" 2\n\t]\n\t\t]}\n\t\t}\n\t}\n},\nCommandes {\nDisplay {\n\t\tjsonfileName \"File\"\n\t}\n},\nCommandes {\nSubset {\n\t\tarrayName \"MyArray\",\n\t\tkeyName \"integ1\",\"integ2\"\n\t}\n},\nCommandes {\n\tInsert {\n\t\ttargetNode \"MyArray\",\n\t\tnameObject \"integ1\"\n\t}\n},\nCommandes {\n\tModify {\n\t\ttargetNode \"MyArray\",\n\t\tnameObjectRemove \"integ1\",\n\t\tnameObject \"integ2\"\n\t}\n},\nCommandes {\n\tRemove {\n\t\ttargetNode \"MyArray\",\n\t\tnameObjectRemove \"integ2\"\n\t}\n},\nCommandes {\n\tLoad {\n\t\tpath \"/home/thomas/Téléchargements\",\n\t\tname \"test\"\n\t}\n},\nCommandes {\n\tStore {\n\t\tpath \"/home/thomas/Téléchargements\",\n\t\tname \"test\",\n\t\tcontenu \"File\"\n\t}\n}");
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder.append(_join);
      Assertions.assertTrue(_isEmpty, _builder.toString());
      final BashCompiler2 cmpBash = new BashCompiler2(result);
      cmpBash.compileAndRun();
      final JavaCompiler cmpJava = new JavaCompiler(result);
      cmpJava.compileAndRun();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
