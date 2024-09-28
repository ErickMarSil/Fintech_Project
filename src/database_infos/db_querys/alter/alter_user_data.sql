UPDATE Account
SET
    nm_account = :NNMA,
    nam_account = :NNMA
WHERE id = :ACCOUNTID;

UPDATE Users
SET
    first_name = :NFN,
    last_name = :NLN,
    email = :NE,
    password = :NP,
    birth_data = :NBD,
    nm_phone = :NNP
WHERE id = :USERID;
