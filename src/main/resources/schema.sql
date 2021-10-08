DROP TABLE IF EXISTS Board;
DROP TABLE IF EXISTS Reply;

CREATE TABLE Board
(
    id      INT          PRIMARY KEY AUTO_INCREMENT,
    title   VARCHAR(255) NOT NULL,
    writer  VARCHAR(20)  NOT NULL,
    content VARCHAR(999) NOT NULL,
    password VARCHAR(20) NOT NULL,
    create_date TIMESTAMP  DEFAULT NOW(),
    update_date TIMESTAMP  DEFAULT NOW()
);

CREATE TABLE Reply
(
    id      INT          PRIMARY KEY AUTO_INCREMENT,
    board_id INT,
    writer  VARCHAR(20)  NOT NULL,
    content VARCHAR(999) NOT NULL,
    password VARCHAR(20) NOT NULL,
    create_date TIMESTAMP  DEFAULT NOW(),
    FOREIGN KEY (board_id)
    REFERENCES Board(id) ON DELETE CASCADE
);