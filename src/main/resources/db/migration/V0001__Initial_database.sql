create table AUTHORS
(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(100)
);

create table BOOKS
(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(100),
    AUTHOR_ID INTEGER,
    FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHORS(ID) ON DELETE CASCADE
);