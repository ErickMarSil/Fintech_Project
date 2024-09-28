UPDATE Expenses
SET
    expense_date = :NED,
    due_date = :NDD,
    payment_type = :NPT,
    amount = : NA
WHERE
    id = :USERID;
