create table region
(
   id number not null,
   name varchar(20) not null,
   description varchar(100),
   parentId number
);