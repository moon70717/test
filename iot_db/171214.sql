/*
USE iot2;

CREATE TABLE user_info(
	userno int auto_increment primary key,
	username varchar(100) not null,
	userage int(5) not null,
	userid varchar(100) not null,
	userpwd varchar(100) not null
);


INSERT INTO user_info
VALUES(1,'홍길동',20,'testid','testpw');

INSERT INTO user_info(username,userage,userid,userpwd)
VALUES('홍길동',20,'testid','testpw');

INSERT INTO user_info(username,userage,userid,userpwd)
VALUES('김길동',22,'tset','test');

INSERT INTO user_info(username,userage,userid,userpwd)
VALUES('김길김',22,'tset3','test3');

SELECT * FROM user_info
WHERE userno NOT IN(2,3);

SELECT * FROM user_info
WHERE username NOT LIKE '김%';

UPDATE USER_INFO  
SET USERNAME='김화동' , USERAGE=30 
WHERE USERNO=5;

SELECT * FROM USER_INFO;

DELETE FROM USER_INFO
WHERE USERNAME='홍길동';

SELECT * FROM USER_INFO
WHERE USERNO=(SELECT MIN(USERNO) 
FROM USER_INFO 
WHERE USERNAME='김길김');

SELECT SUM(USERAGE),AVG(USERAGE), COUNT(USERAGE) 
FROM USER_INFO;

DROP TABLE USER_INFO;

insert into user_info(username,userage,userid,userpwd)
values('홍길동',30,'hong','hong'),
('흙길동',10,'black','black'),
('백길동',40,'white','white'),
('청길동',52,'blue','blue');


#얍야뱌얍야얌ㄴ림ㄴ른ㅁㄹㄴㅁㄹㄴㅁㄹㄴㅁㄹㄴㅁㄹㄴㅁㄹㄴㅁ
SELECT * FROM USER_INFO
WHERE USERAGE<=30 AND USERNAME LIKE '흙%';

SELECT * FROM USER_INFO
WHERE USERAGE=52 OR USERID='hong';

SELECT * FROM USER_INFO
WHERE USERAGE>=20 OR USERAGE<=30;

/*
userage가 가장 작은 사람이거나 제일 많은사람을 검색해주세요
*/
/*
SELECT * FROM USER_INFO
WHERE USERAGE IN ((SELECT MIN(USERAGE)
FROM USER_INFO), (SELECT MAX(USERAGE) 
FROM USER_INFO));

SELECT * FROM USER_INFO h1,
(SELECT MIN(USERAGE) B FROM USER_INFO)A
WHERE H1.USERAGE=A.B;

CREATE TABLE class_info(
cino int auto_increment primary key,
ciname varchar(100) not null,
cidesc varchar(500)
);


INSERT INTO class_info(ciname, cidesc)
VALUES ('포토일러','포토샵과 일러스트반');
ALTER TABLE USER_INFO
ADD COLUMN cino INT NOT NULL DEFAULT 1;

SELECT USER.USERNO AS NO, USER.USERNAME AS NAME 
FROM USER_INFO AS USER;

SELECT * FROM USER_INFO AS USER,
(SELECT * FROM CLASS_INFO) AS CLASS;
user_infouser_info
SELECT UI.USERNO, UI.USERNAME, 
CI.CINO, CI.CINAME, CI.CIDESC 
FROM USER_INFO UI,
CLASS_INFO CI
WHERE UI.CINO=CI.CINO;

UPDATE CLASS_INFO
SET CIDESC='IOT CLASS'
WHERE CINO=1;

SELECT * FROM CLASS_INFO;

UPDATE USER_INFO
SET CINO=2
WHERE USERNO>2;

SELECT CI.CINO, CI.CINAME, COUNT(*)
FROM USER_INFO UI,
CLASS_INFO CI
WHERE UI.CINO=CI.CINO
GROUP BY CI.CINO,CI.CINAME;

SELECT CI.CINO, CI.CINAME ,(SELECT COUNT(*) FROM USER_INFO UI
WHERE UI.CINO=CI.CINO)AS COUNT FROM CLASS_INFO CI
GROUP BY CI.CINO, CI.CINAME;

INSERT INTO class_info(ciname, cidesc)
VALUES ('포토일러','포토샵과 일러스트반');

INSERT INTO USER_INFO(username,userage,userid,userpwd,CINO)
VALUES('오길동',20,'OH','OH',(SELECT CI.CINO FROM CLASS_INFO CI
WHERE CI.CINAME='포토일러'));

SELECT UI.* FROM USER_INFO UI
WHERE UI.CINO=(SELECT CI2.CINO FROM CLASS_INFO CI2
WHERE CI2.CINAME='IOT');

SELECT UI.*, CI.* FROM USER_INFO UI,
CLASS_INFO CI
WHERE UI.USERAGE>=30
AND CI.CIDESC LIKE '%반%'
AND CI.CINO=UI.CINO;

SELECT UI.*, CI.* FROM USER_INFO UI,
CLASS_INFO CI
WHERE CI.CINAME LIKE '%퍼블%'
AND CI.CINO=UI.CINO;

UI.CINO IN((SELECT CI.CINO 
FROM CLASS_INFO
WHERE CI.CINAME LIKE ('%퍼블%')));


SELECT UI.*,CI.* FROM USER_INFO UI,
CLASS_INFO CI
WHERE UI.CINO=CI.CINO;

SELECT * FROM USER_INFO;

INSERT INTO USER_INFO(USERNAME, USERAGE, USERID, USERPWD, CINO)
VALUES('TEST',20,'TEST','TEST',5);

DELETE FROM CLASS_INFO
WHERE CINO=4;

DROP TABLE USER_INFO, CLASS_INFO;

*//* Drop Tables */

