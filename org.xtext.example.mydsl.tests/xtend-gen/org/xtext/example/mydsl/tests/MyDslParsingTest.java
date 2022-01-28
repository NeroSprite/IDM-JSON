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
  
  @Test
  public void loadModel() {
    try {
      final MainGrammar result = this.parseHelper.parse("Load { path \"example.json\" , name \"nameFile\" }");
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder.append(_join);
      Assertions.assertTrue(_isEmpty, _builder.toString());
      final BashCompiler cmpBash = new BashCompiler(result);
      cmpBash.compileAndRun();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
