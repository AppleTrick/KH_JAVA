DROP TABLE TB_MEMEBER;
DROP SEQUENCE MEMBERSEQ;

CREATE SEQUENCE MEMBERSEQ;

-- 번호, 이름, 나이 , 성별, 지역 , 하는일, 전화 번호, 이메일

CREATE TABLE TB_MEMBER(
	M_NO NUMBER PRIMARY KEY,
	M_NAME VARCHAR2(20) NOT NULL,
	M_AGE NUMBER NOT NULL,
	M_GENDER VARCHAR2(2) CHECK(M_GENDER IN ('M','F')) NOT NULL,
	M_LOCATION VARCHAR2(50),
	M_JOB VARCHAR2(20),
	M_TEL VARCHAR2(20),
	M_EMAIL VARCHAR2(20)
);

INSERT INTO TB_MEMBER
VALUES(MEMBERSEQ.NEXTVAL, ' 관리자' , 100 , 'M' ,'수원' , '건물관리자' , '010-1111-1111' , 'ADMIN@ADMIN.COM');

SELECT M_NO, M_NAME,M_AGE,M_GENDER,M_LOCATION,M_JOB,M_TEL,M_EMAIL
FROM TB_MEMBER;