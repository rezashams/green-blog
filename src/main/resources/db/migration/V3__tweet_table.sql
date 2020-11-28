CREATE TABLE IF NOT EXISTS tweet_gb
(
id integer Not Null PRIMARY KEY,
content text,
user_id integer Not Null,
created_at date,
updated_at date
);
