SELECT
    investiment_date,
    investiment_type,
    amount,
    expected_return
FROM
    Investiment
WHERE
    account_id = :ACCOUNTID AND id = :INVESTIMENTID;