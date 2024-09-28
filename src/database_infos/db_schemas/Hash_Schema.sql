CREATE TABLE Hash (
    id BIGINT PRIMARY KEY NOT NULL,
    hash_password VARCHAR(64) NOT NULL,
    salt_increment VARCHAR(32) NOT NULL,
    user_id BIGINT NOT NULL,
    CONSTRAINT hash_users_seq_id
        FOREIGN KEY (user_id) REFERENCES Users(id)
);