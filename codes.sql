create database example;

use example;

create table student(
roll_no int not null,
name varchar(50),
address varchar(50),
phone varchar(20),
age int,
primary key(roll_no)
);


create table table01(
paymentid int not null,
roll_no int not null,
primary key(paymentid),
foreign key(roll_no) references details(roll_no)
);

insert into student(roll_no,name,address,phone,age)
values
(1,'harsh','delhi','0758962552',18),
(2,'pratik','bihar','0775862525',19),
(3,'riyanka','siliguri','0769553242',20),
(4,'deep','ramanagar','0725568955',18),
(5,'saptarhi','kolkata','0759631747',19),
(6,'dhanaraj','barabajar','0775268952',20),
(7,'rohit','balirghat','0785236985',18),
(8,'niraj','Alpur','0745269834',19);

insert into table01(paymentid,roll_no)
values 
(1,1),
(2,2),
(3,3),
(4,4);


create table studentcourse(
courseid int not null,
roll_no int not null);

insert into studentcourse(courseid,roll_no)
values
(1,1),
(2,2),
(2,3),
(3,4),
(1,5),
(4,9),
(5,10),
(4,11);

create table student(
id int(50) not null,
name varchar(50),
phone varchar(20),
dob date,
primary key(id)
);

create table courses(
classid int not null,
title varchar(50),
classnum int(10),
primary key(classid)
);

create table takes_course(
id int not null,
classid int not null,
sem varchar(20),
foreign key(id) references student(id),
foreign key(classid) references courses(classid)
);


insert into student
values
(500,'matt','555-4141','03.06.70'),
(501,'jenny','867-5309','15.03.81'),
(502,'sean','876-9123','31.10.82');

insert into courses
values
(1001,'intro to informarks',1101),
(1002,'data mining',1400),
(1003,'internet and society',1400);

insert into takes_course
values
(500,1001,'Fall02'),
(501,1002,'Fall02'),
(501,1002,'spr03'),
(502,1003,'s203');

