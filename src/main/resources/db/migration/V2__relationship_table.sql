CREATE TABLE IF NOT EXISTS relationship_gb
(
id integer Not Null PRIMARY KEY,
follower_id integer Not Null,
followed_id integer Not Null,
created_at date,
updated_at date
);
