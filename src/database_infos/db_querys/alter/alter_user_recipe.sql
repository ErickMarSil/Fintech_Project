UPDATE Recipes
SET
    transaction_type = :NTT,
    amount = :NA,
    source_description = :NSD
WHERE id = :USERID;