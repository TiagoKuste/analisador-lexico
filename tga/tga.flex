/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Trabalho GA Tradutores - UNISINOS                                       *
 * Karolina Pacheco                                                        *
 * Nadine Schneider                                                        *
 * Tiago Costa                                                             *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


/**
   Este é o arquivo que contém as regras para geração do analisador léxico
   para o trabalho do GA da disciplina de Tradutores da UNISINOS
*/

%%

%public
%class AnalisadorLexico
%standalone

%unicode

%{
  private void writeOtherChar(String value) {
  	switch(value){
  		case "=":
  			System.out.println("[equal, " + yytext() + "]"); 
  			break;
  		case "(":
  			System.out.println("[l_paren, " + yytext() + "]"); 
  			break;
  		case ")":
  			System.out.println("[r_paren, " + yytext() + "]"); 
  			break;
  		case "{":
  			System.out.println("[l_bracket, " + yytext() + "]"); 
  			break;
  		case "}":
  			System.out.println("[r_bracket, " + yytext() + "]"); 
  			break;
  		case ",":
  			System.out.println("[comma, " + yytext() + "]"); 
  			break;
  		case ";":
  			System.out.println("[semicolon, " + yytext() + "]"); 
  			break;
  	}
  }
%}

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
InputCharacter = [^\r\n]

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
Comment = {TraditionalComment} | {EndOfLineComment}

Condition = "if"|"else"|"switch"|"case"
Loop = "do"|"while"|"for"|"break"
Type = "int"|"float"|"double"|"string"|"bool"|"null"|"NULL"
OtherReservedWord = "return"|"void"|"printf"|"scanf"
ReservedWord = {Condition} | {Loop} | {Type} | {OtherReservedWord}

OtherCharacteres = "="|"("|")"|"{"|"}"|","|";"

Digit = [0-9]
Id = [a-z][a-z0-9]*

%%

/* integers */
{Digit}+ { System.out.println("[num, " + yytext() + "]"); }

/* floats */
{Digit}+"."{Digit}+ { System.out.println("[num, " + yytext() + "]"); }

/* reserved words */
{ReservedWord} { System.out.println("[reserved_word, " + yytext() + "]"); }

/* other characteres */
{OtherCharacteres} { writeOtherChar(yytext()); }

{WhiteSpace} { /* ignore */ }
{Comment} { /* ignore */ }

/* error fallback */
[^] { System.out.println("Illegal character <" + yytext() + ">"); }
