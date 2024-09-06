CREATE TABLE Cards(
    id BIGINT PRIMARY KEY NOT NULL,
    nm_card NUMERIC(16) NOT NULL,
    nm_ccv NUMERIC(3) NOT NULL,
    dt_expired DATE NOT NULL,
    num_available DOUBLE PRECISION NOT NULL,
    credit_limit DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (account_id) REFERENCES (Account.id)
);