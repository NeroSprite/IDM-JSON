/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Display;
import org.xtext.example.mydsl.myDsl.Div;
import org.xtext.example.mydsl.myDsl.EBoolean;
import org.xtext.example.mydsl.myDsl.Insert;
import org.xtext.example.mydsl.myDsl.JSonEnum;
import org.xtext.example.mydsl.myDsl.JSonFile;
import org.xtext.example.mydsl.myDsl.JSonNull;
import org.xtext.example.mydsl.myDsl.JSonString;
import org.xtext.example.mydsl.myDsl.JsonArray;
import org.xtext.example.mydsl.myDsl.JsonBoolean;
import org.xtext.example.mydsl.myDsl.JsonInteger;
import org.xtext.example.mydsl.myDsl.Load;
import org.xtext.example.mydsl.myDsl.MainGrammar;
import org.xtext.example.mydsl.myDsl.Modify;
import org.xtext.example.mydsl.myDsl.Mult;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Projection;
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.myDsl.Sub;
import org.xtext.example.mydsl.myDsl.Subset;
import org.xtext.example.mydsl.myDsl.Sum;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.DISPLAY:
				sequence_Display(context, (Display) semanticObject); 
				return; 
			case MyDslPackage.DIV:
				sequence_Div(context, (Div) semanticObject); 
				return; 
			case MyDslPackage.EBOOLEAN:
				sequence_EBoolean(context, (EBoolean) semanticObject); 
				return; 
			case MyDslPackage.INSERT:
				sequence_Insert(context, (Insert) semanticObject); 
				return; 
			case MyDslPackage.JSON_ENUM:
				sequence_JSonEnum(context, (JSonEnum) semanticObject); 
				return; 
			case MyDslPackage.JSON_FILE:
				sequence_JSonFile(context, (JSonFile) semanticObject); 
				return; 
			case MyDslPackage.JSON_NULL:
				sequence_JSonNull(context, (JSonNull) semanticObject); 
				return; 
			case MyDslPackage.JSON_STRING:
				sequence_JSonString(context, (JSonString) semanticObject); 
				return; 
			case MyDslPackage.JSON_ARRAY:
				sequence_JsonArray(context, (JsonArray) semanticObject); 
				return; 
			case MyDslPackage.JSON_BOOLEAN:
				sequence_JsonBoolean(context, (JsonBoolean) semanticObject); 
				return; 
			case MyDslPackage.JSON_INTEGER:
				sequence_JsonInteger(context, (JsonInteger) semanticObject); 
				return; 
			case MyDslPackage.LOAD:
				sequence_Load(context, (Load) semanticObject); 
				return; 
			case MyDslPackage.MAIN_GRAMMAR:
				sequence_MainGrammar(context, (MainGrammar) semanticObject); 
				return; 
			case MyDslPackage.MODIFY:
				sequence_Modify(context, (Modify) semanticObject); 
				return; 
			case MyDslPackage.MULT:
				sequence_Mult(context, (Mult) semanticObject); 
				return; 
			case MyDslPackage.PROJECTION:
				sequence_Projection(context, (Projection) semanticObject); 
				return; 
			case MyDslPackage.REMOVE:
				sequence_Remove(context, (Remove) semanticObject); 
				return; 
			case MyDslPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case MyDslPackage.SUB:
				sequence_Sub(context, (Sub) semanticObject); 
				return; 
			case MyDslPackage.SUBSET:
				sequence_Subset(context, (Subset) semanticObject); 
				return; 
			case MyDslPackage.SUM:
				sequence_Sum(context, (Sum) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Commandes returns Display
	 *     Display returns Display
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Display(ISerializationContext context, Display semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DISPLAY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DISPLAY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDisplayAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns Div
	 *     JSonAttribut returns Div
	 *     JSonEnumField returns Div
	 *     JSonOperator returns Div
	 *     Div returns Div
	 *
	 * Constraint:
	 *     (name=STRING listInterger+=JSonOperator listInterger+=JSonOperator*)
	 */
	protected void sequence_Div(ISerializationContext context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EBoolean returns EBoolean
	 *
	 * Constraint:
	 *     {EBoolean}
	 */
	protected void sequence_EBoolean(ISerializationContext context, EBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Insert
	 *     Insert returns Insert
	 *
	 * Constraint:
	 *     (jsonfile+=JSonFile jsonfile+=JSonFile node=JSonObject)
	 */
	protected void sequence_Insert(ISerializationContext context, Insert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns JSonEnum
	 *     JSonAttribut returns JSonEnum
	 *     JSonEnum returns JSonEnum
	 *
	 * Constraint:
	 *     (name=STRING Contient+=JSonEnumField Contient+=JSonEnumField*)
	 */
	protected void sequence_JSonEnum(ISerializationContext context, JSonEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonFile returns JSonFile
	 *
	 * Constraint:
	 *     (name=STRING Contient+=JSonObject*)
	 */
	protected void sequence_JSonFile(ISerializationContext context, JSonFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns JSonNull
	 *     JSonAttribut returns JSonNull
	 *     JSonEnumField returns JSonNull
	 *     JSonNull returns JSonNull
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_JSonNull(ISerializationContext context, JSonNull semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_NULL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_NULL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJSonNullAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns JSonString
	 *     JSonAttribut returns JSonString
	 *     JSonEnumField returns JSonString
	 *     JSonString returns JSonString
	 *
	 * Constraint:
	 *     (name=STRING value=STRING)
	 */
	protected void sequence_JSonString(ISerializationContext context, JSonString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_STRING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_STRING__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJSonStringAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getJSonStringAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns JsonArray
	 *     JSonAttribut returns JsonArray
	 *     JsonArray returns JsonArray
	 *
	 * Constraint:
	 *     (name=STRING Contient+=JSonAttribut Contient+=JSonAttribut*)
	 */
	protected void sequence_JsonArray(ISerializationContext context, JsonArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns JsonBoolean
	 *     JSonAttribut returns JsonBoolean
	 *     JSonEnumField returns JsonBoolean
	 *     JsonBoolean returns JsonBoolean
	 *
	 * Constraint:
	 *     (name=STRING (value='true' | value='false'))
	 */
	protected void sequence_JsonBoolean(ISerializationContext context, JsonBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns JsonInteger
	 *     JSonAttribut returns JsonInteger
	 *     JSonEnumField returns JsonInteger
	 *     JsonInteger returns JsonInteger
	 *     JSonOperator returns JsonInteger
	 *
	 * Constraint:
	 *     (name=STRING value=INT)
	 */
	protected void sequence_JsonInteger(ISerializationContext context, JsonInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_INTEGER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_INTEGER__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.JSON_INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.JSON_INTEGER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJsonIntegerAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getJsonIntegerAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Load
	 *     Load returns Load
	 *
	 * Constraint:
	 *     (path=STRING name=STRING)
	 */
	protected void sequence_Load(ISerializationContext context, Load semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOAD__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOAD__PATH));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOAD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOAD__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_3_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getLoadAccess().getNameSTRINGTerminalRuleCall_6_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainGrammar returns MainGrammar
	 *
	 * Constraint:
	 *     ((Main+=JSonFile | Main+=Commandes) Main+=JSonFile? (Main+=Commandes? Main+=JSonFile?)*)
	 */
	protected void sequence_MainGrammar(ISerializationContext context, MainGrammar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Modify
	 *     Modify returns Modify
	 *
	 * Constraint:
	 *     (jsonfile+=JSonFile jsonfile+=JSonFile node=JSonObject)
	 */
	protected void sequence_Modify(ISerializationContext context, Modify semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns Mult
	 *     JSonAttribut returns Mult
	 *     JSonEnumField returns Mult
	 *     JSonOperator returns Mult
	 *     Mult returns Mult
	 *
	 * Constraint:
	 *     (name=STRING listInterger+=JSonOperator listInterger+=JSonOperator*)
	 */
	protected void sequence_Mult(ISerializationContext context, Mult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Projection
	 *     Projection returns Projection
	 *
	 * Constraint:
	 *     (name=STRING node=JSonObject)
	 */
	protected void sequence_Projection(ISerializationContext context, Projection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROJECTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROJECTION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROJECTION__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROJECTION__NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectionAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProjectionAccess().getNodeJSonObjectParserRuleCall_6_0(), semanticObject.getNode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Remove
	 *     Remove returns Remove
	 *
	 * Constraint:
	 *     (jsonfile+=JSonFile node=JSonObject)
	 */
	protected void sequence_Remove(ISerializationContext context, Remove semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (path=STRING name=STRING)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STORE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STORE__PATH));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STORE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STORE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStoreAccess().getPathSTRINGTerminalRuleCall_3_0(), semanticObject.getPath());
		feeder.accept(grammarAccess.getStoreAccess().getNameSTRINGTerminalRuleCall_6_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns Sub
	 *     JSonAttribut returns Sub
	 *     JSonEnumField returns Sub
	 *     JSonOperator returns Sub
	 *     Sub returns Sub
	 *
	 * Constraint:
	 *     (name=STRING listInterger+=JSonOperator listInterger+=JSonOperator*)
	 */
	protected void sequence_Sub(ISerializationContext context, Sub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Commandes returns Subset
	 *     Subset returns Subset
	 *
	 * Constraint:
	 *     (jsonfile+=JSonFile listNodes+=JSonObject listNodes+=JSonObject*)
	 */
	protected void sequence_Subset(ISerializationContext context, Subset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JSonObject returns Sum
	 *     JSonAttribut returns Sum
	 *     JSonEnumField returns Sum
	 *     JSonOperator returns Sum
	 *     Sum returns Sum
	 *
	 * Constraint:
	 *     (name=STRING listInterger+=JSonOperator listInterger+=JSonOperator*)
	 */
	protected void sequence_Sum(ISerializationContext context, Sum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
