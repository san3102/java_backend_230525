### SQL 작성
# 주석
-- 이렇게 주석 해도 되고
/*
여러줄도 가능
*/

## DBMS 에서 Database는 폴더이다
## DBMS 에서 Table은 엑셀 파일(표)이다

## DBMS 사용법 -> SQL







# 전체 데이터베이스 리스팅
SHOW DATABASES;

# `mysql` 데이터 베이스 선택
USE mysql;

# 테이블 리스팅
SHOW TABLES;

# `db` 테이블의 구조 확인
DESC db;
DESC USER;

# 기존에 `board` 데이터베이스가 존재 한다면 삭제
DROP board;

# 새 데이터베이스(`board`) 생성
CREATE DATABASE board;

# 데이터베이스 추가 되었는지 확인
SHOW DATABASES;

# `board` 데이터 베이스 선택
USE board;

# 테이블 확인
SHOW TABLES;








# 전체 데이터베이스 리스팅
SHOW DATABASES;

# `mysql` 데이터 베이스 선택
USE mysql;

# 테이블 리스팅
SHOW TABLES;

# `db` 테이블의 구조 확인
DESC db;

# 기존에 `board` 데이터베이스가 존재 한다면 삭제
DROP board;

# 새 데이터베이스(`board`) 생성
CREATE DATABASE board;

# 데이터베이스 추가 되었는지 확인
SHOW DATABASES;
# `board` 데이터 베이스 선택
USE board;
# 테이블 확인
SHOW TABLES;

USE a1;
SHOW TABLES;

SELECT * FROM article;






SHOW DATABASES;
USE board;
SHOW TABLES;
# 게시물 테이블(`article`)을 만듭니다.
CREATE TABLE article(
    title CHAR(100),
    content TEXT
);

## 용어 정리
# column(열) == field(속성)
# row(행) == record(필드의 집합)
# table(표) == entity(개체)

# 잘 추가되었는지 확인
SHOW TABLES;
DESC article;

# 제목은 '제목1', 내용은 '내용1'인 데이터 하나 추가 
# 행단위로 추가합니다.
INSERT INTO article SET title = '제목1', content = '내용1';

# 제목 조회
SELECT title FROM article;

# 내용 조회
SELECT content FROM article;

# 제목, 내용 칼럼 데이터 조회
SELECT title, content FROM article;

# 내용, 제목 칼럼 데이터 조회
SELECT content, title FROM article;

# 모든 데이터 조회
SELECT * FROM article ;












SHOW DATABASES;
DROP board;
SHOW TABLES;
# 게시물 테이블(`article`)을 만듭니다.
USE board;
CREATE TABLE article2(
    title CHAR(50),
    content TEXT
);

# 잘 추가되었는지 확인
SHOW TABLES;

# 제목은 '제목1', 내용은 '내용1'인 데이터 하나 추가 
SELECT * FROM article;
INSERT INTO article2 SET title='제목1', content='내용1';

# 제목 조회

# 내용 조회

# 제목, 내용 칼럼 데이터 조회

# 내용, 제목 칼럼 데이터 조회

# 모든 데이터 조회

























DROP DATABASE board;
SHOW DATABASES;
CREATE DATABASE board;
USE board;
SHOW TABLES;
CREATE TABLE article(
    title CHAR(50),
    content TEXT
);
INSERT INTO article SET title='제목1', content='내용1';
SELECT * FROM article;












# 테이블의 모든 데이터 지우기
DELETE FROM article;
SELECT * FROM article;

# 제목1, 내용1 데이터 추가
INSERT INTO article SET title='제목1', content='내용1';

# 제목2, 내용2 데이터 추가
INSERT INTO article SET title='제목2', content='내용2';

# 데이터 조회
SELECT * FROM article;

# 제목 데이터 aaa로 수정(모두 수정됨..)
UPDATE article SET title='aaa';

# `body`가 내용2인 것만 조회
SELECT * FROM article WHERE content='내용2';

# 내용2만 새로운내용2 로 수정
UPDATE article SET content='새로운 내용2' WHERE content='내용2';

# 데이터 조회
SELECT * FROM article;

# 데이터 삭제 (모든 데이터가 삭제...)
DELETE FROM article;

# 제목1, 내용1 데이터 추가
INSERT INTO article SET title='제목1', content='내용1';

