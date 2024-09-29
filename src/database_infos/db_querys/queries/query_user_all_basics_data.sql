SELECT
    expense_date AS "DATE",
    payment_type AS "TYPE",
    amount AS "QUANTITY"
FROM
    Expenses
WHERE
    card_id = :CARDID AND id = :EXPENSEID
UNION ALL
SELECT
    investment_date AS "DATE",
    investment_type AS "TYPE",
    amount AS "QUANTITY"
FROM
    Investments
WHERE
    account_id = :ACCOUNTID AND id = :INVESTIMENTID;