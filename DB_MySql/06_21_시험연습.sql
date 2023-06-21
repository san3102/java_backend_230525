DROP DATABASE exam3;

CREATE DATABASE exam3;

USE exam3;

# 게시판 테이블
CREATE TABLE `board` (
	bno INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, # 게시판 번호
	bname VARCHAR(30) NOT NULL,                           # 게시판 이름
	updateDate DATETIME NOT NULL,                # 수정 날짜
 regDate DATETIME NOT NULL                   # 등록 날짜 
);

# 게시물 테이블
CREATE TABLE article(
	ano INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,  # 게시물 번호
	mno INT UNSIGNED NOT NULL,                    # 회원 번호
	bno INT UNSIGNED NOT NULL,                    # 게시판 번호
	title VARCHAR(200) NOT NULL,                  # 제목
	`body` TEXT NOT NULL,                         # 내용
	hit INT UNSIGNED NOT NULL,                    # 조회쉬
 updateDate DATETIME NOT NULL,                 # 수정 날짜
	regDate DATETIME NOT NULL	                     # 등록 날짜
);

# 회원 테이블
CREATE TABLE `member` (
	mno INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,  # 회원 번호
	loginId VARCHAR(30) UNIQUE NOT NULL,          # 로그인 아이디
	loginPw VARCHAR(30) NOT NULL,                 # 로그인 
	rname VARCHAR(30) NOT NULL,                   # 실명
	nname VARCHAR(30) UNIQUE NOT NULL,            # 닉네임
 updateDate DATETIME NOT NULL,                 # 수정 날짜
	regDate DATETIME NOT NULL                     # 등록 날짜
);

# 댓글 테이블
CREATE TABLE `articleReply` (
	arno INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,  # 댓글번호
	ano INT UNSIGNED NOT NULL,                     # 게시물 번호
	rbody VARCHAR(200) NOT NULL,                            # 댓글내용
	mno INT UNSIGNED NOT NULL,                     # 회원 번호
 updateDate DATETIME NOT NULL,                  # 수정 날짜
	regDate DATETIME NOT NULL                      # 등록 날짜
);

# 좋아요 테이블
CREATE TABLE `like` (
	 ano INT NOT NULL,                              # 게시물 번호
 	mno INT NOT NULL,                              # 회원 번호
 updateDate DATETIME NOT NULL,                  # 수정 날짜
	 regDate DATETIME NOT NULL,                     # 등록 날짜
 PRIMARY KEY(ano, mno)
);

INSERT INTO `member`
SET loginId = 'user1'
  , loginPw = '1234'
  , rname = '홍길동'
  , nname = '신출귀몰'
  , updateDate = NOW()
  , regDate = NOW();
  
INSERT INTO `member`
SET loginId = 'user2'
  , loginPw = '4321'
  , rname = '이순신'
  , nname = '구국의 영웅'
  , updateDate = NOW()
  , regDate = NOW();
  
INSERT INTO `member`
SET loginId = 'user3'
  , loginPw = '1423'
  , rname = '임꺽정'
  , nname = '힘쎈장사'
  , updateDate = NOW()
  , regDate = NOW();

INSERT INTO `member`
SET loginId = 'user4'
  , loginPw = '3131'
  , rname = '유관순'
  , nname = '독립열사'
  , updateDate = NOW()
  , regDate = NOW();

DESC board;

INSERT INTO board
SET bname = '질문과 답변'
  , updateDate = NOW()
  , regDate = NOW();

INSERT INTO board
SET bname = '공지사항'
  , updateDate = NOW()
  , regDate = NOW();

INSERT INTO board
SET bname = '자유게시판'
  , updateDate = NOW()
  , regDate = NOW();


DESC article;

INSERT INTO article
SET bno = 3
  , title = '제목1'
  , `body` = '내용1'
  , mno = 1
  , hit = 10
  , updateDate = '20200303123000'
  , regDate = '20200303123000';

INSERT INTO article
SET bno = 3
  , title = '제목2'
  , `body` = '내용2'
  , mno = 1
  , hit = 23
  , updateDate = '20210506151200'
  , regDate = '20210506151200';

INSERT INTO article
SET bno = 3
  , title = '제목3'
  , `body` = '내용3'
  , mno = 1
  , hit = 31
  , updateDate = '20220102190800'
  , regDate = '20220102190800';
  
