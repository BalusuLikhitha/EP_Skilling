show databases;
use ep_skill;
create table Employee(Ename char(20),id int,age int,department char(5), desig char(15),salary int,date_of_work char(15));
desc Employee;
insert into Employee values("Sitara",011,26,"CSE","Professor",50000,"01-12-1994");
insert into Employee values("Likhitha",022,28,"IT","HR",80000,"25-4-1992");
insert into Employee values("Anika",033,21,"EEE","Professor",45000,"15-7-1999");
insert into Employee values("Gautam",044,30,"MECH","Professor",48000,"5-5-1990");
insert into Employee values("Arya",055,32,"CSE","Dean-Academics",90000,"27-8-1985");
select * from Employee;
delete from Employee where department="EEE";
update Employee set columnname="Address";
update Employee set Address="Kadapa" where id=55;
update employee set Address="Hyderabad" where id=33;
insert into Employee values("Anika",033,21,"EEE","Professor",45000,"15-7-1999");
insert into Employee values("Asha",066,25,"ECM","Asst.Professor",30000,"07-12-1995");
delete from Employee where id=044;


