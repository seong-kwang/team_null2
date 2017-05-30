CREATE DATABASE rent;

USE rent;

CREATE TABLE member(
  m_num INT PRIMARY KEY AUTO_INCREMENT,
  m_id VARCHAR(30) UNIQUE,
  m_pass VARCHAR(30) NOT NULL,
  m_name VARCHAR(30) NOT NULL,
  m_gender INT NOT NULL,
  m_zipcode VARCHAR(20) NOT NULL,
  m_addr VARCHAR(100) NOT NULL,
  m_phone VARCHAR(20) NOT NULL,
  m_email VARCHAR(50) NOT NULL
);

CREATE TABLE admin(
  admin_num INT PRIMARY KEY AUTO_INCREMENT,
  admin_id VARCHAR(30) UNIQUE,
  admin_pass VARCHAR(30) NOT NULL
);

CREATE TABLE board(
  b_num INT PRIMARY KEY AUTO_INCREMENT,
  b_id VARCHAR(30) NOT NULL,
  b_title VARCHAR(200) NOT NULL,
  b_content TEXT NOT NULL,
  b_readcount INT DEFAULT 0,
  b_writedate DATE NOT NULL
);

CREATE TABLE brand(
  brand_num INT PRIMARY KEY AUTO_INCREMENT,
  brand_name VARCHAR(50) NOT NULL
);

CREATE TABLE car(
  c_num INT PRIMARY KEY AUTO_INCREMENT,
  brand_num INT,
  c_model VARCHAR(20) NOT NULL,
  c_name VARCHAR(100) NOT NULL,
  c_fuel VARCHAR(20) NOT NULL,
  c_type INT NOT NULL,
  c_year VARCHAR(15) NOT NULL,
  c_image VARCHAR(255) NOT NULL,
  c_pirce INT NOT NULL,
  FOREIGN KEY(brand_num) REFERENCES brand(brand_num)
);

CREATE TABLE reply(
  rp_num INT PRIMARY KEY AUTO_INCREMENT,
  b_num INT,  
  rp_title VARCHAR(100) NOT NULL,
  rp_content TEXT NOT NULL,
  FOREIGN KEY(b_num) REFERENCES board(b_num)
);

CREATE TABLE epilogue(
  e_num INT PRIMARY KEY AUTO_INCREMENT,
  e_title VARCHAR(100) NOT NULL,
  e_content TEXT NOT NULL
);

CREATE TABLE reservation(
  r_num INT PRIMARY KEY AUTO_INCREMENT,
  m_num INT,
  c_num INT,
  r_name VARCHAR(30) NOT NULL,
  r_phone VARCHAR(20) NOT NULL,
  r_addr VARCHAR(100) NOT NULL,
  r_price INT NOT NULL,
  r_startdate VARCHAR(30) NOT NULL,
  r_enddate VARCHAR(30) NOT NULL,
  FOREIGN KEY(m_num) REFERENCES member(m_num),
  FOREIGN KEY(c_num) REFERENCES car(c_num)
);