INSERT INTO article
SET bno = 3
  , title = '제목4'
  , `body` = '내용4'
  , mno = 2
  , hit = 100
  , updateDate = '20210401083000'
  , regDate = '20210401083000';
  
INSERT INTO article
SET bno = 3
  , title = '제목5'
  , `body` = '내용5'
  , mno = 2
  , hit = 13
  , updateDate = '20210507162200'
  , regDate = '20210507162200';

INSERT INTO article
SET bno = 2
  , title = '제목6'
  , `body` = '내용6'
  , mno = 2
  , hit = 112
  , updateDate = '20200303123000'
  , regDate = '20200303123000';


INSERT INTO article
SET bno = 2
  , title = '제목7'
  , `body` = '내용7'
  , mno = 2
  , hit = 224
  , updateDate = '20210601171200'
  , regDate = '20210601171200';
  
INSERT INTO article
SET bno = 1
  , title = '제목8'
  , `body` = '내용8'
  , mno = 3
  , hit = 87
  , updateDate = '20200701223000'
  , regDate = '20200701223000';

INSERT INTO article
SET bno = 1
  , title = '제목9'
  , `body` = '내용9'
  , mno = 3
  , hit = 56
  , updateDate = '20220303231200'
  , regDate = '20220303231200';

INSERT INTO article
SET bno = 1
  , title = '제목10'
  , `body` = '내용10'
  , mno = 2
  , hit = 3
  , updateDate = '20220401200000'
  , regDate = '20220401200000';
  

INSERT INTO articleReply
SET ano = 1
  , mno = 3
  , `rbody` = '댓글내용1'
  , updateDate = '20210405151200'
  , regDate = '20210405151200';

INSERT INTO articleReply
SET ano = 1
  , mno = 3
  , `rbody` = '댓글내용2'
  , updateDate = '20210502190800'
  , regDate = '20210502190800';
  
INSERT INTO articleReply
SET ano = 6
  , mno = 1
  , `rbody` = '댓글내용3'
  , updateDate = '20200303123000'
  , regDate = '20200303123000';
  
INSERT INTO articleReply
SET ano = 6
  , mno = 1
  , `rbody` = '댓글내용4'
  , updateDate = '20200305151200'
  , regDate = '20200305151200';
  
INSERT INTO articleReply
SET ano = 6
  , mno = 1
  , `rbody` = '댓글내용5'
  , updateDate = '20200312190800'
  , regDate = '20200312190800';
  
INSERT INTO articleReply
SET ano = 7
  , mno = 1
  , `rbody` = '댓글내용6'
  , updateDate = '20210603123000'
  , regDate = '20210603123000';
  
INSERT INTO articleReply
SET ano = 7
  , mno = 1
  , `rbody` = '댓글내용7'
  , updateDate = '20210605151200'
  , regDate = '20210605151200';
  
INSERT INTO articleReply
SET ano = 7
  , mno = 1
  , `rbody` = '댓글내용8'
  , updateDate = '20220401190800'
  , regDate = '20220401190800';
  
INSERT INTO articleReply
SET ano = 8
  , mno = 3
  , `rbody` = '댓글내용9'
  , updateDate = '20200705133200'
  , regDate = '20200705133200';
  
INSERT INTO articleReply
SET ano = 8
  , mno = 3
  , `rbody` = '댓글내용10'
  , updateDate = '20200707111500'
  , regDate = '20200707111500';
  
INSERT INTO articleReply
SET ano = 9
  , mno = 3
  , `rbody` = '댓글내용11'
  , updateDate = '20220605152200'
  , regDate = '20220605152200';

INSERT INTO articleReply
SET ano = 9
  , mno = 3
  , `rbody` = '댓글내용12'
  , updateDate = '20220703171400'
  , regDate = '20220703171400';

INSERT INTO articleReply
SET ano = 9
  , mno = 2
  , `rbody` = '댓글내용13'
  , updateDate = '20220304170200'
  , regDate = '20220304170200';
  
INSERT INTO articleReply
SET ano = 9
  , mno = 2
  , `rbody` = '댓글내용14'
  , updateDate = '20220307123200'
  , regDate = '20220307123200';
  
INSERT INTO articleReply
SET ano = 9
  , mno = 2
  , `rbody` = '댓글내용15'
  , updateDate = '20220307161500'
  , regDate = '20220307161500';  
  
INSERT INTO `like`
SET ano = 1
  , mno = 2;  
  

INSERT INTO `like`
SET ano = 4
  , mno = 2;  
  
