-- Drop tables if they exist first, as they depend on the sequence
DROP TABLE IF EXISTS users;

-- Now, drop the sequence since no tables depend on it anymore
DROP SEQUENCE IF EXISTS user_seq;

-- Create the sequence
CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1;

-- Create tables
CREATE TABLE users (
   id BIGINT DEFAULT NEXT VALUE FOR user_seq PRIMARY KEY,
   username VARCHAR(50) NOT NULL UNIQUE,
   password VARCHAR(100) NOT NULL,
   full_name VARCHAR(100) NOT NULL
);