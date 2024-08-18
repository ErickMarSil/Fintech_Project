CREATE TABLE Users (
    id BIGINT PRIMARY KEY NOT NULL,
    cd_cpf INT NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(30),
    password VARCHAR(64) NOT NULL,
    birth_data DATE NOT NULL,
    nm_phone INT,
    user_type INT NOT NULL,
    CONSTRAINT ck_email_or_phone_not_null
        CHECK ((email IS NOT NULL AND nm_phone IS NULL) OR (email IS NULL AND nm_phone IS NOT NULL))
);