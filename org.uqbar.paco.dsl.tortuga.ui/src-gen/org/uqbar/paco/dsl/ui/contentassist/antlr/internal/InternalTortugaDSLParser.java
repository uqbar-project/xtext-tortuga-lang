package org.uqbar.paco.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.uqbar.paco.dsl.services.TortugaDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTortugaDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK GRAY'", "'GRAY'", "'GREEN'", "'LIGHTGRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'FORWARD'", "'LEFT'", "'RIGHT'", "'SETX'", "'SETY'", "'PENDOWN'", "'PENUP'", "'PENCOLOR'", "'CANVASCOLOR'", "'FONTSIZE'", "'FONTSTYLE'", "'BOLD'", "'ITALIC'", "'PLAIN'", "'CLEAR'", "'HOME'", "'DRAWSTRING'", "'MAKE'", "'='", "'CONTENT'", "'SUM'", "'+'", "'SUBTRACT'", "'-'", "'MULTIPLY'", "'*'", "'DIVIDE'", "'/'", "'REPEAT'", "'END REPEAT'", "'TO'", "'END TO'", "':'", "'IF'", "'END IF'", "'>'", "'<'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalTortugaDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTortugaDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTortugaDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g"; }


     
     	private TortugaDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TortugaDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTortugaProgram"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:60:1: entryRuleTortugaProgram : ruleTortugaProgram EOF ;
    public final void entryRuleTortugaProgram() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:61:1: ( ruleTortugaProgram EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:62:1: ruleTortugaProgram EOF
            {
             before(grammarAccess.getTortugaProgramRule()); 
            pushFollow(FOLLOW_ruleTortugaProgram_in_entryRuleTortugaProgram61);
            ruleTortugaProgram();

            state._fsp--;

             after(grammarAccess.getTortugaProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTortugaProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTortugaProgram"


    // $ANTLR start "ruleTortugaProgram"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:69:1: ruleTortugaProgram : ( ( rule__TortugaProgram__SentencesAssignment )* ) ;
    public final void ruleTortugaProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:73:2: ( ( ( rule__TortugaProgram__SentencesAssignment )* ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:74:1: ( ( rule__TortugaProgram__SentencesAssignment )* )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:74:1: ( ( rule__TortugaProgram__SentencesAssignment )* )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:75:1: ( rule__TortugaProgram__SentencesAssignment )*
            {
             before(grammarAccess.getTortugaProgramAccess().getSentencesAssignment()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:76:1: ( rule__TortugaProgram__SentencesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=25 && LA1_0<=35)||(LA1_0>=39 && LA1_0<=42)||(LA1_0>=44 && LA1_0<=45)||LA1_0==47||LA1_0==49||LA1_0==51||LA1_0==53||LA1_0==55||LA1_0==58) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:76:2: rule__TortugaProgram__SentencesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TortugaProgram__SentencesAssignment_in_ruleTortugaProgram94);
            	    rule__TortugaProgram__SentencesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTortugaProgramAccess().getSentencesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTortugaProgram"


    // $ANTLR start "entryRuleSENTENCE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:88:1: entryRuleSENTENCE : ruleSENTENCE EOF ;
    public final void entryRuleSENTENCE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:89:1: ( ruleSENTENCE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:90:1: ruleSENTENCE EOF
            {
             before(grammarAccess.getSENTENCERule()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_entryRuleSENTENCE122);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getSENTENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSENTENCE129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSENTENCE"


    // $ANTLR start "ruleSENTENCE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:97:1: ruleSENTENCE : ( ( rule__SENTENCE__Alternatives ) ) ;
    public final void ruleSENTENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:101:2: ( ( ( rule__SENTENCE__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:102:1: ( ( rule__SENTENCE__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:102:1: ( ( rule__SENTENCE__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:103:1: ( rule__SENTENCE__Alternatives )
            {
             before(grammarAccess.getSENTENCEAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:104:1: ( rule__SENTENCE__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:104:2: rule__SENTENCE__Alternatives
            {
            pushFollow(FOLLOW_rule__SENTENCE__Alternatives_in_ruleSENTENCE155);
            rule__SENTENCE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSENTENCEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSENTENCE"


    // $ANTLR start "entryRuleMOVE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:116:1: entryRuleMOVE : ruleMOVE EOF ;
    public final void entryRuleMOVE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:117:1: ( ruleMOVE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:118:1: ruleMOVE EOF
            {
             before(grammarAccess.getMOVERule()); 
            pushFollow(FOLLOW_ruleMOVE_in_entryRuleMOVE182);
            ruleMOVE();

            state._fsp--;

             after(grammarAccess.getMOVERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOVE189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMOVE"


    // $ANTLR start "ruleMOVE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:125:1: ruleMOVE : ( ( rule__MOVE__Alternatives ) ) ;
    public final void ruleMOVE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:129:2: ( ( ( rule__MOVE__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:130:1: ( ( rule__MOVE__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:130:1: ( ( rule__MOVE__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:131:1: ( rule__MOVE__Alternatives )
            {
             before(grammarAccess.getMOVEAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:132:1: ( rule__MOVE__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:132:2: rule__MOVE__Alternatives
            {
            pushFollow(FOLLOW_rule__MOVE__Alternatives_in_ruleMOVE215);
            rule__MOVE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMOVEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMOVE"


    // $ANTLR start "entryRuleFORWARD"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:144:1: entryRuleFORWARD : ruleFORWARD EOF ;
    public final void entryRuleFORWARD() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:145:1: ( ruleFORWARD EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:146:1: ruleFORWARD EOF
            {
             before(grammarAccess.getFORWARDRule()); 
            pushFollow(FOLLOW_ruleFORWARD_in_entryRuleFORWARD242);
            ruleFORWARD();

            state._fsp--;

             after(grammarAccess.getFORWARDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFORWARD249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFORWARD"


    // $ANTLR start "ruleFORWARD"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:153:1: ruleFORWARD : ( ( rule__FORWARD__Group__0 ) ) ;
    public final void ruleFORWARD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:157:2: ( ( ( rule__FORWARD__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:158:1: ( ( rule__FORWARD__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:158:1: ( ( rule__FORWARD__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:159:1: ( rule__FORWARD__Group__0 )
            {
             before(grammarAccess.getFORWARDAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:160:1: ( rule__FORWARD__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:160:2: rule__FORWARD__Group__0
            {
            pushFollow(FOLLOW_rule__FORWARD__Group__0_in_ruleFORWARD275);
            rule__FORWARD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFORWARDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFORWARD"


    // $ANTLR start "entryRuleLEFT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:172:1: entryRuleLEFT : ruleLEFT EOF ;
    public final void entryRuleLEFT() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:173:1: ( ruleLEFT EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:174:1: ruleLEFT EOF
            {
             before(grammarAccess.getLEFTRule()); 
            pushFollow(FOLLOW_ruleLEFT_in_entryRuleLEFT302);
            ruleLEFT();

            state._fsp--;

             after(grammarAccess.getLEFTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLEFT309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLEFT"


    // $ANTLR start "ruleLEFT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:181:1: ruleLEFT : ( ( rule__LEFT__Group__0 ) ) ;
    public final void ruleLEFT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:185:2: ( ( ( rule__LEFT__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:186:1: ( ( rule__LEFT__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:186:1: ( ( rule__LEFT__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:187:1: ( rule__LEFT__Group__0 )
            {
             before(grammarAccess.getLEFTAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:188:1: ( rule__LEFT__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:188:2: rule__LEFT__Group__0
            {
            pushFollow(FOLLOW_rule__LEFT__Group__0_in_ruleLEFT335);
            rule__LEFT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLEFTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLEFT"


    // $ANTLR start "entryRuleRIGHT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:200:1: entryRuleRIGHT : ruleRIGHT EOF ;
    public final void entryRuleRIGHT() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:201:1: ( ruleRIGHT EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:202:1: ruleRIGHT EOF
            {
             before(grammarAccess.getRIGHTRule()); 
            pushFollow(FOLLOW_ruleRIGHT_in_entryRuleRIGHT362);
            ruleRIGHT();

            state._fsp--;

             after(grammarAccess.getRIGHTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRIGHT369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRIGHT"


    // $ANTLR start "ruleRIGHT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:209:1: ruleRIGHT : ( ( rule__RIGHT__Group__0 ) ) ;
    public final void ruleRIGHT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:213:2: ( ( ( rule__RIGHT__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:214:1: ( ( rule__RIGHT__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:214:1: ( ( rule__RIGHT__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:215:1: ( rule__RIGHT__Group__0 )
            {
             before(grammarAccess.getRIGHTAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:216:1: ( rule__RIGHT__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:216:2: rule__RIGHT__Group__0
            {
            pushFollow(FOLLOW_rule__RIGHT__Group__0_in_ruleRIGHT395);
            rule__RIGHT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRIGHTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRIGHT"


    // $ANTLR start "entryRuleSET_X"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:228:1: entryRuleSET_X : ruleSET_X EOF ;
    public final void entryRuleSET_X() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:229:1: ( ruleSET_X EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:230:1: ruleSET_X EOF
            {
             before(grammarAccess.getSET_XRule()); 
            pushFollow(FOLLOW_ruleSET_X_in_entryRuleSET_X422);
            ruleSET_X();

            state._fsp--;

             after(grammarAccess.getSET_XRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSET_X429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSET_X"


    // $ANTLR start "ruleSET_X"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:237:1: ruleSET_X : ( ( rule__SET_X__Group__0 ) ) ;
    public final void ruleSET_X() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:241:2: ( ( ( rule__SET_X__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:242:1: ( ( rule__SET_X__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:242:1: ( ( rule__SET_X__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:243:1: ( rule__SET_X__Group__0 )
            {
             before(grammarAccess.getSET_XAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:244:1: ( rule__SET_X__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:244:2: rule__SET_X__Group__0
            {
            pushFollow(FOLLOW_rule__SET_X__Group__0_in_ruleSET_X455);
            rule__SET_X__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSET_XAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSET_X"


    // $ANTLR start "entryRuleSET_Y"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:256:1: entryRuleSET_Y : ruleSET_Y EOF ;
    public final void entryRuleSET_Y() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:257:1: ( ruleSET_Y EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:258:1: ruleSET_Y EOF
            {
             before(grammarAccess.getSET_YRule()); 
            pushFollow(FOLLOW_ruleSET_Y_in_entryRuleSET_Y482);
            ruleSET_Y();

            state._fsp--;

             after(grammarAccess.getSET_YRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSET_Y489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSET_Y"


    // $ANTLR start "ruleSET_Y"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:265:1: ruleSET_Y : ( ( rule__SET_Y__Group__0 ) ) ;
    public final void ruleSET_Y() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:269:2: ( ( ( rule__SET_Y__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:270:1: ( ( rule__SET_Y__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:270:1: ( ( rule__SET_Y__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:271:1: ( rule__SET_Y__Group__0 )
            {
             before(grammarAccess.getSET_YAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:272:1: ( rule__SET_Y__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:272:2: rule__SET_Y__Group__0
            {
            pushFollow(FOLLOW_rule__SET_Y__Group__0_in_ruleSET_Y515);
            rule__SET_Y__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSET_YAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSET_Y"


    // $ANTLR start "entryRuleDRAWING_SENTENCE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:284:1: entryRuleDRAWING_SENTENCE : ruleDRAWING_SENTENCE EOF ;
    public final void entryRuleDRAWING_SENTENCE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:285:1: ( ruleDRAWING_SENTENCE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:286:1: ruleDRAWING_SENTENCE EOF
            {
             before(grammarAccess.getDRAWING_SENTENCERule()); 
            pushFollow(FOLLOW_ruleDRAWING_SENTENCE_in_entryRuleDRAWING_SENTENCE542);
            ruleDRAWING_SENTENCE();

            state._fsp--;

             after(grammarAccess.getDRAWING_SENTENCERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDRAWING_SENTENCE549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDRAWING_SENTENCE"


    // $ANTLR start "ruleDRAWING_SENTENCE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:293:1: ruleDRAWING_SENTENCE : ( ( rule__DRAWING_SENTENCE__Alternatives ) ) ;
    public final void ruleDRAWING_SENTENCE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:297:2: ( ( ( rule__DRAWING_SENTENCE__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:298:1: ( ( rule__DRAWING_SENTENCE__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:298:1: ( ( rule__DRAWING_SENTENCE__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:299:1: ( rule__DRAWING_SENTENCE__Alternatives )
            {
             before(grammarAccess.getDRAWING_SENTENCEAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:300:1: ( rule__DRAWING_SENTENCE__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:300:2: rule__DRAWING_SENTENCE__Alternatives
            {
            pushFollow(FOLLOW_rule__DRAWING_SENTENCE__Alternatives_in_ruleDRAWING_SENTENCE575);
            rule__DRAWING_SENTENCE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDRAWING_SENTENCEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDRAWING_SENTENCE"


    // $ANTLR start "entryRulePENDOWN"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:312:1: entryRulePENDOWN : rulePENDOWN EOF ;
    public final void entryRulePENDOWN() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:313:1: ( rulePENDOWN EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:314:1: rulePENDOWN EOF
            {
             before(grammarAccess.getPENDOWNRule()); 
            pushFollow(FOLLOW_rulePENDOWN_in_entryRulePENDOWN602);
            rulePENDOWN();

            state._fsp--;

             after(grammarAccess.getPENDOWNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENDOWN609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePENDOWN"


    // $ANTLR start "rulePENDOWN"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:321:1: rulePENDOWN : ( ( rule__PENDOWN__Group__0 ) ) ;
    public final void rulePENDOWN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:325:2: ( ( ( rule__PENDOWN__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:326:1: ( ( rule__PENDOWN__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:326:1: ( ( rule__PENDOWN__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:327:1: ( rule__PENDOWN__Group__0 )
            {
             before(grammarAccess.getPENDOWNAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:328:1: ( rule__PENDOWN__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:328:2: rule__PENDOWN__Group__0
            {
            pushFollow(FOLLOW_rule__PENDOWN__Group__0_in_rulePENDOWN635);
            rule__PENDOWN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENDOWNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePENDOWN"


    // $ANTLR start "entryRulePENUP"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:340:1: entryRulePENUP : rulePENUP EOF ;
    public final void entryRulePENUP() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:341:1: ( rulePENUP EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:342:1: rulePENUP EOF
            {
             before(grammarAccess.getPENUPRule()); 
            pushFollow(FOLLOW_rulePENUP_in_entryRulePENUP662);
            rulePENUP();

            state._fsp--;

             after(grammarAccess.getPENUPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENUP669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePENUP"


    // $ANTLR start "rulePENUP"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:349:1: rulePENUP : ( ( rule__PENUP__Group__0 ) ) ;
    public final void rulePENUP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:353:2: ( ( ( rule__PENUP__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:354:1: ( ( rule__PENUP__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:354:1: ( ( rule__PENUP__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:355:1: ( rule__PENUP__Group__0 )
            {
             before(grammarAccess.getPENUPAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:356:1: ( rule__PENUP__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:356:2: rule__PENUP__Group__0
            {
            pushFollow(FOLLOW_rule__PENUP__Group__0_in_rulePENUP695);
            rule__PENUP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENUPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePENUP"


    // $ANTLR start "entryRuleCOLOREABLE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:368:1: entryRuleCOLOREABLE : ruleCOLOREABLE EOF ;
    public final void entryRuleCOLOREABLE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:369:1: ( ruleCOLOREABLE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:370:1: ruleCOLOREABLE EOF
            {
             before(grammarAccess.getCOLOREABLERule()); 
            pushFollow(FOLLOW_ruleCOLOREABLE_in_entryRuleCOLOREABLE722);
            ruleCOLOREABLE();

            state._fsp--;

             after(grammarAccess.getCOLOREABLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOREABLE729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLOREABLE"


    // $ANTLR start "ruleCOLOREABLE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:377:1: ruleCOLOREABLE : ( ( rule__COLOREABLE__Alternatives ) ) ;
    public final void ruleCOLOREABLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:381:2: ( ( ( rule__COLOREABLE__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:382:1: ( ( rule__COLOREABLE__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:382:1: ( ( rule__COLOREABLE__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:383:1: ( rule__COLOREABLE__Alternatives )
            {
             before(grammarAccess.getCOLOREABLEAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:384:1: ( rule__COLOREABLE__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:384:2: rule__COLOREABLE__Alternatives
            {
            pushFollow(FOLLOW_rule__COLOREABLE__Alternatives_in_ruleCOLOREABLE755);
            rule__COLOREABLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOLOREABLEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLOREABLE"


    // $ANTLR start "entryRulePENCOLOR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:396:1: entryRulePENCOLOR : rulePENCOLOR EOF ;
    public final void entryRulePENCOLOR() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:397:1: ( rulePENCOLOR EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:398:1: rulePENCOLOR EOF
            {
             before(grammarAccess.getPENCOLORRule()); 
            pushFollow(FOLLOW_rulePENCOLOR_in_entryRulePENCOLOR782);
            rulePENCOLOR();

            state._fsp--;

             after(grammarAccess.getPENCOLORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePENCOLOR789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePENCOLOR"


    // $ANTLR start "rulePENCOLOR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:405:1: rulePENCOLOR : ( ( rule__PENCOLOR__Group__0 ) ) ;
    public final void rulePENCOLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:409:2: ( ( ( rule__PENCOLOR__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:410:1: ( ( rule__PENCOLOR__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:410:1: ( ( rule__PENCOLOR__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:411:1: ( rule__PENCOLOR__Group__0 )
            {
             before(grammarAccess.getPENCOLORAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:412:1: ( rule__PENCOLOR__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:412:2: rule__PENCOLOR__Group__0
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Group__0_in_rulePENCOLOR815);
            rule__PENCOLOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPENCOLORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePENCOLOR"


    // $ANTLR start "entryRuleCANVAS_COLOR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:424:1: entryRuleCANVAS_COLOR : ruleCANVAS_COLOR EOF ;
    public final void entryRuleCANVAS_COLOR() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:425:1: ( ruleCANVAS_COLOR EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:426:1: ruleCANVAS_COLOR EOF
            {
             before(grammarAccess.getCANVAS_COLORRule()); 
            pushFollow(FOLLOW_ruleCANVAS_COLOR_in_entryRuleCANVAS_COLOR842);
            ruleCANVAS_COLOR();

            state._fsp--;

             after(grammarAccess.getCANVAS_COLORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCANVAS_COLOR849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCANVAS_COLOR"


    // $ANTLR start "ruleCANVAS_COLOR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:433:1: ruleCANVAS_COLOR : ( ( rule__CANVAS_COLOR__Group__0 ) ) ;
    public final void ruleCANVAS_COLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:437:2: ( ( ( rule__CANVAS_COLOR__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:438:1: ( ( rule__CANVAS_COLOR__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:438:1: ( ( rule__CANVAS_COLOR__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:439:1: ( rule__CANVAS_COLOR__Group__0 )
            {
             before(grammarAccess.getCANVAS_COLORAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:440:1: ( rule__CANVAS_COLOR__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:440:2: rule__CANVAS_COLOR__Group__0
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__0_in_ruleCANVAS_COLOR875);
            rule__CANVAS_COLOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCANVAS_COLORAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCANVAS_COLOR"


    // $ANTLR start "entryRuleCOLOR_SPEC"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:452:1: entryRuleCOLOR_SPEC : ruleCOLOR_SPEC EOF ;
    public final void entryRuleCOLOR_SPEC() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:453:1: ( ruleCOLOR_SPEC EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:454:1: ruleCOLOR_SPEC EOF
            {
             before(grammarAccess.getCOLOR_SPECRule()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_entryRuleCOLOR_SPEC902);
            ruleCOLOR_SPEC();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOR_SPEC909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLOR_SPEC"


    // $ANTLR start "ruleCOLOR_SPEC"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:461:1: ruleCOLOR_SPEC : ( ( rule__COLOR_SPEC__Group__0 ) ) ;
    public final void ruleCOLOR_SPEC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:465:2: ( ( ( rule__COLOR_SPEC__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:466:1: ( ( rule__COLOR_SPEC__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:466:1: ( ( rule__COLOR_SPEC__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:467:1: ( rule__COLOR_SPEC__Group__0 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:468:1: ( rule__COLOR_SPEC__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:468:2: rule__COLOR_SPEC__Group__0
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__0_in_ruleCOLOR_SPEC935);
            rule__COLOR_SPEC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLOR_SPEC"


    // $ANTLR start "entryRuleCOLOR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:480:1: entryRuleCOLOR : ruleCOLOR EOF ;
    public final void entryRuleCOLOR() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:481:1: ( ruleCOLOR EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:482:1: ruleCOLOR EOF
            {
             before(grammarAccess.getCOLORRule()); 
            pushFollow(FOLLOW_ruleCOLOR_in_entryRuleCOLOR962);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getCOLORRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOLOR969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCOLOR"


    // $ANTLR start "ruleCOLOR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:489:1: ruleCOLOR : ( ( rule__COLOR__Alternatives ) ) ;
    public final void ruleCOLOR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:493:2: ( ( ( rule__COLOR__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:494:1: ( ( rule__COLOR__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:494:1: ( ( rule__COLOR__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:495:1: ( rule__COLOR__Alternatives )
            {
             before(grammarAccess.getCOLORAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:496:1: ( rule__COLOR__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:496:2: rule__COLOR__Alternatives
            {
            pushFollow(FOLLOW_rule__COLOR__Alternatives_in_ruleCOLOR995);
            rule__COLOR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCOLORAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCOLOR"


    // $ANTLR start "entryRuleFONT_SPEC"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:508:1: entryRuleFONT_SPEC : ruleFONT_SPEC EOF ;
    public final void entryRuleFONT_SPEC() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:509:1: ( ruleFONT_SPEC EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:510:1: ruleFONT_SPEC EOF
            {
             before(grammarAccess.getFONT_SPECRule()); 
            pushFollow(FOLLOW_ruleFONT_SPEC_in_entryRuleFONT_SPEC1022);
            ruleFONT_SPEC();

            state._fsp--;

             after(grammarAccess.getFONT_SPECRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_SPEC1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFONT_SPEC"


    // $ANTLR start "ruleFONT_SPEC"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:517:1: ruleFONT_SPEC : ( ( rule__FONT_SPEC__Alternatives ) ) ;
    public final void ruleFONT_SPEC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:521:2: ( ( ( rule__FONT_SPEC__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:522:1: ( ( rule__FONT_SPEC__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:522:1: ( ( rule__FONT_SPEC__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:523:1: ( rule__FONT_SPEC__Alternatives )
            {
             before(grammarAccess.getFONT_SPECAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:524:1: ( rule__FONT_SPEC__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:524:2: rule__FONT_SPEC__Alternatives
            {
            pushFollow(FOLLOW_rule__FONT_SPEC__Alternatives_in_ruleFONT_SPEC1055);
            rule__FONT_SPEC__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFONT_SPECAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFONT_SPEC"


    // $ANTLR start "entryRuleFONT_SIZE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:536:1: entryRuleFONT_SIZE : ruleFONT_SIZE EOF ;
    public final void entryRuleFONT_SIZE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:537:1: ( ruleFONT_SIZE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:538:1: ruleFONT_SIZE EOF
            {
             before(grammarAccess.getFONT_SIZERule()); 
            pushFollow(FOLLOW_ruleFONT_SIZE_in_entryRuleFONT_SIZE1082);
            ruleFONT_SIZE();

            state._fsp--;

             after(grammarAccess.getFONT_SIZERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_SIZE1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFONT_SIZE"


    // $ANTLR start "ruleFONT_SIZE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:545:1: ruleFONT_SIZE : ( ( rule__FONT_SIZE__Group__0 ) ) ;
    public final void ruleFONT_SIZE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:549:2: ( ( ( rule__FONT_SIZE__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:550:1: ( ( rule__FONT_SIZE__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:550:1: ( ( rule__FONT_SIZE__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:551:1: ( rule__FONT_SIZE__Group__0 )
            {
             before(grammarAccess.getFONT_SIZEAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:552:1: ( rule__FONT_SIZE__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:552:2: rule__FONT_SIZE__Group__0
            {
            pushFollow(FOLLOW_rule__FONT_SIZE__Group__0_in_ruleFONT_SIZE1115);
            rule__FONT_SIZE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFONT_SIZEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFONT_SIZE"


    // $ANTLR start "entryRuleFONT_STYLE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:564:1: entryRuleFONT_STYLE : ruleFONT_STYLE EOF ;
    public final void entryRuleFONT_STYLE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:565:1: ( ruleFONT_STYLE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:566:1: ruleFONT_STYLE EOF
            {
             before(grammarAccess.getFONT_STYLERule()); 
            pushFollow(FOLLOW_ruleFONT_STYLE_in_entryRuleFONT_STYLE1142);
            ruleFONT_STYLE();

            state._fsp--;

             after(grammarAccess.getFONT_STYLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFONT_STYLE1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFONT_STYLE"


    // $ANTLR start "ruleFONT_STYLE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:573:1: ruleFONT_STYLE : ( ( rule__FONT_STYLE__Group__0 ) ) ;
    public final void ruleFONT_STYLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:577:2: ( ( ( rule__FONT_STYLE__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:578:1: ( ( rule__FONT_STYLE__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:578:1: ( ( rule__FONT_STYLE__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:579:1: ( rule__FONT_STYLE__Group__0 )
            {
             before(grammarAccess.getFONT_STYLEAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:580:1: ( rule__FONT_STYLE__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:580:2: rule__FONT_STYLE__Group__0
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__Group__0_in_ruleFONT_STYLE1175);
            rule__FONT_STYLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFONT_STYLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFONT_STYLE"


    // $ANTLR start "entryRuleFontStyleValues"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:592:1: entryRuleFontStyleValues : ruleFontStyleValues EOF ;
    public final void entryRuleFontStyleValues() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:593:1: ( ruleFontStyleValues EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:594:1: ruleFontStyleValues EOF
            {
             before(grammarAccess.getFontStyleValuesRule()); 
            pushFollow(FOLLOW_ruleFontStyleValues_in_entryRuleFontStyleValues1202);
            ruleFontStyleValues();

            state._fsp--;

             after(grammarAccess.getFontStyleValuesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFontStyleValues1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFontStyleValues"


    // $ANTLR start "ruleFontStyleValues"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:601:1: ruleFontStyleValues : ( ( rule__FontStyleValues__Alternatives ) ) ;
    public final void ruleFontStyleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:605:2: ( ( ( rule__FontStyleValues__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:606:1: ( ( rule__FontStyleValues__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:606:1: ( ( rule__FontStyleValues__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:607:1: ( rule__FontStyleValues__Alternatives )
            {
             before(grammarAccess.getFontStyleValuesAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:608:1: ( rule__FontStyleValues__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:608:2: rule__FontStyleValues__Alternatives
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Alternatives_in_ruleFontStyleValues1235);
            rule__FontStyleValues__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFontStyleValuesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontStyleValues"


    // $ANTLR start "entryRuleCLEAR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:620:1: entryRuleCLEAR : ruleCLEAR EOF ;
    public final void entryRuleCLEAR() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:621:1: ( ruleCLEAR EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:622:1: ruleCLEAR EOF
            {
             before(grammarAccess.getCLEARRule()); 
            pushFollow(FOLLOW_ruleCLEAR_in_entryRuleCLEAR1262);
            ruleCLEAR();

            state._fsp--;

             after(grammarAccess.getCLEARRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCLEAR1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCLEAR"


    // $ANTLR start "ruleCLEAR"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:629:1: ruleCLEAR : ( ( rule__CLEAR__Group__0 ) ) ;
    public final void ruleCLEAR() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:633:2: ( ( ( rule__CLEAR__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:634:1: ( ( rule__CLEAR__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:634:1: ( ( rule__CLEAR__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:635:1: ( rule__CLEAR__Group__0 )
            {
             before(grammarAccess.getCLEARAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:636:1: ( rule__CLEAR__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:636:2: rule__CLEAR__Group__0
            {
            pushFollow(FOLLOW_rule__CLEAR__Group__0_in_ruleCLEAR1295);
            rule__CLEAR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCLEARAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCLEAR"


    // $ANTLR start "entryRuleHOME"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:648:1: entryRuleHOME : ruleHOME EOF ;
    public final void entryRuleHOME() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:649:1: ( ruleHOME EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:650:1: ruleHOME EOF
            {
             before(grammarAccess.getHOMERule()); 
            pushFollow(FOLLOW_ruleHOME_in_entryRuleHOME1322);
            ruleHOME();

            state._fsp--;

             after(grammarAccess.getHOMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHOME1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHOME"


    // $ANTLR start "ruleHOME"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:657:1: ruleHOME : ( ( rule__HOME__Group__0 ) ) ;
    public final void ruleHOME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:661:2: ( ( ( rule__HOME__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:662:1: ( ( rule__HOME__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:662:1: ( ( rule__HOME__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:663:1: ( rule__HOME__Group__0 )
            {
             before(grammarAccess.getHOMEAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:664:1: ( rule__HOME__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:664:2: rule__HOME__Group__0
            {
            pushFollow(FOLLOW_rule__HOME__Group__0_in_ruleHOME1355);
            rule__HOME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHOMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHOME"


    // $ANTLR start "entryRuleDRAW_STRING"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:676:1: entryRuleDRAW_STRING : ruleDRAW_STRING EOF ;
    public final void entryRuleDRAW_STRING() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:677:1: ( ruleDRAW_STRING EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:678:1: ruleDRAW_STRING EOF
            {
             before(grammarAccess.getDRAW_STRINGRule()); 
            pushFollow(FOLLOW_ruleDRAW_STRING_in_entryRuleDRAW_STRING1382);
            ruleDRAW_STRING();

            state._fsp--;

             after(grammarAccess.getDRAW_STRINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDRAW_STRING1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDRAW_STRING"


    // $ANTLR start "ruleDRAW_STRING"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:685:1: ruleDRAW_STRING : ( ( rule__DRAW_STRING__Group__0 ) ) ;
    public final void ruleDRAW_STRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:689:2: ( ( ( rule__DRAW_STRING__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:690:1: ( ( rule__DRAW_STRING__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:690:1: ( ( rule__DRAW_STRING__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:691:1: ( rule__DRAW_STRING__Group__0 )
            {
             before(grammarAccess.getDRAW_STRINGAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:692:1: ( rule__DRAW_STRING__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:692:2: rule__DRAW_STRING__Group__0
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__Group__0_in_ruleDRAW_STRING1415);
            rule__DRAW_STRING__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDRAW_STRINGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDRAW_STRING"


    // $ANTLR start "entryRuleMAKE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:706:1: entryRuleMAKE : ruleMAKE EOF ;
    public final void entryRuleMAKE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:707:1: ( ruleMAKE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:708:1: ruleMAKE EOF
            {
             before(grammarAccess.getMAKERule()); 
            pushFollow(FOLLOW_ruleMAKE_in_entryRuleMAKE1444);
            ruleMAKE();

            state._fsp--;

             after(grammarAccess.getMAKERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMAKE1451); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMAKE"


    // $ANTLR start "ruleMAKE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:715:1: ruleMAKE : ( ( rule__MAKE__Group__0 ) ) ;
    public final void ruleMAKE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:719:2: ( ( ( rule__MAKE__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:720:1: ( ( rule__MAKE__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:720:1: ( ( rule__MAKE__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:721:1: ( rule__MAKE__Group__0 )
            {
             before(grammarAccess.getMAKEAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:722:1: ( rule__MAKE__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:722:2: rule__MAKE__Group__0
            {
            pushFollow(FOLLOW_rule__MAKE__Group__0_in_ruleMAKE1477);
            rule__MAKE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMAKEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMAKE"


    // $ANTLR start "entryRuleVARIABLE_REF"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:734:1: entryRuleVARIABLE_REF : ruleVARIABLE_REF EOF ;
    public final void entryRuleVARIABLE_REF() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:735:1: ( ruleVARIABLE_REF EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:736:1: ruleVARIABLE_REF EOF
            {
             before(grammarAccess.getVARIABLE_REFRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_REF_in_entryRuleVARIABLE_REF1504);
            ruleVARIABLE_REF();

            state._fsp--;

             after(grammarAccess.getVARIABLE_REFRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_REF1511); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVARIABLE_REF"


    // $ANTLR start "ruleVARIABLE_REF"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:743:1: ruleVARIABLE_REF : ( ( rule__VARIABLE_REF__ToVarAssignment ) ) ;
    public final void ruleVARIABLE_REF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:747:2: ( ( ( rule__VARIABLE_REF__ToVarAssignment ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:748:1: ( ( rule__VARIABLE_REF__ToVarAssignment ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:748:1: ( ( rule__VARIABLE_REF__ToVarAssignment ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:749:1: ( rule__VARIABLE_REF__ToVarAssignment )
            {
             before(grammarAccess.getVARIABLE_REFAccess().getToVarAssignment()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:750:1: ( rule__VARIABLE_REF__ToVarAssignment )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:750:2: rule__VARIABLE_REF__ToVarAssignment
            {
            pushFollow(FOLLOW_rule__VARIABLE_REF__ToVarAssignment_in_ruleVARIABLE_REF1537);
            rule__VARIABLE_REF__ToVarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_REFAccess().getToVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVARIABLE_REF"


    // $ANTLR start "entryRuleEXPRESSION"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:762:1: entryRuleEXPRESSION : ruleEXPRESSION EOF ;
    public final void entryRuleEXPRESSION() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:763:1: ( ruleEXPRESSION EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:764:1: ruleEXPRESSION EOF
            {
             before(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION1564);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION1571); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:771:1: ruleEXPRESSION : ( ( rule__EXPRESSION__Alternatives ) ) ;
    public final void ruleEXPRESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:775:2: ( ( ( rule__EXPRESSION__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:776:1: ( ( rule__EXPRESSION__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:776:1: ( ( rule__EXPRESSION__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:777:1: ( rule__EXPRESSION__Alternatives )
            {
             before(grammarAccess.getEXPRESSIONAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:778:1: ( rule__EXPRESSION__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:778:2: rule__EXPRESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Alternatives_in_ruleEXPRESSION1597);
            rule__EXPRESSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleVALUE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:790:1: entryRuleVALUE : ruleVALUE EOF ;
    public final void entryRuleVALUE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:791:1: ( ruleVALUE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:792:1: ruleVALUE EOF
            {
             before(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_ruleVALUE_in_entryRuleVALUE1624);
            ruleVALUE();

            state._fsp--;

             after(grammarAccess.getVALUERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVALUE1631); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:799:1: ruleVALUE : ( ( rule__VALUE__ValAssignment ) ) ;
    public final void ruleVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:803:2: ( ( ( rule__VALUE__ValAssignment ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:804:1: ( ( rule__VALUE__ValAssignment ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:804:1: ( ( rule__VALUE__ValAssignment ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:805:1: ( rule__VALUE__ValAssignment )
            {
             before(grammarAccess.getVALUEAccess().getValAssignment()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:806:1: ( rule__VALUE__ValAssignment )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:806:2: rule__VALUE__ValAssignment
            {
            pushFollow(FOLLOW_rule__VALUE__ValAssignment_in_ruleVALUE1657);
            rule__VALUE__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVALUEAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "entryRuleCONTENT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:818:1: entryRuleCONTENT : ruleCONTENT EOF ;
    public final void entryRuleCONTENT() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:819:1: ( ruleCONTENT EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:820:1: ruleCONTENT EOF
            {
             before(grammarAccess.getCONTENTRule()); 
            pushFollow(FOLLOW_ruleCONTENT_in_entryRuleCONTENT1684);
            ruleCONTENT();

            state._fsp--;

             after(grammarAccess.getCONTENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTENT1691); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCONTENT"


    // $ANTLR start "ruleCONTENT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:827:1: ruleCONTENT : ( ( rule__CONTENT__Group__0 ) ) ;
    public final void ruleCONTENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:831:2: ( ( ( rule__CONTENT__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:832:1: ( ( rule__CONTENT__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:832:1: ( ( rule__CONTENT__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:833:1: ( rule__CONTENT__Group__0 )
            {
             before(grammarAccess.getCONTENTAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:834:1: ( rule__CONTENT__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:834:2: rule__CONTENT__Group__0
            {
            pushFollow(FOLLOW_rule__CONTENT__Group__0_in_ruleCONTENT1717);
            rule__CONTENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCONTENTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONTENT"


    // $ANTLR start "entryRuleOPERATION"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:846:1: entryRuleOPERATION : ruleOPERATION EOF ;
    public final void entryRuleOPERATION() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:847:1: ( ruleOPERATION EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:848:1: ruleOPERATION EOF
            {
             before(grammarAccess.getOPERATIONRule()); 
            pushFollow(FOLLOW_ruleOPERATION_in_entryRuleOPERATION1744);
            ruleOPERATION();

            state._fsp--;

             after(grammarAccess.getOPERATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOPERATION1751); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOPERATION"


    // $ANTLR start "ruleOPERATION"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:855:1: ruleOPERATION : ( ( rule__OPERATION__Alternatives ) ) ;
    public final void ruleOPERATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:859:2: ( ( ( rule__OPERATION__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:860:1: ( ( rule__OPERATION__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:860:1: ( ( rule__OPERATION__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:861:1: ( rule__OPERATION__Alternatives )
            {
             before(grammarAccess.getOPERATIONAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:862:1: ( rule__OPERATION__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:862:2: rule__OPERATION__Alternatives
            {
            pushFollow(FOLLOW_rule__OPERATION__Alternatives_in_ruleOPERATION1777);
            rule__OPERATION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOPERATIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOPERATION"


    // $ANTLR start "entryRuleSUM"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:874:1: entryRuleSUM : ruleSUM EOF ;
    public final void entryRuleSUM() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:875:1: ( ruleSUM EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:876:1: ruleSUM EOF
            {
             before(grammarAccess.getSUMRule()); 
            pushFollow(FOLLOW_ruleSUM_in_entryRuleSUM1804);
            ruleSUM();

            state._fsp--;

             after(grammarAccess.getSUMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSUM1811); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSUM"


    // $ANTLR start "ruleSUM"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:883:1: ruleSUM : ( ( rule__SUM__Group__0 ) ) ;
    public final void ruleSUM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:887:2: ( ( ( rule__SUM__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:888:1: ( ( rule__SUM__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:888:1: ( ( rule__SUM__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:889:1: ( rule__SUM__Group__0 )
            {
             before(grammarAccess.getSUMAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:890:1: ( rule__SUM__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:890:2: rule__SUM__Group__0
            {
            pushFollow(FOLLOW_rule__SUM__Group__0_in_ruleSUM1837);
            rule__SUM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSUM"


    // $ANTLR start "entryRuleSUBTRACT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:902:1: entryRuleSUBTRACT : ruleSUBTRACT EOF ;
    public final void entryRuleSUBTRACT() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:903:1: ( ruleSUBTRACT EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:904:1: ruleSUBTRACT EOF
            {
             before(grammarAccess.getSUBTRACTRule()); 
            pushFollow(FOLLOW_ruleSUBTRACT_in_entryRuleSUBTRACT1864);
            ruleSUBTRACT();

            state._fsp--;

             after(grammarAccess.getSUBTRACTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSUBTRACT1871); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSUBTRACT"


    // $ANTLR start "ruleSUBTRACT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:911:1: ruleSUBTRACT : ( ( rule__SUBTRACT__Group__0 ) ) ;
    public final void ruleSUBTRACT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:915:2: ( ( ( rule__SUBTRACT__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:916:1: ( ( rule__SUBTRACT__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:916:1: ( ( rule__SUBTRACT__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:917:1: ( rule__SUBTRACT__Group__0 )
            {
             before(grammarAccess.getSUBTRACTAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:918:1: ( rule__SUBTRACT__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:918:2: rule__SUBTRACT__Group__0
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__0_in_ruleSUBTRACT1897);
            rule__SUBTRACT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSUBTRACT"


    // $ANTLR start "entryRuleMULTIPLY"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:930:1: entryRuleMULTIPLY : ruleMULTIPLY EOF ;
    public final void entryRuleMULTIPLY() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:931:1: ( ruleMULTIPLY EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:932:1: ruleMULTIPLY EOF
            {
             before(grammarAccess.getMULTIPLYRule()); 
            pushFollow(FOLLOW_ruleMULTIPLY_in_entryRuleMULTIPLY1924);
            ruleMULTIPLY();

            state._fsp--;

             after(grammarAccess.getMULTIPLYRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMULTIPLY1931); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMULTIPLY"


    // $ANTLR start "ruleMULTIPLY"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:939:1: ruleMULTIPLY : ( ( rule__MULTIPLY__Group__0 ) ) ;
    public final void ruleMULTIPLY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:943:2: ( ( ( rule__MULTIPLY__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:944:1: ( ( rule__MULTIPLY__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:944:1: ( ( rule__MULTIPLY__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:945:1: ( rule__MULTIPLY__Group__0 )
            {
             before(grammarAccess.getMULTIPLYAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:946:1: ( rule__MULTIPLY__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:946:2: rule__MULTIPLY__Group__0
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__0_in_ruleMULTIPLY1957);
            rule__MULTIPLY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMULTIPLY"


    // $ANTLR start "entryRuleDIVIDE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:958:1: entryRuleDIVIDE : ruleDIVIDE EOF ;
    public final void entryRuleDIVIDE() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:959:1: ( ruleDIVIDE EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:960:1: ruleDIVIDE EOF
            {
             before(grammarAccess.getDIVIDERule()); 
            pushFollow(FOLLOW_ruleDIVIDE_in_entryRuleDIVIDE1984);
            ruleDIVIDE();

            state._fsp--;

             after(grammarAccess.getDIVIDERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIVIDE1991); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDIVIDE"


    // $ANTLR start "ruleDIVIDE"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:967:1: ruleDIVIDE : ( ( rule__DIVIDE__Group__0 ) ) ;
    public final void ruleDIVIDE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:971:2: ( ( ( rule__DIVIDE__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:972:1: ( ( rule__DIVIDE__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:972:1: ( ( rule__DIVIDE__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:973:1: ( rule__DIVIDE__Group__0 )
            {
             before(grammarAccess.getDIVIDEAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:974:1: ( rule__DIVIDE__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:974:2: rule__DIVIDE__Group__0
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__0_in_ruleDIVIDE2017);
            rule__DIVIDE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDIVIDE"


    // $ANTLR start "entryRuleCONTROL_SENTENCES"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:986:1: entryRuleCONTROL_SENTENCES : ruleCONTROL_SENTENCES EOF ;
    public final void entryRuleCONTROL_SENTENCES() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:987:1: ( ruleCONTROL_SENTENCES EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:988:1: ruleCONTROL_SENTENCES EOF
            {
             before(grammarAccess.getCONTROL_SENTENCESRule()); 
            pushFollow(FOLLOW_ruleCONTROL_SENTENCES_in_entryRuleCONTROL_SENTENCES2044);
            ruleCONTROL_SENTENCES();

            state._fsp--;

             after(grammarAccess.getCONTROL_SENTENCESRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTROL_SENTENCES2051); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCONTROL_SENTENCES"


    // $ANTLR start "ruleCONTROL_SENTENCES"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:995:1: ruleCONTROL_SENTENCES : ( ( rule__CONTROL_SENTENCES__Alternatives ) ) ;
    public final void ruleCONTROL_SENTENCES() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:999:2: ( ( ( rule__CONTROL_SENTENCES__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1000:1: ( ( rule__CONTROL_SENTENCES__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1000:1: ( ( rule__CONTROL_SENTENCES__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1001:1: ( rule__CONTROL_SENTENCES__Alternatives )
            {
             before(grammarAccess.getCONTROL_SENTENCESAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1002:1: ( rule__CONTROL_SENTENCES__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1002:2: rule__CONTROL_SENTENCES__Alternatives
            {
            pushFollow(FOLLOW_rule__CONTROL_SENTENCES__Alternatives_in_ruleCONTROL_SENTENCES2077);
            rule__CONTROL_SENTENCES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCONTROL_SENTENCESAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCONTROL_SENTENCES"


    // $ANTLR start "entryRuleREPEAT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1014:1: entryRuleREPEAT : ruleREPEAT EOF ;
    public final void entryRuleREPEAT() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1015:1: ( ruleREPEAT EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1016:1: ruleREPEAT EOF
            {
             before(grammarAccess.getREPEATRule()); 
            pushFollow(FOLLOW_ruleREPEAT_in_entryRuleREPEAT2104);
            ruleREPEAT();

            state._fsp--;

             after(grammarAccess.getREPEATRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREPEAT2111); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleREPEAT"


    // $ANTLR start "ruleREPEAT"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1023:1: ruleREPEAT : ( ( rule__REPEAT__Group__0 ) ) ;
    public final void ruleREPEAT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1027:2: ( ( ( rule__REPEAT__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1028:1: ( ( rule__REPEAT__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1028:1: ( ( rule__REPEAT__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1029:1: ( rule__REPEAT__Group__0 )
            {
             before(grammarAccess.getREPEATAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1030:1: ( rule__REPEAT__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1030:2: rule__REPEAT__Group__0
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__0_in_ruleREPEAT2137);
            rule__REPEAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREPEATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleREPEAT"


    // $ANTLR start "entryRuleTO"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1042:1: entryRuleTO : ruleTO EOF ;
    public final void entryRuleTO() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1043:1: ( ruleTO EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1044:1: ruleTO EOF
            {
             before(grammarAccess.getTORule()); 
            pushFollow(FOLLOW_ruleTO_in_entryRuleTO2164);
            ruleTO();

            state._fsp--;

             after(grammarAccess.getTORule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTO2171); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTO"


    // $ANTLR start "ruleTO"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1051:1: ruleTO : ( ( rule__TO__Group__0 ) ) ;
    public final void ruleTO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1055:2: ( ( ( rule__TO__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1056:1: ( ( rule__TO__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1056:1: ( ( rule__TO__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1057:1: ( rule__TO__Group__0 )
            {
             before(grammarAccess.getTOAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1058:1: ( rule__TO__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1058:2: rule__TO__Group__0
            {
            pushFollow(FOLLOW_rule__TO__Group__0_in_ruleTO2197);
            rule__TO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTOAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTO"


    // $ANTLR start "entryRulePARAM"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1070:1: entryRulePARAM : rulePARAM EOF ;
    public final void entryRulePARAM() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1071:1: ( rulePARAM EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1072:1: rulePARAM EOF
            {
             before(grammarAccess.getPARAMRule()); 
            pushFollow(FOLLOW_rulePARAM_in_entryRulePARAM2224);
            rulePARAM();

            state._fsp--;

             after(grammarAccess.getPARAMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePARAM2231); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePARAM"


    // $ANTLR start "rulePARAM"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1079:1: rulePARAM : ( ( rule__PARAM__Group__0 ) ) ;
    public final void rulePARAM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1083:2: ( ( ( rule__PARAM__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1084:1: ( ( rule__PARAM__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1084:1: ( ( rule__PARAM__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1085:1: ( rule__PARAM__Group__0 )
            {
             before(grammarAccess.getPARAMAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1086:1: ( rule__PARAM__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1086:2: rule__PARAM__Group__0
            {
            pushFollow(FOLLOW_rule__PARAM__Group__0_in_rulePARAM2257);
            rule__PARAM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPARAMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePARAM"


    // $ANTLR start "entryRulePROCEDURE_CALL"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1098:1: entryRulePROCEDURE_CALL : rulePROCEDURE_CALL EOF ;
    public final void entryRulePROCEDURE_CALL() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1099:1: ( rulePROCEDURE_CALL EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1100:1: rulePROCEDURE_CALL EOF
            {
             before(grammarAccess.getPROCEDURE_CALLRule()); 
            pushFollow(FOLLOW_rulePROCEDURE_CALL_in_entryRulePROCEDURE_CALL2284);
            rulePROCEDURE_CALL();

            state._fsp--;

             after(grammarAccess.getPROCEDURE_CALLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePROCEDURE_CALL2291); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePROCEDURE_CALL"


    // $ANTLR start "rulePROCEDURE_CALL"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1107:1: rulePROCEDURE_CALL : ( ( rule__PROCEDURE_CALL__Group__0 ) ) ;
    public final void rulePROCEDURE_CALL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1111:2: ( ( ( rule__PROCEDURE_CALL__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1112:1: ( ( rule__PROCEDURE_CALL__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1112:1: ( ( rule__PROCEDURE_CALL__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1113:1: ( rule__PROCEDURE_CALL__Group__0 )
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1114:1: ( rule__PROCEDURE_CALL__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1114:2: rule__PROCEDURE_CALL__Group__0
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__0_in_rulePROCEDURE_CALL2317);
            rule__PROCEDURE_CALL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDURE_CALLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROCEDURE_CALL"


    // $ANTLR start "entryRuleIF"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1126:1: entryRuleIF : ruleIF EOF ;
    public final void entryRuleIF() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1127:1: ( ruleIF EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1128:1: ruleIF EOF
            {
             before(grammarAccess.getIFRule()); 
            pushFollow(FOLLOW_ruleIF_in_entryRuleIF2344);
            ruleIF();

            state._fsp--;

             after(grammarAccess.getIFRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIF2351); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIF"


    // $ANTLR start "ruleIF"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1135:1: ruleIF : ( ( rule__IF__Group__0 ) ) ;
    public final void ruleIF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1139:2: ( ( ( rule__IF__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1140:1: ( ( rule__IF__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1140:1: ( ( rule__IF__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1141:1: ( rule__IF__Group__0 )
            {
             before(grammarAccess.getIFAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1142:1: ( rule__IF__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1142:2: rule__IF__Group__0
            {
            pushFollow(FOLLOW_rule__IF__Group__0_in_ruleIF2377);
            rule__IF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIF"


    // $ANTLR start "entryRuleBOOLEAN_EXPRESSION"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1154:1: entryRuleBOOLEAN_EXPRESSION : ruleBOOLEAN_EXPRESSION EOF ;
    public final void entryRuleBOOLEAN_EXPRESSION() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1155:1: ( ruleBOOLEAN_EXPRESSION EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1156:1: ruleBOOLEAN_EXPRESSION EOF
            {
             before(grammarAccess.getBOOLEAN_EXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_EXPRESSION_in_entryRuleBOOLEAN_EXPRESSION2404);
            ruleBOOLEAN_EXPRESSION();

            state._fsp--;

             after(grammarAccess.getBOOLEAN_EXPRESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_EXPRESSION2411); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBOOLEAN_EXPRESSION"


    // $ANTLR start "ruleBOOLEAN_EXPRESSION"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1163:1: ruleBOOLEAN_EXPRESSION : ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) ) ;
    public final void ruleBOOLEAN_EXPRESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1167:2: ( ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1168:1: ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1168:1: ( ( rule__BOOLEAN_EXPRESSION__Alternatives ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1169:1: ( rule__BOOLEAN_EXPRESSION__Alternatives )
            {
             before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1170:1: ( rule__BOOLEAN_EXPRESSION__Alternatives )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1170:2: rule__BOOLEAN_EXPRESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN_EXPRESSION__Alternatives_in_ruleBOOLEAN_EXPRESSION2437);
            rule__BOOLEAN_EXPRESSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN_EXPRESSION"


    // $ANTLR start "entryRuleEQUALS"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1182:1: entryRuleEQUALS : ruleEQUALS EOF ;
    public final void entryRuleEQUALS() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1183:1: ( ruleEQUALS EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1184:1: ruleEQUALS EOF
            {
             before(grammarAccess.getEQUALSRule()); 
            pushFollow(FOLLOW_ruleEQUALS_in_entryRuleEQUALS2464);
            ruleEQUALS();

            state._fsp--;

             after(grammarAccess.getEQUALSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQUALS2471); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEQUALS"


    // $ANTLR start "ruleEQUALS"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1191:1: ruleEQUALS : ( ( rule__EQUALS__Group__0 ) ) ;
    public final void ruleEQUALS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1195:2: ( ( ( rule__EQUALS__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1196:1: ( ( rule__EQUALS__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1196:1: ( ( rule__EQUALS__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1197:1: ( rule__EQUALS__Group__0 )
            {
             before(grammarAccess.getEQUALSAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1198:1: ( rule__EQUALS__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1198:2: rule__EQUALS__Group__0
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__0_in_ruleEQUALS2497);
            rule__EQUALS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEQUALS"


    // $ANTLR start "entryRuleGREATER_THAN"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1210:1: entryRuleGREATER_THAN : ruleGREATER_THAN EOF ;
    public final void entryRuleGREATER_THAN() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1211:1: ( ruleGREATER_THAN EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1212:1: ruleGREATER_THAN EOF
            {
             before(grammarAccess.getGREATER_THANRule()); 
            pushFollow(FOLLOW_ruleGREATER_THAN_in_entryRuleGREATER_THAN2524);
            ruleGREATER_THAN();

            state._fsp--;

             after(grammarAccess.getGREATER_THANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGREATER_THAN2531); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGREATER_THAN"


    // $ANTLR start "ruleGREATER_THAN"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1219:1: ruleGREATER_THAN : ( ( rule__GREATER_THAN__Group__0 ) ) ;
    public final void ruleGREATER_THAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1223:2: ( ( ( rule__GREATER_THAN__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1224:1: ( ( rule__GREATER_THAN__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1224:1: ( ( rule__GREATER_THAN__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1225:1: ( rule__GREATER_THAN__Group__0 )
            {
             before(grammarAccess.getGREATER_THANAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1226:1: ( rule__GREATER_THAN__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1226:2: rule__GREATER_THAN__Group__0
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__0_in_ruleGREATER_THAN2557);
            rule__GREATER_THAN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGREATER_THANAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGREATER_THAN"


    // $ANTLR start "entryRuleLESSER_THAN"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1238:1: entryRuleLESSER_THAN : ruleLESSER_THAN EOF ;
    public final void entryRuleLESSER_THAN() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1239:1: ( ruleLESSER_THAN EOF )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1240:1: ruleLESSER_THAN EOF
            {
             before(grammarAccess.getLESSER_THANRule()); 
            pushFollow(FOLLOW_ruleLESSER_THAN_in_entryRuleLESSER_THAN2584);
            ruleLESSER_THAN();

            state._fsp--;

             after(grammarAccess.getLESSER_THANRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLESSER_THAN2591); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLESSER_THAN"


    // $ANTLR start "ruleLESSER_THAN"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1247:1: ruleLESSER_THAN : ( ( rule__LESSER_THAN__Group__0 ) ) ;
    public final void ruleLESSER_THAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1251:2: ( ( ( rule__LESSER_THAN__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1252:1: ( ( rule__LESSER_THAN__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1252:1: ( ( rule__LESSER_THAN__Group__0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1253:1: ( rule__LESSER_THAN__Group__0 )
            {
             before(grammarAccess.getLESSER_THANAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1254:1: ( rule__LESSER_THAN__Group__0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1254:2: rule__LESSER_THAN__Group__0
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__0_in_ruleLESSER_THAN2617);
            rule__LESSER_THAN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLESSER_THANAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLESSER_THAN"


    // $ANTLR start "rule__SENTENCE__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1266:1: rule__SENTENCE__Alternatives : ( ( ruleMAKE ) | ( ruleCONTENT ) | ( rulePROCEDURE_CALL ) | ( ruleOPERATION ) | ( ruleCONTROL_SENTENCES ) | ( ruleMOVE ) | ( ruleDRAWING_SENTENCE ) );
    public final void rule__SENTENCE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1270:1: ( ( ruleMAKE ) | ( ruleCONTENT ) | ( rulePROCEDURE_CALL ) | ( ruleOPERATION ) | ( ruleCONTROL_SENTENCES ) | ( ruleMOVE ) | ( ruleDRAWING_SENTENCE ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case 45:
            case 47:
            case 49:
            case 51:
                {
                alt2=4;
                }
                break;
            case 53:
            case 55:
            case 58:
                {
                alt2=5;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt2=6;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 39:
            case 40:
            case 41:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1271:1: ( ruleMAKE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1271:1: ( ruleMAKE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1272:1: ruleMAKE
                    {
                     before(grammarAccess.getSENTENCEAccess().getMAKEParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMAKE_in_rule__SENTENCE__Alternatives2653);
                    ruleMAKE();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getMAKEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1277:6: ( ruleCONTENT )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1277:6: ( ruleCONTENT )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1278:1: ruleCONTENT
                    {
                     before(grammarAccess.getSENTENCEAccess().getCONTENTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCONTENT_in_rule__SENTENCE__Alternatives2670);
                    ruleCONTENT();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getCONTENTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1283:6: ( rulePROCEDURE_CALL )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1283:6: ( rulePROCEDURE_CALL )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1284:1: rulePROCEDURE_CALL
                    {
                     before(grammarAccess.getSENTENCEAccess().getPROCEDURE_CALLParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePROCEDURE_CALL_in_rule__SENTENCE__Alternatives2687);
                    rulePROCEDURE_CALL();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getPROCEDURE_CALLParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1289:6: ( ruleOPERATION )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1289:6: ( ruleOPERATION )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1290:1: ruleOPERATION
                    {
                     before(grammarAccess.getSENTENCEAccess().getOPERATIONParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOPERATION_in_rule__SENTENCE__Alternatives2704);
                    ruleOPERATION();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getOPERATIONParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1295:6: ( ruleCONTROL_SENTENCES )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1295:6: ( ruleCONTROL_SENTENCES )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1296:1: ruleCONTROL_SENTENCES
                    {
                     before(grammarAccess.getSENTENCEAccess().getCONTROL_SENTENCESParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCONTROL_SENTENCES_in_rule__SENTENCE__Alternatives2721);
                    ruleCONTROL_SENTENCES();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getCONTROL_SENTENCESParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1301:6: ( ruleMOVE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1301:6: ( ruleMOVE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1302:1: ruleMOVE
                    {
                     before(grammarAccess.getSENTENCEAccess().getMOVEParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleMOVE_in_rule__SENTENCE__Alternatives2738);
                    ruleMOVE();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getMOVEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1307:6: ( ruleDRAWING_SENTENCE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1307:6: ( ruleDRAWING_SENTENCE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1308:1: ruleDRAWING_SENTENCE
                    {
                     before(grammarAccess.getSENTENCEAccess().getDRAWING_SENTENCEParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDRAWING_SENTENCE_in_rule__SENTENCE__Alternatives2755);
                    ruleDRAWING_SENTENCE();

                    state._fsp--;

                     after(grammarAccess.getSENTENCEAccess().getDRAWING_SENTENCEParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SENTENCE__Alternatives"


    // $ANTLR start "rule__MOVE__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1318:1: rule__MOVE__Alternatives : ( ( ruleFORWARD ) | ( ruleLEFT ) | ( ruleRIGHT ) | ( ruleSET_X ) | ( ruleSET_Y ) );
    public final void rule__MOVE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1322:1: ( ( ruleFORWARD ) | ( ruleLEFT ) | ( ruleRIGHT ) | ( ruleSET_X ) | ( ruleSET_Y ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 28:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1323:1: ( ruleFORWARD )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1323:1: ( ruleFORWARD )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1324:1: ruleFORWARD
                    {
                     before(grammarAccess.getMOVEAccess().getFORWARDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFORWARD_in_rule__MOVE__Alternatives2787);
                    ruleFORWARD();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getFORWARDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1329:6: ( ruleLEFT )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1329:6: ( ruleLEFT )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1330:1: ruleLEFT
                    {
                     before(grammarAccess.getMOVEAccess().getLEFTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLEFT_in_rule__MOVE__Alternatives2804);
                    ruleLEFT();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getLEFTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1335:6: ( ruleRIGHT )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1335:6: ( ruleRIGHT )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1336:1: ruleRIGHT
                    {
                     before(grammarAccess.getMOVEAccess().getRIGHTParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRIGHT_in_rule__MOVE__Alternatives2821);
                    ruleRIGHT();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getRIGHTParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1341:6: ( ruleSET_X )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1341:6: ( ruleSET_X )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1342:1: ruleSET_X
                    {
                     before(grammarAccess.getMOVEAccess().getSET_XParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSET_X_in_rule__MOVE__Alternatives2838);
                    ruleSET_X();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getSET_XParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1347:6: ( ruleSET_Y )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1347:6: ( ruleSET_Y )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1348:1: ruleSET_Y
                    {
                     before(grammarAccess.getMOVEAccess().getSET_YParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSET_Y_in_rule__MOVE__Alternatives2855);
                    ruleSET_Y();

                    state._fsp--;

                     after(grammarAccess.getMOVEAccess().getSET_YParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MOVE__Alternatives"


    // $ANTLR start "rule__DRAWING_SENTENCE__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1358:1: rule__DRAWING_SENTENCE__Alternatives : ( ( rulePENDOWN ) | ( rulePENUP ) | ( ruleCLEAR ) | ( ruleHOME ) | ( ruleCOLOREABLE ) | ( ruleFONT_SPEC ) | ( ruleDRAW_STRING ) );
    public final void rule__DRAWING_SENTENCE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1362:1: ( ( rulePENDOWN ) | ( rulePENUP ) | ( ruleCLEAR ) | ( ruleHOME ) | ( ruleCOLOREABLE ) | ( ruleFONT_SPEC ) | ( ruleDRAW_STRING ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            case 32:
            case 33:
                {
                alt4=5;
                }
                break;
            case 34:
            case 35:
                {
                alt4=6;
                }
                break;
            case 41:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1363:1: ( rulePENDOWN )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1363:1: ( rulePENDOWN )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1364:1: rulePENDOWN
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getPENDOWNParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePENDOWN_in_rule__DRAWING_SENTENCE__Alternatives2887);
                    rulePENDOWN();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getPENDOWNParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1369:6: ( rulePENUP )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1369:6: ( rulePENUP )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1370:1: rulePENUP
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getPENUPParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePENUP_in_rule__DRAWING_SENTENCE__Alternatives2904);
                    rulePENUP();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getPENUPParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1375:6: ( ruleCLEAR )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1375:6: ( ruleCLEAR )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1376:1: ruleCLEAR
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getCLEARParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCLEAR_in_rule__DRAWING_SENTENCE__Alternatives2921);
                    ruleCLEAR();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getCLEARParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1381:6: ( ruleHOME )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1381:6: ( ruleHOME )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1382:1: ruleHOME
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getHOMEParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHOME_in_rule__DRAWING_SENTENCE__Alternatives2938);
                    ruleHOME();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getHOMEParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1387:6: ( ruleCOLOREABLE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1387:6: ( ruleCOLOREABLE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1388:1: ruleCOLOREABLE
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getCOLOREABLEParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCOLOREABLE_in_rule__DRAWING_SENTENCE__Alternatives2955);
                    ruleCOLOREABLE();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getCOLOREABLEParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1393:6: ( ruleFONT_SPEC )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1393:6: ( ruleFONT_SPEC )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1394:1: ruleFONT_SPEC
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getFONT_SPECParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFONT_SPEC_in_rule__DRAWING_SENTENCE__Alternatives2972);
                    ruleFONT_SPEC();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getFONT_SPECParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1399:6: ( ruleDRAW_STRING )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1399:6: ( ruleDRAW_STRING )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1400:1: ruleDRAW_STRING
                    {
                     before(grammarAccess.getDRAWING_SENTENCEAccess().getDRAW_STRINGParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDRAW_STRING_in_rule__DRAWING_SENTENCE__Alternatives2989);
                    ruleDRAW_STRING();

                    state._fsp--;

                     after(grammarAccess.getDRAWING_SENTENCEAccess().getDRAW_STRINGParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRAWING_SENTENCE__Alternatives"


    // $ANTLR start "rule__COLOREABLE__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1410:1: rule__COLOREABLE__Alternatives : ( ( rulePENCOLOR ) | ( ruleCANVAS_COLOR ) );
    public final void rule__COLOREABLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1414:1: ( ( rulePENCOLOR ) | ( ruleCANVAS_COLOR ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1415:1: ( rulePENCOLOR )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1415:1: ( rulePENCOLOR )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1416:1: rulePENCOLOR
                    {
                     before(grammarAccess.getCOLOREABLEAccess().getPENCOLORParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePENCOLOR_in_rule__COLOREABLE__Alternatives3021);
                    rulePENCOLOR();

                    state._fsp--;

                     after(grammarAccess.getCOLOREABLEAccess().getPENCOLORParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1421:6: ( ruleCANVAS_COLOR )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1421:6: ( ruleCANVAS_COLOR )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1422:1: ruleCANVAS_COLOR
                    {
                     before(grammarAccess.getCOLOREABLEAccess().getCANVAS_COLORParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCANVAS_COLOR_in_rule__COLOREABLE__Alternatives3038);
                    ruleCANVAS_COLOR();

                    state._fsp--;

                     after(grammarAccess.getCOLOREABLEAccess().getCANVAS_COLORParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOREABLE__Alternatives"


    // $ANTLR start "rule__PENCOLOR__Alternatives_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1432:1: rule__PENCOLOR__Alternatives_1 : ( ( ( rule__PENCOLOR__ColorAssignment_1_0 ) ) | ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) ) );
    public final void rule__PENCOLOR__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1436:1: ( ( ( rule__PENCOLOR__ColorAssignment_1_0 ) ) | ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=24)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_DOUBLE)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1437:1: ( ( rule__PENCOLOR__ColorAssignment_1_0 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1437:1: ( ( rule__PENCOLOR__ColorAssignment_1_0 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1438:1: ( rule__PENCOLOR__ColorAssignment_1_0 )
                    {
                     before(grammarAccess.getPENCOLORAccess().getColorAssignment_1_0()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1439:1: ( rule__PENCOLOR__ColorAssignment_1_0 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1439:2: rule__PENCOLOR__ColorAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__PENCOLOR__ColorAssignment_1_0_in_rule__PENCOLOR__Alternatives_13070);
                    rule__PENCOLOR__ColorAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPENCOLORAccess().getColorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1443:6: ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1443:6: ( ( rule__PENCOLOR__ColorSpecAssignment_1_1 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1444:1: ( rule__PENCOLOR__ColorSpecAssignment_1_1 )
                    {
                     before(grammarAccess.getPENCOLORAccess().getColorSpecAssignment_1_1()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1445:1: ( rule__PENCOLOR__ColorSpecAssignment_1_1 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1445:2: rule__PENCOLOR__ColorSpecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__PENCOLOR__ColorSpecAssignment_1_1_in_rule__PENCOLOR__Alternatives_13088);
                    rule__PENCOLOR__ColorSpecAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPENCOLORAccess().getColorSpecAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__Alternatives_1"


    // $ANTLR start "rule__CANVAS_COLOR__Alternatives_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1454:1: rule__CANVAS_COLOR__Alternatives_1 : ( ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) ) | ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) ) );
    public final void rule__CANVAS_COLOR__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1458:1: ( ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) ) | ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=24)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_DOUBLE)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1459:1: ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1459:1: ( ( rule__CANVAS_COLOR__ColorAssignment_1_0 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1460:1: ( rule__CANVAS_COLOR__ColorAssignment_1_0 )
                    {
                     before(grammarAccess.getCANVAS_COLORAccess().getColorAssignment_1_0()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1461:1: ( rule__CANVAS_COLOR__ColorAssignment_1_0 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1461:2: rule__CANVAS_COLOR__ColorAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CANVAS_COLOR__ColorAssignment_1_0_in_rule__CANVAS_COLOR__Alternatives_13121);
                    rule__CANVAS_COLOR__ColorAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCANVAS_COLORAccess().getColorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1465:6: ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1465:6: ( ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1466:1: ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 )
                    {
                     before(grammarAccess.getCANVAS_COLORAccess().getColorSpecAssignment_1_1()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1467:1: ( rule__CANVAS_COLOR__ColorSpecAssignment_1_1 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1467:2: rule__CANVAS_COLOR__ColorSpecAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__CANVAS_COLOR__ColorSpecAssignment_1_1_in_rule__CANVAS_COLOR__Alternatives_13139);
                    rule__CANVAS_COLOR__ColorSpecAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCANVAS_COLORAccess().getColorSpecAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__Alternatives_1"


    // $ANTLR start "rule__COLOR__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1476:1: rule__COLOR__Alternatives : ( ( 'BLACK' ) | ( 'BLUE' ) | ( 'CYAN' ) | ( 'DARK GRAY' ) | ( 'GRAY' ) | ( 'GREEN' ) | ( 'LIGHTGRAY' ) | ( 'MAGENTA' ) | ( 'ORANGE' ) | ( 'PINK' ) | ( 'RED' ) | ( 'WHITE' ) | ( 'YELLOW' ) );
    public final void rule__COLOR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1480:1: ( ( 'BLACK' ) | ( 'BLUE' ) | ( 'CYAN' ) | ( 'DARK GRAY' ) | ( 'GRAY' ) | ( 'GREEN' ) | ( 'LIGHTGRAY' ) | ( 'MAGENTA' ) | ( 'ORANGE' ) | ( 'PINK' ) | ( 'RED' ) | ( 'WHITE' ) | ( 'YELLOW' ) )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            case 17:
                {
                alt8=6;
                }
                break;
            case 18:
                {
                alt8=7;
                }
                break;
            case 19:
                {
                alt8=8;
                }
                break;
            case 20:
                {
                alt8=9;
                }
                break;
            case 21:
                {
                alt8=10;
                }
                break;
            case 22:
                {
                alt8=11;
                }
                break;
            case 23:
                {
                alt8=12;
                }
                break;
            case 24:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1481:1: ( 'BLACK' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1481:1: ( 'BLACK' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1482:1: 'BLACK'
                    {
                     before(grammarAccess.getCOLORAccess().getBLACKKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__COLOR__Alternatives3173); 
                     after(grammarAccess.getCOLORAccess().getBLACKKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1489:6: ( 'BLUE' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1489:6: ( 'BLUE' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1490:1: 'BLUE'
                    {
                     before(grammarAccess.getCOLORAccess().getBLUEKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__COLOR__Alternatives3193); 
                     after(grammarAccess.getCOLORAccess().getBLUEKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1497:6: ( 'CYAN' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1497:6: ( 'CYAN' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1498:1: 'CYAN'
                    {
                     before(grammarAccess.getCOLORAccess().getCYANKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__COLOR__Alternatives3213); 
                     after(grammarAccess.getCOLORAccess().getCYANKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1505:6: ( 'DARK GRAY' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1505:6: ( 'DARK GRAY' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1506:1: 'DARK GRAY'
                    {
                     before(grammarAccess.getCOLORAccess().getDARKGRAYKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__COLOR__Alternatives3233); 
                     after(grammarAccess.getCOLORAccess().getDARKGRAYKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1513:6: ( 'GRAY' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1513:6: ( 'GRAY' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1514:1: 'GRAY'
                    {
                     before(grammarAccess.getCOLORAccess().getGRAYKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__COLOR__Alternatives3253); 
                     after(grammarAccess.getCOLORAccess().getGRAYKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1521:6: ( 'GREEN' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1521:6: ( 'GREEN' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1522:1: 'GREEN'
                    {
                     before(grammarAccess.getCOLORAccess().getGREENKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__COLOR__Alternatives3273); 
                     after(grammarAccess.getCOLORAccess().getGREENKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1529:6: ( 'LIGHTGRAY' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1529:6: ( 'LIGHTGRAY' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1530:1: 'LIGHTGRAY'
                    {
                     before(grammarAccess.getCOLORAccess().getLIGHTGRAYKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__COLOR__Alternatives3293); 
                     after(grammarAccess.getCOLORAccess().getLIGHTGRAYKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1537:6: ( 'MAGENTA' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1537:6: ( 'MAGENTA' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1538:1: 'MAGENTA'
                    {
                     before(grammarAccess.getCOLORAccess().getMAGENTAKeyword_7()); 
                    match(input,19,FOLLOW_19_in_rule__COLOR__Alternatives3313); 
                     after(grammarAccess.getCOLORAccess().getMAGENTAKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1545:6: ( 'ORANGE' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1545:6: ( 'ORANGE' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1546:1: 'ORANGE'
                    {
                     before(grammarAccess.getCOLORAccess().getORANGEKeyword_8()); 
                    match(input,20,FOLLOW_20_in_rule__COLOR__Alternatives3333); 
                     after(grammarAccess.getCOLORAccess().getORANGEKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1553:6: ( 'PINK' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1553:6: ( 'PINK' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1554:1: 'PINK'
                    {
                     before(grammarAccess.getCOLORAccess().getPINKKeyword_9()); 
                    match(input,21,FOLLOW_21_in_rule__COLOR__Alternatives3353); 
                     after(grammarAccess.getCOLORAccess().getPINKKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1561:6: ( 'RED' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1561:6: ( 'RED' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1562:1: 'RED'
                    {
                     before(grammarAccess.getCOLORAccess().getREDKeyword_10()); 
                    match(input,22,FOLLOW_22_in_rule__COLOR__Alternatives3373); 
                     after(grammarAccess.getCOLORAccess().getREDKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1569:6: ( 'WHITE' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1569:6: ( 'WHITE' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1570:1: 'WHITE'
                    {
                     before(grammarAccess.getCOLORAccess().getWHITEKeyword_11()); 
                    match(input,23,FOLLOW_23_in_rule__COLOR__Alternatives3393); 
                     after(grammarAccess.getCOLORAccess().getWHITEKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1577:6: ( 'YELLOW' )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1577:6: ( 'YELLOW' )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1578:1: 'YELLOW'
                    {
                     before(grammarAccess.getCOLORAccess().getYELLOWKeyword_12()); 
                    match(input,24,FOLLOW_24_in_rule__COLOR__Alternatives3413); 
                     after(grammarAccess.getCOLORAccess().getYELLOWKeyword_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR__Alternatives"


    // $ANTLR start "rule__FONT_SPEC__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1590:1: rule__FONT_SPEC__Alternatives : ( ( ruleFONT_STYLE ) | ( ruleFONT_SIZE ) );
    public final void rule__FONT_SPEC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1594:1: ( ( ruleFONT_STYLE ) | ( ruleFONT_SIZE ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1595:1: ( ruleFONT_STYLE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1595:1: ( ruleFONT_STYLE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1596:1: ruleFONT_STYLE
                    {
                     before(grammarAccess.getFONT_SPECAccess().getFONT_STYLEParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFONT_STYLE_in_rule__FONT_SPEC__Alternatives3447);
                    ruleFONT_STYLE();

                    state._fsp--;

                     after(grammarAccess.getFONT_SPECAccess().getFONT_STYLEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1601:6: ( ruleFONT_SIZE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1601:6: ( ruleFONT_SIZE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1602:1: ruleFONT_SIZE
                    {
                     before(grammarAccess.getFONT_SPECAccess().getFONT_SIZEParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFONT_SIZE_in_rule__FONT_SPEC__Alternatives3464);
                    ruleFONT_SIZE();

                    state._fsp--;

                     after(grammarAccess.getFONT_SPECAccess().getFONT_SIZEParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_SPEC__Alternatives"


    // $ANTLR start "rule__FontStyleValues__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1612:1: rule__FontStyleValues__Alternatives : ( ( ( rule__FontStyleValues__Group_0__0 ) ) | ( ( rule__FontStyleValues__Group_1__0 ) ) | ( ( rule__FontStyleValues__Group_2__0 ) ) );
    public final void rule__FontStyleValues__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1616:1: ( ( ( rule__FontStyleValues__Group_0__0 ) ) | ( ( rule__FontStyleValues__Group_1__0 ) ) | ( ( rule__FontStyleValues__Group_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1617:1: ( ( rule__FontStyleValues__Group_0__0 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1617:1: ( ( rule__FontStyleValues__Group_0__0 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1618:1: ( rule__FontStyleValues__Group_0__0 )
                    {
                     before(grammarAccess.getFontStyleValuesAccess().getGroup_0()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1619:1: ( rule__FontStyleValues__Group_0__0 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1619:2: rule__FontStyleValues__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FontStyleValues__Group_0__0_in_rule__FontStyleValues__Alternatives3496);
                    rule__FontStyleValues__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontStyleValuesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1623:6: ( ( rule__FontStyleValues__Group_1__0 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1623:6: ( ( rule__FontStyleValues__Group_1__0 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1624:1: ( rule__FontStyleValues__Group_1__0 )
                    {
                     before(grammarAccess.getFontStyleValuesAccess().getGroup_1()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1625:1: ( rule__FontStyleValues__Group_1__0 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1625:2: rule__FontStyleValues__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FontStyleValues__Group_1__0_in_rule__FontStyleValues__Alternatives3514);
                    rule__FontStyleValues__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontStyleValuesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1629:6: ( ( rule__FontStyleValues__Group_2__0 ) )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1629:6: ( ( rule__FontStyleValues__Group_2__0 ) )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1630:1: ( rule__FontStyleValues__Group_2__0 )
                    {
                     before(grammarAccess.getFontStyleValuesAccess().getGroup_2()); 
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1631:1: ( rule__FontStyleValues__Group_2__0 )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1631:2: rule__FontStyleValues__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FontStyleValues__Group_2__0_in_rule__FontStyleValues__Alternatives3532);
                    rule__FontStyleValues__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFontStyleValuesAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Alternatives"


    // $ANTLR start "rule__EXPRESSION__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1641:1: rule__EXPRESSION__Alternatives : ( ( ruleVARIABLE_REF ) | ( ruleVALUE ) );
    public final void rule__EXPRESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1645:1: ( ( ruleVARIABLE_REF ) | ( ruleVALUE ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DOUBLE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1646:1: ( ruleVARIABLE_REF )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1646:1: ( ruleVARIABLE_REF )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1647:1: ruleVARIABLE_REF
                    {
                     before(grammarAccess.getEXPRESSIONAccess().getVARIABLE_REFParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVARIABLE_REF_in_rule__EXPRESSION__Alternatives3566);
                    ruleVARIABLE_REF();

                    state._fsp--;

                     after(grammarAccess.getEXPRESSIONAccess().getVARIABLE_REFParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1652:6: ( ruleVALUE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1652:6: ( ruleVALUE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1653:1: ruleVALUE
                    {
                     before(grammarAccess.getEXPRESSIONAccess().getVALUEParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVALUE_in_rule__EXPRESSION__Alternatives3583);
                    ruleVALUE();

                    state._fsp--;

                     after(grammarAccess.getEXPRESSIONAccess().getVALUEParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Alternatives"


    // $ANTLR start "rule__OPERATION__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1663:1: rule__OPERATION__Alternatives : ( ( ruleSUM ) | ( ruleSUBTRACT ) | ( ruleMULTIPLY ) | ( ruleDIVIDE ) );
    public final void rule__OPERATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1667:1: ( ( ruleSUM ) | ( ruleSUBTRACT ) | ( ruleMULTIPLY ) | ( ruleDIVIDE ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt12=1;
                }
                break;
            case 47:
                {
                alt12=2;
                }
                break;
            case 49:
                {
                alt12=3;
                }
                break;
            case 51:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1668:1: ( ruleSUM )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1668:1: ( ruleSUM )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1669:1: ruleSUM
                    {
                     before(grammarAccess.getOPERATIONAccess().getSUMParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSUM_in_rule__OPERATION__Alternatives3615);
                    ruleSUM();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getSUMParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1674:6: ( ruleSUBTRACT )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1674:6: ( ruleSUBTRACT )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1675:1: ruleSUBTRACT
                    {
                     before(grammarAccess.getOPERATIONAccess().getSUBTRACTParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSUBTRACT_in_rule__OPERATION__Alternatives3632);
                    ruleSUBTRACT();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getSUBTRACTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1680:6: ( ruleMULTIPLY )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1680:6: ( ruleMULTIPLY )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1681:1: ruleMULTIPLY
                    {
                     before(grammarAccess.getOPERATIONAccess().getMULTIPLYParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMULTIPLY_in_rule__OPERATION__Alternatives3649);
                    ruleMULTIPLY();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getMULTIPLYParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1686:6: ( ruleDIVIDE )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1686:6: ( ruleDIVIDE )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1687:1: ruleDIVIDE
                    {
                     before(grammarAccess.getOPERATIONAccess().getDIVIDEParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDIVIDE_in_rule__OPERATION__Alternatives3666);
                    ruleDIVIDE();

                    state._fsp--;

                     after(grammarAccess.getOPERATIONAccess().getDIVIDEParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OPERATION__Alternatives"


    // $ANTLR start "rule__CONTROL_SENTENCES__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1697:1: rule__CONTROL_SENTENCES__Alternatives : ( ( ruleREPEAT ) | ( ruleTO ) | ( ruleIF ) );
    public final void rule__CONTROL_SENTENCES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1701:1: ( ( ruleREPEAT ) | ( ruleTO ) | ( ruleIF ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt13=1;
                }
                break;
            case 55:
                {
                alt13=2;
                }
                break;
            case 58:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1702:1: ( ruleREPEAT )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1702:1: ( ruleREPEAT )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1703:1: ruleREPEAT
                    {
                     before(grammarAccess.getCONTROL_SENTENCESAccess().getREPEATParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleREPEAT_in_rule__CONTROL_SENTENCES__Alternatives3698);
                    ruleREPEAT();

                    state._fsp--;

                     after(grammarAccess.getCONTROL_SENTENCESAccess().getREPEATParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1708:6: ( ruleTO )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1708:6: ( ruleTO )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1709:1: ruleTO
                    {
                     before(grammarAccess.getCONTROL_SENTENCESAccess().getTOParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTO_in_rule__CONTROL_SENTENCES__Alternatives3715);
                    ruleTO();

                    state._fsp--;

                     after(grammarAccess.getCONTROL_SENTENCESAccess().getTOParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1714:6: ( ruleIF )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1714:6: ( ruleIF )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1715:1: ruleIF
                    {
                     before(grammarAccess.getCONTROL_SENTENCESAccess().getIFParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIF_in_rule__CONTROL_SENTENCES__Alternatives3732);
                    ruleIF();

                    state._fsp--;

                     after(grammarAccess.getCONTROL_SENTENCESAccess().getIFParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONTROL_SENTENCES__Alternatives"


    // $ANTLR start "rule__BOOLEAN_EXPRESSION__Alternatives"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1725:1: rule__BOOLEAN_EXPRESSION__Alternatives : ( ( ruleEQUALS ) | ( ruleGREATER_THAN ) | ( ruleLESSER_THAN ) );
    public final void rule__BOOLEAN_EXPRESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1729:1: ( ( ruleEQUALS ) | ( ruleGREATER_THAN ) | ( ruleLESSER_THAN ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt14=3;
                    }
                    break;
                case 60:
                    {
                    alt14=2;
                    }
                    break;
                case 43:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA14_0==RULE_DOUBLE) ) {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt14=3;
                    }
                    break;
                case 60:
                    {
                    alt14=2;
                    }
                    break;
                case 43:
                    {
                    alt14=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1730:1: ( ruleEQUALS )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1730:1: ( ruleEQUALS )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1731:1: ruleEQUALS
                    {
                     before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getEQUALSParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEQUALS_in_rule__BOOLEAN_EXPRESSION__Alternatives3764);
                    ruleEQUALS();

                    state._fsp--;

                     after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getEQUALSParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1736:6: ( ruleGREATER_THAN )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1736:6: ( ruleGREATER_THAN )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1737:1: ruleGREATER_THAN
                    {
                     before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getGREATER_THANParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGREATER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3781);
                    ruleGREATER_THAN();

                    state._fsp--;

                     after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getGREATER_THANParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1742:6: ( ruleLESSER_THAN )
                    {
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1742:6: ( ruleLESSER_THAN )
                    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1743:1: ruleLESSER_THAN
                    {
                     before(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getLESSER_THANParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLESSER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3798);
                    ruleLESSER_THAN();

                    state._fsp--;

                     after(grammarAccess.getBOOLEAN_EXPRESSIONAccess().getLESSER_THANParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN_EXPRESSION__Alternatives"


    // $ANTLR start "rule__FORWARD__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1755:1: rule__FORWARD__Group__0 : rule__FORWARD__Group__0__Impl rule__FORWARD__Group__1 ;
    public final void rule__FORWARD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1759:1: ( rule__FORWARD__Group__0__Impl rule__FORWARD__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1760:2: rule__FORWARD__Group__0__Impl rule__FORWARD__Group__1
            {
            pushFollow(FOLLOW_rule__FORWARD__Group__0__Impl_in_rule__FORWARD__Group__03828);
            rule__FORWARD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FORWARD__Group__1_in_rule__FORWARD__Group__03831);
            rule__FORWARD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FORWARD__Group__0"


    // $ANTLR start "rule__FORWARD__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1767:1: rule__FORWARD__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__FORWARD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1771:1: ( ( 'FORWARD' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1772:1: ( 'FORWARD' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1772:1: ( 'FORWARD' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1773:1: 'FORWARD'
            {
             before(grammarAccess.getFORWARDAccess().getFORWARDKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__FORWARD__Group__0__Impl3859); 
             after(grammarAccess.getFORWARDAccess().getFORWARDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FORWARD__Group__0__Impl"


    // $ANTLR start "rule__FORWARD__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1786:1: rule__FORWARD__Group__1 : rule__FORWARD__Group__1__Impl ;
    public final void rule__FORWARD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1790:1: ( rule__FORWARD__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1791:2: rule__FORWARD__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FORWARD__Group__1__Impl_in_rule__FORWARD__Group__13890);
            rule__FORWARD__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FORWARD__Group__1"


    // $ANTLR start "rule__FORWARD__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1797:1: rule__FORWARD__Group__1__Impl : ( ( rule__FORWARD__AmountAssignment_1 ) ) ;
    public final void rule__FORWARD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1801:1: ( ( ( rule__FORWARD__AmountAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1802:1: ( ( rule__FORWARD__AmountAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1802:1: ( ( rule__FORWARD__AmountAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1803:1: ( rule__FORWARD__AmountAssignment_1 )
            {
             before(grammarAccess.getFORWARDAccess().getAmountAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1804:1: ( rule__FORWARD__AmountAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1804:2: rule__FORWARD__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__FORWARD__AmountAssignment_1_in_rule__FORWARD__Group__1__Impl3917);
            rule__FORWARD__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFORWARDAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FORWARD__Group__1__Impl"


    // $ANTLR start "rule__LEFT__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1818:1: rule__LEFT__Group__0 : rule__LEFT__Group__0__Impl rule__LEFT__Group__1 ;
    public final void rule__LEFT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1822:1: ( rule__LEFT__Group__0__Impl rule__LEFT__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1823:2: rule__LEFT__Group__0__Impl rule__LEFT__Group__1
            {
            pushFollow(FOLLOW_rule__LEFT__Group__0__Impl_in_rule__LEFT__Group__03951);
            rule__LEFT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LEFT__Group__1_in_rule__LEFT__Group__03954);
            rule__LEFT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__0"


    // $ANTLR start "rule__LEFT__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1830:1: rule__LEFT__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__LEFT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1834:1: ( ( 'LEFT' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1835:1: ( 'LEFT' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1835:1: ( 'LEFT' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1836:1: 'LEFT'
            {
             before(grammarAccess.getLEFTAccess().getLEFTKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__LEFT__Group__0__Impl3982); 
             after(grammarAccess.getLEFTAccess().getLEFTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__0__Impl"


    // $ANTLR start "rule__LEFT__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1849:1: rule__LEFT__Group__1 : rule__LEFT__Group__1__Impl ;
    public final void rule__LEFT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1853:1: ( rule__LEFT__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1854:2: rule__LEFT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LEFT__Group__1__Impl_in_rule__LEFT__Group__14013);
            rule__LEFT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__1"


    // $ANTLR start "rule__LEFT__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1860:1: rule__LEFT__Group__1__Impl : ( ( rule__LEFT__AmountAssignment_1 ) ) ;
    public final void rule__LEFT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1864:1: ( ( ( rule__LEFT__AmountAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1865:1: ( ( rule__LEFT__AmountAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1865:1: ( ( rule__LEFT__AmountAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1866:1: ( rule__LEFT__AmountAssignment_1 )
            {
             before(grammarAccess.getLEFTAccess().getAmountAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1867:1: ( rule__LEFT__AmountAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1867:2: rule__LEFT__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__LEFT__AmountAssignment_1_in_rule__LEFT__Group__1__Impl4040);
            rule__LEFT__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLEFTAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__Group__1__Impl"


    // $ANTLR start "rule__RIGHT__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1881:1: rule__RIGHT__Group__0 : rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1 ;
    public final void rule__RIGHT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1885:1: ( rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1886:2: rule__RIGHT__Group__0__Impl rule__RIGHT__Group__1
            {
            pushFollow(FOLLOW_rule__RIGHT__Group__0__Impl_in_rule__RIGHT__Group__04074);
            rule__RIGHT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RIGHT__Group__1_in_rule__RIGHT__Group__04077);
            rule__RIGHT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__0"


    // $ANTLR start "rule__RIGHT__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1893:1: rule__RIGHT__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__RIGHT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1897:1: ( ( 'RIGHT' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1898:1: ( 'RIGHT' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1898:1: ( 'RIGHT' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1899:1: 'RIGHT'
            {
             before(grammarAccess.getRIGHTAccess().getRIGHTKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__RIGHT__Group__0__Impl4105); 
             after(grammarAccess.getRIGHTAccess().getRIGHTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__0__Impl"


    // $ANTLR start "rule__RIGHT__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1912:1: rule__RIGHT__Group__1 : rule__RIGHT__Group__1__Impl ;
    public final void rule__RIGHT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1916:1: ( rule__RIGHT__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1917:2: rule__RIGHT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RIGHT__Group__1__Impl_in_rule__RIGHT__Group__14136);
            rule__RIGHT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__1"


    // $ANTLR start "rule__RIGHT__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1923:1: rule__RIGHT__Group__1__Impl : ( ( rule__RIGHT__AmountAssignment_1 ) ) ;
    public final void rule__RIGHT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1927:1: ( ( ( rule__RIGHT__AmountAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1928:1: ( ( rule__RIGHT__AmountAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1928:1: ( ( rule__RIGHT__AmountAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1929:1: ( rule__RIGHT__AmountAssignment_1 )
            {
             before(grammarAccess.getRIGHTAccess().getAmountAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1930:1: ( rule__RIGHT__AmountAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1930:2: rule__RIGHT__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__RIGHT__AmountAssignment_1_in_rule__RIGHT__Group__1__Impl4163);
            rule__RIGHT__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRIGHTAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__Group__1__Impl"


    // $ANTLR start "rule__SET_X__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1944:1: rule__SET_X__Group__0 : rule__SET_X__Group__0__Impl rule__SET_X__Group__1 ;
    public final void rule__SET_X__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1948:1: ( rule__SET_X__Group__0__Impl rule__SET_X__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1949:2: rule__SET_X__Group__0__Impl rule__SET_X__Group__1
            {
            pushFollow(FOLLOW_rule__SET_X__Group__0__Impl_in_rule__SET_X__Group__04197);
            rule__SET_X__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SET_X__Group__1_in_rule__SET_X__Group__04200);
            rule__SET_X__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_X__Group__0"


    // $ANTLR start "rule__SET_X__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1956:1: rule__SET_X__Group__0__Impl : ( 'SETX' ) ;
    public final void rule__SET_X__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1960:1: ( ( 'SETX' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1961:1: ( 'SETX' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1961:1: ( 'SETX' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1962:1: 'SETX'
            {
             before(grammarAccess.getSET_XAccess().getSETXKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SET_X__Group__0__Impl4228); 
             after(grammarAccess.getSET_XAccess().getSETXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_X__Group__0__Impl"


    // $ANTLR start "rule__SET_X__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1975:1: rule__SET_X__Group__1 : rule__SET_X__Group__1__Impl ;
    public final void rule__SET_X__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1979:1: ( rule__SET_X__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1980:2: rule__SET_X__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SET_X__Group__1__Impl_in_rule__SET_X__Group__14259);
            rule__SET_X__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_X__Group__1"


    // $ANTLR start "rule__SET_X__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1986:1: rule__SET_X__Group__1__Impl : ( ( rule__SET_X__AmountAssignment_1 ) ) ;
    public final void rule__SET_X__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1990:1: ( ( ( rule__SET_X__AmountAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1991:1: ( ( rule__SET_X__AmountAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1991:1: ( ( rule__SET_X__AmountAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1992:1: ( rule__SET_X__AmountAssignment_1 )
            {
             before(grammarAccess.getSET_XAccess().getAmountAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1993:1: ( rule__SET_X__AmountAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:1993:2: rule__SET_X__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__SET_X__AmountAssignment_1_in_rule__SET_X__Group__1__Impl4286);
            rule__SET_X__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSET_XAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_X__Group__1__Impl"


    // $ANTLR start "rule__SET_Y__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2007:1: rule__SET_Y__Group__0 : rule__SET_Y__Group__0__Impl rule__SET_Y__Group__1 ;
    public final void rule__SET_Y__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2011:1: ( rule__SET_Y__Group__0__Impl rule__SET_Y__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2012:2: rule__SET_Y__Group__0__Impl rule__SET_Y__Group__1
            {
            pushFollow(FOLLOW_rule__SET_Y__Group__0__Impl_in_rule__SET_Y__Group__04320);
            rule__SET_Y__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SET_Y__Group__1_in_rule__SET_Y__Group__04323);
            rule__SET_Y__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_Y__Group__0"


    // $ANTLR start "rule__SET_Y__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2019:1: rule__SET_Y__Group__0__Impl : ( 'SETY' ) ;
    public final void rule__SET_Y__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2023:1: ( ( 'SETY' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2024:1: ( 'SETY' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2024:1: ( 'SETY' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2025:1: 'SETY'
            {
             before(grammarAccess.getSET_YAccess().getSETYKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__SET_Y__Group__0__Impl4351); 
             after(grammarAccess.getSET_YAccess().getSETYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_Y__Group__0__Impl"


    // $ANTLR start "rule__SET_Y__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2038:1: rule__SET_Y__Group__1 : rule__SET_Y__Group__1__Impl ;
    public final void rule__SET_Y__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2042:1: ( rule__SET_Y__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2043:2: rule__SET_Y__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SET_Y__Group__1__Impl_in_rule__SET_Y__Group__14382);
            rule__SET_Y__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_Y__Group__1"


    // $ANTLR start "rule__SET_Y__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2049:1: rule__SET_Y__Group__1__Impl : ( ( rule__SET_Y__AmountAssignment_1 ) ) ;
    public final void rule__SET_Y__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2053:1: ( ( ( rule__SET_Y__AmountAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2054:1: ( ( rule__SET_Y__AmountAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2054:1: ( ( rule__SET_Y__AmountAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2055:1: ( rule__SET_Y__AmountAssignment_1 )
            {
             before(grammarAccess.getSET_YAccess().getAmountAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2056:1: ( rule__SET_Y__AmountAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2056:2: rule__SET_Y__AmountAssignment_1
            {
            pushFollow(FOLLOW_rule__SET_Y__AmountAssignment_1_in_rule__SET_Y__Group__1__Impl4409);
            rule__SET_Y__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSET_YAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_Y__Group__1__Impl"


    // $ANTLR start "rule__PENDOWN__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2070:1: rule__PENDOWN__Group__0 : rule__PENDOWN__Group__0__Impl rule__PENDOWN__Group__1 ;
    public final void rule__PENDOWN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2074:1: ( rule__PENDOWN__Group__0__Impl rule__PENDOWN__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2075:2: rule__PENDOWN__Group__0__Impl rule__PENDOWN__Group__1
            {
            pushFollow(FOLLOW_rule__PENDOWN__Group__0__Impl_in_rule__PENDOWN__Group__04443);
            rule__PENDOWN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PENDOWN__Group__1_in_rule__PENDOWN__Group__04446);
            rule__PENDOWN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENDOWN__Group__0"


    // $ANTLR start "rule__PENDOWN__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2082:1: rule__PENDOWN__Group__0__Impl : ( () ) ;
    public final void rule__PENDOWN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2086:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2087:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2087:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2088:1: ()
            {
             before(grammarAccess.getPENDOWNAccess().getPENDOWNAction_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2089:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2091:1: 
            {
            }

             after(grammarAccess.getPENDOWNAccess().getPENDOWNAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENDOWN__Group__0__Impl"


    // $ANTLR start "rule__PENDOWN__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2101:1: rule__PENDOWN__Group__1 : rule__PENDOWN__Group__1__Impl ;
    public final void rule__PENDOWN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2105:1: ( rule__PENDOWN__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2106:2: rule__PENDOWN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PENDOWN__Group__1__Impl_in_rule__PENDOWN__Group__14504);
            rule__PENDOWN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENDOWN__Group__1"


    // $ANTLR start "rule__PENDOWN__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2112:1: rule__PENDOWN__Group__1__Impl : ( 'PENDOWN' ) ;
    public final void rule__PENDOWN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2116:1: ( ( 'PENDOWN' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2117:1: ( 'PENDOWN' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2117:1: ( 'PENDOWN' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2118:1: 'PENDOWN'
            {
             before(grammarAccess.getPENDOWNAccess().getPENDOWNKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__PENDOWN__Group__1__Impl4532); 
             after(grammarAccess.getPENDOWNAccess().getPENDOWNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENDOWN__Group__1__Impl"


    // $ANTLR start "rule__PENUP__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2135:1: rule__PENUP__Group__0 : rule__PENUP__Group__0__Impl rule__PENUP__Group__1 ;
    public final void rule__PENUP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2139:1: ( rule__PENUP__Group__0__Impl rule__PENUP__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2140:2: rule__PENUP__Group__0__Impl rule__PENUP__Group__1
            {
            pushFollow(FOLLOW_rule__PENUP__Group__0__Impl_in_rule__PENUP__Group__04567);
            rule__PENUP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PENUP__Group__1_in_rule__PENUP__Group__04570);
            rule__PENUP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENUP__Group__0"


    // $ANTLR start "rule__PENUP__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2147:1: rule__PENUP__Group__0__Impl : ( () ) ;
    public final void rule__PENUP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2151:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2152:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2152:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2153:1: ()
            {
             before(grammarAccess.getPENUPAccess().getPENUPAction_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2154:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2156:1: 
            {
            }

             after(grammarAccess.getPENUPAccess().getPENUPAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENUP__Group__0__Impl"


    // $ANTLR start "rule__PENUP__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2166:1: rule__PENUP__Group__1 : rule__PENUP__Group__1__Impl ;
    public final void rule__PENUP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2170:1: ( rule__PENUP__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2171:2: rule__PENUP__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PENUP__Group__1__Impl_in_rule__PENUP__Group__14628);
            rule__PENUP__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENUP__Group__1"


    // $ANTLR start "rule__PENUP__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2177:1: rule__PENUP__Group__1__Impl : ( 'PENUP' ) ;
    public final void rule__PENUP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2181:1: ( ( 'PENUP' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2182:1: ( 'PENUP' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2182:1: ( 'PENUP' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2183:1: 'PENUP'
            {
             before(grammarAccess.getPENUPAccess().getPENUPKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__PENUP__Group__1__Impl4656); 
             after(grammarAccess.getPENUPAccess().getPENUPKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENUP__Group__1__Impl"


    // $ANTLR start "rule__PENCOLOR__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2200:1: rule__PENCOLOR__Group__0 : rule__PENCOLOR__Group__0__Impl rule__PENCOLOR__Group__1 ;
    public final void rule__PENCOLOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2204:1: ( rule__PENCOLOR__Group__0__Impl rule__PENCOLOR__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2205:2: rule__PENCOLOR__Group__0__Impl rule__PENCOLOR__Group__1
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Group__0__Impl_in_rule__PENCOLOR__Group__04691);
            rule__PENCOLOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PENCOLOR__Group__1_in_rule__PENCOLOR__Group__04694);
            rule__PENCOLOR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__Group__0"


    // $ANTLR start "rule__PENCOLOR__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2212:1: rule__PENCOLOR__Group__0__Impl : ( 'PENCOLOR' ) ;
    public final void rule__PENCOLOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2216:1: ( ( 'PENCOLOR' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2217:1: ( 'PENCOLOR' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2217:1: ( 'PENCOLOR' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2218:1: 'PENCOLOR'
            {
             before(grammarAccess.getPENCOLORAccess().getPENCOLORKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PENCOLOR__Group__0__Impl4722); 
             after(grammarAccess.getPENCOLORAccess().getPENCOLORKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__Group__0__Impl"


    // $ANTLR start "rule__PENCOLOR__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2231:1: rule__PENCOLOR__Group__1 : rule__PENCOLOR__Group__1__Impl ;
    public final void rule__PENCOLOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2235:1: ( rule__PENCOLOR__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2236:2: rule__PENCOLOR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Group__1__Impl_in_rule__PENCOLOR__Group__14753);
            rule__PENCOLOR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__Group__1"


    // $ANTLR start "rule__PENCOLOR__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2242:1: rule__PENCOLOR__Group__1__Impl : ( ( rule__PENCOLOR__Alternatives_1 ) ) ;
    public final void rule__PENCOLOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2246:1: ( ( ( rule__PENCOLOR__Alternatives_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2247:1: ( ( rule__PENCOLOR__Alternatives_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2247:1: ( ( rule__PENCOLOR__Alternatives_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2248:1: ( rule__PENCOLOR__Alternatives_1 )
            {
             before(grammarAccess.getPENCOLORAccess().getAlternatives_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2249:1: ( rule__PENCOLOR__Alternatives_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2249:2: rule__PENCOLOR__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PENCOLOR__Alternatives_1_in_rule__PENCOLOR__Group__1__Impl4780);
            rule__PENCOLOR__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPENCOLORAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__Group__1__Impl"


    // $ANTLR start "rule__CANVAS_COLOR__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2263:1: rule__CANVAS_COLOR__Group__0 : rule__CANVAS_COLOR__Group__0__Impl rule__CANVAS_COLOR__Group__1 ;
    public final void rule__CANVAS_COLOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2267:1: ( rule__CANVAS_COLOR__Group__0__Impl rule__CANVAS_COLOR__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2268:2: rule__CANVAS_COLOR__Group__0__Impl rule__CANVAS_COLOR__Group__1
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__0__Impl_in_rule__CANVAS_COLOR__Group__04814);
            rule__CANVAS_COLOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__1_in_rule__CANVAS_COLOR__Group__04817);
            rule__CANVAS_COLOR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__Group__0"


    // $ANTLR start "rule__CANVAS_COLOR__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2275:1: rule__CANVAS_COLOR__Group__0__Impl : ( 'CANVASCOLOR' ) ;
    public final void rule__CANVAS_COLOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2279:1: ( ( 'CANVASCOLOR' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2280:1: ( 'CANVASCOLOR' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2280:1: ( 'CANVASCOLOR' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2281:1: 'CANVASCOLOR'
            {
             before(grammarAccess.getCANVAS_COLORAccess().getCANVASCOLORKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__CANVAS_COLOR__Group__0__Impl4845); 
             after(grammarAccess.getCANVAS_COLORAccess().getCANVASCOLORKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__Group__0__Impl"


    // $ANTLR start "rule__CANVAS_COLOR__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2294:1: rule__CANVAS_COLOR__Group__1 : rule__CANVAS_COLOR__Group__1__Impl ;
    public final void rule__CANVAS_COLOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2298:1: ( rule__CANVAS_COLOR__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2299:2: rule__CANVAS_COLOR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Group__1__Impl_in_rule__CANVAS_COLOR__Group__14876);
            rule__CANVAS_COLOR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__Group__1"


    // $ANTLR start "rule__CANVAS_COLOR__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2305:1: rule__CANVAS_COLOR__Group__1__Impl : ( ( rule__CANVAS_COLOR__Alternatives_1 ) ) ;
    public final void rule__CANVAS_COLOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2309:1: ( ( ( rule__CANVAS_COLOR__Alternatives_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2310:1: ( ( rule__CANVAS_COLOR__Alternatives_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2310:1: ( ( rule__CANVAS_COLOR__Alternatives_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2311:1: ( rule__CANVAS_COLOR__Alternatives_1 )
            {
             before(grammarAccess.getCANVAS_COLORAccess().getAlternatives_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2312:1: ( rule__CANVAS_COLOR__Alternatives_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2312:2: rule__CANVAS_COLOR__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CANVAS_COLOR__Alternatives_1_in_rule__CANVAS_COLOR__Group__1__Impl4903);
            rule__CANVAS_COLOR__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCANVAS_COLORAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__Group__1__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2326:1: rule__COLOR_SPEC__Group__0 : rule__COLOR_SPEC__Group__0__Impl rule__COLOR_SPEC__Group__1 ;
    public final void rule__COLOR_SPEC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2330:1: ( rule__COLOR_SPEC__Group__0__Impl rule__COLOR_SPEC__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2331:2: rule__COLOR_SPEC__Group__0__Impl rule__COLOR_SPEC__Group__1
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__0__Impl_in_rule__COLOR_SPEC__Group__04937);
            rule__COLOR_SPEC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__1_in_rule__COLOR_SPEC__Group__04940);
            rule__COLOR_SPEC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__0"


    // $ANTLR start "rule__COLOR_SPEC__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2338:1: rule__COLOR_SPEC__Group__0__Impl : ( ( rule__COLOR_SPEC__RedAssignment_0 ) ) ;
    public final void rule__COLOR_SPEC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2342:1: ( ( ( rule__COLOR_SPEC__RedAssignment_0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2343:1: ( ( rule__COLOR_SPEC__RedAssignment_0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2343:1: ( ( rule__COLOR_SPEC__RedAssignment_0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2344:1: ( rule__COLOR_SPEC__RedAssignment_0 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getRedAssignment_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2345:1: ( rule__COLOR_SPEC__RedAssignment_0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2345:2: rule__COLOR_SPEC__RedAssignment_0
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__RedAssignment_0_in_rule__COLOR_SPEC__Group__0__Impl4967);
            rule__COLOR_SPEC__RedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getRedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__0__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2355:1: rule__COLOR_SPEC__Group__1 : rule__COLOR_SPEC__Group__1__Impl rule__COLOR_SPEC__Group__2 ;
    public final void rule__COLOR_SPEC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2359:1: ( rule__COLOR_SPEC__Group__1__Impl rule__COLOR_SPEC__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2360:2: rule__COLOR_SPEC__Group__1__Impl rule__COLOR_SPEC__Group__2
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__1__Impl_in_rule__COLOR_SPEC__Group__14997);
            rule__COLOR_SPEC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__2_in_rule__COLOR_SPEC__Group__15000);
            rule__COLOR_SPEC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__1"


    // $ANTLR start "rule__COLOR_SPEC__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2367:1: rule__COLOR_SPEC__Group__1__Impl : ( ( rule__COLOR_SPEC__GreenAssignment_1 ) ) ;
    public final void rule__COLOR_SPEC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2371:1: ( ( ( rule__COLOR_SPEC__GreenAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2372:1: ( ( rule__COLOR_SPEC__GreenAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2372:1: ( ( rule__COLOR_SPEC__GreenAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2373:1: ( rule__COLOR_SPEC__GreenAssignment_1 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getGreenAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2374:1: ( rule__COLOR_SPEC__GreenAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2374:2: rule__COLOR_SPEC__GreenAssignment_1
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__GreenAssignment_1_in_rule__COLOR_SPEC__Group__1__Impl5027);
            rule__COLOR_SPEC__GreenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getGreenAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__1__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2384:1: rule__COLOR_SPEC__Group__2 : rule__COLOR_SPEC__Group__2__Impl rule__COLOR_SPEC__Group__3 ;
    public final void rule__COLOR_SPEC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2388:1: ( rule__COLOR_SPEC__Group__2__Impl rule__COLOR_SPEC__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2389:2: rule__COLOR_SPEC__Group__2__Impl rule__COLOR_SPEC__Group__3
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__2__Impl_in_rule__COLOR_SPEC__Group__25057);
            rule__COLOR_SPEC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__3_in_rule__COLOR_SPEC__Group__25060);
            rule__COLOR_SPEC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__2"


    // $ANTLR start "rule__COLOR_SPEC__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2396:1: rule__COLOR_SPEC__Group__2__Impl : ( ( rule__COLOR_SPEC__BlueAssignment_2 ) ) ;
    public final void rule__COLOR_SPEC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2400:1: ( ( ( rule__COLOR_SPEC__BlueAssignment_2 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2401:1: ( ( rule__COLOR_SPEC__BlueAssignment_2 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2401:1: ( ( rule__COLOR_SPEC__BlueAssignment_2 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2402:1: ( rule__COLOR_SPEC__BlueAssignment_2 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getBlueAssignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2403:1: ( rule__COLOR_SPEC__BlueAssignment_2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2403:2: rule__COLOR_SPEC__BlueAssignment_2
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__BlueAssignment_2_in_rule__COLOR_SPEC__Group__2__Impl5087);
            rule__COLOR_SPEC__BlueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getBlueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__2__Impl"


    // $ANTLR start "rule__COLOR_SPEC__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2413:1: rule__COLOR_SPEC__Group__3 : rule__COLOR_SPEC__Group__3__Impl ;
    public final void rule__COLOR_SPEC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2417:1: ( rule__COLOR_SPEC__Group__3__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2418:2: rule__COLOR_SPEC__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__Group__3__Impl_in_rule__COLOR_SPEC__Group__35117);
            rule__COLOR_SPEC__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__3"


    // $ANTLR start "rule__COLOR_SPEC__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2424:1: rule__COLOR_SPEC__Group__3__Impl : ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) ) ;
    public final void rule__COLOR_SPEC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2428:1: ( ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2429:1: ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2429:1: ( ( rule__COLOR_SPEC__AlphaAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2430:1: ( rule__COLOR_SPEC__AlphaAssignment_3 )
            {
             before(grammarAccess.getCOLOR_SPECAccess().getAlphaAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2431:1: ( rule__COLOR_SPEC__AlphaAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2431:2: rule__COLOR_SPEC__AlphaAssignment_3
            {
            pushFollow(FOLLOW_rule__COLOR_SPEC__AlphaAssignment_3_in_rule__COLOR_SPEC__Group__3__Impl5144);
            rule__COLOR_SPEC__AlphaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCOLOR_SPECAccess().getAlphaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__Group__3__Impl"


    // $ANTLR start "rule__FONT_SIZE__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2449:1: rule__FONT_SIZE__Group__0 : rule__FONT_SIZE__Group__0__Impl rule__FONT_SIZE__Group__1 ;
    public final void rule__FONT_SIZE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2453:1: ( rule__FONT_SIZE__Group__0__Impl rule__FONT_SIZE__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2454:2: rule__FONT_SIZE__Group__0__Impl rule__FONT_SIZE__Group__1
            {
            pushFollow(FOLLOW_rule__FONT_SIZE__Group__0__Impl_in_rule__FONT_SIZE__Group__05182);
            rule__FONT_SIZE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FONT_SIZE__Group__1_in_rule__FONT_SIZE__Group__05185);
            rule__FONT_SIZE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_SIZE__Group__0"


    // $ANTLR start "rule__FONT_SIZE__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2461:1: rule__FONT_SIZE__Group__0__Impl : ( 'FONTSIZE' ) ;
    public final void rule__FONT_SIZE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2465:1: ( ( 'FONTSIZE' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2466:1: ( 'FONTSIZE' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2466:1: ( 'FONTSIZE' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2467:1: 'FONTSIZE'
            {
             before(grammarAccess.getFONT_SIZEAccess().getFONTSIZEKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FONT_SIZE__Group__0__Impl5213); 
             after(grammarAccess.getFONT_SIZEAccess().getFONTSIZEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_SIZE__Group__0__Impl"


    // $ANTLR start "rule__FONT_SIZE__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2480:1: rule__FONT_SIZE__Group__1 : rule__FONT_SIZE__Group__1__Impl ;
    public final void rule__FONT_SIZE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2484:1: ( rule__FONT_SIZE__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2485:2: rule__FONT_SIZE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FONT_SIZE__Group__1__Impl_in_rule__FONT_SIZE__Group__15244);
            rule__FONT_SIZE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_SIZE__Group__1"


    // $ANTLR start "rule__FONT_SIZE__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2491:1: rule__FONT_SIZE__Group__1__Impl : ( ( rule__FONT_SIZE__SizeAssignment_1 ) ) ;
    public final void rule__FONT_SIZE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2495:1: ( ( ( rule__FONT_SIZE__SizeAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2496:1: ( ( rule__FONT_SIZE__SizeAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2496:1: ( ( rule__FONT_SIZE__SizeAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2497:1: ( rule__FONT_SIZE__SizeAssignment_1 )
            {
             before(grammarAccess.getFONT_SIZEAccess().getSizeAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2498:1: ( rule__FONT_SIZE__SizeAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2498:2: rule__FONT_SIZE__SizeAssignment_1
            {
            pushFollow(FOLLOW_rule__FONT_SIZE__SizeAssignment_1_in_rule__FONT_SIZE__Group__1__Impl5271);
            rule__FONT_SIZE__SizeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFONT_SIZEAccess().getSizeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_SIZE__Group__1__Impl"


    // $ANTLR start "rule__FONT_STYLE__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2512:1: rule__FONT_STYLE__Group__0 : rule__FONT_STYLE__Group__0__Impl rule__FONT_STYLE__Group__1 ;
    public final void rule__FONT_STYLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2516:1: ( rule__FONT_STYLE__Group__0__Impl rule__FONT_STYLE__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2517:2: rule__FONT_STYLE__Group__0__Impl rule__FONT_STYLE__Group__1
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__Group__0__Impl_in_rule__FONT_STYLE__Group__05305);
            rule__FONT_STYLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FONT_STYLE__Group__1_in_rule__FONT_STYLE__Group__05308);
            rule__FONT_STYLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_STYLE__Group__0"


    // $ANTLR start "rule__FONT_STYLE__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2524:1: rule__FONT_STYLE__Group__0__Impl : ( 'FONTSTYLE' ) ;
    public final void rule__FONT_STYLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2528:1: ( ( 'FONTSTYLE' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2529:1: ( 'FONTSTYLE' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2529:1: ( 'FONTSTYLE' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2530:1: 'FONTSTYLE'
            {
             before(grammarAccess.getFONT_STYLEAccess().getFONTSTYLEKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FONT_STYLE__Group__0__Impl5336); 
             after(grammarAccess.getFONT_STYLEAccess().getFONTSTYLEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_STYLE__Group__0__Impl"


    // $ANTLR start "rule__FONT_STYLE__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2543:1: rule__FONT_STYLE__Group__1 : rule__FONT_STYLE__Group__1__Impl ;
    public final void rule__FONT_STYLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2547:1: ( rule__FONT_STYLE__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2548:2: rule__FONT_STYLE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__Group__1__Impl_in_rule__FONT_STYLE__Group__15367);
            rule__FONT_STYLE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_STYLE__Group__1"


    // $ANTLR start "rule__FONT_STYLE__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2554:1: rule__FONT_STYLE__Group__1__Impl : ( ( rule__FONT_STYLE__StyleAssignment_1 ) ) ;
    public final void rule__FONT_STYLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2558:1: ( ( ( rule__FONT_STYLE__StyleAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2559:1: ( ( rule__FONT_STYLE__StyleAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2559:1: ( ( rule__FONT_STYLE__StyleAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2560:1: ( rule__FONT_STYLE__StyleAssignment_1 )
            {
             before(grammarAccess.getFONT_STYLEAccess().getStyleAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2561:1: ( rule__FONT_STYLE__StyleAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2561:2: rule__FONT_STYLE__StyleAssignment_1
            {
            pushFollow(FOLLOW_rule__FONT_STYLE__StyleAssignment_1_in_rule__FONT_STYLE__Group__1__Impl5394);
            rule__FONT_STYLE__StyleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFONT_STYLEAccess().getStyleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_STYLE__Group__1__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_0__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2575:1: rule__FontStyleValues__Group_0__0 : rule__FontStyleValues__Group_0__0__Impl rule__FontStyleValues__Group_0__1 ;
    public final void rule__FontStyleValues__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2579:1: ( rule__FontStyleValues__Group_0__0__Impl rule__FontStyleValues__Group_0__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2580:2: rule__FontStyleValues__Group_0__0__Impl rule__FontStyleValues__Group_0__1
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_0__0__Impl_in_rule__FontStyleValues__Group_0__05428);
            rule__FontStyleValues__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontStyleValues__Group_0__1_in_rule__FontStyleValues__Group_0__05431);
            rule__FontStyleValues__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_0__0"


    // $ANTLR start "rule__FontStyleValues__Group_0__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2587:1: rule__FontStyleValues__Group_0__0__Impl : ( () ) ;
    public final void rule__FontStyleValues__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2591:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2592:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2592:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2593:1: ()
            {
             before(grammarAccess.getFontStyleValuesAccess().getBOLDAction_0_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2594:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2596:1: 
            {
            }

             after(grammarAccess.getFontStyleValuesAccess().getBOLDAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_0__0__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_0__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2606:1: rule__FontStyleValues__Group_0__1 : rule__FontStyleValues__Group_0__1__Impl ;
    public final void rule__FontStyleValues__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2610:1: ( rule__FontStyleValues__Group_0__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2611:2: rule__FontStyleValues__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_0__1__Impl_in_rule__FontStyleValues__Group_0__15489);
            rule__FontStyleValues__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_0__1"


    // $ANTLR start "rule__FontStyleValues__Group_0__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2617:1: rule__FontStyleValues__Group_0__1__Impl : ( 'BOLD' ) ;
    public final void rule__FontStyleValues__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2621:1: ( ( 'BOLD' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2622:1: ( 'BOLD' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2622:1: ( 'BOLD' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2623:1: 'BOLD'
            {
             before(grammarAccess.getFontStyleValuesAccess().getBOLDKeyword_0_1()); 
            match(input,36,FOLLOW_36_in_rule__FontStyleValues__Group_0__1__Impl5517); 
             after(grammarAccess.getFontStyleValuesAccess().getBOLDKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_0__1__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_1__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2640:1: rule__FontStyleValues__Group_1__0 : rule__FontStyleValues__Group_1__0__Impl rule__FontStyleValues__Group_1__1 ;
    public final void rule__FontStyleValues__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2644:1: ( rule__FontStyleValues__Group_1__0__Impl rule__FontStyleValues__Group_1__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2645:2: rule__FontStyleValues__Group_1__0__Impl rule__FontStyleValues__Group_1__1
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_1__0__Impl_in_rule__FontStyleValues__Group_1__05552);
            rule__FontStyleValues__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontStyleValues__Group_1__1_in_rule__FontStyleValues__Group_1__05555);
            rule__FontStyleValues__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_1__0"


    // $ANTLR start "rule__FontStyleValues__Group_1__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2652:1: rule__FontStyleValues__Group_1__0__Impl : ( () ) ;
    public final void rule__FontStyleValues__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2656:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2657:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2657:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2658:1: ()
            {
             before(grammarAccess.getFontStyleValuesAccess().getITALICAction_1_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2659:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2661:1: 
            {
            }

             after(grammarAccess.getFontStyleValuesAccess().getITALICAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_1__0__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_1__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2671:1: rule__FontStyleValues__Group_1__1 : rule__FontStyleValues__Group_1__1__Impl ;
    public final void rule__FontStyleValues__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2675:1: ( rule__FontStyleValues__Group_1__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2676:2: rule__FontStyleValues__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_1__1__Impl_in_rule__FontStyleValues__Group_1__15613);
            rule__FontStyleValues__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_1__1"


    // $ANTLR start "rule__FontStyleValues__Group_1__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2682:1: rule__FontStyleValues__Group_1__1__Impl : ( 'ITALIC' ) ;
    public final void rule__FontStyleValues__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2686:1: ( ( 'ITALIC' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2687:1: ( 'ITALIC' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2687:1: ( 'ITALIC' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2688:1: 'ITALIC'
            {
             before(grammarAccess.getFontStyleValuesAccess().getITALICKeyword_1_1()); 
            match(input,37,FOLLOW_37_in_rule__FontStyleValues__Group_1__1__Impl5641); 
             after(grammarAccess.getFontStyleValuesAccess().getITALICKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_1__1__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_2__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2705:1: rule__FontStyleValues__Group_2__0 : rule__FontStyleValues__Group_2__0__Impl rule__FontStyleValues__Group_2__1 ;
    public final void rule__FontStyleValues__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2709:1: ( rule__FontStyleValues__Group_2__0__Impl rule__FontStyleValues__Group_2__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2710:2: rule__FontStyleValues__Group_2__0__Impl rule__FontStyleValues__Group_2__1
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_2__0__Impl_in_rule__FontStyleValues__Group_2__05676);
            rule__FontStyleValues__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FontStyleValues__Group_2__1_in_rule__FontStyleValues__Group_2__05679);
            rule__FontStyleValues__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_2__0"


    // $ANTLR start "rule__FontStyleValues__Group_2__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2717:1: rule__FontStyleValues__Group_2__0__Impl : ( () ) ;
    public final void rule__FontStyleValues__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2721:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2722:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2722:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2723:1: ()
            {
             before(grammarAccess.getFontStyleValuesAccess().getPLAINAction_2_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2724:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2726:1: 
            {
            }

             after(grammarAccess.getFontStyleValuesAccess().getPLAINAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_2__0__Impl"


    // $ANTLR start "rule__FontStyleValues__Group_2__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2736:1: rule__FontStyleValues__Group_2__1 : rule__FontStyleValues__Group_2__1__Impl ;
    public final void rule__FontStyleValues__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2740:1: ( rule__FontStyleValues__Group_2__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2741:2: rule__FontStyleValues__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FontStyleValues__Group_2__1__Impl_in_rule__FontStyleValues__Group_2__15737);
            rule__FontStyleValues__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_2__1"


    // $ANTLR start "rule__FontStyleValues__Group_2__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2747:1: rule__FontStyleValues__Group_2__1__Impl : ( 'PLAIN' ) ;
    public final void rule__FontStyleValues__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2751:1: ( ( 'PLAIN' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2752:1: ( 'PLAIN' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2752:1: ( 'PLAIN' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2753:1: 'PLAIN'
            {
             before(grammarAccess.getFontStyleValuesAccess().getPLAINKeyword_2_1()); 
            match(input,38,FOLLOW_38_in_rule__FontStyleValues__Group_2__1__Impl5765); 
             after(grammarAccess.getFontStyleValuesAccess().getPLAINKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FontStyleValues__Group_2__1__Impl"


    // $ANTLR start "rule__CLEAR__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2770:1: rule__CLEAR__Group__0 : rule__CLEAR__Group__0__Impl rule__CLEAR__Group__1 ;
    public final void rule__CLEAR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2774:1: ( rule__CLEAR__Group__0__Impl rule__CLEAR__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2775:2: rule__CLEAR__Group__0__Impl rule__CLEAR__Group__1
            {
            pushFollow(FOLLOW_rule__CLEAR__Group__0__Impl_in_rule__CLEAR__Group__05800);
            rule__CLEAR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CLEAR__Group__1_in_rule__CLEAR__Group__05803);
            rule__CLEAR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLEAR__Group__0"


    // $ANTLR start "rule__CLEAR__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2782:1: rule__CLEAR__Group__0__Impl : ( () ) ;
    public final void rule__CLEAR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2786:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2787:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2787:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2788:1: ()
            {
             before(grammarAccess.getCLEARAccess().getCLEARAction_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2789:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2791:1: 
            {
            }

             after(grammarAccess.getCLEARAccess().getCLEARAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLEAR__Group__0__Impl"


    // $ANTLR start "rule__CLEAR__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2801:1: rule__CLEAR__Group__1 : rule__CLEAR__Group__1__Impl ;
    public final void rule__CLEAR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2805:1: ( rule__CLEAR__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2806:2: rule__CLEAR__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CLEAR__Group__1__Impl_in_rule__CLEAR__Group__15861);
            rule__CLEAR__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLEAR__Group__1"


    // $ANTLR start "rule__CLEAR__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2812:1: rule__CLEAR__Group__1__Impl : ( 'CLEAR' ) ;
    public final void rule__CLEAR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2816:1: ( ( 'CLEAR' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2817:1: ( 'CLEAR' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2817:1: ( 'CLEAR' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2818:1: 'CLEAR'
            {
             before(grammarAccess.getCLEARAccess().getCLEARKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__CLEAR__Group__1__Impl5889); 
             after(grammarAccess.getCLEARAccess().getCLEARKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CLEAR__Group__1__Impl"


    // $ANTLR start "rule__HOME__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2835:1: rule__HOME__Group__0 : rule__HOME__Group__0__Impl rule__HOME__Group__1 ;
    public final void rule__HOME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2839:1: ( rule__HOME__Group__0__Impl rule__HOME__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2840:2: rule__HOME__Group__0__Impl rule__HOME__Group__1
            {
            pushFollow(FOLLOW_rule__HOME__Group__0__Impl_in_rule__HOME__Group__05924);
            rule__HOME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HOME__Group__1_in_rule__HOME__Group__05927);
            rule__HOME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOME__Group__0"


    // $ANTLR start "rule__HOME__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2847:1: rule__HOME__Group__0__Impl : ( () ) ;
    public final void rule__HOME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2851:1: ( ( () ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2852:1: ( () )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2852:1: ( () )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2853:1: ()
            {
             before(grammarAccess.getHOMEAccess().getHOMEAction_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2854:1: ()
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2856:1: 
            {
            }

             after(grammarAccess.getHOMEAccess().getHOMEAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOME__Group__0__Impl"


    // $ANTLR start "rule__HOME__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2866:1: rule__HOME__Group__1 : rule__HOME__Group__1__Impl ;
    public final void rule__HOME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2870:1: ( rule__HOME__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2871:2: rule__HOME__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__HOME__Group__1__Impl_in_rule__HOME__Group__15985);
            rule__HOME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOME__Group__1"


    // $ANTLR start "rule__HOME__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2877:1: rule__HOME__Group__1__Impl : ( 'HOME' ) ;
    public final void rule__HOME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2881:1: ( ( 'HOME' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2882:1: ( 'HOME' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2882:1: ( 'HOME' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2883:1: 'HOME'
            {
             before(grammarAccess.getHOMEAccess().getHOMEKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__HOME__Group__1__Impl6013); 
             after(grammarAccess.getHOMEAccess().getHOMEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HOME__Group__1__Impl"


    // $ANTLR start "rule__DRAW_STRING__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2900:1: rule__DRAW_STRING__Group__0 : rule__DRAW_STRING__Group__0__Impl rule__DRAW_STRING__Group__1 ;
    public final void rule__DRAW_STRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2904:1: ( rule__DRAW_STRING__Group__0__Impl rule__DRAW_STRING__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2905:2: rule__DRAW_STRING__Group__0__Impl rule__DRAW_STRING__Group__1
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__Group__0__Impl_in_rule__DRAW_STRING__Group__06048);
            rule__DRAW_STRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DRAW_STRING__Group__1_in_rule__DRAW_STRING__Group__06051);
            rule__DRAW_STRING__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRAW_STRING__Group__0"


    // $ANTLR start "rule__DRAW_STRING__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2912:1: rule__DRAW_STRING__Group__0__Impl : ( 'DRAWSTRING' ) ;
    public final void rule__DRAW_STRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2916:1: ( ( 'DRAWSTRING' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2917:1: ( 'DRAWSTRING' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2917:1: ( 'DRAWSTRING' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2918:1: 'DRAWSTRING'
            {
             before(grammarAccess.getDRAW_STRINGAccess().getDRAWSTRINGKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__DRAW_STRING__Group__0__Impl6079); 
             after(grammarAccess.getDRAW_STRINGAccess().getDRAWSTRINGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRAW_STRING__Group__0__Impl"


    // $ANTLR start "rule__DRAW_STRING__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2931:1: rule__DRAW_STRING__Group__1 : rule__DRAW_STRING__Group__1__Impl ;
    public final void rule__DRAW_STRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2935:1: ( rule__DRAW_STRING__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2936:2: rule__DRAW_STRING__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__Group__1__Impl_in_rule__DRAW_STRING__Group__16110);
            rule__DRAW_STRING__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRAW_STRING__Group__1"


    // $ANTLR start "rule__DRAW_STRING__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2942:1: rule__DRAW_STRING__Group__1__Impl : ( ( rule__DRAW_STRING__TextAssignment_1 ) ) ;
    public final void rule__DRAW_STRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2946:1: ( ( ( rule__DRAW_STRING__TextAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2947:1: ( ( rule__DRAW_STRING__TextAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2947:1: ( ( rule__DRAW_STRING__TextAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2948:1: ( rule__DRAW_STRING__TextAssignment_1 )
            {
             before(grammarAccess.getDRAW_STRINGAccess().getTextAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2949:1: ( rule__DRAW_STRING__TextAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2949:2: rule__DRAW_STRING__TextAssignment_1
            {
            pushFollow(FOLLOW_rule__DRAW_STRING__TextAssignment_1_in_rule__DRAW_STRING__Group__1__Impl6137);
            rule__DRAW_STRING__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDRAW_STRINGAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRAW_STRING__Group__1__Impl"


    // $ANTLR start "rule__MAKE__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2963:1: rule__MAKE__Group__0 : rule__MAKE__Group__0__Impl rule__MAKE__Group__1 ;
    public final void rule__MAKE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2967:1: ( rule__MAKE__Group__0__Impl rule__MAKE__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2968:2: rule__MAKE__Group__0__Impl rule__MAKE__Group__1
            {
            pushFollow(FOLLOW_rule__MAKE__Group__0__Impl_in_rule__MAKE__Group__06171);
            rule__MAKE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAKE__Group__1_in_rule__MAKE__Group__06174);
            rule__MAKE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__0"


    // $ANTLR start "rule__MAKE__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2975:1: rule__MAKE__Group__0__Impl : ( 'MAKE' ) ;
    public final void rule__MAKE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2979:1: ( ( 'MAKE' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2980:1: ( 'MAKE' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2980:1: ( 'MAKE' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2981:1: 'MAKE'
            {
             before(grammarAccess.getMAKEAccess().getMAKEKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__MAKE__Group__0__Impl6202); 
             after(grammarAccess.getMAKEAccess().getMAKEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__0__Impl"


    // $ANTLR start "rule__MAKE__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2994:1: rule__MAKE__Group__1 : rule__MAKE__Group__1__Impl rule__MAKE__Group__2 ;
    public final void rule__MAKE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2998:1: ( rule__MAKE__Group__1__Impl rule__MAKE__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:2999:2: rule__MAKE__Group__1__Impl rule__MAKE__Group__2
            {
            pushFollow(FOLLOW_rule__MAKE__Group__1__Impl_in_rule__MAKE__Group__16233);
            rule__MAKE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAKE__Group__2_in_rule__MAKE__Group__16236);
            rule__MAKE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__1"


    // $ANTLR start "rule__MAKE__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3006:1: rule__MAKE__Group__1__Impl : ( ( rule__MAKE__NameAssignment_1 ) ) ;
    public final void rule__MAKE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3010:1: ( ( ( rule__MAKE__NameAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3011:1: ( ( rule__MAKE__NameAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3011:1: ( ( rule__MAKE__NameAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3012:1: ( rule__MAKE__NameAssignment_1 )
            {
             before(grammarAccess.getMAKEAccess().getNameAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3013:1: ( rule__MAKE__NameAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3013:2: rule__MAKE__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MAKE__NameAssignment_1_in_rule__MAKE__Group__1__Impl6263);
            rule__MAKE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMAKEAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__1__Impl"


    // $ANTLR start "rule__MAKE__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3023:1: rule__MAKE__Group__2 : rule__MAKE__Group__2__Impl rule__MAKE__Group__3 ;
    public final void rule__MAKE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3027:1: ( rule__MAKE__Group__2__Impl rule__MAKE__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3028:2: rule__MAKE__Group__2__Impl rule__MAKE__Group__3
            {
            pushFollow(FOLLOW_rule__MAKE__Group__2__Impl_in_rule__MAKE__Group__26293);
            rule__MAKE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MAKE__Group__3_in_rule__MAKE__Group__26296);
            rule__MAKE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__2"


    // $ANTLR start "rule__MAKE__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3035:1: rule__MAKE__Group__2__Impl : ( '=' ) ;
    public final void rule__MAKE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3039:1: ( ( '=' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3040:1: ( '=' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3040:1: ( '=' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3041:1: '='
            {
             before(grammarAccess.getMAKEAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__MAKE__Group__2__Impl6324); 
             after(grammarAccess.getMAKEAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__2__Impl"


    // $ANTLR start "rule__MAKE__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3054:1: rule__MAKE__Group__3 : rule__MAKE__Group__3__Impl ;
    public final void rule__MAKE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3058:1: ( rule__MAKE__Group__3__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3059:2: rule__MAKE__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MAKE__Group__3__Impl_in_rule__MAKE__Group__36355);
            rule__MAKE__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__3"


    // $ANTLR start "rule__MAKE__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3065:1: rule__MAKE__Group__3__Impl : ( ( rule__MAKE__ValueAssignment_3 ) ) ;
    public final void rule__MAKE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3069:1: ( ( ( rule__MAKE__ValueAssignment_3 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3070:1: ( ( rule__MAKE__ValueAssignment_3 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3070:1: ( ( rule__MAKE__ValueAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3071:1: ( rule__MAKE__ValueAssignment_3 )
            {
             before(grammarAccess.getMAKEAccess().getValueAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3072:1: ( rule__MAKE__ValueAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3072:2: rule__MAKE__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__MAKE__ValueAssignment_3_in_rule__MAKE__Group__3__Impl6382);
            rule__MAKE__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMAKEAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__Group__3__Impl"


    // $ANTLR start "rule__CONTENT__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3090:1: rule__CONTENT__Group__0 : rule__CONTENT__Group__0__Impl rule__CONTENT__Group__1 ;
    public final void rule__CONTENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3094:1: ( rule__CONTENT__Group__0__Impl rule__CONTENT__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3095:2: rule__CONTENT__Group__0__Impl rule__CONTENT__Group__1
            {
            pushFollow(FOLLOW_rule__CONTENT__Group__0__Impl_in_rule__CONTENT__Group__06420);
            rule__CONTENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CONTENT__Group__1_in_rule__CONTENT__Group__06423);
            rule__CONTENT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONTENT__Group__0"


    // $ANTLR start "rule__CONTENT__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3102:1: rule__CONTENT__Group__0__Impl : ( 'CONTENT' ) ;
    public final void rule__CONTENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3106:1: ( ( 'CONTENT' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3107:1: ( 'CONTENT' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3107:1: ( 'CONTENT' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3108:1: 'CONTENT'
            {
             before(grammarAccess.getCONTENTAccess().getCONTENTKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__CONTENT__Group__0__Impl6451); 
             after(grammarAccess.getCONTENTAccess().getCONTENTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONTENT__Group__0__Impl"


    // $ANTLR start "rule__CONTENT__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3121:1: rule__CONTENT__Group__1 : rule__CONTENT__Group__1__Impl ;
    public final void rule__CONTENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3125:1: ( rule__CONTENT__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3126:2: rule__CONTENT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CONTENT__Group__1__Impl_in_rule__CONTENT__Group__16482);
            rule__CONTENT__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONTENT__Group__1"


    // $ANTLR start "rule__CONTENT__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3132:1: rule__CONTENT__Group__1__Impl : ( ( rule__CONTENT__VarAssignment_1 ) ) ;
    public final void rule__CONTENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3136:1: ( ( ( rule__CONTENT__VarAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3137:1: ( ( rule__CONTENT__VarAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3137:1: ( ( rule__CONTENT__VarAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3138:1: ( rule__CONTENT__VarAssignment_1 )
            {
             before(grammarAccess.getCONTENTAccess().getVarAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3139:1: ( rule__CONTENT__VarAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3139:2: rule__CONTENT__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__CONTENT__VarAssignment_1_in_rule__CONTENT__Group__1__Impl6509);
            rule__CONTENT__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCONTENTAccess().getVarAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONTENT__Group__1__Impl"


    // $ANTLR start "rule__SUM__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3153:1: rule__SUM__Group__0 : rule__SUM__Group__0__Impl rule__SUM__Group__1 ;
    public final void rule__SUM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3157:1: ( rule__SUM__Group__0__Impl rule__SUM__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3158:2: rule__SUM__Group__0__Impl rule__SUM__Group__1
            {
            pushFollow(FOLLOW_rule__SUM__Group__0__Impl_in_rule__SUM__Group__06543);
            rule__SUM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__1_in_rule__SUM__Group__06546);
            rule__SUM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__0"


    // $ANTLR start "rule__SUM__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3165:1: rule__SUM__Group__0__Impl : ( 'SUM' ) ;
    public final void rule__SUM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3169:1: ( ( 'SUM' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3170:1: ( 'SUM' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3170:1: ( 'SUM' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3171:1: 'SUM'
            {
             before(grammarAccess.getSUMAccess().getSUMKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__SUM__Group__0__Impl6574); 
             after(grammarAccess.getSUMAccess().getSUMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__0__Impl"


    // $ANTLR start "rule__SUM__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3184:1: rule__SUM__Group__1 : rule__SUM__Group__1__Impl rule__SUM__Group__2 ;
    public final void rule__SUM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3188:1: ( rule__SUM__Group__1__Impl rule__SUM__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3189:2: rule__SUM__Group__1__Impl rule__SUM__Group__2
            {
            pushFollow(FOLLOW_rule__SUM__Group__1__Impl_in_rule__SUM__Group__16605);
            rule__SUM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__2_in_rule__SUM__Group__16608);
            rule__SUM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__1"


    // $ANTLR start "rule__SUM__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3196:1: rule__SUM__Group__1__Impl : ( ( rule__SUM__TargetVariableAssignment_1 ) ) ;
    public final void rule__SUM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3200:1: ( ( ( rule__SUM__TargetVariableAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3201:1: ( ( rule__SUM__TargetVariableAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3201:1: ( ( rule__SUM__TargetVariableAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3202:1: ( rule__SUM__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getSUMAccess().getTargetVariableAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3203:1: ( rule__SUM__TargetVariableAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3203:2: rule__SUM__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__SUM__TargetVariableAssignment_1_in_rule__SUM__Group__1__Impl6635);
            rule__SUM__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getTargetVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__1__Impl"


    // $ANTLR start "rule__SUM__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3213:1: rule__SUM__Group__2 : rule__SUM__Group__2__Impl rule__SUM__Group__3 ;
    public final void rule__SUM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3217:1: ( rule__SUM__Group__2__Impl rule__SUM__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3218:2: rule__SUM__Group__2__Impl rule__SUM__Group__3
            {
            pushFollow(FOLLOW_rule__SUM__Group__2__Impl_in_rule__SUM__Group__26665);
            rule__SUM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__3_in_rule__SUM__Group__26668);
            rule__SUM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__2"


    // $ANTLR start "rule__SUM__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3225:1: rule__SUM__Group__2__Impl : ( '=' ) ;
    public final void rule__SUM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3229:1: ( ( '=' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3230:1: ( '=' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3230:1: ( '=' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3231:1: '='
            {
             before(grammarAccess.getSUMAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__SUM__Group__2__Impl6696); 
             after(grammarAccess.getSUMAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__2__Impl"


    // $ANTLR start "rule__SUM__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3244:1: rule__SUM__Group__3 : rule__SUM__Group__3__Impl rule__SUM__Group__4 ;
    public final void rule__SUM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3248:1: ( rule__SUM__Group__3__Impl rule__SUM__Group__4 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3249:2: rule__SUM__Group__3__Impl rule__SUM__Group__4
            {
            pushFollow(FOLLOW_rule__SUM__Group__3__Impl_in_rule__SUM__Group__36727);
            rule__SUM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__4_in_rule__SUM__Group__36730);
            rule__SUM__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__3"


    // $ANTLR start "rule__SUM__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3256:1: rule__SUM__Group__3__Impl : ( ( rule__SUM__ValOneAssignment_3 ) ) ;
    public final void rule__SUM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3260:1: ( ( ( rule__SUM__ValOneAssignment_3 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3261:1: ( ( rule__SUM__ValOneAssignment_3 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3261:1: ( ( rule__SUM__ValOneAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3262:1: ( rule__SUM__ValOneAssignment_3 )
            {
             before(grammarAccess.getSUMAccess().getValOneAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3263:1: ( rule__SUM__ValOneAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3263:2: rule__SUM__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__SUM__ValOneAssignment_3_in_rule__SUM__Group__3__Impl6757);
            rule__SUM__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getValOneAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__3__Impl"


    // $ANTLR start "rule__SUM__Group__4"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3273:1: rule__SUM__Group__4 : rule__SUM__Group__4__Impl rule__SUM__Group__5 ;
    public final void rule__SUM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3277:1: ( rule__SUM__Group__4__Impl rule__SUM__Group__5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3278:2: rule__SUM__Group__4__Impl rule__SUM__Group__5
            {
            pushFollow(FOLLOW_rule__SUM__Group__4__Impl_in_rule__SUM__Group__46787);
            rule__SUM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUM__Group__5_in_rule__SUM__Group__46790);
            rule__SUM__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__4"


    // $ANTLR start "rule__SUM__Group__4__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3285:1: rule__SUM__Group__4__Impl : ( '+' ) ;
    public final void rule__SUM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3289:1: ( ( '+' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3290:1: ( '+' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3290:1: ( '+' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3291:1: '+'
            {
             before(grammarAccess.getSUMAccess().getPlusSignKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__SUM__Group__4__Impl6818); 
             after(grammarAccess.getSUMAccess().getPlusSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__4__Impl"


    // $ANTLR start "rule__SUM__Group__5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3304:1: rule__SUM__Group__5 : rule__SUM__Group__5__Impl ;
    public final void rule__SUM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3308:1: ( rule__SUM__Group__5__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3309:2: rule__SUM__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SUM__Group__5__Impl_in_rule__SUM__Group__56849);
            rule__SUM__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__5"


    // $ANTLR start "rule__SUM__Group__5__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3315:1: rule__SUM__Group__5__Impl : ( ( rule__SUM__ValTwoAssignment_5 ) ) ;
    public final void rule__SUM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3319:1: ( ( ( rule__SUM__ValTwoAssignment_5 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3320:1: ( ( rule__SUM__ValTwoAssignment_5 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3320:1: ( ( rule__SUM__ValTwoAssignment_5 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3321:1: ( rule__SUM__ValTwoAssignment_5 )
            {
             before(grammarAccess.getSUMAccess().getValTwoAssignment_5()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3322:1: ( rule__SUM__ValTwoAssignment_5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3322:2: rule__SUM__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__SUM__ValTwoAssignment_5_in_rule__SUM__Group__5__Impl6876);
            rule__SUM__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSUMAccess().getValTwoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__Group__5__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3344:1: rule__SUBTRACT__Group__0 : rule__SUBTRACT__Group__0__Impl rule__SUBTRACT__Group__1 ;
    public final void rule__SUBTRACT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3348:1: ( rule__SUBTRACT__Group__0__Impl rule__SUBTRACT__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3349:2: rule__SUBTRACT__Group__0__Impl rule__SUBTRACT__Group__1
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__0__Impl_in_rule__SUBTRACT__Group__06918);
            rule__SUBTRACT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__1_in_rule__SUBTRACT__Group__06921);
            rule__SUBTRACT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__0"


    // $ANTLR start "rule__SUBTRACT__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3356:1: rule__SUBTRACT__Group__0__Impl : ( 'SUBTRACT' ) ;
    public final void rule__SUBTRACT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3360:1: ( ( 'SUBTRACT' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3361:1: ( 'SUBTRACT' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3361:1: ( 'SUBTRACT' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3362:1: 'SUBTRACT'
            {
             before(grammarAccess.getSUBTRACTAccess().getSUBTRACTKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__SUBTRACT__Group__0__Impl6949); 
             after(grammarAccess.getSUBTRACTAccess().getSUBTRACTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__0__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3375:1: rule__SUBTRACT__Group__1 : rule__SUBTRACT__Group__1__Impl rule__SUBTRACT__Group__2 ;
    public final void rule__SUBTRACT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3379:1: ( rule__SUBTRACT__Group__1__Impl rule__SUBTRACT__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3380:2: rule__SUBTRACT__Group__1__Impl rule__SUBTRACT__Group__2
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__1__Impl_in_rule__SUBTRACT__Group__16980);
            rule__SUBTRACT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__2_in_rule__SUBTRACT__Group__16983);
            rule__SUBTRACT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__1"


    // $ANTLR start "rule__SUBTRACT__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3387:1: rule__SUBTRACT__Group__1__Impl : ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) ) ;
    public final void rule__SUBTRACT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3391:1: ( ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3392:1: ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3392:1: ( ( rule__SUBTRACT__TargetVariableAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3393:1: ( rule__SUBTRACT__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getSUBTRACTAccess().getTargetVariableAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3394:1: ( rule__SUBTRACT__TargetVariableAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3394:2: rule__SUBTRACT__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__SUBTRACT__TargetVariableAssignment_1_in_rule__SUBTRACT__Group__1__Impl7010);
            rule__SUBTRACT__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getTargetVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__1__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3404:1: rule__SUBTRACT__Group__2 : rule__SUBTRACT__Group__2__Impl rule__SUBTRACT__Group__3 ;
    public final void rule__SUBTRACT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3408:1: ( rule__SUBTRACT__Group__2__Impl rule__SUBTRACT__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3409:2: rule__SUBTRACT__Group__2__Impl rule__SUBTRACT__Group__3
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__2__Impl_in_rule__SUBTRACT__Group__27040);
            rule__SUBTRACT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__3_in_rule__SUBTRACT__Group__27043);
            rule__SUBTRACT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__2"


    // $ANTLR start "rule__SUBTRACT__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3416:1: rule__SUBTRACT__Group__2__Impl : ( '=' ) ;
    public final void rule__SUBTRACT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3420:1: ( ( '=' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3421:1: ( '=' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3421:1: ( '=' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3422:1: '='
            {
             before(grammarAccess.getSUBTRACTAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__SUBTRACT__Group__2__Impl7071); 
             after(grammarAccess.getSUBTRACTAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__2__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3435:1: rule__SUBTRACT__Group__3 : rule__SUBTRACT__Group__3__Impl rule__SUBTRACT__Group__4 ;
    public final void rule__SUBTRACT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3439:1: ( rule__SUBTRACT__Group__3__Impl rule__SUBTRACT__Group__4 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3440:2: rule__SUBTRACT__Group__3__Impl rule__SUBTRACT__Group__4
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__3__Impl_in_rule__SUBTRACT__Group__37102);
            rule__SUBTRACT__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__4_in_rule__SUBTRACT__Group__37105);
            rule__SUBTRACT__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__3"


    // $ANTLR start "rule__SUBTRACT__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3447:1: rule__SUBTRACT__Group__3__Impl : ( ( rule__SUBTRACT__ValOneAssignment_3 ) ) ;
    public final void rule__SUBTRACT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3451:1: ( ( ( rule__SUBTRACT__ValOneAssignment_3 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3452:1: ( ( rule__SUBTRACT__ValOneAssignment_3 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3452:1: ( ( rule__SUBTRACT__ValOneAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3453:1: ( rule__SUBTRACT__ValOneAssignment_3 )
            {
             before(grammarAccess.getSUBTRACTAccess().getValOneAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3454:1: ( rule__SUBTRACT__ValOneAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3454:2: rule__SUBTRACT__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__SUBTRACT__ValOneAssignment_3_in_rule__SUBTRACT__Group__3__Impl7132);
            rule__SUBTRACT__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getValOneAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__3__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__4"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3464:1: rule__SUBTRACT__Group__4 : rule__SUBTRACT__Group__4__Impl rule__SUBTRACT__Group__5 ;
    public final void rule__SUBTRACT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3468:1: ( rule__SUBTRACT__Group__4__Impl rule__SUBTRACT__Group__5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3469:2: rule__SUBTRACT__Group__4__Impl rule__SUBTRACT__Group__5
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__4__Impl_in_rule__SUBTRACT__Group__47162);
            rule__SUBTRACT__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SUBTRACT__Group__5_in_rule__SUBTRACT__Group__47165);
            rule__SUBTRACT__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__4"


    // $ANTLR start "rule__SUBTRACT__Group__4__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3476:1: rule__SUBTRACT__Group__4__Impl : ( '-' ) ;
    public final void rule__SUBTRACT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3480:1: ( ( '-' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3481:1: ( '-' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3481:1: ( '-' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3482:1: '-'
            {
             before(grammarAccess.getSUBTRACTAccess().getHyphenMinusKeyword_4()); 
            match(input,48,FOLLOW_48_in_rule__SUBTRACT__Group__4__Impl7193); 
             after(grammarAccess.getSUBTRACTAccess().getHyphenMinusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__4__Impl"


    // $ANTLR start "rule__SUBTRACT__Group__5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3495:1: rule__SUBTRACT__Group__5 : rule__SUBTRACT__Group__5__Impl ;
    public final void rule__SUBTRACT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3499:1: ( rule__SUBTRACT__Group__5__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3500:2: rule__SUBTRACT__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SUBTRACT__Group__5__Impl_in_rule__SUBTRACT__Group__57224);
            rule__SUBTRACT__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__5"


    // $ANTLR start "rule__SUBTRACT__Group__5__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3506:1: rule__SUBTRACT__Group__5__Impl : ( ( rule__SUBTRACT__ValTwoAssignment_5 ) ) ;
    public final void rule__SUBTRACT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3510:1: ( ( ( rule__SUBTRACT__ValTwoAssignment_5 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3511:1: ( ( rule__SUBTRACT__ValTwoAssignment_5 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3511:1: ( ( rule__SUBTRACT__ValTwoAssignment_5 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3512:1: ( rule__SUBTRACT__ValTwoAssignment_5 )
            {
             before(grammarAccess.getSUBTRACTAccess().getValTwoAssignment_5()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3513:1: ( rule__SUBTRACT__ValTwoAssignment_5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3513:2: rule__SUBTRACT__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__SUBTRACT__ValTwoAssignment_5_in_rule__SUBTRACT__Group__5__Impl7251);
            rule__SUBTRACT__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSUBTRACTAccess().getValTwoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__Group__5__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3535:1: rule__MULTIPLY__Group__0 : rule__MULTIPLY__Group__0__Impl rule__MULTIPLY__Group__1 ;
    public final void rule__MULTIPLY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3539:1: ( rule__MULTIPLY__Group__0__Impl rule__MULTIPLY__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3540:2: rule__MULTIPLY__Group__0__Impl rule__MULTIPLY__Group__1
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__0__Impl_in_rule__MULTIPLY__Group__07293);
            rule__MULTIPLY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__1_in_rule__MULTIPLY__Group__07296);
            rule__MULTIPLY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__0"


    // $ANTLR start "rule__MULTIPLY__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3547:1: rule__MULTIPLY__Group__0__Impl : ( 'MULTIPLY' ) ;
    public final void rule__MULTIPLY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3551:1: ( ( 'MULTIPLY' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3552:1: ( 'MULTIPLY' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3552:1: ( 'MULTIPLY' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3553:1: 'MULTIPLY'
            {
             before(grammarAccess.getMULTIPLYAccess().getMULTIPLYKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__MULTIPLY__Group__0__Impl7324); 
             after(grammarAccess.getMULTIPLYAccess().getMULTIPLYKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__0__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3566:1: rule__MULTIPLY__Group__1 : rule__MULTIPLY__Group__1__Impl rule__MULTIPLY__Group__2 ;
    public final void rule__MULTIPLY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3570:1: ( rule__MULTIPLY__Group__1__Impl rule__MULTIPLY__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3571:2: rule__MULTIPLY__Group__1__Impl rule__MULTIPLY__Group__2
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__1__Impl_in_rule__MULTIPLY__Group__17355);
            rule__MULTIPLY__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__2_in_rule__MULTIPLY__Group__17358);
            rule__MULTIPLY__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__1"


    // $ANTLR start "rule__MULTIPLY__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3578:1: rule__MULTIPLY__Group__1__Impl : ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) ) ;
    public final void rule__MULTIPLY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3582:1: ( ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3583:1: ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3583:1: ( ( rule__MULTIPLY__TargetVariableAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3584:1: ( rule__MULTIPLY__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getMULTIPLYAccess().getTargetVariableAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3585:1: ( rule__MULTIPLY__TargetVariableAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3585:2: rule__MULTIPLY__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__MULTIPLY__TargetVariableAssignment_1_in_rule__MULTIPLY__Group__1__Impl7385);
            rule__MULTIPLY__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getTargetVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__1__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3595:1: rule__MULTIPLY__Group__2 : rule__MULTIPLY__Group__2__Impl rule__MULTIPLY__Group__3 ;
    public final void rule__MULTIPLY__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3599:1: ( rule__MULTIPLY__Group__2__Impl rule__MULTIPLY__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3600:2: rule__MULTIPLY__Group__2__Impl rule__MULTIPLY__Group__3
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__2__Impl_in_rule__MULTIPLY__Group__27415);
            rule__MULTIPLY__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__3_in_rule__MULTIPLY__Group__27418);
            rule__MULTIPLY__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__2"


    // $ANTLR start "rule__MULTIPLY__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3607:1: rule__MULTIPLY__Group__2__Impl : ( '=' ) ;
    public final void rule__MULTIPLY__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3611:1: ( ( '=' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3612:1: ( '=' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3612:1: ( '=' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3613:1: '='
            {
             before(grammarAccess.getMULTIPLYAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__MULTIPLY__Group__2__Impl7446); 
             after(grammarAccess.getMULTIPLYAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__2__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3626:1: rule__MULTIPLY__Group__3 : rule__MULTIPLY__Group__3__Impl rule__MULTIPLY__Group__4 ;
    public final void rule__MULTIPLY__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3630:1: ( rule__MULTIPLY__Group__3__Impl rule__MULTIPLY__Group__4 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3631:2: rule__MULTIPLY__Group__3__Impl rule__MULTIPLY__Group__4
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__3__Impl_in_rule__MULTIPLY__Group__37477);
            rule__MULTIPLY__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__4_in_rule__MULTIPLY__Group__37480);
            rule__MULTIPLY__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__3"


    // $ANTLR start "rule__MULTIPLY__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3638:1: rule__MULTIPLY__Group__3__Impl : ( ( rule__MULTIPLY__ValOneAssignment_3 ) ) ;
    public final void rule__MULTIPLY__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3642:1: ( ( ( rule__MULTIPLY__ValOneAssignment_3 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3643:1: ( ( rule__MULTIPLY__ValOneAssignment_3 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3643:1: ( ( rule__MULTIPLY__ValOneAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3644:1: ( rule__MULTIPLY__ValOneAssignment_3 )
            {
             before(grammarAccess.getMULTIPLYAccess().getValOneAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3645:1: ( rule__MULTIPLY__ValOneAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3645:2: rule__MULTIPLY__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__MULTIPLY__ValOneAssignment_3_in_rule__MULTIPLY__Group__3__Impl7507);
            rule__MULTIPLY__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getValOneAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__3__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__4"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3655:1: rule__MULTIPLY__Group__4 : rule__MULTIPLY__Group__4__Impl rule__MULTIPLY__Group__5 ;
    public final void rule__MULTIPLY__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3659:1: ( rule__MULTIPLY__Group__4__Impl rule__MULTIPLY__Group__5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3660:2: rule__MULTIPLY__Group__4__Impl rule__MULTIPLY__Group__5
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__4__Impl_in_rule__MULTIPLY__Group__47537);
            rule__MULTIPLY__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MULTIPLY__Group__5_in_rule__MULTIPLY__Group__47540);
            rule__MULTIPLY__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__4"


    // $ANTLR start "rule__MULTIPLY__Group__4__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3667:1: rule__MULTIPLY__Group__4__Impl : ( '*' ) ;
    public final void rule__MULTIPLY__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3671:1: ( ( '*' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3672:1: ( '*' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3672:1: ( '*' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3673:1: '*'
            {
             before(grammarAccess.getMULTIPLYAccess().getAsteriskKeyword_4()); 
            match(input,50,FOLLOW_50_in_rule__MULTIPLY__Group__4__Impl7568); 
             after(grammarAccess.getMULTIPLYAccess().getAsteriskKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__4__Impl"


    // $ANTLR start "rule__MULTIPLY__Group__5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3686:1: rule__MULTIPLY__Group__5 : rule__MULTIPLY__Group__5__Impl ;
    public final void rule__MULTIPLY__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3690:1: ( rule__MULTIPLY__Group__5__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3691:2: rule__MULTIPLY__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MULTIPLY__Group__5__Impl_in_rule__MULTIPLY__Group__57599);
            rule__MULTIPLY__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__5"


    // $ANTLR start "rule__MULTIPLY__Group__5__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3697:1: rule__MULTIPLY__Group__5__Impl : ( ( rule__MULTIPLY__ValTwoAssignment_5 ) ) ;
    public final void rule__MULTIPLY__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3701:1: ( ( ( rule__MULTIPLY__ValTwoAssignment_5 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3702:1: ( ( rule__MULTIPLY__ValTwoAssignment_5 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3702:1: ( ( rule__MULTIPLY__ValTwoAssignment_5 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3703:1: ( rule__MULTIPLY__ValTwoAssignment_5 )
            {
             before(grammarAccess.getMULTIPLYAccess().getValTwoAssignment_5()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3704:1: ( rule__MULTIPLY__ValTwoAssignment_5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3704:2: rule__MULTIPLY__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__MULTIPLY__ValTwoAssignment_5_in_rule__MULTIPLY__Group__5__Impl7626);
            rule__MULTIPLY__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLYAccess().getValTwoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__Group__5__Impl"


    // $ANTLR start "rule__DIVIDE__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3726:1: rule__DIVIDE__Group__0 : rule__DIVIDE__Group__0__Impl rule__DIVIDE__Group__1 ;
    public final void rule__DIVIDE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3730:1: ( rule__DIVIDE__Group__0__Impl rule__DIVIDE__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3731:2: rule__DIVIDE__Group__0__Impl rule__DIVIDE__Group__1
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__0__Impl_in_rule__DIVIDE__Group__07668);
            rule__DIVIDE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__1_in_rule__DIVIDE__Group__07671);
            rule__DIVIDE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__0"


    // $ANTLR start "rule__DIVIDE__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3738:1: rule__DIVIDE__Group__0__Impl : ( 'DIVIDE' ) ;
    public final void rule__DIVIDE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3742:1: ( ( 'DIVIDE' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3743:1: ( 'DIVIDE' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3743:1: ( 'DIVIDE' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3744:1: 'DIVIDE'
            {
             before(grammarAccess.getDIVIDEAccess().getDIVIDEKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__DIVIDE__Group__0__Impl7699); 
             after(grammarAccess.getDIVIDEAccess().getDIVIDEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__0__Impl"


    // $ANTLR start "rule__DIVIDE__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3757:1: rule__DIVIDE__Group__1 : rule__DIVIDE__Group__1__Impl rule__DIVIDE__Group__2 ;
    public final void rule__DIVIDE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3761:1: ( rule__DIVIDE__Group__1__Impl rule__DIVIDE__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3762:2: rule__DIVIDE__Group__1__Impl rule__DIVIDE__Group__2
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__1__Impl_in_rule__DIVIDE__Group__17730);
            rule__DIVIDE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__2_in_rule__DIVIDE__Group__17733);
            rule__DIVIDE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__1"


    // $ANTLR start "rule__DIVIDE__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3769:1: rule__DIVIDE__Group__1__Impl : ( ( rule__DIVIDE__TargetVariableAssignment_1 ) ) ;
    public final void rule__DIVIDE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3773:1: ( ( ( rule__DIVIDE__TargetVariableAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3774:1: ( ( rule__DIVIDE__TargetVariableAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3774:1: ( ( rule__DIVIDE__TargetVariableAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3775:1: ( rule__DIVIDE__TargetVariableAssignment_1 )
            {
             before(grammarAccess.getDIVIDEAccess().getTargetVariableAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3776:1: ( rule__DIVIDE__TargetVariableAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3776:2: rule__DIVIDE__TargetVariableAssignment_1
            {
            pushFollow(FOLLOW_rule__DIVIDE__TargetVariableAssignment_1_in_rule__DIVIDE__Group__1__Impl7760);
            rule__DIVIDE__TargetVariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getTargetVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__1__Impl"


    // $ANTLR start "rule__DIVIDE__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3786:1: rule__DIVIDE__Group__2 : rule__DIVIDE__Group__2__Impl rule__DIVIDE__Group__3 ;
    public final void rule__DIVIDE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3790:1: ( rule__DIVIDE__Group__2__Impl rule__DIVIDE__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3791:2: rule__DIVIDE__Group__2__Impl rule__DIVIDE__Group__3
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__2__Impl_in_rule__DIVIDE__Group__27790);
            rule__DIVIDE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__3_in_rule__DIVIDE__Group__27793);
            rule__DIVIDE__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__2"


    // $ANTLR start "rule__DIVIDE__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3798:1: rule__DIVIDE__Group__2__Impl : ( '=' ) ;
    public final void rule__DIVIDE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3802:1: ( ( '=' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3803:1: ( '=' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3803:1: ( '=' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3804:1: '='
            {
             before(grammarAccess.getDIVIDEAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_43_in_rule__DIVIDE__Group__2__Impl7821); 
             after(grammarAccess.getDIVIDEAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__2__Impl"


    // $ANTLR start "rule__DIVIDE__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3817:1: rule__DIVIDE__Group__3 : rule__DIVIDE__Group__3__Impl rule__DIVIDE__Group__4 ;
    public final void rule__DIVIDE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3821:1: ( rule__DIVIDE__Group__3__Impl rule__DIVIDE__Group__4 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3822:2: rule__DIVIDE__Group__3__Impl rule__DIVIDE__Group__4
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__3__Impl_in_rule__DIVIDE__Group__37852);
            rule__DIVIDE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__4_in_rule__DIVIDE__Group__37855);
            rule__DIVIDE__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__3"


    // $ANTLR start "rule__DIVIDE__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3829:1: rule__DIVIDE__Group__3__Impl : ( ( rule__DIVIDE__ValOneAssignment_3 ) ) ;
    public final void rule__DIVIDE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3833:1: ( ( ( rule__DIVIDE__ValOneAssignment_3 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3834:1: ( ( rule__DIVIDE__ValOneAssignment_3 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3834:1: ( ( rule__DIVIDE__ValOneAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3835:1: ( rule__DIVIDE__ValOneAssignment_3 )
            {
             before(grammarAccess.getDIVIDEAccess().getValOneAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3836:1: ( rule__DIVIDE__ValOneAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3836:2: rule__DIVIDE__ValOneAssignment_3
            {
            pushFollow(FOLLOW_rule__DIVIDE__ValOneAssignment_3_in_rule__DIVIDE__Group__3__Impl7882);
            rule__DIVIDE__ValOneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getValOneAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__3__Impl"


    // $ANTLR start "rule__DIVIDE__Group__4"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3846:1: rule__DIVIDE__Group__4 : rule__DIVIDE__Group__4__Impl rule__DIVIDE__Group__5 ;
    public final void rule__DIVIDE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3850:1: ( rule__DIVIDE__Group__4__Impl rule__DIVIDE__Group__5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3851:2: rule__DIVIDE__Group__4__Impl rule__DIVIDE__Group__5
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__4__Impl_in_rule__DIVIDE__Group__47912);
            rule__DIVIDE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DIVIDE__Group__5_in_rule__DIVIDE__Group__47915);
            rule__DIVIDE__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__4"


    // $ANTLR start "rule__DIVIDE__Group__4__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3858:1: rule__DIVIDE__Group__4__Impl : ( '/' ) ;
    public final void rule__DIVIDE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3862:1: ( ( '/' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3863:1: ( '/' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3863:1: ( '/' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3864:1: '/'
            {
             before(grammarAccess.getDIVIDEAccess().getSolidusKeyword_4()); 
            match(input,52,FOLLOW_52_in_rule__DIVIDE__Group__4__Impl7943); 
             after(grammarAccess.getDIVIDEAccess().getSolidusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__4__Impl"


    // $ANTLR start "rule__DIVIDE__Group__5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3877:1: rule__DIVIDE__Group__5 : rule__DIVIDE__Group__5__Impl ;
    public final void rule__DIVIDE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3881:1: ( rule__DIVIDE__Group__5__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3882:2: rule__DIVIDE__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DIVIDE__Group__5__Impl_in_rule__DIVIDE__Group__57974);
            rule__DIVIDE__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__5"


    // $ANTLR start "rule__DIVIDE__Group__5__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3888:1: rule__DIVIDE__Group__5__Impl : ( ( rule__DIVIDE__ValTwoAssignment_5 ) ) ;
    public final void rule__DIVIDE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3892:1: ( ( ( rule__DIVIDE__ValTwoAssignment_5 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3893:1: ( ( rule__DIVIDE__ValTwoAssignment_5 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3893:1: ( ( rule__DIVIDE__ValTwoAssignment_5 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3894:1: ( rule__DIVIDE__ValTwoAssignment_5 )
            {
             before(grammarAccess.getDIVIDEAccess().getValTwoAssignment_5()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3895:1: ( rule__DIVIDE__ValTwoAssignment_5 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3895:2: rule__DIVIDE__ValTwoAssignment_5
            {
            pushFollow(FOLLOW_rule__DIVIDE__ValTwoAssignment_5_in_rule__DIVIDE__Group__5__Impl8001);
            rule__DIVIDE__ValTwoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDIVIDEAccess().getValTwoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__Group__5__Impl"


    // $ANTLR start "rule__REPEAT__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3917:1: rule__REPEAT__Group__0 : rule__REPEAT__Group__0__Impl rule__REPEAT__Group__1 ;
    public final void rule__REPEAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3921:1: ( rule__REPEAT__Group__0__Impl rule__REPEAT__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3922:2: rule__REPEAT__Group__0__Impl rule__REPEAT__Group__1
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__0__Impl_in_rule__REPEAT__Group__08043);
            rule__REPEAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REPEAT__Group__1_in_rule__REPEAT__Group__08046);
            rule__REPEAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__0"


    // $ANTLR start "rule__REPEAT__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3929:1: rule__REPEAT__Group__0__Impl : ( 'REPEAT' ) ;
    public final void rule__REPEAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3933:1: ( ( 'REPEAT' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3934:1: ( 'REPEAT' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3934:1: ( 'REPEAT' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3935:1: 'REPEAT'
            {
             before(grammarAccess.getREPEATAccess().getREPEATKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__REPEAT__Group__0__Impl8074); 
             after(grammarAccess.getREPEATAccess().getREPEATKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__0__Impl"


    // $ANTLR start "rule__REPEAT__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3948:1: rule__REPEAT__Group__1 : rule__REPEAT__Group__1__Impl rule__REPEAT__Group__2 ;
    public final void rule__REPEAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3952:1: ( rule__REPEAT__Group__1__Impl rule__REPEAT__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3953:2: rule__REPEAT__Group__1__Impl rule__REPEAT__Group__2
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__1__Impl_in_rule__REPEAT__Group__18105);
            rule__REPEAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REPEAT__Group__2_in_rule__REPEAT__Group__18108);
            rule__REPEAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__1"


    // $ANTLR start "rule__REPEAT__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3960:1: rule__REPEAT__Group__1__Impl : ( ( rule__REPEAT__TimesAssignment_1 ) ) ;
    public final void rule__REPEAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3964:1: ( ( ( rule__REPEAT__TimesAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3965:1: ( ( rule__REPEAT__TimesAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3965:1: ( ( rule__REPEAT__TimesAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3966:1: ( rule__REPEAT__TimesAssignment_1 )
            {
             before(grammarAccess.getREPEATAccess().getTimesAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3967:1: ( rule__REPEAT__TimesAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3967:2: rule__REPEAT__TimesAssignment_1
            {
            pushFollow(FOLLOW_rule__REPEAT__TimesAssignment_1_in_rule__REPEAT__Group__1__Impl8135);
            rule__REPEAT__TimesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getREPEATAccess().getTimesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__1__Impl"


    // $ANTLR start "rule__REPEAT__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3977:1: rule__REPEAT__Group__2 : rule__REPEAT__Group__2__Impl rule__REPEAT__Group__3 ;
    public final void rule__REPEAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3981:1: ( rule__REPEAT__Group__2__Impl rule__REPEAT__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3982:2: rule__REPEAT__Group__2__Impl rule__REPEAT__Group__3
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__2__Impl_in_rule__REPEAT__Group__28165);
            rule__REPEAT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__REPEAT__Group__3_in_rule__REPEAT__Group__28168);
            rule__REPEAT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__2"


    // $ANTLR start "rule__REPEAT__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3989:1: rule__REPEAT__Group__2__Impl : ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) ) ;
    public final void rule__REPEAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3993:1: ( ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3994:1: ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3994:1: ( ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3995:1: ( ( rule__REPEAT__CommandsAssignment_2 ) ) ( ( rule__REPEAT__CommandsAssignment_2 )* )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3995:1: ( ( rule__REPEAT__CommandsAssignment_2 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3996:1: ( rule__REPEAT__CommandsAssignment_2 )
            {
             before(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3997:1: ( rule__REPEAT__CommandsAssignment_2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:3997:2: rule__REPEAT__CommandsAssignment_2
            {
            pushFollow(FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl8197);
            rule__REPEAT__CommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 

            }

            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4000:1: ( ( rule__REPEAT__CommandsAssignment_2 )* )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4001:1: ( rule__REPEAT__CommandsAssignment_2 )*
            {
             before(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4002:1: ( rule__REPEAT__CommandsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=25 && LA15_0<=35)||(LA15_0>=39 && LA15_0<=42)||(LA15_0>=44 && LA15_0<=45)||LA15_0==47||LA15_0==49||LA15_0==51||LA15_0==53||LA15_0==55||LA15_0==58) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4002:2: rule__REPEAT__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl8209);
            	    rule__REPEAT__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getREPEATAccess().getCommandsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__2__Impl"


    // $ANTLR start "rule__REPEAT__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4013:1: rule__REPEAT__Group__3 : rule__REPEAT__Group__3__Impl ;
    public final void rule__REPEAT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4017:1: ( rule__REPEAT__Group__3__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4018:2: rule__REPEAT__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__REPEAT__Group__3__Impl_in_rule__REPEAT__Group__38242);
            rule__REPEAT__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__3"


    // $ANTLR start "rule__REPEAT__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4024:1: rule__REPEAT__Group__3__Impl : ( 'END REPEAT' ) ;
    public final void rule__REPEAT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4028:1: ( ( 'END REPEAT' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4029:1: ( 'END REPEAT' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4029:1: ( 'END REPEAT' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4030:1: 'END REPEAT'
            {
             before(grammarAccess.getREPEATAccess().getENDREPEATKeyword_3()); 
            match(input,54,FOLLOW_54_in_rule__REPEAT__Group__3__Impl8270); 
             after(grammarAccess.getREPEATAccess().getENDREPEATKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__Group__3__Impl"


    // $ANTLR start "rule__TO__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4051:1: rule__TO__Group__0 : rule__TO__Group__0__Impl rule__TO__Group__1 ;
    public final void rule__TO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4055:1: ( rule__TO__Group__0__Impl rule__TO__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4056:2: rule__TO__Group__0__Impl rule__TO__Group__1
            {
            pushFollow(FOLLOW_rule__TO__Group__0__Impl_in_rule__TO__Group__08309);
            rule__TO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__1_in_rule__TO__Group__08312);
            rule__TO__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__0"


    // $ANTLR start "rule__TO__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4063:1: rule__TO__Group__0__Impl : ( 'TO' ) ;
    public final void rule__TO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4067:1: ( ( 'TO' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4068:1: ( 'TO' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4068:1: ( 'TO' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4069:1: 'TO'
            {
             before(grammarAccess.getTOAccess().getTOKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__TO__Group__0__Impl8340); 
             after(grammarAccess.getTOAccess().getTOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__0__Impl"


    // $ANTLR start "rule__TO__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4082:1: rule__TO__Group__1 : rule__TO__Group__1__Impl rule__TO__Group__2 ;
    public final void rule__TO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4086:1: ( rule__TO__Group__1__Impl rule__TO__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4087:2: rule__TO__Group__1__Impl rule__TO__Group__2
            {
            pushFollow(FOLLOW_rule__TO__Group__1__Impl_in_rule__TO__Group__18371);
            rule__TO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__2_in_rule__TO__Group__18374);
            rule__TO__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__1"


    // $ANTLR start "rule__TO__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4094:1: rule__TO__Group__1__Impl : ( ( rule__TO__NameAssignment_1 ) ) ;
    public final void rule__TO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4098:1: ( ( ( rule__TO__NameAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4099:1: ( ( rule__TO__NameAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4099:1: ( ( rule__TO__NameAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4100:1: ( rule__TO__NameAssignment_1 )
            {
             before(grammarAccess.getTOAccess().getNameAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4101:1: ( rule__TO__NameAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4101:2: rule__TO__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TO__NameAssignment_1_in_rule__TO__Group__1__Impl8401);
            rule__TO__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTOAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__1__Impl"


    // $ANTLR start "rule__TO__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4111:1: rule__TO__Group__2 : rule__TO__Group__2__Impl rule__TO__Group__3 ;
    public final void rule__TO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4115:1: ( rule__TO__Group__2__Impl rule__TO__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4116:2: rule__TO__Group__2__Impl rule__TO__Group__3
            {
            pushFollow(FOLLOW_rule__TO__Group__2__Impl_in_rule__TO__Group__28431);
            rule__TO__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__3_in_rule__TO__Group__28434);
            rule__TO__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__2"


    // $ANTLR start "rule__TO__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4123:1: rule__TO__Group__2__Impl : ( ( rule__TO__ParametersAssignment_2 )* ) ;
    public final void rule__TO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4127:1: ( ( ( rule__TO__ParametersAssignment_2 )* ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4128:1: ( ( rule__TO__ParametersAssignment_2 )* )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4128:1: ( ( rule__TO__ParametersAssignment_2 )* )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4129:1: ( rule__TO__ParametersAssignment_2 )*
            {
             before(grammarAccess.getTOAccess().getParametersAssignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4130:1: ( rule__TO__ParametersAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==57) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4130:2: rule__TO__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TO__ParametersAssignment_2_in_rule__TO__Group__2__Impl8461);
            	    rule__TO__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTOAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__2__Impl"


    // $ANTLR start "rule__TO__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4140:1: rule__TO__Group__3 : rule__TO__Group__3__Impl rule__TO__Group__4 ;
    public final void rule__TO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4144:1: ( rule__TO__Group__3__Impl rule__TO__Group__4 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4145:2: rule__TO__Group__3__Impl rule__TO__Group__4
            {
            pushFollow(FOLLOW_rule__TO__Group__3__Impl_in_rule__TO__Group__38492);
            rule__TO__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TO__Group__4_in_rule__TO__Group__38495);
            rule__TO__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__3"


    // $ANTLR start "rule__TO__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4152:1: rule__TO__Group__3__Impl : ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) ) ;
    public final void rule__TO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4156:1: ( ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4157:1: ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4157:1: ( ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4158:1: ( ( rule__TO__CommandsAssignment_3 ) ) ( ( rule__TO__CommandsAssignment_3 )* )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4158:1: ( ( rule__TO__CommandsAssignment_3 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4159:1: ( rule__TO__CommandsAssignment_3 )
            {
             before(grammarAccess.getTOAccess().getCommandsAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4160:1: ( rule__TO__CommandsAssignment_3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4160:2: rule__TO__CommandsAssignment_3
            {
            pushFollow(FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8524);
            rule__TO__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTOAccess().getCommandsAssignment_3()); 

            }

            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4163:1: ( ( rule__TO__CommandsAssignment_3 )* )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4164:1: ( rule__TO__CommandsAssignment_3 )*
            {
             before(grammarAccess.getTOAccess().getCommandsAssignment_3()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4165:1: ( rule__TO__CommandsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=25 && LA17_0<=35)||(LA17_0>=39 && LA17_0<=42)||(LA17_0>=44 && LA17_0<=45)||LA17_0==47||LA17_0==49||LA17_0==51||LA17_0==53||LA17_0==55||LA17_0==58) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4165:2: rule__TO__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8536);
            	    rule__TO__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTOAccess().getCommandsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__3__Impl"


    // $ANTLR start "rule__TO__Group__4"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4176:1: rule__TO__Group__4 : rule__TO__Group__4__Impl ;
    public final void rule__TO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4180:1: ( rule__TO__Group__4__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4181:2: rule__TO__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TO__Group__4__Impl_in_rule__TO__Group__48569);
            rule__TO__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__4"


    // $ANTLR start "rule__TO__Group__4__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4187:1: rule__TO__Group__4__Impl : ( 'END TO' ) ;
    public final void rule__TO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4191:1: ( ( 'END TO' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4192:1: ( 'END TO' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4192:1: ( 'END TO' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4193:1: 'END TO'
            {
             before(grammarAccess.getTOAccess().getENDTOKeyword_4()); 
            match(input,56,FOLLOW_56_in_rule__TO__Group__4__Impl8597); 
             after(grammarAccess.getTOAccess().getENDTOKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__Group__4__Impl"


    // $ANTLR start "rule__PARAM__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4216:1: rule__PARAM__Group__0 : rule__PARAM__Group__0__Impl rule__PARAM__Group__1 ;
    public final void rule__PARAM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4220:1: ( rule__PARAM__Group__0__Impl rule__PARAM__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4221:2: rule__PARAM__Group__0__Impl rule__PARAM__Group__1
            {
            pushFollow(FOLLOW_rule__PARAM__Group__0__Impl_in_rule__PARAM__Group__08638);
            rule__PARAM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PARAM__Group__1_in_rule__PARAM__Group__08641);
            rule__PARAM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAM__Group__0"


    // $ANTLR start "rule__PARAM__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4228:1: rule__PARAM__Group__0__Impl : ( ':' ) ;
    public final void rule__PARAM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4232:1: ( ( ':' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4233:1: ( ':' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4233:1: ( ':' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4234:1: ':'
            {
             before(grammarAccess.getPARAMAccess().getColonKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__PARAM__Group__0__Impl8669); 
             after(grammarAccess.getPARAMAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAM__Group__0__Impl"


    // $ANTLR start "rule__PARAM__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4247:1: rule__PARAM__Group__1 : rule__PARAM__Group__1__Impl ;
    public final void rule__PARAM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4251:1: ( rule__PARAM__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4252:2: rule__PARAM__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PARAM__Group__1__Impl_in_rule__PARAM__Group__18700);
            rule__PARAM__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAM__Group__1"


    // $ANTLR start "rule__PARAM__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4258:1: rule__PARAM__Group__1__Impl : ( ( rule__PARAM__NameAssignment_1 ) ) ;
    public final void rule__PARAM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4262:1: ( ( ( rule__PARAM__NameAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4263:1: ( ( rule__PARAM__NameAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4263:1: ( ( rule__PARAM__NameAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4264:1: ( rule__PARAM__NameAssignment_1 )
            {
             before(grammarAccess.getPARAMAccess().getNameAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4265:1: ( rule__PARAM__NameAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4265:2: rule__PARAM__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PARAM__NameAssignment_1_in_rule__PARAM__Group__1__Impl8727);
            rule__PARAM__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPARAMAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAM__Group__1__Impl"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4279:1: rule__PROCEDURE_CALL__Group__0 : rule__PROCEDURE_CALL__Group__0__Impl rule__PROCEDURE_CALL__Group__1 ;
    public final void rule__PROCEDURE_CALL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4283:1: ( rule__PROCEDURE_CALL__Group__0__Impl rule__PROCEDURE_CALL__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4284:2: rule__PROCEDURE_CALL__Group__0__Impl rule__PROCEDURE_CALL__Group__1
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__0__Impl_in_rule__PROCEDURE_CALL__Group__08761);
            rule__PROCEDURE_CALL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__1_in_rule__PROCEDURE_CALL__Group__08764);
            rule__PROCEDURE_CALL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE_CALL__Group__0"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4291:1: rule__PROCEDURE_CALL__Group__0__Impl : ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) ) ;
    public final void rule__PROCEDURE_CALL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4295:1: ( ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4296:1: ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4296:1: ( ( rule__PROCEDURE_CALL__ToAssignment_0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4297:1: ( rule__PROCEDURE_CALL__ToAssignment_0 )
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getToAssignment_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4298:1: ( rule__PROCEDURE_CALL__ToAssignment_0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4298:2: rule__PROCEDURE_CALL__ToAssignment_0
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__ToAssignment_0_in_rule__PROCEDURE_CALL__Group__0__Impl8791);
            rule__PROCEDURE_CALL__ToAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPROCEDURE_CALLAccess().getToAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE_CALL__Group__0__Impl"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4308:1: rule__PROCEDURE_CALL__Group__1 : rule__PROCEDURE_CALL__Group__1__Impl ;
    public final void rule__PROCEDURE_CALL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4312:1: ( rule__PROCEDURE_CALL__Group__1__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4313:2: rule__PROCEDURE_CALL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PROCEDURE_CALL__Group__1__Impl_in_rule__PROCEDURE_CALL__Group__18821);
            rule__PROCEDURE_CALL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE_CALL__Group__1"


    // $ANTLR start "rule__PROCEDURE_CALL__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4319:1: rule__PROCEDURE_CALL__Group__1__Impl : ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* ) ;
    public final void rule__PROCEDURE_CALL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4323:1: ( ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4324:1: ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4324:1: ( ( rule__PROCEDURE_CALL__ParamsAssignment_1 )* )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4325:1: ( rule__PROCEDURE_CALL__ParamsAssignment_1 )*
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getParamsAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4326:1: ( rule__PROCEDURE_CALL__ParamsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_DOUBLE)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4326:2: rule__PROCEDURE_CALL__ParamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PROCEDURE_CALL__ParamsAssignment_1_in_rule__PROCEDURE_CALL__Group__1__Impl8848);
            	    rule__PROCEDURE_CALL__ParamsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getPROCEDURE_CALLAccess().getParamsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE_CALL__Group__1__Impl"


    // $ANTLR start "rule__IF__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4340:1: rule__IF__Group__0 : rule__IF__Group__0__Impl rule__IF__Group__1 ;
    public final void rule__IF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4344:1: ( rule__IF__Group__0__Impl rule__IF__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4345:2: rule__IF__Group__0__Impl rule__IF__Group__1
            {
            pushFollow(FOLLOW_rule__IF__Group__0__Impl_in_rule__IF__Group__08883);
            rule__IF__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IF__Group__1_in_rule__IF__Group__08886);
            rule__IF__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__0"


    // $ANTLR start "rule__IF__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4352:1: rule__IF__Group__0__Impl : ( 'IF' ) ;
    public final void rule__IF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4356:1: ( ( 'IF' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4357:1: ( 'IF' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4357:1: ( 'IF' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4358:1: 'IF'
            {
             before(grammarAccess.getIFAccess().getIFKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__IF__Group__0__Impl8914); 
             after(grammarAccess.getIFAccess().getIFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__0__Impl"


    // $ANTLR start "rule__IF__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4371:1: rule__IF__Group__1 : rule__IF__Group__1__Impl rule__IF__Group__2 ;
    public final void rule__IF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4375:1: ( rule__IF__Group__1__Impl rule__IF__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4376:2: rule__IF__Group__1__Impl rule__IF__Group__2
            {
            pushFollow(FOLLOW_rule__IF__Group__1__Impl_in_rule__IF__Group__18945);
            rule__IF__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IF__Group__2_in_rule__IF__Group__18948);
            rule__IF__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__1"


    // $ANTLR start "rule__IF__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4383:1: rule__IF__Group__1__Impl : ( ( rule__IF__ConditionAssignment_1 ) ) ;
    public final void rule__IF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4387:1: ( ( ( rule__IF__ConditionAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4388:1: ( ( rule__IF__ConditionAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4388:1: ( ( rule__IF__ConditionAssignment_1 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4389:1: ( rule__IF__ConditionAssignment_1 )
            {
             before(grammarAccess.getIFAccess().getConditionAssignment_1()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4390:1: ( rule__IF__ConditionAssignment_1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4390:2: rule__IF__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__IF__ConditionAssignment_1_in_rule__IF__Group__1__Impl8975);
            rule__IF__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIFAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__1__Impl"


    // $ANTLR start "rule__IF__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4400:1: rule__IF__Group__2 : rule__IF__Group__2__Impl rule__IF__Group__3 ;
    public final void rule__IF__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4404:1: ( rule__IF__Group__2__Impl rule__IF__Group__3 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4405:2: rule__IF__Group__2__Impl rule__IF__Group__3
            {
            pushFollow(FOLLOW_rule__IF__Group__2__Impl_in_rule__IF__Group__29005);
            rule__IF__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IF__Group__3_in_rule__IF__Group__29008);
            rule__IF__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__2"


    // $ANTLR start "rule__IF__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4412:1: rule__IF__Group__2__Impl : ( ( ( rule__IF__CommandsAssignment_2 ) ) ( ( rule__IF__CommandsAssignment_2 )* ) ) ;
    public final void rule__IF__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4416:1: ( ( ( ( rule__IF__CommandsAssignment_2 ) ) ( ( rule__IF__CommandsAssignment_2 )* ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4417:1: ( ( ( rule__IF__CommandsAssignment_2 ) ) ( ( rule__IF__CommandsAssignment_2 )* ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4417:1: ( ( ( rule__IF__CommandsAssignment_2 ) ) ( ( rule__IF__CommandsAssignment_2 )* ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4418:1: ( ( rule__IF__CommandsAssignment_2 ) ) ( ( rule__IF__CommandsAssignment_2 )* )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4418:1: ( ( rule__IF__CommandsAssignment_2 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4419:1: ( rule__IF__CommandsAssignment_2 )
            {
             before(grammarAccess.getIFAccess().getCommandsAssignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4420:1: ( rule__IF__CommandsAssignment_2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4420:2: rule__IF__CommandsAssignment_2
            {
            pushFollow(FOLLOW_rule__IF__CommandsAssignment_2_in_rule__IF__Group__2__Impl9037);
            rule__IF__CommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIFAccess().getCommandsAssignment_2()); 

            }

            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4423:1: ( ( rule__IF__CommandsAssignment_2 )* )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4424:1: ( rule__IF__CommandsAssignment_2 )*
            {
             before(grammarAccess.getIFAccess().getCommandsAssignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4425:1: ( rule__IF__CommandsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=25 && LA19_0<=35)||(LA19_0>=39 && LA19_0<=42)||(LA19_0>=44 && LA19_0<=45)||LA19_0==47||LA19_0==49||LA19_0==51||LA19_0==53||LA19_0==55||LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4425:2: rule__IF__CommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__IF__CommandsAssignment_2_in_rule__IF__Group__2__Impl9049);
            	    rule__IF__CommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getIFAccess().getCommandsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__2__Impl"


    // $ANTLR start "rule__IF__Group__3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4436:1: rule__IF__Group__3 : rule__IF__Group__3__Impl ;
    public final void rule__IF__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4440:1: ( rule__IF__Group__3__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4441:2: rule__IF__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__IF__Group__3__Impl_in_rule__IF__Group__39082);
            rule__IF__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__3"


    // $ANTLR start "rule__IF__Group__3__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4447:1: rule__IF__Group__3__Impl : ( 'END IF' ) ;
    public final void rule__IF__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4451:1: ( ( 'END IF' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4452:1: ( 'END IF' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4452:1: ( 'END IF' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4453:1: 'END IF'
            {
             before(grammarAccess.getIFAccess().getENDIFKeyword_3()); 
            match(input,59,FOLLOW_59_in_rule__IF__Group__3__Impl9110); 
             after(grammarAccess.getIFAccess().getENDIFKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__Group__3__Impl"


    // $ANTLR start "rule__EQUALS__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4474:1: rule__EQUALS__Group__0 : rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 ;
    public final void rule__EQUALS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4478:1: ( rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4479:2: rule__EQUALS__Group__0__Impl rule__EQUALS__Group__1
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__0__Impl_in_rule__EQUALS__Group__09149);
            rule__EQUALS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EQUALS__Group__1_in_rule__EQUALS__Group__09152);
            rule__EQUALS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__0"


    // $ANTLR start "rule__EQUALS__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4486:1: rule__EQUALS__Group__0__Impl : ( ( rule__EQUALS__Op1Assignment_0 ) ) ;
    public final void rule__EQUALS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4490:1: ( ( ( rule__EQUALS__Op1Assignment_0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4491:1: ( ( rule__EQUALS__Op1Assignment_0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4491:1: ( ( rule__EQUALS__Op1Assignment_0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4492:1: ( rule__EQUALS__Op1Assignment_0 )
            {
             before(grammarAccess.getEQUALSAccess().getOp1Assignment_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4493:1: ( rule__EQUALS__Op1Assignment_0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4493:2: rule__EQUALS__Op1Assignment_0
            {
            pushFollow(FOLLOW_rule__EQUALS__Op1Assignment_0_in_rule__EQUALS__Group__0__Impl9179);
            rule__EQUALS__Op1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getOp1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__0__Impl"


    // $ANTLR start "rule__EQUALS__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4503:1: rule__EQUALS__Group__1 : rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 ;
    public final void rule__EQUALS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4507:1: ( rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4508:2: rule__EQUALS__Group__1__Impl rule__EQUALS__Group__2
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__1__Impl_in_rule__EQUALS__Group__19209);
            rule__EQUALS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EQUALS__Group__2_in_rule__EQUALS__Group__19212);
            rule__EQUALS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__1"


    // $ANTLR start "rule__EQUALS__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4515:1: rule__EQUALS__Group__1__Impl : ( '=' ) ;
    public final void rule__EQUALS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4519:1: ( ( '=' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4520:1: ( '=' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4520:1: ( '=' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4521:1: '='
            {
             before(grammarAccess.getEQUALSAccess().getEqualsSignKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__EQUALS__Group__1__Impl9240); 
             after(grammarAccess.getEQUALSAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__1__Impl"


    // $ANTLR start "rule__EQUALS__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4534:1: rule__EQUALS__Group__2 : rule__EQUALS__Group__2__Impl ;
    public final void rule__EQUALS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4538:1: ( rule__EQUALS__Group__2__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4539:2: rule__EQUALS__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EQUALS__Group__2__Impl_in_rule__EQUALS__Group__29271);
            rule__EQUALS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__2"


    // $ANTLR start "rule__EQUALS__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4545:1: rule__EQUALS__Group__2__Impl : ( ( rule__EQUALS__Op2Assignment_2 ) ) ;
    public final void rule__EQUALS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4549:1: ( ( ( rule__EQUALS__Op2Assignment_2 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4550:1: ( ( rule__EQUALS__Op2Assignment_2 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4550:1: ( ( rule__EQUALS__Op2Assignment_2 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4551:1: ( rule__EQUALS__Op2Assignment_2 )
            {
             before(grammarAccess.getEQUALSAccess().getOp2Assignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4552:1: ( rule__EQUALS__Op2Assignment_2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4552:2: rule__EQUALS__Op2Assignment_2
            {
            pushFollow(FOLLOW_rule__EQUALS__Op2Assignment_2_in_rule__EQUALS__Group__2__Impl9298);
            rule__EQUALS__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEQUALSAccess().getOp2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Group__2__Impl"


    // $ANTLR start "rule__GREATER_THAN__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4568:1: rule__GREATER_THAN__Group__0 : rule__GREATER_THAN__Group__0__Impl rule__GREATER_THAN__Group__1 ;
    public final void rule__GREATER_THAN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4572:1: ( rule__GREATER_THAN__Group__0__Impl rule__GREATER_THAN__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4573:2: rule__GREATER_THAN__Group__0__Impl rule__GREATER_THAN__Group__1
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__0__Impl_in_rule__GREATER_THAN__Group__09334);
            rule__GREATER_THAN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GREATER_THAN__Group__1_in_rule__GREATER_THAN__Group__09337);
            rule__GREATER_THAN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Group__0"


    // $ANTLR start "rule__GREATER_THAN__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4580:1: rule__GREATER_THAN__Group__0__Impl : ( ( rule__GREATER_THAN__Op1Assignment_0 ) ) ;
    public final void rule__GREATER_THAN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4584:1: ( ( ( rule__GREATER_THAN__Op1Assignment_0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4585:1: ( ( rule__GREATER_THAN__Op1Assignment_0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4585:1: ( ( rule__GREATER_THAN__Op1Assignment_0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4586:1: ( rule__GREATER_THAN__Op1Assignment_0 )
            {
             before(grammarAccess.getGREATER_THANAccess().getOp1Assignment_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4587:1: ( rule__GREATER_THAN__Op1Assignment_0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4587:2: rule__GREATER_THAN__Op1Assignment_0
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Op1Assignment_0_in_rule__GREATER_THAN__Group__0__Impl9364);
            rule__GREATER_THAN__Op1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGREATER_THANAccess().getOp1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Group__0__Impl"


    // $ANTLR start "rule__GREATER_THAN__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4597:1: rule__GREATER_THAN__Group__1 : rule__GREATER_THAN__Group__1__Impl rule__GREATER_THAN__Group__2 ;
    public final void rule__GREATER_THAN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4601:1: ( rule__GREATER_THAN__Group__1__Impl rule__GREATER_THAN__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4602:2: rule__GREATER_THAN__Group__1__Impl rule__GREATER_THAN__Group__2
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__1__Impl_in_rule__GREATER_THAN__Group__19394);
            rule__GREATER_THAN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GREATER_THAN__Group__2_in_rule__GREATER_THAN__Group__19397);
            rule__GREATER_THAN__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Group__1"


    // $ANTLR start "rule__GREATER_THAN__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4609:1: rule__GREATER_THAN__Group__1__Impl : ( '>' ) ;
    public final void rule__GREATER_THAN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4613:1: ( ( '>' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4614:1: ( '>' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4614:1: ( '>' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4615:1: '>'
            {
             before(grammarAccess.getGREATER_THANAccess().getGreaterThanSignKeyword_1()); 
            match(input,60,FOLLOW_60_in_rule__GREATER_THAN__Group__1__Impl9425); 
             after(grammarAccess.getGREATER_THANAccess().getGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Group__1__Impl"


    // $ANTLR start "rule__GREATER_THAN__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4628:1: rule__GREATER_THAN__Group__2 : rule__GREATER_THAN__Group__2__Impl ;
    public final void rule__GREATER_THAN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4632:1: ( rule__GREATER_THAN__Group__2__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4633:2: rule__GREATER_THAN__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Group__2__Impl_in_rule__GREATER_THAN__Group__29456);
            rule__GREATER_THAN__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Group__2"


    // $ANTLR start "rule__GREATER_THAN__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4639:1: rule__GREATER_THAN__Group__2__Impl : ( ( rule__GREATER_THAN__Op2Assignment_2 ) ) ;
    public final void rule__GREATER_THAN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4643:1: ( ( ( rule__GREATER_THAN__Op2Assignment_2 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4644:1: ( ( rule__GREATER_THAN__Op2Assignment_2 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4644:1: ( ( rule__GREATER_THAN__Op2Assignment_2 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4645:1: ( rule__GREATER_THAN__Op2Assignment_2 )
            {
             before(grammarAccess.getGREATER_THANAccess().getOp2Assignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4646:1: ( rule__GREATER_THAN__Op2Assignment_2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4646:2: rule__GREATER_THAN__Op2Assignment_2
            {
            pushFollow(FOLLOW_rule__GREATER_THAN__Op2Assignment_2_in_rule__GREATER_THAN__Group__2__Impl9483);
            rule__GREATER_THAN__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGREATER_THANAccess().getOp2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Group__2__Impl"


    // $ANTLR start "rule__LESSER_THAN__Group__0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4662:1: rule__LESSER_THAN__Group__0 : rule__LESSER_THAN__Group__0__Impl rule__LESSER_THAN__Group__1 ;
    public final void rule__LESSER_THAN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4666:1: ( rule__LESSER_THAN__Group__0__Impl rule__LESSER_THAN__Group__1 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4667:2: rule__LESSER_THAN__Group__0__Impl rule__LESSER_THAN__Group__1
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__0__Impl_in_rule__LESSER_THAN__Group__09519);
            rule__LESSER_THAN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LESSER_THAN__Group__1_in_rule__LESSER_THAN__Group__09522);
            rule__LESSER_THAN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Group__0"


    // $ANTLR start "rule__LESSER_THAN__Group__0__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4674:1: rule__LESSER_THAN__Group__0__Impl : ( ( rule__LESSER_THAN__Op1Assignment_0 ) ) ;
    public final void rule__LESSER_THAN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4678:1: ( ( ( rule__LESSER_THAN__Op1Assignment_0 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4679:1: ( ( rule__LESSER_THAN__Op1Assignment_0 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4679:1: ( ( rule__LESSER_THAN__Op1Assignment_0 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4680:1: ( rule__LESSER_THAN__Op1Assignment_0 )
            {
             before(grammarAccess.getLESSER_THANAccess().getOp1Assignment_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4681:1: ( rule__LESSER_THAN__Op1Assignment_0 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4681:2: rule__LESSER_THAN__Op1Assignment_0
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Op1Assignment_0_in_rule__LESSER_THAN__Group__0__Impl9549);
            rule__LESSER_THAN__Op1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLESSER_THANAccess().getOp1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Group__0__Impl"


    // $ANTLR start "rule__LESSER_THAN__Group__1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4691:1: rule__LESSER_THAN__Group__1 : rule__LESSER_THAN__Group__1__Impl rule__LESSER_THAN__Group__2 ;
    public final void rule__LESSER_THAN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4695:1: ( rule__LESSER_THAN__Group__1__Impl rule__LESSER_THAN__Group__2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4696:2: rule__LESSER_THAN__Group__1__Impl rule__LESSER_THAN__Group__2
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__1__Impl_in_rule__LESSER_THAN__Group__19579);
            rule__LESSER_THAN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LESSER_THAN__Group__2_in_rule__LESSER_THAN__Group__19582);
            rule__LESSER_THAN__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Group__1"


    // $ANTLR start "rule__LESSER_THAN__Group__1__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4703:1: rule__LESSER_THAN__Group__1__Impl : ( '<' ) ;
    public final void rule__LESSER_THAN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4707:1: ( ( '<' ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4708:1: ( '<' )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4708:1: ( '<' )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4709:1: '<'
            {
             before(grammarAccess.getLESSER_THANAccess().getLessThanSignKeyword_1()); 
            match(input,61,FOLLOW_61_in_rule__LESSER_THAN__Group__1__Impl9610); 
             after(grammarAccess.getLESSER_THANAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Group__1__Impl"


    // $ANTLR start "rule__LESSER_THAN__Group__2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4722:1: rule__LESSER_THAN__Group__2 : rule__LESSER_THAN__Group__2__Impl ;
    public final void rule__LESSER_THAN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4726:1: ( rule__LESSER_THAN__Group__2__Impl )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4727:2: rule__LESSER_THAN__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Group__2__Impl_in_rule__LESSER_THAN__Group__29641);
            rule__LESSER_THAN__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Group__2"


    // $ANTLR start "rule__LESSER_THAN__Group__2__Impl"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4733:1: rule__LESSER_THAN__Group__2__Impl : ( ( rule__LESSER_THAN__Op2Assignment_2 ) ) ;
    public final void rule__LESSER_THAN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4737:1: ( ( ( rule__LESSER_THAN__Op2Assignment_2 ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4738:1: ( ( rule__LESSER_THAN__Op2Assignment_2 ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4738:1: ( ( rule__LESSER_THAN__Op2Assignment_2 ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4739:1: ( rule__LESSER_THAN__Op2Assignment_2 )
            {
             before(grammarAccess.getLESSER_THANAccess().getOp2Assignment_2()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4740:1: ( rule__LESSER_THAN__Op2Assignment_2 )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4740:2: rule__LESSER_THAN__Op2Assignment_2
            {
            pushFollow(FOLLOW_rule__LESSER_THAN__Op2Assignment_2_in_rule__LESSER_THAN__Group__2__Impl9668);
            rule__LESSER_THAN__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLESSER_THANAccess().getOp2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Group__2__Impl"


    // $ANTLR start "rule__TortugaProgram__SentencesAssignment"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4757:1: rule__TortugaProgram__SentencesAssignment : ( ruleSENTENCE ) ;
    public final void rule__TortugaProgram__SentencesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4761:1: ( ( ruleSENTENCE ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4762:1: ( ruleSENTENCE )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4762:1: ( ruleSENTENCE )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4763:1: ruleSENTENCE
            {
             before(grammarAccess.getTortugaProgramAccess().getSentencesSENTENCEParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__TortugaProgram__SentencesAssignment9709);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getTortugaProgramAccess().getSentencesSENTENCEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TortugaProgram__SentencesAssignment"


    // $ANTLR start "rule__FORWARD__AmountAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4772:1: rule__FORWARD__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__FORWARD__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4776:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4777:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4777:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4778:1: ruleEXPRESSION
            {
             before(grammarAccess.getFORWARDAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__FORWARD__AmountAssignment_19740);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getFORWARDAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FORWARD__AmountAssignment_1"


    // $ANTLR start "rule__LEFT__AmountAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4787:1: rule__LEFT__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__LEFT__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4791:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4792:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4792:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4793:1: ruleEXPRESSION
            {
             before(grammarAccess.getLEFTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__LEFT__AmountAssignment_19771);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getLEFTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LEFT__AmountAssignment_1"


    // $ANTLR start "rule__RIGHT__AmountAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4802:1: rule__RIGHT__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__RIGHT__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4806:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4807:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4807:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4808:1: ruleEXPRESSION
            {
             before(grammarAccess.getRIGHTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__RIGHT__AmountAssignment_19802);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getRIGHTAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RIGHT__AmountAssignment_1"


    // $ANTLR start "rule__SET_X__AmountAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4817:1: rule__SET_X__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__SET_X__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4821:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4822:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4822:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4823:1: ruleEXPRESSION
            {
             before(grammarAccess.getSET_XAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SET_X__AmountAssignment_19833);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSET_XAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_X__AmountAssignment_1"


    // $ANTLR start "rule__SET_Y__AmountAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4832:1: rule__SET_Y__AmountAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__SET_Y__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4836:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4837:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4837:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4838:1: ruleEXPRESSION
            {
             before(grammarAccess.getSET_YAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SET_Y__AmountAssignment_19864);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSET_YAccess().getAmountEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SET_Y__AmountAssignment_1"


    // $ANTLR start "rule__PENCOLOR__ColorAssignment_1_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4847:1: rule__PENCOLOR__ColorAssignment_1_0 : ( ruleCOLOR ) ;
    public final void rule__PENCOLOR__ColorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4851:1: ( ( ruleCOLOR ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4852:1: ( ruleCOLOR )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4852:1: ( ruleCOLOR )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4853:1: ruleCOLOR
            {
             before(grammarAccess.getPENCOLORAccess().getColorCOLORParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCOLOR_in_rule__PENCOLOR__ColorAssignment_1_09895);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getPENCOLORAccess().getColorCOLORParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__ColorAssignment_1_0"


    // $ANTLR start "rule__PENCOLOR__ColorSpecAssignment_1_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4862:1: rule__PENCOLOR__ColorSpecAssignment_1_1 : ( ruleCOLOR_SPEC ) ;
    public final void rule__PENCOLOR__ColorSpecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4866:1: ( ( ruleCOLOR_SPEC ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4867:1: ( ruleCOLOR_SPEC )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4867:1: ( ruleCOLOR_SPEC )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4868:1: ruleCOLOR_SPEC
            {
             before(grammarAccess.getPENCOLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_rule__PENCOLOR__ColorSpecAssignment_1_19926);
            ruleCOLOR_SPEC();

            state._fsp--;

             after(grammarAccess.getPENCOLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PENCOLOR__ColorSpecAssignment_1_1"


    // $ANTLR start "rule__CANVAS_COLOR__ColorAssignment_1_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4877:1: rule__CANVAS_COLOR__ColorAssignment_1_0 : ( ruleCOLOR ) ;
    public final void rule__CANVAS_COLOR__ColorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4881:1: ( ( ruleCOLOR ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4882:1: ( ruleCOLOR )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4882:1: ( ruleCOLOR )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4883:1: ruleCOLOR
            {
             before(grammarAccess.getCANVAS_COLORAccess().getColorCOLORParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleCOLOR_in_rule__CANVAS_COLOR__ColorAssignment_1_09957);
            ruleCOLOR();

            state._fsp--;

             after(grammarAccess.getCANVAS_COLORAccess().getColorCOLORParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__ColorAssignment_1_0"


    // $ANTLR start "rule__CANVAS_COLOR__ColorSpecAssignment_1_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4892:1: rule__CANVAS_COLOR__ColorSpecAssignment_1_1 : ( ruleCOLOR_SPEC ) ;
    public final void rule__CANVAS_COLOR__ColorSpecAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4896:1: ( ( ruleCOLOR_SPEC ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4897:1: ( ruleCOLOR_SPEC )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4897:1: ( ruleCOLOR_SPEC )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4898:1: ruleCOLOR_SPEC
            {
             before(grammarAccess.getCANVAS_COLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCOLOR_SPEC_in_rule__CANVAS_COLOR__ColorSpecAssignment_1_19988);
            ruleCOLOR_SPEC();

            state._fsp--;

             after(grammarAccess.getCANVAS_COLORAccess().getColorSpecCOLOR_SPECParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CANVAS_COLOR__ColorSpecAssignment_1_1"


    // $ANTLR start "rule__COLOR_SPEC__RedAssignment_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4907:1: rule__COLOR_SPEC__RedAssignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__RedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4911:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4912:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4912:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4913:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getRedEXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__RedAssignment_010019);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getRedEXPRESSIONParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__RedAssignment_0"


    // $ANTLR start "rule__COLOR_SPEC__GreenAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4922:1: rule__COLOR_SPEC__GreenAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__GreenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4926:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4927:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4927:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4928:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getGreenEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__GreenAssignment_110050);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getGreenEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__GreenAssignment_1"


    // $ANTLR start "rule__COLOR_SPEC__BlueAssignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4937:1: rule__COLOR_SPEC__BlueAssignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__BlueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4941:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4942:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4942:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4943:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getBlueEXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__BlueAssignment_210081);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getBlueEXPRESSIONParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__BlueAssignment_2"


    // $ANTLR start "rule__COLOR_SPEC__AlphaAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4952:1: rule__COLOR_SPEC__AlphaAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__COLOR_SPEC__AlphaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4956:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4957:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4957:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4958:1: ruleEXPRESSION
            {
             before(grammarAccess.getCOLOR_SPECAccess().getAlphaEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__AlphaAssignment_310112);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getCOLOR_SPECAccess().getAlphaEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__COLOR_SPEC__AlphaAssignment_3"


    // $ANTLR start "rule__FONT_SIZE__SizeAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4967:1: rule__FONT_SIZE__SizeAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__FONT_SIZE__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4971:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4972:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4972:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4973:1: ruleEXPRESSION
            {
             before(grammarAccess.getFONT_SIZEAccess().getSizeEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__FONT_SIZE__SizeAssignment_110143);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getFONT_SIZEAccess().getSizeEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_SIZE__SizeAssignment_1"


    // $ANTLR start "rule__FONT_STYLE__StyleAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4982:1: rule__FONT_STYLE__StyleAssignment_1 : ( ruleFontStyleValues ) ;
    public final void rule__FONT_STYLE__StyleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4986:1: ( ( ruleFontStyleValues ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4987:1: ( ruleFontStyleValues )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4987:1: ( ruleFontStyleValues )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4988:1: ruleFontStyleValues
            {
             before(grammarAccess.getFONT_STYLEAccess().getStyleFontStyleValuesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFontStyleValues_in_rule__FONT_STYLE__StyleAssignment_110174);
            ruleFontStyleValues();

            state._fsp--;

             after(grammarAccess.getFONT_STYLEAccess().getStyleFontStyleValuesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FONT_STYLE__StyleAssignment_1"


    // $ANTLR start "rule__DRAW_STRING__TextAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:4997:1: rule__DRAW_STRING__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DRAW_STRING__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5001:1: ( ( RULE_STRING ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5002:1: ( RULE_STRING )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5002:1: ( RULE_STRING )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5003:1: RULE_STRING
            {
             before(grammarAccess.getDRAW_STRINGAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DRAW_STRING__TextAssignment_110205); 
             after(grammarAccess.getDRAW_STRINGAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DRAW_STRING__TextAssignment_1"


    // $ANTLR start "rule__MAKE__NameAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5012:1: rule__MAKE__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MAKE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5016:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5017:1: ( RULE_ID )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5017:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5018:1: RULE_ID
            {
             before(grammarAccess.getMAKEAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MAKE__NameAssignment_110236); 
             after(grammarAccess.getMAKEAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__NameAssignment_1"


    // $ANTLR start "rule__MAKE__ValueAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5027:1: rule__MAKE__ValueAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__MAKE__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5031:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5032:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5032:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5033:1: ruleEXPRESSION
            {
             before(grammarAccess.getMAKEAccess().getValueEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__MAKE__ValueAssignment_310267);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getMAKEAccess().getValueEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAKE__ValueAssignment_3"


    // $ANTLR start "rule__VARIABLE_REF__ToVarAssignment"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5042:1: rule__VARIABLE_REF__ToVarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VARIABLE_REF__ToVarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5046:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5047:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5047:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5048:1: ( RULE_ID )
            {
             before(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLECrossReference_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5049:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5050:1: RULE_ID
            {
             before(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLEIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_REF__ToVarAssignment10302); 
             after(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLEIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLECrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_REF__ToVarAssignment"


    // $ANTLR start "rule__VALUE__ValAssignment"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5061:1: rule__VALUE__ValAssignment : ( RULE_DOUBLE ) ;
    public final void rule__VALUE__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5065:1: ( ( RULE_DOUBLE ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5066:1: ( RULE_DOUBLE )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5066:1: ( RULE_DOUBLE )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5067:1: RULE_DOUBLE
            {
             before(grammarAccess.getVALUEAccess().getValDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__VALUE__ValAssignment10337); 
             after(grammarAccess.getVALUEAccess().getValDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VALUE__ValAssignment"


    // $ANTLR start "rule__CONTENT__VarAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5076:1: rule__CONTENT__VarAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CONTENT__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5080:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5081:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5081:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5082:1: ( RULE_ID )
            {
             before(grammarAccess.getCONTENTAccess().getVarMAKECrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5083:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5084:1: RULE_ID
            {
             before(grammarAccess.getCONTENTAccess().getVarMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CONTENT__VarAssignment_110372); 
             after(grammarAccess.getCONTENTAccess().getVarMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCONTENTAccess().getVarMAKECrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CONTENT__VarAssignment_1"


    // $ANTLR start "rule__SUM__TargetVariableAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5095:1: rule__SUM__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SUM__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5099:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5100:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5100:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5101:1: ( RULE_ID )
            {
             before(grammarAccess.getSUMAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5102:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5103:1: RULE_ID
            {
             before(grammarAccess.getSUMAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SUM__TargetVariableAssignment_110411); 
             after(grammarAccess.getSUMAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSUMAccess().getTargetVariableMAKECrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__TargetVariableAssignment_1"


    // $ANTLR start "rule__SUM__ValOneAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5114:1: rule__SUM__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__SUM__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5118:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5119:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5119:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5120:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUMAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUM__ValOneAssignment_310446);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUMAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__ValOneAssignment_3"


    // $ANTLR start "rule__SUM__ValTwoAssignment_5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5129:1: rule__SUM__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__SUM__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5133:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5134:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5134:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5135:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUMAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUM__ValTwoAssignment_510477);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUMAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUM__ValTwoAssignment_5"


    // $ANTLR start "rule__SUBTRACT__TargetVariableAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5144:1: rule__SUBTRACT__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SUBTRACT__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5148:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5149:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5149:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5150:1: ( RULE_ID )
            {
             before(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5151:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5152:1: RULE_ID
            {
             before(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SUBTRACT__TargetVariableAssignment_110512); 
             after(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKECrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__TargetVariableAssignment_1"


    // $ANTLR start "rule__SUBTRACT__ValOneAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5163:1: rule__SUBTRACT__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__SUBTRACT__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5167:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5168:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5168:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5169:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUBTRACTAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValOneAssignment_310547);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUBTRACTAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__ValOneAssignment_3"


    // $ANTLR start "rule__SUBTRACT__ValTwoAssignment_5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5178:1: rule__SUBTRACT__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__SUBTRACT__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5182:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5183:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5183:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5184:1: ruleEXPRESSION
            {
             before(grammarAccess.getSUBTRACTAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValTwoAssignment_510578);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getSUBTRACTAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SUBTRACT__ValTwoAssignment_5"


    // $ANTLR start "rule__MULTIPLY__TargetVariableAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5193:1: rule__MULTIPLY__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MULTIPLY__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5197:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5198:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5198:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5199:1: ( RULE_ID )
            {
             before(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5200:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5201:1: RULE_ID
            {
             before(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MULTIPLY__TargetVariableAssignment_110613); 
             after(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKECrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__TargetVariableAssignment_1"


    // $ANTLR start "rule__MULTIPLY__ValOneAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5212:1: rule__MULTIPLY__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__MULTIPLY__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5216:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5217:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5217:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5218:1: ruleEXPRESSION
            {
             before(grammarAccess.getMULTIPLYAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValOneAssignment_310648);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getMULTIPLYAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__ValOneAssignment_3"


    // $ANTLR start "rule__MULTIPLY__ValTwoAssignment_5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5227:1: rule__MULTIPLY__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__MULTIPLY__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5231:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5232:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5232:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5233:1: ruleEXPRESSION
            {
             before(grammarAccess.getMULTIPLYAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValTwoAssignment_510679);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getMULTIPLYAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MULTIPLY__ValTwoAssignment_5"


    // $ANTLR start "rule__DIVIDE__TargetVariableAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5242:1: rule__DIVIDE__TargetVariableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DIVIDE__TargetVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5246:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5247:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5247:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5248:1: ( RULE_ID )
            {
             before(grammarAccess.getDIVIDEAccess().getTargetVariableMAKECrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5249:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5250:1: RULE_ID
            {
             before(grammarAccess.getDIVIDEAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DIVIDE__TargetVariableAssignment_110714); 
             after(grammarAccess.getDIVIDEAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDIVIDEAccess().getTargetVariableMAKECrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__TargetVariableAssignment_1"


    // $ANTLR start "rule__DIVIDE__ValOneAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5261:1: rule__DIVIDE__ValOneAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__DIVIDE__ValOneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5265:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5266:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5266:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5267:1: ruleEXPRESSION
            {
             before(grammarAccess.getDIVIDEAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValOneAssignment_310749);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getDIVIDEAccess().getValOneEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__ValOneAssignment_3"


    // $ANTLR start "rule__DIVIDE__ValTwoAssignment_5"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5276:1: rule__DIVIDE__ValTwoAssignment_5 : ( ruleEXPRESSION ) ;
    public final void rule__DIVIDE__ValTwoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5280:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5281:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5281:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5282:1: ruleEXPRESSION
            {
             before(grammarAccess.getDIVIDEAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValTwoAssignment_510780);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getDIVIDEAccess().getValTwoEXPRESSIONParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DIVIDE__ValTwoAssignment_5"


    // $ANTLR start "rule__REPEAT__TimesAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5291:1: rule__REPEAT__TimesAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__REPEAT__TimesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5295:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5296:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5296:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5297:1: ruleEXPRESSION
            {
             before(grammarAccess.getREPEATAccess().getTimesEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__REPEAT__TimesAssignment_110811);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getREPEATAccess().getTimesEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__TimesAssignment_1"


    // $ANTLR start "rule__REPEAT__CommandsAssignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5306:1: rule__REPEAT__CommandsAssignment_2 : ( ruleSENTENCE ) ;
    public final void rule__REPEAT__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5310:1: ( ( ruleSENTENCE ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5311:1: ( ruleSENTENCE )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5311:1: ( ruleSENTENCE )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5312:1: ruleSENTENCE
            {
             before(grammarAccess.getREPEATAccess().getCommandsSENTENCEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__REPEAT__CommandsAssignment_210842);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getREPEATAccess().getCommandsSENTENCEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REPEAT__CommandsAssignment_2"


    // $ANTLR start "rule__TO__NameAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5321:1: rule__TO__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TO__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5325:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5326:1: ( RULE_ID )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5326:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5327:1: RULE_ID
            {
             before(grammarAccess.getTOAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TO__NameAssignment_110873); 
             after(grammarAccess.getTOAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__NameAssignment_1"


    // $ANTLR start "rule__TO__ParametersAssignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5336:1: rule__TO__ParametersAssignment_2 : ( rulePARAM ) ;
    public final void rule__TO__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5340:1: ( ( rulePARAM ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5341:1: ( rulePARAM )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5341:1: ( rulePARAM )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5342:1: rulePARAM
            {
             before(grammarAccess.getTOAccess().getParametersPARAMParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePARAM_in_rule__TO__ParametersAssignment_210904);
            rulePARAM();

            state._fsp--;

             after(grammarAccess.getTOAccess().getParametersPARAMParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__ParametersAssignment_2"


    // $ANTLR start "rule__TO__CommandsAssignment_3"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5351:1: rule__TO__CommandsAssignment_3 : ( ruleSENTENCE ) ;
    public final void rule__TO__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5355:1: ( ( ruleSENTENCE ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5356:1: ( ruleSENTENCE )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5356:1: ( ruleSENTENCE )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5357:1: ruleSENTENCE
            {
             before(grammarAccess.getTOAccess().getCommandsSENTENCEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__TO__CommandsAssignment_310935);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getTOAccess().getCommandsSENTENCEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TO__CommandsAssignment_3"


    // $ANTLR start "rule__PARAM__NameAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5366:1: rule__PARAM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PARAM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5370:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5371:1: ( RULE_ID )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5371:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5372:1: RULE_ID
            {
             before(grammarAccess.getPARAMAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PARAM__NameAssignment_110966); 
             after(grammarAccess.getPARAMAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PARAM__NameAssignment_1"


    // $ANTLR start "rule__PROCEDURE_CALL__ToAssignment_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5381:1: rule__PROCEDURE_CALL__ToAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PROCEDURE_CALL__ToAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5385:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5386:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5386:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5387:1: ( RULE_ID )
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getToTOCrossReference_0_0()); 
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5388:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5389:1: RULE_ID
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getToTOIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PROCEDURE_CALL__ToAssignment_011001); 
             after(grammarAccess.getPROCEDURE_CALLAccess().getToTOIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPROCEDURE_CALLAccess().getToTOCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE_CALL__ToAssignment_0"


    // $ANTLR start "rule__PROCEDURE_CALL__ParamsAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5400:1: rule__PROCEDURE_CALL__ParamsAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__PROCEDURE_CALL__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5404:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5405:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5405:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5406:1: ruleEXPRESSION
            {
             before(grammarAccess.getPROCEDURE_CALLAccess().getParamsEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__PROCEDURE_CALL__ParamsAssignment_111036);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getPROCEDURE_CALLAccess().getParamsEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROCEDURE_CALL__ParamsAssignment_1"


    // $ANTLR start "rule__IF__ConditionAssignment_1"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5415:1: rule__IF__ConditionAssignment_1 : ( ruleBOOLEAN_EXPRESSION ) ;
    public final void rule__IF__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5419:1: ( ( ruleBOOLEAN_EXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5420:1: ( ruleBOOLEAN_EXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5420:1: ( ruleBOOLEAN_EXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5421:1: ruleBOOLEAN_EXPRESSION
            {
             before(grammarAccess.getIFAccess().getConditionBOOLEAN_EXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_EXPRESSION_in_rule__IF__ConditionAssignment_111067);
            ruleBOOLEAN_EXPRESSION();

            state._fsp--;

             after(grammarAccess.getIFAccess().getConditionBOOLEAN_EXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__ConditionAssignment_1"


    // $ANTLR start "rule__IF__CommandsAssignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5430:1: rule__IF__CommandsAssignment_2 : ( ruleSENTENCE ) ;
    public final void rule__IF__CommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5434:1: ( ( ruleSENTENCE ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5435:1: ( ruleSENTENCE )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5435:1: ( ruleSENTENCE )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5436:1: ruleSENTENCE
            {
             before(grammarAccess.getIFAccess().getCommandsSENTENCEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSENTENCE_in_rule__IF__CommandsAssignment_211098);
            ruleSENTENCE();

            state._fsp--;

             after(grammarAccess.getIFAccess().getCommandsSENTENCEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IF__CommandsAssignment_2"


    // $ANTLR start "rule__EQUALS__Op1Assignment_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5445:1: rule__EQUALS__Op1Assignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__EQUALS__Op1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5449:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5450:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5450:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5451:1: ruleEXPRESSION
            {
             before(grammarAccess.getEQUALSAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op1Assignment_011129);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEQUALSAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Op1Assignment_0"


    // $ANTLR start "rule__EQUALS__Op2Assignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5460:1: rule__EQUALS__Op2Assignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__EQUALS__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5464:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5465:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5465:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5466:1: ruleEXPRESSION
            {
             before(grammarAccess.getEQUALSAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op2Assignment_211160);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEQUALSAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EQUALS__Op2Assignment_2"


    // $ANTLR start "rule__GREATER_THAN__Op1Assignment_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5475:1: rule__GREATER_THAN__Op1Assignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__GREATER_THAN__Op1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5479:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5480:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5480:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5481:1: ruleEXPRESSION
            {
             before(grammarAccess.getGREATER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op1Assignment_011191);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getGREATER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Op1Assignment_0"


    // $ANTLR start "rule__GREATER_THAN__Op2Assignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5490:1: rule__GREATER_THAN__Op2Assignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__GREATER_THAN__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5494:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5495:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5495:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5496:1: ruleEXPRESSION
            {
             before(grammarAccess.getGREATER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op2Assignment_211222);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getGREATER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GREATER_THAN__Op2Assignment_2"


    // $ANTLR start "rule__LESSER_THAN__Op1Assignment_0"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5505:1: rule__LESSER_THAN__Op1Assignment_0 : ( ruleEXPRESSION ) ;
    public final void rule__LESSER_THAN__Op1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5509:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5510:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5510:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5511:1: ruleEXPRESSION
            {
             before(grammarAccess.getLESSER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op1Assignment_011253);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getLESSER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Op1Assignment_0"


    // $ANTLR start "rule__LESSER_THAN__Op2Assignment_2"
    // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5520:1: rule__LESSER_THAN__Op2Assignment_2 : ( ruleEXPRESSION ) ;
    public final void rule__LESSER_THAN__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5524:1: ( ( ruleEXPRESSION ) )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5525:1: ( ruleEXPRESSION )
            {
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5525:1: ( ruleEXPRESSION )
            // ../org.uqbar.paco.dsl.tortuga.ui/src-gen/org/uqbar/paco/dsl/ui/contentassist/antlr/internal/InternalTortugaDSL.g:5526:1: ruleEXPRESSION
            {
             before(grammarAccess.getLESSER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op2Assignment_211284);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getLESSER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LESSER_THAN__Op2Assignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTortugaProgram_in_entryRuleTortugaProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTortugaProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TortugaProgram__SentencesAssignment_in_ruleTortugaProgram94 = new BitSet(new long[]{0x04AAB78FFE000022L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_entryRuleSENTENCE122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSENTENCE129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SENTENCE__Alternatives_in_ruleSENTENCE155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVE_in_entryRuleMOVE182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOVE189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MOVE__Alternatives_in_ruleMOVE215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFORWARD_in_entryRuleFORWARD242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFORWARD249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__0_in_ruleFORWARD275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEFT_in_entryRuleLEFT302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLEFT309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__Group__0_in_ruleLEFT335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRIGHT_in_entryRuleRIGHT362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRIGHT369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__0_in_ruleRIGHT395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_X_in_entryRuleSET_X422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSET_X429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__Group__0_in_ruleSET_X455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_Y_in_entryRuleSET_Y482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSET_Y489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__0_in_ruleSET_Y515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAWING_SENTENCE_in_entryRuleDRAWING_SENTENCE542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDRAWING_SENTENCE549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAWING_SENTENCE__Alternatives_in_ruleDRAWING_SENTENCE575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENDOWN_in_entryRulePENDOWN602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENDOWN609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__0_in_rulePENDOWN635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENUP_in_entryRulePENUP662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENUP669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENUP__Group__0_in_rulePENUP695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOREABLE_in_entryRuleCOLOREABLE722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOREABLE729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOREABLE__Alternatives_in_ruleCOLOREABLE755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENCOLOR_in_entryRulePENCOLOR782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePENCOLOR789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__0_in_rulePENCOLOR815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCANVAS_COLOR_in_entryRuleCANVAS_COLOR842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCANVAS_COLOR849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__0_in_ruleCANVAS_COLOR875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_entryRuleCOLOR_SPEC902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOR_SPEC909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__0_in_ruleCOLOR_SPEC935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_entryRuleCOLOR962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOLOR969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR__Alternatives_in_ruleCOLOR995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SPEC_in_entryRuleFONT_SPEC1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_SPEC1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_SPEC__Alternatives_in_ruleFONT_SPEC1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SIZE_in_entryRuleFONT_SIZE1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_SIZE1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_SIZE__Group__0_in_ruleFONT_SIZE1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_entryRuleFONT_STYLE1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFONT_STYLE1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__0_in_ruleFONT_STYLE1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyleValues_in_entryRuleFontStyleValues1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFontStyleValues1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Alternatives_in_ruleFontStyleValues1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLEAR_in_entryRuleCLEAR1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLEAR1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__0_in_ruleCLEAR1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHOME_in_entryRuleHOME1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHOME1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HOME__Group__0_in_ruleHOME1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAW_STRING_in_entryRuleDRAW_STRING1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDRAW_STRING1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__0_in_ruleDRAW_STRING1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAKE_in_entryRuleMAKE1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMAKE1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__0_in_ruleMAKE1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_REF_in_entryRuleVARIABLE_REF1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_REF1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_REF__ToVarAssignment_in_ruleVARIABLE_REF1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Alternatives_in_ruleEXPRESSION1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_entryRuleVALUE1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVALUE1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VALUE__ValAssignment_in_ruleVALUE1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTENT_in_entryRuleCONTENT1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTENT1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__0_in_ruleCONTENT1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATION_in_entryRuleOPERATION1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOPERATION1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OPERATION__Alternatives_in_ruleOPERATION1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUM_in_entryRuleSUM1804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSUM1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__0_in_ruleSUM1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUBTRACT_in_entryRuleSUBTRACT1864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSUBTRACT1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__0_in_ruleSUBTRACT1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLY_in_entryRuleMULTIPLY1924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMULTIPLY1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__0_in_ruleMULTIPLY1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIVIDE_in_entryRuleDIVIDE1984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIVIDE1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__0_in_ruleDIVIDE2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTROL_SENTENCES_in_entryRuleCONTROL_SENTENCES2044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTROL_SENTENCES2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTROL_SENTENCES__Alternatives_in_ruleCONTROL_SENTENCES2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREPEAT_in_entryRuleREPEAT2104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREPEAT2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__0_in_ruleREPEAT2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTO_in_entryRuleTO2164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTO2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__0_in_ruleTO2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_in_entryRulePARAM2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePARAM2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__Group__0_in_rulePARAM2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePROCEDURE_CALL_in_entryRulePROCEDURE_CALL2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePROCEDURE_CALL2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__0_in_rulePROCEDURE_CALL2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_in_entryRuleIF2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIF2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF__Group__0_in_ruleIF2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_EXPRESSION_in_entryRuleBOOLEAN_EXPRESSION2404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_EXPRESSION2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN_EXPRESSION__Alternatives_in_ruleBOOLEAN_EXPRESSION2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALS_in_entryRuleEQUALS2464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQUALS2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__0_in_ruleEQUALS2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGREATER_THAN_in_entryRuleGREATER_THAN2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGREATER_THAN2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__0_in_ruleGREATER_THAN2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLESSER_THAN_in_entryRuleLESSER_THAN2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLESSER_THAN2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__0_in_ruleLESSER_THAN2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMAKE_in_rule__SENTENCE__Alternatives2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTENT_in_rule__SENTENCE__Alternatives2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePROCEDURE_CALL_in_rule__SENTENCE__Alternatives2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOPERATION_in_rule__SENTENCE__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTROL_SENTENCES_in_rule__SENTENCE__Alternatives2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOVE_in_rule__SENTENCE__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAWING_SENTENCE_in_rule__SENTENCE__Alternatives2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFORWARD_in_rule__MOVE__Alternatives2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLEFT_in_rule__MOVE__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRIGHT_in_rule__MOVE__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_X_in_rule__MOVE__Alternatives2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSET_Y_in_rule__MOVE__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENDOWN_in_rule__DRAWING_SENTENCE__Alternatives2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENUP_in_rule__DRAWING_SENTENCE__Alternatives2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLEAR_in_rule__DRAWING_SENTENCE__Alternatives2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHOME_in_rule__DRAWING_SENTENCE__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOREABLE_in_rule__DRAWING_SENTENCE__Alternatives2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SPEC_in_rule__DRAWING_SENTENCE__Alternatives2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDRAW_STRING_in_rule__DRAWING_SENTENCE__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePENCOLOR_in_rule__COLOREABLE__Alternatives3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCANVAS_COLOR_in_rule__COLOREABLE__Alternatives3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__ColorAssignment_1_0_in_rule__PENCOLOR__Alternatives_13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__ColorSpecAssignment_1_1_in_rule__PENCOLOR__Alternatives_13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__ColorAssignment_1_0_in_rule__CANVAS_COLOR__Alternatives_13121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__ColorSpecAssignment_1_1_in_rule__CANVAS_COLOR__Alternatives_13139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__COLOR__Alternatives3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__COLOR__Alternatives3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__COLOR__Alternatives3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__COLOR__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__COLOR__Alternatives3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__COLOR__Alternatives3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__COLOR__Alternatives3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__COLOR__Alternatives3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__COLOR__Alternatives3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__COLOR__Alternatives3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__COLOR__Alternatives3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__COLOR__Alternatives3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__COLOR__Alternatives3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_STYLE_in_rule__FONT_SPEC__Alternatives3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFONT_SIZE_in_rule__FONT_SPEC__Alternatives3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__0_in_rule__FontStyleValues__Alternatives3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__0_in_rule__FontStyleValues__Alternatives3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__0_in_rule__FontStyleValues__Alternatives3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_REF_in_rule__EXPRESSION__Alternatives3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVALUE_in_rule__EXPRESSION__Alternatives3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUM_in_rule__OPERATION__Alternatives3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSUBTRACT_in_rule__OPERATION__Alternatives3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLY_in_rule__OPERATION__Alternatives3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIVIDE_in_rule__OPERATION__Alternatives3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREPEAT_in_rule__CONTROL_SENTENCES__Alternatives3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTO_in_rule__CONTROL_SENTENCES__Alternatives3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_in_rule__CONTROL_SENTENCES__Alternatives3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUALS_in_rule__BOOLEAN_EXPRESSION__Alternatives3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGREATER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLESSER_THAN_in_rule__BOOLEAN_EXPRESSION__Alternatives3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__0__Impl_in_rule__FORWARD__Group__03828 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__1_in_rule__FORWARD__Group__03831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FORWARD__Group__0__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__Group__1__Impl_in_rule__FORWARD__Group__13890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FORWARD__AmountAssignment_1_in_rule__FORWARD__Group__1__Impl3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__Group__0__Impl_in_rule__LEFT__Group__03951 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__LEFT__Group__1_in_rule__LEFT__Group__03954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LEFT__Group__0__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__Group__1__Impl_in_rule__LEFT__Group__14013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LEFT__AmountAssignment_1_in_rule__LEFT__Group__1__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__0__Impl_in_rule__RIGHT__Group__04074 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__1_in_rule__RIGHT__Group__04077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RIGHT__Group__0__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__Group__1__Impl_in_rule__RIGHT__Group__14136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RIGHT__AmountAssignment_1_in_rule__RIGHT__Group__1__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__Group__0__Impl_in_rule__SET_X__Group__04197 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SET_X__Group__1_in_rule__SET_X__Group__04200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SET_X__Group__0__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__Group__1__Impl_in_rule__SET_X__Group__14259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_X__AmountAssignment_1_in_rule__SET_X__Group__1__Impl4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__0__Impl_in_rule__SET_Y__Group__04320 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__1_in_rule__SET_Y__Group__04323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SET_Y__Group__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__Group__1__Impl_in_rule__SET_Y__Group__14382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SET_Y__AmountAssignment_1_in_rule__SET_Y__Group__1__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__0__Impl_in_rule__PENDOWN__Group__04443 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__1_in_rule__PENDOWN__Group__04446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENDOWN__Group__1__Impl_in_rule__PENDOWN__Group__14504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PENDOWN__Group__1__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENUP__Group__0__Impl_in_rule__PENUP__Group__04567 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PENUP__Group__1_in_rule__PENUP__Group__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENUP__Group__1__Impl_in_rule__PENUP__Group__14628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PENUP__Group__1__Impl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__0__Impl_in_rule__PENCOLOR__Group__04691 = new BitSet(new long[]{0x0000000001FFF060L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__1_in_rule__PENCOLOR__Group__04694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PENCOLOR__Group__0__Impl4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Group__1__Impl_in_rule__PENCOLOR__Group__14753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PENCOLOR__Alternatives_1_in_rule__PENCOLOR__Group__1__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__0__Impl_in_rule__CANVAS_COLOR__Group__04814 = new BitSet(new long[]{0x0000000001FFF060L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__1_in_rule__CANVAS_COLOR__Group__04817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CANVAS_COLOR__Group__0__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Group__1__Impl_in_rule__CANVAS_COLOR__Group__14876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CANVAS_COLOR__Alternatives_1_in_rule__CANVAS_COLOR__Group__1__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__0__Impl_in_rule__COLOR_SPEC__Group__04937 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__1_in_rule__COLOR_SPEC__Group__04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__RedAssignment_0_in_rule__COLOR_SPEC__Group__0__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__1__Impl_in_rule__COLOR_SPEC__Group__14997 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__2_in_rule__COLOR_SPEC__Group__15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__GreenAssignment_1_in_rule__COLOR_SPEC__Group__1__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__2__Impl_in_rule__COLOR_SPEC__Group__25057 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__3_in_rule__COLOR_SPEC__Group__25060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__BlueAssignment_2_in_rule__COLOR_SPEC__Group__2__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__Group__3__Impl_in_rule__COLOR_SPEC__Group__35117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__COLOR_SPEC__AlphaAssignment_3_in_rule__COLOR_SPEC__Group__3__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_SIZE__Group__0__Impl_in_rule__FONT_SIZE__Group__05182 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FONT_SIZE__Group__1_in_rule__FONT_SIZE__Group__05185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FONT_SIZE__Group__0__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_SIZE__Group__1__Impl_in_rule__FONT_SIZE__Group__15244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_SIZE__SizeAssignment_1_in_rule__FONT_SIZE__Group__1__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__0__Impl_in_rule__FONT_STYLE__Group__05305 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__1_in_rule__FONT_STYLE__Group__05308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FONT_STYLE__Group__0__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__Group__1__Impl_in_rule__FONT_STYLE__Group__15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FONT_STYLE__StyleAssignment_1_in_rule__FONT_STYLE__Group__1__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__0__Impl_in_rule__FontStyleValues__Group_0__05428 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__1_in_rule__FontStyleValues__Group_0__05431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_0__1__Impl_in_rule__FontStyleValues__Group_0__15489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FontStyleValues__Group_0__1__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__0__Impl_in_rule__FontStyleValues__Group_1__05552 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__1_in_rule__FontStyleValues__Group_1__05555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_1__1__Impl_in_rule__FontStyleValues__Group_1__15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FontStyleValues__Group_1__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__0__Impl_in_rule__FontStyleValues__Group_2__05676 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__1_in_rule__FontStyleValues__Group_2__05679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FontStyleValues__Group_2__1__Impl_in_rule__FontStyleValues__Group_2__15737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FontStyleValues__Group_2__1__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__0__Impl_in_rule__CLEAR__Group__05800 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__1_in_rule__CLEAR__Group__05803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLEAR__Group__1__Impl_in_rule__CLEAR__Group__15861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CLEAR__Group__1__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HOME__Group__0__Impl_in_rule__HOME__Group__05924 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__HOME__Group__1_in_rule__HOME__Group__05927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HOME__Group__1__Impl_in_rule__HOME__Group__15985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__HOME__Group__1__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__0__Impl_in_rule__DRAW_STRING__Group__06048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__1_in_rule__DRAW_STRING__Group__06051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DRAW_STRING__Group__0__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__Group__1__Impl_in_rule__DRAW_STRING__Group__16110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DRAW_STRING__TextAssignment_1_in_rule__DRAW_STRING__Group__1__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__0__Impl_in_rule__MAKE__Group__06171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MAKE__Group__1_in_rule__MAKE__Group__06174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__MAKE__Group__0__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__1__Impl_in_rule__MAKE__Group__16233 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MAKE__Group__2_in_rule__MAKE__Group__16236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__NameAssignment_1_in_rule__MAKE__Group__1__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__2__Impl_in_rule__MAKE__Group__26293 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MAKE__Group__3_in_rule__MAKE__Group__26296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MAKE__Group__2__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__Group__3__Impl_in_rule__MAKE__Group__36355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MAKE__ValueAssignment_3_in_rule__MAKE__Group__3__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__0__Impl_in_rule__CONTENT__Group__06420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__1_in_rule__CONTENT__Group__06423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CONTENT__Group__0__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__Group__1__Impl_in_rule__CONTENT__Group__16482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTENT__VarAssignment_1_in_rule__CONTENT__Group__1__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__0__Impl_in_rule__SUM__Group__06543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SUM__Group__1_in_rule__SUM__Group__06546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SUM__Group__0__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__1__Impl_in_rule__SUM__Group__16605 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SUM__Group__2_in_rule__SUM__Group__16608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__TargetVariableAssignment_1_in_rule__SUM__Group__1__Impl6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__2__Impl_in_rule__SUM__Group__26665 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUM__Group__3_in_rule__SUM__Group__26668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SUM__Group__2__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__3__Impl_in_rule__SUM__Group__36727 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__SUM__Group__4_in_rule__SUM__Group__36730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__ValOneAssignment_3_in_rule__SUM__Group__3__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__4__Impl_in_rule__SUM__Group__46787 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUM__Group__5_in_rule__SUM__Group__46790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__SUM__Group__4__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__Group__5__Impl_in_rule__SUM__Group__56849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUM__ValTwoAssignment_5_in_rule__SUM__Group__5__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__0__Impl_in_rule__SUBTRACT__Group__06918 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__1_in_rule__SUBTRACT__Group__06921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__SUBTRACT__Group__0__Impl6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__1__Impl_in_rule__SUBTRACT__Group__16980 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__2_in_rule__SUBTRACT__Group__16983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__TargetVariableAssignment_1_in_rule__SUBTRACT__Group__1__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__2__Impl_in_rule__SUBTRACT__Group__27040 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__3_in_rule__SUBTRACT__Group__27043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SUBTRACT__Group__2__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__3__Impl_in_rule__SUBTRACT__Group__37102 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__4_in_rule__SUBTRACT__Group__37105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__ValOneAssignment_3_in_rule__SUBTRACT__Group__3__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__4__Impl_in_rule__SUBTRACT__Group__47162 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__5_in_rule__SUBTRACT__Group__47165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SUBTRACT__Group__4__Impl7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__Group__5__Impl_in_rule__SUBTRACT__Group__57224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SUBTRACT__ValTwoAssignment_5_in_rule__SUBTRACT__Group__5__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__0__Impl_in_rule__MULTIPLY__Group__07293 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__1_in_rule__MULTIPLY__Group__07296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__MULTIPLY__Group__0__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__1__Impl_in_rule__MULTIPLY__Group__17355 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__2_in_rule__MULTIPLY__Group__17358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__TargetVariableAssignment_1_in_rule__MULTIPLY__Group__1__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__2__Impl_in_rule__MULTIPLY__Group__27415 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__3_in_rule__MULTIPLY__Group__27418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MULTIPLY__Group__2__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__3__Impl_in_rule__MULTIPLY__Group__37477 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__4_in_rule__MULTIPLY__Group__37480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__ValOneAssignment_3_in_rule__MULTIPLY__Group__3__Impl7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__4__Impl_in_rule__MULTIPLY__Group__47537 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__5_in_rule__MULTIPLY__Group__47540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MULTIPLY__Group__4__Impl7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__Group__5__Impl_in_rule__MULTIPLY__Group__57599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLY__ValTwoAssignment_5_in_rule__MULTIPLY__Group__5__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__0__Impl_in_rule__DIVIDE__Group__07668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__1_in_rule__DIVIDE__Group__07671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DIVIDE__Group__0__Impl7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__1__Impl_in_rule__DIVIDE__Group__17730 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__2_in_rule__DIVIDE__Group__17733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__TargetVariableAssignment_1_in_rule__DIVIDE__Group__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__2__Impl_in_rule__DIVIDE__Group__27790 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__3_in_rule__DIVIDE__Group__27793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DIVIDE__Group__2__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__3__Impl_in_rule__DIVIDE__Group__37852 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__4_in_rule__DIVIDE__Group__37855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__ValOneAssignment_3_in_rule__DIVIDE__Group__3__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__4__Impl_in_rule__DIVIDE__Group__47912 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__5_in_rule__DIVIDE__Group__47915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DIVIDE__Group__4__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__Group__5__Impl_in_rule__DIVIDE__Group__57974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DIVIDE__ValTwoAssignment_5_in_rule__DIVIDE__Group__5__Impl8001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__0__Impl_in_rule__REPEAT__Group__08043 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__1_in_rule__REPEAT__Group__08046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__REPEAT__Group__0__Impl8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__1__Impl_in_rule__REPEAT__Group__18105 = new BitSet(new long[]{0x04AAB78FFE000020L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__2_in_rule__REPEAT__Group__18108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__TimesAssignment_1_in_rule__REPEAT__Group__1__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__2__Impl_in_rule__REPEAT__Group__28165 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__3_in_rule__REPEAT__Group__28168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl8197 = new BitSet(new long[]{0x04AAB78FFE000022L});
    public static final BitSet FOLLOW_rule__REPEAT__CommandsAssignment_2_in_rule__REPEAT__Group__2__Impl8209 = new BitSet(new long[]{0x04AAB78FFE000022L});
    public static final BitSet FOLLOW_rule__REPEAT__Group__3__Impl_in_rule__REPEAT__Group__38242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__REPEAT__Group__3__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__0__Impl_in_rule__TO__Group__08309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TO__Group__1_in_rule__TO__Group__08312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__TO__Group__0__Impl8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__1__Impl_in_rule__TO__Group__18371 = new BitSet(new long[]{0x06AAB78FFE000020L});
    public static final BitSet FOLLOW_rule__TO__Group__2_in_rule__TO__Group__18374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__NameAssignment_1_in_rule__TO__Group__1__Impl8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__2__Impl_in_rule__TO__Group__28431 = new BitSet(new long[]{0x06AAB78FFE000020L});
    public static final BitSet FOLLOW_rule__TO__Group__3_in_rule__TO__Group__28434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__ParametersAssignment_2_in_rule__TO__Group__2__Impl8461 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__TO__Group__3__Impl_in_rule__TO__Group__38492 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__TO__Group__4_in_rule__TO__Group__38495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8524 = new BitSet(new long[]{0x06AAB78FFE000022L});
    public static final BitSet FOLLOW_rule__TO__CommandsAssignment_3_in_rule__TO__Group__3__Impl8536 = new BitSet(new long[]{0x06AAB78FFE000022L});
    public static final BitSet FOLLOW_rule__TO__Group__4__Impl_in_rule__TO__Group__48569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__TO__Group__4__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__Group__0__Impl_in_rule__PARAM__Group__08638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PARAM__Group__1_in_rule__PARAM__Group__08641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PARAM__Group__0__Impl8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__Group__1__Impl_in_rule__PARAM__Group__18700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PARAM__NameAssignment_1_in_rule__PARAM__Group__1__Impl8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__0__Impl_in_rule__PROCEDURE_CALL__Group__08761 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__1_in_rule__PROCEDURE_CALL__Group__08764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__ToAssignment_0_in_rule__PROCEDURE_CALL__Group__0__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__Group__1__Impl_in_rule__PROCEDURE_CALL__Group__18821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PROCEDURE_CALL__ParamsAssignment_1_in_rule__PROCEDURE_CALL__Group__1__Impl8848 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_rule__IF__Group__0__Impl_in_rule__IF__Group__08883 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__IF__Group__1_in_rule__IF__Group__08886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__IF__Group__0__Impl8914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF__Group__1__Impl_in_rule__IF__Group__18945 = new BitSet(new long[]{0x04AAB78FFE000020L});
    public static final BitSet FOLLOW_rule__IF__Group__2_in_rule__IF__Group__18948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF__ConditionAssignment_1_in_rule__IF__Group__1__Impl8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF__Group__2__Impl_in_rule__IF__Group__29005 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__IF__Group__3_in_rule__IF__Group__29008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IF__CommandsAssignment_2_in_rule__IF__Group__2__Impl9037 = new BitSet(new long[]{0x04AAB78FFE000022L});
    public static final BitSet FOLLOW_rule__IF__CommandsAssignment_2_in_rule__IF__Group__2__Impl9049 = new BitSet(new long[]{0x04AAB78FFE000022L});
    public static final BitSet FOLLOW_rule__IF__Group__3__Impl_in_rule__IF__Group__39082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__IF__Group__3__Impl9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__0__Impl_in_rule__EQUALS__Group__09149 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__1_in_rule__EQUALS__Group__09152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Op1Assignment_0_in_rule__EQUALS__Group__0__Impl9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__1__Impl_in_rule__EQUALS__Group__19209 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__2_in_rule__EQUALS__Group__19212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EQUALS__Group__1__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Group__2__Impl_in_rule__EQUALS__Group__29271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EQUALS__Op2Assignment_2_in_rule__EQUALS__Group__2__Impl9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__0__Impl_in_rule__GREATER_THAN__Group__09334 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__1_in_rule__GREATER_THAN__Group__09337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Op1Assignment_0_in_rule__GREATER_THAN__Group__0__Impl9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__1__Impl_in_rule__GREATER_THAN__Group__19394 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__2_in_rule__GREATER_THAN__Group__19397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__GREATER_THAN__Group__1__Impl9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Group__2__Impl_in_rule__GREATER_THAN__Group__29456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GREATER_THAN__Op2Assignment_2_in_rule__GREATER_THAN__Group__2__Impl9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__0__Impl_in_rule__LESSER_THAN__Group__09519 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__1_in_rule__LESSER_THAN__Group__09522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Op1Assignment_0_in_rule__LESSER_THAN__Group__0__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__1__Impl_in_rule__LESSER_THAN__Group__19579 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__2_in_rule__LESSER_THAN__Group__19582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__LESSER_THAN__Group__1__Impl9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Group__2__Impl_in_rule__LESSER_THAN__Group__29641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LESSER_THAN__Op2Assignment_2_in_rule__LESSER_THAN__Group__2__Impl9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__TortugaProgram__SentencesAssignment9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__FORWARD__AmountAssignment_19740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__LEFT__AmountAssignment_19771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__RIGHT__AmountAssignment_19802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SET_X__AmountAssignment_19833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SET_Y__AmountAssignment_19864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_rule__PENCOLOR__ColorAssignment_1_09895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_rule__PENCOLOR__ColorSpecAssignment_1_19926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_in_rule__CANVAS_COLOR__ColorAssignment_1_09957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOLOR_SPEC_in_rule__CANVAS_COLOR__ColorSpecAssignment_1_19988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__RedAssignment_010019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__GreenAssignment_110050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__BlueAssignment_210081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__COLOR_SPEC__AlphaAssignment_310112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__FONT_SIZE__SizeAssignment_110143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFontStyleValues_in_rule__FONT_STYLE__StyleAssignment_110174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DRAW_STRING__TextAssignment_110205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MAKE__NameAssignment_110236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__MAKE__ValueAssignment_310267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_REF__ToVarAssignment10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__VALUE__ValAssignment10337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CONTENT__VarAssignment_110372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SUM__TargetVariableAssignment_110411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUM__ValOneAssignment_310446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUM__ValTwoAssignment_510477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SUBTRACT__TargetVariableAssignment_110512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValOneAssignment_310547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__SUBTRACT__ValTwoAssignment_510578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MULTIPLY__TargetVariableAssignment_110613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValOneAssignment_310648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__MULTIPLY__ValTwoAssignment_510679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DIVIDE__TargetVariableAssignment_110714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValOneAssignment_310749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__DIVIDE__ValTwoAssignment_510780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__REPEAT__TimesAssignment_110811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__REPEAT__CommandsAssignment_210842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TO__NameAssignment_110873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_in_rule__TO__ParametersAssignment_210904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__TO__CommandsAssignment_310935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PARAM__NameAssignment_110966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PROCEDURE_CALL__ToAssignment_011001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__PROCEDURE_CALL__ParamsAssignment_111036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_EXPRESSION_in_rule__IF__ConditionAssignment_111067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSENTENCE_in_rule__IF__CommandsAssignment_211098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op1Assignment_011129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__EQUALS__Op2Assignment_211160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op1Assignment_011191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__GREATER_THAN__Op2Assignment_211222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op1Assignment_011253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__LESSER_THAN__Op2Assignment_211284 = new BitSet(new long[]{0x0000000000000002L});

}