CREATE TABLE Card_Recipes (
    id BIGINT PRIMARY KEY NOT NULL,
    card_id BIGINT NOT NULL,
    transaction_date DATE NOT NULL,
    transaction_type VARCHAR(50) NOT NULL, -- Recebido ou Gasto
    amount DOUBLE PRECISION NOT NULL,
    source_description VARCHAR(100) NOT NULL, -- Descrição da origem ou destino
    FOREIGN KEY (card_id) REFERENCES Cards(id)
);
