CREATE TABLE Recipes (
    id BIGINT PRIMARY KEY NOT NULL,
    card_id BIGINT NOT NULL,
    transaction_date DATE NOT NULL,
    transaction_type VARCHAR(50) NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    source_description VARCHAR(100) NOT NULL,
    FOREIGN KEY (card_id) REFERENCES Cards(id)
);
