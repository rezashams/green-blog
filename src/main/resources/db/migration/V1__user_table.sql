CREATE TABLE IF NOT EXISTS user_gb
(
id integer Not Null PRIMARY KEY,
name varchar(100) NOT NULL,
lastname varchar(100) NOT NULL,
email varchar(100) NOT NULL,
password varchar(100),
created_at date Not Null,
updated_at date Not Null,
remember_token varchar(100)
);
