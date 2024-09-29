SELECT
    expense_date,
    due_date,
    payment_type,
    amount,
    recipient_account_name
FROM
    Expenses
WHERE
    card_id = :CARDID
ORDER BY
    expense_date DESC;