
DROP DATABASE IF EXISTS greenblog;

CREATE DATABASE greenblog;

CREATE TABLE user_gb
(
id integer Not Null PRIMARY KEY,
name varchar(100) NOT NULL,
lastname varchar(100) NOT NULL,
email varchar(100) NOT NULL
);
