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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'JSonFile'", "'{'", "'}'", "'Commandes'", "'Store'", "'path'", "','", "'name'", "'Load'", "'Display'", "'jsonfile'", "'Subset'", "'listNodes'", "'('", "')'", "'Projection'", "'node'", "'Insert'", "'JsonFileTarget'", "'JsonFileSource'", "'Object:'", "'Remove'", "'Modify'", "'JSonArray'", "'JSonEnum'", "'['", "']'", "'Integer'", "'Boolean'", "'true'", "'false'", "'String'", "'Null'", "'Sum'", "'Div'", "'Mult'", "'Sub'"
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
            else if ( (LA1_0==14||(LA1_0>=19 && LA1_0<=20)||LA1_0==22||LA1_0==26||LA1_0==28||(LA1_0>=32 && LA1_0<=33)) ) {
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

                if ( ((LA2_0>=34 && LA2_0<=35)||(LA2_0>=38 && LA2_0<=39)||(LA2_0>=42 && LA2_0<=47)) ) {
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
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            case 33:
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
    // InternalMyDsl.g:281:1: ruleJSonObject returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
    public final EObject ruleJSonObject() throws RecognitionException {
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
            // InternalMyDsl.g:287:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalMyDsl.g:288:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalMyDsl.g:288:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 42:
                {
                alt4=5;
                }
                break;
            case 43:
                {
                alt4=6;
                }
                break;
            case 44:
                {
                alt4=7;
                }
                break;
            case 45:
                {
                alt4=8;
                }
                break;
            case 46:
                {
                alt4=9;
                }
                break;
            case 47:
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
                    // InternalMyDsl.g:289:3: this_JsonArray_0= ruleJsonArray
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJsonArrayParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonArray_0=ruleJsonArray();

                    state._fsp--;


                    			current = this_JsonArray_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:298:3: this_JsonInteger_1= ruleJsonInteger
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJsonIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonInteger_1=ruleJsonInteger();

                    state._fsp--;


                    			current = this_JsonInteger_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:307:3: this_JsonBoolean_2= ruleJsonBoolean
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJsonBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_2=ruleJsonBoolean();

                    state._fsp--;


                    			current = this_JsonBoolean_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:316:3: this_JSonEnum_3= ruleJSonEnum
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJSonEnumParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonEnum_3=ruleJSonEnum();

                    state._fsp--;


                    			current = this_JSonEnum_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:325:3: this_JSonString_4= ruleJSonString
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJSonStringParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonString_4=ruleJSonString();

                    state._fsp--;


                    			current = this_JSonString_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:334:3: this_JSonNull_5= ruleJSonNull
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getJSonNullParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonNull_5=ruleJSonNull();

                    state._fsp--;


                    			current = this_JSonNull_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:343:3: this_Sum_6= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getSumParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_6=ruleSum();

                    state._fsp--;


                    			current = this_Sum_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:352:3: this_Div_7= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getDivParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_7=ruleDiv();

                    state._fsp--;


                    			current = this_Div_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:361:3: this_Mult_8= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getMultParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_8=ruleMult();

                    state._fsp--;


                    			current = this_Mult_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:370:3: this_Sub_9= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getJSonObjectAccess().getSubParserRuleCall_9());
                    		
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
    // $ANTLR end "ruleJSonObject"


    // $ANTLR start "entryRuleJSonAttribut"
    // InternalMyDsl.g:382:1: entryRuleJSonAttribut returns [EObject current=null] : iv_ruleJSonAttribut= ruleJSonAttribut EOF ;
    public final EObject entryRuleJSonAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonAttribut = null;


        try {
            // InternalMyDsl.g:382:53: (iv_ruleJSonAttribut= ruleJSonAttribut EOF )
            // InternalMyDsl.g:383:2: iv_ruleJSonAttribut= ruleJSonAttribut EOF
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
    // InternalMyDsl.g:389:1: ruleJSonAttribut returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
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
            // InternalMyDsl.g:395:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalMyDsl.g:396:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalMyDsl.g:396:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            case 42:
                {
                alt5=5;
                }
                break;
            case 43:
                {
                alt5=6;
                }
                break;
            case 44:
                {
                alt5=7;
                }
                break;
            case 45:
                {
                alt5=8;
                }
                break;
            case 46:
                {
                alt5=9;
                }
                break;
            case 47:
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
                    // InternalMyDsl.g:397:3: this_JsonArray_0= ruleJsonArray
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
                    // InternalMyDsl.g:406:3: this_JsonInteger_1= ruleJsonInteger
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
                    // InternalMyDsl.g:415:3: this_JsonBoolean_2= ruleJsonBoolean
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
                    // InternalMyDsl.g:424:3: this_JSonEnum_3= ruleJSonEnum
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
                    // InternalMyDsl.g:433:3: this_JSonString_4= ruleJSonString
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
                    // InternalMyDsl.g:442:3: this_JSonNull_5= ruleJSonNull
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
                    // InternalMyDsl.g:451:3: this_Sum_6= ruleSum
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
                    // InternalMyDsl.g:460:3: this_Div_7= ruleDiv
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
                    // InternalMyDsl.g:469:3: this_Mult_8= ruleMult
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
                    // InternalMyDsl.g:478:3: this_Sub_9= ruleSub
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
    // InternalMyDsl.g:490:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:490:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:491:2: iv_ruleStore= ruleStore EOF
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
    // InternalMyDsl.g:497:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:503:2: ( (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:504:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:504:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:505:3: otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getPathKeyword_2());
            		
            // InternalMyDsl.g:517:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:518:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:518:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:519:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:543:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:544:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:544:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:545:5: lv_name_6_0= RULE_STRING
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
    // InternalMyDsl.g:569:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:569:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:570:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalMyDsl.g:576:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:582:2: ( (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:583:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:583:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:584:3: otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getPathKeyword_2());
            		
            // InternalMyDsl.g:596:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:597:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:597:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:598:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:622:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:623:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:623:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:624:5: lv_name_6_0= RULE_STRING
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
    // InternalMyDsl.g:648:1: entryRuleDisplay returns [EObject current=null] : iv_ruleDisplay= ruleDisplay EOF ;
    public final EObject entryRuleDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay = null;


        try {
            // InternalMyDsl.g:648:48: (iv_ruleDisplay= ruleDisplay EOF )
            // InternalMyDsl.g:649:2: iv_ruleDisplay= ruleDisplay EOF
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
    // InternalMyDsl.g:655:1: ruleDisplay returns [EObject current=null] : (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        EObject lv_jsonfile_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:661:2: ( (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:662:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:662:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:663:3: otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisplayAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDisplayAccess().getJsonfileKeyword_2());
            		
            // InternalMyDsl.g:675:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:676:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:676:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:677:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getDisplayAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDisplayAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDisplayAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:702:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:703:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:703:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:704:5: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_6_0, grammarAccess.getDisplayAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:728:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalMyDsl.g:728:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalMyDsl.g:729:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalMyDsl.g:735:1: ruleSubset returns [EObject current=null] : (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:741:2: ( (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' ) )
            // InternalMyDsl.g:742:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalMyDsl.g:742:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' )
            // InternalMyDsl.g:743:3: otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetAccess().getSubsetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSubsetAccess().getJsonfileKeyword_2());
            		
            // InternalMyDsl.g:755:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:756:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:756:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:757:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getSubsetAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSubsetAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSubsetAccess().getListNodesKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSubsetAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMyDsl.g:786:3: ( (lv_listNodes_7_0= ruleJSonObject ) )
            // InternalMyDsl.g:787:4: (lv_listNodes_7_0= ruleJSonObject )
            {
            // InternalMyDsl.g:787:4: (lv_listNodes_7_0= ruleJSonObject )
            // InternalMyDsl.g:788:5: lv_listNodes_7_0= ruleJSonObject
            {

            					newCompositeNode(grammarAccess.getSubsetAccess().getListNodesJSonObjectParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:805:3: (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:806:4: otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubsetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:810:4: ( (lv_listNodes_9_0= ruleJSonObject ) )
            	    // InternalMyDsl.g:811:5: (lv_listNodes_9_0= ruleJSonObject )
            	    {
            	    // InternalMyDsl.g:811:5: (lv_listNodes_9_0= ruleJSonObject )
            	    // InternalMyDsl.g:812:6: lv_listNodes_9_0= ruleJSonObject
            	    {

            	    						newCompositeNode(grammarAccess.getSubsetAccess().getListNodesJSonObjectParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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

            otherlv_10=(Token)match(input,25,FOLLOW_7); 

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
    // InternalMyDsl.g:842:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalMyDsl.g:842:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalMyDsl.g:843:2: iv_ruleProjection= ruleProjection EOF
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
    // InternalMyDsl.g:849:1: ruleProjection returns [EObject current=null] : (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_node_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:855:2: ( (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:856:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:856:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            // InternalMyDsl.g:857:3: otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectionAccess().getProjectionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectionAccess().getNameKeyword_2());
            		
            // InternalMyDsl.g:869:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalMyDsl.g:870:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:870:4: (lv_name_3_0= RULE_STRING )
            // InternalMyDsl.g:871:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getProjectionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getNodeKeyword_5());
            		
            // InternalMyDsl.g:895:3: ( (lv_node_6_0= ruleJSonObject ) )
            // InternalMyDsl.g:896:4: (lv_node_6_0= ruleJSonObject )
            {
            // InternalMyDsl.g:896:4: (lv_node_6_0= ruleJSonObject )
            // InternalMyDsl.g:897:5: lv_node_6_0= ruleJSonObject
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
    // InternalMyDsl.g:922:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalMyDsl.g:922:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalMyDsl.g:923:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalMyDsl.g:929:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:935:2: ( (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:936:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:936:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            // InternalMyDsl.g:937:3: otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getJsonFileTargetKeyword_3());
            		
            // InternalMyDsl.g:953:3: ( (lv_jsonfile_4_0= ruleJSonFile ) )
            // InternalMyDsl.g:954:4: (lv_jsonfile_4_0= ruleJSonFile )
            {
            // InternalMyDsl.g:954:4: (lv_jsonfile_4_0= ruleJSonFile )
            // InternalMyDsl.g:955:5: lv_jsonfile_4_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getJsonfileJSonFileParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertAccess().getJsonFileSourceKeyword_6());
            		
            // InternalMyDsl.g:980:3: ( (lv_jsonfile_7_0= ruleJSonFile ) )
            // InternalMyDsl.g:981:4: (lv_jsonfile_7_0= ruleJSonFile )
            {
            // InternalMyDsl.g:981:4: (lv_jsonfile_7_0= ruleJSonFile )
            // InternalMyDsl.g:982:5: lv_jsonfile_7_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getJsonfileJSonFileParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_8=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getInsertAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getInsertAccess().getObjectKeyword_10());
            		
            // InternalMyDsl.g:1011:3: ( (lv_node_11_0= ruleJSonObject ) )
            // InternalMyDsl.g:1012:4: (lv_node_11_0= ruleJSonObject )
            {
            // InternalMyDsl.g:1012:4: (lv_node_11_0= ruleJSonObject )
            // InternalMyDsl.g:1013:5: lv_node_11_0= ruleJSonObject
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
    // InternalMyDsl.g:1038:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalMyDsl.g:1038:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalMyDsl.g:1039:2: iv_ruleRemove= ruleRemove EOF
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
    // InternalMyDsl.g:1045:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:1051:2: ( (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1052:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1052:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1053:3: otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getJsonFileTargetKeyword_2());
            		
            // InternalMyDsl.g:1065:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalMyDsl.g:1066:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalMyDsl.g:1066:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalMyDsl.g:1067:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getRemoveAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getRemoveAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getObjectKeyword_5());
            		
            // InternalMyDsl.g:1092:3: ( (lv_node_6_0= ruleJSonObject ) )
            // InternalMyDsl.g:1093:4: (lv_node_6_0= ruleJSonObject )
            {
            // InternalMyDsl.g:1093:4: (lv_node_6_0= ruleJSonObject )
            // InternalMyDsl.g:1094:5: lv_node_6_0= ruleJSonObject
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
    // InternalMyDsl.g:1119:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalMyDsl.g:1119:47: (iv_ruleModify= ruleModify EOF )
            // InternalMyDsl.g:1120:2: iv_ruleModify= ruleModify EOF
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
    // InternalMyDsl.g:1126:1: ruleModify returns [EObject current=null] : (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) ;
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
            // InternalMyDsl.g:1132:2: ( (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) )
            // InternalMyDsl.g:1133:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            {
            // InternalMyDsl.g:1133:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            // InternalMyDsl.g:1134:3: otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getModifyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getModifyAccess().getJsonFileTargetKeyword_3());
            		
            // InternalMyDsl.g:1150:3: ( (lv_jsonfile_4_0= ruleJSonFile ) )
            // InternalMyDsl.g:1151:4: (lv_jsonfile_4_0= ruleJSonFile )
            {
            // InternalMyDsl.g:1151:4: (lv_jsonfile_4_0= ruleJSonFile )
            // InternalMyDsl.g:1152:5: lv_jsonfile_4_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getJsonfileJSonFileParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getModifyAccess().getJsonFileSourceKeyword_6());
            		
            // InternalMyDsl.g:1177:3: ( (lv_jsonfile_7_0= ruleJSonFile ) )
            // InternalMyDsl.g:1178:4: (lv_jsonfile_7_0= ruleJSonFile )
            {
            // InternalMyDsl.g:1178:4: (lv_jsonfile_7_0= ruleJSonFile )
            // InternalMyDsl.g:1179:5: lv_jsonfile_7_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getJsonfileJSonFileParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_8=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getModifyAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getModifyAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getModifyAccess().getObjectKeyword_10());
            		
            // InternalMyDsl.g:1208:3: ( (lv_node_11_0= ruleJSonObject ) )
            // InternalMyDsl.g:1209:4: (lv_node_11_0= ruleJSonObject )
            {
            // InternalMyDsl.g:1209:4: (lv_node_11_0= ruleJSonObject )
            // InternalMyDsl.g:1210:5: lv_node_11_0= ruleJSonObject
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
    // InternalMyDsl.g:1235:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalMyDsl.g:1235:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalMyDsl.g:1236:2: iv_ruleJsonArray= ruleJsonArray EOF
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
    // InternalMyDsl.g:1242:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1248:2: ( (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1249:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1249:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1250:3: otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getJSonArrayKeyword_0());
            		
            // InternalMyDsl.g:1254:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1255:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1255:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1256:5: lv_name_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1276:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalMyDsl.g:1277:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalMyDsl.g:1277:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalMyDsl.g:1278:5: lv_Contient_3_0= ruleJSonAttribut
            {

            					newCompositeNode(grammarAccess.getJsonArrayAccess().getContientJSonAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalMyDsl.g:1295:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1296:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1300:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalMyDsl.g:1301:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalMyDsl.g:1301:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalMyDsl.g:1302:6: lv_Contient_5_0= ruleJSonAttribut
            	    {

            	    						newCompositeNode(grammarAccess.getJsonArrayAccess().getContientJSonAttributParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1328:1: entryRuleJSonEnum returns [EObject current=null] : iv_ruleJSonEnum= ruleJSonEnum EOF ;
    public final EObject entryRuleJSonEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonEnum = null;


        try {
            // InternalMyDsl.g:1328:49: (iv_ruleJSonEnum= ruleJSonEnum EOF )
            // InternalMyDsl.g:1329:2: iv_ruleJSonEnum= ruleJSonEnum EOF
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
    // InternalMyDsl.g:1335:1: ruleJSonEnum returns [EObject current=null] : (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1341:2: ( (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1342:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1342:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1343:3: otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonEnumAccess().getJSonEnumKeyword_0());
            		
            // InternalMyDsl.g:1347:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1348:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1348:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1349:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getJSonEnumAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1369:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalMyDsl.g:1370:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalMyDsl.g:1370:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalMyDsl.g:1371:5: lv_Contient_3_0= ruleJSonAttribut
            {

            					newCompositeNode(grammarAccess.getJSonEnumAccess().getContientJSonAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1388:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1389:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJSonEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1393:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalMyDsl.g:1394:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalMyDsl.g:1394:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalMyDsl.g:1395:6: lv_Contient_5_0= ruleJSonAttribut
            	    {

            	    						newCompositeNode(grammarAccess.getJSonEnumAccess().getContientJSonAttributParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalMyDsl.g:1421:1: entryRuleJsonInteger returns [EObject current=null] : iv_ruleJsonInteger= ruleJsonInteger EOF ;
    public final EObject entryRuleJsonInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonInteger = null;


        try {
            // InternalMyDsl.g:1421:52: (iv_ruleJsonInteger= ruleJsonInteger EOF )
            // InternalMyDsl.g:1422:2: iv_ruleJsonInteger= ruleJsonInteger EOF
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
    // InternalMyDsl.g:1428:1: ruleJsonInteger returns [EObject current=null] : (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleJsonInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1434:2: ( (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1435:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1435:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:1436:3: otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonIntegerAccess().getIntegerKeyword_0());
            		
            // InternalMyDsl.g:1440:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1441:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1441:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1442:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            // InternalMyDsl.g:1458:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:1459:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1459:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:1460:5: lv_value_2_0= RULE_INT
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
    // InternalMyDsl.g:1480:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalMyDsl.g:1480:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalMyDsl.g:1481:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
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
    // InternalMyDsl.g:1487:1: ruleJsonBoolean returns [EObject current=null] : (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1493:2: ( (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalMyDsl.g:1494:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalMyDsl.g:1494:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalMyDsl.g:1495:3: otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonBooleanAccess().getBooleanKeyword_0());
            		
            // InternalMyDsl.g:1499:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1500:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1500:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1501:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            // InternalMyDsl.g:1517:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalMyDsl.g:1518:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalMyDsl.g:1518:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalMyDsl.g:1519:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalMyDsl.g:1519:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1520:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getJsonBooleanAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJsonBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1531:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,41,FOLLOW_2); 

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
    // InternalMyDsl.g:1548:1: entryRuleJSonString returns [EObject current=null] : iv_ruleJSonString= ruleJSonString EOF ;
    public final EObject entryRuleJSonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonString = null;


        try {
            // InternalMyDsl.g:1548:51: (iv_ruleJSonString= ruleJSonString EOF )
            // InternalMyDsl.g:1549:2: iv_ruleJSonString= ruleJSonString EOF
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
    // InternalMyDsl.g:1555:1: ruleJSonString returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1561:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1562:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1562:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1563:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonStringAccess().getStringKeyword_0());
            		
            // InternalMyDsl.g:1567:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1568:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1568:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1569:5: lv_name_1_0= RULE_STRING
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

            // InternalMyDsl.g:1585:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1586:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1586:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:1587:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:1607:1: entryRuleJSonNull returns [EObject current=null] : iv_ruleJSonNull= ruleJSonNull EOF ;
    public final EObject entryRuleJSonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonNull = null;


        try {
            // InternalMyDsl.g:1607:49: (iv_ruleJSonNull= ruleJSonNull EOF )
            // InternalMyDsl.g:1608:2: iv_ruleJSonNull= ruleJSonNull EOF
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
    // InternalMyDsl.g:1614:1: ruleJSonNull returns [EObject current=null] : (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1620:2: ( (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1621:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1621:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1622:3: otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonNullAccess().getNullKeyword_0());
            		
            // InternalMyDsl.g:1626:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1627:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1627:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1628:5: lv_name_1_0= RULE_STRING
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
    // InternalMyDsl.g:1648:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalMyDsl.g:1648:44: (iv_ruleSum= ruleSum EOF )
            // InternalMyDsl.g:1649:2: iv_ruleSum= ruleSum EOF
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
    // InternalMyDsl.g:1655:1: ruleSum returns [EObject current=null] : (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1661:2: ( (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1662:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1662:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1663:3: otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalMyDsl.g:1667:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1668:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1668:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1669:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSumAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1689:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1690:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1690:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1691:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getSumAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1708:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1709:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1713:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1714:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1714:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1715:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalMyDsl.g:1741:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalMyDsl.g:1741:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalMyDsl.g:1742:2: iv_ruleDiv= ruleDiv EOF
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
    // InternalMyDsl.g:1748:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1754:2: ( (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1755:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1755:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1756:3: otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
            		
            // InternalMyDsl.g:1760:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1761:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1761:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1762:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getDivAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1782:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1783:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1783:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1784:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getDivAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1801:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1802:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDivAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1806:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1807:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1807:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1808:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getDivAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalMyDsl.g:1834:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalMyDsl.g:1834:45: (iv_ruleMult= ruleMult EOF )
            // InternalMyDsl.g:1835:2: iv_ruleMult= ruleMult EOF
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
    // InternalMyDsl.g:1841:1: ruleMult returns [EObject current=null] : (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1847:2: ( (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1848:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1848:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1849:3: otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
            		
            // InternalMyDsl.g:1853:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1854:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1854:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1855:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getMultAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1875:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1876:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1876:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1877:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getMultAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1894:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1895:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMultAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1899:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1900:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1900:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1901:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getMultAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    // InternalMyDsl.g:1927:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalMyDsl.g:1927:44: (iv_ruleSub= ruleSub EOF )
            // InternalMyDsl.g:1928:2: iv_ruleSub= ruleSub EOF
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
    // InternalMyDsl.g:1934:1: ruleSub returns [EObject current=null] : (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1940:2: ( (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1941:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1941:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1942:3: otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
            		
            // InternalMyDsl.g:1946:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1947:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1947:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1948:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSubAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1968:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalMyDsl.g:1969:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalMyDsl.g:1969:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalMyDsl.g:1970:5: lv_listInterger_3_0= ruleJsonInteger
            {

            					newCompositeNode(grammarAccess.getSubAccess().getListIntergerJsonIntegerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1987:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1988:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSubAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1992:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalMyDsl.g:1993:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalMyDsl.g:1993:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalMyDsl.g:1994:6: lv_listInterger_5_0= ruleJsonInteger
            	    {

            	    						newCompositeNode(grammarAccess.getSubAccess().getListIntergerJsonIntegerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000FCCC00002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000FCCC00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});

}