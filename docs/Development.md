# When you add new grammar rule
1. edit `parser.bnf` follow [Grammar-Kit Document](https://github.com/JetBrains/Grammar-Kit) and [Extended Backus–Naur form](https://en.wikipedia.org/wiki/Extended_Backus%E2%80%93Naur_form#Extensibility).
2. right-click `parser.bnf` file, choose `Generate Parser Code`.
3. right-click `parser.bnf` file, choose `Generate JFlex Lexer`, replace code file.
4. right-click `_FlinkSqlCheckerLexer` file, choose `Run JLex Generator` then move `main/gen/com/camile/checker/_FlinkSqlCheckerLexer.java` to  `main/java/com/camile/checker/language/_FlinkSqlCheckerLexer.java`.
5. run project(run param use `runIde`).

# Problem shooting
- If you want to see new BNF rule is correct, you can right-click choose Live Preview, then paste statement to valid.
  - If the rule not work, you can visit `Structure` or right-click with error statement choose `Start Grammar Highlighting` then find something is amiss.