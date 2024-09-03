CREATE TABLE Account(
    id BIGINT PRIMARY KEY NOT NULL,
    nm_account NUMERIC(16) NOT NULL,
    nam_account VARCHAR(32),
    tp_currency CHAR(3) CHECK (Currency IN ('USD', 'EUR', 'BRL')),
    dt_creation DATE NOT NULL,
    vl_money DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (user_id) REFERENCES (User.id),
    FOREIGN KEY (account_type) REFERENCES (AccountsType.id),
    FOREIGN KEY (status_type) REFERENCES (StatusType.id)
);