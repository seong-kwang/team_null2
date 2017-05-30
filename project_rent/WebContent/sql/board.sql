DROP TABLE board;

CREATE TABLE board(
  b_num INT PRIMARY KEY AUTO_INCREMENT,
  b_id VARCHAR(30) NOT NULL,
  b_title VARCHAR(200) NOT NULL,
  b_content TEXT NOT NULL,
  b_readcount INT DEFAULT 0,
  b_writedate DATE NOT NULL
);

insert into board values(0,'sk','1','1',0,now());
insert into board values(0,'sk','2','1',0,now());
insert into board values(0,'sk','3','1',0,now());
insert into board values(0,'sk','4','1',0,now());
insert into board values(0,'sk','5','1',0,now());
insert into board values(0,'sk','6','1',0,now());
insert into board values(0,'sk','7','1',0,now());
insert into board values(0,'sk','8','1',0,now());
insert into board values(0,'sk','9','1',0,now());
insert into board values(0,'sk','10','1',0,now());
insert into board values (0,'sk','11','1',0,now());
insert into board values(0,'sk','12','1',0,now());
insert into board values(0,'sk','13','1',0,now());
insert into board values(0,'sk','14','1',0,now());
insert into board values(0,'sk','15','1',0,now());
insert into board values(0,'sk','16','1',0,now());
insert into board values(0,'sk','17','1',0,now());
insert into board values(0,'sk','18','1',0,now());
insert into board values(0,'sk','19','1',0,now());
insert into board values(0,'sk','20','1',0,now());
