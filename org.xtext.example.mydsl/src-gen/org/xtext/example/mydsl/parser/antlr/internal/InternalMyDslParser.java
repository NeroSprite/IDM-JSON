package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JSonFile'", "'{'", "'}'", "'Commandes'", "'Object'", "'Store'", "'path'", "','", "'name'", "'Load'", "'Display'", "'jsonfile'", "'Subset'", "'listNodes'", "'('", "')'", "'Projection'", "'node'", "'Insert'", "'JsonFileTarget'", "'JsonFileSource'", "'Object:'", "'Remove'", "'Modify'", "'JSonArray'", "'JSonEnum'", "'['", "']'", "'Integer'", "'Boolean'", "'true'", "'false'", "'String'", "'Null'", "'Sum'", "'Div'", "'Mult'", "'Sub'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MainGrammar";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMainGrammar"
    // InternalMyDsl.g:64:1: entryRuleMainGrammar returns [EObject current=null] : iv_ruleMainGrammar= ruleMainGrammar EOF ;
    public final EObject entryRuleMainGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainGrammar = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleMainGrammar= ruleMainGrammar EOF )
            // InternalMyDsl.g:65:2: iv_ruleMainGrammar= ruleMainGrammar EOF
            {
             newCompositeNode(grammarAccess.getMainGrammarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainGrammar=ruleMainGrammar();

            state._fsp--;

             current =iv_ruleMainGrammar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainGrammar"


    // $ANTLR start "ruleMainGrammar"
    // InternalMyDsl.g:71:1: ruleMainGrammar returns [EObject current=null] : (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes ) ;
    public final EObject ruleMainGrammar() throws RecognitionException {
        EObject current = null;

        EObject this_JSonFile_0 = null;

        EObject this_Commandes_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes ) )
            // InternalMyDsl.g:78:2: (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes )
            {
            // InternalMyDsl.g:78:2: (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14||(LA1_0>=20 && LA1_0<=21)||LA1_0==23||LA1_0==27||LA1_0==29||(LA1_0>=33 && LA1_0<=34)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:79:3: this_JSonFile_0= ruleJSonFile
                    {

                    			newCompositeNode(grammarAccess.getMainGrammarAccess().getJSonFileParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonFile_0=ruleJSonFile();

                    state._fsp--;


                    			current = this_JSonFile_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:88:3: this_Commandes_1= ruleCommandes
                    {

                    			newCompositeNode(grammarAccess.getMainGrammarAccess().getCommandesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Commandes_1=ruleCommandes();

                    state._fsp--;


                    			current = this_Commandes_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainGrammar"


    // $ANTLR start "entryRuleJSonFile"
    // InternalMyDsl.g:100:1: entryRuleJSonFile returns [EObject current=null] : iv_ruleJSonFile= ruleJSonFile EOF ;
    public final EObject entryRuleJSonFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonFile = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleJSonFile= ruleJSonFile EOF )
            // InternalMyDsl.g:101:2: iv_ruleJSonFile= ruleJSonFile EOF
            {
             newCompositeNode(grammarAccess.getJSonFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonFile=ruleJSonFile();

            state._fsp--;

             current =iv_ruleJSonFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSonFile"


    // $ANTLR start "ruleJSonFile"
    // InternalMyDsl.g:107:1: ruleJSonFile returns [EObject current=null] : (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' ) ;
    public final EObject ruleJSonFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Contient_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonFileAccess().getJSonFileKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJSonFileAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSonFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJSonFileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_Contient_3_0= ruleJSonObject ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==36||(LA2_0>=39 && LA2_0<=40)||(LA2_0>=43 && LA2_0<=48)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:142:4: (lv_Contient_3_0= ruleJSonObject )
            	    {
            	    // InternalMyDsl.g:142:4: (lv_Contient_3_0= ruleJSonObject )
            	    // InternalMyDsl.g:143:5: lv_Contient_3_0= ruleJSonObject
            	    {

            	    					newCompositeNode(grammarAccess.getJSonFileAccess().getContientJSonObjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_Contient_3_0=ruleJSonObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJSonFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Contient",
            	    						lv_Contient_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.JSonObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJSonFileAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSonFile"


    // $ANTLR start "entryRuleCommandes"
    // InternalMyDsl.g:168:1: entryRuleCommandes returns [EObject current=null] : iv_ruleCommandes= ruleCommandes EOF ;
    public final EObject entryRuleCommandes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandes = null;


        try {
            // InternalMyDsl.g:168:50: (iv_ruleCommandes= ruleCommandes EOF )
            // InternalMyDsl.g:169:2: iv_ruleCommandes= ruleCommandes EOF
            {
             newCompositeNode(grammarAccess.getCommandesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandes=ruleCommandes();

            state._fsp--;

             current =iv_ruleCommandes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandes"


    // $ANTLR start "ruleCommandes"
    // InternalMyDsl.g:175:1: ruleCommandes returns [EObject current=null] : ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) ) ;
    public final EObject ruleCommandes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_10=null;
        EObject this_Store_2 = null;

        EObject this_Load_3 = null;

        EObject this_Display_4 = null;

        EObject this_Subset_5 = null;

        EObject this_Projection_6 = null;

        EObject this_Insert_7 = null;

        EObject this_Remove_8 = null;

        EObject this_Modify_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:181:2: ( ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) ) )
            // InternalMyDsl.g:182:2: ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) )
            {
            // InternalMyDsl.g:182:2: ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 27:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 33:
                {
                alt3=7;
                }
                break;
            case 34:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:183:3: (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore )
                    {
                    // InternalMyDsl.g:183:3: (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore )
                    // InternalMyDsl.g:184:4: otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommandesAccess().getCommandesKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommandesAccess().getLeftCurlyBracketKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getCommandesAccess().getStoreParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Store_2=ruleStore();

                    state._fsp--;


                    				current = this_Store_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:202:3: this_Load_3= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getCommandesAccess().getLoadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_3=ruleLoad();

                    state._fsp--;


                    			current = this_Load_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:211:3: this_Display_4= ruleDisplay
                    {

                    			newCompositeNode(grammarAccess.getCommandesAccess().getDisplayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Display_4=ruleDisplay();

                    state._fsp--;


                    			current = this_Display_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:220:3: this_Subset_5= ruleSubset
                    {

                    			newCompositeNode(grammarAccess.getCommandesAccess().getSubsetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subset_5=ruleSubset();

                    state._fsp--;


                    			current = this_Subset_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:229:3: this_Projection_6= ruleProjection
                    {

                    			newCompositeNode(grammarAccess.getCommandesAccess().getProjectionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projection_6=ruleProjection();

                    state._fsp--;


                    			current = this_Projection_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:238:3: this_Insert_7= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getCommandesAccess().getInsertParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_7=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:247:3: this_Remove_8= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getCommandesAccess().getRemoveParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_8=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:256:3: (this_Modify_9= ruleModify otherlv_10= '}' )
                    {
                    // InternalMyDsl.g:256:3: (this_Modify_9= ruleModify otherlv_10= '}' )
                    // InternalMyDsl.g:257:4: this_Modify_9= ruleModify otherlv_10= '}'
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getModifyParserRuleCall_7_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Modify_9=ruleModify();

                    state._fsp--;


                    				current = this_Modify_9;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getCommandesAccess().getRightCurlyBracketKeyword_7_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandes"


    // $ANTLR start "entryRuleJSonObject"
    // InternalMyDsl.g:274:1: entryRuleJSonObject returns [EObject current=null] : iv_ruleJSonObject= ruleJSonObject EOF ;
    public final EObject entryRuleJSonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonObject = null;


        try {
            // InternalMyDsl.g:274:51: (iv_ruleJSonObject= ruleJSonObject EOF )
            // InternalMyDsl.g:275:2: iv_ruleJSonObject= ruleJSonObject EOF
            {
             newCompositeNode(grammarAccess.getJSonObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonObject=ruleJSonObject();

            state._fsp--;

             current =iv_ruleJSonObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSonObject"


    // $ANTLR start "ruleJSonObject"
    // InternalMyDsl.g:281:1: ruleJSonObject returns [EObject current=null] : ( (otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray ) | this_JsonInteger_3= ruleJsonInteger | this_JsonBoolean_4= ruleJsonBoolean | this_JSonEnum_5= ruleJSonEnum | this_JSonString_6= ruleJSonString | this_JSonNull_7= ruleJSonNull | this_Sum_8= ruleSum | this_Div_9= ruleDiv | this_Mult_10= ruleMult | (this_Sub_11= ruleSub otherlv_12= '}' ) ) ;
    public final EObject ruleJSonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_12=null;
        EObject this_JsonArray_2 = null;

        EObject this_JsonInteger_3 = null;

        EObject this_JsonBoolean_4 = null;

        EObject this_JSonEnum_5 = null;

        EObject this_JSonString_6 = null;

        EObject this_JSonNull_7 = null;

        EObject this_Sum_8 = null;

        EObject this_Div_9 = null;

        EObject this_Mult_10 = null;

        EObject this_Sub_11 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:287:2: ( ( (otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray ) | this_JsonInteger_3= ruleJsonInteger | this_JsonBoolean_4= ruleJsonBoolean | this_JSonEnum_5= ruleJSonEnum | this_JSonString_6= ruleJSonString | this_JSonNull_7= ruleJSonNull | this_Sum_8= ruleSum | this_Div_9= ruleDiv | this_Mult_10= ruleMult | (this_Sub_11= ruleSub otherlv_12= '}' ) ) )
            // InternalMyDsl.g:288:2: ( (otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray ) | this_JsonInteger_3= ruleJsonInteger | this_JsonBoolean_4= ruleJsonBoolean | this_JSonEnum_5= ruleJSonEnum | this_JSonString_6= ruleJSonString | this_JSonNull_7= ruleJSonNull | this_Sum_8= ruleSum | this_Div_9= ruleDiv | this_Mult_10= ruleMult | (this_Sub_11= ruleSub otherlv_12= '}' ) )
            {
            // InternalMyDsl.g:288:2: ( (otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray ) | this_JsonInteger_3= ruleJsonInteger | this_JsonBoolean_4= ruleJsonBoolean | this_JSonEnum_5= ruleJSonEnum | this_JSonString_6= ruleJSonString | this_JSonNull_7= ruleJSonNull | this_Sum_8= ruleSum | this_Div_9= ruleDiv | this_Mult_10= ruleMult | (this_Sub_11= ruleSub otherlv_12= '}' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 36:
                {
                alt4=4;
                }
                break;
            case 43:
                {
                alt4=5;
                }
                break;
            case 44:
                {
                alt4=6;
                }
                break;
            case 45:
                {
                alt4=7;
                }
                break;
            case 46:
                {
                alt4=8;
                }
                break;
            case 47:
                {
                alt4=9;
                }
                break;
            case 48:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:289:3: (otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray )
                    {
                    // InternalMyDsl.g:289:3: (otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray )
                    // InternalMyDsl.g:290:4: otherlv_0= 'Object' otherlv_1= '{' this_JsonArray_2= ruleJsonArray
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getJSonObjectAccess().getObjectKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getJSonObjectAccess().getLeftCurlyBracketKeyword_0_1());
                    			

                    				newCompositeNode(grammarAccess.getJSonObjectAccess().getJsonArrayParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_JsonArray_2=ruleJsonArray();

                    state._fsp--;


                    				current = this_JsonArray_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:308:3: this_JsonInteger_3= ruleJsonInteger
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJsonIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonInteger_3=ruleJsonInteger();

                    state._fsp--;


                    			current = this_JsonInteger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:317:3: this_JsonBoolean_4= ruleJsonBoolean
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJsonBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_4=ruleJsonBoolean();

                    state._fsp--;


                    			current = this_JsonBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:326:3: this_JSonEnum_5= ruleJSonEnum
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJSonEnumParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonEnum_5=ruleJSonEnum();

                    state._fsp--;


                    			current = this_JSonEnum_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:335:3: this_JSonString_6= ruleJSonString
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJSonStringParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonString_6=ruleJSonString();

                    state._fsp--;


                    			current = this_JSonString_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:344:3: this_JSonNull_7= ruleJSonNull
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJSonNullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonNull_7=ruleJSonNull();

                    state._fsp--;


                    			current = this_JSonNull_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:353:3: this_Sum_8= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getSumParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_8=ruleSum();

                    state._fsp--;


                    			current = this_Sum_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:362:3: this_Div_9= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getDivParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_9=ruleDiv();

                    state._fsp--;


                    			current = this_Div_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:371:3: this_Mult_10= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getMultParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_10=ruleMult();

                    state._fsp--;


                    			current = this_Mult_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:380:3: (this_Sub_11= ruleSub otherlv_12= '}' )
                    {
                    // InternalMyDsl.g:380:3: (this_Sub_11= ruleSub otherlv_12= '}' )
                    // InternalMyDsl.g:381:4: this_Sub_11= ruleSub otherlv_12= '}'
                    {

                    				newCompositeNode(grammarAccess.getJSonObjectAccess().getSubParserRuleCall_9_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Sub_11=ruleSub();

                    state._fsp--;


                    				current = this_Sub_11;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getJSonObjectAccess().getRightCurlyBracketKeyword_9_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSonObject"


    // $ANTLR start "entryRuleJSonAttribut"
    // InternalMyDsl.g:398:1: entryRuleJSonAttribut returns [EObject current=null] : iv_ruleJSonAttribut= ruleJSonAttribut EOF ;
    public final EObject entryRuleJSonAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonAttribut = null;


        try {
            // InternalMyDsl.g:398:53: (iv_ruleJSonAttribut= ruleJSonAttribut EOF )
            // InternalMyDsl.g:399:2: iv_ruleJSonAttribut= ruleJSonAttribut EOF
            {
             newCompositeNode(grammarAccess.getJSonAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonAttribut=ruleJSonAttribut();

            state._fsp--;

             current =iv_ruleJSonAttribut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSonAttribut"


    // $ANTLR start "ruleJSonAttribut"
    // InternalMyDsl.g:405:1: ruleJSonAttribut returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
    public final EObject ruleJSonAttribut() throws RecognitionException {
        EObject current = null;

        EObject this_JsonArray_0 = null;

        EObject this_JsonInteger_1 = null;

        EObject this_JsonBoolean_2 = null;

        EObject this_JSonEnum_3 = null;

        EObject this_JSonString_4 = null;

        EObject this_JSonNull_5 = null;

        EObject this_Sum_6 = null;

        EObject this_Div_7 = null;

        EObject this_Mult_8 = null;

        EObject this_Sub_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalMyDsl.g:412:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalMyDsl.g:412:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            case 36:
                {
                alt5=4;
                }
                break;
            case 43:
                {
                alt5=5;
                }
                break;
            case 44:
                {
                alt5=6;
                }
                break;
            case 45:
                {
                alt5=7;
                }
                break;
            case 46:
                {
                alt5=8;
                }
                break;
            case 47:
                {
                alt5=9;
                }
                break;
            case 48:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:413:3: this_JsonArray_0= ruleJsonArray
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getJsonArrayParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonArray_0=ruleJsonArray();

                    state._fsp--;


                    			current = this_JsonArray_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:422:3: this_JsonInteger_1= ruleJsonInteger
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getJsonIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonInteger_1=ruleJsonInteger();

                    state._fsp--;


                    			current = this_JsonInteger_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:431:3: this_JsonBoolean_2= ruleJsonBoolean
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getJsonBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_2=ruleJsonBoolean();

                    state._fsp--;


                    			current = this_JsonBoolean_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:440:3: this_JSonEnum_3= ruleJSonEnum
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getJSonEnumParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonEnum_3=ruleJSonEnum();

                    state._fsp--;


                    			current = this_JSonEnum_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:449:3: this_JSonString_4= ruleJSonString
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getJSonStringParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonString_4=ruleJSonString();

                    state._fsp--;


                    			current = this_JSonString_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:458:3: this_JSonNull_5= ruleJSonNull
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getJSonNullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonNull_5=ruleJSonNull();

                    state._fsp--;


                    			current = this_JSonNull_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:467:3: this_Sum_6= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getSumParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_6=ruleSum();

                    state._fsp--;


                    			current = this_Sum_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:476:3: this_Div_7= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getDivParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_7=ruleDiv();

                    state._fsp--;


                    			current = this_Div_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:485:3: this_Mult_8= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getMultParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_8=ruleMult();

                    state._fsp--;


                    			current = this_Mult_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:494:3: this_Sub_9= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getJSonAttributAccess().getSubParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_9=ruleSub();

                    state._fsp--;


                    			current = this_Sub_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSonAttribut"


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:506:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:506:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:507:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyDsl.g:513:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:519:2: ( (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:520:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:520:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:521:3: otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getPathKeyword_2());
            		
            // InternalMyDsl.g:533:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:534:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:534:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:535:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_path_3_0, grammarAccess.getStoreAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:559:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:560:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:560:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:561:5: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_6_0, grammarAccess.getStoreAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleLoad"
    // InternalMyDsl.g:585:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:585:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:586:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMyDsl.g:592:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:598:2: ( (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:599:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:599:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:600:3: otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getPathKeyword_2());
            		
            // InternalMyDsl.g:612:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:613:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:613:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:614:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_path_3_0, grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:638:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:639:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:639:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:640:5: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_6_0, grammarAccess.getLoadAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleDisplay"
    // InternalMyDsl.g:664:1: entryRuleDisplay returns [EObject current=null] : iv_ruleDisplay= ruleDisplay EOF ;
    public final EObject entryRuleDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay = null;


        try {
            // InternalMyDsl.g:664:48: (iv_ruleDisplay= ruleDisplay EOF )
            // InternalMyDsl.g:665:2: iv_ruleDisplay= ruleDisplay EOF
            {
             newCompositeNode(grammarAccess.getDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplay=ruleDisplay();

            state._fsp--;

             current =iv_ruleDisplay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisplay"


    // $ANTLR start "ruleDisplay"
    // InternalMyDsl.g:671:1: ruleDisplay returns [EObject current=null] : (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' ) ;
    public final EObject ruleDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_jsonfile_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:677:2: ( (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:678:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:678:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' )
            // InternalMyDsl.g:679:3: otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisplayAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDisplayAccess().getJsonfileKeyword_2());
            		
            // InternalMyDsl.g:691:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:692:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:692:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:693:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getDisplayAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_jsonfile_3_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisplayRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisplay"


    // $ANTLR start "entryRuleSubset"
    // InternalMyDsl.g:718:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalMyDsl.g:718:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalMyDsl.g:719:2: iv_ruleSubset= ruleSubset EOF
            {
             newCompositeNode(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubset=ruleSubset();

            state._fsp--;

             current =iv_ruleSubset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalMyDsl.g:725:1: ruleSubset returns [EObject current=null] : (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_jsonfile_3_0 = null;

        EObject lv_listNodes_7_0 = null;

        EObject lv_listNodes_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:731:2: ( (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' ) )
            // InternalMyDsl.g:732:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalMyDsl.g:732:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' )
            // InternalMyDsl.g:733:3: otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetAccess().getSubsetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSubsetAccess().getJsonfileKeyword_2());
            		
            // InternalMyDsl.g:745:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:746:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:746:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:747:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getSubsetAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_jsonfile_3_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsetRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSubsetAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSubsetAccess().getListNodesKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getSubsetAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMyDsl.g:776:3: ( (lv_listNodes_7_0= ruleJSonObject ) )
            // InternalMyDsl.g:777:4: (lv_listNodes_7_0= ruleJSonObject )
            {
            // InternalMyDsl.g:777:4: (lv_listNodes_7_0= ruleJSonObject )
            // InternalMyDsl.g:778:5: lv_listNodes_7_0= ruleJSonObject
            {

            					newCompositeNode(grammarAccess.getSubsetAccess().getListNodesJSonObjectParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_listNodes_7_0=ruleJSonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsetRule());
            					}
            					add(
            						current,
            						"listNodes",
            						lv_listNodes_7_0,
            						"org.xtext.example.mydsl.MyDsl.JSonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:795:3: (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:796:4: otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_16); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubsetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:800:4: ( (lv_listNodes_9_0= ruleJSonObject ) )
            	    // InternalMyDsl.g:801:5: (lv_listNodes_9_0= ruleJSonObject )
            	    {
            	    // InternalMyDsl.g:801:5: (lv_listNodes_9_0= ruleJSonObject )
            	    // InternalMyDsl.g:802:6: lv_listNodes_9_0= ruleJSonObject
            	    {

            	    						newCompositeNode(grammarAccess.getSubsetAccess().getListNodesJSonObjectParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_listNodes_9_0=ruleJSonObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubsetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listNodes",
            	    							lv_listNodes_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonObject");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getSubsetAccess().getRightParenthesisKeyword_9());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubsetAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubset"


    // $ANTLR start "entryRuleProjection"
    // InternalMyDsl.g:832:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalMyDsl.g:832:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalMyDsl.g:833:2: iv_ruleProjection= ruleProjection EOF
            {
             newCompositeNode(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjection=ruleProjection();

            state._fsp--;

             current =iv_ruleProjection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // InternalMyDsl.g:839:1: ruleProjection returns [EObject current=null] : (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_jsonfile_3_0 = null;

        EObject lv_node_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:845:2: ( (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:846:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:846:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            // InternalMyDsl.g:847:3: otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectionAccess().getProjectionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectionAccess().getJsonfileKeyword_2());
            		
            // InternalMyDsl.g:859:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:860:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:860:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:861:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getProjectionAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_jsonfile_3_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectionRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getNodeKeyword_5());
            		
            // InternalMyDsl.g:886:3: ( (lv_node_6_0= ruleJSonObject ) )
            // InternalMyDsl.g:887:4: (lv_node_6_0= ruleJSonObject )
            {
            // InternalMyDsl.g:887:4: (lv_node_6_0= ruleJSonObject )
            // InternalMyDsl.g:888:5: lv_node_6_0= ruleJSonObject
            {

            					newCompositeNode(grammarAccess.getProjectionAccess().getNodeJSonObjectParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_node_6_0=ruleJSonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectionRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_6_0,
            						"org.xtext.example.mydsl.MyDsl.JSonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleInsert"
    // InternalMyDsl.g:913:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalMyDsl.g:913:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalMyDsl.g:914:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalMyDsl.g:920:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_jsonfile_4_0 = null;

        EObject lv_jsonfile_7_0 = null;

        EObject lv_node_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:926:2: ( (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:927:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:927:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            // InternalMyDsl.g:928:3: otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getJsonFileTargetKeyword_3());
            		
            // InternalMyDsl.g:944:3: ( (lv_jsonfile_4_0= ruleJSonFile ) )
            // InternalMyDsl.g:945:4: (lv_jsonfile_4_0= ruleJSonFile )
            {
            // InternalMyDsl.g:945:4: (lv_jsonfile_4_0= ruleJSonFile )
            // InternalMyDsl.g:946:5: lv_jsonfile_4_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getJsonfileJSonFileParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_jsonfile_4_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_4_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertAccess().getJsonFileSourceKeyword_6());
            		
            // InternalMyDsl.g:971:3: ( (lv_jsonfile_7_0= ruleJSonFile ) )
            // InternalMyDsl.g:972:4: (lv_jsonfile_7_0= ruleJSonFile )
            {
            // InternalMyDsl.g:972:4: (lv_jsonfile_7_0= ruleJSonFile )
            // InternalMyDsl.g:973:5: lv_jsonfile_7_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getJsonfileJSonFileParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_jsonfile_7_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_7_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getInsertAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getInsertAccess().getObjectKeyword_10());
            		
            // InternalMyDsl.g:1002:3: ( (lv_node_11_0= ruleJSonObject ) )
            // InternalMyDsl.g:1003:4: (lv_node_11_0= ruleJSonObject )
            {
            // InternalMyDsl.g:1003:4: (lv_node_11_0= ruleJSonObject )
            // InternalMyDsl.g:1004:5: lv_node_11_0= ruleJSonObject
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getNodeJSonObjectParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_7);
            lv_node_11_0=ruleJSonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_11_0,
            						"org.xtext.example.mydsl.MyDsl.JSonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getInsertAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleRemove"
    // InternalMyDsl.g:1029:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalMyDsl.g:1029:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalMyDsl.g:1030:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalMyDsl.g:1036:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_jsonfile_3_0 = null;

        EObject lv_node_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1042:2: ( (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1043:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1043:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1044:3: otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getJsonFileTargetKeyword_2());
            		
            // InternalMyDsl.g:1056:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:1057:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:1057:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:1058:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_jsonfile_3_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getRemoveAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getObjectKeyword_5());
            		
            // InternalMyDsl.g:1083:3: ( (lv_node_6_0= ruleJSonObject ) )
            // InternalMyDsl.g:1084:4: (lv_node_6_0= ruleJSonObject )
            {
            // InternalMyDsl.g:1084:4: (lv_node_6_0= ruleJSonObject )
            // InternalMyDsl.g:1085:5: lv_node_6_0= ruleJSonObject
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getNodeJSonObjectParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_node_6_0=ruleJSonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_6_0,
            						"org.xtext.example.mydsl.MyDsl.JSonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRemoveAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleModify"
    // InternalMyDsl.g:1110:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalMyDsl.g:1110:47: (iv_ruleModify= ruleModify EOF )
            // InternalMyDsl.g:1111:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalMyDsl.g:1117:1: ruleModify returns [EObject current=null] : (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_jsonfile_4_0 = null;

        EObject lv_jsonfile_7_0 = null;

        EObject lv_node_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1123:2: ( (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1124:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1124:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1125:3: otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getModifyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getModifyAccess().getJsonFileTargetKeyword_3());
            		
            // InternalMyDsl.g:1141:3: ( (lv_jsonfile_4_0= ruleJSonFile ) )
            // InternalMyDsl.g:1142:4: (lv_jsonfile_4_0= ruleJSonFile )
            {
            // InternalMyDsl.g:1142:4: (lv_jsonfile_4_0= ruleJSonFile )
            // InternalMyDsl.g:1143:5: lv_jsonfile_4_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getJsonfileJSonFileParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_jsonfile_4_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_4_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getModifyAccess().getJsonFileSourceKeyword_6());
            		
            // InternalMyDsl.g:1168:3: ( (lv_jsonfile_7_0= ruleJSonFile ) )
            // InternalMyDsl.g:1169:4: (lv_jsonfile_7_0= ruleJSonFile )
            {
            // InternalMyDsl.g:1169:4: (lv_jsonfile_7_0= ruleJSonFile )
            // InternalMyDsl.g:1170:5: lv_jsonfile_7_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getJsonfileJSonFileParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_jsonfile_7_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_7_0,
            						"org.xtext.example.mydsl.MyDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getModifyAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getModifyAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getModifyAccess().getObjectKeyword_10());
            		
            // InternalMyDsl.g:1199:3: ( (lv_node_11_0= ruleJSonObject ) )
            // InternalMyDsl.g:1200:4: (lv_node_11_0= ruleJSonObject )
            {
            // InternalMyDsl.g:1200:4: (lv_node_11_0= ruleJSonObject )
            // InternalMyDsl.g:1201:5: lv_node_11_0= ruleJSonObject
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getNodeJSonObjectParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_7);
            lv_node_11_0=ruleJSonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_11_0,
            						"org.xtext.example.mydsl.MyDsl.JSonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getModifyAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleJsonArray"
    // InternalMyDsl.g:1226:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalMyDsl.g:1226:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalMyDsl.g:1227:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonArray"


    // $ANTLR start "ruleJsonArray"
    // InternalMyDsl.g:1233:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleJsonArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_Contient_3_0 = null;

        EObject lv_Contient_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1239:2: ( (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1240:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1240:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1241:3: otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getJSonArrayKeyword_0());
            		
            // InternalMyDsl.g:1245:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1246:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1246:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1247:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJsonArrayAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1267:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalMyDsl.g:1268:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalMyDsl.g:1268:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalMyDsl.g:1269:5: lv_Contient_3_0= ruleJSonAttribut
            {

            					newCompositeNode(grammarAccess.getJsonArrayAccess().getContientJSonAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_Contient_3_0=ruleJSonAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonArrayRule());
            					}
            					add(
            						current,
            						"Contient",
            						lv_Contient_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonAttribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1286:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1287:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1291:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalMyDsl.g:1292:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalMyDsl.g:1292:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalMyDsl.g:1293:6: lv_Contient_5_0= ruleJSonAttribut
            	    {

            	    						newCompositeNode(grammarAccess.getJsonArrayAccess().getContientJSonAttributParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_Contient_5_0=ruleJSonAttribut();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJsonArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Contient",
            	    							lv_Contient_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonAttribut");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJsonArrayAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJSonEnum"
    // InternalMyDsl.g:1319:1: entryRuleJSonEnum returns [EObject current=null] : iv_ruleJSonEnum= ruleJSonEnum EOF ;
    public final EObject entryRuleJSonEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonEnum = null;


        try {
            // InternalMyDsl.g:1319:49: (iv_ruleJSonEnum= ruleJSonEnum EOF )
            // InternalMyDsl.g:1320:2: iv_ruleJSonEnum= ruleJSonEnum EOF
            {
             newCompositeNode(grammarAccess.getJSonEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonEnum=ruleJSonEnum();

            state._fsp--;

             current =iv_ruleJSonEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSonEnum"


    // $ANTLR start "ruleJSonEnum"
    // InternalMyDsl.g:1326:1: ruleJSonEnum returns [EObject current=null] : (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleJSonEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_Contient_3_0 = null;

        EObject lv_Contient_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1332:2: ( (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1333:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1333:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1334:3: otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonEnumAccess().getJSonEnumKeyword_0());
            		
            // InternalMyDsl.g:1338:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1339:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1339:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1340:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJSonEnumAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSonEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getJSonEnumAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1360:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalMyDsl.g:1361:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalMyDsl.g:1361:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalMyDsl.g:1362:5: lv_Contient_3_0= ruleJSonAttribut
            {

            					newCompositeNode(grammarAccess.getJSonEnumAccess().getContientJSonAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_Contient_3_0=ruleJSonAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSonEnumRule());
            					}
            					add(
            						current,
            						"Contient",
            						lv_Contient_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonAttribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1379:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1380:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJSonEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1384:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalMyDsl.g:1385:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalMyDsl.g:1385:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalMyDsl.g:1386:6: lv_Contient_5_0= ruleJSonAttribut
            	    {

            	    						newCompositeNode(grammarAccess.getJSonEnumAccess().getContientJSonAttributParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_Contient_5_0=ruleJSonAttribut();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJSonEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Contient",
            	    							lv_Contient_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonAttribut");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getJSonEnumAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSonEnum"


    // $ANTLR start "entryRuleJsonInteger"
    // InternalMyDsl.g:1412:1: entryRuleJsonInteger returns [EObject current=null] : iv_ruleJsonInteger= ruleJsonInteger EOF ;
    public final EObject entryRuleJsonInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonInteger = null;


        try {
            // InternalMyDsl.g:1412:52: (iv_ruleJsonInteger= ruleJsonInteger EOF )
            // InternalMyDsl.g:1413:2: iv_ruleJsonInteger= ruleJsonInteger EOF
            {
             newCompositeNode(grammarAccess.getJsonIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonInteger=ruleJsonInteger();

            state._fsp--;

             current =iv_ruleJsonInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonInteger"


    // $ANTLR start "ruleJsonInteger"
    // InternalMyDsl.g:1419:1: ruleJsonInteger returns [EObject current=null] : (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleJsonInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1425:2: ( (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1426:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1426:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:1427:3: otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonIntegerAccess().getIntegerKeyword_0());
            		
            // InternalMyDsl.g:1431:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1432:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1432:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1433:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJsonIntegerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonIntegerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1449:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:1450:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1450:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:1451:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getJsonIntegerAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonIntegerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonInteger"


    // $ANTLR start "entryRuleJsonBoolean"
    // InternalMyDsl.g:1471:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalMyDsl.g:1471:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalMyDsl.g:1472:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
            {
             newCompositeNode(grammarAccess.getJsonBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonBoolean=ruleJsonBoolean();

            state._fsp--;

             current =iv_ruleJsonBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonBoolean"


    // $ANTLR start "ruleJsonBoolean"
    // InternalMyDsl.g:1478:1: ruleJsonBoolean returns [EObject current=null] : (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1484:2: ( (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalMyDsl.g:1485:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalMyDsl.g:1485:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalMyDsl.g:1486:3: otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonBooleanAccess().getBooleanKeyword_0());
            		
            // InternalMyDsl.g:1490:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1491:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1491:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1492:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJsonBooleanAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonBooleanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1508:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalMyDsl.g:1509:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalMyDsl.g:1509:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalMyDsl.g:1510:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalMyDsl.g:1510:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1511:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getJsonBooleanAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJsonBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1522:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getJsonBooleanAccess().getValueFalseKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJsonBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonBoolean"


    // $ANTLR start "entryRuleJSonString"
    // InternalMyDsl.g:1539:1: entryRuleJSonString returns [EObject current=null] : iv_ruleJSonString= ruleJSonString EOF ;
    public final EObject entryRuleJSonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonString = null;


        try {
            // InternalMyDsl.g:1539:51: (iv_ruleJSonString= ruleJSonString EOF )
            // InternalMyDsl.g:1540:2: iv_ruleJSonString= ruleJSonString EOF
            {
             newCompositeNode(grammarAccess.getJSonStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonString=ruleJSonString();

            state._fsp--;

             current =iv_ruleJSonString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSonString"


    // $ANTLR start "ruleJSonString"
    // InternalMyDsl.g:1546:1: ruleJSonString returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1552:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1553:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1553:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1554:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonStringAccess().getStringKeyword_0());
            		
            // InternalMyDsl.g:1558:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1559:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1559:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1560:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJSonStringAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSonStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1576:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1577:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1577:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:1578:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getJSonStringAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSonStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSonString"


    // $ANTLR start "entryRuleJSonNull"
    // InternalMyDsl.g:1598:1: entryRuleJSonNull returns [EObject current=null] : iv_ruleJSonNull= ruleJSonNull EOF ;
    public final EObject entryRuleJSonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonNull = null;


        try {
            // InternalMyDsl.g:1598:49: (iv_ruleJSonNull= ruleJSonNull EOF )
            // InternalMyDsl.g:1599:2: iv_ruleJSonNull= ruleJSonNull EOF
            {
             newCompositeNode(grammarAccess.getJSonNullRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonNull=ruleJSonNull();

            state._fsp--;

             current =iv_ruleJSonNull; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSonNull"


    // $ANTLR start "ruleJSonNull"
    // InternalMyDsl.g:1605:1: ruleJSonNull returns [EObject current=null] : (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1611:2: ( (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1612:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1612:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1613:3: otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonNullAccess().getNullKeyword_0());
            		
            // InternalMyDsl.g:1617:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1618:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1618:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1619:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJSonNullAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJSonNullRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSonNull"


    // $ANTLR start "entryRuleSum"
    // InternalMyDsl.g:1639:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalMyDsl.g:1639:44: (iv_ruleSum= ruleSum EOF )
            // InternalMyDsl.g:1640:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalMyDsl.g:1646:1: ruleSum returns [EObject current=null] : (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_listInterger_3_0 = null;

        EObject lv_listInterger_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1652:2: ( (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1653:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1653:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1654:3: otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalMyDsl.g:1658:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1659:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1659:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1660:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSumAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSumAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1680:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1681:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1681:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1682:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getSumAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_listInterger_3_0=ruleJsonInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1699:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1700:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1704:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1705:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1705:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1706:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_listInterger_5_0=ruleJsonInteger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JsonInteger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSumAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleDiv"
    // InternalMyDsl.g:1732:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalMyDsl.g:1732:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalMyDsl.g:1733:2: iv_ruleDiv= ruleDiv EOF
            {
             newCompositeNode(grammarAccess.getDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiv=ruleDiv();

            state._fsp--;

             current =iv_ruleDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiv"


    // $ANTLR start "ruleDiv"
    // InternalMyDsl.g:1739:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_listInterger_3_0 = null;

        EObject lv_listInterger_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1745:2: ( (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1746:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1746:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1747:3: otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
            		
            // InternalMyDsl.g:1751:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1752:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1752:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1753:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDivAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDivAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1773:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1774:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1774:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1775:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getDivAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_listInterger_3_0=ruleJsonInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1792:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1793:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDivAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1797:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1798:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1798:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1799:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getDivAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_listInterger_5_0=ruleJsonInteger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JsonInteger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDivAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiv"


    // $ANTLR start "entryRuleMult"
    // InternalMyDsl.g:1825:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalMyDsl.g:1825:45: (iv_ruleMult= ruleMult EOF )
            // InternalMyDsl.g:1826:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalMyDsl.g:1832:1: ruleMult returns [EObject current=null] : (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_listInterger_3_0 = null;

        EObject lv_listInterger_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1838:2: ( (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1839:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1839:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1840:3: otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
            		
            // InternalMyDsl.g:1844:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1845:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1845:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1846:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMultAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getMultAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1866:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1867:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1867:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1868:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getMultAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_listInterger_3_0=ruleJsonInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1885:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1886:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMultAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1890:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1891:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1891:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1892:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getMultAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_listInterger_5_0=ruleJsonInteger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JsonInteger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMultAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleSub"
    // InternalMyDsl.g:1918:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalMyDsl.g:1918:44: (iv_ruleSub= ruleSub EOF )
            // InternalMyDsl.g:1919:2: iv_ruleSub= ruleSub EOF
            {
             newCompositeNode(grammarAccess.getSubRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSub=ruleSub();

            state._fsp--;

             current =iv_ruleSub; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSub"


    // $ANTLR start "ruleSub"
    // InternalMyDsl.g:1925:1: ruleSub returns [EObject current=null] : (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_listInterger_3_0 = null;

        EObject lv_listInterger_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1931:2: ( (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1932:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1932:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1933:3: otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
            		
            // InternalMyDsl.g:1937:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1938:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1938:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1939:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSubAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1959:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1960:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1960:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1961:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getSubAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_listInterger_3_0=ruleJsonInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1978:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1979:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSubAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1983:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1984:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1984:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1985:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getSubAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_listInterger_5_0=ruleJsonInteger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JsonInteger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSubAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSub"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001F9900000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001F99000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001F99800008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});

}