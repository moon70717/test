CREATE USER `TEST`@`LOCALHOST` IDENTIFIED BY 'TEST';

CREATE DATABASE TEST2;

GRANT ALL PRIVILEGES ON TEST2.* TO `TEST`@`LOCALHOST`;

SELECT SUM(DATA_LENGTH+INDEX_LENGTH)/1024/1024  FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_SCHEMA='IOT2';

SELECT @@GENERAL_LOG,@@VERSION;

SHOW VARIABLES
WHERE VARIABLE_NAME='VERSION'
OR VARIABLE_NAME='GENERAL_LOG';

SET GLOBAL GENERAL_LOG=1;


CREATE TABLE USER_INFO2(
USER_NUM INT(3) AUTO_INCREMENT PRIMARY KEY,
USER_ID VARCHAR(30) NOT NULL UNIQUE,
USER_NAME VARCHAR(30) NOT NULL
);

CREATE TABLE BOARD(
BOARD_NUM INT(3) AUTO_INCREMENT PRIMARY KEY,
BOARD_TITLE VARCHAR(30) NOT NULL,
USER_NUM INT(30) NOT NULL,
FOREIGN KEY(USER_NUM) REFERENCES USER_INFO2(USER_NUM)
);

SELECT * FROM USER_INFO2,BOARD;


DROP TABLE USER_INFO2;
DROP TABLE BOARD;



SELECT * FROM USER_INFO;

INSERT INTO USER_INFO(UINAME,UIAGE,UIID,UIPWD,CINO,uiregdate,address)
VALUES ("갑길동",33,"ttest","GGG",3,Now(),"");

delete from user_info where uino=3;