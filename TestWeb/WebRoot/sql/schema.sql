create database if not exists TestWeb  default character set =utf8 default collate=utf8_general_ci;
use TestWeb;
drop table if exists users;
create table users 
(
    USER_ID              INT(4) not null comment '”√ªßid',
    USER_NAME            VARCHAR(20) not null comment '–’√˚',
    USER_AGE             INT(4) not null,
    SEX                  VARCHAR(20),
    primary key (USER_ID)
); 
insert into users values (1, 'Temperor', 30, 'F');
insert into users values (2, 'Kobe', 27, 'F');
insert into users values (3, 'Michael', 30, 'F');
insert into users values (4, 'Simon', 50, 'M');
insert into users values (5, 'Naresh', 30, 'M');