package fr.istic.idm.group10.jsondsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.idm.group10.jsondsl.services.JsonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonDslParser extends AbstractInternalAntlrParser {
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


        public InternalJsonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonDsl.g"; }



     	private JsonDslGrammarAccess grammarAccess;

        public InternalJsonDslParser(TokenStream input, JsonDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MainGrammar";
       	}

       	@Override
       	protected JsonDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMainGrammar"
    // InternalJsonDsl.g:64:1: entryRuleMainGrammar returns [EObject current=null] : iv_ruleMainGrammar= ruleMainGrammar EOF ;
    public final EObject entryRuleMainGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainGrammar = null;


        try {
            // InternalJsonDsl.g:64:52: (iv_ruleMainGrammar= ruleMainGrammar EOF )
            // InternalJsonDsl.g:65:2: iv_ruleMainGrammar= ruleMainGrammar EOF
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
    // InternalJsonDsl.g:71:1: ruleMainGrammar returns [EObject current=null] : (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes ) ;
    public final EObject ruleMainGrammar() throws RecognitionException {
        EObject current = null;

        EObject this_JSonFile_0 = null;

        EObject this_Commandes_1 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:77:2: ( (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes ) )
            // InternalJsonDsl.g:78:2: (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes )
            {
            // InternalJsonDsl.g:78:2: (this_JSonFile_0= ruleJSonFile | this_Commandes_1= ruleCommandes )
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
                    // InternalJsonDsl.g:79:3: this_JSonFile_0= ruleJSonFile
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
                    // InternalJsonDsl.g:88:3: this_Commandes_1= ruleCommandes
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
    // InternalJsonDsl.g:100:1: entryRuleJSonFile returns [EObject current=null] : iv_ruleJSonFile= ruleJSonFile EOF ;
    public final EObject entryRuleJSonFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonFile = null;


        try {
            // InternalJsonDsl.g:100:49: (iv_ruleJSonFile= ruleJSonFile EOF )
            // InternalJsonDsl.g:101:2: iv_ruleJSonFile= ruleJSonFile EOF
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
    // InternalJsonDsl.g:107:1: ruleJSonFile returns [EObject current=null] : (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' ) ;
    public final EObject ruleJSonFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Contient_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:113:2: ( (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' ) )
            // InternalJsonDsl.g:114:2: (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' )
            {
            // InternalJsonDsl.g:114:2: (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' )
            // InternalJsonDsl.g:115:3: otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonFileAccess().getJSonFileKeyword_0());
            		
            // InternalJsonDsl.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:121:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:141:3: ( (lv_Contient_3_0= ruleJSonObject ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=34 && LA2_0<=35)||(LA2_0>=38 && LA2_0<=39)||(LA2_0>=42 && LA2_0<=47)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJsonDsl.g:142:4: (lv_Contient_3_0= ruleJSonObject )
            	    {
            	    // InternalJsonDsl.g:142:4: (lv_Contient_3_0= ruleJSonObject )
            	    // InternalJsonDsl.g:143:5: lv_Contient_3_0= ruleJSonObject
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
            	    						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
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
    // InternalJsonDsl.g:168:1: entryRuleCommandes returns [EObject current=null] : iv_ruleCommandes= ruleCommandes EOF ;
    public final EObject entryRuleCommandes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandes = null;


        try {
            // InternalJsonDsl.g:168:50: (iv_ruleCommandes= ruleCommandes EOF )
            // InternalJsonDsl.g:169:2: iv_ruleCommandes= ruleCommandes EOF
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
    // InternalJsonDsl.g:175:1: ruleCommandes returns [EObject current=null] : ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) ) ;
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
            // InternalJsonDsl.g:181:2: ( ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) ) )
            // InternalJsonDsl.g:182:2: ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) )
            {
            // InternalJsonDsl.g:182:2: ( (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore ) | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | (this_Modify_9= ruleModify otherlv_10= '}' ) )
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
                    // InternalJsonDsl.g:183:3: (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore )
                    {
                    // InternalJsonDsl.g:183:3: (otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore )
                    // InternalJsonDsl.g:184:4: otherlv_0= 'Commandes' otherlv_1= '{' this_Store_2= ruleStore
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
                    // InternalJsonDsl.g:202:3: this_Load_3= ruleLoad
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
                    // InternalJsonDsl.g:211:3: this_Display_4= ruleDisplay
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
                    // InternalJsonDsl.g:220:3: this_Subset_5= ruleSubset
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
                    // InternalJsonDsl.g:229:3: this_Projection_6= ruleProjection
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
                    // InternalJsonDsl.g:238:3: this_Insert_7= ruleInsert
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
                    // InternalJsonDsl.g:247:3: this_Remove_8= ruleRemove
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
                    // InternalJsonDsl.g:256:3: (this_Modify_9= ruleModify otherlv_10= '}' )
                    {
                    // InternalJsonDsl.g:256:3: (this_Modify_9= ruleModify otherlv_10= '}' )
                    // InternalJsonDsl.g:257:4: this_Modify_9= ruleModify otherlv_10= '}'
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
    // InternalJsonDsl.g:274:1: entryRuleJSonObject returns [EObject current=null] : iv_ruleJSonObject= ruleJSonObject EOF ;
    public final EObject entryRuleJSonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonObject = null;


        try {
            // InternalJsonDsl.g:274:51: (iv_ruleJSonObject= ruleJSonObject EOF )
            // InternalJsonDsl.g:275:2: iv_ruleJSonObject= ruleJSonObject EOF
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
    // InternalJsonDsl.g:281:1: ruleJSonObject returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
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
            // InternalJsonDsl.g:287:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalJsonDsl.g:288:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalJsonDsl.g:288:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
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
                    // InternalJsonDsl.g:289:3: this_JsonArray_0= ruleJsonArray
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
                    // InternalJsonDsl.g:298:3: this_JsonInteger_1= ruleJsonInteger
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
                    // InternalJsonDsl.g:307:3: this_JsonBoolean_2= ruleJsonBoolean
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
                    // InternalJsonDsl.g:316:3: this_JSonEnum_3= ruleJSonEnum
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
                    // InternalJsonDsl.g:325:3: this_JSonString_4= ruleJSonString
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
                    // InternalJsonDsl.g:334:3: this_JSonNull_5= ruleJSonNull
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
                    // InternalJsonDsl.g:343:3: this_Sum_6= ruleSum
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
                    // InternalJsonDsl.g:352:3: this_Div_7= ruleDiv
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
                    // InternalJsonDsl.g:361:3: this_Mult_8= ruleMult
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
                    // InternalJsonDsl.g:370:3: this_Sub_9= ruleSub
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
    // InternalJsonDsl.g:382:1: entryRuleJSonAttribut returns [EObject current=null] : iv_ruleJSonAttribut= ruleJSonAttribut EOF ;
    public final EObject entryRuleJSonAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonAttribut = null;


        try {
            // InternalJsonDsl.g:382:53: (iv_ruleJSonAttribut= ruleJSonAttribut EOF )
            // InternalJsonDsl.g:383:2: iv_ruleJSonAttribut= ruleJSonAttribut EOF
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
    // InternalJsonDsl.g:389:1: ruleJSonAttribut returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
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
            // InternalJsonDsl.g:395:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalJsonDsl.g:396:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalJsonDsl.g:396:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
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
                    // InternalJsonDsl.g:397:3: this_JsonArray_0= ruleJsonArray
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
                    // InternalJsonDsl.g:406:3: this_JsonInteger_1= ruleJsonInteger
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
                    // InternalJsonDsl.g:415:3: this_JsonBoolean_2= ruleJsonBoolean
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
                    // InternalJsonDsl.g:424:3: this_JSonEnum_3= ruleJSonEnum
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
                    // InternalJsonDsl.g:433:3: this_JSonString_4= ruleJSonString
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
                    // InternalJsonDsl.g:442:3: this_JSonNull_5= ruleJSonNull
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
                    // InternalJsonDsl.g:451:3: this_Sum_6= ruleSum
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
                    // InternalJsonDsl.g:460:3: this_Div_7= ruleDiv
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
                    // InternalJsonDsl.g:469:3: this_Mult_8= ruleMult
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
                    // InternalJsonDsl.g:478:3: this_Sub_9= ruleSub
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
    // InternalJsonDsl.g:490:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonDsl.g:490:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonDsl.g:491:2: iv_ruleStore= ruleStore EOF
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
    // InternalJsonDsl.g:497:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalJsonDsl.g:503:2: ( (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalJsonDsl.g:504:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalJsonDsl.g:504:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalJsonDsl.g:505:3: otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getPathKeyword_2());
            		
            // InternalJsonDsl.g:517:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalJsonDsl.g:518:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalJsonDsl.g:518:4: (lv_path_3_0= RULE_STRING )
            // InternalJsonDsl.g:519:5: lv_path_3_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:543:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalJsonDsl.g:544:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalJsonDsl.g:544:4: (lv_name_6_0= RULE_STRING )
            // InternalJsonDsl.g:545:5: lv_name_6_0= RULE_STRING
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
    // InternalJsonDsl.g:569:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalJsonDsl.g:569:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalJsonDsl.g:570:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalJsonDsl.g:576:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalJsonDsl.g:582:2: ( (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalJsonDsl.g:583:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalJsonDsl.g:583:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalJsonDsl.g:584:3: otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getPathKeyword_2());
            		
            // InternalJsonDsl.g:596:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalJsonDsl.g:597:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalJsonDsl.g:597:4: (lv_path_3_0= RULE_STRING )
            // InternalJsonDsl.g:598:5: lv_path_3_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:622:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalJsonDsl.g:623:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalJsonDsl.g:623:4: (lv_name_6_0= RULE_STRING )
            // InternalJsonDsl.g:624:5: lv_name_6_0= RULE_STRING
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
    // InternalJsonDsl.g:648:1: entryRuleDisplay returns [EObject current=null] : iv_ruleDisplay= ruleDisplay EOF ;
    public final EObject entryRuleDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay = null;


        try {
            // InternalJsonDsl.g:648:48: (iv_ruleDisplay= ruleDisplay EOF )
            // InternalJsonDsl.g:649:2: iv_ruleDisplay= ruleDisplay EOF
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
    // InternalJsonDsl.g:655:1: ruleDisplay returns [EObject current=null] : (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' ) ;
    public final EObject ruleDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_jsonfile_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:661:2: ( (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' ) )
            // InternalJsonDsl.g:662:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' )
            {
            // InternalJsonDsl.g:662:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}' )
            // InternalJsonDsl.g:663:3: otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDisplayAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDisplayAccess().getJsonfileKeyword_2());
            		
            // InternalJsonDsl.g:675:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalJsonDsl.g:676:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:676:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalJsonDsl.g:677:5: lv_jsonfile_3_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
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
    // InternalJsonDsl.g:702:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalJsonDsl.g:702:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalJsonDsl.g:703:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalJsonDsl.g:709:1: ruleSubset returns [EObject current=null] : (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' ) ;
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
            // InternalJsonDsl.g:715:2: ( (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' ) )
            // InternalJsonDsl.g:716:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' )
            {
            // InternalJsonDsl.g:716:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}' )
            // InternalJsonDsl.g:717:3: otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'listNodes' otherlv_6= '(' ( (lv_listNodes_7_0= ruleJSonObject ) ) (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )* otherlv_10= ')' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetAccess().getSubsetKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSubsetAccess().getJsonfileKeyword_2());
            		
            // InternalJsonDsl.g:729:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalJsonDsl.g:730:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:730:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalJsonDsl.g:731:5: lv_jsonfile_3_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSubsetAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSubsetAccess().getListNodesKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSubsetAccess().getLeftParenthesisKeyword_6());
            		
            // InternalJsonDsl.g:760:3: ( (lv_listNodes_7_0= ruleJSonObject ) )
            // InternalJsonDsl.g:761:4: (lv_listNodes_7_0= ruleJSonObject )
            {
            // InternalJsonDsl.g:761:4: (lv_listNodes_7_0= ruleJSonObject )
            // InternalJsonDsl.g:762:5: lv_listNodes_7_0= ruleJSonObject
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:779:3: (otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJsonDsl.g:780:4: otherlv_8= ',' ( (lv_listNodes_9_0= ruleJSonObject ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSubsetAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalJsonDsl.g:784:4: ( (lv_listNodes_9_0= ruleJSonObject ) )
            	    // InternalJsonDsl.g:785:5: (lv_listNodes_9_0= ruleJSonObject )
            	    {
            	    // InternalJsonDsl.g:785:5: (lv_listNodes_9_0= ruleJSonObject )
            	    // InternalJsonDsl.g:786:6: lv_listNodes_9_0= ruleJSonObject
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
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
    // InternalJsonDsl.g:816:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalJsonDsl.g:816:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalJsonDsl.g:817:2: iv_ruleProjection= ruleProjection EOF
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
    // InternalJsonDsl.g:823:1: ruleProjection returns [EObject current=null] : (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) ;
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
            // InternalJsonDsl.g:829:2: ( (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) )
            // InternalJsonDsl.g:830:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            {
            // InternalJsonDsl.g:830:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            // InternalJsonDsl.g:831:3: otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'jsonfile' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'node' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectionAccess().getProjectionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectionAccess().getJsonfileKeyword_2());
            		
            // InternalJsonDsl.g:843:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalJsonDsl.g:844:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:844:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalJsonDsl.g:845:5: lv_jsonfile_3_0= ruleJSonFile
            {

            					newCompositeNode(grammarAccess.getProjectionAccess().getJsonfileJSonFileParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_jsonfile_3_0=ruleJSonFile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectionRule());
            					}
            					add(
            						current,
            						"jsonfile",
            						lv_jsonfile_3_0,
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getNodeKeyword_5());
            		
            // InternalJsonDsl.g:870:3: ( (lv_node_6_0= ruleJSonObject ) )
            // InternalJsonDsl.g:871:4: (lv_node_6_0= ruleJSonObject )
            {
            // InternalJsonDsl.g:871:4: (lv_node_6_0= ruleJSonObject )
            // InternalJsonDsl.g:872:5: lv_node_6_0= ruleJSonObject
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
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
    // InternalJsonDsl.g:897:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonDsl.g:897:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonDsl.g:898:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalJsonDsl.g:904:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) ;
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
            // InternalJsonDsl.g:910:2: ( (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) )
            // InternalJsonDsl.g:911:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            {
            // InternalJsonDsl.g:911:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            // InternalJsonDsl.g:912:3: otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertAccess().getJsonFileTargetKeyword_3());
            		
            // InternalJsonDsl.g:928:3: ( (lv_jsonfile_4_0= ruleJSonFile ) )
            // InternalJsonDsl.g:929:4: (lv_jsonfile_4_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:929:4: (lv_jsonfile_4_0= ruleJSonFile )
            // InternalJsonDsl.g:930:5: lv_jsonfile_4_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertAccess().getJsonFileSourceKeyword_6());
            		
            // InternalJsonDsl.g:955:3: ( (lv_jsonfile_7_0= ruleJSonFile ) )
            // InternalJsonDsl.g:956:4: (lv_jsonfile_7_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:956:4: (lv_jsonfile_7_0= ruleJSonFile )
            // InternalJsonDsl.g:957:5: lv_jsonfile_7_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getInsertAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getInsertAccess().getObjectKeyword_10());
            		
            // InternalJsonDsl.g:986:3: ( (lv_node_11_0= ruleJSonObject ) )
            // InternalJsonDsl.g:987:4: (lv_node_11_0= ruleJSonObject )
            {
            // InternalJsonDsl.g:987:4: (lv_node_11_0= ruleJSonObject )
            // InternalJsonDsl.g:988:5: lv_node_11_0= ruleJSonObject
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
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
    // InternalJsonDsl.g:1013:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalJsonDsl.g:1013:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalJsonDsl.g:1014:2: iv_ruleRemove= ruleRemove EOF
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
    // InternalJsonDsl.g:1020:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) ;
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
            // InternalJsonDsl.g:1026:2: ( (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' ) )
            // InternalJsonDsl.g:1027:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            {
            // InternalJsonDsl.g:1027:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}' )
            // InternalJsonDsl.g:1028:3: otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'JsonFileTarget' ( (lv_jsonfile_3_0= ruleJSonFile ) ) otherlv_4= ',' otherlv_5= 'Object:' ( (lv_node_6_0= ruleJSonObject ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getJsonFileTargetKeyword_2());
            		
            // InternalJsonDsl.g:1040:3: ( (lv_jsonfile_3_0= ruleJSonFile ) )
            // InternalJsonDsl.g:1041:4: (lv_jsonfile_3_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:1041:4: (lv_jsonfile_3_0= ruleJSonFile )
            // InternalJsonDsl.g:1042:5: lv_jsonfile_3_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getRemoveAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getObjectKeyword_5());
            		
            // InternalJsonDsl.g:1067:3: ( (lv_node_6_0= ruleJSonObject ) )
            // InternalJsonDsl.g:1068:4: (lv_node_6_0= ruleJSonObject )
            {
            // InternalJsonDsl.g:1068:4: (lv_node_6_0= ruleJSonObject )
            // InternalJsonDsl.g:1069:5: lv_node_6_0= ruleJSonObject
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
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
    // InternalJsonDsl.g:1094:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalJsonDsl.g:1094:47: (iv_ruleModify= ruleModify EOF )
            // InternalJsonDsl.g:1095:2: iv_ruleModify= ruleModify EOF
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
    // InternalJsonDsl.g:1101:1: ruleModify returns [EObject current=null] : (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) ;
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
            // InternalJsonDsl.g:1107:2: ( (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' ) )
            // InternalJsonDsl.g:1108:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            {
            // InternalJsonDsl.g:1108:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}' )
            // InternalJsonDsl.g:1109:3: otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= '(' otherlv_3= 'JsonFileTarget' ( (lv_jsonfile_4_0= ruleJSonFile ) ) otherlv_5= ',' otherlv_6= 'JsonFileSource' ( (lv_jsonfile_7_0= ruleJSonFile ) ) otherlv_8= ')' otherlv_9= ',' otherlv_10= 'Object:' ( (lv_node_11_0= ruleJSonObject ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getModifyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getModifyAccess().getJsonFileTargetKeyword_3());
            		
            // InternalJsonDsl.g:1125:3: ( (lv_jsonfile_4_0= ruleJSonFile ) )
            // InternalJsonDsl.g:1126:4: (lv_jsonfile_4_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:1126:4: (lv_jsonfile_4_0= ruleJSonFile )
            // InternalJsonDsl.g:1127:5: lv_jsonfile_4_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getModifyAccess().getJsonFileSourceKeyword_6());
            		
            // InternalJsonDsl.g:1152:3: ( (lv_jsonfile_7_0= ruleJSonFile ) )
            // InternalJsonDsl.g:1153:4: (lv_jsonfile_7_0= ruleJSonFile )
            {
            // InternalJsonDsl.g:1153:4: (lv_jsonfile_7_0= ruleJSonFile )
            // InternalJsonDsl.g:1154:5: lv_jsonfile_7_0= ruleJSonFile
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonFile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getModifyAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getModifyAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getModifyAccess().getObjectKeyword_10());
            		
            // InternalJsonDsl.g:1183:3: ( (lv_node_11_0= ruleJSonObject ) )
            // InternalJsonDsl.g:1184:4: (lv_node_11_0= ruleJSonObject )
            {
            // InternalJsonDsl.g:1184:4: (lv_node_11_0= ruleJSonObject )
            // InternalJsonDsl.g:1185:5: lv_node_11_0= ruleJSonObject
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonObject");
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
    // InternalJsonDsl.g:1210:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalJsonDsl.g:1210:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalJsonDsl.g:1211:2: iv_ruleJsonArray= ruleJsonArray EOF
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
    // InternalJsonDsl.g:1217:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) ;
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
            // InternalJsonDsl.g:1223:2: ( (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) )
            // InternalJsonDsl.g:1224:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            {
            // InternalJsonDsl.g:1224:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            // InternalJsonDsl.g:1225:3: otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getJSonArrayKeyword_0());
            		
            // InternalJsonDsl.g:1229:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1230:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1230:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1231:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:1251:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalJsonDsl.g:1252:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalJsonDsl.g:1252:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalJsonDsl.g:1253:5: lv_Contient_3_0= ruleJSonAttribut
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonAttribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1270:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJsonDsl.g:1271:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:1275:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalJsonDsl.g:1276:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalJsonDsl.g:1276:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalJsonDsl.g:1277:6: lv_Contient_5_0= ruleJSonAttribut
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JSonAttribut");
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
    // InternalJsonDsl.g:1303:1: entryRuleJSonEnum returns [EObject current=null] : iv_ruleJSonEnum= ruleJSonEnum EOF ;
    public final EObject entryRuleJSonEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonEnum = null;


        try {
            // InternalJsonDsl.g:1303:49: (iv_ruleJSonEnum= ruleJSonEnum EOF )
            // InternalJsonDsl.g:1304:2: iv_ruleJSonEnum= ruleJSonEnum EOF
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
    // InternalJsonDsl.g:1310:1: ruleJSonEnum returns [EObject current=null] : (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' ) ;
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
            // InternalJsonDsl.g:1316:2: ( (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' ) )
            // InternalJsonDsl.g:1317:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' )
            {
            // InternalJsonDsl.g:1317:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']' )
            // InternalJsonDsl.g:1318:3: otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonEnumAccess().getJSonEnumKeyword_0());
            		
            // InternalJsonDsl.g:1322:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1323:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1323:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1324:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:1344:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalJsonDsl.g:1345:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalJsonDsl.g:1345:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalJsonDsl.g:1346:5: lv_Contient_3_0= ruleJSonAttribut
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JSonAttribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1363:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJsonDsl.g:1364:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJSonEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:1368:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalJsonDsl.g:1369:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalJsonDsl.g:1369:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalJsonDsl.g:1370:6: lv_Contient_5_0= ruleJSonAttribut
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JSonAttribut");
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
    // InternalJsonDsl.g:1396:1: entryRuleJsonInteger returns [EObject current=null] : iv_ruleJsonInteger= ruleJsonInteger EOF ;
    public final EObject entryRuleJsonInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonInteger = null;


        try {
            // InternalJsonDsl.g:1396:52: (iv_ruleJsonInteger= ruleJsonInteger EOF )
            // InternalJsonDsl.g:1397:2: iv_ruleJsonInteger= ruleJsonInteger EOF
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
    // InternalJsonDsl.g:1403:1: ruleJsonInteger returns [EObject current=null] : (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleJsonInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1409:2: ( (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalJsonDsl.g:1410:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalJsonDsl.g:1410:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalJsonDsl.g:1411:3: otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonIntegerAccess().getIntegerKeyword_0());
            		
            // InternalJsonDsl.g:1415:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1416:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1416:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1417:5: lv_name_1_0= RULE_STRING
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

            // InternalJsonDsl.g:1433:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalJsonDsl.g:1434:4: (lv_value_2_0= RULE_INT )
            {
            // InternalJsonDsl.g:1434:4: (lv_value_2_0= RULE_INT )
            // InternalJsonDsl.g:1435:5: lv_value_2_0= RULE_INT
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
    // InternalJsonDsl.g:1455:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalJsonDsl.g:1455:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalJsonDsl.g:1456:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
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
    // InternalJsonDsl.g:1462:1: ruleJsonBoolean returns [EObject current=null] : (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1468:2: ( (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalJsonDsl.g:1469:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalJsonDsl.g:1469:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalJsonDsl.g:1470:3: otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonBooleanAccess().getBooleanKeyword_0());
            		
            // InternalJsonDsl.g:1474:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1475:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1475:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1476:5: lv_name_1_0= RULE_STRING
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

            // InternalJsonDsl.g:1492:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalJsonDsl.g:1493:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalJsonDsl.g:1493:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalJsonDsl.g:1494:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalJsonDsl.g:1494:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
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
                    // InternalJsonDsl.g:1495:6: lv_value_2_1= 'true'
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
                    // InternalJsonDsl.g:1506:6: lv_value_2_2= 'false'
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
    // InternalJsonDsl.g:1523:1: entryRuleJSonString returns [EObject current=null] : iv_ruleJSonString= ruleJSonString EOF ;
    public final EObject entryRuleJSonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonString = null;


        try {
            // InternalJsonDsl.g:1523:51: (iv_ruleJSonString= ruleJSonString EOF )
            // InternalJsonDsl.g:1524:2: iv_ruleJSonString= ruleJSonString EOF
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
    // InternalJsonDsl.g:1530:1: ruleJSonString returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1536:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalJsonDsl.g:1537:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalJsonDsl.g:1537:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:1538:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonStringAccess().getStringKeyword_0());
            		
            // InternalJsonDsl.g:1542:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1543:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1543:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1544:5: lv_name_1_0= RULE_STRING
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

            // InternalJsonDsl.g:1560:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalJsonDsl.g:1561:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1561:4: (lv_value_2_0= RULE_STRING )
            // InternalJsonDsl.g:1562:5: lv_value_2_0= RULE_STRING
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
    // InternalJsonDsl.g:1582:1: entryRuleJSonNull returns [EObject current=null] : iv_ruleJSonNull= ruleJSonNull EOF ;
    public final EObject entryRuleJSonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonNull = null;


        try {
            // InternalJsonDsl.g:1582:49: (iv_ruleJSonNull= ruleJSonNull EOF )
            // InternalJsonDsl.g:1583:2: iv_ruleJSonNull= ruleJSonNull EOF
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
    // InternalJsonDsl.g:1589:1: ruleJSonNull returns [EObject current=null] : (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:1595:2: ( (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalJsonDsl.g:1596:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalJsonDsl.g:1596:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:1597:3: otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonNullAccess().getNullKeyword_0());
            		
            // InternalJsonDsl.g:1601:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1602:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1602:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1603:5: lv_name_1_0= RULE_STRING
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
    // InternalJsonDsl.g:1623:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonDsl.g:1623:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonDsl.g:1624:2: iv_ruleSum= ruleSum EOF
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
    // InternalJsonDsl.g:1630:1: ruleSum returns [EObject current=null] : (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalJsonDsl.g:1636:2: ( (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalJsonDsl.g:1637:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalJsonDsl.g:1637:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalJsonDsl.g:1638:3: otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalJsonDsl.g:1642:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1643:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1643:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1644:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:1664:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalJsonDsl.g:1665:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalJsonDsl.g:1665:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalJsonDsl.g:1666:5: lv_listInterger_3_0= ruleJsonInteger
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1683:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJsonDsl.g:1684:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:1688:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalJsonDsl.g:1689:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalJsonDsl.g:1689:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalJsonDsl.g:1690:6: lv_listInterger_5_0= ruleJsonInteger
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
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
    // InternalJsonDsl.g:1716:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalJsonDsl.g:1716:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalJsonDsl.g:1717:2: iv_ruleDiv= ruleDiv EOF
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
    // InternalJsonDsl.g:1723:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalJsonDsl.g:1729:2: ( (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalJsonDsl.g:1730:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalJsonDsl.g:1730:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalJsonDsl.g:1731:3: otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
            		
            // InternalJsonDsl.g:1735:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1736:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1736:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1737:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:1757:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalJsonDsl.g:1758:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalJsonDsl.g:1758:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalJsonDsl.g:1759:5: lv_listInterger_3_0= ruleJsonInteger
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1776:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonDsl.g:1777:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDivAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:1781:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalJsonDsl.g:1782:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalJsonDsl.g:1782:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalJsonDsl.g:1783:6: lv_listInterger_5_0= ruleJsonInteger
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
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
    // InternalJsonDsl.g:1809:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalJsonDsl.g:1809:45: (iv_ruleMult= ruleMult EOF )
            // InternalJsonDsl.g:1810:2: iv_ruleMult= ruleMult EOF
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
    // InternalJsonDsl.g:1816:1: ruleMult returns [EObject current=null] : (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalJsonDsl.g:1822:2: ( (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalJsonDsl.g:1823:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalJsonDsl.g:1823:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalJsonDsl.g:1824:3: otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
            		
            // InternalJsonDsl.g:1828:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1829:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1829:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1830:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:1850:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalJsonDsl.g:1851:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalJsonDsl.g:1851:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalJsonDsl.g:1852:5: lv_listInterger_3_0= ruleJsonInteger
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1869:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJsonDsl.g:1870:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMultAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:1874:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalJsonDsl.g:1875:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalJsonDsl.g:1875:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalJsonDsl.g:1876:6: lv_listInterger_5_0= ruleJsonInteger
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
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
    // InternalJsonDsl.g:1902:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalJsonDsl.g:1902:44: (iv_ruleSub= ruleSub EOF )
            // InternalJsonDsl.g:1903:2: iv_ruleSub= ruleSub EOF
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
    // InternalJsonDsl.g:1909:1: ruleSub returns [EObject current=null] : (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) ;
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
            // InternalJsonDsl.g:1915:2: ( (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' ) )
            // InternalJsonDsl.g:1916:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            {
            // InternalJsonDsl.g:1916:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']' )
            // InternalJsonDsl.g:1917:3: otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJsonInteger ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
            		
            // InternalJsonDsl.g:1921:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalJsonDsl.g:1922:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalJsonDsl.g:1922:4: (lv_name_1_0= RULE_STRING )
            // InternalJsonDsl.g:1923:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalJsonDsl.g:1943:3: ( (lv_listInterger_3_0= ruleJsonInteger ) )
            // InternalJsonDsl.g:1944:4: (lv_listInterger_3_0= ruleJsonInteger )
            {
            // InternalJsonDsl.g:1944:4: (lv_listInterger_3_0= ruleJsonInteger )
            // InternalJsonDsl.g:1945:5: lv_listInterger_3_0= ruleJsonInteger
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
            						"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:1962:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJsonDsl.g:1963:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSubAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJsonDsl.g:1967:4: ( (lv_listInterger_5_0= ruleJsonInteger ) )
            	    // InternalJsonDsl.g:1968:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    {
            	    // InternalJsonDsl.g:1968:5: (lv_listInterger_5_0= ruleJsonInteger )
            	    // InternalJsonDsl.g:1969:6: lv_listInterger_5_0= ruleJsonInteger
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
            	    							"fr.istic.idm.group10.jsondsl.JsonDsl.JsonInteger");
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