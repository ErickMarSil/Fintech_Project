SELECT
    investiment_date,
    investiment_type,
    amount,
    expected_return
FROM
    Investiment
WHERE
    id = :ACCOUNTID
ORDER BY
    investiment_date DESC;