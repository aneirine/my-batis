create table if not exists users
(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    `name`  VARCHAR(100) NOT NULL,
    `salary` INTEGER NOT NULL
);