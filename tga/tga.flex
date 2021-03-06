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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

%%

%public
%class AnalisadorLexico
%standalone

%unicode

%{
	static boolean previousIsType;
	static int scope = 0;
	static int identifierCount = 0;
	static Map<String, Integer> identifiers = new HashMap<String, Integer>();
	static Map<String, Integer> identifierScope = new HashMap<String, Integer>();
	 
	private static void printIdentifier(String word) {
		String variableScoped = word;
		// se isType 
		if(previousIsType){
			// grava com novo id e escopo
			identifierCount++;
			if(scope > 0) {
				variableScoped.concat(Integer.toString(scope));
			}
			identifiers.put(variableScoped, identifierCount);
			identifierScope.put(word, scope);
			System.out.printf("[Id, %s]\n", identifierCount);
		} else {
			// ao consultar busca o var com maior escopo
			int searchScope = scope;
			while(searchScope > 0) {
				for(String key: identifierScope.keySet()) {
					if(key.equals(word) && identifierScope.get(key).equals(searchScope)) {
						variableScoped.concat(Integer.toString(searchScope));
						searchScope = 0;
					}
				}
				searchScope--;
			}

			if (identifiers.get(variableScoped) == null) {
				identifierCount++;
				identifiers.put(word, identifierCount);
				identifierScope.put(word, scope);
				System.out.printf("[Id, %s ]\n", identifierCount);
			} else {
				 System.out.printf("[Id, %s]\n", identifiers.get(variableScoped));
			}
		}
	}

	private static void closeScope(int scope) {
		for(String key: identifierScope.keySet()) {
			if(identifierScope.get(key).equals(scope)) {
				identifiers.remove(key);
			}
		}
		identifierScope.values().removeIf(val -> val.equals(scope));
	}

	private void writeOtherChar(String value) {
		switch(value){
			case "=":
				System.out.println("[equal, " + yytext() + "]"); 
				break;
			case "(":
				scope++;
				System.out.println("[l_paren, " + yytext() + "]"); 
				break;
			case ")":
				scope--;
				System.out.println("[r_paren, " + yytext() + "]"); 
				break;
			case "[":
				System.out.println("[l_bracket, " + yytext() + "]"); 
				break;
			case "]":
				System.out.println("[r_bracket, " + yytext() + "]"); 
				break;
			case "{":
			scope++;
				System.out.println("[l_braces, " + yytext() + "]"); 
				break;
			case "}":
				closeScope(scope);
				scope--;
				System.out.println("[r_braces, " + yytext() + "]"); 
				break;
			case ",":
				System.out.println("[comma, " + yytext() + "]"); 
				break;
			case ";":
				System.out.println("[semicolon, " + yytext() + "]"); 
				break;
		}
	}

	private String getFormattedString(String text) {
		String withoutQuotes = text.replaceAll("\"", "");
		return withoutQuotes.replaceAll("\\s+", " ");
	}
%}

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
InputCharacter = [^\r\n]

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
Comment = {TraditionalComment} | {EndOfLineComment}

Includes = "#include <stdio.h>" | "#include <conio.h>"

Condition = "if"|"else"|"switch"|"case"
Loop = "do"|"while"|"for"|"break"
Type = "int"|"float"|"double"|"string"|"bool"|"void"
NullType = "null"|"NULL"
OtherReservedWord = "return"
ReservedWord = {Condition} | {Loop} | {NullType} | {OtherReservedWord}

OtherCharacteres = "="|"("|")"|"{"|"}"|"["|"]"|","|";"|"."

RelationalOperator = "<"|"<="|"=="|"!="|">="|">"

LogicalOperator = "&&"|"||"

ArithmeticOperator = "+"|"-"|"*"|"/"|"%"

OtherOperator = "&"

Digit = [0-9]
Id = [a-zA-Z][a-zA-Z0-9]*
String = (\"[^\"]*\")

%%

/* integers */
{Digit}+ { System.out.println("[num, " + yytext() + "]"); previousIsType = false; }

/* floats */
{Digit}+"."{Digit}+ { System.out.println("[num, " + yytext() + "]"); previousIsType = false; }

/* reserved words */
{ReservedWord} { System.out.println("[reserved_word, " + yytext() + "]"); previousIsType = false; }
{Type} { System.out.println("[reserved_word, " + yytext() + "]"); previousIsType = true; }

/* other characteres */
{OtherCharacteres} { writeOtherChar(yytext()); previousIsType = false; }

/* relational operator */
{RelationalOperator} { System.out.println("[relational_operator, " + yytext() + "]"); previousIsType = false; }

/* logical operator */
{LogicalOperator} { System.out.println("[logical_operator, " + yytext() + "]"); previousIsType = false; }

/* arithmetic operator */
{ArithmeticOperator} { System.out.println("[arithmetic_operator, " + yytext() + "]"); previousIsType = false; }

/* other operators */
{OtherOperator} { System.out.println("[operator, " + yytext() + "]"); previousIsType = false; }

/* strings */
{String} { System.out.println("[string_literal, " + getFormattedString(yytext()) + "]"); previousIsType = false; }

/* identifiers */
{Id} { printIdentifier(yytext()); previousIsType = false; }

{WhiteSpace} { /* ignore */ }
{Comment} { /* ignore */ }
{Includes} { /* ignore */ }

/* error fallback */
[^] { System.out.println("Illegal character <" + yytext() + ">"); }
