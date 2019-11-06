create table user
(
    id        int(12) auto_increment
        primary key,
    nickName  varchar(20) not null,
    password  varchar(20) not null,
    email     varchar(50) null,
    firstName varchar(20) null,
    lastName  varchar(20) null,
    sex       varchar(1)  null,
    age       int(3)      null,
    address   varchar(50) null
);

INSERT INTO javachatdb.user (id, nickName, password, email, firstName, lastName, sex, age, address) VALUES (3, 'www', 'www', 'www@www', null, null, null, null, null);
INSERT INTO javachatdb.user (id, nickName, password, email, firstName, lastName, sex, age, address) VALUES (4, 'eee', 'eee', 'eee@eee', null, null, null, null, null);
INSERT INTO javachatdb.user (id, nickName, password, email, firstName, lastName, sex, age, address) VALUES (5, 'qqq', 'qqq', 'qqq@qqq', null, null, null, null, null);
INSERT INTO javachatdb.user (id, nickName, password, email, firstName, lastName, sex, age, address) VALUES (6, 'rrr', 'rrr', 'rrr@rrr', null, null, null, null, null);
INSERT INTO javachatdb.user (id, nickName, password, email, firstName, lastName, sex, age, address) VALUES (9, 'zzz', 'zzz', 'zzz@zzz', null, null, null, null, null);
INSERT INTO javachatdb.user (id, nickName, password, email, firstName, lastName, sex, age, address) VALUES (10, 'xxx', 'xxx', 'xxx@xxx', null, null, null, null, null);