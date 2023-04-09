// This is a generated file. Not intended for manual editing.
package com.camile.checker;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.camile.checker.psi.impl.*;

public interface FlinkSqlCheckerTypes {

  IElementType ADD_JAR = new FqlElementType("ADD_JAR");
  IElementType ALL_IN_GROUP = new FqlElementType("ALL_IN_GROUP");
  IElementType ALL_STATEMENT = new FqlElementType("ALL_STATEMENT");
  IElementType ALL_STRING = new FqlElementType("ALL_STRING");
  IElementType ANALYTIC_AGGREGATE_FUNCTION = new FqlElementType("ANALYTIC_AGGREGATE_FUNCTION");
  IElementType ASSIGNMENT_STATEMENT = new FqlElementType("ASSIGNMENT_STATEMENT");
  IElementType ASSIGNMENT_STATEMENT_OPERAND = new FqlElementType("ASSIGNMENT_STATEMENT_OPERAND");
  IElementType BASE_STRING = new FqlElementType("BASE_STRING");
  IElementType BETWEEN_PREDICATE = new FqlElementType("BETWEEN_PREDICATE");
  IElementType BOOLEAN_EXPRESSION = new FqlElementType("BOOLEAN_EXPRESSION");
  IElementType BOOLEAN_FACTOR = new FqlElementType("BOOLEAN_FACTOR");
  IElementType BOOLEAN_PRIMARY = new FqlElementType("BOOLEAN_PRIMARY");
  IElementType BOOLEAN_TERM = new FqlElementType("BOOLEAN_TERM");
  IElementType BOOLEAN_VALUE_EXPRESSION = new FqlElementType("BOOLEAN_VALUE_EXPRESSION");
  IElementType BRANCHING_STATEMENT = new FqlElementType("BRANCHING_STATEMENT");
  IElementType CALL_STATEMENT = new FqlElementType("CALL_STATEMENT");
  IElementType CASE_EXPRESSION = new FqlElementType("CASE_EXPRESSION");
  IElementType CATALOG_NAME = new FqlElementType("CATALOG_NAME");
  IElementType COLUMN = new FqlElementType("COLUMN");
  IElementType COLUMN_CONSTRAINT = new FqlElementType("COLUMN_CONSTRAINT");
  IElementType COLUMN_LIST = new FqlElementType("COLUMN_LIST");
  IElementType COLUMN_NAME = new FqlElementType("COLUMN_NAME");
  IElementType COMMENT_CONTENT = new FqlElementType("COMMENT_CONTENT");
  IElementType COMMON_COLUMN_NAME = new FqlElementType("COMMON_COLUMN_NAME");
  IElementType COMMON_VALUE_EXPRESSION = new FqlElementType("COMMON_VALUE_EXPRESSION");
  IElementType COMPARISON_OPERATOR = new FqlElementType("COMPARISON_OPERATOR");
  IElementType COMPARISON_PREDICATE = new FqlElementType("COMPARISON_PREDICATE");
  IElementType COMPOUND_STATEMENT = new FqlElementType("COMPOUND_STATEMENT");
  IElementType COMPUTED_COLUMN_DEFINITION = new FqlElementType("COMPUTED_COLUMN_DEFINITION");
  IElementType COMPUTED_COLUMN_EXPRESSION = new FqlElementType("COMPUTED_COLUMN_EXPRESSION");
  IElementType CONDITION = new FqlElementType("CONDITION");
  IElementType CREATE_STATEMENT = new FqlElementType("CREATE_STATEMENT");
  IElementType CREATE_TABLE = new FqlElementType("CREATE_TABLE");
  IElementType CREATE_VIEW = new FqlElementType("CREATE_VIEW");
  IElementType CROSS_JOIN = new FqlElementType("CROSS_JOIN");
  IElementType DATA_STATEMENT = new FqlElementType("DATA_STATEMENT");
  IElementType DATA_TYPE = new FqlElementType("DATA_TYPE");
  IElementType DB_NAME = new FqlElementType("DB_NAME");
  IElementType DECLARE_STATEMENT = new FqlElementType("DECLARE_STATEMENT");
  IElementType DELIMITED_STATEMENT = new FqlElementType("DELIMITED_STATEMENT");
  IElementType DERIVED_COLUMN = new FqlElementType("DERIVED_COLUMN");
  IElementType DIGIT = new FqlElementType("DIGIT");
  IElementType DIRECTLY_EXECUTABLE_STATEMENT = new FqlElementType("DIRECTLY_EXECUTABLE_STATEMENT");
  IElementType DYNAMIC_DATA_STATEMENT = new FqlElementType("DYNAMIC_DATA_STATEMENT");
  IElementType DYNAMIC_TABLE_OPTIONS = new FqlElementType("DYNAMIC_TABLE_OPTIONS");
  IElementType ENV_VAR = new FqlElementType("ENV_VAR");
  IElementType EQ = new FqlElementType("EQ");
  IElementType ESCAPED_FUNCTION = new FqlElementType("ESCAPED_FUNCTION");
  IElementType ESCAPED_JOIN = new FqlElementType("ESCAPED_JOIN");
  IElementType EXCEPTION_REFERENCE = new FqlElementType("EXCEPTION_REFERENCE");
  IElementType EXISTS_PREDICATE = new FqlElementType("EXISTS_PREDICATE");
  IElementType EXPRESSION = new FqlElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new FqlElementType("EXPRESSION_LIST");
  IElementType FETCH_CLAUSE = new FqlElementType("FETCH_CLAUSE");
  IElementType FILTER_CLAUSE = new FqlElementType("FILTER_CLAUSE");
  IElementType FOR = new FqlElementType("FOR");
  IElementType FOR_EACH_ROW_TRIGGER_ACTION = new FqlElementType("FOR_EACH_ROW_TRIGGER_ACTION");
  IElementType FROM_CLAUSE = new FqlElementType("FROM_CLAUSE");
  IElementType FUNCTION = new FqlElementType("FUNCTION");
  IElementType FUNCTION_NAME = new FqlElementType("FUNCTION_NAME");
  IElementType GROUP_BY_CLAUSE = new FqlElementType("GROUP_BY_CLAUSE");
  IElementType GT = new FqlElementType("GT");
  IElementType HAVING_CLAUSE = new FqlElementType("HAVING_CLAUSE");
  IElementType IDENTIFIER = new FqlElementType("IDENTIFIER");
  IElementType ID_PART = new FqlElementType("ID_PART");
  IElementType IF_STATEMENT = new FqlElementType("IF_STATEMENT");
  IElementType INSERT_FROM_SELECT_QUERIES = new FqlElementType("INSERT_FROM_SELECT_QUERIES");
  IElementType INSERT_INTO_MULTIPLE_TABLES = new FqlElementType("INSERT_INTO_MULTIPLE_TABLES");
  IElementType INSERT_STATEMENT = new FqlElementType("INSERT_STATEMENT");
  IElementType INSERT_VALUES_INTO_TABLES = new FqlElementType("INSERT_VALUES_INTO_TABLES");
  IElementType INTERVAL_LITERAL = new FqlElementType("INTERVAL_LITERAL");
  IElementType INTO_CLAUSE = new FqlElementType("INTO_CLAUSE");
  IElementType IN_PREDICATE = new FqlElementType("IN_PREDICATE");
  IElementType IS_NULL_PREDICATE = new FqlElementType("IS_NULL_PREDICATE");
  IElementType JAR_COMMAND = new FqlElementType("JAR_COMMAND");
  IElementType JOINED_TABLE = new FqlElementType("JOINED_TABLE");
  IElementType JOIN_CONDITION = new FqlElementType("JOIN_CONDITION");
  IElementType KEY = new FqlElementType("KEY");
  IElementType KEY_WORDS = new FqlElementType("KEY_WORDS");
  IElementType LETTER = new FqlElementType("LETTER");
  IElementType LIKE_OPTIONS = new FqlElementType("LIKE_OPTIONS");
  IElementType LIKE_REGEX_PREDICATE = new FqlElementType("LIKE_REGEX_PREDICATE");
  IElementType LIMIT_CLAUSE = new FqlElementType("LIMIT_CLAUSE");
  IElementType LOOP_STATEMENT = new FqlElementType("LOOP_STATEMENT");
  IElementType MAKE_DEP_OPTIONS = new FqlElementType("MAKE_DEP_OPTIONS");
  IElementType MATCH_PREDICATE = new FqlElementType("MATCH_PREDICATE");
  IElementType MATCH_RECOGNIZE = new FqlElementType("MATCH_RECOGNIZE");
  IElementType MEASURE_COLUMN = new FqlElementType("MEASURE_COLUMN");
  IElementType METADATA_COLUMN_DEFINITION = new FqlElementType("METADATA_COLUMN_DEFINITION");
  IElementType METADATA_KEY = new FqlElementType("METADATA_KEY");
  IElementType NAMED_PARAMETER_LIST = new FqlElementType("NAMED_PARAMETER_LIST");
  IElementType NESTED_EXPRESSION = new FqlElementType("NESTED_EXPRESSION");
  IElementType NON_NUMERIC_LITERAL = new FqlElementType("NON_NUMERIC_LITERAL");
  IElementType NON_RESERVED_IDENTIFIER = new FqlElementType("NON_RESERVED_IDENTIFIER");
  IElementType NOTE = new FqlElementType("NOTE");
  IElementType NUMERIC_VALUE_EXPRESSION = new FqlElementType("NUMERIC_VALUE_EXPRESSION");
  IElementType ONE_TABLE_FIELD = new FqlElementType("ONE_TABLE_FIELD");
  IElementType ORDERED_AGGREGATE_FUNCTION = new FqlElementType("ORDERED_AGGREGATE_FUNCTION");
  IElementType ORDER_BY_CLAUSE = new FqlElementType("ORDER_BY_CLAUSE");
  IElementType ORDER_ITEM = new FqlElementType("ORDER_ITEM");
  IElementType PARAMETER_REFERENCE = new FqlElementType("PARAMETER_REFERENCE");
  IElementType PART_SPEC = new FqlElementType("PART_SPEC");
  IElementType PATH_TO_FILE_NAME = new FqlElementType("PATH_TO_FILE_NAME");
  IElementType PATTERN = new FqlElementType("PATTERN");
  IElementType PATTERN_FACTOR = new FqlElementType("PATTERN_FACTOR");
  IElementType PATTERN_QUANTIFIER = new FqlElementType("PATTERN_QUANTIFIER");
  IElementType PATTERN_TERM = new FqlElementType("PATTERN_TERM");
  IElementType PHYSICAL_COLUMN_DEFINITION = new FqlElementType("PHYSICAL_COLUMN_DEFINITION");
  IElementType QUALIFIED_TABLE = new FqlElementType("QUALIFIED_TABLE");
  IElementType QUANTIFIED_COMPARISON_PREDICATE = new FqlElementType("QUANTIFIED_COMPARISON_PREDICATE");
  IElementType QUERY = new FqlElementType("QUERY");
  IElementType QUERY_2 = new FqlElementType("QUERY_2");
  IElementType QUERY_EXPRESSION = new FqlElementType("QUERY_EXPRESSION");
  IElementType QUERY_EXPRESSION_BODY = new FqlElementType("QUERY_EXPRESSION_BODY");
  IElementType QUERY_PRIMARY = new FqlElementType("QUERY_PRIMARY");
  IElementType QUERY_STATEMENT = new FqlElementType("QUERY_STATEMENT");
  IElementType QUERY_STRING_FUNCTION = new FqlElementType("QUERY_STRING_FUNCTION");
  IElementType QUERY_TERM = new FqlElementType("QUERY_TERM");
  IElementType QUERY_WITHOUT_SEMI_COLON = new FqlElementType("QUERY_WITHOUT_SEMI_COLON");
  IElementType QUERY_WITHOUT_SEMI_COLON_2 = new FqlElementType("QUERY_WITHOUT_SEMI_COLON_2");
  IElementType QUOTED_ID = new FqlElementType("QUOTED_ID");
  IElementType RAISE_ERROR_STATEMENT = new FqlElementType("RAISE_ERROR_STATEMENT");
  IElementType RAISE_STATEMENT = new FqlElementType("RAISE_STATEMENT");
  IElementType RAW_STRING = new FqlElementType("RAW_STRING");
  IElementType REMOVE_JAR = new FqlElementType("REMOVE_JAR");
  IElementType RETURN_STATEMENT = new FqlElementType("RETURN_STATEMENT");
  IElementType SEARCHED_CASE_EXPRESSION = new FqlElementType("SEARCHED_CASE_EXPRESSION");
  IElementType SELECT_CLAUSE = new FqlElementType("SELECT_CLAUSE");
  IElementType SELECT_DERIVED_COLUMN = new FqlElementType("SELECT_DERIVED_COLUMN");
  IElementType SELECT_STATEMENT = new FqlElementType("SELECT_STATEMENT");
  IElementType SELECT_SUBLIST = new FqlElementType("SELECT_SUBLIST");
  IElementType SELECT_V_2 = new FqlElementType("SELECT_V_2");
  IElementType SELECT_WITHOUT_FROM = new FqlElementType("SELECT_WITHOUT_FROM");
  IElementType SEMICOLON = new FqlElementType("SEMICOLON");
  IElementType SET_CLAUSE_LIST = new FqlElementType("SET_CLAUSE_LIST");
  IElementType SHOW_JAR = new FqlElementType("SHOW_JAR");
  IElementType SIMPLE_DATA_TYPE = new FqlElementType("SIMPLE_DATA_TYPE");
  IElementType SORT_KEY = new FqlElementType("SORT_KEY");
  IElementType SORT_SPECIFICATION = new FqlElementType("SORT_SPECIFICATION");
  IElementType SOURCE_TABLE = new FqlElementType("SOURCE_TABLE");
  IElementType SPECIAL_COLUMN_NAME = new FqlElementType("SPECIAL_COLUMN_NAME");
  IElementType SQL_EXCEPTION = new FqlElementType("SQL_EXCEPTION");
  IElementType STANDARD_AGGREGATE_FUNCTION = new FqlElementType("STANDARD_AGGREGATE_FUNCTION");
  IElementType STATEMENT = new FqlElementType("STATEMENT");
  IElementType STRING = new FqlElementType("STRING");
  IElementType STRING_AS = new FqlElementType("STRING_AS");
  IElementType STRING_BY = new FqlElementType("STRING_BY");
  IElementType STRING_CASE = new FqlElementType("STRING_CASE");
  IElementType STRING_CREATE = new FqlElementType("STRING_CREATE");
  IElementType STRING_ELSE = new FqlElementType("STRING_ELSE");
  IElementType STRING_END = new FqlElementType("STRING_END");
  IElementType STRING_FROM = new FqlElementType("STRING_FROM");
  IElementType STRING_GROUP = new FqlElementType("STRING_GROUP");
  IElementType STRING_INSERT = new FqlElementType("STRING_INSERT");
  IElementType STRING_INTO = new FqlElementType("STRING_INTO");
  IElementType STRING_LIKE = new FqlElementType("STRING_LIKE");
  IElementType STRING_LIMIT = new FqlElementType("STRING_LIMIT");
  IElementType STRING_NOT = new FqlElementType("STRING_NOT");
  IElementType STRING_ORDER = new FqlElementType("STRING_ORDER");
  IElementType STRING_SELECT = new FqlElementType("STRING_SELECT");
  IElementType STRING_TABLE = new FqlElementType("STRING_TABLE");
  IElementType STRING_THEN = new FqlElementType("STRING_THEN");
  IElementType STRING_WHEN = new FqlElementType("STRING_WHEN");
  IElementType SUB_QUERY = new FqlElementType("SUB_QUERY");
  IElementType SYSTEM_TIME_PERIOD = new FqlElementType("SYSTEM_TIME_PERIOD");
  IElementType TABLE_CONSTRAINT = new FqlElementType("TABLE_CONSTRAINT");
  IElementType TABLE_EXPRESSION = new FqlElementType("TABLE_EXPRESSION");
  IElementType TABLE_EXPRESSION_2 = new FqlElementType("TABLE_EXPRESSION_2");
  IElementType TABLE_NAME = new FqlElementType("TABLE_NAME");
  IElementType TABLE_NAME_V_2 = new FqlElementType("TABLE_NAME_V_2");
  IElementType TABLE_PATH = new FqlElementType("TABLE_PATH");
  IElementType TABLE_PRIMARY = new FqlElementType("TABLE_PRIMARY");
  IElementType TABLE_PRIMARY_V_2 = new FqlElementType("TABLE_PRIMARY_V_2");
  IElementType TABLE_REFERENCE = new FqlElementType("TABLE_REFERENCE");
  IElementType TABLE_REFERENCE_V_2 = new FqlElementType("TABLE_REFERENCE_V_2");
  IElementType TABLE_SUB_QUERY = new FqlElementType("TABLE_SUB_QUERY");
  IElementType TERM = new FqlElementType("TERM");
  IElementType TEXT_AGGREGATE_FUNCTION = new FqlElementType("TEXT_AGGREGATE_FUNCTION");
  IElementType TEXT_TABLE_COLUMN = new FqlElementType("TEXT_TABLE_COLUMN");
  IElementType TIME_INTERVAL = new FqlElementType("TIME_INTERVAL");
  IElementType TYPED_ELEMENT_LIST = new FqlElementType("TYPED_ELEMENT_LIST");
  IElementType UNESCAPED_FUNCTION = new FqlElementType("UNESCAPED_FUNCTION");
  IElementType UNSIGNED_INTEGER = new FqlElementType("UNSIGNED_INTEGER");
  IElementType UNSIGNED_NUMERIC_LITERAL = new FqlElementType("UNSIGNED_NUMERIC_LITERAL");
  IElementType UNSIGNED_VALUE_EXPRESSION_PRIMARY = new FqlElementType("UNSIGNED_VALUE_EXPRESSION_PRIMARY");
  IElementType VAL = new FqlElementType("VAL");
  IElementType VALUES = new FqlElementType("VALUES");
  IElementType VALUES_ROW = new FqlElementType("VALUES_ROW");
  IElementType VALUE_EXPRESSION_PRIMARY = new FqlElementType("VALUE_EXPRESSION_PRIMARY");
  IElementType WATERMARK_DEFINITION = new FqlElementType("WATERMARK_DEFINITION");
  IElementType WATERMARK_STRATEGY_EXPRESSION = new FqlElementType("WATERMARK_STRATEGY_EXPRESSION");
  IElementType WHERE_CLAUSE = new FqlElementType("WHERE_CLAUSE");
  IElementType WHILE_STATEMENT = new FqlElementType("WHILE_STATEMENT");
  IElementType WINDOW_SPECIFICATION = new FqlElementType("WINDOW_SPECIFICATION");
  IElementType WITH_ITEM = new FqlElementType("WITH_ITEM");
  IElementType WITH_LIST_ELEMENT = new FqlElementType("WITH_LIST_ELEMENT");
  IElementType WITH_STR = new FqlElementType("WITH_STR");

