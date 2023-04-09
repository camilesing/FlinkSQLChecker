package com.camile.checker;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.camile.checker.FlinkSqlCheckerTypes.*;

%%

%{
  public _FlinkSqlCheckerLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _FlinkSqlCheckerLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT=--.*
WHITE_SPACE2=[ \n\r\t\f]
CHARACTER='.'
STRINGLIT=\"([^\"\\]|\\.)*\"
LEFT_BRACKET=\(
RIGHT_BRACKET=\)
ENGLISH_STRING=[a-zA-Z]*
CHINESE_STRING=[\u4e00-\u9fa5]|：|，|、*
NUMBER=[0-9]*
DOUBLE=[0-9|.]*

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "-"                   { return HYPHEN; }
  "_"                   { return UNDERSCORE; }
  ","                   { return COMMA; }
  "+"                   { return PLUS; }
  "."                   { return PERIOD; }
  ":"                   { return COLON; }
  "*"                   { return ANY; }
  "="                   { return EQUALS; }
  "<>"                  { return NOT_EQUALS; }
  "!="                  { return NOT_EQUALS2; }
  ">="                  { return GE; }
  "<"                   { return LT; }
  "<="                  { return LE; }
  ";"                   { return SEMI_COLON; }
  "'"                   { return SINGLE_QUOTATION; }
  "/"                   { return SLASH; }
  "["                   { return LSBTRACE; }
  "]"                   { return RSBTRACE; }
  "{"                   { return LBRACE; }
  "}"                   { return RBRACE; }
  "TEXTAGG"             { return TEXTAGG; }
  "END"                 { return END; }
  "ε"                   { return Ε; }
  "IF"                  { return IF; }
  "NOT"                 { return NOT; }
  "EXSIT"               { return EXSIT; }

  {COMMENT}             { return COMMENT; }
  {WHITE_SPACE2}        { return WHITE_SPACE2; }
  {CHARACTER}           { return CHARACTER; }
  {STRINGLIT}           { return STRINGLIT; }
  {LEFT_BRACKET}        { return LEFT_BRACKET; }
  {RIGHT_BRACKET}       { return RIGHT_BRACKET; }
  {ENGLISH_STRING}      { return ENGLISH_STRING; }
  {CHINESE_STRING}      { return CHINESE_STRING; }
  {NUMBER}              { return NUMBER; }
  {DOUBLE}              { return DOUBLE; }

}

[^] { return BAD_CHARACTER; }
