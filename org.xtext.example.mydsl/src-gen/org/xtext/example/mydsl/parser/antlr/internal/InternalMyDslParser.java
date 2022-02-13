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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'JSonFile'", "'{'", "'}'", "'Commandes'", "'Store'", "'path'", "'name'", "'contenu'", "'Load'", "'Display'", "'jsonfileName'", "'Subset'", "'arrayName'", "'keyName'", "'Projection'", "'Insert'", "'targetNode'", "'nameObject'", "'Remove'", "'nameObjectRemove'", "'Modify'", "'JSonArray'", "'JSonEnum'", "'['", "']'", "'Integer'", "'Boolean'", "'true'", "'false'", "'String'", "'Null'", "'Sum'", "'Div'", "'Mult'", "'Sub'"
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
    // InternalMyDsl.g:71:1: ruleMainGrammar returns [EObject current=null] : ( ( ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) ) ) (otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) ) )* ) ;
    public final EObject ruleMainGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_Main_0_1 = null;

        EObject lv_Main_0_2 = null;

        EObject lv_Main_2_1 = null;

        EObject lv_Main_2_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) ) ) (otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) ) )* ) )
            // InternalMyDsl.g:78:2: ( ( ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) ) ) (otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) ) ) (otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) ) )* )
            // InternalMyDsl.g:79:3: ( ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) ) ) (otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) ) )*
            {
            // InternalMyDsl.g:79:3: ( ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) ) )
            // InternalMyDsl.g:80:4: ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) )
            {
            // InternalMyDsl.g:80:4: ( (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes ) )
            // InternalMyDsl.g:81:5: (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes )
            {
            // InternalMyDsl.g:81:5: (lv_Main_0_1= ruleJSonFile | lv_Main_0_2= ruleCommandes )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:82:6: lv_Main_0_1= ruleJSonFile
                    {

                    						newCompositeNode(grammarAccess.getMainGrammarAccess().getMainJSonFileParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_Main_0_1=ruleJSonFile();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainGrammarRule());
                    						}
                    						add(
                    							current,
                    							"Main",
                    							lv_Main_0_1,
                    							"org.xtext.example.mydsl.MyDsl.JSonFile");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:98:6: lv_Main_0_2= ruleCommandes
                    {

                    						newCompositeNode(grammarAccess.getMainGrammarAccess().getMainCommandesParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_3);
                    lv_Main_0_2=ruleCommandes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainGrammarRule());
                    						}
                    						add(
                    							current,
                    							"Main",
                    							lv_Main_0_2,
                    							"org.xtext.example.mydsl.MyDsl.Commandes");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:116:3: (otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:117:4: otherlv_1= ',' ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMainGrammarAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:121:4: ( ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) ) )
            	    // InternalMyDsl.g:122:5: ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) )
            	    {
            	    // InternalMyDsl.g:122:5: ( (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes ) )
            	    // InternalMyDsl.g:123:6: (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes )
            	    {
            	    // InternalMyDsl.g:123:6: (lv_Main_2_1= ruleJSonFile | lv_Main_2_2= ruleCommandes )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==12) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==15) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMyDsl.g:124:7: lv_Main_2_1= ruleJSonFile
            	            {

            	            							newCompositeNode(grammarAccess.getMainGrammarAccess().getMainJSonFileParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_3);
            	            lv_Main_2_1=ruleJSonFile();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMainGrammarRule());
            	            							}
            	            							add(
            	            								current,
            	            								"Main",
            	            								lv_Main_2_1,
            	            								"org.xtext.example.mydsl.MyDsl.JSonFile");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:140:7: lv_Main_2_2= ruleCommandes
            	            {

            	            							newCompositeNode(grammarAccess.getMainGrammarAccess().getMainCommandesParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_3);
            	            lv_Main_2_2=ruleCommandes();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMainGrammarRule());
            	            							}
            	            							add(
            	            								current,
            	            								"Main",
            	            								lv_Main_2_2,
            	            								"org.xtext.example.mydsl.MyDsl.Commandes");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // InternalMyDsl.g:163:1: entryRuleJSonFile returns [EObject current=null] : iv_ruleJSonFile= ruleJSonFile EOF ;
    public final EObject entryRuleJSonFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonFile = null;


        try {
            // InternalMyDsl.g:163:49: (iv_ruleJSonFile= ruleJSonFile EOF )
            // InternalMyDsl.g:164:2: iv_ruleJSonFile= ruleJSonFile EOF
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
    // InternalMyDsl.g:170:1: ruleJSonFile returns [EObject current=null] : (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' ) ;
    public final EObject ruleJSonFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Contient_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:176:2: ( (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:177:2: (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:177:2: (otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}' )
            // InternalMyDsl.g:178:3: otherlv_0= 'JSonFile' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonObject ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonFileAccess().getJSonFileKeyword_0());
            		
            // InternalMyDsl.g:182:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:183:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:183:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:184:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getJSonFileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:204:3: ( (lv_Contient_3_0= ruleJSonObject ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=33 && LA4_0<=34)||(LA4_0>=37 && LA4_0<=38)||(LA4_0>=41 && LA4_0<=46)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:205:4: (lv_Contient_3_0= ruleJSonObject )
            	    {
            	    // InternalMyDsl.g:205:4: (lv_Contient_3_0= ruleJSonObject )
            	    // InternalMyDsl.g:206:5: lv_Contient_3_0= ruleJSonObject
            	    {

            	    					newCompositeNode(grammarAccess.getJSonFileAccess().getContientJSonObjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:231:1: entryRuleCommandes returns [EObject current=null] : iv_ruleCommandes= ruleCommandes EOF ;
    public final EObject entryRuleCommandes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandes = null;


        try {
            // InternalMyDsl.g:231:50: (iv_ruleCommandes= ruleCommandes EOF )
            // InternalMyDsl.g:232:2: iv_ruleCommandes= ruleCommandes EOF
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
    // InternalMyDsl.g:238:1: ruleCommandes returns [EObject current=null] : (otherlv_0= 'Commandes' otherlv_1= '{' (this_Store_2= ruleStore | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | this_Modify_9= ruleModify ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:244:2: ( (otherlv_0= 'Commandes' otherlv_1= '{' (this_Store_2= ruleStore | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | this_Modify_9= ruleModify ) otherlv_10= '}' ) )
            // InternalMyDsl.g:245:2: (otherlv_0= 'Commandes' otherlv_1= '{' (this_Store_2= ruleStore | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | this_Modify_9= ruleModify ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:245:2: (otherlv_0= 'Commandes' otherlv_1= '{' (this_Store_2= ruleStore | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | this_Modify_9= ruleModify ) otherlv_10= '}' )
            // InternalMyDsl.g:246:3: otherlv_0= 'Commandes' otherlv_1= '{' (this_Store_2= ruleStore | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | this_Modify_9= ruleModify ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCommandesAccess().getCommandesKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCommandesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:254:3: (this_Store_2= ruleStore | this_Load_3= ruleLoad | this_Display_4= ruleDisplay | this_Subset_5= ruleSubset | this_Projection_6= ruleProjection | this_Insert_7= ruleInsert | this_Remove_8= ruleRemove | this_Modify_9= ruleModify )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            case 30:
                {
                alt5=7;
                }
                break;
            case 32:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:255:4: this_Store_2= ruleStore
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getStoreParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_Store_2=ruleStore();

                    state._fsp--;


                    				current = this_Store_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:264:4: this_Load_3= ruleLoad
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getLoadParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Load_3=ruleLoad();

                    state._fsp--;


                    				current = this_Load_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:273:4: this_Display_4= ruleDisplay
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getDisplayParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_Display_4=ruleDisplay();

                    state._fsp--;


                    				current = this_Display_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:282:4: this_Subset_5= ruleSubset
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getSubsetParserRuleCall_2_3());
                    			
                    pushFollow(FOLLOW_9);
                    this_Subset_5=ruleSubset();

                    state._fsp--;


                    				current = this_Subset_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:291:4: this_Projection_6= ruleProjection
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getProjectionParserRuleCall_2_4());
                    			
                    pushFollow(FOLLOW_9);
                    this_Projection_6=ruleProjection();

                    state._fsp--;


                    				current = this_Projection_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:300:4: this_Insert_7= ruleInsert
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getInsertParserRuleCall_2_5());
                    			
                    pushFollow(FOLLOW_9);
                    this_Insert_7=ruleInsert();

                    state._fsp--;


                    				current = this_Insert_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:309:4: this_Remove_8= ruleRemove
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getRemoveParserRuleCall_2_6());
                    			
                    pushFollow(FOLLOW_9);
                    this_Remove_8=ruleRemove();

                    state._fsp--;


                    				current = this_Remove_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:318:4: this_Modify_9= ruleModify
                    {

                    				newCompositeNode(grammarAccess.getCommandesAccess().getModifyParserRuleCall_2_7());
                    			
                    pushFollow(FOLLOW_9);
                    this_Modify_9=ruleModify();

                    state._fsp--;


                    				current = this_Modify_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCommandesAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalMyDsl.g:335:1: entryRuleJSonObject returns [EObject current=null] : iv_ruleJSonObject= ruleJSonObject EOF ;
    public final EObject entryRuleJSonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonObject = null;


        try {
            // InternalMyDsl.g:335:51: (iv_ruleJSonObject= ruleJSonObject EOF )
            // InternalMyDsl.g:336:2: iv_ruleJSonObject= ruleJSonObject EOF
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
    // InternalMyDsl.g:342:1: ruleJSonObject returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
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
            // InternalMyDsl.g:348:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalMyDsl.g:349:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalMyDsl.g:349:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            case 42:
                {
                alt6=6;
                }
                break;
            case 43:
                {
                alt6=7;
                }
                break;
            case 44:
                {
                alt6=8;
                }
                break;
            case 45:
                {
                alt6=9;
                }
                break;
            case 46:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:350:3: this_JsonArray_0= ruleJsonArray
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
                    // InternalMyDsl.g:359:3: this_JsonInteger_1= ruleJsonInteger
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
                    // InternalMyDsl.g:368:3: this_JsonBoolean_2= ruleJsonBoolean
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
                    // InternalMyDsl.g:377:3: this_JSonEnum_3= ruleJSonEnum
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
                    // InternalMyDsl.g:386:3: this_JSonString_4= ruleJSonString
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
                    // InternalMyDsl.g:395:3: this_JSonNull_5= ruleJSonNull
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
                    // InternalMyDsl.g:404:3: this_Sum_6= ruleSum
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
                    // InternalMyDsl.g:413:3: this_Div_7= ruleDiv
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
                    // InternalMyDsl.g:422:3: this_Mult_8= ruleMult
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
                    // InternalMyDsl.g:431:3: this_Sub_9= ruleSub
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
    // InternalMyDsl.g:443:1: entryRuleJSonAttribut returns [EObject current=null] : iv_ruleJSonAttribut= ruleJSonAttribut EOF ;
    public final EObject entryRuleJSonAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonAttribut = null;


        try {
            // InternalMyDsl.g:443:53: (iv_ruleJSonAttribut= ruleJSonAttribut EOF )
            // InternalMyDsl.g:444:2: iv_ruleJSonAttribut= ruleJSonAttribut EOF
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
    // InternalMyDsl.g:450:1: ruleJSonAttribut returns [EObject current=null] : (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) ;
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
            // InternalMyDsl.g:456:2: ( (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub ) )
            // InternalMyDsl.g:457:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            {
            // InternalMyDsl.g:457:2: (this_JsonArray_0= ruleJsonArray | this_JsonInteger_1= ruleJsonInteger | this_JsonBoolean_2= ruleJsonBoolean | this_JSonEnum_3= ruleJSonEnum | this_JSonString_4= ruleJSonString | this_JSonNull_5= ruleJSonNull | this_Sum_6= ruleSum | this_Div_7= ruleDiv | this_Mult_8= ruleMult | this_Sub_9= ruleSub )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 41:
                {
                alt7=5;
                }
                break;
            case 42:
                {
                alt7=6;
                }
                break;
            case 43:
                {
                alt7=7;
                }
                break;
            case 44:
                {
                alt7=8;
                }
                break;
            case 45:
                {
                alt7=9;
                }
                break;
            case 46:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:458:3: this_JsonArray_0= ruleJsonArray
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
                    // InternalMyDsl.g:467:3: this_JsonInteger_1= ruleJsonInteger
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
                    // InternalMyDsl.g:476:3: this_JsonBoolean_2= ruleJsonBoolean
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
                    // InternalMyDsl.g:485:3: this_JSonEnum_3= ruleJSonEnum
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
                    // InternalMyDsl.g:494:3: this_JSonString_4= ruleJSonString
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
                    // InternalMyDsl.g:503:3: this_JSonNull_5= ruleJSonNull
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
                    // InternalMyDsl.g:512:3: this_Sum_6= ruleSum
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
                    // InternalMyDsl.g:521:3: this_Div_7= ruleDiv
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
                    // InternalMyDsl.g:530:3: this_Mult_8= ruleMult
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
                    // InternalMyDsl.g:539:3: this_Sub_9= ruleSub
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


    // $ANTLR start "entryRuleJSonEnumField"
    // InternalMyDsl.g:551:1: entryRuleJSonEnumField returns [EObject current=null] : iv_ruleJSonEnumField= ruleJSonEnumField EOF ;
    public final EObject entryRuleJSonEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonEnumField = null;


        try {
            // InternalMyDsl.g:551:54: (iv_ruleJSonEnumField= ruleJSonEnumField EOF )
            // InternalMyDsl.g:552:2: iv_ruleJSonEnumField= ruleJSonEnumField EOF
            {
             newCompositeNode(grammarAccess.getJSonEnumFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonEnumField=ruleJSonEnumField();

            state._fsp--;

             current =iv_ruleJSonEnumField; 
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
    // $ANTLR end "entryRuleJSonEnumField"


    // $ANTLR start "ruleJSonEnumField"
    // InternalMyDsl.g:558:1: ruleJSonEnumField returns [EObject current=null] : (this_JsonInteger_0= ruleJsonInteger | this_JsonBoolean_1= ruleJsonBoolean | this_JSonString_2= ruleJSonString | this_JSonNull_3= ruleJSonNull | this_Sum_4= ruleSum | this_Div_5= ruleDiv | this_Mult_6= ruleMult | this_Sub_7= ruleSub ) ;
    public final EObject ruleJSonEnumField() throws RecognitionException {
        EObject current = null;

        EObject this_JsonInteger_0 = null;

        EObject this_JsonBoolean_1 = null;

        EObject this_JSonString_2 = null;

        EObject this_JSonNull_3 = null;

        EObject this_Sum_4 = null;

        EObject this_Div_5 = null;

        EObject this_Mult_6 = null;

        EObject this_Sub_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:564:2: ( (this_JsonInteger_0= ruleJsonInteger | this_JsonBoolean_1= ruleJsonBoolean | this_JSonString_2= ruleJSonString | this_JSonNull_3= ruleJSonNull | this_Sum_4= ruleSum | this_Div_5= ruleDiv | this_Mult_6= ruleMult | this_Sub_7= ruleSub ) )
            // InternalMyDsl.g:565:2: (this_JsonInteger_0= ruleJsonInteger | this_JsonBoolean_1= ruleJsonBoolean | this_JSonString_2= ruleJSonString | this_JSonNull_3= ruleJSonNull | this_Sum_4= ruleSum | this_Div_5= ruleDiv | this_Mult_6= ruleMult | this_Sub_7= ruleSub )
            {
            // InternalMyDsl.g:565:2: (this_JsonInteger_0= ruleJsonInteger | this_JsonBoolean_1= ruleJsonBoolean | this_JSonString_2= ruleJSonString | this_JSonNull_3= ruleJSonNull | this_Sum_4= ruleSum | this_Div_5= ruleDiv | this_Mult_6= ruleMult | this_Sub_7= ruleSub )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 41:
                {
                alt8=3;
                }
                break;
            case 42:
                {
                alt8=4;
                }
                break;
            case 43:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 45:
                {
                alt8=7;
                }
                break;
            case 46:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:566:3: this_JsonInteger_0= ruleJsonInteger
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getJsonIntegerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonInteger_0=ruleJsonInteger();

                    state._fsp--;


                    			current = this_JsonInteger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:575:3: this_JsonBoolean_1= ruleJsonBoolean
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getJsonBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonBoolean_1=ruleJsonBoolean();

                    state._fsp--;


                    			current = this_JsonBoolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:584:3: this_JSonString_2= ruleJSonString
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getJSonStringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonString_2=ruleJSonString();

                    state._fsp--;


                    			current = this_JSonString_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:593:3: this_JSonNull_3= ruleJSonNull
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getJSonNullParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSonNull_3=ruleJSonNull();

                    state._fsp--;


                    			current = this_JSonNull_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:602:3: this_Sum_4= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getSumParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_4=ruleSum();

                    state._fsp--;


                    			current = this_Sum_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:611:3: this_Div_5= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getDivParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_5=ruleDiv();

                    state._fsp--;


                    			current = this_Div_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:620:3: this_Mult_6= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getMultParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_6=ruleMult();

                    state._fsp--;


                    			current = this_Mult_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:629:3: this_Sub_7= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getJSonEnumFieldAccess().getSubParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_7=ruleSub();

                    state._fsp--;


                    			current = this_Sub_7;
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
    // $ANTLR end "ruleJSonEnumField"


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:641:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:641:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:642:2: iv_ruleStore= ruleStore EOF
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
    // InternalMyDsl.g:648:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'contenu' ( (lv_contenu_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
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
        Token otherlv_8=null;
        Token lv_contenu_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:654:2: ( (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'contenu' ( (lv_contenu_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:655:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'contenu' ( (lv_contenu_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:655:2: (otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'contenu' ( (lv_contenu_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalMyDsl.g:656:3: otherlv_0= 'Store' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'contenu' ( (lv_contenu_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getPathKeyword_2());
            		
            // InternalMyDsl.g:668:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:669:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:669:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:670:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:694:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:695:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:695:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:696:5: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_7=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getContenuKeyword_8());
            		
            // InternalMyDsl.g:720:3: ( (lv_contenu_9_0= RULE_STRING ) )
            // InternalMyDsl.g:721:4: (lv_contenu_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:721:4: (lv_contenu_9_0= RULE_STRING )
            // InternalMyDsl.g:722:5: lv_contenu_9_0= RULE_STRING
            {
            lv_contenu_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_contenu_9_0, grammarAccess.getStoreAccess().getContenuSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"contenu",
            						lv_contenu_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalMyDsl.g:746:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:746:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:747:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalMyDsl.g:753:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:759:2: ( (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:760:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:760:2: (otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:761:3: otherlv_0= 'Load' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'name' ( (lv_name_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getPathKeyword_2());
            		
            // InternalMyDsl.g:773:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:774:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:774:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:775:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getNameKeyword_5());
            		
            // InternalMyDsl.g:799:3: ( (lv_name_6_0= RULE_STRING ) )
            // InternalMyDsl.g:800:4: (lv_name_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:800:4: (lv_name_6_0= RULE_STRING )
            // InternalMyDsl.g:801:5: lv_name_6_0= RULE_STRING
            {
            lv_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:825:1: entryRuleDisplay returns [EObject current=null] : iv_ruleDisplay= ruleDisplay EOF ;
    public final EObject entryRuleDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay = null;


        try {
            // InternalMyDsl.g:825:48: (iv_ruleDisplay= ruleDisplay EOF )
            // InternalMyDsl.g:826:2: iv_ruleDisplay= ruleDisplay EOF
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
    // InternalMyDsl.g:832:1: ruleDisplay returns [EObject current=null] : (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfileName' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:838:2: ( (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfileName' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:839:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfileName' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:839:2: (otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfileName' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalMyDsl.g:840:3: otherlv_0= 'Display' otherlv_1= '{' otherlv_2= 'jsonfileName' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDisplayAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDisplayAccess().getJsonfileNameKeyword_2());
            		
            // InternalMyDsl.g:852:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalMyDsl.g:853:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:853:4: (lv_name_3_0= RULE_STRING )
            // InternalMyDsl.g:854:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDisplayAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDisplayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:878:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalMyDsl.g:878:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalMyDsl.g:879:2: iv_ruleSubset= ruleSubset EOF
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
    // InternalMyDsl.g:885:1: ruleSubset returns [EObject current=null] : (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodenamesub_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keynamesub_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_nodenamesub_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_keynamesub_6_0=null;
        Token otherlv_7=null;
        Token lv_keynamesub_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:891:2: ( (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodenamesub_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keynamesub_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:892:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodenamesub_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keynamesub_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:892:2: (otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodenamesub_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keynamesub_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) ) )* otherlv_9= '}' )
            // InternalMyDsl.g:893:3: otherlv_0= 'Subset' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodenamesub_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keynamesub_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetAccess().getSubsetKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsetAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSubsetAccess().getArrayNameKeyword_2());
            		
            // InternalMyDsl.g:905:3: ( (lv_nodenamesub_3_0= RULE_STRING ) )
            // InternalMyDsl.g:906:4: (lv_nodenamesub_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:906:4: (lv_nodenamesub_3_0= RULE_STRING )
            // InternalMyDsl.g:907:5: lv_nodenamesub_3_0= RULE_STRING
            {
            lv_nodenamesub_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_nodenamesub_3_0, grammarAccess.getSubsetAccess().getNodenamesubSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubsetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodenamesub",
            						lv_nodenamesub_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSubsetAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSubsetAccess().getKeyNameKeyword_5());
            		
            // InternalMyDsl.g:931:3: ( (lv_keynamesub_6_0= RULE_STRING ) )
            // InternalMyDsl.g:932:4: (lv_keynamesub_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:932:4: (lv_keynamesub_6_0= RULE_STRING )
            // InternalMyDsl.g:933:5: lv_keynamesub_6_0= RULE_STRING
            {
            lv_keynamesub_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_keynamesub_6_0, grammarAccess.getSubsetAccess().getKeynamesubSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubsetRule());
            					}
            					addWithLastConsumed(
            						current,
            						"keynamesub",
            						lv_keynamesub_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:949:3: (otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==11) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:950:4: otherlv_7= ',' ( (lv_keynamesub_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,11,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSubsetAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:954:4: ( (lv_keynamesub_8_0= RULE_STRING ) )
            	    // InternalMyDsl.g:955:5: (lv_keynamesub_8_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:955:5: (lv_keynamesub_8_0= RULE_STRING )
            	    // InternalMyDsl.g:956:6: lv_keynamesub_8_0= RULE_STRING
            	    {
            	    lv_keynamesub_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    						newLeafNode(lv_keynamesub_8_0, grammarAccess.getSubsetAccess().getKeynamesubSTRINGTerminalRuleCall_7_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSubsetRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"keynamesub",
            	    							lv_keynamesub_8_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubsetAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMyDsl.g:981:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // InternalMyDsl.g:981:51: (iv_ruleProjection= ruleProjection EOF )
            // InternalMyDsl.g:982:2: iv_ruleProjection= ruleProjection EOF
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
    // InternalMyDsl.g:988:1: ruleProjection returns [EObject current=null] : (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodename_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keyname_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_nodename_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_keyname_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:994:2: ( (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodename_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keyname_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:995:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodename_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keyname_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:995:2: (otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodename_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keyname_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:996:3: otherlv_0= 'Projection' otherlv_1= '{' otherlv_2= 'arrayName' ( (lv_nodename_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'keyName' ( (lv_keyname_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectionAccess().getProjectionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectionAccess().getArrayNameKeyword_2());
            		
            // InternalMyDsl.g:1008:3: ( (lv_nodename_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1009:4: (lv_nodename_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1009:4: (lv_nodename_3_0= RULE_STRING )
            // InternalMyDsl.g:1010:5: lv_nodename_3_0= RULE_STRING
            {
            lv_nodename_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_nodename_3_0, grammarAccess.getProjectionAccess().getNodenameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodename",
            						lv_nodename_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getKeyNameKeyword_5());
            		
            // InternalMyDsl.g:1034:3: ( (lv_keyname_6_0= RULE_STRING ) )
            // InternalMyDsl.g:1035:4: (lv_keyname_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:1035:4: (lv_keyname_6_0= RULE_STRING )
            // InternalMyDsl.g:1036:5: lv_keyname_6_0= RULE_STRING
            {
            lv_keyname_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_keyname_6_0, grammarAccess.getProjectionAccess().getKeynameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"keyname",
            						lv_keyname_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:1060:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalMyDsl.g:1060:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalMyDsl.g:1061:2: iv_ruleInsert= ruleInsert EOF
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
    // InternalMyDsl.g:1067:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObject' ( (lv_nameObject_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_targetNode_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_nameObject_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1073:2: ( (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObject' ( (lv_nameObject_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1074:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObject' ( (lv_nameObject_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1074:2: (otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObject' ( (lv_nameObject_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1075:3: otherlv_0= 'Insert' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObject' ( (lv_nameObject_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getTargetNodeKeyword_2());
            		
            // InternalMyDsl.g:1087:3: ( (lv_targetNode_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1088:4: (lv_targetNode_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1088:4: (lv_targetNode_3_0= RULE_STRING )
            // InternalMyDsl.g:1089:5: lv_targetNode_3_0= RULE_STRING
            {
            lv_targetNode_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_targetNode_3_0, grammarAccess.getInsertAccess().getTargetNodeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetNode",
            						lv_targetNode_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertAccess().getNameObjectKeyword_5());
            		
            // InternalMyDsl.g:1113:3: ( (lv_nameObject_6_0= RULE_STRING ) )
            // InternalMyDsl.g:1114:4: (lv_nameObject_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:1114:4: (lv_nameObject_6_0= RULE_STRING )
            // InternalMyDsl.g:1115:5: lv_nameObject_6_0= RULE_STRING
            {
            lv_nameObject_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_nameObject_6_0, grammarAccess.getInsertAccess().getNameObjectSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameObject",
            						lv_nameObject_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInsertAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:1139:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalMyDsl.g:1139:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalMyDsl.g:1140:2: iv_ruleRemove= ruleRemove EOF
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
    // InternalMyDsl.g:1146:1: ruleRemove returns [EObject current=null] : (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_targetNode_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_nameObjectRemove_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1152:2: ( (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1153:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1153:2: (otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1154:3: otherlv_0= 'Remove' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getTargetNodeKeyword_2());
            		
            // InternalMyDsl.g:1166:3: ( (lv_targetNode_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1167:4: (lv_targetNode_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1167:4: (lv_targetNode_3_0= RULE_STRING )
            // InternalMyDsl.g:1168:5: lv_targetNode_3_0= RULE_STRING
            {
            lv_targetNode_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_targetNode_3_0, grammarAccess.getRemoveAccess().getTargetNodeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetNode",
            						lv_targetNode_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getRemoveAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getNameObjectRemoveKeyword_5());
            		
            // InternalMyDsl.g:1192:3: ( (lv_nameObjectRemove_6_0= RULE_STRING ) )
            // InternalMyDsl.g:1193:4: (lv_nameObjectRemove_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:1193:4: (lv_nameObjectRemove_6_0= RULE_STRING )
            // InternalMyDsl.g:1194:5: lv_nameObjectRemove_6_0= RULE_STRING
            {
            lv_nameObjectRemove_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_nameObjectRemove_6_0, grammarAccess.getRemoveAccess().getNameObjectRemoveSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameObjectRemove",
            						lv_nameObjectRemove_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:1218:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalMyDsl.g:1218:47: (iv_ruleModify= ruleModify EOF )
            // InternalMyDsl.g:1219:2: iv_ruleModify= ruleModify EOF
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
    // InternalMyDsl.g:1225:1: ruleModify returns [EObject current=null] : (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'nameObject' ( (lv_nameObject_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_targetNode_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_nameObjectRemove_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_nameObject_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1231:2: ( (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'nameObject' ( (lv_nameObject_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1232:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'nameObject' ( (lv_nameObject_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1232:2: (otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'nameObject' ( (lv_nameObject_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1233:3: otherlv_0= 'Modify' otherlv_1= '{' otherlv_2= 'targetNode' ( (lv_targetNode_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'nameObjectRemove' ( (lv_nameObjectRemove_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= 'nameObject' ( (lv_nameObject_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getModifyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModifyAccess().getTargetNodeKeyword_2());
            		
            // InternalMyDsl.g:1245:3: ( (lv_targetNode_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1246:4: (lv_targetNode_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1246:4: (lv_targetNode_3_0= RULE_STRING )
            // InternalMyDsl.g:1247:5: lv_targetNode_3_0= RULE_STRING
            {
            lv_targetNode_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_targetNode_3_0, grammarAccess.getModifyAccess().getTargetNodeSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModifyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetNode",
            						lv_targetNode_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getModifyAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getModifyAccess().getNameObjectRemoveKeyword_5());
            		
            // InternalMyDsl.g:1271:3: ( (lv_nameObjectRemove_6_0= RULE_STRING ) )
            // InternalMyDsl.g:1272:4: (lv_nameObjectRemove_6_0= RULE_STRING )
            {
            // InternalMyDsl.g:1272:4: (lv_nameObjectRemove_6_0= RULE_STRING )
            // InternalMyDsl.g:1273:5: lv_nameObjectRemove_6_0= RULE_STRING
            {
            lv_nameObjectRemove_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_nameObjectRemove_6_0, grammarAccess.getModifyAccess().getNameObjectRemoveSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModifyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameObjectRemove",
            						lv_nameObjectRemove_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getModifyAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getModifyAccess().getNameObjectKeyword_8());
            		
            // InternalMyDsl.g:1297:3: ( (lv_nameObject_9_0= RULE_STRING ) )
            // InternalMyDsl.g:1298:4: (lv_nameObject_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:1298:4: (lv_nameObject_9_0= RULE_STRING )
            // InternalMyDsl.g:1299:5: lv_nameObject_9_0= RULE_STRING
            {
            lv_nameObject_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_nameObject_9_0, grammarAccess.getModifyAccess().getNameObjectSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModifyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nameObject",
            						lv_nameObject_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModifyAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalMyDsl.g:1323:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // InternalMyDsl.g:1323:50: (iv_ruleJsonArray= ruleJsonArray EOF )
            // InternalMyDsl.g:1324:2: iv_ruleJsonArray= ruleJsonArray EOF
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
    // InternalMyDsl.g:1330:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:1336:2: ( (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:1337:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:1337:2: (otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}' )
            // InternalMyDsl.g:1338:3: otherlv_0= 'JSonArray' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_Contient_3_0= ruleJSonAttribut ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getJSonArrayKeyword_0());
            		
            // InternalMyDsl.g:1342:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1343:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1343:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1344:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1364:3: ( (lv_Contient_3_0= ruleJSonAttribut ) )
            // InternalMyDsl.g:1365:4: (lv_Contient_3_0= ruleJSonAttribut )
            {
            // InternalMyDsl.g:1365:4: (lv_Contient_3_0= ruleJSonAttribut )
            // InternalMyDsl.g:1366:5: lv_Contient_3_0= ruleJSonAttribut
            {

            					newCompositeNode(grammarAccess.getJsonArrayAccess().getContientJSonAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1383:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==11) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1384:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1388:4: ( (lv_Contient_5_0= ruleJSonAttribut ) )
            	    // InternalMyDsl.g:1389:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    {
            	    // InternalMyDsl.g:1389:5: (lv_Contient_5_0= ruleJSonAttribut )
            	    // InternalMyDsl.g:1390:6: lv_Contient_5_0= ruleJSonAttribut
            	    {

            	    						newCompositeNode(grammarAccess.getJsonArrayAccess().getContientJSonAttributParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMyDsl.g:1416:1: entryRuleJSonEnum returns [EObject current=null] : iv_ruleJSonEnum= ruleJSonEnum EOF ;
    public final EObject entryRuleJSonEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonEnum = null;


        try {
            // InternalMyDsl.g:1416:49: (iv_ruleJSonEnum= ruleJSonEnum EOF )
            // InternalMyDsl.g:1417:2: iv_ruleJSonEnum= ruleJSonEnum EOF
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
    // InternalMyDsl.g:1423:1: ruleJSonEnum returns [EObject current=null] : (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonEnumField ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1429:2: ( (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonEnumField ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1430:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonEnumField ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1430:2: (otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonEnumField ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1431:3: otherlv_0= 'JSonEnum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_Contient_3_0= ruleJSonEnumField ) ) (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonEnumAccess().getJSonEnumKeyword_0());
            		
            // InternalMyDsl.g:1435:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1436:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1436:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1437:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getJSonEnumAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1457:3: ( (lv_Contient_3_0= ruleJSonEnumField ) )
            // InternalMyDsl.g:1458:4: (lv_Contient_3_0= ruleJSonEnumField )
            {
            // InternalMyDsl.g:1458:4: (lv_Contient_3_0= ruleJSonEnumField )
            // InternalMyDsl.g:1459:5: lv_Contient_3_0= ruleJSonEnumField
            {

            					newCompositeNode(grammarAccess.getJSonEnumAccess().getContientJSonEnumFieldParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_Contient_3_0=ruleJSonEnumField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSonEnumRule());
            					}
            					add(
            						current,
            						"Contient",
            						lv_Contient_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonEnumField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1476:3: (otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1477:4: otherlv_4= ',' ( (lv_Contient_5_0= ruleJSonEnumField ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getJSonEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1481:4: ( (lv_Contient_5_0= ruleJSonEnumField ) )
            	    // InternalMyDsl.g:1482:5: (lv_Contient_5_0= ruleJSonEnumField )
            	    {
            	    // InternalMyDsl.g:1482:5: (lv_Contient_5_0= ruleJSonEnumField )
            	    // InternalMyDsl.g:1483:6: lv_Contient_5_0= ruleJSonEnumField
            	    {

            	    						newCompositeNode(grammarAccess.getJSonEnumAccess().getContientJSonEnumFieldParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_Contient_5_0=ruleJSonEnumField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJSonEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Contient",
            	    							lv_Contient_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonEnumField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:1509:1: entryRuleJsonInteger returns [EObject current=null] : iv_ruleJsonInteger= ruleJsonInteger EOF ;
    public final EObject entryRuleJsonInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonInteger = null;


        try {
            // InternalMyDsl.g:1509:52: (iv_ruleJsonInteger= ruleJsonInteger EOF )
            // InternalMyDsl.g:1510:2: iv_ruleJsonInteger= ruleJsonInteger EOF
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
    // InternalMyDsl.g:1516:1: ruleJsonInteger returns [EObject current=null] : (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleJsonInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1522:2: ( (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1523:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1523:2: (otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:1524:3: otherlv_0= 'Integer' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonIntegerAccess().getIntegerKeyword_0());
            		
            // InternalMyDsl.g:1528:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1529:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1529:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1530:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalMyDsl.g:1546:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalMyDsl.g:1547:4: (lv_value_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1547:4: (lv_value_2_0= RULE_INT )
            // InternalMyDsl.g:1548:5: lv_value_2_0= RULE_INT
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
    // InternalMyDsl.g:1568:1: entryRuleJsonBoolean returns [EObject current=null] : iv_ruleJsonBoolean= ruleJsonBoolean EOF ;
    public final EObject entryRuleJsonBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonBoolean = null;


        try {
            // InternalMyDsl.g:1568:52: (iv_ruleJsonBoolean= ruleJsonBoolean EOF )
            // InternalMyDsl.g:1569:2: iv_ruleJsonBoolean= ruleJsonBoolean EOF
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
    // InternalMyDsl.g:1575:1: ruleJsonBoolean returns [EObject current=null] : (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) ;
    public final EObject ruleJsonBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1581:2: ( (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) ) )
            // InternalMyDsl.g:1582:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            {
            // InternalMyDsl.g:1582:2: (otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) ) )
            // InternalMyDsl.g:1583:3: otherlv_0= 'Boolean' ( (lv_name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonBooleanAccess().getBooleanKeyword_0());
            		
            // InternalMyDsl.g:1587:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1588:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1588:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1589:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            // InternalMyDsl.g:1605:3: ( ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) ) )
            // InternalMyDsl.g:1606:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            {
            // InternalMyDsl.g:1606:4: ( (lv_value_2_1= 'true' | lv_value_2_2= 'false' ) )
            // InternalMyDsl.g:1607:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            {
            // InternalMyDsl.g:1607:5: (lv_value_2_1= 'true' | lv_value_2_2= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1608:6: lv_value_2_1= 'true'
                    {
                    lv_value_2_1=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getJsonBooleanAccess().getValueTrueKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJsonBooleanRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1619:6: lv_value_2_2= 'false'
                    {
                    lv_value_2_2=(Token)match(input,40,FOLLOW_2); 

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
    // InternalMyDsl.g:1636:1: entryRuleJSonString returns [EObject current=null] : iv_ruleJSonString= ruleJSonString EOF ;
    public final EObject entryRuleJSonString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonString = null;


        try {
            // InternalMyDsl.g:1636:51: (iv_ruleJSonString= ruleJSonString EOF )
            // InternalMyDsl.g:1637:2: iv_ruleJSonString= ruleJSonString EOF
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
    // InternalMyDsl.g:1643:1: ruleJSonString returns [EObject current=null] : (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1649:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1650:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1650:2: (otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1651:3: otherlv_0= 'String' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonStringAccess().getStringKeyword_0());
            		
            // InternalMyDsl.g:1655:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1656:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1656:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1657:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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

            // InternalMyDsl.g:1673:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1674:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1674:4: (lv_value_2_0= RULE_STRING )
            // InternalMyDsl.g:1675:5: lv_value_2_0= RULE_STRING
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
    // InternalMyDsl.g:1695:1: entryRuleJSonNull returns [EObject current=null] : iv_ruleJSonNull= ruleJSonNull EOF ;
    public final EObject entryRuleJSonNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonNull = null;


        try {
            // InternalMyDsl.g:1695:49: (iv_ruleJSonNull= ruleJSonNull EOF )
            // InternalMyDsl.g:1696:2: iv_ruleJSonNull= ruleJSonNull EOF
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
    // InternalMyDsl.g:1702:1: ruleJSonNull returns [EObject current=null] : (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleJSonNull() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1708:2: ( (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1709:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1709:2: (otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1710:3: otherlv_0= 'Null' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getJSonNullAccess().getNullKeyword_0());
            		
            // InternalMyDsl.g:1714:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1715:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1715:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1716:5: lv_name_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleJSonOperator"
    // InternalMyDsl.g:1736:1: entryRuleJSonOperator returns [EObject current=null] : iv_ruleJSonOperator= ruleJSonOperator EOF ;
    public final EObject entryRuleJSonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSonOperator = null;


        try {
            // InternalMyDsl.g:1736:53: (iv_ruleJSonOperator= ruleJSonOperator EOF )
            // InternalMyDsl.g:1737:2: iv_ruleJSonOperator= ruleJSonOperator EOF
            {
             newCompositeNode(grammarAccess.getJSonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSonOperator=ruleJSonOperator();

            state._fsp--;

             current =iv_ruleJSonOperator; 
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
    // $ANTLR end "entryRuleJSonOperator"


    // $ANTLR start "ruleJSonOperator"
    // InternalMyDsl.g:1743:1: ruleJSonOperator returns [EObject current=null] : (this_JsonInteger_0= ruleJsonInteger | this_Sum_1= ruleSum | this_Div_2= ruleDiv | this_Mult_3= ruleMult | this_Sub_4= ruleSub ) ;
    public final EObject ruleJSonOperator() throws RecognitionException {
        EObject current = null;

        EObject this_JsonInteger_0 = null;

        EObject this_Sum_1 = null;

        EObject this_Div_2 = null;

        EObject this_Mult_3 = null;

        EObject this_Sub_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1749:2: ( (this_JsonInteger_0= ruleJsonInteger | this_Sum_1= ruleSum | this_Div_2= ruleDiv | this_Mult_3= ruleMult | this_Sub_4= ruleSub ) )
            // InternalMyDsl.g:1750:2: (this_JsonInteger_0= ruleJsonInteger | this_Sum_1= ruleSum | this_Div_2= ruleDiv | this_Mult_3= ruleMult | this_Sub_4= ruleSub )
            {
            // InternalMyDsl.g:1750:2: (this_JsonInteger_0= ruleJsonInteger | this_Sum_1= ruleSum | this_Div_2= ruleDiv | this_Mult_3= ruleMult | this_Sub_4= ruleSub )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 45:
                {
                alt13=4;
                }
                break;
            case 46:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1751:3: this_JsonInteger_0= ruleJsonInteger
                    {

                    			newCompositeNode(grammarAccess.getJSonOperatorAccess().getJsonIntegerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonInteger_0=ruleJsonInteger();

                    state._fsp--;


                    			current = this_JsonInteger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1760:3: this_Sum_1= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getJSonOperatorAccess().getSumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_1=ruleSum();

                    state._fsp--;


                    			current = this_Sum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1769:3: this_Div_2= ruleDiv
                    {

                    			newCompositeNode(grammarAccess.getJSonOperatorAccess().getDivParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Div_2=ruleDiv();

                    state._fsp--;


                    			current = this_Div_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1778:3: this_Mult_3= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getJSonOperatorAccess().getMultParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_3=ruleMult();

                    state._fsp--;


                    			current = this_Mult_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1787:3: this_Sub_4= ruleSub
                    {

                    			newCompositeNode(grammarAccess.getJSonOperatorAccess().getSubParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sub_4=ruleSub();

                    state._fsp--;


                    			current = this_Sub_4;
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
    // $ANTLR end "ruleJSonOperator"


    // $ANTLR start "entryRuleSum"
    // InternalMyDsl.g:1799:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalMyDsl.g:1799:44: (iv_ruleSum= ruleSum EOF )
            // InternalMyDsl.g:1800:2: iv_ruleSum= ruleSum EOF
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
    // InternalMyDsl.g:1806:1: ruleSum returns [EObject current=null] : (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1812:2: ( (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1813:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1813:2: (otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1814:3: otherlv_0= 'Sum' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalMyDsl.g:1818:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1819:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1819:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1820:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSumAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1840:3: ( (lv_listInterger_3_0= ruleJSonOperator ) )
            // InternalMyDsl.g:1841:4: (lv_listInterger_3_0= ruleJSonOperator )
            {
            // InternalMyDsl.g:1841:4: (lv_listInterger_3_0= ruleJSonOperator )
            // InternalMyDsl.g:1842:5: lv_listInterger_3_0= ruleJSonOperator
            {

            					newCompositeNode(grammarAccess.getSumAccess().getListIntergerJSonOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_listInterger_3_0=ruleJSonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1859:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==11) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1860:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1864:4: ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    // InternalMyDsl.g:1865:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    {
            	    // InternalMyDsl.g:1865:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    // InternalMyDsl.g:1866:6: lv_listInterger_5_0= ruleJSonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getListIntergerJSonOperatorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_listInterger_5_0=ruleJSonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:1892:1: entryRuleDiv returns [EObject current=null] : iv_ruleDiv= ruleDiv EOF ;
    public final EObject entryRuleDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiv = null;


        try {
            // InternalMyDsl.g:1892:44: (iv_ruleDiv= ruleDiv EOF )
            // InternalMyDsl.g:1893:2: iv_ruleDiv= ruleDiv EOF
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
    // InternalMyDsl.g:1899:1: ruleDiv returns [EObject current=null] : (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1905:2: ( (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1906:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1906:2: (otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:1907:3: otherlv_0= 'Div' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDivAccess().getDivKeyword_0());
            		
            // InternalMyDsl.g:1911:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1912:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1912:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:1913:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDivAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:1933:3: ( (lv_listInterger_3_0= ruleJSonOperator ) )
            // InternalMyDsl.g:1934:4: (lv_listInterger_3_0= ruleJSonOperator )
            {
            // InternalMyDsl.g:1934:4: (lv_listInterger_3_0= ruleJSonOperator )
            // InternalMyDsl.g:1935:5: lv_listInterger_3_0= ruleJSonOperator
            {

            					newCompositeNode(grammarAccess.getDivAccess().getListIntergerJSonOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_listInterger_3_0=ruleJSonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1952:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1953:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDivAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1957:4: ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    // InternalMyDsl.g:1958:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    {
            	    // InternalMyDsl.g:1958:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    // InternalMyDsl.g:1959:6: lv_listInterger_5_0= ruleJSonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getDivAccess().getListIntergerJSonOperatorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_listInterger_5_0=ruleJSonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:1985:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalMyDsl.g:1985:45: (iv_ruleMult= ruleMult EOF )
            // InternalMyDsl.g:1986:2: iv_ruleMult= ruleMult EOF
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
    // InternalMyDsl.g:1992:1: ruleMult returns [EObject current=null] : (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:1998:2: ( (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:1999:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:1999:2: (otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:2000:3: otherlv_0= 'Mult' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
            		
            // InternalMyDsl.g:2004:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:2005:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:2005:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:2006:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMultAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:2026:3: ( (lv_listInterger_3_0= ruleJSonOperator ) )
            // InternalMyDsl.g:2027:4: (lv_listInterger_3_0= ruleJSonOperator )
            {
            // InternalMyDsl.g:2027:4: (lv_listInterger_3_0= ruleJSonOperator )
            // InternalMyDsl.g:2028:5: lv_listInterger_3_0= ruleJSonOperator
            {

            					newCompositeNode(grammarAccess.getMultAccess().getListIntergerJSonOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_listInterger_3_0=ruleJSonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2045:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2046:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMultAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:2050:4: ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    // InternalMyDsl.g:2051:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    {
            	    // InternalMyDsl.g:2051:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    // InternalMyDsl.g:2052:6: lv_listInterger_5_0= ruleJSonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMultAccess().getListIntergerJSonOperatorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_listInterger_5_0=ruleJSonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMyDsl.g:2078:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // InternalMyDsl.g:2078:44: (iv_ruleSub= ruleSub EOF )
            // InternalMyDsl.g:2079:2: iv_ruleSub= ruleSub EOF
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
    // InternalMyDsl.g:2085:1: ruleSub returns [EObject current=null] : (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) ;
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
            // InternalMyDsl.g:2091:2: ( (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' ) )
            // InternalMyDsl.g:2092:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            {
            // InternalMyDsl.g:2092:2: (otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']' )
            // InternalMyDsl.g:2093:3: otherlv_0= 'Sub' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_listInterger_3_0= ruleJSonOperator ) ) (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
            		
            // InternalMyDsl.g:2097:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:2098:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:2098:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:2099:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSubAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:2119:3: ( (lv_listInterger_3_0= ruleJSonOperator ) )
            // InternalMyDsl.g:2120:4: (lv_listInterger_3_0= ruleJSonOperator )
            {
            // InternalMyDsl.g:2120:4: (lv_listInterger_3_0= ruleJSonOperator )
            // InternalMyDsl.g:2121:5: lv_listInterger_3_0= ruleJSonOperator
            {

            					newCompositeNode(grammarAccess.getSubAccess().getListIntergerJSonOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_listInterger_3_0=ruleJSonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRule());
            					}
            					add(
            						current,
            						"listInterger",
            						lv_listInterger_3_0,
            						"org.xtext.example.mydsl.MyDsl.JSonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2138:3: (otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==11) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2139:4: otherlv_4= ',' ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    {
            	    otherlv_4=(Token)match(input,11,FOLLOW_21); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSubAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:2143:4: ( (lv_listInterger_5_0= ruleJSonOperator ) )
            	    // InternalMyDsl.g:2144:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    {
            	    // InternalMyDsl.g:2144:5: (lv_listInterger_5_0= ruleJSonOperator )
            	    // InternalMyDsl.g:2145:6: lv_listInterger_5_0= ruleJSonOperator
            	    {

            	    						newCompositeNode(grammarAccess.getSubAccess().getListIntergerJSonOperatorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_listInterger_5_0=ruleJSonOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listInterger",
            	    							lv_listInterger_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.JSonOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,36,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00007E6600004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000014CB10000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00007E6600000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018000000000L});

}