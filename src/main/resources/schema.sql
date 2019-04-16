drop table if exists user;

create table USERS(
  ID UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
  VERSION INT NOT NULL DEFAULT 0,
  FIRST_NAME varchar(100) not null,
  LAST_NAME varchar(100) not null
);