UPDATE Investiments
SET
    investiment_date = :NID,
    amount = :NAM
WHERE
    id = :USERID;