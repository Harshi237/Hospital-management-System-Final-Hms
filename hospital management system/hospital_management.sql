
Create database hospital_management;
use hospital_management;
create table login (ID varchar (20), PW varchar(20));
select * from login;
insert into login value ("harshita","batmansmells");
create table patient_info( ID varchar(20),number varchar(20), Name varchar(20), Gender varchar(20),Patient_disease varchar(20), Room_Number varchar(20), Time varchar(200), Deposite varchar(20));
select * from patient_info;
create table Room (room_no varchar(20), Availability varchar(20), Price varchar(20),Room_type varchar(20));
select * from Room;
insert into Room values("100","Availabil","500","G Bed 1");
insert into Room values("101","Availabil","500","G Bed 2");
insert into Room values("102","Availabil","500","G Bed 3");
insert into Room values("103","Availabil","500","G Bed 4");
insert into Room values("200","Availabil","1500","Private Room");
insert into Room values("201","Availabil","1500","Private Room");
insert into Room values("202","Availabil","1500","Private Room");
insert into Room values("203","Availabil","1500","Private Room");
insert into Room values("300","Availabil","3500","ICU Bed 1");
insert into Room values("301","Availabil","3500","ICU Bed 2");
insert into Room values("302","Availabil","3500","ICU Bed 3");
insert into Room values("303","Availabil","3500","ICU Bed 4");
insert into Room values("304","Availabil","3500","ICU Bed 5");
insert into Room values("305","Availabil","3500","ICU Bed 6");
create table department (Department varchar(100),Phone_no varchar(20));
insert into department values("Gyno department", "8747838484");
insert into department values("nursing department", "8242838484");
insert into department values("medical department", "9656838484");
insert into department values("surgical department", "8282838484");
select* from department;