DROP TABLE IF EXISTS user_info;
DROP TABLE IF EXISTS class_info;




/* Create Tables */

-- 반 정보
CREATE TABLE class_info
(
	cino int unsigned NOT NULL AUTO_INCREMENT COMMENT '반 번호',
	ciname varchar(100) NOT NULL COMMENT '반 이름',
	cidesc varchar(100) COMMENT '반 설명',
	PRIMARY KEY (cino),
	UNIQUE (ciname)
) COMMENT = '반 정보';


-- 유저정보테이블
CREATE TABLE user_info
(
	urno int unsigned NOT NULL AUTO_INCREMENT COMMENT '유저번호',
	urname varchar(100) NOT NULL COMMENT '유저이름',
	urage tinyint unsigned NOT NULL COMMENT '유저나이',
	urid varchar(100) NOT NULL COMMENT '유저아이디',
	urpwd varchar(100) NOT NULL COMMENT '유저비밀번호',
	cino int unsigned NOT NULL COMMENT '반 번호',
	PRIMARY KEY (urno),
	UNIQUE (urid)
) COMMENT = '유저정보테이블';



/* Create Foreign Keys */

ALTER TABLE user_info
	ADD CONSTRAINT FK_class_info_cino FOREIGN KEY (cino)
	REFERENCES class_info (cino)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;





/* Drop Tables */

DROP TABLE IF EXISTS user_info;
DROP TABLE IF EXISTS class_info;




/* Create Tables */

-- 반 정보
CREATE TABLE class_info
(
	cino int unsigned NOT NULL AUTO_INCREMENT COMMENT '반 번호',
	ciname varchar(100) NOT NULL COMMENT '반 이름',
	cidesc varchar(100) COMMENT '반 설명',
	PRIMARY KEY (cino),
	UNIQUE (ciname)
) COMMENT = '반 정보';


-- 유저정보테이블
CREATE TABLE user_info
(
	urno int unsigned NOT NULL AUTO_INCREMENT COMMENT '유저번호',
	urname varchar(100) NOT NULL COMMENT '유저이름',
	urage tinyint unsigned NOT NULL COMMENT '유저나이',
	urid varchar(100) NOT NULL COMMENT '유저아이디',
	urpwd varchar(100) NOT NULL COMMENT '유저비밀번호',
	cino int unsigned NOT NULL COMMENT '반 번호',
	PRIMARY KEY (urno),
	UNIQUE (urid)
) COMMENT = '유저정보테이블';



/* Create Foreign Keys */

ALTER TABLE user_info
	ADD CONSTRAINT FK_class_info_cino FOREIGN KEY (cino)
	REFERENCES class_info (cino)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


SELECT * FROM USER_INFOclass_infoclass_info;

INSERT INTO CLASS_INFO
(CINAME,CIDESC)
VALUES('IOT','IOT반'),
('3D','3D함'),
('정보보안','보안');

SELECT * FROM USER_INFO;

INSERT INTO USER_INFO(URNAME,URAGE,URID,URPWD,CINO)
VALUES('홍길동',30,'RED','RED',1),
('금길동',20,'GOLD','GOLD',2),
('백길동',10,'WHITE','WHITE',3);

SELECT * FROM USER_INFO UI,
CLASS_INFO CI
WHERE UI.CINO=CI.CINO;

#AUTOCOMMIT 관련 설정
SELECT @@AUTOCOMMIT;
SET @@AUTOCOMMIT=0;

INSERT INTO USER_INFO(URNAME,URAGE,URID,URPWD,CINO)
VALUES('청길동',30,'BLUE3','BLUE',1);

SELECT * FROM USER_INFO;
ROLLBACK;
COMMIT;

ALTER TABLE USER_INFO
DROP COLUMN uiregdate;

ALTER TABLE USER_INFO
ADD COLUMN uiregdate DATETIME DEFAULT now();

SELECT UINO, CONCAT(UINAME,UIAGE) UINAMENAGE, UIID FROM USER_INFO;

SELECT UI.*, CI.* FROM USER_INFO UI, CLASS_INFO CI
WHERE UI.CINO=CI.CINO
GROUP BY CI.CINAME, CI.CIDESC;

