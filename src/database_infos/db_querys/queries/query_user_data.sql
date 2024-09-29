SELECT
    USERQ.*,
    Account.nm_account,
    Account.nam_account,
    Account.dt_creation,
    Account.vl_money
FROM (
    SELECT
        id,
        first_name,
        last_name,
        email,
        birth_date,
        nm_phone,
        user_type
    FROM
        Users
    WHERE
        id = :USERID
) AS USERQ
INNER JOIN Account
    ON USERQ.id = Account.user_id;
