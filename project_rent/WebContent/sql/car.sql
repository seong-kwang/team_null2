CREATE TABLE car(
  c_num INT PRIMARY KEY AUTO_INCREMENT,
  brand_num INT,
  c_model VARCHAR(20) NOT NULL,
  c_name VARCHAR(100) NOT NULL,
  c_fuel VARCHAR(20) NOT NULL,
  c_type INT NOT NULL, --국산? 외제?
  c_year VARCHAR(15) NOT NULL,
  c_image VARCHAR(255) NOT NULL,
  c_pirce INT NOT NULL,
  FOREIGN KEY(brand_num) REFERENCES brand(brand_num)
);
-- c_brand >> brand.sql 참고
-- c_fuel >> G : 가솔린 D : 디젤 L : LPG
-- c_type >> 1 : 국산 2 : 외제
-- c_model >> 경차, 소형, 중형, 고급, suv 	

insert into car values(0,1,'소형','엑센트','G',1,'2012','accent.jpg',15000);
insert into car values(0,1,'소형','엑센트','D',1,'2015','accent.jpg',20000);
insert into car values(0,1,'소형','아반떼','G',1,'2016','avante.jpg',30000);
insert into car values(0,1,'중형','소나타','G',1,'2015','sonata.jpg',35000);
insert into car values(0,1,'중형','제네시스 쿠페','G',1,'2014','genesiscoupe.jpg',35000);
insert into car values(0,1,'고급','그랜져','G',1,'2015','grangeur.jpg',40000);
insert into car values(0,1,'고급','제네시스 EQ900','G',1,'2017','EQ900.jpg',80000);
insert into car values(0,1,'suv','투싼','G',1,'2013','tucson.jpg',25000);
insert into car values(0,1,'suv','투싼','D',1,'2015','tucson.jpg',28000);
insert into car values(0,1,'suv','싼타페','G',1,'2014','santafe.jpg',36000);
insert into car values(0,1,'suv','싼타페','D',1,'2015','santafe.jpg',37000);

insert into car values(0,2,'소형','프라이드','G',1,'2012','pride.jpg',15000);
insert into car values(0,2,'경차','레이','G',1,'2014','ray.jpg',15000);
insert into car values(0,2,'suv','카렌스','D',1,'2015','carens.jpg',24000);
insert into car values(0,2,'suv','카렌스','L',1,'2016','carens.jpg',26000);
insert into car values(0,2,'suv','카니발','G',1,'2017','carnival.jpg',41000); 
insert into car values(0,2,'소형','k3','G',1,'2015','k3.jpg',30000);
insert into car values(0,2,'중형','k5','G',1,'2015','k5.jpg',34000);
insert into car values(0,2,'고급','k7','G',1,'2015','k7.jpg',38000);
insert into car values(0,2,'고급','k9','G',1,'2015','k9.jpg',68000);

--나머지는 나중에.......으악




























