CREATE TABLE t_user (
    id int8 NOT NULL PRIMARY KEY,
    name VARCHAR(64),
    age int4,
    created_at timestamp,
    updated_at timestamp
)