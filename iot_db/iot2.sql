SET SESSION FOREIGN_KEY_CHECKS=0;

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



