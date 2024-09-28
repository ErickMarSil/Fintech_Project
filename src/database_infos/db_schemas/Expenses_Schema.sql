CREATE TABLE Expenses (
    id BIGINT PRIMARY KEY NOT NULL,
    card_id BIGINT NOT NULL,
    expense_date DATE NOT NULL,
    due_date DATE NOT NULL,
    payment_type VARCHAR(50) NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    recipient_account_name VARCHAR(100) NOT NULL,
    FOREIGN KEY (card_id) REFERENCES Cards(id)
);