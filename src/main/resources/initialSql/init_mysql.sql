DROP TABLE IF EXISTS T_USER;
	
CREATE TABLE T_USER (
ID INT,
NAME VARCHAR(100),
SEX CHAR(2),
BIRTHDAY DATE
);

ALTER TABLE T_USER ADD CONSTRAINT PK_T_USER PRIMARY KEY (ID);