  IElementType ANY = new FqlTokenType("*");
  IElementType CHARACTER = new FqlTokenType("CHARACTER");
  IElementType CHINESE_STRING = new FqlTokenType("CHINESE_STRING");
  IElementType COLON = new FqlTokenType(":");
  IElementType COMMA = new FqlTokenType(",");
  IElementType COMMENT = new FqlTokenType("COMMENT");
  IElementType DOUBLE = new FqlTokenType("DOUBLE");
  IElementType END = new FqlTokenType("END");
  IElementType ENGLISH_STRING = new FqlTokenType("ENGLISH_STRING");
  IElementType EQUALS = new FqlTokenType("=");
  IElementType EXSIT = new FqlTokenType("EXSIT");
  IElementType GE = new FqlTokenType(">=");
  IElementType HYPHEN = new FqlTokenType("-");
  IElementType IF = new FqlTokenType("IF");
  IElementType LBRACE = new FqlTokenType("{");
  IElementType LE = new FqlTokenType("<=");
  IElementType LEFT_BRACKET = new FqlTokenType("LEFT_BRACKET");
  IElementType LSBTRACE = new FqlTokenType("[");
  IElementType LT = new FqlTokenType("<");
  IElementType NOT = new FqlTokenType("NOT");
  IElementType NOT_EQUALS = new FqlTokenType("<>");
  IElementType NOT_EQUALS2 = new FqlTokenType("!=");
  IElementType NUMBER = new FqlTokenType("NUMBER");
  IElementType PERIOD = new FqlTokenType(".");
  IElementType PLUS = new FqlTokenType("+");
  IElementType RBRACE = new FqlTokenType("}");
  IElementType RIGHT_BRACKET = new FqlTokenType("RIGHT_BRACKET");
  IElementType RSBTRACE = new FqlTokenType("]");
  IElementType SEMI_COLON = new FqlTokenType(";");
  IElementType SINGLE_QUOTATION = new FqlTokenType("'");
  IElementType SLASH = new FqlTokenType("/");
  IElementType STRINGLIT = new FqlTokenType("STRINGLIT");
  IElementType TEXTAGG = new FqlTokenType("TEXTAGG");
  IElementType UNDERSCORE = new FqlTokenType("_");
  IElementType Ε = new FqlTokenType("ε");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_JAR) {
        return new FqlCheckerAddJarImpl(node);
      }
      else if (type == ALL_IN_GROUP) {
        return new FqlCheckerAllInGroupImpl(node);
      }
      else if (type == ALL_STATEMENT) {
        return new FqlCheckerAllStatementImpl(node);
      }
      else if (type == ALL_STRING) {
        return new FqlCheckerAllStringImpl(node);
      }
      else if (type == ANALYTIC_AGGREGATE_FUNCTION) {
        return new FqlCheckerAnalyticAggregateFunctionImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new FqlCheckerAssignmentStatementImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT_OPERAND) {
        return new FqlCheckerAssignmentStatementOperandImpl(node);
      }
      else if (type == BASE_STRING) {
        return new FqlCheckerBaseStringImpl(node);
      }
      else if (type == BETWEEN_PREDICATE) {
        return new FqlCheckerBetweenPredicateImpl(node);
      }
      else if (type == BOOLEAN_EXPRESSION) {
        return new FqlCheckerBooleanExpressionImpl(node);
      }
      else if (type == BOOLEAN_FACTOR) {
        return new FqlCheckerBooleanFactorImpl(node);
      }
      else if (type == BOOLEAN_PRIMARY) {
        return new FqlCheckerBooleanPrimaryImpl(node);
      }
      else if (type == BOOLEAN_TERM) {
        return new FqlCheckerBooleanTermImpl(node);
      }
      else if (type == BOOLEAN_VALUE_EXPRESSION) {
        return new FqlCheckerBooleanValueExpressionImpl(node);
      }
      else if (type == BRANCHING_STATEMENT) {
        return new FqlCheckerBranchingStatementImpl(node);
      }
      else if (type == CALL_STATEMENT) {
        return new FqlCheckerCallStatementImpl(node);
      }
      else if (type == CASE_EXPRESSION) {
        return new FqlCheckerCaseExpressionImpl(node);
      }
      else if (type == CATALOG_NAME) {
        return new FqlCheckerCatalogNameImpl(node);
      }
      else if (type == COLUMN) {
        return new FqlCheckerColumnImpl(node);
      }
      else if (type == COLUMN_CONSTRAINT) {
        return new FqlCheckerColumnConstraintImpl(node);
      }
      else if (type == COLUMN_LIST) {
        return new FqlCheckerColumnListImpl(node);
      }
      else if (type == COLUMN_NAME) {
        return new FqlCheckerColumnNameImpl(node);
      }
      else if (type == COMMENT_CONTENT) {
        return new FqlCheckerCommentContentImpl(node);
      }
      else if (type == COMMON_COLUMN_NAME) {
        return new FqlCheckerCommonColumnNameImpl(node);
      }
      else if (type == COMMON_VALUE_EXPRESSION) {
        return new FqlCheckerCommonValueExpressionImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new FqlCheckerComparisonOperatorImpl(node);
      }
      else if (type == COMPARISON_PREDICATE) {
        return new FqlCheckerComparisonPredicateImpl(node);
      }
      else if (type == COMPOUND_STATEMENT) {
        return new FqlCheckerCompoundStatementImpl(node);
      }
      else if (type == COMPUTED_COLUMN_DEFINITION) {
        return new FqlCheckerComputedColumnDefinitionImpl(node);
      }
      else if (type == COMPUTED_COLUMN_EXPRESSION) {
        return new FqlCheckerComputedColumnExpressionImpl(node);
      }
      else if (type == CONDITION) {
        return new FqlCheckerConditionImpl(node);
      }
      else if (type == CREATE_STATEMENT) {
        return new FqlCheckerCreateStatementImpl(node);
      }
      else if (type == CREATE_TABLE) {
        return new FqlCheckerCreateTableImpl(node);
      }
      else if (type == CREATE_VIEW) {
        return new FqlCheckerCreateViewImpl(node);
      }
      else if (type == CROSS_JOIN) {
        return new FqlCheckerCrossJoinImpl(node);
      }
      else if (type == DATA_STATEMENT) {
        return new FqlCheckerDataStatementImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new FqlCheckerDataTypeImpl(node);
      }
      else if (type == DB_NAME) {
        return new FqlCheckerDbNameImpl(node);
      }
      else if (type == DECLARE_STATEMENT) {
        return new FqlCheckerDeclareStatementImpl(node);
      }
      else if (type == DELIMITED_STATEMENT) {
        return new FqlCheckerDelimitedStatementImpl(node);
      }
      else if (type == DERIVED_COLUMN) {
        return new FqlCheckerDerivedColumnImpl(node);
      }
      else if (type == DIGIT) {
        return new FqlCheckerDigitImpl(node);
      }
      else if (type == DIRECTLY_EXECUTABLE_STATEMENT) {
        return new FqlCheckerDirectlyExecutableStatementImpl(node);
      }
      else if (type == DYNAMIC_DATA_STATEMENT) {
        return new FqlCheckerDynamicDataStatementImpl(node);
      }
      else if (type == DYNAMIC_TABLE_OPTIONS) {
        return new FqlCheckerDynamicTableOptionsImpl(node);
      }
      else if (type == ENV_VAR) {
        return new FqlCheckerEnvVarImpl(node);
      }
      else if (type == EQ) {
        return new FqlCheckerEqImpl(node);
      }
      else if (type == ESCAPED_FUNCTION) {
        return new FqlCheckerEscapedFunctionImpl(node);
      }
      else if (type == ESCAPED_JOIN) {
        return new FqlCheckerEscapedJoinImpl(node);
      }
      else if (type == EXCEPTION_REFERENCE) {
        return new FqlCheckerExceptionReferenceImpl(node);
      }
      else if (type == EXISTS_PREDICATE) {
        return new FqlCheckerExistsPredicateImpl(node);
      }
      else if (type == EXPRESSION) {
        return new FqlCheckerExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new FqlCheckerExpressionListImpl(node);
      }
      else if (type == FETCH_CLAUSE) {
        return new FqlCheckerFetchClauseImpl(node);
      }
      else if (type == FILTER_CLAUSE) {
        return new FqlCheckerFilterClauseImpl(node);
      }
      else if (type == FOR) {
        return new FqlCheckerForImpl(node);
      }
      else if (type == FOR_EACH_ROW_TRIGGER_ACTION) {
        return new FqlCheckerForEachRowTriggerActionImpl(node);
      }
      else if (type == FROM_CLAUSE) {
        return new FqlCheckerFromClauseImpl(node);
      }
      else if (type == FUNCTION) {
        return new FqlCheckerFunctionImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new FqlCheckerFunctionNameImpl(node);
      }
      else if (type == GROUP_BY_CLAUSE) {
        return new FqlCheckerGroupByClauseImpl(node);
      }
      else if (type == GT) {
        return new FqlCheckerGtImpl(node);
      }
      else if (type == HAVING_CLAUSE) {
        return new FqlCheckerHavingClauseImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new FqlCheckerIdentifierImpl(node);
      }
      else if (type == ID_PART) {
        return new FqlCheckerIdPartImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new FqlCheckerIfStatementImpl(node);
      }
      else if (type == INSERT_FROM_SELECT_QUERIES) {
        return new FqlCheckerInsertFromSelectQueriesImpl(node);
      }
      else if (type == INSERT_INTO_MULTIPLE_TABLES) {
        return new FqlCheckerInsertIntoMultipleTablesImpl(node);
      }
      else if (type == INSERT_STATEMENT) {
        return new FqlCheckerInsertStatementImpl(node);
      }
      else if (type == INSERT_VALUES_INTO_TABLES) {
        return new FqlCheckerInsertValuesIntoTablesImpl(node);
      }
      else if (type == INTERVAL_LITERAL) {
        return new FqlCheckerIntervalLiteralImpl(node);
      }
      else if (type == INTO_CLAUSE) {
        return new FqlCheckerIntoClauseImpl(node);
      }
      else if (type == IN_PREDICATE) {
        return new FqlCheckerInPredicateImpl(node);
      }
      else if (type == IS_NULL_PREDICATE) {
        return new FqlCheckerIsNullPredicateImpl(node);
      }
      else if (type == JAR_COMMAND) {
        return new FqlCheckerJarCommandImpl(node);
      }
      else if (type == JOINED_TABLE) {
        return new FqlCheckerJoinedTableImpl(node);
      }
      else if (type == JOIN_CONDITION) {
        return new FqlCheckerJoinConditionImpl(node);
      }
      else if (type == KEY) {
        return new FqlCheckerKeyImpl(node);
      }
      else if (type == KEY_WORDS) {
        return new FqlCheckerKeyWordsImpl(node);
      }
      else if (type == LETTER) {
        return new FqlCheckerLetterImpl(node);
      }
      else if (type == LIKE_OPTIONS) {
        return new FqlCheckerLikeOptionsImpl(node);
      }
      else if (type == LIKE_REGEX_PREDICATE) {
        return new FqlCheckerLikeRegexPredicateImpl(node);
      }
      else if (type == LIMIT_CLAUSE) {
        return new FqlCheckerLimitClauseImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new FqlCheckerLoopStatementImpl(node);
      }
      else if (type == MAKE_DEP_OPTIONS) {
        return new FqlCheckerMakeDepOptionsImpl(node);
      }
      else if (type == MATCH_PREDICATE) {
        return new FqlCheckerMatchPredicateImpl(node);
      }
      else if (type == MATCH_RECOGNIZE) {
        return new FqlCheckerMatchRecognizeImpl(node);
      }
      else if (type == MEASURE_COLUMN) {
        return new FqlCheckerMeasureColumnImpl(node);
      }
      else if (type == METADATA_COLUMN_DEFINITION) {
        return new FqlCheckerMetadataColumnDefinitionImpl(node);
      }
      else if (type == METADATA_KEY) {
        return new FqlCheckerMetadataKeyImpl(node);
      }
      else if (type == NAMED_PARAMETER_LIST) {
        return new FqlCheckerNamedParameterListImpl(node);
      }
      else if (type == NESTED_EXPRESSION) {
        return new FqlCheckerNestedExpressionImpl(node);
      }
      else if (type == NON_NUMERIC_LITERAL) {
        return new FqlCheckerNonNumericLiteralImpl(node);
      }
      else if (type == NON_RESERVED_IDENTIFIER) {
        return new FqlCheckerNonReservedIdentifierImpl(node);
      }
      else if (type == NOTE) {
        return new FqlCheckerNoteImpl(node);
      }
      else if (type == NUMERIC_VALUE_EXPRESSION) {
        return new FqlCheckerNumericValueExpressionImpl(node);
      }
      else if (type == ONE_TABLE_FIELD) {
        return new FqlCheckerOneTableFieldImpl(node);
      }
      else if (type == ORDERED_AGGREGATE_FUNCTION) {
        return new FqlCheckerOrderedAggregateFunctionImpl(node);
      }
      else if (type == ORDER_BY_CLAUSE) {
        return new FqlCheckerOrderByClauseImpl(node);
      }
      else if (type == ORDER_ITEM) {
        return new FqlCheckerOrderItemImpl(node);
      }
      else if (type == PARAMETER_REFERENCE) {
        return new FqlCheckerParameterReferenceImpl(node);
      }
      else if (type == PART_SPEC) {
        return new FqlCheckerPartSpecImpl(node);
      }
      else if (type == PATH_TO_FILE_NAME) {
        return new FqlCheckerPathToFileNameImpl(node);
      }
      else if (type == PATTERN) {
        return new FqlCheckerPatternImpl(node);
      }
      else if (type == PATTERN_FACTOR) {
        return new FqlCheckerPatternFactorImpl(node);
      }
      else if (type == PATTERN_QUANTIFIER) {
        return new FqlCheckerPatternQuantifierImpl(node);
      }
      else if (type == PATTERN_TERM) {
        return new FqlCheckerPatternTermImpl(node);
      }
      else if (type == PHYSICAL_COLUMN_DEFINITION) {
        return new FqlCheckerPhysicalColumnDefinitionImpl(node);
      }
      else if (type == QUALIFIED_TABLE) {
        return new FqlCheckerQualifiedTableImpl(node);
      }
      else if (type == QUANTIFIED_COMPARISON_PREDICATE) {
        return new FqlCheckerQuantifiedComparisonPredicateImpl(node);
      }
      else if (type == QUERY) {
        return new FqlCheckerQueryImpl(node);
      }
      else if (type == QUERY_2) {
        return new FqlCheckerQuery2Impl(node);
      }
      else if (type == QUERY_EXPRESSION) {
        return new FqlCheckerQueryExpressionImpl(node);
      }
      else if (type == QUERY_EXPRESSION_BODY) {
        return new FqlCheckerQueryExpressionBodyImpl(node);
      }
      else if (type == QUERY_PRIMARY) {
        return new FqlCheckerQueryPrimaryImpl(node);
      }
      else if (type == QUERY_STATEMENT) {
        return new FqlCheckerQueryStatementImpl(node);
      }
      else if (type == QUERY_STRING_FUNCTION) {
        return new FqlCheckerQueryStringFunctionImpl(node);
      }
      else if (type == QUERY_TERM) {
        return new FqlCheckerQueryTermImpl(node);
      }
      else if (type == QUERY_WITHOUT_SEMI_COLON) {
        return new FqlCheckerQueryWithoutSemiColonImpl(node);
      }
      else if (type == QUERY_WITHOUT_SEMI_COLON_2) {
        return new FqlCheckerQueryWithoutSemiColon2Impl(node);
      }
      else if (type == QUOTED_ID) {
        return new FqlCheckerQuotedIdImpl(node);
      }
      else if (type == RAISE_ERROR_STATEMENT) {
        return new FqlCheckerRaiseErrorStatementImpl(node);
      }
      else if (type == RAISE_STATEMENT) {
        return new FqlCheckerRaiseStatementImpl(node);
      }
      else if (type == RAW_STRING) {
        return new FqlCheckerRawStringImpl(node);
      }
      else if (type == REMOVE_JAR) {
        return new FqlCheckerRemoveJarImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new FqlCheckerReturnStatementImpl(node);
      }
      else if (type == SEARCHED_CASE_EXPRESSION) {
        return new FqlCheckerSearchedCaseExpressionImpl(node);
      }
      else if (type == SELECT_CLAUSE) {
        return new FqlCheckerSelectClauseImpl(node);
      }
      else if (type == SELECT_DERIVED_COLUMN) {
        return new FqlCheckerSelectDerivedColumnImpl(node);
      }
      else if (type == SELECT_STATEMENT) {
        return new FqlCheckerSelectStatementImpl(node);
      }
      else if (type == SELECT_SUBLIST) {
        return new FqlCheckerSelectSublistImpl(node);
      }
      else if (type == SELECT_V_2) {
        return new FqlCheckerSelectV2Impl(node);
      }
      else if (type == SELECT_WITHOUT_FROM) {
        return new FqlCheckerSelectWithoutFromImpl(node);
      }
      else if (type == SEMICOLON) {
        return new FqlCheckerSemicolonImpl(node);
      }
      else if (type == SET_CLAUSE_LIST) {
        return new FqlCheckerSetClauseListImpl(node);
      }
      else if (type == SHOW_JAR) {
        return new FqlCheckerShowJarImpl(node);
      }
      else if (type == SIMPLE_DATA_TYPE) {
        return new FqlCheckerSimpleDataTypeImpl(node);
      }
      else if (type == SORT_KEY) {
        return new FqlCheckerSortKeyImpl(node);
      }
      else if (type == SORT_SPECIFICATION) {
        return new FqlCheckerSortSpecificationImpl(node);
      }
      else if (type == SOURCE_TABLE) {
        return new FqlCheckerSourceTableImpl(node);
      }
      else if (type == SPECIAL_COLUMN_NAME) {
        return new FqlCheckerSpecialColumnNameImpl(node);
      }
      else if (type == SQL_EXCEPTION) {
        return new FqlCheckerSqlExceptionImpl(node);
      }
      else if (type == STANDARD_AGGREGATE_FUNCTION) {
        return new FqlCheckerStandardAggregateFunctionImpl(node);
      }
      else if (type == STATEMENT) {
        return new FqlCheckerStatementImpl(node);
      }
      else if (type == STRING) {
        return new FqlCheckerStringImpl(node);
      }
      else if (type == STRING_AS) {
        return new FqlCheckerStringAsImpl(node);
      }
      else if (type == STRING_BY) {
        return new FqlCheckerStringByImpl(node);
      }
      else if (type == STRING_CASE) {
        return new FqlCheckerStringCaseImpl(node);
      }
      else if (type == STRING_CREATE) {
        return new FqlCheckerStringCreateImpl(node);
      }
      else if (type == STRING_ELSE) {
        return new FqlCheckerStringElseImpl(node);
      }
      else if (type == STRING_END) {
        return new FqlCheckerStringEndImpl(node);
      }
      else if (type == STRING_FROM) {
        return new FqlCheckerStringFromImpl(node);
      }
      else if (type == STRING_GROUP) {
        return new FqlCheckerStringGroupImpl(node);
      }
      else if (type == STRING_INSERT) {
        return new FqlCheckerStringInsertImpl(node);
      }
      else if (type == STRING_INTO) {
        return new FqlCheckerStringIntoImpl(node);
      }
      else if (type == STRING_LIKE) {
        return new FqlCheckerStringLikeImpl(node);
      }
      else if (type == STRING_LIMIT) {
        return new FqlCheckerStringLimitImpl(node);
      }
      else if (type == STRING_NOT) {
        return new FqlCheckerStringNotImpl(node);
      }
      else if (type == STRING_ORDER) {
        return new FqlCheckerStringOrderImpl(node);
      }
      else if (type == STRING_SELECT) {
        return new FqlCheckerStringSelectImpl(node);
      }
      else if (type == STRING_TABLE) {
        return new FqlCheckerStringTableImpl(node);
      }
      else if (type == STRING_THEN) {
        return new FqlCheckerStringThenImpl(node);
      }
      else if (type == STRING_WHEN) {
        return new FqlCheckerStringWhenImpl(node);
      }
      else if (type == SUB_QUERY) {
        return new FqlCheckerSubQueryImpl(node);
      }
      else if (type == SYSTEM_TIME_PERIOD) {
        return new FqlCheckerSystemTimePeriodImpl(node);
      }
      else if (type == TABLE_CONSTRAINT) {
        return new FqlCheckerTableConstraintImpl(node);
      }
      else if (type == TABLE_EXPRESSION) {
        return new FqlCheckerTableExpressionImpl(node);
      }
      else if (type == TABLE_EXPRESSION_2) {
        return new FqlCheckerTableExpression2Impl(node);
      }
      else if (type == TABLE_NAME) {
        return new FqlCheckerTableNameImpl(node);
      }
      else if (type == TABLE_NAME_V_2) {
        return new FqlCheckerTableNameV2Impl(node);
      }
      else if (type == TABLE_PATH) {
        return new FqlCheckerTablePathImpl(node);
      }
      else if (type == TABLE_PRIMARY) {
        return new FqlCheckerTablePrimaryImpl(node);
      }
      else if (type == TABLE_PRIMARY_V_2) {
        return new FqlCheckerTablePrimaryV2Impl(node);
      }
      else if (type == TABLE_REFERENCE) {
        return new FqlCheckerTableReferenceImpl(node);
      }
      else if (type == TABLE_REFERENCE_V_2) {
        return new FqlCheckerTableReferenceV2Impl(node);
      }
      else if (type == TABLE_SUB_QUERY) {
        return new FqlCheckerTableSubQueryImpl(node);
      }
      else if (type == TERM) {
        return new FqlCheckerTermImpl(node);
      }
      else if (type == TEXT_AGGREGATE_FUNCTION) {
        return new FqlCheckerTextAggregateFunctionImpl(node);
      }
      else if (type == TEXT_TABLE_COLUMN) {
        return new FqlCheckerTextTableColumnImpl(node);
      }
      else if (type == TIME_INTERVAL) {
        return new FqlCheckerTimeIntervalImpl(node);
      }
      else if (type == TYPED_ELEMENT_LIST) {
        return new FqlCheckerTypedElementListImpl(node);
      }
      else if (type == UNESCAPED_FUNCTION) {
        return new FqlCheckerUnescapedFunctionImpl(node);
      }
      else if (type == UNSIGNED_INTEGER) {
        return new FqlCheckerUnsignedIntegerImpl(node);
      }
      else if (type == UNSIGNED_NUMERIC_LITERAL) {
        return new FqlCheckerUnsignedNumericLiteralImpl(node);
      }
      else if (type == UNSIGNED_VALUE_EXPRESSION_PRIMARY) {
        return new FqlCheckerUnsignedValueExpressionPrimaryImpl(node);
      }
      else if (type == VAL) {
        return new FqlCheckerValImpl(node);
      }
      else if (type == VALUES) {
        return new FqlCheckerValuesImpl(node);
      }
      else if (type == VALUES_ROW) {
        return new FqlCheckerValuesRowImpl(node);
      }
      else if (type == VALUE_EXPRESSION_PRIMARY) {
        return new FqlCheckerValueExpressionPrimaryImpl(node);
      }
      else if (type == WATERMARK_DEFINITION) {
        return new FqlCheckerWatermarkDefinitionImpl(node);
      }
      else if (type == WATERMARK_STRATEGY_EXPRESSION) {
        return new FqlCheckerWatermarkStrategyExpressionImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new FqlCheckerWhereClauseImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new FqlCheckerWhileStatementImpl(node);
      }
      else if (type == WINDOW_SPECIFICATION) {
        return new FqlCheckerWindowSpecificationImpl(node);
      }
      else if (type == WITH_ITEM) {
        return new FqlCheckerWithItemImpl(node);
      }
      else if (type == WITH_LIST_ELEMENT) {
        return new FqlCheckerWithListElementImpl(node);
      }
      else if (type == WITH_STR) {
        return new FqlCheckerWithStrImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
