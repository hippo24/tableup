drop database tableup;
CREATE DATABASE IF NOT EXISTS tableup;
USE tableup;

CREATE TABLE User (
  us_no INT AUTO_INCREMENT PRIMARY KEY, 
  us_id VARCHAR(20) NOT NULL,
  us_pw VARCHAR(255) NOT NULL,
  us_name VARCHAR(50) NOT NULL,         
  us_phone VARCHAR(20),                 
  us_email VARCHAR(100) NOT NULL UNIQUE,
  us_nickname VARCHAR(50) NOT NULL,
  us_sociallogin BOOLEAN DEFAULT FALSE,
  us_created DATETIME DEFAULT CURRENT_TIMESTAMP);

CREATE TABLE Admin (
  ad_id VARCHAR(50) PRIMARY KEY,
  ad_pw VARCHAR(255)
);