# 제목2, 내용2 데이터 추가
INSERT INTO article SET title='제목2', content='내용2';

# 제목이 제목1인 것만 삭제
DELETE FROM article WHERE title='제목1';








# 테이블의 모든 데이터 지우기
SHOW DATABASES;
DROP DATABASE board;
CREATE DATABASE board;
SHOW TABLES;
CREATE TABLE article(
    title CHAR(50),
    content TEXT 
);
DELETE FROM article;
DROP TABLE article;

SELECT * FROM article;
# 제목1, 내용1 데이터 추가
INSERT INTO article SET title='제목1', content='내용1';
INSERT INTO article SET title='제목2', content='내용2';

UPDATE article SET title='새로운 제목1' WHERE title = '제목1';
DELETE FROM article WHERE content='내용2';

# 제목2, 내용2 데이터 추가

# 데이터 조회

# 제목 데이터 aaa로 수정(모두 수정됨..)

# `body`가 내용2인 것만 조회

# 내용2만 새로운내용2 로 수정

# 데이터 조회

# 데이터 삭제 (모든 데이터가 삭제...)

# 제목1, 내용1 데이터 추가

# 제목2, 내용2 데이터 추가

# 제목이 제목1인 것만 삭제























# board DB 선택
USE board;

# 게시물 조회
SHOW TABLES;
SELECT *
FROM article;

# article 테이블 데이터 삭제
DELETE FROM article;
CREATE TABLE article(
    title CHAR(50),
    content TEXT
);

# 제목3, 내용3 데이터 두개 추가
INSERT INTO article SET title='제목3', content='내용3';

# 제목3인 게시물 중 두번째 것만 제목을 새제목3으로 수정 (게시물 구분 안됨)
# update article from 

# 테이블 구조 확인
# key -> 식별용 데이터 ( 중복 x, 반드시 데이터를 기입 )

DESC article;

# ALTER - 구조 변경
# 테이블 구조 수정 - 칼럼 추가(ADD), 기존 칼럼 삭제(DROP), 기존 칼럼 내용 변경(MODIFY)
# 식별용 데이터를 저장할 id 컬럼 추가
ALTER TABLE article ADD id INT;

# 데이터 조회(새로 생긴 id 칼럼의 값은 NULL)
# NULL => 데이터가 없음을 명시
SELECT *
FROM article;

# 기존 데이터 중 1개만 id를 2로 변경
SELECT *
FROM article
LIMIT 1;

UPDATE article
SET id = 2
LIMIT 1;
 
# 데이터 조회

# 2번 게시물만 조회
SELECT *
FROM article
WHERE id=2;


# 2번 게시물이 아닌 게시물 조회 (안나옴.. 값이 null인 것은 필터 대상이 안됨)
SELECT *
FROM article
WHERE id != 2;

# NULL인 데이터를 필터 검색
SELECT *
FROM article
WHERE id IS NULL;

# id가 null인 행 찾아서 id값을 1로 수정.
UPDATE article
SET id=1
WHERE id IS NULL;

# 데이터 조회
SELECT *
FROM article;

# id가 2, 제목은 제목4, 내용은 내용4인  게시물데이터 추가 (id 2인 값이 존재하지만 중복등록 됨.)
INSERT INTO article
SET id=2, title = '제목4', content = '내용4';

# 데이터 조회
SELECT *
FROM article;

# id 컬럼에 unique, not null 제약 걸기(이미 중복되는 데이터가 있기 때문에 제약이 걸리지 않음)
DESC article;

UPDATE article
SET id = 3
LIMIT 1;

ALTER TABLE article MODIFY id INT NOT NULL UNIQUE;

# 2번 게시물, 데이터 삭제 => DELETE

# 다시 id 컬럼에 unique, not null 제약 걸기

# 구조 확인

# id 없이 게시물 하나 추가. 제목1, 내용1 (id가 not null이라 0으로 바뀌어서 들어감)

# id 없이 게시물 하나 추가. 제목2, 내용2 (0이 이미 존재하므로 등록이 안됨)

# id 컬럼에 자동증가제약 추가

# 구조 확인

# id 없이 게시물 하나 추가. 제목1, 내용1

# id 없이 게시물 하나 추가. 제목2, 내용2

# 데이터 확인
