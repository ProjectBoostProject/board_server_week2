DROP TABLE IF EXISTS Board;
DROP TABLE IF EXISTS Reply;
DROP TABLE IF EXISTS Menu;

CREATE TABLE Menu
(
    id          INT     PRIMARY KEY AUTO_INCREMENT,
    board_name  VARCHAR(50),
    introduce   VARCHAR(255);
)
CREATE TABLE Board
(
    id      INT          PRIMARY KEY AUTO_INCREMENT,
    menu_id INT,
    title   VARCHAR(255) NOT NULL,
    writer  VARCHAR(20)  NOT NULL,
    content VARCHAR(999) NOT NULL,
    password VARCHAR(20) NOT NULL,
    create_date TIMESTAMP  DEFAULT NOW(),
    update_date TIMESTAMP  DEFAULT NOW(),
    FOREIGN KEY (menu_id)
    REFERENCES Menu(id) On DELETE CASCADE
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