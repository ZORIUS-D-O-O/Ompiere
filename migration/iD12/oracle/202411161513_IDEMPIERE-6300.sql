-- IDEMPIERE-6300 Empty strings in database
SELECT register_migration_script('202411161513_IDEMPIERE-6300.sql') FROM dual;

SET SQLBLANKLINES ON
SET DEFINE OFF

-- Nov 16, 2024, 3:13:50 PM CET
UPDATE AD_Message SET MsgTip=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(MsgTip))=0 AND AD_Message_ID<1000000;

UPDATE AD_Message_Trl SET MsgTip=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(MsgTip))=0 AND AD_Message_ID<1000000;

UPDATE AD_Column SET Callout=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(Callout))=0 AND AD_Column_ID<1000000;

UPDATE AD_Tab SET Help=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(Help))=0 AND AD_Tab_ID<1000000;

UPDATE AD_Tab_Trl SET Help=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(Help))=0 AND AD_Tab_ID<1000000;

UPDATE AD_Reference SET Help=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(Help))=0 AND AD_Reference_ID<1000000;

UPDATE AD_Reference SET VFormat=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(VFormat))=0 AND AD_Reference_ID<1000000;

UPDATE AD_Ref_Table SET WhereClause=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(WhereClause))=0 AND AD_Reference_ID<1000000;

UPDATE AD_Ref_Table SET OrderByClause=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(OrderByClause))=0 AND AD_Reference_ID<1000000;

UPDATE C_BankStatement SET Description=NULL,Updated=TO_TIMESTAMP('2024-11-16 15:13:50','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE LENGTH(TRIM(Description))=0 AND C_BankStatement_ID<1000000;