INSERT INTO `like`
SET ano = 1
  , mno = 1;  
  
INSERT INTO `like`
SET ano = 1
  , mno = 4;  
  

INSERT INTO `like`
SET ano = 7
  , mno = 1;  
  
INSERT INTO `like`
SET ano = 7
  , mno = 4;

INSERT INTO `like`
SET ano = 10
  , mno = 2;
  
INSERT INTO `like`
SET ano = 10
  , mno = 1;

INSERT INTO `like`
SET ano = 10
  , mno = 4;  
  
INSERT INTO `like`
SET ano = 10
  , mno = 3;
  
INSERT INTO `like`
SET ano = 1
  , mno = 3;
  
INSERT INTO `like`
SET ano = 6
  , mno = 4;

INSERT INTO `like`
SET ano = 3
  , mno = 4;


SELECT * 
FROM article;

SELECT *
FROM articleReply;

SELECT * 
FROM `member`;

SELECT *
FROM board;

SELECT *
FROM `like`;

# 모든 게시물의 개수 출력
SELECT COUNT(ano) AS `total`
FROM article;

# 모든 게시물의 조회수의 총합 출력
SELECT SUM(hit) AS total_hit
FROM article;

# 이순신이 작성한 댓글의 내용, 작성자 닉네임, 작성일 출력. 작성일로 내림차순
SELECT * FROM articleReply;	# mno
SELECT * FROM `member`;		# mno

SELECT a.rbody, m.rname, a.regDate
FROM articleReply AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
WHERE m.rname = '이순신';

# 작성자명에 '사'가 들어가는 작성자의 모든 게시물 조회(게시물번호, 제목, 내용, 조회수, 작성자 닉네임, 작성일). 작성일로 내림차순
SELECT * FROM article;		# mno
SELECT * FROM `member`;		# mno

SELECT a.ano, a.title, a.body, a.hit, m.nname, a.regDate
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
WHERE m.nname LIKE '%사%';

# 자유게시판에서 제목에 '제'라는 문자가 포함된 모든 게시물 조회(게시물번호, 제목, 내용, 조회수, 작성자 닉네임, 작성일). 작성일로 내림차순
SELECT * FROM `board`;		# bno
SELECT * FROM article;		# bno, mno
SELECT * FROM `member`;		# mno

SELECT a.ano, a.title, a.body, a.hit, m.nname, a.regDate
FROM `board` AS b
INNER JOIN article AS a
ON b.bno = a.bno
INNER JOIN `member` AS m
ON a.mno = m.mno
WHERE b.bno = 3
AND a.title LIKE '%제%';

# 각 게시판별 게시판 이름과 총 게시물 수 출력. 게시물 수 내림차순
SELECT * FROM `board`;		# bno
SELECT * FROM article;		# bno

SELECT b.bname ,COUNT(b.bno) AS total_articles
FROM `board` AS b
INNER JOIN article AS a
ON b.bno = a.bno
GROUP BY bname
ORDER BY total_articles DESC;

# 최근 1년 사이의 게시물 제목, 내용, 작성자 닉네임, 작성일 출력 . 작성일로 내림차순
SELECT * FROM article;		# mno
SELECT * FROM `member`;		# mno

SELECT a.title, a.body, m.nname, a.regDate
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
WHERE a.regDate >= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)
ORDER BY a.regDate DESC;

# 최근 반년 사이의 게시물 제목, 내용, 작성자 닉네임, 작성일 출력 . 작성일로 내림차순
SELECT * FROM article;		# mno
SELECT * FROM `member`;		# mno

SELECT a.title, a.body, m.nname, a.regDate
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
WHERE a.regDate >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH)
ORDER BY a.regDate DESC;

# 연도별 게시물 등록 개수 현황 출력. 연도 오름차순
SELECT YEAR(regDate),COUNT(regDate) AS total
FROM article
GROUP BY YEAR(regDate)
ORDER BY YEAR(regDate);

# 가장 댓글이 많은 게시판의 게시판 이름과 댓글 수 출력. 댓글 수 내림차순
SELECT * FROM `board`;		# bno
SELECT * FROM article;		# bno, mno
SELECT * FROM articleReply;	# mno
SELECT * FROM `member`;		# mno

