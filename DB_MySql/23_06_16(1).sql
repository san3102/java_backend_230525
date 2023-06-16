# board DB 선택
SHOW DATABASES;
SHOW TABLES;

# 게시물 조회
SELECT *
FROM article;

# article 테이블 데이터 삭제
DROP TABLE article;
CREATE TABLE article(
    title CHAR(50),
    content TEXT
);

# 제목3, 내용3 데이터 두개 추가
INSERT INTO article SET title='제목3', content='내용3';

# 제목3인 게시물 중 두번째 것만 제목을 새제목3으로 수정 (게시물 구분 안됨)

# 테이블 구조 확인
DESC article;

# 테이블 구조 수정 - 칼럼 추가(ADD), 기존 칼럼 삭제(DROP), 기존 칼럼 내용 변경(MODIFY)
# 식별용 데이터를 저장할 id 컬럼 추가
DESC article;
ALTER TABLE article ADD id INT;
ALTER TABLE article MODIFY id INT NOT NULL UNIQUE;
ALTER TABLE article DROP id;

# 데이터 조회(새로 생긴 id 칼럼의 값은 NULL)

# 기존 데이터 중 1개만 id를 2로 변경
UPDATE article
SET id = 2
LIMIT 1; 

# 데이터 조회
SELECT *
FROM article;

# 2번 게시물만 조회
SELECT *
FROM article
WHERE id = 2;

# 2번 게시물이 아닌 게시물 조회 (안나옴.. 값이 null인 것은 필터 대상이 안됨)

# NULL인 데이터를 필터 검색
SELECT *
FROM article
WHERE IS NULL;

# id가 null인 행 찾아서 id값을 1로 수정.

# 데이터 조회

# id가 2, 제목은 제목4, 내용은 내용4인  게시물데이터 추가 (id 2인 값이 존재하지만 중복등록 됨.)

# 데이터 조회

# id 컬럼에 unique, not null 제약 걸기(이미 중복되는 데이터가 있기 때문에 제약이 걸리지 않음)

# 2번 게시물, 데이터 삭제 => DELETE

# 다시 id 컬럼에 unique, not null 제약 걸기

# 구조 확인

# id 없이 게시물 하나 추가. 제목1, 내용1 (id가 not null이라 0으로 바뀌어서 들어감)
INSERT INTO article SET title = '제목1', content = '내용1';

SELECT *
FROM article;

# id 없이 게시물 하나 추가. 제목2, 내용2 (0이 이미 존재하므로 등록이 안됨)

# id 컬럼에 자동증가제약 추가 - auto_increment > 보통 테이블을 생성할 때 추가해줌, key 컬럼에만 적용된다

ALTER TABLE article ADD id INT AUTO_INCREMENT NOT NULL UNIQUE;
ALTER TABLE article MODIFY id INT AUTO_INCREMENT; 

DELETE FROM article;

# 구조 확인
DESC article;

# id 없이 게시물 하나 추가. 제목1, 내용1
INSERT INTO article SET title = '제목1', content = '내용1';

# id 없이 게시물 하나 추가. 제목2, 내용2
INSERT INTO article SET title = '제목2', content = '내용2';

# 데이터 확인
SELECT *
FROM article;
