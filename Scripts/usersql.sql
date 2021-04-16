drop table if exists member;

create table member(
	id varchar(15) not null,
	passwd char(41),
	name varchar(15),
	age int(11),
	gender varchar(5),
	email varchar(30),
	primary key (id)
);

