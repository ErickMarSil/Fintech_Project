CREATE TABLE Investments (
    id BIGINT PRIMARY KEY NOT NULL,
    investment_date DATE NOT NULL,
    investment_type VARCHAR(50) NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    expected_return DOUBLE PRECISION,
    maturity_date DATE,
    FOREIGN KEY (account_id) REFERENCES Account(id)
);