SELECT b.bname, COUNT(b.bno) AS reply_total
FROM `board` AS b
INNER JOIN article AS a
ON b.bno = a.bno
INNER JOIN `member` AS m
ON a.mno = m.mno
INNER JOIN articleReply AS r
ON a.ano = r.ano
GROUP BY b.bno
ORDER BY reply_total DESC;

# 모든 게시물의 게시판이름, 제목, 작성자닉네임, 게시물작성일, 조회수, 좋아요수, 댓글수 출력. 
SELECT * FROM article;		# bno
SELECT * FROM `board`;		# bno, mno
SELECT * FROM `member`;		# mno, ano
SELECT * FROM articleReply;	# ano
SELECT * FROM `like`;		# ano

SELECT b.bname, a.title, m.nname, a.regDate, COUNT(l.ano) AS likes, COUNT(r.arno) AS comments
FROM article AS a
INNER JOIN `board` AS b
ON a.bno = b.bno
INNER JOIN `member` AS m
ON a.mno = m.mno
LEFT OUTER JOIN `like` AS l
ON a.ano = l.ano
LEFT OUTER JOIN articleReply AS r
ON a.ano = r.ano
GROUP BY a.ano;

# 각 게시물 별 댓글 수 내림차순, 댓글수가 같으면 게시물번호로 오름차순 (없으면 0개라고 표시)으로 출력
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply GROUP BY ano;	
SELECT * FROM `like`;

SELECT a.ano, COUNT(r.mno) AS comments
FROM article AS a
LEFT OUTER JOIN articleReply AS r
ON a.ano = r.ano
GROUP BY a.ano
ORDER BY comments DESC, a.ano ASC;

# 각 회원별 게시물 수 내림차순, 게시물 수가 같으면 회원번호로 오름차순(없으면 0개라고 표시)으로 출력
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT m.mno, COUNT(a.ano) AS articles
FROM `member` AS m
LEFT OUTER JOIN article AS a
ON m.mno = a.mno
GROUP BY m.mno
ORDER BY articles DESC, m.mno ASC;

# 각 회원별 댓글 수 내림차순, 댓글 수가 같으면 회원번호로 오름차순(없으면 0개라고 표시)으로 출력
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT m.mno, COUNT(r.ano) AS comments
FROM `member` AS m
LEFT OUTER JOIN articleReply AS r
ON m.mno = r.mno
GROUP BY m.mno
ORDER BY comments DESC, m.mno ASC;

# 좋아요를 가장 많이 받은 회원의 아이디, 이름, 총 좋아요개수
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT m.loginId, m.rname, COUNT(l.ano) AS likes
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
LEFT OUTER JOIN `like` AS l
ON a.ano = l.ano
GROUP BY l.ano
ORDER BY likes DESC;

# 각 회원별 게시물의 조회수 총합 내립차순, 조회수가 같으면 회원번호로 오름차순 출력 
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT m.mno, SUM(a.hit) AS views
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
GROUP BY m.mno
ORDER BY views DESC, m.mno ASC;

# 총 조회수가 가장 많은 게시판의 이름
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT b.bname, COUNT(b.bno) AS views
FROM `board` AS b
INNER JOIN article AS a
ON b.bno = a.bno
GROUP BY b.bno
ORDER BY views DESC;

# 게시판 별 가장 조회수가 높은 게시물 top 3의 게시물 제목, 내용, 작성자닉네임, 조회수 출력. 조회수 내림차순
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT a.title, a.body, m.nname, a.hit
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
WHERE a.bno = 3			# 게시판별 1,2,3 바꿔주면 됨
ORDER BY a.hit DESC;

# 모든 게시물 중 가장 조회수가 높은 게시물 top 3의 게시물 제목, 내용, 작성자닉네임, 조회수 출력. 조회수 내림차순
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT a.title, a.body, m.nname, a.hit
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
ORDER BY a.hit DESC
LIMIT 3;

# 모든 게시물 중 가장 댓글이 많은 게시물 top 3의 게시물번호, 게시물제목, 작성자닉네임, 게시물작성일, 댓글 수 출력. 댓글 수 내림차순
SELECT * FROM article;		
SELECT * FROM `board`;		
SELECT * FROM `member`;		
SELECT * FROM articleReply;	
SELECT * FROM `like`;

SELECT *, COUNT(r.arno) AS comments
FROM article AS a
INNER JOIN `member` AS m
ON a.mno = m.mno
LEFT OUTER JOIN articleReply AS r
ON a.ano = r.ano
GROUP BY a.ano
ORDER BY comments DESC
LIMIT 3;