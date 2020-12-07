CREATE TABLE IF NOT EXISTS relationship_gb
(
follower_id integer Not Null,
followed_id integer Not Null,
created_at date Not Null,
updated_at date Not Null
);
