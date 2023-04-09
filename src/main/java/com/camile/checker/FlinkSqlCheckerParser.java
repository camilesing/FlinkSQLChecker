// This is a generated file. Not intended for manual editing.
package com.camile.checker;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.camile.checker.FlinkSqlCheckerTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FlinkSqlCheckerParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return FlinkSqlFile(b, l + 1);
  }

  /* ********************************************************** */
  // allStatement*
  static boolean FlinkSqlFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FlinkSqlFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FlinkSqlFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'ADD' 'JAR' SINGLE_QUOTATION pathToFileName PERIOD 'jar' SINGLE_QUOTATION SEMI_COLON
  public static boolean addJar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "addJar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_JAR, "<add jar>");
    r = consumeToken(b, "ADD");
    r = r && consumeToken(b, "JAR");
    r = r && consumeToken(b, SINGLE_QUOTATION);
    r = r && pathToFileName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && consumeToken(b, "jar");
    r = r && consumeTokens(b, 0, SINGLE_QUOTATION, SEMI_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier PERIOD '*'
  public static boolean allInGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allInGroup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALL_IN_GROUP, "<all in group>");
    r = identifier(b, l + 1);
    r = r && consumeTokens(b, 0, PERIOD, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // selectStatement | queryStatement | createStatement | jarCommand | insertStatement | note
  public static boolean allStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALL_STATEMENT, "<all statement>");
    r = selectStatement(b, l + 1);
    if (!r) r = queryStatement(b, l + 1);
    if (!r) r = createStatement(b, l + 1);
    if (!r) r = jarCommand(b, l + 1);
    if (!r) r = insertStatement(b, l + 1);
    if (!r) r = note(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // baseString | CHINESE_STRING
  public static boolean allString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allString")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALL_STRING, "<all string>");
    r = baseString(b, l + 1);
    if (!r) r = consumeToken(b, CHINESE_STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('ROW_NUMBER' | 'RANK' | 'DENSE_RANK' ) LEFT_BRACKET RIGHT_BRACKET
  public static boolean analyticAggregateFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "analyticAggregateFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANALYTIC_AGGREGATE_FUNCTION, "<analytic aggregate function>");
    r = analyticAggregateFunction_0(b, l + 1);
    r = r && consumeTokens(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'ROW_NUMBER' | 'RANK' | 'DENSE_RANK'
  private static boolean analyticAggregateFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "analyticAggregateFunction_0")) return false;
    boolean r;
    r = consumeToken(b, "ROW_NUMBER");
    if (!r) r = consumeToken(b, "RANK");
    if (!r) r = consumeToken(b, "DENSE_RANK");
    return r;
  }

  /* ********************************************************** */
  // identifier eq (  ( callStatement [ ( 'WITH' | 'WITHOUT' ) 'RETURN' ])  | assignmentStatementOperand)
  public static boolean assignmentStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT, "<assignment statement>");
    r = identifier(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && assignmentStatement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( callStatement [ ( 'WITH' | 'WITHOUT' ) 'RETURN' ])  | assignmentStatementOperand
  private static boolean assignmentStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignmentStatement_2_0(b, l + 1);
    if (!r) r = assignmentStatementOperand(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // callStatement [ ( 'WITH' | 'WITHOUT' ) 'RETURN' ]
  private static boolean assignmentStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = callStatement(b, l + 1);
    r = r && assignmentStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( 'WITH' | 'WITHOUT' ) 'RETURN' ]
  private static boolean assignmentStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement_2_0_1")) return false;
    assignmentStatement_2_0_1_0(b, l + 1);
    return true;
  }

  // ( 'WITH' | 'WITHOUT' ) 'RETURN'
  private static boolean assignmentStatement_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignmentStatement_2_0_1_0_0(b, l + 1);
    r = r && consumeToken(b, "RETURN");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'WITH' | 'WITHOUT'
  private static boolean assignmentStatement_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatement_2_0_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "WITH");
    if (!r) r = consumeToken(b, "WITHOUT");
    return r;
  }

  /* ********************************************************** */
  // insertStatement   | queryExpression | sqlException | expression
  public static boolean assignmentStatementOperand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignmentStatementOperand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_STATEMENT_OPERAND, "<assignment statement operand>");
    r = insertStatement(b, l + 1);
    if (!r) r = queryExpression(b, l + 1);
    if (!r) r = sqlException(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (keyWords ( HYPHEN | UNDERSCORE ) (ENGLISH_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE|COLON) ) | !keyWords (ENGLISH_STRING | CHINESE_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE|COLON)
  public static boolean baseString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_STRING, "<base string>");
    r = baseString_0(b, l + 1);
    if (!r) r = baseString_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // keyWords ( HYPHEN | UNDERSCORE ) (ENGLISH_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE|COLON)
  private static boolean baseString_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = keyWords(b, l + 1);
    r = r && baseString_0_1(b, l + 1);
    r = r && baseString_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // HYPHEN | UNDERSCORE
  private static boolean baseString_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString_0_1")) return false;
    boolean r;
    r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    return r;
  }

  // ENGLISH_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE|COLON
  private static boolean baseString_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString_0_2")) return false;
    boolean r;
    r = consumeToken(b, ENGLISH_STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, COLON);
    return r;
  }

  // !keyWords (ENGLISH_STRING | CHINESE_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE|COLON)
  private static boolean baseString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = baseString_1_0(b, l + 1);
    r = r && baseString_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !keyWords
  private static boolean baseString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !keyWords(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ENGLISH_STRING | CHINESE_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE|COLON
  private static boolean baseString_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseString_1_1")) return false;
    boolean r;
    r = consumeToken(b, ENGLISH_STRING);
    if (!r) r = consumeToken(b, CHINESE_STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, COLON);
    return r;
  }

  /* ********************************************************** */
  // [stringNot] commonValueExpression 'AND' commonValueExpression
  public static boolean betweenPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "betweenPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BETWEEN_PREDICATE, "<between predicate>");
    r = betweenPredicate_0(b, l + 1);
    r = r && commonValueExpression(b, l + 1);
    r = r && consumeToken(b, "AND");
    r = r && commonValueExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringNot]
  private static boolean betweenPredicate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "betweenPredicate_0")) return false;
    stringNot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // booleanValueExpression
  public static boolean booleanExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_EXPRESSION, "<boolean expression>");
    r = booleanValueExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [stringNot]  booleanPrimary
  public static boolean booleanFactor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanFactor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_FACTOR, "<boolean factor>");
    r = booleanFactor_0(b, l + 1);
    r = r && booleanPrimary(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringNot]
  private static boolean booleanFactor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanFactor_0")) return false;
    stringNot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // existsPredicate
  //                     | (commonValueExpression [betweenPredicate|matchPredicate|likeRegexPredicate|inPredicate|isNullPredicate|quantifiedComparisonPredicate|comparisonPredicate])
  public static boolean booleanPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_PRIMARY, "<boolean primary>");
    r = existsPredicate(b, l + 1);
    if (!r) r = booleanPrimary_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // commonValueExpression [betweenPredicate|matchPredicate|likeRegexPredicate|inPredicate|isNullPredicate|quantifiedComparisonPredicate|comparisonPredicate]
  private static boolean booleanPrimary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanPrimary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commonValueExpression(b, l + 1);
    r = r && booleanPrimary_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [betweenPredicate|matchPredicate|likeRegexPredicate|inPredicate|isNullPredicate|quantifiedComparisonPredicate|comparisonPredicate]
  private static boolean booleanPrimary_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanPrimary_1_1")) return false;
    booleanPrimary_1_1_0(b, l + 1);
    return true;
  }

  // betweenPredicate|matchPredicate|likeRegexPredicate|inPredicate|isNullPredicate|quantifiedComparisonPredicate|comparisonPredicate
  private static boolean booleanPrimary_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanPrimary_1_1_0")) return false;
    boolean r;
    r = betweenPredicate(b, l + 1);
    if (!r) r = matchPredicate(b, l + 1);
    if (!r) r = likeRegexPredicate(b, l + 1);
    if (!r) r = inPredicate(b, l + 1);
    if (!r) r = isNullPredicate(b, l + 1);
    if (!r) r = quantifiedComparisonPredicate(b, l + 1);
    if (!r) r = comparisonPredicate(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // booleanFactor ('AND' booleanFactor)*
  public static boolean booleanTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_TERM, "<boolean term>");
    r = booleanFactor(b, l + 1);
    r = r && booleanTerm_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('AND' booleanFactor)*
  private static boolean booleanTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanTerm_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!booleanTerm_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "booleanTerm_1", c)) break;
    }
    return true;
  }

  // 'AND' booleanFactor
  private static boolean booleanTerm_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanTerm_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "AND");
    r = r && booleanFactor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // booleanTerm ( 'OR' booleanTerm)*
  public static boolean booleanValueExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanValueExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_VALUE_EXPRESSION, "<boolean value expression>");
    r = booleanTerm(b, l + 1);
    r = r && booleanValueExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( 'OR' booleanTerm)*
  private static boolean booleanValueExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanValueExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!booleanValueExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "booleanValueExpression_1", c)) break;
    }
    return true;
  }

  // 'OR' booleanTerm
  private static boolean booleanValueExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanValueExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OR");
    r = r && booleanTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (('BREAK'| 'CONTINUE') [identifier] ) | ( 'LEAVE' identifier )
  public static boolean branchingStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branchingStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BRANCHING_STATEMENT, "<branching statement>");
    r = branchingStatement_0(b, l + 1);
    if (!r) r = branchingStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('BREAK'| 'CONTINUE') [identifier]
  private static boolean branchingStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branchingStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = branchingStatement_0_0(b, l + 1);
    r = r && branchingStatement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'BREAK'| 'CONTINUE'
  private static boolean branchingStatement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branchingStatement_0_0")) return false;
    boolean r;
    r = consumeToken(b, "BREAK");
    if (!r) r = consumeToken(b, "CONTINUE");
    return r;
  }

  // [identifier]
  private static boolean branchingStatement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branchingStatement_0_1")) return false;
    identifier(b, l + 1);
    return true;
  }

  // 'LEAVE' identifier
  private static boolean branchingStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "branchingStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LEAVE");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( 'EXEC' | 'EXECUTE' | 'CALL' ) identifier LEFT_BRACKET ( namedParameterList | [expressionList] ) RIGHT_BRACKET
  public static boolean callStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_STATEMENT, "<call statement>");
    r = callStatement_0(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && callStatement_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'EXEC' | 'EXECUTE' | 'CALL'
  private static boolean callStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_0")) return false;
    boolean r;
    r = consumeToken(b, "EXEC");
    if (!r) r = consumeToken(b, "EXECUTE");
    if (!r) r = consumeToken(b, "CALL");
    return r;
  }

  // namedParameterList | [expressionList]
  private static boolean callStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namedParameterList(b, l + 1);
    if (!r) r = callStatement_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expressionList]
  private static boolean callStatement_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callStatement_3_1")) return false;
    expressionList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // stringCase [expression] stringWhen expression stringThen expression stringElse expression stringEnd
  public static boolean caseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_EXPRESSION, "<case expression>");
    r = stringCase(b, l + 1);
    r = r && caseExpression_1(b, l + 1);
    r = r && stringWhen(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && stringThen(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && stringElse(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && stringEnd(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [expression]
  private static boolean caseExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseExpression_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // baseString | envVar
  public static boolean catalogName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catalogName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CATALOG_NAME, "<catalog name>");
    r = baseString(b, l + 1);
    if (!r) r = envVar(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // baseString
  public static boolean column(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "column")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLUMN, "<column>");
    r = baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ['CONSTRAINTS' columnName] ['PRIMARY KEY'] [stringNot] ['NULL'] ['ENFORCED']
  public static boolean columnConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLUMN_CONSTRAINT, "<column constraint>");
    r = columnConstraint_0(b, l + 1);
    r = r && columnConstraint_1(b, l + 1);
    r = r && columnConstraint_2(b, l + 1);
    r = r && columnConstraint_3(b, l + 1);
    r = r && columnConstraint_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['CONSTRAINTS' columnName]
  private static boolean columnConstraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint_0")) return false;
    columnConstraint_0_0(b, l + 1);
    return true;
  }

  // 'CONSTRAINTS' columnName
  private static boolean columnConstraint_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CONSTRAINTS");
    r = r && columnName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['PRIMARY KEY']
  private static boolean columnConstraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint_1")) return false;
    consumeToken(b, "PRIMARY KEY");
    return true;
  }

  // [stringNot]
  private static boolean columnConstraint_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint_2")) return false;
    stringNot(b, l + 1);
    return true;
  }

  // ['NULL']
  private static boolean columnConstraint_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint_3")) return false;
    consumeToken(b, "NULL");
    return true;
  }

  // ['ENFORCED']
  private static boolean columnConstraint_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnConstraint_4")) return false;
    consumeToken(b, "ENFORCED");
    return true;
  }

  /* ********************************************************** */
  // LEFT_BRACKET identifier (COMMA identifier) RIGHT_BRACKET
  public static boolean columnList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnList")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && identifier(b, l + 1);
    r = r && columnList_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, COLUMN_LIST, r);
    return r;
  }

  // COMMA identifier
  private static boolean columnList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnList_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // specialColumnName | commonColumnName
  public static boolean columnName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "columnName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COLUMN_NAME, "<column name>");
    r = specialColumnName(b, l + 1);
    if (!r) r = commonColumnName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (SINGLE_QUOTATION(COLON | HYPHEN | UNDERSCORE | allString*)SINGLE_QUOTATION)*
  public static boolean commentContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentContent")) return false;
    Marker m = enter_section_(b, l, _NONE_, COMMENT_CONTENT, "<comment content>");
    while (true) {
      int c = current_position_(b);
      if (!commentContent_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "commentContent", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // SINGLE_QUOTATION(COLON | HYPHEN | UNDERSCORE | allString*)SINGLE_QUOTATION
  private static boolean commentContent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentContent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTATION);
    r = r && commentContent_0_1(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON | HYPHEN | UNDERSCORE | allString*
  private static boolean commentContent_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentContent_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = commentContent_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allString*
  private static boolean commentContent_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commentContent_0_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "commentContent_0_1_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ( HYPHEN | UNDERSCORE | baseString ) *
  public static boolean commonColumnName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commonColumnName")) return false;
    Marker m = enter_section_(b, l, _NONE_, COMMON_COLUMN_NAME, "<common column name>");
    while (true) {
      int c = current_position_(b);
      if (!commonColumnName_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "commonColumnName", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // HYPHEN | UNDERSCORE | baseString
  private static boolean commonColumnName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commonColumnName_0")) return false;
    boolean r;
    r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = baseString(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // numericValueExpression (('&&'|'||') numericValueExpression)*
  public static boolean commonValueExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commonValueExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMON_VALUE_EXPRESSION, "<common value expression>");
    r = numericValueExpression(b, l + 1);
    r = r && commonValueExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('&&'|'||') numericValueExpression)*
  private static boolean commonValueExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commonValueExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!commonValueExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "commonValueExpression_1", c)) break;
    }
    return true;
  }

  // ('&&'|'||') numericValueExpression
  private static boolean commonValueExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commonValueExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commonValueExpression_1_0_0(b, l + 1);
    r = r && numericValueExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&&'|'||'
  private static boolean commonValueExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commonValueExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "&&");
    if (!r) r = consumeToken(b, "||");
    return r;
  }

  /* ********************************************************** */
  // '=' | '!=' | '<>' | '<' | '<=' | '>=' | '>'
  public static boolean comparisonOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUALS2);
    if (!r) r = consumeToken(b, NOT_EQUALS);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, LE);
    if (!r) r = consumeToken(b, GE);
    if (!r) r = consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // comparisonOperator commonValueExpression
  public static boolean comparisonPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_PREDICATE, "<comparison predicate>");
    r = comparisonOperator(b, l + 1);
    r = r && commonValueExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'BEGIN' [[stringNot] 'ATOMIC'] (statement)* ['EXCEPTION' identifier (statement) ] END
  public static boolean compoundStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_STATEMENT, "<compound statement>");
    r = consumeToken(b, "BEGIN");
    r = r && compoundStatement_1(b, l + 1);
    r = r && compoundStatement_2(b, l + 1);
    r = r && compoundStatement_3(b, l + 1);
    r = r && consumeToken(b, END);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [[stringNot] 'ATOMIC']
  private static boolean compoundStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_1")) return false;
    compoundStatement_1_0(b, l + 1);
    return true;
  }

  // [stringNot] 'ATOMIC'
  private static boolean compoundStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compoundStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, "ATOMIC");
    exit_section_(b, m, null, r);
    return r;
  }

  // [stringNot]
  private static boolean compoundStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_1_0_0")) return false;
    stringNot(b, l + 1);
    return true;
  }

  // (statement)*
  private static boolean compoundStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!compoundStatement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compoundStatement_2", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean compoundStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['EXCEPTION' identifier (statement) ]
  private static boolean compoundStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_3")) return false;
    compoundStatement_3_0(b, l + 1);
    return true;
  }

  // 'EXCEPTION' identifier (statement)
  private static boolean compoundStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXCEPTION");
    r = r && identifier(b, l + 1);
    r = r && compoundStatement_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)
  private static boolean compoundStatement_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundStatement_3_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (columnName stringAs computedColumnExpression) | (function stringAs columnName)
  public static boolean computedColumnDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "computedColumnDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPUTED_COLUMN_DEFINITION, "<computed column definition>");
    r = computedColumnDefinition_0(b, l + 1);
    if (!r) r = computedColumnDefinition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // columnName stringAs computedColumnExpression
  private static boolean computedColumnDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "computedColumnDefinition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columnName(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && computedColumnExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // function stringAs columnName
  private static boolean computedColumnDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "computedColumnDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && columnName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseString | 'PROCTIME()'
  public static boolean computedColumnExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "computedColumnExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPUTED_COLUMN_EXPRESSION, "<computed column expression>");
    r = baseString(b, l + 1);
    if (!r) r = consumeToken(b, "PROCTIME()");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // booleanValueExpression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = booleanValueExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (createTable | createView) SEMI_COLON
  public static boolean createStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATE_STATEMENT, "<create statement>");
    r = createStatement_0(b, l + 1);
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // createTable | createView
  private static boolean createStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createStatement_0")) return false;
    boolean r;
    r = createTable(b, l + 1);
    if (!r) r = createView(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // stringCreate stringTable [IF NOT EXSIT] [catalogName PERIOD][dbName PERIOD] tableName
  //                 LEFT_BRACKET
  //                   oneTableField(COMMA oneTableField)*
  //                   ['COMMENT' commentContent]
  //                   ['PARTITIONED BY' (columnName[COMMA])*]
  //                  RIGHT_BRACKET
  //                  withStr
  //                  '('
  //                      (SINGLE_QUOTATION key SINGLE_QUOTATION EQUALS SINGLE_QUOTATION val SINGLE_QUOTATION)
  //                       (COMMA SINGLE_QUOTATION key SINGLE_QUOTATION EQUALS SINGLE_QUOTATION val SINGLE_QUOTATION)*
  //                   [ 'LIKE' sourceTable [( likeOptions )] | stringAs query ]
  //                 ')'
  public static boolean createTable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATE_TABLE, "<create table>");
    r = stringCreate(b, l + 1);
    r = r && stringTable(b, l + 1);
    r = r && createTable_2(b, l + 1);
    r = r && createTable_3(b, l + 1);
    r = r && createTable_4(b, l + 1);
    r = r && tableName(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && oneTableField(b, l + 1);
    r = r && createTable_8(b, l + 1);
    r = r && createTable_9(b, l + 1);
    r = r && createTable_10(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    r = r && withStr(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && createTable_14(b, l + 1);
    r = r && createTable_15(b, l + 1);
    r = r && createTable_16(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [IF NOT EXSIT]
  private static boolean createTable_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_2")) return false;
    parseTokens(b, 0, IF, NOT, EXSIT);
    return true;
  }

  // [catalogName PERIOD]
  private static boolean createTable_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_3")) return false;
    createTable_3_0(b, l + 1);
    return true;
  }

  // catalogName PERIOD
  private static boolean createTable_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [dbName PERIOD]
  private static boolean createTable_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_4")) return false;
    createTable_4_0(b, l + 1);
    return true;
  }

  // dbName PERIOD
  private static boolean createTable_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dbName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA oneTableField)*
  private static boolean createTable_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!createTable_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "createTable_8", c)) break;
    }
    return true;
  }

  // COMMA oneTableField
  private static boolean createTable_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && oneTableField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['COMMENT' commentContent]
  private static boolean createTable_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_9")) return false;
    createTable_9_0(b, l + 1);
    return true;
  }

  // 'COMMENT' commentContent
  private static boolean createTable_9_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_9_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COMMENT");
    r = r && commentContent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['PARTITIONED BY' (columnName[COMMA])*]
  private static boolean createTable_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_10")) return false;
    createTable_10_0(b, l + 1);
    return true;
  }

  // 'PARTITIONED BY' (columnName[COMMA])*
  private static boolean createTable_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_10_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "PARTITIONED BY");
    r = r && createTable_10_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (columnName[COMMA])*
  private static boolean createTable_10_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_10_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!createTable_10_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "createTable_10_0_1", c)) break;
    }
    return true;
  }

  // columnName[COMMA]
  private static boolean createTable_10_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_10_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columnName(b, l + 1);
    r = r && createTable_10_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean createTable_10_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_10_0_1_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // SINGLE_QUOTATION key SINGLE_QUOTATION EQUALS SINGLE_QUOTATION val SINGLE_QUOTATION
  private static boolean createTable_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTATION);
    r = r && key(b, l + 1);
    r = r && consumeTokens(b, 0, SINGLE_QUOTATION, EQUALS, SINGLE_QUOTATION);
    r = r && val(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA SINGLE_QUOTATION key SINGLE_QUOTATION EQUALS SINGLE_QUOTATION val SINGLE_QUOTATION)*
  private static boolean createTable_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_15")) return false;
    while (true) {
      int c = current_position_(b);
      if (!createTable_15_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "createTable_15", c)) break;
    }
    return true;
  }

  // COMMA SINGLE_QUOTATION key SINGLE_QUOTATION EQUALS SINGLE_QUOTATION val SINGLE_QUOTATION
  private static boolean createTable_15_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_15_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, SINGLE_QUOTATION);
    r = r && key(b, l + 1);
    r = r && consumeTokens(b, 0, SINGLE_QUOTATION, EQUALS, SINGLE_QUOTATION);
    r = r && val(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LIKE' sourceTable [( likeOptions )] | stringAs query ]
  private static boolean createTable_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_16")) return false;
    createTable_16_0(b, l + 1);
    return true;
  }

  // 'LIKE' sourceTable [( likeOptions )] | stringAs query
  private static boolean createTable_16_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_16_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = createTable_16_0_0(b, l + 1);
    if (!r) r = createTable_16_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'LIKE' sourceTable [( likeOptions )]
  private static boolean createTable_16_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_16_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIKE");
    r = r && sourceTable(b, l + 1);
    r = r && createTable_16_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [( likeOptions )]
  private static boolean createTable_16_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_16_0_0_2")) return false;
    createTable_16_0_0_2_0(b, l + 1);
    return true;
  }

  // ( likeOptions )
  private static boolean createTable_16_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_16_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = likeOptions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // stringAs query
  private static boolean createTable_16_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createTable_16_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringAs(b, l + 1);
    r = r && query(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // stringCreate ['TEMPORARY'] 'VIEW' ['IF' stringNot 'EXISTS'] [catalogName PERIOD][dbName PERIOD]tableName
  //                  [( columnName (COMMA columnName )* )] ['COMMENT' commentContent]
  //                  stringAs queryWithoutSemiColon
  public static boolean createView(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CREATE_VIEW, "<create view>");
    r = stringCreate(b, l + 1);
    r = r && createView_1(b, l + 1);
    r = r && consumeToken(b, "VIEW");
    r = r && createView_3(b, l + 1);
    r = r && createView_4(b, l + 1);
    r = r && createView_5(b, l + 1);
    r = r && tableName(b, l + 1);
    r = r && createView_7(b, l + 1);
    r = r && createView_8(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && queryWithoutSemiColon(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['TEMPORARY']
  private static boolean createView_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_1")) return false;
    consumeToken(b, "TEMPORARY");
    return true;
  }

  // ['IF' stringNot 'EXISTS']
  private static boolean createView_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_3")) return false;
    createView_3_0(b, l + 1);
    return true;
  }

  // 'IF' stringNot 'EXISTS'
  private static boolean createView_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "IF");
    r = r && stringNot(b, l + 1);
    r = r && consumeToken(b, "EXISTS");
    exit_section_(b, m, null, r);
    return r;
  }

  // [catalogName PERIOD]
  private static boolean createView_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_4")) return false;
    createView_4_0(b, l + 1);
    return true;
  }

  // catalogName PERIOD
  private static boolean createView_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [dbName PERIOD]
  private static boolean createView_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_5")) return false;
    createView_5_0(b, l + 1);
    return true;
  }

  // dbName PERIOD
  private static boolean createView_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dbName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [( columnName (COMMA columnName )* )]
  private static boolean createView_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_7")) return false;
    createView_7_0(b, l + 1);
    return true;
  }

  // columnName (COMMA columnName )*
  private static boolean createView_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = columnName(b, l + 1);
    r = r && createView_7_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA columnName )*
  private static boolean createView_7_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_7_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!createView_7_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "createView_7_0_1", c)) break;
    }
    return true;
  }

  // COMMA columnName
  private static boolean createView_7_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_7_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && columnName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['COMMENT' commentContent]
  private static boolean createView_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_8")) return false;
    createView_8_0(b, l + 1);
    return true;
  }

  // 'COMMENT' commentContent
  private static boolean createView_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "createView_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COMMENT");
    r = r && commentContent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( 'CROSS' | 'UNION' ) 'JOIN' tablePrimaryV2
  public static boolean crossJoin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "crossJoin")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CROSS_JOIN, "<cross join>");
    r = crossJoin_0(b, l + 1);
    r = r && consumeToken(b, "JOIN");
    r = r && tablePrimaryV2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'CROSS' | 'UNION'
  private static boolean crossJoin_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "crossJoin_0")) return false;
    boolean r;
    r = consumeToken(b, "CROSS");
    if (!r) r = consumeToken(b, "UNION");
    return r;
  }

  /* ********************************************************** */
  // ( directlyExecutableStatement | dynamicDataStatement )  [( 'WITH' | 'WITHOUT' ) 'RETURN']
  public static boolean dataStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_STATEMENT, "<data statement>");
    r = dataStatement_0(b, l + 1);
    r = r && dataStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // directlyExecutableStatement | dynamicDataStatement
  private static boolean dataStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataStatement_0")) return false;
    boolean r;
    r = directlyExecutableStatement(b, l + 1);
    if (!r) r = dynamicDataStatement(b, l + 1);
    return r;
  }

  // [( 'WITH' | 'WITHOUT' ) 'RETURN']
  private static boolean dataStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataStatement_1")) return false;
    dataStatement_1_0(b, l + 1);
    return true;
  }

  // ( 'WITH' | 'WITHOUT' ) 'RETURN'
  private static boolean dataStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dataStatement_1_0_0(b, l + 1);
    r = r && consumeToken(b, "RETURN");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'WITH' | 'WITHOUT'
  private static boolean dataStatement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataStatement_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "WITH");
    if (!r) r = consumeToken(b, "WITHOUT");
    return r;
  }

  /* ********************************************************** */
  // !'_' (simpleDataType)
  public static boolean dataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = dataType_0(b, l + 1);
    r = r && dataType_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !'_'
  private static boolean dataType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, UNDERSCORE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (simpleDataType)
  private static boolean dataType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simpleDataType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseString | envVar
  public static boolean dbName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dbName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DB_NAME, "<db name>");
    r = baseString(b, l + 1);
    if (!r) r = envVar(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'DECLARE' ( dataType | 'EXCEPTION' ) identifier [eq assignmentStatementOperand]
  public static boolean declareStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declareStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARE_STATEMENT, "<declare statement>");
    r = consumeToken(b, "DECLARE");
    r = r && declareStatement_1(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && declareStatement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // dataType | 'EXCEPTION'
  private static boolean declareStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declareStatement_1")) return false;
    boolean r;
    r = dataType(b, l + 1);
    if (!r) r = consumeToken(b, "EXCEPTION");
    return r;
  }

  // [eq assignmentStatementOperand]
  private static boolean declareStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declareStatement_3")) return false;
    declareStatement_3_0(b, l + 1);
    return true;
  }

  // eq assignmentStatementOperand
  private static boolean declareStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declareStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = eq(b, l + 1);
    r = r && assignmentStatementOperand(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( assignmentStatement | dataStatement | raiseErrorStatement | raiseStatement | declareStatement | branchingStatement | returnStatement ) semicolon
  public static boolean delimitedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delimitedStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELIMITED_STATEMENT, "<delimited statement>");
    r = delimitedStatement_0(b, l + 1);
    r = r && semicolon(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // assignmentStatement | dataStatement | raiseErrorStatement | raiseStatement | declareStatement | branchingStatement | returnStatement
  private static boolean delimitedStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delimitedStatement_0")) return false;
    boolean r;
    r = assignmentStatement(b, l + 1);
    if (!r) r = dataStatement(b, l + 1);
    if (!r) r = raiseErrorStatement(b, l + 1);
    if (!r) r = raiseStatement(b, l + 1);
    if (!r) r = declareStatement(b, l + 1);
    if (!r) r = branchingStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // expression [stringAs identifier]
  public static boolean derivedColumn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derivedColumn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DERIVED_COLUMN, "<derived column>");
    r = expression(b, l + 1);
    r = r && derivedColumn_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringAs identifier]
  private static boolean derivedColumn_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derivedColumn_1")) return false;
    derivedColumn_1_0(b, l + 1);
    return true;
  }

  // stringAs identifier
  private static boolean derivedColumn_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "derivedColumn_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringAs(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "digit")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, DIGIT, r);
    return r;
  }

  /* ********************************************************** */
  // query| callStatement | insertStatement | createView | compoundStatement
  public static boolean directlyExecutableStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directlyExecutableStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTLY_EXECUTABLE_STATEMENT, "<directly executable statement>");
    r = query(b, l + 1);
    if (!r) r = callStatement(b, l + 1);
    if (!r) r = insertStatement(b, l + 1);
    if (!r) r = createView(b, l + 1);
    if (!r) r = compoundStatement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( 'EXECUTE' | 'EXEC' ) ['STRING' | 'IMMEDIATE'] expression [stringAs typedElementList [ 'INTO' identifier ] ] ['USING' setClauseList ] ['UPDATE' ( unsignedInteger | ANY ) ]
  public static boolean dynamicDataStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DYNAMIC_DATA_STATEMENT, "<dynamic data statement>");
    r = dynamicDataStatement_0(b, l + 1);
    r = r && dynamicDataStatement_1(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && dynamicDataStatement_3(b, l + 1);
    r = r && dynamicDataStatement_4(b, l + 1);
    r = r && dynamicDataStatement_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'EXECUTE' | 'EXEC'
  private static boolean dynamicDataStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_0")) return false;
    boolean r;
    r = consumeToken(b, "EXECUTE");
    if (!r) r = consumeToken(b, "EXEC");
    return r;
  }

  // ['STRING' | 'IMMEDIATE']
  private static boolean dynamicDataStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_1")) return false;
    dynamicDataStatement_1_0(b, l + 1);
    return true;
  }

  // 'STRING' | 'IMMEDIATE'
  private static boolean dynamicDataStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_1_0")) return false;
    boolean r;
    r = consumeToken(b, "STRING");
    if (!r) r = consumeToken(b, "IMMEDIATE");
    return r;
  }

  // [stringAs typedElementList [ 'INTO' identifier ] ]
  private static boolean dynamicDataStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_3")) return false;
    dynamicDataStatement_3_0(b, l + 1);
    return true;
  }

  // stringAs typedElementList [ 'INTO' identifier ]
  private static boolean dynamicDataStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringAs(b, l + 1);
    r = r && typedElementList(b, l + 1);
    r = r && dynamicDataStatement_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'INTO' identifier ]
  private static boolean dynamicDataStatement_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_3_0_2")) return false;
    dynamicDataStatement_3_0_2_0(b, l + 1);
    return true;
  }

  // 'INTO' identifier
  private static boolean dynamicDataStatement_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "INTO");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['USING' setClauseList ]
  private static boolean dynamicDataStatement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_4")) return false;
    dynamicDataStatement_4_0(b, l + 1);
    return true;
  }

  // 'USING' setClauseList
  private static boolean dynamicDataStatement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "USING");
    r = r && setClauseList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['UPDATE' ( unsignedInteger | ANY ) ]
  private static boolean dynamicDataStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_5")) return false;
    dynamicDataStatement_5_0(b, l + 1);
    return true;
  }

  // 'UPDATE' ( unsignedInteger | ANY )
  private static boolean dynamicDataStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UPDATE");
    r = r && dynamicDataStatement_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unsignedInteger | ANY
  private static boolean dynamicDataStatement_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicDataStatement_5_0_1")) return false;
    boolean r;
    r = unsignedInteger(b, l + 1);
    if (!r) r = consumeToken(b, ANY);
    return r;
  }

  /* ********************************************************** */
  // PLUS 'OPTIONS'(key'='val [COMMA key'='val]ANY)
  public static boolean dynamicTableOptions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicTableOptions")) return false;
    if (!nextTokenIs(b, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && consumeToken(b, "OPTIONS");
    r = r && dynamicTableOptions_2(b, l + 1);
    exit_section_(b, m, DYNAMIC_TABLE_OPTIONS, r);
    return r;
  }

  // key'='val [COMMA key'='val]ANY
  private static boolean dynamicTableOptions_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicTableOptions_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = key(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && val(b, l + 1);
    r = r && dynamicTableOptions_2_3(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA key'='val]
  private static boolean dynamicTableOptions_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicTableOptions_2_3")) return false;
    dynamicTableOptions_2_3_0(b, l + 1);
    return true;
  }

  // COMMA key'='val
  private static boolean dynamicTableOptions_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamicTableOptions_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && key(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && val(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '${' (baseString [PERIOD])* '}'
  public static boolean envVar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "envVar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENV_VAR, "<env var>");
    r = consumeToken(b, "${");
    r = r && envVar_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (baseString [PERIOD])*
  private static boolean envVar_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "envVar_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!envVar_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "envVar_1", c)) break;
    }
    return true;
  }

  // baseString [PERIOD]
  private static boolean envVar_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "envVar_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = baseString(b, l + 1);
    r = r && envVar_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [PERIOD]
  private static boolean envVar_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "envVar_1_0_1")) return false;
    consumeToken(b, PERIOD);
    return true;
  }

  /* ********************************************************** */
  // EQUALS
  public static boolean eq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eq")) return false;
    if (!nextTokenIs(b, EQUALS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    exit_section_(b, m, EQ, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE 'FN'
  public static boolean escapedFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escapedFunction")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && consumeToken(b, "FN");
    exit_section_(b, m, ESCAPED_FUNCTION, r);
    return r;
  }

  /* ********************************************************** */
  // '{' | 'oj'
  public static boolean escapedJoin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escapedJoin")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ESCAPED_JOIN, "<escaped join>");
    r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, "oj");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | sqlException
  public static boolean exceptionReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exceptionReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCEPTION_REFERENCE, "<exception reference>");
    r = identifier(b, l + 1);
    if (!r) r = sqlException(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'EXISTS' query
  public static boolean existsPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "existsPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXISTS_PREDICATE, "<exists predicate>");
    r = consumeToken(b, "EXISTS");
    r = r && query(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // function | condition
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = function(b, l + 1);
    if (!r) r = condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression [COMMA expression]
  public static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1);
    r = r && expressionList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [COMMA expression]
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    expressionList_1_0(b, l + 1);
    return true;
  }

  // COMMA expression
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'FETCH' ('FIRST' | 'NEXT') [NUMBER] ('ROW'|'ROWS') 'ONLY'
  public static boolean fetchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FETCH_CLAUSE, "<fetch clause>");
    r = consumeToken(b, "FETCH");
    r = r && fetchClause_1(b, l + 1);
    r = r && fetchClause_2(b, l + 1);
    r = r && fetchClause_3(b, l + 1);
    r = r && consumeToken(b, "ONLY");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'FIRST' | 'NEXT'
  private static boolean fetchClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchClause_1")) return false;
    boolean r;
    r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "NEXT");
    return r;
  }

  // [NUMBER]
  private static boolean fetchClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchClause_2")) return false;
    consumeToken(b, NUMBER);
    return true;
  }

  // 'ROW'|'ROWS'
  private static boolean fetchClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchClause_3")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  /* ********************************************************** */
  // 'FILTER' LEFT_BRACKET 'WHERE' booleanPrimary RIGHT_BRACKET
  public static boolean filterClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "filterClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILTER_CLAUSE, "<filter clause>");
    r = consumeToken(b, "FILTER");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && consumeToken(b, "WHERE");
    r = r && booleanPrimary(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // forEachRowTriggerAction | textAggregateFunction | function | textTableColumn
  public static boolean for_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR, "<for $>");
    r = forEachRowTriggerAction(b, l + 1);
    if (!r) r = textAggregateFunction(b, l + 1);
    if (!r) r = function(b, l + 1);
    if (!r) r = textTableColumn(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'FOR' 'EACH' 'ROW' ('BEGIN' ['ATOMIC'] (statement)*  'END') | statement
  public static boolean forEachRowTriggerAction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachRowTriggerAction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_EACH_ROW_TRIGGER_ACTION, "<for each row trigger action>");
    r = forEachRowTriggerAction_0(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'FOR' 'EACH' 'ROW' ('BEGIN' ['ATOMIC'] (statement)*  'END')
  private static boolean forEachRowTriggerAction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachRowTriggerAction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FOR");
    r = r && consumeToken(b, "EACH");
    r = r && consumeToken(b, "ROW");
    r = r && forEachRowTriggerAction_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'BEGIN' ['ATOMIC'] (statement)*  'END'
  private static boolean forEachRowTriggerAction_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachRowTriggerAction_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BEGIN");
    r = r && forEachRowTriggerAction_0_3_1(b, l + 1);
    r = r && forEachRowTriggerAction_0_3_2(b, l + 1);
    r = r && consumeToken(b, "END");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['ATOMIC']
  private static boolean forEachRowTriggerAction_0_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachRowTriggerAction_0_3_1")) return false;
    consumeToken(b, "ATOMIC");
    return true;
  }

  // (statement)*
  private static boolean forEachRowTriggerAction_0_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachRowTriggerAction_0_3_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!forEachRowTriggerAction_0_3_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forEachRowTriggerAction_0_3_2", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean forEachRowTriggerAction_0_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forEachRowTriggerAction_0_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // stringFrom ( tableReferenceV2 ( COMMA tableReferenceV2 )* )
  public static boolean fromClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FROM_CLAUSE, "<from clause>");
    r = stringFrom(b, l + 1);
    r = r && fromClause_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tableReferenceV2 ( COMMA tableReferenceV2 )*
  private static boolean fromClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableReferenceV2(b, l + 1);
    r = r && fromClause_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA tableReferenceV2 )*
  private static boolean fromClause_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromClause_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!fromClause_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fromClause_1_1", c)) break;
    }
    return true;
  }

  // COMMA tableReferenceV2
  private static boolean fromClause_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromClause_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tableReferenceV2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('CONVERT' LEFT_BRACKET expression COMMA dataType RIGHT_BRACKET)
  //             | ('CAST' LEFT_BRACKET expression stringAs dataType RIGHT_BRACKET )
  //             | ('SUBSTRING' LEFT_BRACKET expression ((stringFrom expression ['FOR' expression]) | (COMMA expressionList)) RIGHT_BRACKET)
  //             | ('EXTRACT' LEFT_BRACKET ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) stringFrom expression RIGHT_BRACKET )
  //             | ( 'TRIM' LEFT_BRACKET ( [ ( ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] ) | expression ) stringFrom ] expression RIGHT_BRACKET ))
  //             | ( ( 'TO_CHARS' | 'TO_BYTES' ) LEFT_BRACKET expression COMMA baseString [ COMMA expression ] RIGHT_BRACKET )
  //             | ('TO_TIMESTAMP' LEFT_BRACKET expression COMMA SINGLE_QUOTATION baseString* SINGLE_QUOTATION RIGHT_BRACKET)
  //             | ('FROM_UNIXTIME' LEFT_BRACKET expression  RIGHT_BRACKET)
  //             | ( ( 'TIMESTAMPADD' | 'TIMESTAMPDIFF' ) LEFT_BRACKET timeInterval COMMA expression COMMA expression RIGHT_BRACKET )
  //             | queryStringFunction
  //             | ( ( 'LEFT' | 'RIGHT' | 'CHAR' | 'USER' | 'YEAR' | 'MONTH' | 'HOUR' | 'MINUTE' | 'SECOND' | 'XMLCONCAT' | 'XMLCOMMENT' | 'XMLTEXT' ) LEFT_BRACKET ( [expressionList] RIGHT_BRACKET ))
  //             | ( ( 'TRANSLATE' | stringInsert ) LEFT_BRACKET [expressionList] RIGHT_BRACKET )
  //             | ( 'XMLPI' LEFT_BRACKET ( ['NAME'] identifier ) [ COMMA expression ] RIGHT_BRACKET )
  //             | ( identifier LEFT_BRACKET ['ALL' | 'DISTINCT']  [expressionList] [orderByClause] RIGHT_BRACKET [filterClause])
  //             | (functionName LEFT_BRACKET baseString* RIGHT_BRACKET)
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION, "<function>");
    r = function_0(b, l + 1);
    if (!r) r = function_1(b, l + 1);
    if (!r) r = function_2(b, l + 1);
    if (!r) r = function_3(b, l + 1);
    if (!r) r = function_4(b, l + 1);
    if (!r) r = function_5(b, l + 1);
    if (!r) r = function_6(b, l + 1);
    if (!r) r = function_7(b, l + 1);
    if (!r) r = function_8(b, l + 1);
    if (!r) r = queryStringFunction(b, l + 1);
    if (!r) r = function_10(b, l + 1);
    if (!r) r = function_11(b, l + 1);
    if (!r) r = function_12(b, l + 1);
    if (!r) r = function_13(b, l + 1);
    if (!r) r = function_14(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'CONVERT' LEFT_BRACKET expression COMMA dataType RIGHT_BRACKET
  private static boolean function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CONVERT");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'CAST' LEFT_BRACKET expression stringAs dataType RIGHT_BRACKET
  private static boolean function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CAST");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SUBSTRING' LEFT_BRACKET expression ((stringFrom expression ['FOR' expression]) | (COMMA expressionList)) RIGHT_BRACKET
  private static boolean function_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SUBSTRING");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && function_2_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (stringFrom expression ['FOR' expression]) | (COMMA expressionList)
  private static boolean function_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_2_3_0(b, l + 1);
    if (!r) r = function_2_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // stringFrom expression ['FOR' expression]
  private static boolean function_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringFrom(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && function_2_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['FOR' expression]
  private static boolean function_2_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_2_3_0_2")) return false;
    function_2_3_0_2_0(b, l + 1);
    return true;
  }

  // 'FOR' expression
  private static boolean function_2_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_2_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FOR");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA expressionList
  private static boolean function_2_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_2_3_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expressionList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'EXTRACT' LEFT_BRACKET ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND' ) stringFrom expression RIGHT_BRACKET
  private static boolean function_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXTRACT");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_3_2(b, l + 1);
    r = r && stringFrom(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' | 'SECOND'
  private static boolean function_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_3_2")) return false;
    boolean r;
    r = consumeToken(b, "YEAR");
    if (!r) r = consumeToken(b, "MONTH");
    if (!r) r = consumeToken(b, "DAY");
    if (!r) r = consumeToken(b, "HOUR");
    if (!r) r = consumeToken(b, "MINUTE");
    if (!r) r = consumeToken(b, "SECOND");
    return r;
  }

  // 'TRIM' LEFT_BRACKET ( [ ( ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] ) | expression ) stringFrom ] expression RIGHT_BRACKET )
  private static boolean function_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TRIM");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] ) | expression ) stringFrom ] expression RIGHT_BRACKET
  private static boolean function_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_4_2_0(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] ) | expression ) stringFrom ]
  private static boolean function_4_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2_0")) return false;
    function_4_2_0_0(b, l + 1);
    return true;
  }

  // ( ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] ) | expression ) stringFrom
  private static boolean function_4_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_4_2_0_0_0(b, l + 1);
    r = r && stringFrom(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] ) | expression
  private static boolean function_4_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_4_2_0_0_0_0(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'LEADING' | 'TRAILING' | 'BOTH') ( [expression] )
  private static boolean function_4_2_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_4_2_0_0_0_0_0(b, l + 1);
    r = r && function_4_2_0_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'LEADING' | 'TRAILING' | 'BOTH'
  private static boolean function_4_2_0_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2_0_0_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "LEADING");
    if (!r) r = consumeToken(b, "TRAILING");
    if (!r) r = consumeToken(b, "BOTH");
    return r;
  }

  // [expression]
  private static boolean function_4_2_0_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_4_2_0_0_0_0_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // ( 'TO_CHARS' | 'TO_BYTES' ) LEFT_BRACKET expression COMMA baseString [ COMMA expression ] RIGHT_BRACKET
  private static boolean function_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_5_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && baseString(b, l + 1);
    r = r && function_5_5(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'TO_CHARS' | 'TO_BYTES'
  private static boolean function_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_5_0")) return false;
    boolean r;
    r = consumeToken(b, "TO_CHARS");
    if (!r) r = consumeToken(b, "TO_BYTES");
    return r;
  }

  // [ COMMA expression ]
  private static boolean function_5_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_5_5")) return false;
    function_5_5_0(b, l + 1);
    return true;
  }

  // COMMA expression
  private static boolean function_5_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_5_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'TO_TIMESTAMP' LEFT_BRACKET expression COMMA SINGLE_QUOTATION baseString* SINGLE_QUOTATION RIGHT_BRACKET
  private static boolean function_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TO_TIMESTAMP");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, COMMA, SINGLE_QUOTATION);
    r = r && function_6_5(b, l + 1);
    r = r && consumeTokens(b, 0, SINGLE_QUOTATION, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // baseString*
  private static boolean function_6_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_6_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!baseString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_6_5", c)) break;
    }
    return true;
  }

  // 'FROM_UNIXTIME' LEFT_BRACKET expression  RIGHT_BRACKET
  private static boolean function_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FROM_UNIXTIME");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'TIMESTAMPADD' | 'TIMESTAMPDIFF' ) LEFT_BRACKET timeInterval COMMA expression COMMA expression RIGHT_BRACKET
  private static boolean function_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_8_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && timeInterval(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'TIMESTAMPADD' | 'TIMESTAMPDIFF'
  private static boolean function_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_8_0")) return false;
    boolean r;
    r = consumeToken(b, "TIMESTAMPADD");
    if (!r) r = consumeToken(b, "TIMESTAMPDIFF");
    return r;
  }

  // ( 'LEFT' | 'RIGHT' | 'CHAR' | 'USER' | 'YEAR' | 'MONTH' | 'HOUR' | 'MINUTE' | 'SECOND' | 'XMLCONCAT' | 'XMLCOMMENT' | 'XMLTEXT' ) LEFT_BRACKET ( [expressionList] RIGHT_BRACKET )
  private static boolean function_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_10_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_10_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'LEFT' | 'RIGHT' | 'CHAR' | 'USER' | 'YEAR' | 'MONTH' | 'HOUR' | 'MINUTE' | 'SECOND' | 'XMLCONCAT' | 'XMLCOMMENT' | 'XMLTEXT'
  private static boolean function_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_10_0")) return false;
    boolean r;
    r = consumeToken(b, "LEFT");
    if (!r) r = consumeToken(b, "RIGHT");
    if (!r) r = consumeToken(b, "CHAR");
    if (!r) r = consumeToken(b, "USER");
    if (!r) r = consumeToken(b, "YEAR");
    if (!r) r = consumeToken(b, "MONTH");
    if (!r) r = consumeToken(b, "HOUR");
    if (!r) r = consumeToken(b, "MINUTE");
    if (!r) r = consumeToken(b, "SECOND");
    if (!r) r = consumeToken(b, "XMLCONCAT");
    if (!r) r = consumeToken(b, "XMLCOMMENT");
    if (!r) r = consumeToken(b, "XMLTEXT");
    return r;
  }

  // [expressionList] RIGHT_BRACKET
  private static boolean function_10_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_10_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_10_2_0(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // [expressionList]
  private static boolean function_10_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_10_2_0")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // ( 'TRANSLATE' | stringInsert ) LEFT_BRACKET [expressionList] RIGHT_BRACKET
  private static boolean function_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_11_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_11_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'TRANSLATE' | stringInsert
  private static boolean function_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_11_0")) return false;
    boolean r;
    r = consumeToken(b, "TRANSLATE");
    if (!r) r = stringInsert(b, l + 1);
    return r;
  }

  // [expressionList]
  private static boolean function_11_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_11_2")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // 'XMLPI' LEFT_BRACKET ( ['NAME'] identifier ) [ COMMA expression ] RIGHT_BRACKET
  private static boolean function_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "XMLPI");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_12_2(b, l + 1);
    r = r && function_12_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['NAME'] identifier
  private static boolean function_12_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_12_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_12_2_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['NAME']
  private static boolean function_12_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_12_2_0")) return false;
    consumeToken(b, "NAME");
    return true;
  }

  // [ COMMA expression ]
  private static boolean function_12_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_12_3")) return false;
    function_12_3_0(b, l + 1);
    return true;
  }

  // COMMA expression
  private static boolean function_12_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_12_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier LEFT_BRACKET ['ALL' | 'DISTINCT']  [expressionList] [orderByClause] RIGHT_BRACKET [filterClause]
  private static boolean function_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_13_2(b, l + 1);
    r = r && function_13_3(b, l + 1);
    r = r && function_13_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    r = r && function_13_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['ALL' | 'DISTINCT']
  private static boolean function_13_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_13_2")) return false;
    function_13_2_0(b, l + 1);
    return true;
  }

  // 'ALL' | 'DISTINCT'
  private static boolean function_13_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_13_2_0")) return false;
    boolean r;
    r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "DISTINCT");
    return r;
  }

  // [expressionList]
  private static boolean function_13_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_13_3")) return false;
    expressionList(b, l + 1);
    return true;
  }

  // [orderByClause]
  private static boolean function_13_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_13_4")) return false;
    orderByClause(b, l + 1);
    return true;
  }

  // [filterClause]
  private static boolean function_13_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_13_6")) return false;
    filterClause(b, l + 1);
    return true;
  }

  // functionName LEFT_BRACKET baseString* RIGHT_BRACKET
  private static boolean function_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionName(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && function_14_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // baseString*
  private static boolean function_14_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_14_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!baseString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "function_14_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'TIMESTAMPDD' | 'TIMESTAMPDIFF' |'SUM' | 'FLOOR' | 'CAST' | 'TIMESTAMP'
  public static boolean functionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_NAME, "<function name>");
    r = consumeToken(b, "TIMESTAMPDD");
    if (!r) r = consumeToken(b, "TIMESTAMPDIFF");
    if (!r) r = consumeToken(b, "SUM");
    if (!r) r = consumeToken(b, "FLOOR");
    if (!r) r = consumeToken(b, "CAST");
    if (!r) r = consumeToken(b, "TIMESTAMP");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stringGroup stringBy ( 'ROLLUP' '(' expressionList ')' | expressionList)*
  public static boolean groupByClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupByClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_BY_CLAUSE, "<group by clause>");
    r = stringGroup(b, l + 1);
    r = r && stringBy(b, l + 1);
    r = r && groupByClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( 'ROLLUP' '(' expressionList ')' | expressionList)*
  private static boolean groupByClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupByClause_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!groupByClause_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "groupByClause_2", c)) break;
    }
    return true;
  }

  // 'ROLLUP' '(' expressionList ')' | expressionList
  private static boolean groupByClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupByClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = groupByClause_2_0_0(b, l + 1);
    if (!r) r = expressionList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ROLLUP' '(' expressionList ')'
  private static boolean groupByClause_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupByClause_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ROLLUP");
    r = r && consumeToken(b, "(");
    r = r && expressionList(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '>'
  public static boolean gt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GT, "<gt>");
    r = consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'HAVING' condition
  public static boolean havingClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "havingClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HAVING_CLAUSE, "<having clause>");
    r = consumeToken(b, "HAVING");
    r = r && condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('@' | '#' | letter) (letter | '_' | digit)*
  public static boolean idPart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idPart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ID_PART, "<id part>");
    r = idPart_0(b, l + 1);
    r = r && idPart_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '@' | '#' | letter
  private static boolean idPart_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idPart_0")) return false;
    boolean r;
    r = consumeToken(b, "@");
    if (!r) r = consumeToken(b, "#");
    if (!r) r = letter(b, l + 1);
    return r;
  }

  // (letter | '_' | digit)*
  private static boolean idPart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idPart_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!idPart_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "idPart_1", c)) break;
    }
    return true;
  }

  // letter | '_' | digit
  private static boolean idPart_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "idPart_1_0")) return false;
    boolean r;
    r = letter(b, l + 1);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = digit(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (quotedId (PERIOD quotedId)*) | nonReservedIdentifier
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = identifier_0(b, l + 1);
    if (!r) r = nonReservedIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // quotedId (PERIOD quotedId)*
  private static boolean identifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = quotedId(b, l + 1);
    r = r && identifier_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PERIOD quotedId)*
  private static boolean identifier_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_0_1", c)) break;
    }
    return true;
  }

  // PERIOD quotedId
  private static boolean identifier_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PERIOD);
    r = r && quotedId(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'IF' LEFT_BRACKET ( ( identifier 'IS' [stringNot] 'DISTINCT' stringFrom identifier ) | condition ) RIGHT_BRACKET statement [ 'ELSE' statement ]
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = consumeToken(b, "IF");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && ifStatement_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    r = r && statement(b, l + 1);
    r = r && ifStatement_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( identifier 'IS' [stringNot] 'DISTINCT' stringFrom identifier ) | condition
  private static boolean ifStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ifStatement_2_0(b, l + 1);
    if (!r) r = condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier 'IS' [stringNot] 'DISTINCT' stringFrom identifier
  private static boolean ifStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, "IS");
    r = r && ifStatement_2_0_2(b, l + 1);
    r = r && consumeToken(b, "DISTINCT");
    r = r && stringFrom(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [stringNot]
  private static boolean ifStatement_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_2_0_2")) return false;
    stringNot(b, l + 1);
    return true;
  }

  // [ 'ELSE' statement ]
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // 'ELSE' statement
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ELSE");
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [stringNot] 'IN' (subQuery | LEFT_BRACKET commonValueExpression )
  public static boolean inPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IN_PREDICATE, "<in predicate>");
    r = inPredicate_0(b, l + 1);
    r = r && consumeToken(b, "IN");
    r = r && inPredicate_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringNot]
  private static boolean inPredicate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inPredicate_0")) return false;
    stringNot(b, l + 1);
    return true;
  }

  // subQuery | LEFT_BRACKET commonValueExpression
  private static boolean inPredicate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inPredicate_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subQuery(b, l + 1);
    if (!r) r = inPredicate_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET commonValueExpression
  private static boolean inPredicate_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inPredicate_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && commonValueExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // stringInsert { stringInto | 'OVERWRITE' }
  //                                 [catalogName PERIOD][dbName PERIOD]tableName
  //                                 ['PARTITION' partSpec] [columnList]
  //                                 query
  public static boolean insertFromSelectQueries(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_FROM_SELECT_QUERIES, "<insert from select queries>");
    r = stringInsert(b, l + 1);
    r = r && insertFromSelectQueries_1(b, l + 1);
    r = r && insertFromSelectQueries_2(b, l + 1);
    r = r && insertFromSelectQueries_3(b, l + 1);
    r = r && tableName(b, l + 1);
    r = r && insertFromSelectQueries_5(b, l + 1);
    r = r && insertFromSelectQueries_6(b, l + 1);
    r = r && query(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // stringInto | 'OVERWRITE'
  private static boolean insertFromSelectQueries_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_1")) return false;
    boolean r;
    r = stringInto(b, l + 1);
    if (!r) r = consumeToken(b, "OVERWRITE");
    return r;
  }

  // [catalogName PERIOD]
  private static boolean insertFromSelectQueries_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_2")) return false;
    insertFromSelectQueries_2_0(b, l + 1);
    return true;
  }

  // catalogName PERIOD
  private static boolean insertFromSelectQueries_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [dbName PERIOD]
  private static boolean insertFromSelectQueries_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_3")) return false;
    insertFromSelectQueries_3_0(b, l + 1);
    return true;
  }

  // dbName PERIOD
  private static boolean insertFromSelectQueries_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dbName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['PARTITION' partSpec]
  private static boolean insertFromSelectQueries_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_5")) return false;
    insertFromSelectQueries_5_0(b, l + 1);
    return true;
  }

  // 'PARTITION' partSpec
  private static boolean insertFromSelectQueries_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "PARTITION");
    r = r && partSpec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [columnList]
  private static boolean insertFromSelectQueries_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertFromSelectQueries_6")) return false;
    columnList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'EXECUTE' 'STATEMENT' 'SET' 'BEGIN'  (insertFromSelectQueries | insertValuesIntoTables)* 'END' SEMI_COLON
  public static boolean insertIntoMultipleTables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertIntoMultipleTables")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_INTO_MULTIPLE_TABLES, "<insert into multiple tables>");
    r = consumeToken(b, "EXECUTE");
    r = r && consumeToken(b, "STATEMENT");
    r = r && consumeToken(b, "SET");
    r = r && consumeToken(b, "BEGIN");
    r = r && insertIntoMultipleTables_4(b, l + 1);
    r = r && consumeToken(b, "END");
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (insertFromSelectQueries | insertValuesIntoTables)*
  private static boolean insertIntoMultipleTables_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertIntoMultipleTables_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!insertIntoMultipleTables_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insertIntoMultipleTables_4", c)) break;
    }
    return true;
  }

  // insertFromSelectQueries | insertValuesIntoTables
  private static boolean insertIntoMultipleTables_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertIntoMultipleTables_4_0")) return false;
    boolean r;
    r = insertFromSelectQueries(b, l + 1);
    if (!r) r = insertValuesIntoTables(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // insertFromSelectQueries | insertValuesIntoTables  | insertIntoMultipleTables
  public static boolean insertStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_STATEMENT, "<insert statement>");
    r = insertFromSelectQueries(b, l + 1);
    if (!r) r = insertValuesIntoTables(b, l + 1);
    if (!r) r = insertIntoMultipleTables(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stringInsert { 'INTO' | 'OVERWRITE' }
  //                                 [catalogName PERIOD][dbName PERIOD]tableName
  //                                 'VALUES' valuesRow
  //                                 (COMMA valuesRow)* SEMI_COLON
  public static boolean insertValuesIntoTables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSERT_VALUES_INTO_TABLES, "<insert values into tables>");
    r = stringInsert(b, l + 1);
    r = r && insertValuesIntoTables_1(b, l + 1);
    r = r && insertValuesIntoTables_2(b, l + 1);
    r = r && insertValuesIntoTables_3(b, l + 1);
    r = r && tableName(b, l + 1);
    r = r && consumeToken(b, "VALUES");
    r = r && valuesRow(b, l + 1);
    r = r && insertValuesIntoTables_7(b, l + 1);
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'INTO' | 'OVERWRITE'
  private static boolean insertValuesIntoTables_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_1")) return false;
    boolean r;
    r = consumeToken(b, "INTO");
    if (!r) r = consumeToken(b, "OVERWRITE");
    return r;
  }

  // [catalogName PERIOD]
  private static boolean insertValuesIntoTables_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_2")) return false;
    insertValuesIntoTables_2_0(b, l + 1);
    return true;
  }

  // catalogName PERIOD
  private static boolean insertValuesIntoTables_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [dbName PERIOD]
  private static boolean insertValuesIntoTables_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_3")) return false;
    insertValuesIntoTables_3_0(b, l + 1);
    return true;
  }

  // dbName PERIOD
  private static boolean insertValuesIntoTables_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dbName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA valuesRow)*
  private static boolean insertValuesIntoTables_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!insertValuesIntoTables_7_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "insertValuesIntoTables_7", c)) break;
    }
    return true;
  }

  // COMMA valuesRow
  private static boolean insertValuesIntoTables_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "insertValuesIntoTables_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && valuesRow(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseString
  public static boolean intervalLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "intervalLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERVAL_LITERAL, "<interval literal>");
    r = baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'INTO' identifier
  public static boolean intoClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "intoClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTO_CLAUSE, "<into clause>");
    r = consumeToken(b, "INTO");
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'IS' [stringNot] 'NULL'
  public static boolean isNullPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isNullPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IS_NULL_PREDICATE, "<is null predicate>");
    r = consumeToken(b, "IS");
    r = r && isNullPredicate_1(b, l + 1);
    r = r && consumeToken(b, "NULL");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringNot]
  private static boolean isNullPredicate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isNullPredicate_1")) return false;
    stringNot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // addJar | showJar | removeJar
  public static boolean jarCommand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jarCommand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JAR_COMMAND, "<jar command>");
    r = addJar(b, l + 1);
    if (!r) r = showJar(b, l + 1);
    if (!r) r = removeJar(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'NATURAL' booleanExpression
  //   | 'USING' '(' column [COMMA column ]ANY ')'
  public static boolean joinCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOIN_CONDITION, "<join condition>");
    r = joinCondition_0(b, l + 1);
    if (!r) r = joinCondition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'NATURAL' booleanExpression
  private static boolean joinCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinCondition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "NATURAL");
    r = r && booleanExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'USING' '(' column [COMMA column ]ANY ')'
  private static boolean joinCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinCondition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "USING");
    r = r && consumeToken(b, "(");
    r = r && column(b, l + 1);
    r = r && joinCondition_1_3(b, l + 1);
    r = r && consumeToken(b, ANY);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA column ]
  private static boolean joinCondition_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinCondition_1_3")) return false;
    joinCondition_1_3_0(b, l + 1);
    return true;
  }

  // COMMA column
  private static boolean joinCondition_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinCondition_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && column(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tablePrimaryV2 ( crossJoin | qualifiedTable )*
  public static boolean joinedTable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinedTable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JOINED_TABLE, "<joined table>");
    r = tablePrimaryV2(b, l + 1);
    r = r && joinedTable_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( crossJoin | qualifiedTable )*
  private static boolean joinedTable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinedTable_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!joinedTable_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "joinedTable_1", c)) break;
    }
    return true;
  }

  // crossJoin | qualifiedTable
  private static boolean joinedTable_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinedTable_1_0")) return false;
    boolean r;
    r = crossJoin(b, l + 1);
    if (!r) r = qualifiedTable(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ('timestamp'|rawString|PERIOD)*
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    Marker m = enter_section_(b, l, _NONE_, KEY, "<key>");
    while (true) {
      int c = current_position_(b);
      if (!key_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "key", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // 'timestamp'|rawString|PERIOD
  private static boolean key_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_0")) return false;
    boolean r;
    r = consumeToken(b, "timestamp");
    if (!r) r = rawString(b, l + 1);
    if (!r) r = consumeToken(b, PERIOD);
    return r;
  }

  /* ********************************************************** */
  // stringFrom |'WHERE' |'AND'|'PARTITION'|'VALUES'|stringInsert|'INTO'|EQUALS|'OR'|'METADATA'| stringCreate stringTable|dataType|stringNot|
  //     stringSelect |'SYSTEM_TIME'| 'for' | 'LEFT' | 'JOIN' | 'ON' | stringAs   | functionName | stringCase | stringWhen | stringElse | stringEnd | stringLike |
  //      stringOrder | stringLimit | stringBy
  public static boolean keyWords(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyWords")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEY_WORDS, "<key words>");
    r = stringFrom(b, l + 1);
    if (!r) r = consumeToken(b, "WHERE");
    if (!r) r = consumeToken(b, "AND");
    if (!r) r = consumeToken(b, "PARTITION");
    if (!r) r = consumeToken(b, "VALUES");
    if (!r) r = stringInsert(b, l + 1);
    if (!r) r = consumeToken(b, "INTO");
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, "OR");
    if (!r) r = consumeToken(b, "METADATA");
    if (!r) r = keyWords_10(b, l + 1);
    if (!r) r = dataType(b, l + 1);
    if (!r) r = stringNot(b, l + 1);
    if (!r) r = stringSelect(b, l + 1);
    if (!r) r = consumeToken(b, "SYSTEM_TIME");
    if (!r) r = consumeToken(b, "for");
    if (!r) r = consumeToken(b, "LEFT");
    if (!r) r = consumeToken(b, "JOIN");
    if (!r) r = consumeToken(b, "ON");
    if (!r) r = stringAs(b, l + 1);
    if (!r) r = functionName(b, l + 1);
    if (!r) r = stringCase(b, l + 1);
    if (!r) r = stringWhen(b, l + 1);
    if (!r) r = stringElse(b, l + 1);
    if (!r) r = stringEnd(b, l + 1);
    if (!r) r = stringLike(b, l + 1);
    if (!r) r = stringOrder(b, l + 1);
    if (!r) r = stringLimit(b, l + 1);
    if (!r) r = stringBy(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // stringCreate stringTable
  private static boolean keyWords_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyWords_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringCreate(b, l + 1);
    r = r && stringTable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseString
  public static boolean letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // {
  //                    { 'INCLUDING' | 'EXCLUDING' } { 'ALL' | 'CONSTRAINTS' | 'PARTITIONS' }
  //                  | { 'INCLUDING' | 'EXCLUDING' | 'OVERWRITING' } { 'GENERATED' | 'OPTIONS' | 'WATERMARKS' }
  //                 }*
  public static boolean likeOptions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIKE_OPTIONS, "<like options>");
    while (true) {
      int c = current_position_(b);
      if (!likeOptions_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "likeOptions", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // { 'INCLUDING' | 'EXCLUDING' } { 'ALL' | 'CONSTRAINTS' | 'PARTITIONS' }
  //                  | { 'INCLUDING' | 'EXCLUDING' | 'OVERWRITING' } { 'GENERATED' | 'OPTIONS' | 'WATERMARKS' }
  private static boolean likeOptions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = likeOptions_0_0(b, l + 1);
    if (!r) r = likeOptions_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { 'INCLUDING' | 'EXCLUDING' } { 'ALL' | 'CONSTRAINTS' | 'PARTITIONS' }
  private static boolean likeOptions_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = likeOptions_0_0_0(b, l + 1);
    r = r && likeOptions_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'INCLUDING' | 'EXCLUDING'
  private static boolean likeOptions_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, "INCLUDING");
    if (!r) r = consumeToken(b, "EXCLUDING");
    return r;
  }

  // 'ALL' | 'CONSTRAINTS' | 'PARTITIONS'
  private static boolean likeOptions_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0_0_1")) return false;
    boolean r;
    r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "CONSTRAINTS");
    if (!r) r = consumeToken(b, "PARTITIONS");
    return r;
  }

  // { 'INCLUDING' | 'EXCLUDING' | 'OVERWRITING' } { 'GENERATED' | 'OPTIONS' | 'WATERMARKS' }
  private static boolean likeOptions_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = likeOptions_0_1_0(b, l + 1);
    r = r && likeOptions_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'INCLUDING' | 'EXCLUDING' | 'OVERWRITING'
  private static boolean likeOptions_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "INCLUDING");
    if (!r) r = consumeToken(b, "EXCLUDING");
    if (!r) r = consumeToken(b, "OVERWRITING");
    return r;
  }

  // 'GENERATED' | 'OPTIONS' | 'WATERMARKS'
  private static boolean likeOptions_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeOptions_0_1_1")) return false;
    boolean r;
    r = consumeToken(b, "GENERATED");
    if (!r) r = consumeToken(b, "OPTIONS");
    if (!r) r = consumeToken(b, "WATERMARKS");
    return r;
  }

  /* ********************************************************** */
  // [stringNot] 'LIKE_REGEX' commonValueExpression
  public static boolean likeRegexPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeRegexPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIKE_REGEX_PREDICATE, "<like regex predicate>");
    r = likeRegexPredicate_0(b, l + 1);
    r = r && consumeToken(b, "LIKE_REGEX");
    r = r && commonValueExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringNot]
  private static boolean likeRegexPredicate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "likeRegexPredicate_0")) return false;
    stringNot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('LIMIT' NUMBER [COMMA NUMBER]) | ('OFFSET' NUMBER ('ROW' | 'ROWS') [fetchClause]) | (fetchClause)
  public static boolean limitClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIMIT_CLAUSE, "<limit clause>");
    r = limitClause_0(b, l + 1);
    if (!r) r = limitClause_1(b, l + 1);
    if (!r) r = limitClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'LIMIT' NUMBER [COMMA NUMBER]
  private static boolean limitClause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIMIT");
    r = r && consumeToken(b, NUMBER);
    r = r && limitClause_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA NUMBER]
  private static boolean limitClause_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause_0_2")) return false;
    parseTokens(b, 0, COMMA, NUMBER);
    return true;
  }

  // 'OFFSET' NUMBER ('ROW' | 'ROWS') [fetchClause]
  private static boolean limitClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OFFSET");
    r = r && consumeToken(b, NUMBER);
    r = r && limitClause_1_2(b, l + 1);
    r = r && limitClause_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ROW' | 'ROWS'
  private static boolean limitClause_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause_1_2")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  // [fetchClause]
  private static boolean limitClause_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause_1_3")) return false;
    fetchClause(b, l + 1);
    return true;
  }

  // (fetchClause)
  private static boolean limitClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "limitClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fetchClause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'LOOP' 'ON' LEFT_BRACKET queryExpression RIGHT_BRACKET stringAs identifier statement
  public static boolean loopStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loopStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_STATEMENT, "<loop statement>");
    r = consumeToken(b, "LOOP");
    r = r && consumeToken(b, "ON");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && queryExpression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    r = r && stringAs(b, l + 1);
    r = r && identifier(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ '(' [ 'MAX' COLON NUMBER ] [ [ 'NO' ] 'JOIN' ] ')' ]
  public static boolean makeDepOptions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions")) return false;
    Marker m = enter_section_(b, l, _NONE_, MAKE_DEP_OPTIONS, "<make dep options>");
    makeDepOptions_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // '(' [ 'MAX' COLON NUMBER ] [ [ 'NO' ] 'JOIN' ] ')'
  private static boolean makeDepOptions_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && makeDepOptions_0_1(b, l + 1);
    r = r && makeDepOptions_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'MAX' COLON NUMBER ]
  private static boolean makeDepOptions_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions_0_1")) return false;
    makeDepOptions_0_1_0(b, l + 1);
    return true;
  }

  // 'MAX' COLON NUMBER
  private static boolean makeDepOptions_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAX");
    r = r && consumeTokens(b, 0, COLON, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ [ 'NO' ] 'JOIN' ]
  private static boolean makeDepOptions_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions_0_2")) return false;
    makeDepOptions_0_2_0(b, l + 1);
    return true;
  }

  // [ 'NO' ] 'JOIN'
  private static boolean makeDepOptions_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = makeDepOptions_0_2_0_0(b, l + 1);
    r = r && consumeToken(b, "JOIN");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'NO' ]
  private static boolean makeDepOptions_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "makeDepOptions_0_2_0_0")) return false;
    consumeToken(b, "NO");
    return true;
  }

  /* ********************************************************** */
  // [stringNot] ('LIKE' | 'SIMILAR' 'TO') commonValueExpression ['ESCAPE' string | (LBRACE 'ESCAPE' string RBRACE) ]
  public static boolean matchPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_PREDICATE, "<match predicate>");
    r = matchPredicate_0(b, l + 1);
    r = r && matchPredicate_1(b, l + 1);
    r = r && commonValueExpression(b, l + 1);
    r = r && matchPredicate_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringNot]
  private static boolean matchPredicate_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_0")) return false;
    stringNot(b, l + 1);
    return true;
  }

  // 'LIKE' | 'SIMILAR' 'TO'
  private static boolean matchPredicate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIKE");
    if (!r) r = matchPredicate_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SIMILAR' 'TO'
  private static boolean matchPredicate_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SIMILAR");
    r = r && consumeToken(b, "TO");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['ESCAPE' string | (LBRACE 'ESCAPE' string RBRACE) ]
  private static boolean matchPredicate_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_3")) return false;
    matchPredicate_3_0(b, l + 1);
    return true;
  }

  // 'ESCAPE' string | (LBRACE 'ESCAPE' string RBRACE)
  private static boolean matchPredicate_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchPredicate_3_0_0(b, l + 1);
    if (!r) r = matchPredicate_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ESCAPE' string
  private static boolean matchPredicate_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ESCAPE");
    r = r && string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACE 'ESCAPE' string RBRACE
  private static boolean matchPredicate_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchPredicate_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && consumeToken(b, "ESCAPE");
    r = r && string(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'MATCH_RECOGNIZE' '('
  //     [ 'PARTITION BY' expression [COMMA expression ]ANY ]
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'MEASURES' measureColumn [COMMA measureColumn ]ANY ]
  //     [ 'ONE' 'ROW' 'PER' 'MATCH' ]
  //     [ 'AFTER' 'MATCH'
  //       ( 'SKIP' 'TO' 'NEXT' 'ROW'
  //       | 'SKIP' 'PAST' 'LAST' 'ROW'
  //       | 'SKIP' 'TO' 'FIRST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'LAST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'VARIABLE' )
  //     ]
  //     'PATTERN' '(' pattern ')'
  //     [ 'WITHIN' intervalLiteral ]
  //     'DEFINE' 'VARIABLE' stringAs 'CONDITION' [COMMA 'VARIABLE' stringAs 'CONDITION' ]ANY
  //     ')'
  public static boolean matchRecognize(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATCH_RECOGNIZE, "<match recognize>");
    r = consumeToken(b, "MATCH_RECOGNIZE");
    r = r && consumeToken(b, "(");
    r = r && matchRecognize_2(b, l + 1);
    r = r && matchRecognize_3(b, l + 1);
    r = r && matchRecognize_4(b, l + 1);
    r = r && matchRecognize_5(b, l + 1);
    r = r && matchRecognize_6(b, l + 1);
    r = r && consumeToken(b, "PATTERN");
    r = r && consumeToken(b, "(");
    r = r && pattern(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && matchRecognize_11(b, l + 1);
    r = r && consumeToken(b, "DEFINE");
    r = r && consumeToken(b, "VARIABLE");
    r = r && stringAs(b, l + 1);
    r = r && consumeToken(b, "CONDITION");
    r = r && matchRecognize_16(b, l + 1);
    r = r && consumeToken(b, ANY);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'PARTITION BY' expression [COMMA expression ]ANY ]
  private static boolean matchRecognize_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_2")) return false;
    matchRecognize_2_0(b, l + 1);
    return true;
  }

  // 'PARTITION BY' expression [COMMA expression ]ANY
  private static boolean matchRecognize_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "PARTITION BY");
    r = r && expression(b, l + 1);
    r = r && matchRecognize_2_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA expression ]
  private static boolean matchRecognize_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_2_0_2")) return false;
    matchRecognize_2_0_2_0(b, l + 1);
    return true;
  }

  // COMMA expression
  private static boolean matchRecognize_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  private static boolean matchRecognize_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_3")) return false;
    matchRecognize_3_0(b, l + 1);
    return true;
  }

  // 'ORDER BY' orderItem [COMMA orderItem ]ANY
  private static boolean matchRecognize_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ORDER BY");
    r = r && orderItem(b, l + 1);
    r = r && matchRecognize_3_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA orderItem ]
  private static boolean matchRecognize_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_3_0_2")) return false;
    matchRecognize_3_0_2_0(b, l + 1);
    return true;
  }

  // COMMA orderItem
  private static boolean matchRecognize_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && orderItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'MEASURES' measureColumn [COMMA measureColumn ]ANY ]
  private static boolean matchRecognize_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_4")) return false;
    matchRecognize_4_0(b, l + 1);
    return true;
  }

  // 'MEASURES' measureColumn [COMMA measureColumn ]ANY
  private static boolean matchRecognize_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MEASURES");
    r = r && measureColumn(b, l + 1);
    r = r && matchRecognize_4_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA measureColumn ]
  private static boolean matchRecognize_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_4_0_2")) return false;
    matchRecognize_4_0_2_0(b, l + 1);
    return true;
  }

  // COMMA measureColumn
  private static boolean matchRecognize_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && measureColumn(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ONE' 'ROW' 'PER' 'MATCH' ]
  private static boolean matchRecognize_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_5")) return false;
    matchRecognize_5_0(b, l + 1);
    return true;
  }

  // 'ONE' 'ROW' 'PER' 'MATCH'
  private static boolean matchRecognize_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ONE");
    r = r && consumeToken(b, "ROW");
    r = r && consumeToken(b, "PER");
    r = r && consumeToken(b, "MATCH");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'AFTER' 'MATCH'
  //       ( 'SKIP' 'TO' 'NEXT' 'ROW'
  //       | 'SKIP' 'PAST' 'LAST' 'ROW'
  //       | 'SKIP' 'TO' 'FIRST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'LAST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'VARIABLE' )
  //     ]
  private static boolean matchRecognize_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6")) return false;
    matchRecognize_6_0(b, l + 1);
    return true;
  }

  // 'AFTER' 'MATCH'
  //       ( 'SKIP' 'TO' 'NEXT' 'ROW'
  //       | 'SKIP' 'PAST' 'LAST' 'ROW'
  //       | 'SKIP' 'TO' 'FIRST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'LAST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'VARIABLE' )
  private static boolean matchRecognize_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "AFTER");
    r = r && consumeToken(b, "MATCH");
    r = r && matchRecognize_6_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SKIP' 'TO' 'NEXT' 'ROW'
  //       | 'SKIP' 'PAST' 'LAST' 'ROW'
  //       | 'SKIP' 'TO' 'FIRST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'LAST' 'VARIABLE'
  //       | 'SKIP' 'TO' 'VARIABLE'
  private static boolean matchRecognize_6_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = matchRecognize_6_0_2_0(b, l + 1);
    if (!r) r = matchRecognize_6_0_2_1(b, l + 1);
    if (!r) r = matchRecognize_6_0_2_2(b, l + 1);
    if (!r) r = matchRecognize_6_0_2_3(b, l + 1);
    if (!r) r = matchRecognize_6_0_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SKIP' 'TO' 'NEXT' 'ROW'
  private static boolean matchRecognize_6_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SKIP");
    r = r && consumeToken(b, "TO");
    r = r && consumeToken(b, "NEXT");
    r = r && consumeToken(b, "ROW");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SKIP' 'PAST' 'LAST' 'ROW'
  private static boolean matchRecognize_6_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SKIP");
    r = r && consumeToken(b, "PAST");
    r = r && consumeToken(b, "LAST");
    r = r && consumeToken(b, "ROW");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SKIP' 'TO' 'FIRST' 'VARIABLE'
  private static boolean matchRecognize_6_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0_2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SKIP");
    r = r && consumeToken(b, "TO");
    r = r && consumeToken(b, "FIRST");
    r = r && consumeToken(b, "VARIABLE");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SKIP' 'TO' 'LAST' 'VARIABLE'
  private static boolean matchRecognize_6_0_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0_2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SKIP");
    r = r && consumeToken(b, "TO");
    r = r && consumeToken(b, "LAST");
    r = r && consumeToken(b, "VARIABLE");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'SKIP' 'TO' 'VARIABLE'
  private static boolean matchRecognize_6_0_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_6_0_2_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SKIP");
    r = r && consumeToken(b, "TO");
    r = r && consumeToken(b, "VARIABLE");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'WITHIN' intervalLiteral ]
  private static boolean matchRecognize_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_11")) return false;
    matchRecognize_11_0(b, l + 1);
    return true;
  }

  // 'WITHIN' intervalLiteral
  private static boolean matchRecognize_11_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_11_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "WITHIN");
    r = r && intervalLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA 'VARIABLE' stringAs 'CONDITION' ]
  private static boolean matchRecognize_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_16")) return false;
    matchRecognize_16_0(b, l + 1);
    return true;
  }

  // COMMA 'VARIABLE' stringAs 'CONDITION'
  private static boolean matchRecognize_16_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "matchRecognize_16_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && consumeToken(b, "VARIABLE");
    r = r && stringAs(b, l + 1);
    r = r && consumeToken(b, "CONDITION");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression stringAs 'ALIAS'
  public static boolean measureColumn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "measureColumn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEASURE_COLUMN, "<measure column>");
    r = expression(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && consumeToken(b, "ALIAS");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // columnName dataType 'METADATA'
  //             [stringFrom SINGLE_QUOTATION metadataKey SINGLE_QUOTATION ]
  //             [ 'VIRTUAL' ]
  public static boolean metadataColumnDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadataColumnDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METADATA_COLUMN_DEFINITION, "<metadata column definition>");
    r = columnName(b, l + 1);
    r = r && dataType(b, l + 1);
    r = r && consumeToken(b, "METADATA");
    r = r && metadataColumnDefinition_3(b, l + 1);
    r = r && metadataColumnDefinition_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringFrom SINGLE_QUOTATION metadataKey SINGLE_QUOTATION ]
  private static boolean metadataColumnDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadataColumnDefinition_3")) return false;
    metadataColumnDefinition_3_0(b, l + 1);
    return true;
  }

  // stringFrom SINGLE_QUOTATION metadataKey SINGLE_QUOTATION
  private static boolean metadataColumnDefinition_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadataColumnDefinition_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringFrom(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    r = r && metadataKey(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'VIRTUAL' ]
  private static boolean metadataColumnDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadataColumnDefinition_4")) return false;
    consumeToken(b, "VIRTUAL");
    return true;
  }

  /* ********************************************************** */
  // rawString
  public static boolean metadataKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadataKey")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METADATA_KEY, "<metadata key>");
    r = rawString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier eq [gt] expression ( COMMA identifier eq [gt] expression )*
  public static boolean namedParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_PARAMETER_LIST, "<named parameter list>");
    r = identifier(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && namedParameterList_2(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && namedParameterList_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [gt]
  private static boolean namedParameterList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedParameterList_2")) return false;
    gt(b, l + 1);
    return true;
  }

  // ( COMMA identifier eq [gt] expression )*
  private static boolean namedParameterList_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedParameterList_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namedParameterList_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namedParameterList_4", c)) break;
    }
    return true;
  }

  // COMMA identifier eq [gt] expression
  private static boolean namedParameterList_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedParameterList_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && namedParameterList_4_0_3(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [gt]
  private static boolean namedParameterList_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedParameterList_4_0_3")) return false;
    gt(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LEFT_BRACKET [expression (COMMA expression)* ] [COMMA] RIGHT_BRACKET
  public static boolean nestedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedExpression")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && nestedExpression_1(b, l + 1);
    r = r && nestedExpression_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, NESTED_EXPRESSION, r);
    return r;
  }

  // [expression (COMMA expression)* ]
  private static boolean nestedExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedExpression_1")) return false;
    nestedExpression_1_0(b, l + 1);
    return true;
  }

  // expression (COMMA expression)*
  private static boolean nestedExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && nestedExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean nestedExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nestedExpression_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nestedExpression_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean nestedExpression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedExpression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA]
  private static boolean nestedExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nestedExpression_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ('FALSE' | 'TRUE' | 'NULL' | stringLike | ([catalogName PERIOD][SINGLE_QUOTATION['%']]baseString[['%']SINGLE_QUOTATION]) )*
  public static boolean nonNumericLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral")) return false;
    Marker m = enter_section_(b, l, _NONE_, NON_NUMERIC_LITERAL, "<non numeric literal>");
    while (true) {
      int c = current_position_(b);
      if (!nonNumericLiteral_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "nonNumericLiteral", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // 'FALSE' | 'TRUE' | 'NULL' | stringLike | ([catalogName PERIOD][SINGLE_QUOTATION['%']]baseString[['%']SINGLE_QUOTATION])
  private static boolean nonNumericLiteral_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FALSE");
    if (!r) r = consumeToken(b, "TRUE");
    if (!r) r = consumeToken(b, "NULL");
    if (!r) r = stringLike(b, l + 1);
    if (!r) r = nonNumericLiteral_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [catalogName PERIOD][SINGLE_QUOTATION['%']]baseString[['%']SINGLE_QUOTATION]
  private static boolean nonNumericLiteral_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nonNumericLiteral_0_4_0(b, l + 1);
    r = r && nonNumericLiteral_0_4_1(b, l + 1);
    r = r && baseString(b, l + 1);
    r = r && nonNumericLiteral_0_4_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [catalogName PERIOD]
  private static boolean nonNumericLiteral_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_0")) return false;
    nonNumericLiteral_0_4_0_0(b, l + 1);
    return true;
  }

  // catalogName PERIOD
  private static boolean nonNumericLiteral_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SINGLE_QUOTATION['%']]
  private static boolean nonNumericLiteral_0_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_1")) return false;
    nonNumericLiteral_0_4_1_0(b, l + 1);
    return true;
  }

  // SINGLE_QUOTATION['%']
  private static boolean nonNumericLiteral_0_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTATION);
    r = r && nonNumericLiteral_0_4_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['%']
  private static boolean nonNumericLiteral_0_4_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_1_0_1")) return false;
    consumeToken(b, "%");
    return true;
  }

  // [['%']SINGLE_QUOTATION]
  private static boolean nonNumericLiteral_0_4_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_3")) return false;
    nonNumericLiteral_0_4_3_0(b, l + 1);
    return true;
  }

  // ['%']SINGLE_QUOTATION
  private static boolean nonNumericLiteral_0_4_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = nonNumericLiteral_0_4_3_0_0(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['%']
  private static boolean nonNumericLiteral_0_4_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonNumericLiteral_0_4_3_0_0")) return false;
    consumeToken(b, "%");
    return true;
  }

  /* ********************************************************** */
  // 'INSTEDAD' | 'VIEW' | 'ENABLED'| 'DISABLED' | 'KEY' | 'SERIAL' | 'TEXTAGG' | 'COUNT' | 'ROW_NUMBER'
  //    | 'RANK' | 'DENSE_RANK' | 'AVG'| 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP' | 'VAR_SAMP' | 'VAR_POP'
  //    | 'DOCUMENT' | 'CONTENT' | 'TRIM' | 'EMPTY' | 'ORDINALITY' | 'PATH' | 'FIRST' | 'LAST' | 'NEXT' | 'SUBSTRING' | 'EXTRACT'
  //    | 'TO_CHARS' | 'TO_BYTES'| 'QUERYSTRING' | 'NAMESPACE' | 'RESULT' | 'INDEX' | 'ACCESSPATTERN'
  //    | 'AUTO_INCREMENT' | 'WELLFORMED' | 'SQL_TSI_FRAC_SECOND' | 'SQL_TSI_SECOND' | 'SQL_TSI_MINUTE' | 'SQL_TSI_HOUR' | 'SQL_TSI_DAY'
  //    | 'SQL_TSI_WEEK' |  'SQL_TSI_MONTH' | 'SQL_TSI_QUARTER'| 'SQL_TSI_YEAR'| 'TEXTTABLE'| 'ARRAYTABLE' | 'SELECTOR' | 'SKIP'
  //    | 'WIDTH' | 'PASSING' | 'NAME' | 'ENCODING' | 'COLUMNS' | 'DELIMITER' | 'QUOTE' | 'HEADER' |'NULLS' | 'OBJECTTABLE'| 'VERSION'
  //    | 'INCLUDING' | 'EXCLUDING' | 'XMLDECLARATION' | 'VARIADIC' | 'RAISE' | 'EXCEPTION' | 'CHAIN' | 'JSONARRAY_AGG' |'JSONOBJECT'
  //    | 'PRESERVE'
  public static boolean nonReservedIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonReservedIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_RESERVED_IDENTIFIER, "<non reserved identifier>");
    r = consumeToken(b, "INSTEDAD");
    if (!r) r = consumeToken(b, "VIEW");
    if (!r) r = consumeToken(b, "ENABLED");
    if (!r) r = consumeToken(b, "DISABLED");
    if (!r) r = consumeToken(b, "KEY");
    if (!r) r = consumeToken(b, "SERIAL");
    if (!r) r = consumeToken(b, "TEXTAGG");
    if (!r) r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "ROW_NUMBER");
    if (!r) r = consumeToken(b, "RANK");
    if (!r) r = consumeToken(b, "DENSE_RANK");
    if (!r) r = consumeToken(b, "AVG");
    if (!r) r = consumeToken(b, "MIN");
    if (!r) r = consumeToken(b, "MAX");
    if (!r) r = consumeToken(b, "EVERY");
    if (!r) r = consumeToken(b, "STDDEV_POP");
    if (!r) r = consumeToken(b, "STDDEV_SAMP");
    if (!r) r = consumeToken(b, "VAR_SAMP");
    if (!r) r = consumeToken(b, "VAR_POP");
    if (!r) r = consumeToken(b, "DOCUMENT");
    if (!r) r = consumeToken(b, "CONTENT");
    if (!r) r = consumeToken(b, "TRIM");
    if (!r) r = consumeToken(b, "EMPTY");
    if (!r) r = consumeToken(b, "ORDINALITY");
    if (!r) r = consumeToken(b, "PATH");
    if (!r) r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "LAST");
    if (!r) r = consumeToken(b, "NEXT");
    if (!r) r = consumeToken(b, "SUBSTRING");
    if (!r) r = consumeToken(b, "EXTRACT");
    if (!r) r = consumeToken(b, "TO_CHARS");
    if (!r) r = consumeToken(b, "TO_BYTES");
    if (!r) r = consumeToken(b, "QUERYSTRING");
    if (!r) r = consumeToken(b, "NAMESPACE");
    if (!r) r = consumeToken(b, "RESULT");
    if (!r) r = consumeToken(b, "INDEX");
    if (!r) r = consumeToken(b, "ACCESSPATTERN");
    if (!r) r = consumeToken(b, "AUTO_INCREMENT");
    if (!r) r = consumeToken(b, "WELLFORMED");
    if (!r) r = consumeToken(b, "SQL_TSI_FRAC_SECOND");
    if (!r) r = consumeToken(b, "SQL_TSI_SECOND");
    if (!r) r = consumeToken(b, "SQL_TSI_MINUTE");
    if (!r) r = consumeToken(b, "SQL_TSI_HOUR");
    if (!r) r = consumeToken(b, "SQL_TSI_DAY");
    if (!r) r = consumeToken(b, "SQL_TSI_WEEK");
    if (!r) r = consumeToken(b, "SQL_TSI_MONTH");
    if (!r) r = consumeToken(b, "SQL_TSI_QUARTER");
    if (!r) r = consumeToken(b, "SQL_TSI_YEAR");
    if (!r) r = consumeToken(b, "TEXTTABLE");
    if (!r) r = consumeToken(b, "ARRAYTABLE");
    if (!r) r = consumeToken(b, "SELECTOR");
    if (!r) r = consumeToken(b, "SKIP");
    if (!r) r = consumeToken(b, "WIDTH");
    if (!r) r = consumeToken(b, "PASSING");
    if (!r) r = consumeToken(b, "NAME");
    if (!r) r = consumeToken(b, "ENCODING");
    if (!r) r = consumeToken(b, "COLUMNS");
    if (!r) r = consumeToken(b, "DELIMITER");
    if (!r) r = consumeToken(b, "QUOTE");
    if (!r) r = consumeToken(b, "HEADER");
    if (!r) r = consumeToken(b, "NULLS");
    if (!r) r = consumeToken(b, "OBJECTTABLE");
    if (!r) r = consumeToken(b, "VERSION");
    if (!r) r = consumeToken(b, "INCLUDING");
    if (!r) r = consumeToken(b, "EXCLUDING");
    if (!r) r = consumeToken(b, "XMLDECLARATION");
    if (!r) r = consumeToken(b, "VARIADIC");
    if (!r) r = consumeToken(b, "RAISE");
    if (!r) r = consumeToken(b, "EXCEPTION");
    if (!r) r = consumeToken(b, "CHAIN");
    if (!r) r = consumeToken(b, "JSONARRAY_AGG");
    if (!r) r = consumeToken(b, "JSONOBJECT");
    if (!r) r = consumeToken(b, "PRESERVE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '--'allString* | '/*' allString* '*/' | '#'allString*
  public static boolean note(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOTE, "<note>");
    r = note_0(b, l + 1);
    if (!r) r = note_1(b, l + 1);
    if (!r) r = note_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '--'allString*
  private static boolean note_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "--");
    r = r && note_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allString*
  private static boolean note_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "note_0_1", c)) break;
    }
    return true;
  }

  // '/*' allString* '*/'
  private static boolean note_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "/*");
    r = r && note_1_1(b, l + 1);
    r = r && consumeToken(b, "*/");
    exit_section_(b, m, null, r);
    return r;
  }

  // allString*
  private static boolean note_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "note_1_1", c)) break;
    }
    return true;
  }

  // '#'allString*
  private static boolean note_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "#");
    r = r && note_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // allString*
  private static boolean note_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "note_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!allString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "note_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // term (('+'| '-' | '*' | '/') term)*
  public static boolean numericValueExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numericValueExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_VALUE_EXPRESSION, "<numeric value expression>");
    r = term(b, l + 1);
    r = r && numericValueExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('+'| '-' | '*' | '/') term)*
  private static boolean numericValueExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numericValueExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!numericValueExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "numericValueExpression_1", c)) break;
    }
    return true;
  }

  // ('+'| '-' | '*' | '/') term
  private static boolean numericValueExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numericValueExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = numericValueExpression_1_0_0(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+'| '-' | '*' | '/'
  private static boolean numericValueExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numericValueExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, SLASH);
    return r;
  }

  /* ********************************************************** */
  // [ metadataColumnDefinition | physicalColumnDefinition | computedColumnDefinition  ]
  //                    [ watermarkDefinition ]
  //                    [ tableConstraint ]
  //                    ['COMMENT' commentContent]
  public static boolean oneTableField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ONE_TABLE_FIELD, "<one table field>");
    r = oneTableField_0(b, l + 1);
    r = r && oneTableField_1(b, l + 1);
    r = r && oneTableField_2(b, l + 1);
    r = r && oneTableField_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ metadataColumnDefinition | physicalColumnDefinition | computedColumnDefinition  ]
  private static boolean oneTableField_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField_0")) return false;
    oneTableField_0_0(b, l + 1);
    return true;
  }

  // metadataColumnDefinition | physicalColumnDefinition | computedColumnDefinition
  private static boolean oneTableField_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField_0_0")) return false;
    boolean r;
    r = metadataColumnDefinition(b, l + 1);
    if (!r) r = physicalColumnDefinition(b, l + 1);
    if (!r) r = computedColumnDefinition(b, l + 1);
    return r;
  }

  // [ watermarkDefinition ]
  private static boolean oneTableField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField_1")) return false;
    watermarkDefinition(b, l + 1);
    return true;
  }

  // [ tableConstraint ]
  private static boolean oneTableField_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField_2")) return false;
    tableConstraint(b, l + 1);
    return true;
  }

  // ['COMMENT' commentContent]
  private static boolean oneTableField_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField_3")) return false;
    oneTableField_3_0(b, l + 1);
    return true;
  }

  // 'COMMENT' commentContent
  private static boolean oneTableField_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oneTableField_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COMMENT");
    r = r && commentContent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'ORDER' 'BY' sortSpecification ( COMMA sortSpecification)*
  public static boolean orderByClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderByClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORDER_BY_CLAUSE, "<order by clause>");
    r = consumeToken(b, "ORDER");
    r = r && consumeToken(b, "BY");
    r = r && sortSpecification(b, l + 1);
    r = r && orderByClause_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( COMMA sortSpecification)*
  private static boolean orderByClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderByClause_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!orderByClause_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "orderByClause_3", c)) break;
    }
    return true;
  }

  // COMMA sortSpecification
  private static boolean orderByClause_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderByClause_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && sortSpecification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseString ['ASC' | 'DESC']
  public static boolean orderItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORDER_ITEM, "<order item>");
    r = baseString(b, l + 1);
    r = r && orderItem_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['ASC' | 'DESC']
  private static boolean orderItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderItem_1")) return false;
    orderItem_1_0(b, l + 1);
    return true;
  }

  // 'ASC' | 'DESC'
  private static boolean orderItem_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderItem_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ASC");
    if (!r) r = consumeToken(b, "DESC");
    return r;
  }

  /* ********************************************************** */
  // ('XMLAGG' | 'ARRAY_AGG' | 'JSONARRAY_AGG' ) LEFT_BRACKET expression [orderByClause] RIGHT_BRACKET
  public static boolean orderedAggregateFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderedAggregateFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ORDERED_AGGREGATE_FUNCTION, "<ordered aggregate function>");
    r = orderedAggregateFunction_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && orderedAggregateFunction_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'XMLAGG' | 'ARRAY_AGG' | 'JSONARRAY_AGG'
  private static boolean orderedAggregateFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderedAggregateFunction_0")) return false;
    boolean r;
    r = consumeToken(b, "XMLAGG");
    if (!r) r = consumeToken(b, "ARRAY_AGG");
    if (!r) r = consumeToken(b, "JSONARRAY_AGG");
    return r;
  }

  // [orderByClause]
  private static boolean orderedAggregateFunction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderedAggregateFunction_3")) return false;
    orderByClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier | ('{'|'FN') function '}'
  public static boolean parameterReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_REFERENCE, "<parameter reference>");
    r = identifier(b, l + 1);
    if (!r) r = parameterReference_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('{'|'FN') function '}'
  private static boolean parameterReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterReference_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameterReference_1_0(b, l + 1);
    r = r && function(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'|'FN'
  private static boolean parameterReference_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterReference_1_0")) return false;
    boolean r;
    r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, "FN");
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET key '=' [SINGLE_QUOTATION]val[SINGLE_QUOTATION]
  //               (COMMA key '=' [SINGLE_QUOTATION]val[SINGLE_QUOTATION] )*
  //             RIGHT_BRACKET
  public static boolean partSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && key(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && partSpec_3(b, l + 1);
    r = r && val(b, l + 1);
    r = r && partSpec_5(b, l + 1);
    r = r && partSpec_6(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, PART_SPEC, r);
    return r;
  }

  // [SINGLE_QUOTATION]
  private static boolean partSpec_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec_3")) return false;
    consumeToken(b, SINGLE_QUOTATION);
    return true;
  }

  // [SINGLE_QUOTATION]
  private static boolean partSpec_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec_5")) return false;
    consumeToken(b, SINGLE_QUOTATION);
    return true;
  }

  // (COMMA key '=' [SINGLE_QUOTATION]val[SINGLE_QUOTATION] )*
  private static boolean partSpec_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!partSpec_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "partSpec_6", c)) break;
    }
    return true;
  }

  // COMMA key '=' [SINGLE_QUOTATION]val[SINGLE_QUOTATION]
  private static boolean partSpec_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && key(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && partSpec_6_0_3(b, l + 1);
    r = r && val(b, l + 1);
    r = r && partSpec_6_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [SINGLE_QUOTATION]
  private static boolean partSpec_6_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec_6_0_3")) return false;
    consumeToken(b, SINGLE_QUOTATION);
    return true;
  }

  // [SINGLE_QUOTATION]
  private static boolean partSpec_6_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "partSpec_6_0_5")) return false;
    consumeToken(b, SINGLE_QUOTATION);
    return true;
  }

  /* ********************************************************** */
  // (baseString| COLON | HYPHEN | '/' | UNDERSCORE )*
  public static boolean pathToFileName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pathToFileName")) return false;
    Marker m = enter_section_(b, l, _NONE_, PATH_TO_FILE_NAME, "<path to file name>");
    while (true) {
      int c = current_position_(b);
      if (!pathToFileName_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pathToFileName", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // baseString| COLON | HYPHEN | '/' | UNDERSCORE
  private static boolean pathToFileName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pathToFileName_0")) return false;
    boolean r;
    r = baseString(b, l + 1);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, UNDERSCORE);
    return r;
  }

  /* ********************************************************** */
  // patternTerm [ '|' patternTerm ]ANY
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = patternTerm(b, l + 1);
    r = r && pattern_1(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '|' patternTerm ]
  private static boolean pattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_1")) return false;
    pattern_1_0(b, l + 1);
    return true;
  }

  // '|' patternTerm
  private static boolean pattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "|");
    r = r && patternTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'VARIABLE' [ patternQuantifier ]
  public static boolean patternFactor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternFactor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_FACTOR, "<pattern factor>");
    r = consumeToken(b, "VARIABLE");
    r = r && patternFactor_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ patternQuantifier ]
  private static boolean patternFactor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternFactor_1")) return false;
    patternQuantifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '*'
  //   | '*?'
  //   | '+'
  //   | '+?'
  //   | '?'
  //   | '??'
  //   | '{' { [ 'MINREPEAT' ]COMMA [ 'MAXREPEAT' ] } '}' ['?']
  //   | '{' 'REPEAT' '}'
  public static boolean patternQuantifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_QUANTIFIER, "<pattern quantifier>");
    r = consumeToken(b, ANY);
    if (!r) r = consumeToken(b, "*?");
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, "+?");
    if (!r) r = consumeToken(b, "?");
    if (!r) r = consumeToken(b, "??");
    if (!r) r = patternQuantifier_6(b, l + 1);
    if (!r) r = patternQuantifier_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' { [ 'MINREPEAT' ]COMMA [ 'MAXREPEAT' ] } '}' ['?']
  private static boolean patternQuantifier_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && patternQuantifier_6_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && patternQuantifier_6_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'MINREPEAT' ]COMMA [ 'MAXREPEAT' ]
  private static boolean patternQuantifier_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier_6_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = patternQuantifier_6_1_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && patternQuantifier_6_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'MINREPEAT' ]
  private static boolean patternQuantifier_6_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier_6_1_0")) return false;
    consumeToken(b, "MINREPEAT");
    return true;
  }

  // [ 'MAXREPEAT' ]
  private static boolean patternQuantifier_6_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier_6_1_2")) return false;
    consumeToken(b, "MAXREPEAT");
    return true;
  }

  // ['?']
  private static boolean patternQuantifier_6_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier_6_3")) return false;
    consumeToken(b, "?");
    return true;
  }

  // '{' 'REPEAT' '}'
  private static boolean patternQuantifier_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternQuantifier_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && consumeToken(b, "REPEAT");
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // patternFactor [ patternFactor ]ANY
  public static boolean patternTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN_TERM, "<pattern term>");
    r = patternFactor(b, l + 1);
    r = r && patternTerm_1(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ patternFactor ]
  private static boolean patternTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "patternTerm_1")) return false;
    patternFactor(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // columnName ( dataType ) [columnConstraint]
  public static boolean physicalColumnDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physicalColumnDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PHYSICAL_COLUMN_DEFINITION, "<physical column definition>");
    r = columnName(b, l + 1);
    r = r && physicalColumnDefinition_1(b, l + 1);
    r = r && physicalColumnDefinition_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( dataType )
  private static boolean physicalColumnDefinition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physicalColumnDefinition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dataType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [columnConstraint]
  private static boolean physicalColumnDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physicalColumnDefinition_2")) return false;
    columnConstraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ ( 'RIGHT' [ 'OUTER' ] ) | ( 'LEFT' [ 'OUTER' ] ) | ( 'FULL' [ 'OUTER' ] ) | 'INNER' ] 'JOIN' tableReference 'ON' condition
  public static boolean qualifiedTable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_TABLE, "<qualified table>");
    r = qualifiedTable_0(b, l + 1);
    r = r && consumeToken(b, "JOIN");
    r = r && tableReference(b, l + 1);
    r = r && consumeToken(b, "ON");
    r = r && condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( 'RIGHT' [ 'OUTER' ] ) | ( 'LEFT' [ 'OUTER' ] ) | ( 'FULL' [ 'OUTER' ] ) | 'INNER' ]
  private static boolean qualifiedTable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0")) return false;
    qualifiedTable_0_0(b, l + 1);
    return true;
  }

  // ( 'RIGHT' [ 'OUTER' ] ) | ( 'LEFT' [ 'OUTER' ] ) | ( 'FULL' [ 'OUTER' ] ) | 'INNER'
  private static boolean qualifiedTable_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedTable_0_0_0(b, l + 1);
    if (!r) r = qualifiedTable_0_0_1(b, l + 1);
    if (!r) r = qualifiedTable_0_0_2(b, l + 1);
    if (!r) r = consumeToken(b, "INNER");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'RIGHT' [ 'OUTER' ]
  private static boolean qualifiedTable_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "RIGHT");
    r = r && qualifiedTable_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'OUTER' ]
  private static boolean qualifiedTable_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0_0_1")) return false;
    consumeToken(b, "OUTER");
    return true;
  }

  // 'LEFT' [ 'OUTER' ]
  private static boolean qualifiedTable_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LEFT");
    r = r && qualifiedTable_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'OUTER' ]
  private static boolean qualifiedTable_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0_1_1")) return false;
    consumeToken(b, "OUTER");
    return true;
  }

  // 'FULL' [ 'OUTER' ]
  private static boolean qualifiedTable_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FULL");
    r = r && qualifiedTable_0_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'OUTER' ]
  private static boolean qualifiedTable_0_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedTable_0_0_2_1")) return false;
    consumeToken(b, "OUTER");
    return true;
  }

  /* ********************************************************** */
  // comparisonOperator [ 'ANY' | 'SOME' | 'ALL' ] ( [LEFT_BRACKET] queryWithoutSemiColon [RIGHT_BRACKET] | ( LEFT_BRACKET expression RIGHT_BRACKET )  )
  public static boolean quantifiedComparisonPredicate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUANTIFIED_COMPARISON_PREDICATE, "<quantified comparison predicate>");
    r = comparisonOperator(b, l + 1);
    r = r && quantifiedComparisonPredicate_1(b, l + 1);
    r = r && quantifiedComparisonPredicate_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'ANY' | 'SOME' | 'ALL' ]
  private static boolean quantifiedComparisonPredicate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_1")) return false;
    quantifiedComparisonPredicate_1_0(b, l + 1);
    return true;
  }

  // 'ANY' | 'SOME' | 'ALL'
  private static boolean quantifiedComparisonPredicate_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ANY");
    if (!r) r = consumeToken(b, "SOME");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  // [LEFT_BRACKET] queryWithoutSemiColon [RIGHT_BRACKET] | ( LEFT_BRACKET expression RIGHT_BRACKET )
  private static boolean quantifiedComparisonPredicate_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = quantifiedComparisonPredicate_2_0(b, l + 1);
    if (!r) r = quantifiedComparisonPredicate_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET] queryWithoutSemiColon [RIGHT_BRACKET]
  private static boolean quantifiedComparisonPredicate_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = quantifiedComparisonPredicate_2_0_0(b, l + 1);
    r = r && queryWithoutSemiColon(b, l + 1);
    r = r && quantifiedComparisonPredicate_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET]
  private static boolean quantifiedComparisonPredicate_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_2_0_0")) return false;
    consumeToken(b, LEFT_BRACKET);
    return true;
  }

  // [RIGHT_BRACKET]
  private static boolean quantifiedComparisonPredicate_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_2_0_2")) return false;
    consumeToken(b, RIGHT_BRACKET);
    return true;
  }

  // LEFT_BRACKET expression RIGHT_BRACKET
  private static boolean quantifiedComparisonPredicate_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quantifiedComparisonPredicate_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // values
  //   | ((
  //         selectV2
  //       | selectWithoutFrom
  //       | query2 'UNION' [ 'ALL' ] query2
  //       | query2 'EXPECT' query2
  //       | query2 'INTERSECT' query2
  //     )*
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY']
  //     SEMI_COLON
  //     )
  public static boolean query(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY, "<query>");
    r = values(b, l + 1);
    if (!r) r = query_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //         selectV2
  //       | selectWithoutFrom
  //       | query2 'UNION' [ 'ALL' ] query2
  //       | query2 'EXPECT' query2
  //       | query2 'INTERSECT' query2
  //     )*
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY']
  //     SEMI_COLON
  private static boolean query_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query_1_0(b, l + 1);
    r = r && query_1_1(b, l + 1);
    r = r && query_1_2(b, l + 1);
    r = r && query_1_3(b, l + 1);
    r = r && query_1_4(b, l + 1);
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //         selectV2
  //       | selectWithoutFrom
  //       | query2 'UNION' [ 'ALL' ] query2
  //       | query2 'EXPECT' query2
  //       | query2 'INTERSECT' query2
  //     )*
  private static boolean query_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!query_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "query_1_0", c)) break;
    }
    return true;
  }

  // selectV2
  //       | selectWithoutFrom
  //       | query2 'UNION' [ 'ALL' ] query2
  //       | query2 'EXPECT' query2
  //       | query2 'INTERSECT' query2
  private static boolean query_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectV2(b, l + 1);
    if (!r) r = selectWithoutFrom(b, l + 1);
    if (!r) r = query_1_0_0_2(b, l + 1);
    if (!r) r = query_1_0_0_3(b, l + 1);
    if (!r) r = query_1_0_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // query2 'UNION' [ 'ALL' ] query2
  private static boolean query_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query2(b, l + 1);
    r = r && consumeToken(b, "UNION");
    r = r && query_1_0_0_2_2(b, l + 1);
    r = r && query2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ALL' ]
  private static boolean query_1_0_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_0_0_2_2")) return false;
    consumeToken(b, "ALL");
    return true;
  }

  // query2 'EXPECT' query2
  private static boolean query_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_0_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query2(b, l + 1);
    r = r && consumeToken(b, "EXPECT");
    r = r && query2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // query2 'INTERSECT' query2
  private static boolean query_1_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_0_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query2(b, l + 1);
    r = r && consumeToken(b, "INTERSECT");
    r = r && query2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  private static boolean query_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_1")) return false;
    query_1_1_0(b, l + 1);
    return true;
  }

  // 'ORDER BY' orderItem [COMMA orderItem ]ANY
  private static boolean query_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ORDER BY");
    r = r && orderItem(b, l + 1);
    r = r && query_1_1_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA orderItem ]
  private static boolean query_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_1_0_2")) return false;
    query_1_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA orderItem
  private static boolean query_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && orderItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  private static boolean query_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_2")) return false;
    query_1_2_0(b, l + 1);
    return true;
  }

  // 'LIMIT' { 'COUNT' | 'ALL' }
  private static boolean query_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIMIT");
    r = r && query_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'COUNT' | 'ALL'
  private static boolean query_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  // [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  private static boolean query_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_3")) return false;
    query_1_3_0(b, l + 1);
    return true;
  }

  // 'OFFSET START' { 'ROW' | 'ROWS' }
  private static boolean query_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OFFSET START");
    r = r && query_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ROW' | 'ROWS'
  private static boolean query_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  // [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY']
  private static boolean query_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_4")) return false;
    query_1_4_0(b, l + 1);
    return true;
  }

  // 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY'
  private static boolean query_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FETCH");
    r = r && query_1_4_0_1(b, l + 1);
    r = r && query_1_4_0_2(b, l + 1);
    r = r && query_1_4_0_3(b, l + 1);
    r = r && consumeToken(b, "ONLY");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'FIRST' | 'NEXT'
  private static boolean query_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_4_0_1")) return false;
    boolean r;
    r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "NEXT");
    return r;
  }

  // [ 'COUNT' ]
  private static boolean query_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_4_0_2")) return false;
    consumeToken(b, "COUNT");
    return true;
  }

  // 'ROW' | 'ROWS'
  private static boolean query_1_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_1_4_0_3")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  /* ********************************************************** */
  // values
  //   | ((
  //         selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] query2
  //       | 'EXPECT`' query2
  //       | 'INTERSECT' query2
  //     )*
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY']
  //     SEMI_COLON
  //     )
  //   | ε
  public static boolean query2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_2, "<query 2>");
    r = values(b, l + 1);
    if (!r) r = query2_1(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //         selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] query2
  //       | 'EXPECT`' query2
  //       | 'INTERSECT' query2
  //     )*
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY']
  //     SEMI_COLON
  private static boolean query2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query2_1_0(b, l + 1);
    r = r && query2_1_1(b, l + 1);
    r = r && query2_1_2(b, l + 1);
    r = r && query2_1_3(b, l + 1);
    r = r && query2_1_4(b, l + 1);
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //         selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] query2
  //       | 'EXPECT`' query2
  //       | 'INTERSECT' query2
  //     )*
  private static boolean query2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!query2_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "query2_1_0", c)) break;
    }
    return true;
  }

  // selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] query2
  //       | 'EXPECT`' query2
  //       | 'INTERSECT' query2
  private static boolean query2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectV2(b, l + 1);
    if (!r) r = selectWithoutFrom(b, l + 1);
    if (!r) r = query2_1_0_0_2(b, l + 1);
    if (!r) r = query2_1_0_0_3(b, l + 1);
    if (!r) r = query2_1_0_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'UNION' [ 'ALL' ] query2
  private static boolean query2_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UNION");
    r = r && query2_1_0_0_2_1(b, l + 1);
    r = r && query2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ALL' ]
  private static boolean query2_1_0_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_0_0_2_1")) return false;
    consumeToken(b, "ALL");
    return true;
  }

  // 'EXPECT`' query2
  private static boolean query2_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_0_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXPECT`");
    r = r && query2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'INTERSECT' query2
  private static boolean query2_1_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_0_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "INTERSECT");
    r = r && query2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  private static boolean query2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_1")) return false;
    query2_1_1_0(b, l + 1);
    return true;
  }

  // 'ORDER BY' orderItem [COMMA orderItem ]ANY
  private static boolean query2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ORDER BY");
    r = r && orderItem(b, l + 1);
    r = r && query2_1_1_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA orderItem ]
  private static boolean query2_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_1_0_2")) return false;
    query2_1_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA orderItem
  private static boolean query2_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && orderItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  private static boolean query2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_2")) return false;
    query2_1_2_0(b, l + 1);
    return true;
  }

  // 'LIMIT' { 'COUNT' | 'ALL' }
  private static boolean query2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIMIT");
    r = r && query2_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'COUNT' | 'ALL'
  private static boolean query2_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  // [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  private static boolean query2_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_3")) return false;
    query2_1_3_0(b, l + 1);
    return true;
  }

  // 'OFFSET START' { 'ROW' | 'ROWS' }
  private static boolean query2_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OFFSET START");
    r = r && query2_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ROW' | 'ROWS'
  private static boolean query2_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  // [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY']
  private static boolean query2_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_4")) return false;
    query2_1_4_0(b, l + 1);
    return true;
  }

  // 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY'
  private static boolean query2_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FETCH");
    r = r && query2_1_4_0_1(b, l + 1);
    r = r && query2_1_4_0_2(b, l + 1);
    r = r && query2_1_4_0_3(b, l + 1);
    r = r && consumeToken(b, "ONLY");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'FIRST' | 'NEXT'
  private static boolean query2_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_4_0_1")) return false;
    boolean r;
    r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "NEXT");
    return r;
  }

  // [ 'COUNt' ]
  private static boolean query2_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_4_0_2")) return false;
    consumeToken(b, "COUNt");
    return true;
  }

  // 'ROW' | 'ROWS'
  private static boolean query2_1_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query2_1_4_0_3")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  /* ********************************************************** */
  // ['WITH' withListElement (COMMA withListElement)*] queryExpressionBody
  public static boolean queryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_EXPRESSION, "<query expression>");
    r = queryExpression_0(b, l + 1);
    r = r && queryExpressionBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['WITH' withListElement (COMMA withListElement)*]
  private static boolean queryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpression_0")) return false;
    queryExpression_0_0(b, l + 1);
    return true;
  }

  // 'WITH' withListElement (COMMA withListElement)*
  private static boolean queryExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "WITH");
    r = r && withListElement(b, l + 1);
    r = r && queryExpression_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA withListElement)*
  private static boolean queryExpression_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpression_0_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!queryExpression_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "queryExpression_0_0_2", c)) break;
    }
    return true;
  }

  // COMMA withListElement
  private static boolean queryExpression_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpression_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && withListElement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // queryTerm [('UNION'|'EXPECT') ['ALL' | 'DISTINCT'] queryTerm] [orderByClause] [limitClause]
  public static boolean queryExpressionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_EXPRESSION_BODY, "<query expression body>");
    r = queryTerm(b, l + 1);
    r = r && queryExpressionBody_1(b, l + 1);
    r = r && queryExpressionBody_2(b, l + 1);
    r = r && queryExpressionBody_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [('UNION'|'EXPECT') ['ALL' | 'DISTINCT'] queryTerm]
  private static boolean queryExpressionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_1")) return false;
    queryExpressionBody_1_0(b, l + 1);
    return true;
  }

  // ('UNION'|'EXPECT') ['ALL' | 'DISTINCT'] queryTerm
  private static boolean queryExpressionBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryExpressionBody_1_0_0(b, l + 1);
    r = r && queryExpressionBody_1_0_1(b, l + 1);
    r = r && queryTerm(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'UNION'|'EXPECT'
  private static boolean queryExpressionBody_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "UNION");
    if (!r) r = consumeToken(b, "EXPECT");
    return r;
  }

  // ['ALL' | 'DISTINCT']
  private static boolean queryExpressionBody_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_1_0_1")) return false;
    queryExpressionBody_1_0_1_0(b, l + 1);
    return true;
  }

  // 'ALL' | 'DISTINCT'
  private static boolean queryExpressionBody_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "DISTINCT");
    return r;
  }

  // [orderByClause]
  private static boolean queryExpressionBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_2")) return false;
    orderByClause(b, l + 1);
    return true;
  }

  // [limitClause]
  private static boolean queryExpressionBody_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryExpressionBody_3")) return false;
    limitClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // query ('MAKEDEP' identifier )
  public static boolean queryPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_PRIMARY, "<query primary>");
    r = query(b, l + 1);
    r = r && queryPrimary_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'MAKEDEP' identifier
  private static boolean queryPrimary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryPrimary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAKEDEP");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // query
  public static boolean queryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_STATEMENT, "<query statement>");
    r = query(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'QUERYSTRING' LEFT_BRACKET expression [COMMA derivedColumn] RIGHT_BRACKET
  public static boolean queryStringFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryStringFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_STRING_FUNCTION, "<query string function>");
    r = consumeToken(b, "QUERYSTRING");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && expression(b, l + 1);
    r = r && queryStringFunction_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [COMMA derivedColumn]
  private static boolean queryStringFunction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryStringFunction_3")) return false;
    queryStringFunction_3_0(b, l + 1);
    return true;
  }

  // COMMA derivedColumn
  private static boolean queryStringFunction_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryStringFunction_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && derivedColumn(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // queryPrimary ('INTERSECT'[ 'ALL' | 'DISTINCT'] queryPrimary)*
  public static boolean queryTerm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryTerm")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_TERM, "<query term>");
    r = queryPrimary(b, l + 1);
    r = r && queryTerm_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('INTERSECT'[ 'ALL' | 'DISTINCT'] queryPrimary)*
  private static boolean queryTerm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryTerm_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!queryTerm_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "queryTerm_1", c)) break;
    }
    return true;
  }

  // 'INTERSECT'[ 'ALL' | 'DISTINCT'] queryPrimary
  private static boolean queryTerm_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryTerm_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "INTERSECT");
    r = r && queryTerm_1_0_1(b, l + 1);
    r = r && queryPrimary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ALL' | 'DISTINCT']
  private static boolean queryTerm_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryTerm_1_0_1")) return false;
    queryTerm_1_0_1_0(b, l + 1);
    return true;
  }

  // 'ALL' | 'DISTINCT'
  private static boolean queryTerm_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryTerm_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "DISTINCT");
    return r;
  }

  /* ********************************************************** */
  // values
  //   | {
  //         selectV2
  //       | selectWithoutFrom
  //       | queryWithoutSemiColon2 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  //       | queryWithoutSemiColon2 'EXPECT' queryWithoutSemiColon2
  //       | queryWithoutSemiColon2 'INTERSECT' queryWithoutSemiColon2
  //     }
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY']
  public static boolean queryWithoutSemiColon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_WITHOUT_SEMI_COLON, "<query without semi colon>");
    r = values(b, l + 1);
    if (!r) r = queryWithoutSemiColon_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  //         selectV2
  //       | selectWithoutFrom
  //       | queryWithoutSemiColon2 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  //       | queryWithoutSemiColon2 'EXPECT' queryWithoutSemiColon2
  //       | queryWithoutSemiColon2 'INTERSECT' queryWithoutSemiColon2
  //     }
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY']
  private static boolean queryWithoutSemiColon_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryWithoutSemiColon_1_0(b, l + 1);
    r = r && queryWithoutSemiColon_1_1(b, l + 1);
    r = r && queryWithoutSemiColon_1_2(b, l + 1);
    r = r && queryWithoutSemiColon_1_3(b, l + 1);
    r = r && queryWithoutSemiColon_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // selectV2
  //       | selectWithoutFrom
  //       | queryWithoutSemiColon2 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  //       | queryWithoutSemiColon2 'EXPECT' queryWithoutSemiColon2
  //       | queryWithoutSemiColon2 'INTERSECT' queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectV2(b, l + 1);
    if (!r) r = selectWithoutFrom(b, l + 1);
    if (!r) r = queryWithoutSemiColon_1_0_2(b, l + 1);
    if (!r) r = queryWithoutSemiColon_1_0_3(b, l + 1);
    if (!r) r = queryWithoutSemiColon_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // queryWithoutSemiColon2 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryWithoutSemiColon2(b, l + 1);
    r = r && consumeToken(b, "UNION");
    r = r && queryWithoutSemiColon_1_0_2_2(b, l + 1);
    r = r && queryWithoutSemiColon2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ALL' ]
  private static boolean queryWithoutSemiColon_1_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_0_2_2")) return false;
    consumeToken(b, "ALL");
    return true;
  }

  // queryWithoutSemiColon2 'EXPECT' queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryWithoutSemiColon2(b, l + 1);
    r = r && consumeToken(b, "EXPECT");
    r = r && queryWithoutSemiColon2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // queryWithoutSemiColon2 'INTERSECT' queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryWithoutSemiColon2(b, l + 1);
    r = r && consumeToken(b, "INTERSECT");
    r = r && queryWithoutSemiColon2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  private static boolean queryWithoutSemiColon_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_1")) return false;
    queryWithoutSemiColon_1_1_0(b, l + 1);
    return true;
  }

  // 'ORDER BY' orderItem [COMMA orderItem ]ANY
  private static boolean queryWithoutSemiColon_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ORDER BY");
    r = r && orderItem(b, l + 1);
    r = r && queryWithoutSemiColon_1_1_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA orderItem ]
  private static boolean queryWithoutSemiColon_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_1_0_2")) return false;
    queryWithoutSemiColon_1_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA orderItem
  private static boolean queryWithoutSemiColon_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && orderItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  private static boolean queryWithoutSemiColon_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_2")) return false;
    queryWithoutSemiColon_1_2_0(b, l + 1);
    return true;
  }

  // 'LIMIT' { 'COUNT' | 'ALL' }
  private static boolean queryWithoutSemiColon_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIMIT");
    r = r && queryWithoutSemiColon_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'COUNT' | 'ALL'
  private static boolean queryWithoutSemiColon_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  // [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  private static boolean queryWithoutSemiColon_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_3")) return false;
    queryWithoutSemiColon_1_3_0(b, l + 1);
    return true;
  }

  // 'OFFSET START' { 'ROW' | 'ROWS' }
  private static boolean queryWithoutSemiColon_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OFFSET START");
    r = r && queryWithoutSemiColon_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ROW' | 'ROWS'
  private static boolean queryWithoutSemiColon_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  // [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY']
  private static boolean queryWithoutSemiColon_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_4")) return false;
    queryWithoutSemiColon_1_4_0(b, l + 1);
    return true;
  }

  // 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNT' ] { 'ROW' | 'ROWS' } 'ONLY'
  private static boolean queryWithoutSemiColon_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FETCH");
    r = r && queryWithoutSemiColon_1_4_0_1(b, l + 1);
    r = r && queryWithoutSemiColon_1_4_0_2(b, l + 1);
    r = r && queryWithoutSemiColon_1_4_0_3(b, l + 1);
    r = r && consumeToken(b, "ONLY");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'FIRST' | 'NEXT'
  private static boolean queryWithoutSemiColon_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_4_0_1")) return false;
    boolean r;
    r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "NEXT");
    return r;
  }

  // [ 'COUNT' ]
  private static boolean queryWithoutSemiColon_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_4_0_2")) return false;
    consumeToken(b, "COUNT");
    return true;
  }

  // 'ROW' | 'ROWS'
  private static boolean queryWithoutSemiColon_1_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon_1_4_0_3")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  /* ********************************************************** */
  // values
  //   | {
  //         selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  //       | 'EXPECT`' queryWithoutSemiColon2
  //       | 'INTERSECT' queryWithoutSemiColon2
  //     }
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY']
  //   | ε
  public static boolean queryWithoutSemiColon2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, QUERY_WITHOUT_SEMI_COLON_2, "<query without semi colon 2>");
    r = values(b, l + 1);
    if (!r) r = queryWithoutSemiColon2_1(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  //         selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  //       | 'EXPECT`' queryWithoutSemiColon2
  //       | 'INTERSECT' queryWithoutSemiColon2
  //     }
  //     [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  //     [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  //     [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  //     [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY']
  private static boolean queryWithoutSemiColon2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryWithoutSemiColon2_1_0(b, l + 1);
    r = r && queryWithoutSemiColon2_1_1(b, l + 1);
    r = r && queryWithoutSemiColon2_1_2(b, l + 1);
    r = r && queryWithoutSemiColon2_1_3(b, l + 1);
    r = r && queryWithoutSemiColon2_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // selectV2
  //       | selectWithoutFrom
  //       | 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  //       | 'EXPECT`' queryWithoutSemiColon2
  //       | 'INTERSECT' queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectV2(b, l + 1);
    if (!r) r = selectWithoutFrom(b, l + 1);
    if (!r) r = queryWithoutSemiColon2_1_0_2(b, l + 1);
    if (!r) r = queryWithoutSemiColon2_1_0_3(b, l + 1);
    if (!r) r = queryWithoutSemiColon2_1_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'UNION' [ 'ALL' ] queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon2_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UNION");
    r = r && queryWithoutSemiColon2_1_0_2_1(b, l + 1);
    r = r && queryWithoutSemiColon2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ALL' ]
  private static boolean queryWithoutSemiColon2_1_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_0_2_1")) return false;
    consumeToken(b, "ALL");
    return true;
  }

  // 'EXPECT`' queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon2_1_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "EXPECT`");
    r = r && queryWithoutSemiColon2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'INTERSECT' queryWithoutSemiColon2
  private static boolean queryWithoutSemiColon2_1_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "INTERSECT");
    r = r && queryWithoutSemiColon2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'ORDER BY' orderItem [COMMA orderItem ]ANY ]
  private static boolean queryWithoutSemiColon2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_1")) return false;
    queryWithoutSemiColon2_1_1_0(b, l + 1);
    return true;
  }

  // 'ORDER BY' orderItem [COMMA orderItem ]ANY
  private static boolean queryWithoutSemiColon2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ORDER BY");
    r = r && orderItem(b, l + 1);
    r = r && queryWithoutSemiColon2_1_1_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA orderItem ]
  private static boolean queryWithoutSemiColon2_1_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_1_0_2")) return false;
    queryWithoutSemiColon2_1_1_0_2_0(b, l + 1);
    return true;
  }

  // COMMA orderItem
  private static boolean queryWithoutSemiColon2_1_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && orderItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LIMIT' { 'COUNT' | 'ALL' } ]
  private static boolean queryWithoutSemiColon2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_2")) return false;
    queryWithoutSemiColon2_1_2_0(b, l + 1);
    return true;
  }

  // 'LIMIT' { 'COUNT' | 'ALL' }
  private static boolean queryWithoutSemiColon2_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LIMIT");
    r = r && queryWithoutSemiColon2_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'COUNT' | 'ALL'
  private static boolean queryWithoutSemiColon2_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  // [ 'OFFSET START' { 'ROW' | 'ROWS' } ]
  private static boolean queryWithoutSemiColon2_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_3")) return false;
    queryWithoutSemiColon2_1_3_0(b, l + 1);
    return true;
  }

  // 'OFFSET START' { 'ROW' | 'ROWS' }
  private static boolean queryWithoutSemiColon2_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OFFSET START");
    r = r && queryWithoutSemiColon2_1_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'ROW' | 'ROWS'
  private static boolean queryWithoutSemiColon2_1_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_3_0_1")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  // [ 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY']
  private static boolean queryWithoutSemiColon2_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_4")) return false;
    queryWithoutSemiColon2_1_4_0(b, l + 1);
    return true;
  }

  // 'FETCH' { 'FIRST' | 'NEXT' } [ 'COUNt' ] { 'ROW' | 'ROWS' } 'ONLY'
  private static boolean queryWithoutSemiColon2_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FETCH");
    r = r && queryWithoutSemiColon2_1_4_0_1(b, l + 1);
    r = r && queryWithoutSemiColon2_1_4_0_2(b, l + 1);
    r = r && queryWithoutSemiColon2_1_4_0_3(b, l + 1);
    r = r && consumeToken(b, "ONLY");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'FIRST' | 'NEXT'
  private static boolean queryWithoutSemiColon2_1_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_4_0_1")) return false;
    boolean r;
    r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "NEXT");
    return r;
  }

  // [ 'COUNt' ]
  private static boolean queryWithoutSemiColon2_1_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_4_0_2")) return false;
    consumeToken(b, "COUNt");
    return true;
  }

  // 'ROW' | 'ROWS'
  private static boolean queryWithoutSemiColon2_1_4_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryWithoutSemiColon2_1_4_0_3")) return false;
    boolean r;
    r = consumeToken(b, "ROW");
    if (!r) r = consumeToken(b, "ROWS");
    return r;
  }

  /* ********************************************************** */
  // idPart | baseString
  public static boolean quotedId(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quotedId")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUOTED_ID, "<quoted id>");
    r = idPart(b, l + 1);
    if (!r) r = baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'ERROR' expression
  public static boolean raiseErrorStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseErrorStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISE_ERROR_STATEMENT, "<raise error statement>");
    r = consumeToken(b, "ERROR");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'RAISE' ['SQLWARNING'|'SQLEXCEPTION'] exceptionReference
  public static boolean raiseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAISE_STATEMENT, "<raise statement>");
    r = consumeToken(b, "RAISE");
    r = r && raiseStatement_1(b, l + 1);
    r = r && exceptionReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['SQLWARNING'|'SQLEXCEPTION']
  private static boolean raiseStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStatement_1")) return false;
    raiseStatement_1_0(b, l + 1);
    return true;
  }

  // 'SQLWARNING'|'SQLEXCEPTION'
  private static boolean raiseStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "raiseStatement_1_0")) return false;
    boolean r;
    r = consumeToken(b, "SQLWARNING");
    if (!r) r = consumeToken(b, "SQLEXCEPTION");
    return r;
  }

  /* ********************************************************** */
  // ENGLISH_STRING | CHINESE_STRING | NUMBER | DOUBLE | HYPHEN| UNDERSCORE | COLON
  public static boolean rawString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rawString")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RAW_STRING, "<raw string>");
    r = consumeToken(b, ENGLISH_STRING);
    if (!r) r = consumeToken(b, CHINESE_STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DOUBLE);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'REMOVE' 'JAR' SINGLE_QUOTATION pathToFileName PERIOD 'jar' SINGLE_QUOTATION SEMI_COLON
  public static boolean removeJar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "removeJar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REMOVE_JAR, "<remove jar>");
    r = consumeToken(b, "REMOVE");
    r = r && consumeToken(b, "JAR");
    r = r && consumeToken(b, SINGLE_QUOTATION);
    r = r && pathToFileName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && consumeToken(b, "jar");
    r = r && consumeTokens(b, 0, SINGLE_QUOTATION, SEMI_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'RETURN' [expression]
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = consumeToken(b, "RETURN");
    r = r && returnStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [expression]
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('COUNT' LEFT_BRACKET '*' RIGHT_BRACKET)
  //                             | ( 'COUNT' | 'SUM' | 'AVG' | 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP'
  //                             | 'VAR_SAMP' | 'VAR_POP' | 'SOME' | 'ANY' ) LEFT_BRACKET [ 'DISTINCT' | 'ALL' ] expression RIGHT_BRACKET
  public static boolean searchedCaseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "searchedCaseExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEARCHED_CASE_EXPRESSION, "<searched case expression>");
    r = searchedCaseExpression_0(b, l + 1);
    if (!r) r = searchedCaseExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'COUNT' LEFT_BRACKET '*' RIGHT_BRACKET
  private static boolean searchedCaseExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "searchedCaseExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COUNT");
    r = r && consumeTokens(b, 0, LEFT_BRACKET, ANY, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'COUNT' | 'SUM' | 'AVG' | 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP'
  //                             | 'VAR_SAMP' | 'VAR_POP' | 'SOME' | 'ANY' ) LEFT_BRACKET [ 'DISTINCT' | 'ALL' ] expression RIGHT_BRACKET
  private static boolean searchedCaseExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "searchedCaseExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = searchedCaseExpression_1_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && searchedCaseExpression_1_2(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'COUNT' | 'SUM' | 'AVG' | 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP'
  //                             | 'VAR_SAMP' | 'VAR_POP' | 'SOME' | 'ANY'
  private static boolean searchedCaseExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "searchedCaseExpression_1_0")) return false;
    boolean r;
    r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "SUM");
    if (!r) r = consumeToken(b, "AVG");
    if (!r) r = consumeToken(b, "MIN");
    if (!r) r = consumeToken(b, "MAX");
    if (!r) r = consumeToken(b, "EVERY");
    if (!r) r = consumeToken(b, "STDDEV_POP");
    if (!r) r = consumeToken(b, "STDDEV_SAMP");
    if (!r) r = consumeToken(b, "VAR_SAMP");
    if (!r) r = consumeToken(b, "VAR_POP");
    if (!r) r = consumeToken(b, "SOME");
    if (!r) r = consumeToken(b, "ANY");
    return r;
  }

  // [ 'DISTINCT' | 'ALL' ]
  private static boolean searchedCaseExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "searchedCaseExpression_1_2")) return false;
    searchedCaseExpression_1_2_0(b, l + 1);
    return true;
  }

  // 'DISTINCT' | 'ALL'
  private static boolean searchedCaseExpression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "searchedCaseExpression_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, "DISTINCT");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  /* ********************************************************** */
  // stringSelect [ 'ALL' | 'DISTINCT' ] ( '*' | ( selectSublist ( COMMA selectSublist)* ) )
  public static boolean selectClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_CLAUSE, "<select clause>");
    r = stringSelect(b, l + 1);
    r = r && selectClause_1(b, l + 1);
    r = r && selectClause_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'ALL' | 'DISTINCT' ]
  private static boolean selectClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_1")) return false;
    selectClause_1_0(b, l + 1);
    return true;
  }

  // 'ALL' | 'DISTINCT'
  private static boolean selectClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "DISTINCT");
    return r;
  }

  // '*' | ( selectSublist ( COMMA selectSublist)* )
  private static boolean selectClause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANY);
    if (!r) r = selectClause_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // selectSublist ( COMMA selectSublist)*
  private static boolean selectClause_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectSublist(b, l + 1);
    r = r && selectClause_2_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( COMMA selectSublist)*
  private static boolean selectClause_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_2_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!selectClause_2_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "selectClause_2_1_1", c)) break;
    }
    return true;
  }

  // COMMA selectSublist
  private static boolean selectClause_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && selectSublist(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [tableName'.'] expression [stringAs identifier ]
  public static boolean selectDerivedColumn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectDerivedColumn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_DERIVED_COLUMN, "<select derived column>");
    r = selectDerivedColumn_0(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && selectDerivedColumn_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [tableName'.']
  private static boolean selectDerivedColumn_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectDerivedColumn_0")) return false;
    selectDerivedColumn_0_0(b, l + 1);
    return true;
  }

  // tableName'.'
  private static boolean selectDerivedColumn_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectDerivedColumn_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [stringAs identifier ]
  private static boolean selectDerivedColumn_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectDerivedColumn_2")) return false;
    selectDerivedColumn_2_0(b, l + 1);
    return true;
  }

  // stringAs identifier
  private static boolean selectDerivedColumn_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectDerivedColumn_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringAs(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // selectV2 SEMI_COLON | selectWithoutFrom SEMI_COLON
  public static boolean selectStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_STATEMENT, "<select statement>");
    r = selectStatement_0(b, l + 1);
    if (!r) r = selectStatement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // selectV2 SEMI_COLON
  private static boolean selectStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectV2(b, l + 1);
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // selectWithoutFrom SEMI_COLON
  private static boolean selectStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectWithoutFrom(b, l + 1);
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // selectDerivedColumn | allInGroup
  public static boolean selectSublist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectSublist")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_SUBLIST, "<select sublist>");
    r = selectDerivedColumn(b, l + 1);
    if (!r) r = allInGroup(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // selectClause [intoClause] [fromClause [whereClause] [orderByClause] [groupByClause] [havingClause] [limitClause] ]
  public static boolean selectV2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_V_2, "<select v 2>");
    r = selectClause(b, l + 1);
    r = r && selectV2_1(b, l + 1);
    r = r && selectV2_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [intoClause]
  private static boolean selectV2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_1")) return false;
    intoClause(b, l + 1);
    return true;
  }

  // [fromClause [whereClause] [orderByClause] [groupByClause] [havingClause] [limitClause] ]
  private static boolean selectV2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2")) return false;
    selectV2_2_0(b, l + 1);
    return true;
  }

  // fromClause [whereClause] [orderByClause] [groupByClause] [havingClause] [limitClause]
  private static boolean selectV2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fromClause(b, l + 1);
    r = r && selectV2_2_0_1(b, l + 1);
    r = r && selectV2_2_0_2(b, l + 1);
    r = r && selectV2_2_0_3(b, l + 1);
    r = r && selectV2_2_0_4(b, l + 1);
    r = r && selectV2_2_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [whereClause]
  private static boolean selectV2_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2_0_1")) return false;
    whereClause(b, l + 1);
    return true;
  }

  // [orderByClause]
  private static boolean selectV2_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2_0_2")) return false;
    orderByClause(b, l + 1);
    return true;
  }

  // [groupByClause]
  private static boolean selectV2_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2_0_3")) return false;
    groupByClause(b, l + 1);
    return true;
  }

  // [havingClause]
  private static boolean selectV2_2_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2_0_4")) return false;
    havingClause(b, l + 1);
    return true;
  }

  // [limitClause]
  private static boolean selectV2_2_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectV2_2_0_5")) return false;
    limitClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // stringSelect [ 'ALL' | 'DISTINCT' ]
  //     { '*' | selectSublist [COMMA selectSublist ] '*' }
  public static boolean selectWithoutFrom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_WITHOUT_FROM, "<select without from>");
    r = stringSelect(b, l + 1);
    r = r && selectWithoutFrom_1(b, l + 1);
    r = r && selectWithoutFrom_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'ALL' | 'DISTINCT' ]
  private static boolean selectWithoutFrom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom_1")) return false;
    selectWithoutFrom_1_0(b, l + 1);
    return true;
  }

  // 'ALL' | 'DISTINCT'
  private static boolean selectWithoutFrom_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ALL");
    if (!r) r = consumeToken(b, "DISTINCT");
    return r;
  }

  // '*' | selectSublist [COMMA selectSublist ] '*'
  private static boolean selectWithoutFrom_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANY);
    if (!r) r = selectWithoutFrom_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // selectSublist [COMMA selectSublist ] '*'
  private static boolean selectWithoutFrom_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectSublist(b, l + 1);
    r = r && selectWithoutFrom_2_1_1(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA selectSublist ]
  private static boolean selectWithoutFrom_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom_2_1_1")) return false;
    selectWithoutFrom_2_1_1_0(b, l + 1);
    return true;
  }

  // COMMA selectSublist
  private static boolean selectWithoutFrom_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectWithoutFrom_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && selectSublist(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SEMI_COLON
  public static boolean semicolon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semicolon")) return false;
    if (!nextTokenIs(b, SEMI_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI_COLON);
    exit_section_(b, m, SEMICOLON, r);
    return r;
  }

  /* ********************************************************** */
  // identifier eq expression ( COMMA identifier eq expression)*
  public static boolean setClauseList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setClauseList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SET_CLAUSE_LIST, "<set clause list>");
    r = identifier(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && expression(b, l + 1);
    r = r && setClauseList_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( COMMA identifier eq expression)*
  private static boolean setClauseList_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setClauseList_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!setClauseList_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "setClauseList_3", c)) break;
    }
    return true;
  }

  // COMMA identifier eq expression
  private static boolean setClauseList_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "setClauseList_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    r = r && eq(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'SHOW' 'JARS' SEMI_COLON
  public static boolean showJar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "showJar")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHOW_JAR, "<show jar>");
    r = consumeToken(b, "SHOW");
    r = r && consumeToken(b, "JARS");
    r = r && consumeToken(b, SEMI_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('VARCHAR' [ LEFT_BRACKET NUMBER RIGHT_BRACKET] )
  //                    | 'BOOLEAN'
  //                    | 'BYTE'
  //                    | 'TINYINT'
  //                    | 'INT'
  //                    | 'SHORT'
  //                    | 'SMALLINT'
  //                    | 'STRING'
  //                    | ('CHAR' [ LEFT_BRACKET NUMBER RIGHT_BRACKET ])
  //                    | 'INTEGER'
  //                    | 'LONG'
  //                    | 'BIGINT'
  //                    | ('BIGINTEGER' [LEFT_BRACKET NUMBER RIGHT_BRACKET ])
  //                    | 'FLOAT'
  //                    | 'REAL'
  //                    | 'DOUBLE'
  //                    | ( 'BIGDECIMAL' [LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET] )
  //                    | ( 'DECIMAL' [ LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET ] )
  //                    | 'DATE'
  //                    // TIME LEFT_BRACKET NUMBER RIGHT_BRACKET
  //                    | ('TIME'  LEFT_BRACKET NUMBER RIGHT_BRACKET)
  //                    | ('TIMESTAMP' [LEFT_BRACKET NUMBER RIGHT_BRACKET])
  //                    | ('OBJECT' [LEFT_BRACKET NUMBER RIGHT_BRACKET] )
  //                    | ('BLOB'  [LEFT_BRACKET NUMBER RIGHT_BRACKET] )
  //                    | ('CLOB' [LEFT_BRACKET NUMBER RIGHT_BRACKET] )
  //                    | ('VARBINARY' [LEFT_BRACKET NUMBER RIGHT_BRACKET] )
  //                    | 'GEOMETRY'
  //                    | 'XML'
  public static boolean simpleDataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_DATA_TYPE, "<simple data type>");
    r = simpleDataType_0(b, l + 1);
    if (!r) r = consumeToken(b, "BOOLEAN");
    if (!r) r = consumeToken(b, "BYTE");
    if (!r) r = consumeToken(b, "TINYINT");
    if (!r) r = consumeToken(b, "INT");
    if (!r) r = consumeToken(b, "SHORT");
    if (!r) r = consumeToken(b, "SMALLINT");
    if (!r) r = consumeToken(b, "STRING");
    if (!r) r = simpleDataType_8(b, l + 1);
    if (!r) r = consumeToken(b, "INTEGER");
    if (!r) r = consumeToken(b, "LONG");
    if (!r) r = consumeToken(b, "BIGINT");
    if (!r) r = simpleDataType_12(b, l + 1);
    if (!r) r = consumeToken(b, "FLOAT");
    if (!r) r = consumeToken(b, "REAL");
    if (!r) r = consumeToken(b, "DOUBLE");
    if (!r) r = simpleDataType_16(b, l + 1);
    if (!r) r = simpleDataType_17(b, l + 1);
    if (!r) r = consumeToken(b, "DATE");
    if (!r) r = simpleDataType_19(b, l + 1);
    if (!r) r = simpleDataType_20(b, l + 1);
    if (!r) r = simpleDataType_21(b, l + 1);
    if (!r) r = simpleDataType_22(b, l + 1);
    if (!r) r = simpleDataType_23(b, l + 1);
    if (!r) r = simpleDataType_24(b, l + 1);
    if (!r) r = consumeToken(b, "GEOMETRY");
    if (!r) r = consumeToken(b, "XML");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'VARCHAR' [ LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "VARCHAR");
    r = r && simpleDataType_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_0_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'CHAR' [ LEFT_BRACKET NUMBER RIGHT_BRACKET ]
  private static boolean simpleDataType_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CHAR");
    r = r && simpleDataType_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ LEFT_BRACKET NUMBER RIGHT_BRACKET ]
  private static boolean simpleDataType_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_8_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'BIGINTEGER' [LEFT_BRACKET NUMBER RIGHT_BRACKET ]
  private static boolean simpleDataType_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BIGINTEGER");
    r = r && simpleDataType_12_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER RIGHT_BRACKET ]
  private static boolean simpleDataType_12_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_12_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'BIGDECIMAL' [LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET]
  private static boolean simpleDataType_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BIGDECIMAL");
    r = r && simpleDataType_16_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET]
  private static boolean simpleDataType_16_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_16_1")) return false;
    simpleDataType_16_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET
  private static boolean simpleDataType_16_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_16_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, NUMBER);
    r = r && simpleDataType_16_1_0_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA NUMBER]
  private static boolean simpleDataType_16_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_16_1_0_2")) return false;
    parseTokens(b, 0, COMMA, NUMBER);
    return true;
  }

  // 'DECIMAL' [ LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET ]
  private static boolean simpleDataType_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DECIMAL");
    r = r && simpleDataType_17_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET ]
  private static boolean simpleDataType_17_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_17_1")) return false;
    simpleDataType_17_1_0(b, l + 1);
    return true;
  }

  // LEFT_BRACKET NUMBER [COMMA NUMBER] RIGHT_BRACKET
  private static boolean simpleDataType_17_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_17_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LEFT_BRACKET, NUMBER);
    r = r && simpleDataType_17_1_0_2(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA NUMBER]
  private static boolean simpleDataType_17_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_17_1_0_2")) return false;
    parseTokens(b, 0, COMMA, NUMBER);
    return true;
  }

  // 'TIME'  LEFT_BRACKET NUMBER RIGHT_BRACKET
  private static boolean simpleDataType_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TIME");
    r = r && consumeTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'TIMESTAMP' [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "TIMESTAMP");
    r = r && simpleDataType_20_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_20_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_20_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'OBJECT' [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_21(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_21")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "OBJECT");
    r = r && simpleDataType_21_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_21_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_21_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'BLOB'  [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_22(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_22")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "BLOB");
    r = r && simpleDataType_22_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_22_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_22_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'CLOB' [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_23(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_23")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CLOB");
    r = r && simpleDataType_23_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_23_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_23_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  // 'VARBINARY' [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_24(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_24")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "VARBINARY");
    r = r && simpleDataType_24_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [LEFT_BRACKET NUMBER RIGHT_BRACKET]
  private static boolean simpleDataType_24_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simpleDataType_24_1")) return false;
    parseTokens(b, 0, LEFT_BRACKET, NUMBER, RIGHT_BRACKET);
    return true;
  }

  /* ********************************************************** */
  // expression
  public static boolean sortKey(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortKey")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SORT_KEY, "<sort key>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sortKey ['ASC' | 'DESC'] [ 'NULLS' ( 'FIRST' | 'LAST' ) ]
  public static boolean sortSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SORT_SPECIFICATION, "<sort specification>");
    r = sortKey(b, l + 1);
    r = r && sortSpecification_1(b, l + 1);
    r = r && sortSpecification_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['ASC' | 'DESC']
  private static boolean sortSpecification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification_1")) return false;
    sortSpecification_1_0(b, l + 1);
    return true;
  }

  // 'ASC' | 'DESC'
  private static boolean sortSpecification_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification_1_0")) return false;
    boolean r;
    r = consumeToken(b, "ASC");
    if (!r) r = consumeToken(b, "DESC");
    return r;
  }

  // [ 'NULLS' ( 'FIRST' | 'LAST' ) ]
  private static boolean sortSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification_2")) return false;
    sortSpecification_2_0(b, l + 1);
    return true;
  }

  // 'NULLS' ( 'FIRST' | 'LAST' )
  private static boolean sortSpecification_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "NULLS");
    r = r && sortSpecification_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'FIRST' | 'LAST'
  private static boolean sortSpecification_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification_2_0_1")) return false;
    boolean r;
    r = consumeToken(b, "FIRST");
    if (!r) r = consumeToken(b, "LAST");
    return r;
  }

  /* ********************************************************** */
  // [baseString COMMA][baseString COMMA]baseString
  public static boolean sourceTable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sourceTable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SOURCE_TABLE, "<source table>");
    r = sourceTable_0(b, l + 1);
    r = r && sourceTable_1(b, l + 1);
    r = r && baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [baseString COMMA]
  private static boolean sourceTable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sourceTable_0")) return false;
    sourceTable_0_0(b, l + 1);
    return true;
  }

  // baseString COMMA
  private static boolean sourceTable_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sourceTable_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = baseString(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // [baseString COMMA]
  private static boolean sourceTable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sourceTable_1")) return false;
    sourceTable_1_0(b, l + 1);
    return true;
  }

  // baseString COMMA
  private static boolean sourceTable_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sourceTable_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = baseString(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '`'( HYPHEN | UNDERSCORE | rawString ) * '`'
  public static boolean specialColumnName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specialColumnName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIAL_COLUMN_NAME, "<special column name>");
    r = consumeToken(b, "`");
    r = r && specialColumnName_1(b, l + 1);
    r = r && consumeToken(b, "`");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( HYPHEN | UNDERSCORE | rawString ) *
  private static boolean specialColumnName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specialColumnName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!specialColumnName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "specialColumnName_1", c)) break;
    }
    return true;
  }

  // HYPHEN | UNDERSCORE | rawString
  private static boolean specialColumnName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specialColumnName_1_0")) return false;
    boolean r;
    r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = rawString(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'SQLEXCEPTION' commonValueExpression ['SQLSTATE' commonValueExpression [COMMA commonValueExpression]] ['CHAIN' exceptionReference]
  public static boolean sqlException(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_EXCEPTION, "<sql exception>");
    r = consumeToken(b, "SQLEXCEPTION");
    r = r && commonValueExpression(b, l + 1);
    r = r && sqlException_2(b, l + 1);
    r = r && sqlException_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['SQLSTATE' commonValueExpression [COMMA commonValueExpression]]
  private static boolean sqlException_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException_2")) return false;
    sqlException_2_0(b, l + 1);
    return true;
  }

  // 'SQLSTATE' commonValueExpression [COMMA commonValueExpression]
  private static boolean sqlException_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SQLSTATE");
    r = r && commonValueExpression(b, l + 1);
    r = r && sqlException_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA commonValueExpression]
  private static boolean sqlException_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException_2_0_2")) return false;
    sqlException_2_0_2_0(b, l + 1);
    return true;
  }

  // COMMA commonValueExpression
  private static boolean sqlException_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && commonValueExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['CHAIN' exceptionReference]
  private static boolean sqlException_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException_3")) return false;
    sqlException_3_0(b, l + 1);
    return true;
  }

  // 'CHAIN' exceptionReference
  private static boolean sqlException_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlException_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CHAIN");
    r = r && exceptionReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( 'COUNT' LEFT_BRACKET '*' RIGHT_BRACKET )
  //                               | ( ( 'COUNT' | 'SUM' | 'AVG' | 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP' | 'VAR_SAMP' | 'VAR_POP' | 'SOME' | 'ANY' )
  //                                     LEFT_BRACKET ['DISTINCT' | 'ALL'] expressionList RIGHT_BRACKET )
  public static boolean standardAggregateFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardAggregateFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STANDARD_AGGREGATE_FUNCTION, "<standard aggregate function>");
    r = standardAggregateFunction_0(b, l + 1);
    if (!r) r = standardAggregateFunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'COUNT' LEFT_BRACKET '*' RIGHT_BRACKET
  private static boolean standardAggregateFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardAggregateFunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COUNT");
    r = r && consumeTokens(b, 0, LEFT_BRACKET, ANY, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( 'COUNT' | 'SUM' | 'AVG' | 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP' | 'VAR_SAMP' | 'VAR_POP' | 'SOME' | 'ANY' )
  //                                     LEFT_BRACKET ['DISTINCT' | 'ALL'] expressionList RIGHT_BRACKET
  private static boolean standardAggregateFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardAggregateFunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = standardAggregateFunction_1_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && standardAggregateFunction_1_2(b, l + 1);
    r = r && expressionList(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'COUNT' | 'SUM' | 'AVG' | 'MIN' | 'MAX' | 'EVERY' | 'STDDEV_POP' | 'STDDEV_SAMP' | 'VAR_SAMP' | 'VAR_POP' | 'SOME' | 'ANY'
  private static boolean standardAggregateFunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardAggregateFunction_1_0")) return false;
    boolean r;
    r = consumeToken(b, "COUNT");
    if (!r) r = consumeToken(b, "SUM");
    if (!r) r = consumeToken(b, "AVG");
    if (!r) r = consumeToken(b, "MIN");
    if (!r) r = consumeToken(b, "MAX");
    if (!r) r = consumeToken(b, "EVERY");
    if (!r) r = consumeToken(b, "STDDEV_POP");
    if (!r) r = consumeToken(b, "STDDEV_SAMP");
    if (!r) r = consumeToken(b, "VAR_SAMP");
    if (!r) r = consumeToken(b, "VAR_POP");
    if (!r) r = consumeToken(b, "SOME");
    if (!r) r = consumeToken(b, "ANY");
    return r;
  }

  // ['DISTINCT' | 'ALL']
  private static boolean standardAggregateFunction_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardAggregateFunction_1_2")) return false;
    standardAggregateFunction_1_2_0(b, l + 1);
    return true;
  }

  // 'DISTINCT' | 'ALL'
  private static boolean standardAggregateFunction_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "standardAggregateFunction_1_2_0")) return false;
    boolean r;
    r = consumeToken(b, "DISTINCT");
    if (!r) r = consumeToken(b, "ALL");
    return r;
  }

  /* ********************************************************** */
  // ([identifier COLON] (loopStatement | whileStatement |compoundStatement)) | ( ifStatement | delimitedStatement )
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_0(b, l + 1);
    if (!r) r = statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [identifier COLON] (loopStatement | whileStatement |compoundStatement)
  private static boolean statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_0_0(b, l + 1);
    r = r && statement_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [identifier COLON]
  private static boolean statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0")) return false;
    statement_0_0_0(b, l + 1);
    return true;
  }

  // identifier COLON
  private static boolean statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // loopStatement | whileStatement |compoundStatement
  private static boolean statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_0_1")) return false;
    boolean r;
    r = loopStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = compoundStatement(b, l + 1);
    return r;
  }

  // ifStatement | delimitedStatement
  private static boolean statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_1")) return false;
    boolean r;
    r = ifStatement(b, l + 1);
    if (!r) r = delimitedStatement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SINGLE_QUOTATION baseString SINGLE_QUOTATION
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIs(b, SINGLE_QUOTATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SINGLE_QUOTATION);
    r = r && baseString(b, l + 1);
    r = r && consumeToken(b, SINGLE_QUOTATION);
    exit_section_(b, m, STRING, r);
    return r;
  }

  /* ********************************************************** */
  // 'as' | 'AS'
  public static boolean stringAs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringAs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_AS, "<string as>");
    r = consumeToken(b, "as");
    if (!r) r = consumeToken(b, "AS");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'by' | 'BY'
  public static boolean stringBy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringBy")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_BY, "<string by>");
    r = consumeToken(b, "by");
    if (!r) r = consumeToken(b, "BY");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'case'| 'CASE'
  public static boolean stringCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringCase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_CASE, "<string case>");
    r = consumeToken(b, "case");
    if (!r) r = consumeToken(b, "CASE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'create' | 'CREATE'
  public static boolean stringCreate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringCreate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_CREATE, "<string create>");
    r = consumeToken(b, "create");
    if (!r) r = consumeToken(b, "CREATE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'else' | 'ELSE'
  public static boolean stringElse(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringElse")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_ELSE, "<string else>");
    r = consumeToken(b, "else");
    if (!r) r = consumeToken(b, "ELSE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'end' | 'END'
  public static boolean stringEnd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringEnd")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_END, "<string end>");
    r = consumeToken(b, "end");
    if (!r) r = consumeToken(b, "END");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'from' | 'FROM'
  public static boolean stringFrom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringFrom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_FROM, "<string from>");
    r = consumeToken(b, "from");
    if (!r) r = consumeToken(b, "FROM");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'group' | 'GROUP'
  public static boolean stringGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringGroup")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_GROUP, "<string group>");
    r = consumeToken(b, "group");
    if (!r) r = consumeToken(b, "GROUP");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'INSERT' | 'insert'
  public static boolean stringInsert(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringInsert")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_INSERT, "<string insert>");
    r = consumeToken(b, "INSERT");
    if (!r) r = consumeToken(b, "insert");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'INTO' | 'into'
  public static boolean stringInto(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringInto")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_INTO, "<string into>");
    r = consumeToken(b, "INTO");
    if (!r) r = consumeToken(b, "into");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'like' | 'LIKE'
  public static boolean stringLike(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringLike")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LIKE, "<string like>");
    r = consumeToken(b, "like");
    if (!r) r = consumeToken(b, "LIKE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'limit' | 'LIMIT'
  public static boolean stringLimit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringLimit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LIMIT, "<string limit>");
    r = consumeToken(b, "limit");
    if (!r) r = consumeToken(b, "LIMIT");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'not' | 'NOT'
  public static boolean stringNot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringNot")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_NOT, "<string not>");
    r = consumeToken(b, "not");
    if (!r) r = consumeToken(b, "NOT");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'order' | 'ORDER'
  public static boolean stringOrder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringOrder")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_ORDER, "<string order>");
    r = consumeToken(b, "order");
    if (!r) r = consumeToken(b, "ORDER");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'select' | 'SELECT'
  public static boolean stringSelect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringSelect")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_SELECT, "<string select>");
    r = consumeToken(b, "select");
    if (!r) r = consumeToken(b, "SELECT");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'table' | 'TABLE'
  public static boolean stringTable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringTable")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_TABLE, "<string table>");
    r = consumeToken(b, "table");
    if (!r) r = consumeToken(b, "TABLE");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'then' | 'THEN'
  public static boolean stringThen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringThen")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_THEN, "<string then>");
    r = consumeToken(b, "then");
    if (!r) r = consumeToken(b, "THEN");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'when' | 'WHEN'
  public static boolean stringWhen(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringWhen")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_WHEN, "<string when>");
    r = consumeToken(b, "when");
    if (!r) r = consumeToken(b, "WHEN");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // query
  public static boolean subQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subQuery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUB_QUERY, "<sub query>");
    r = query(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'FOR' 'SYSTEM_TIME' stringAs 'OF' catalogName PERIOD tableNameV2 [stringAs baseString] condition
  public static boolean systemTimePeriod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "systemTimePeriod")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYSTEM_TIME_PERIOD, "<system time period>");
    r = consumeToken(b, "FOR");
    r = r && consumeToken(b, "SYSTEM_TIME");
    r = r && stringAs(b, l + 1);
    r = r && consumeToken(b, "OF");
    r = r && catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && tableNameV2(b, l + 1);
    r = r && systemTimePeriod_7(b, l + 1);
    r = r && condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [stringAs baseString]
  private static boolean systemTimePeriod_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "systemTimePeriod_7")) return false;
    systemTimePeriod_7_0(b, l + 1);
    return true;
  }

  // stringAs baseString
  private static boolean systemTimePeriod_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "systemTimePeriod_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringAs(b, l + 1);
    r = r && baseString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ['CONSTRAINTS' columnName] 'PRIMARY KEY' '(' columnName (COMMA columnName)* ')' [stringNot] 'ENFORCED'
  public static boolean tableConstraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableConstraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_CONSTRAINT, "<table constraint>");
    r = tableConstraint_0(b, l + 1);
    r = r && consumeToken(b, "PRIMARY KEY");
    r = r && consumeToken(b, "(");
    r = r && columnName(b, l + 1);
    r = r && tableConstraint_4(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && tableConstraint_6(b, l + 1);
    r = r && consumeToken(b, "ENFORCED");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['CONSTRAINTS' columnName]
  private static boolean tableConstraint_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableConstraint_0")) return false;
    tableConstraint_0_0(b, l + 1);
    return true;
  }

  // 'CONSTRAINTS' columnName
  private static boolean tableConstraint_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableConstraint_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "CONSTRAINTS");
    r = r && columnName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA columnName)*
  private static boolean tableConstraint_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableConstraint_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tableConstraint_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tableConstraint_4", c)) break;
    }
    return true;
  }

  // COMMA columnName
  private static boolean tableConstraint_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableConstraint_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && columnName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [stringNot]
  private static boolean tableConstraint_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableConstraint_6")) return false;
    stringNot(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tableName
  //    | tableReference [COMMA tableReference ]'*'
  //    | tableExpression2 [ 'NATURAL' ] [ 'LEFT' | 'RIGHT' | 'FULL' ] 'JOIN'  ['FOR SYSTEM_TIME AS OF'] tableExpression2 [ joinCondition ]
  //    | baseString
  public static boolean tableExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_EXPRESSION, "<table expression>");
    r = tableName(b, l + 1);
    if (!r) r = tableExpression_1(b, l + 1);
    if (!r) r = tableExpression_2(b, l + 1);
    if (!r) r = baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tableReference [COMMA tableReference ]'*'
  private static boolean tableExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableReference(b, l + 1);
    r = r && tableExpression_1_1(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA tableReference ]
  private static boolean tableExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_1_1")) return false;
    tableExpression_1_1_0(b, l + 1);
    return true;
  }

  // COMMA tableReference
  private static boolean tableExpression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tableExpression2 [ 'NATURAL' ] [ 'LEFT' | 'RIGHT' | 'FULL' ] 'JOIN'  ['FOR SYSTEM_TIME AS OF'] tableExpression2 [ joinCondition ]
  private static boolean tableExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableExpression2(b, l + 1);
    r = r && tableExpression_2_1(b, l + 1);
    r = r && tableExpression_2_2(b, l + 1);
    r = r && consumeToken(b, "JOIN");
    r = r && tableExpression_2_4(b, l + 1);
    r = r && tableExpression2(b, l + 1);
    r = r && tableExpression_2_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'NATURAL' ]
  private static boolean tableExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_2_1")) return false;
    consumeToken(b, "NATURAL");
    return true;
  }

  // [ 'LEFT' | 'RIGHT' | 'FULL' ]
  private static boolean tableExpression_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_2_2")) return false;
    tableExpression_2_2_0(b, l + 1);
    return true;
  }

  // 'LEFT' | 'RIGHT' | 'FULL'
  private static boolean tableExpression_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_2_2_0")) return false;
    boolean r;
    r = consumeToken(b, "LEFT");
    if (!r) r = consumeToken(b, "RIGHT");
    if (!r) r = consumeToken(b, "FULL");
    return r;
  }

  // ['FOR SYSTEM_TIME AS OF']
  private static boolean tableExpression_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_2_4")) return false;
    consumeToken(b, "FOR SYSTEM_TIME AS OF");
    return true;
  }

  // [ joinCondition ]
  private static boolean tableExpression_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression_2_6")) return false;
    joinCondition(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tableName
  //   | tableReference [COMMA tableReference ]'*'
  //   | [ 'NATURAL' ] [ 'LEFT' | 'RIGHT' | 'FULL' ] 'JOIN'  ['FOR'] ['SYSTEM_TIME AS OF'] tableExpression2 [ joinCondition ]
  //   | baseString
  //   | ε
  public static boolean tableExpression2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_EXPRESSION_2, "<table expression 2>");
    r = tableName(b, l + 1);
    if (!r) r = tableExpression2_1(b, l + 1);
    if (!r) r = tableExpression2_2(b, l + 1);
    if (!r) r = baseString(b, l + 1);
    if (!r) r = consumeToken(b, Ε);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tableReference [COMMA tableReference ]'*'
  private static boolean tableExpression2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableReference(b, l + 1);
    r = r && tableExpression2_1_1(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA tableReference ]
  private static boolean tableExpression2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_1_1")) return false;
    tableExpression2_1_1_0(b, l + 1);
    return true;
  }

  // COMMA tableReference
  private static boolean tableExpression2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && tableReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'NATURAL' ] [ 'LEFT' | 'RIGHT' | 'FULL' ] 'JOIN'  ['FOR'] ['SYSTEM_TIME AS OF'] tableExpression2 [ joinCondition ]
  private static boolean tableExpression2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableExpression2_2_0(b, l + 1);
    r = r && tableExpression2_2_1(b, l + 1);
    r = r && consumeToken(b, "JOIN");
    r = r && tableExpression2_2_3(b, l + 1);
    r = r && tableExpression2_2_4(b, l + 1);
    r = r && tableExpression2(b, l + 1);
    r = r && tableExpression2_2_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'NATURAL' ]
  private static boolean tableExpression2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2_0")) return false;
    consumeToken(b, "NATURAL");
    return true;
  }

  // [ 'LEFT' | 'RIGHT' | 'FULL' ]
  private static boolean tableExpression2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2_1")) return false;
    tableExpression2_2_1_0(b, l + 1);
    return true;
  }

  // 'LEFT' | 'RIGHT' | 'FULL'
  private static boolean tableExpression2_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2_1_0")) return false;
    boolean r;
    r = consumeToken(b, "LEFT");
    if (!r) r = consumeToken(b, "RIGHT");
    if (!r) r = consumeToken(b, "FULL");
    return r;
  }

  // ['FOR']
  private static boolean tableExpression2_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2_3")) return false;
    consumeToken(b, "FOR");
    return true;
  }

  // ['SYSTEM_TIME AS OF']
  private static boolean tableExpression2_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2_4")) return false;
    consumeToken(b, "SYSTEM_TIME AS OF");
    return true;
  }

  // [ joinCondition ]
  private static boolean tableExpression2_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableExpression2_2_6")) return false;
    joinCondition(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( HYPHEN | UNDERSCORE | baseString | envVar)*
  public static boolean tableName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableName")) return false;
    Marker m = enter_section_(b, l, _NONE_, TABLE_NAME, "<table name>");
    while (true) {
      int c = current_position_(b);
      if (!tableName_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tableName", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // HYPHEN | UNDERSCORE | baseString | envVar
  private static boolean tableName_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableName_0")) return false;
    boolean r;
    r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = baseString(b, l + 1);
    if (!r) r = envVar(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // identifier ( [stringAs] identifier )?
  public static boolean tableNameV2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableNameV2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_NAME_V_2, "<table name v 2>");
    r = identifier(b, l + 1);
    r = r && tableNameV2_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( [stringAs] identifier )?
  private static boolean tableNameV2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableNameV2_1")) return false;
    tableNameV2_1_0(b, l + 1);
    return true;
  }

  // [stringAs] identifier
  private static boolean tableNameV2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableNameV2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableNameV2_1_0_0(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [stringAs]
  private static boolean tableNameV2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableNameV2_1_0_0")) return false;
    stringAs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ [ catalogName PERIOD ] dbName PERIOD ] tableName
  public static boolean tablePath(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePath")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_PATH, "<table path>");
    r = tablePath_0(b, l + 1);
    r = r && tableName(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ [ catalogName PERIOD ] dbName PERIOD ]
  private static boolean tablePath_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePath_0")) return false;
    tablePath_0_0(b, l + 1);
    return true;
  }

  // [ catalogName PERIOD ] dbName PERIOD
  private static boolean tablePath_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePath_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tablePath_0_0_0(b, l + 1);
    r = r && dbName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ catalogName PERIOD ]
  private static boolean tablePath_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePath_0_0_0")) return false;
    tablePath_0_0_0_0(b, l + 1);
    return true;
  }

  // catalogName PERIOD
  private static boolean tablePath_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePath_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catalogName(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ 'TABLE' ] tablePath [ dynamicTableOptions ] [systemTimePeriod] [[stringAs] baseString]
  //   | 'LATERAL' 'TABLE' '(' baseString '(' expression [COMMA expression ]ANY ')' ')'
  //   | [ 'LATERAL' ] '(' query ')'
  //   | 'UNNSET' '(' expression ')'
  public static boolean tablePrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_PRIMARY, "<table primary>");
    r = tablePrimary_0(b, l + 1);
    if (!r) r = tablePrimary_1(b, l + 1);
    if (!r) r = tablePrimary_2(b, l + 1);
    if (!r) r = tablePrimary_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'TABLE' ] tablePath [ dynamicTableOptions ] [systemTimePeriod] [[stringAs] baseString]
  private static boolean tablePrimary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tablePrimary_0_0(b, l + 1);
    r = r && tablePath(b, l + 1);
    r = r && tablePrimary_0_2(b, l + 1);
    r = r && tablePrimary_0_3(b, l + 1);
    r = r && tablePrimary_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'TABLE' ]
  private static boolean tablePrimary_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0_0")) return false;
    consumeToken(b, "TABLE");
    return true;
  }

  // [ dynamicTableOptions ]
  private static boolean tablePrimary_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0_2")) return false;
    dynamicTableOptions(b, l + 1);
    return true;
  }

  // [systemTimePeriod]
  private static boolean tablePrimary_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0_3")) return false;
    systemTimePeriod(b, l + 1);
    return true;
  }

  // [[stringAs] baseString]
  private static boolean tablePrimary_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0_4")) return false;
    tablePrimary_0_4_0(b, l + 1);
    return true;
  }

  // [stringAs] baseString
  private static boolean tablePrimary_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tablePrimary_0_4_0_0(b, l + 1);
    r = r && baseString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [stringAs]
  private static boolean tablePrimary_0_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_0_4_0_0")) return false;
    stringAs(b, l + 1);
    return true;
  }

  // 'LATERAL' 'TABLE' '(' baseString '(' expression [COMMA expression ]ANY ')' ')'
  private static boolean tablePrimary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "LATERAL");
    r = r && consumeToken(b, "TABLE");
    r = r && consumeToken(b, "(");
    r = r && baseString(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && tablePrimary_1_6(b, l + 1);
    r = r && consumeToken(b, ANY);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA expression ]
  private static boolean tablePrimary_1_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_1_6")) return false;
    tablePrimary_1_6_0(b, l + 1);
    return true;
  }

  // COMMA expression
  private static boolean tablePrimary_1_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_1_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LATERAL' ] '(' query ')'
  private static boolean tablePrimary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tablePrimary_2_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && query(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'LATERAL' ]
  private static boolean tablePrimary_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_2_0")) return false;
    consumeToken(b, "LATERAL");
    return true;
  }

  // 'UNNSET' '(' expression ')'
  private static boolean tablePrimary_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimary_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "UNNSET");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (  tableNameV2 | tableSubQuery | ( ['('] joinedTable [')'] ) ) [ ( 'MAKEDEP' makeDepOptions ) | 'MAKENOTDEP' ] [ ( 'MAKEIND' makeDepOptions ) ]
  public static boolean tablePrimaryV2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_PRIMARY_V_2, "<table primary v 2>");
    r = tablePrimaryV2_0(b, l + 1);
    r = r && tablePrimaryV2_1(b, l + 1);
    r = r && tablePrimaryV2_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tableNameV2 | tableSubQuery | ( ['('] joinedTable [')'] )
  private static boolean tablePrimaryV2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableNameV2(b, l + 1);
    if (!r) r = tableSubQuery(b, l + 1);
    if (!r) r = tablePrimaryV2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['('] joinedTable [')']
  private static boolean tablePrimaryV2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tablePrimaryV2_0_2_0(b, l + 1);
    r = r && joinedTable(b, l + 1);
    r = r && tablePrimaryV2_0_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['(']
  private static boolean tablePrimaryV2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_0_2_0")) return false;
    consumeToken(b, "(");
    return true;
  }

  // [')']
  private static boolean tablePrimaryV2_0_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_0_2_2")) return false;
    consumeToken(b, ")");
    return true;
  }

  // [ ( 'MAKEDEP' makeDepOptions ) | 'MAKENOTDEP' ]
  private static boolean tablePrimaryV2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_1")) return false;
    tablePrimaryV2_1_0(b, l + 1);
    return true;
  }

  // ( 'MAKEDEP' makeDepOptions ) | 'MAKENOTDEP'
  private static boolean tablePrimaryV2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tablePrimaryV2_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, "MAKENOTDEP");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'MAKEDEP' makeDepOptions
  private static boolean tablePrimaryV2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAKEDEP");
    r = r && makeDepOptions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( 'MAKEIND' makeDepOptions ) ]
  private static boolean tablePrimaryV2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_2")) return false;
    tablePrimaryV2_2_0(b, l + 1);
    return true;
  }

  // 'MAKEIND' makeDepOptions
  private static boolean tablePrimaryV2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tablePrimaryV2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "MAKEIND");
    r = r && makeDepOptions(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tablePrimary
  //     [ matchRecognize ]
  //     [ [ stringAs ] 'ALIAS' [ '(' baseString [COMMA baseString ]ANY ')' ] ]
  public static boolean tableReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_REFERENCE, "<table reference>");
    r = tablePrimary(b, l + 1);
    r = r && tableReference_1(b, l + 1);
    r = r && tableReference_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ matchRecognize ]
  private static boolean tableReference_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_1")) return false;
    matchRecognize(b, l + 1);
    return true;
  }

  // [ [ stringAs ] 'ALIAS' [ '(' baseString [COMMA baseString ]ANY ')' ] ]
  private static boolean tableReference_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2")) return false;
    tableReference_2_0(b, l + 1);
    return true;
  }

  // [ stringAs ] 'ALIAS' [ '(' baseString [COMMA baseString ]ANY ')' ]
  private static boolean tableReference_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tableReference_2_0_0(b, l + 1);
    r = r && consumeToken(b, "ALIAS");
    r = r && tableReference_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ stringAs ]
  private static boolean tableReference_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2_0_0")) return false;
    stringAs(b, l + 1);
    return true;
  }

  // [ '(' baseString [COMMA baseString ]ANY ')' ]
  private static boolean tableReference_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2_0_2")) return false;
    tableReference_2_0_2_0(b, l + 1);
    return true;
  }

  // '(' baseString [COMMA baseString ]ANY ')'
  private static boolean tableReference_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && baseString(b, l + 1);
    r = r && tableReference_2_0_2_0_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA baseString ]
  private static boolean tableReference_2_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2_0_2_0_2")) return false;
    tableReference_2_0_2_0_2_0(b, l + 1);
    return true;
  }

  // COMMA baseString
  private static boolean tableReference_2_0_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReference_2_0_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && baseString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (escapedJoin joinedTable RBRACE ) | joinedTable
  public static boolean tableReferenceV2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReferenceV2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_REFERENCE_V_2, "<table reference v 2>");
    r = tableReferenceV2_0(b, l + 1);
    if (!r) r = joinedTable(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // escapedJoin joinedTable RBRACE
  private static boolean tableReferenceV2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableReferenceV2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = escapedJoin(b, l + 1);
    r = r && joinedTable(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ 'TABLE' | 'LATERAL' ] '(' ( queryExpression| callStatement ) ')' [stringAs] identifier
  public static boolean tableSubQuery(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableSubQuery")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_SUB_QUERY, "<table sub query>");
    r = tableSubQuery_0(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && tableSubQuery_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && tableSubQuery_4(b, l + 1);
    r = r && identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'TABLE' | 'LATERAL' ]
  private static boolean tableSubQuery_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableSubQuery_0")) return false;
    tableSubQuery_0_0(b, l + 1);
    return true;
  }

  // 'TABLE' | 'LATERAL'
  private static boolean tableSubQuery_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableSubQuery_0_0")) return false;
    boolean r;
    r = consumeToken(b, "TABLE");
    if (!r) r = consumeToken(b, "LATERAL");
    return r;
  }

  // queryExpression| callStatement
  private static boolean tableSubQuery_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableSubQuery_2")) return false;
    boolean r;
    r = queryExpression(b, l + 1);
    if (!r) r = callStatement(b, l + 1);
    return r;
  }

  // [stringAs]
  private static boolean tableSubQuery_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tableSubQuery_4")) return false;
    stringAs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // valueExpressionPrimary ( (ANY) valueExpressionPrimary )*
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = valueExpressionPrimary(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( (ANY) valueExpressionPrimary )*
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!term_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "term_1", c)) break;
    }
    return true;
  }

  // (ANY) valueExpressionPrimary
  private static boolean term_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANY);
    r = r && valueExpressionPrimary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEXTAGG [LEFT_BRACKET] [for] derivedColumn ( COMMA derivedColumn)* [ 'DELIMITER' baseString ]  ['QUOTE' [baseString]] ['HEADER'] [ 'ENCODING' identifier ] [orderByClause] [RIGHT_BRACKET]
  public static boolean textAggregateFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction")) return false;
    if (!nextTokenIs(b, TEXTAGG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEXTAGG);
    r = r && textAggregateFunction_1(b, l + 1);
    r = r && textAggregateFunction_2(b, l + 1);
    r = r && derivedColumn(b, l + 1);
    r = r && textAggregateFunction_4(b, l + 1);
    r = r && textAggregateFunction_5(b, l + 1);
    r = r && textAggregateFunction_6(b, l + 1);
    r = r && textAggregateFunction_7(b, l + 1);
    r = r && textAggregateFunction_8(b, l + 1);
    r = r && textAggregateFunction_9(b, l + 1);
    r = r && textAggregateFunction_10(b, l + 1);
    exit_section_(b, m, TEXT_AGGREGATE_FUNCTION, r);
    return r;
  }

  // [LEFT_BRACKET]
  private static boolean textAggregateFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_1")) return false;
    consumeToken(b, LEFT_BRACKET);
    return true;
  }

  // [for]
  private static boolean textAggregateFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_2")) return false;
    for_$(b, l + 1);
    return true;
  }

  // ( COMMA derivedColumn)*
  private static boolean textAggregateFunction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!textAggregateFunction_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "textAggregateFunction_4", c)) break;
    }
    return true;
  }

  // COMMA derivedColumn
  private static boolean textAggregateFunction_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && derivedColumn(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ 'DELIMITER' baseString ]
  private static boolean textAggregateFunction_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_5")) return false;
    textAggregateFunction_5_0(b, l + 1);
    return true;
  }

  // 'DELIMITER' baseString
  private static boolean textAggregateFunction_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "DELIMITER");
    r = r && baseString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['QUOTE' [baseString]]
  private static boolean textAggregateFunction_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_6")) return false;
    textAggregateFunction_6_0(b, l + 1);
    return true;
  }

  // 'QUOTE' [baseString]
  private static boolean textAggregateFunction_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "QUOTE");
    r = r && textAggregateFunction_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [baseString]
  private static boolean textAggregateFunction_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_6_0_1")) return false;
    baseString(b, l + 1);
    return true;
  }

  // ['HEADER']
  private static boolean textAggregateFunction_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_7")) return false;
    consumeToken(b, "HEADER");
    return true;
  }

  // [ 'ENCODING' identifier ]
  private static boolean textAggregateFunction_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_8")) return false;
    textAggregateFunction_8_0(b, l + 1);
    return true;
  }

  // 'ENCODING' identifier
  private static boolean textAggregateFunction_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ENCODING");
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [orderByClause]
  private static boolean textAggregateFunction_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_9")) return false;
    orderByClause(b, l + 1);
    return true;
  }

  // [RIGHT_BRACKET]
  private static boolean textAggregateFunction_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textAggregateFunction_10")) return false;
    consumeToken(b, RIGHT_BRACKET);
    return true;
  }

  /* ********************************************************** */
  // identifier ( ('FOR' 'ORDINALITY') | ( ['HEADER' ENGLISH_STRING] dataType ['WIDTH' unsignedInteger ['NO' 'TRIM']] ['SELECTOR' ENGLISH_STRING unsignedInteger ] ) )
  public static boolean textTableColumn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_TABLE_COLUMN, "<text table column>");
    r = identifier(b, l + 1);
    r = r && textTableColumn_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('FOR' 'ORDINALITY') | ( ['HEADER' ENGLISH_STRING] dataType ['WIDTH' unsignedInteger ['NO' 'TRIM']] ['SELECTOR' ENGLISH_STRING unsignedInteger ] )
  private static boolean textTableColumn_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = textTableColumn_1_0(b, l + 1);
    if (!r) r = textTableColumn_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'FOR' 'ORDINALITY'
  private static boolean textTableColumn_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "FOR");
    r = r && consumeToken(b, "ORDINALITY");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['HEADER' ENGLISH_STRING] dataType ['WIDTH' unsignedInteger ['NO' 'TRIM']] ['SELECTOR' ENGLISH_STRING unsignedInteger ]
  private static boolean textTableColumn_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = textTableColumn_1_1_0(b, l + 1);
    r = r && dataType(b, l + 1);
    r = r && textTableColumn_1_1_2(b, l + 1);
    r = r && textTableColumn_1_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['HEADER' ENGLISH_STRING]
  private static boolean textTableColumn_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_0")) return false;
    textTableColumn_1_1_0_0(b, l + 1);
    return true;
  }

  // 'HEADER' ENGLISH_STRING
  private static boolean textTableColumn_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "HEADER");
    r = r && consumeToken(b, ENGLISH_STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['WIDTH' unsignedInteger ['NO' 'TRIM']]
  private static boolean textTableColumn_1_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_2")) return false;
    textTableColumn_1_1_2_0(b, l + 1);
    return true;
  }

  // 'WIDTH' unsignedInteger ['NO' 'TRIM']
  private static boolean textTableColumn_1_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "WIDTH");
    r = r && unsignedInteger(b, l + 1);
    r = r && textTableColumn_1_1_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['NO' 'TRIM']
  private static boolean textTableColumn_1_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_2_0_2")) return false;
    textTableColumn_1_1_2_0_2_0(b, l + 1);
    return true;
  }

  // 'NO' 'TRIM'
  private static boolean textTableColumn_1_1_2_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_2_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "NO");
    r = r && consumeToken(b, "TRIM");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['SELECTOR' ENGLISH_STRING unsignedInteger ]
  private static boolean textTableColumn_1_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_3")) return false;
    textTableColumn_1_1_3_0(b, l + 1);
    return true;
  }

  // 'SELECTOR' ENGLISH_STRING unsignedInteger
  private static boolean textTableColumn_1_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "textTableColumn_1_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "SELECTOR");
    r = r && consumeToken(b, ENGLISH_STRING);
    r = r && unsignedInteger(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'SQL_TSI_FRAC_SECOND' |'SQL_TSI_SECOND' |'SQL_TSI_MINUTE' |'SQL_TSI_HOUR' |'SQL_TSI_DAY' | 'SQL_TSI_WEEK' |'SQL_TSI_MONTH'|'SQL_TSI_QUARTER' |'SQL_TSI_YEAR' | 'HOUR' | 'DAY'
  public static boolean timeInterval(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "timeInterval")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TIME_INTERVAL, "<time interval>");
    r = consumeToken(b, "SQL_TSI_FRAC_SECOND");
    if (!r) r = consumeToken(b, "SQL_TSI_SECOND");
    if (!r) r = consumeToken(b, "SQL_TSI_MINUTE");
    if (!r) r = consumeToken(b, "SQL_TSI_HOUR");
    if (!r) r = consumeToken(b, "SQL_TSI_DAY");
    if (!r) r = consumeToken(b, "SQL_TSI_WEEK");
    if (!r) r = consumeToken(b, "SQL_TSI_MONTH");
    if (!r) r = consumeToken(b, "SQL_TSI_QUARTER");
    if (!r) r = consumeToken(b, "SQL_TSI_YEAR");
    if (!r) r = consumeToken(b, "HOUR");
    if (!r) r = consumeToken(b, "DAY");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier dataType ( COMMA identifier dataType)*
  public static boolean typedElementList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedElementList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPED_ELEMENT_LIST, "<typed element list>");
    r = identifier(b, l + 1);
    r = r && dataType(b, l + 1);
    r = r && typedElementList_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( COMMA identifier dataType)*
  private static boolean typedElementList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedElementList_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typedElementList_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typedElementList_2", c)) break;
    }
    return true;
  }

  // COMMA identifier dataType
  private static boolean typedElementList_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedElementList_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    r = r && dataType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( textAggregateFunction | standardAggregateFunction | orderedAggregateFunction ) [filterClause] [windowSpecification]
  //                         | ( analyticAggregateFunction [filterClause] windowSpecification )
  //                         | ( function [windowSpecification])
  public static boolean unescapedFunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNESCAPED_FUNCTION, "<unescaped function>");
    r = unescapedFunction_0(b, l + 1);
    if (!r) r = unescapedFunction_1(b, l + 1);
    if (!r) r = unescapedFunction_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( textAggregateFunction | standardAggregateFunction | orderedAggregateFunction ) [filterClause] [windowSpecification]
  private static boolean unescapedFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unescapedFunction_0_0(b, l + 1);
    r = r && unescapedFunction_0_1(b, l + 1);
    r = r && unescapedFunction_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // textAggregateFunction | standardAggregateFunction | orderedAggregateFunction
  private static boolean unescapedFunction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_0_0")) return false;
    boolean r;
    r = textAggregateFunction(b, l + 1);
    if (!r) r = standardAggregateFunction(b, l + 1);
    if (!r) r = orderedAggregateFunction(b, l + 1);
    return r;
  }

  // [filterClause]
  private static boolean unescapedFunction_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_0_1")) return false;
    filterClause(b, l + 1);
    return true;
  }

  // [windowSpecification]
  private static boolean unescapedFunction_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_0_2")) return false;
    windowSpecification(b, l + 1);
    return true;
  }

  // analyticAggregateFunction [filterClause] windowSpecification
  private static boolean unescapedFunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = analyticAggregateFunction(b, l + 1);
    r = r && unescapedFunction_1_1(b, l + 1);
    r = r && windowSpecification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [filterClause]
  private static boolean unescapedFunction_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_1_1")) return false;
    filterClause(b, l + 1);
    return true;
  }

  // function [windowSpecification]
  private static boolean unescapedFunction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function(b, l + 1);
    r = r && unescapedFunction_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [windowSpecification]
  private static boolean unescapedFunction_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unescapedFunction_2_1")) return false;
    windowSpecification(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean unsignedInteger(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsignedInteger")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, UNSIGNED_INTEGER, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean unsignedNumericLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsignedNumericLiteral")) return false;
    if (!nextTokenIs(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    exit_section_(b, m, UNSIGNED_NUMERIC_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // parameterReference
  //                                      | escapedFunction function RBRACE
  //                                      | unescapedFunction
  //                                      | (identifier | nonReservedIdentifier)
  //                                      | queryWithoutSemiColon
  //                                      | nestedExpression
  //                                      | searchedCaseExpression
  //                                      | caseExpression
  public static boolean unsignedValueExpressionPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsignedValueExpressionPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_VALUE_EXPRESSION_PRIMARY, "<unsigned value expression primary>");
    r = parameterReference(b, l + 1);
    if (!r) r = unsignedValueExpressionPrimary_1(b, l + 1);
    if (!r) r = unescapedFunction(b, l + 1);
    if (!r) r = unsignedValueExpressionPrimary_3(b, l + 1);
    if (!r) r = queryWithoutSemiColon(b, l + 1);
    if (!r) r = nestedExpression(b, l + 1);
    if (!r) r = searchedCaseExpression(b, l + 1);
    if (!r) r = caseExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // escapedFunction function RBRACE
  private static boolean unsignedValueExpressionPrimary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsignedValueExpressionPrimary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = escapedFunction(b, l + 1);
    r = r && function(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier | nonReservedIdentifier
  private static boolean unsignedValueExpressionPrimary_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsignedValueExpressionPrimary_3")) return false;
    boolean r;
    r = identifier(b, l + 1);
    if (!r) r = nonReservedIdentifier(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // (COLON | HYPHEN | UNDERSCORE |EQUALS| 'timestamp' | PERIOD | NUMBER | COMMA | SLASH | '\' | '"' | SEMI_COLON |envVar |  selectV2  | baseString|'${' baseString '}')*
  public static boolean val(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "val")) return false;
    Marker m = enter_section_(b, l, _NONE_, VAL, "<val>");
    while (true) {
      int c = current_position_(b);
      if (!val_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "val", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // COLON | HYPHEN | UNDERSCORE |EQUALS| 'timestamp' | PERIOD | NUMBER | COMMA | SLASH | '\' | '"' | SEMI_COLON |envVar |  selectV2  | baseString|'${' baseString '}'
  private static boolean val_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "val_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, HYPHEN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, "timestamp");
    if (!r) r = consumeToken(b, PERIOD);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, "\\");
    if (!r) r = consumeToken(b, "\"");
    if (!r) r = consumeToken(b, SEMI_COLON);
    if (!r) r = envVar(b, l + 1);
    if (!r) r = selectV2(b, l + 1);
    if (!r) r = baseString(b, l + 1);
    if (!r) r = val_0_15(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '${' baseString '}'
  private static boolean val_0_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "val_0_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "${");
    r = r && baseString(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (['+'|'-'] unsignedNumericLiteral | unsignedValueExpressionPrimary ('[' numericValueExpression ']')* ) | nonNumericLiteral
  public static boolean valueExpressionPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_EXPRESSION_PRIMARY, "<value expression primary>");
    r = valueExpressionPrimary_0(b, l + 1);
    if (!r) r = nonNumericLiteral(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ['+'|'-'] unsignedNumericLiteral | unsignedValueExpressionPrimary ('[' numericValueExpression ']')*
  private static boolean valueExpressionPrimary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueExpressionPrimary_0_0(b, l + 1);
    if (!r) r = valueExpressionPrimary_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['+'|'-'] unsignedNumericLiteral
  private static boolean valueExpressionPrimary_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = valueExpressionPrimary_0_0_0(b, l + 1);
    r = r && unsignedNumericLiteral(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['+'|'-']
  private static boolean valueExpressionPrimary_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0_0_0")) return false;
    valueExpressionPrimary_0_0_0_0(b, l + 1);
    return true;
  }

  // '+'|'-'
  private static boolean valueExpressionPrimary_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0_0_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, HYPHEN);
    return r;
  }

  // unsignedValueExpressionPrimary ('[' numericValueExpression ']')*
  private static boolean valueExpressionPrimary_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unsignedValueExpressionPrimary(b, l + 1);
    r = r && valueExpressionPrimary_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('[' numericValueExpression ']')*
  private static boolean valueExpressionPrimary_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valueExpressionPrimary_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valueExpressionPrimary_0_1_1", c)) break;
    }
    return true;
  }

  // '[' numericValueExpression ']'
  private static boolean valueExpressionPrimary_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valueExpressionPrimary_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSBTRACE);
    r = r && numericValueExpression(b, l + 1);
    r = r && consumeToken(b, RSBTRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'VALUES' expression [COMMA expression ]ANY
  public static boolean values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUES, "<values>");
    r = consumeToken(b, "VALUES");
    r = r && expression(b, l + 1);
    r = r && values_2(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [COMMA expression ]
  private static boolean values_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_2")) return false;
    values_2_0(b, l + 1);
    return true;
  }

  // COMMA expression
  private static boolean values_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET [SINGLE_QUOTATION]baseString*[SINGLE_QUOTATION]
  //                    (COMMA baseString)* RIGHT_BRACKET
  public static boolean valuesRow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valuesRow")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && valuesRow_1(b, l + 1);
    r = r && valuesRow_2(b, l + 1);
    r = r && valuesRow_3(b, l + 1);
    r = r && valuesRow_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, VALUES_ROW, r);
    return r;
  }

  // [SINGLE_QUOTATION]
  private static boolean valuesRow_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valuesRow_1")) return false;
    consumeToken(b, SINGLE_QUOTATION);
    return true;
  }

  // baseString*
  private static boolean valuesRow_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valuesRow_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!baseString(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valuesRow_2", c)) break;
    }
    return true;
  }

  // [SINGLE_QUOTATION]
  private static boolean valuesRow_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valuesRow_3")) return false;
    consumeToken(b, SINGLE_QUOTATION);
    return true;
  }

  // (COMMA baseString)*
  private static boolean valuesRow_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valuesRow_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!valuesRow_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "valuesRow_4", c)) break;
    }
    return true;
  }

  // COMMA baseString
  private static boolean valuesRow_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "valuesRow_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && baseString(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'WATERMARK' 'FOR' baseString stringAs watermarkStrategyExpression
  public static boolean watermarkDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "watermarkDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WATERMARK_DEFINITION, "<watermark definition>");
    r = consumeToken(b, "WATERMARK");
    r = r && consumeToken(b, "FOR");
    r = r && baseString(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && watermarkStrategyExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // baseString
  public static boolean watermarkStrategyExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "watermarkStrategyExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WATERMARK_STRATEGY_EXPRESSION, "<watermark strategy expression>");
    r = baseString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'WHERE' condition
  public static boolean whereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHERE_CLAUSE, "<where clause>");
    r = consumeToken(b, "WHERE");
    r = r && condition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier [columnList] stringAs LEFT_BRACKET queryExpression RIGHT_BRACKET
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, "<while statement>");
    r = identifier(b, l + 1);
    r = r && whileStatement_1(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && queryExpression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [columnList]
  private static boolean whileStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement_1")) return false;
    columnList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'OVER' LEFT_BRACKET [ 'PARTITION' 'BY' expressionList][orderByClause] RIGHT_BRACKET
  public static boolean windowSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "windowSpecification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WINDOW_SPECIFICATION, "<window specification>");
    r = consumeToken(b, "OVER");
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && windowSpecification_2(b, l + 1);
    r = r && windowSpecification_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'PARTITION' 'BY' expressionList]
  private static boolean windowSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "windowSpecification_2")) return false;
    windowSpecification_2_0(b, l + 1);
    return true;
  }

  // 'PARTITION' 'BY' expressionList
  private static boolean windowSpecification_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "windowSpecification_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "PARTITION");
    r = r && consumeToken(b, "BY");
    r = r && expressionList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [orderByClause]
  private static boolean windowSpecification_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "windowSpecification_3")) return false;
    orderByClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // baseString
  //     [ ( 'COLUMN' [COMMA 'COLUMN' ]ANY ) ]
  //     stringAs ( query )
  public static boolean withItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH_ITEM, "<with item>");
    r = baseString(b, l + 1);
    r = r && withItem_1(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && withItem_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( 'COLUMN' [COMMA 'COLUMN' ]ANY ) ]
  private static boolean withItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withItem_1")) return false;
    withItem_1_0(b, l + 1);
    return true;
  }

  // 'COLUMN' [COMMA 'COLUMN' ]ANY
  private static boolean withItem_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withItem_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "COLUMN");
    r = r && withItem_1_0_1(b, l + 1);
    r = r && consumeToken(b, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  // [COMMA 'COLUMN' ]
  private static boolean withItem_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withItem_1_0_1")) return false;
    withItem_1_0_1_0(b, l + 1);
    return true;
  }

  // COMMA 'COLUMN'
  private static boolean withItem_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withItem_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && consumeToken(b, "COLUMN");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( query )
  private static boolean withItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withItem_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = query(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier [columnList] stringAs LEFT_BRACKET queryExpression RIGHT_BRACKET
  public static boolean withListElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withListElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH_LIST_ELEMENT, "<with list element>");
    r = identifier(b, l + 1);
    r = r && withListElement_1(b, l + 1);
    r = r && stringAs(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && queryExpression(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [columnList]
  private static boolean withListElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withListElement_1")) return false;
    columnList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'WITH'
  public static boolean withStr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withStr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WITH_STR, "<with str>");
    r = consumeToken(b, "WITH");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
