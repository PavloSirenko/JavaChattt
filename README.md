Java web chat app!

Java version 12.0.1;
Maven version 3.6.1;
Tomcat version 9.0.27;
MySQL Connector/J 8.0.15;



-- mysql 
create table user

(

    id int(255) auto_increment primary key,
    nickName  varchar(20) not null,
    password  varchar(20) not null,
    email     varchar(50) null,
    firstName varchar(20) null,
    lastName  varchar(20) null,
    sex       varchar(1)  null,
    age       int(3)      null,
    address   varchar(50) null
);

