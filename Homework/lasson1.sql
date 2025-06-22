create database Bootcamp_2504p;

use bootcamp_2504p;

create table staffs (
	id int,
    first_name varchar(100),
    last_name varchar(100),
    salary numeric(10,2)
);

select * from staffs;
-- DML - Insert
insert into staffs (id, first_name, last_name, salary) values (1,'John', 'Lau', 20000);
insert into staffs (id, first_name, last_name, salary) values (2,'Sally', 'Lau', 10000);

-- Another way to insert data
insert into staffs values (3, 'Oscar', 'Wong', 24000);

-- DML - update
update staffs set salary = salary * 1.1 where first_name = 'John';
select * from staffs;

-- update more than one field
update staffs set salary = salary *1.05, last_name = 'Chan' where id = 3;
select * from staffs;

insert into staffs values (4, 'Alex', 'Chan', 15000);

-- DML - delete
delete from staffs where first_name = 'Sally';
select * from staffs;

-- select
-- 1. where AND OR
select * from staffs where last_name = 'Chan' and salary > 22000;
select * from staffs where last_name = 'Chan' or salary > 16000;
select * from staffs where last_name = 'Lau' or salary > 16000 and last_name = 'Chan'; -- AND first, and then OR
select * from staffs where (last_name = 'Lau' or salary > 16000) and last_name = 'Chan';

-- >, <, >=, <=, =, <>
select * from staffs where last_name <> 'Lau';

-- * (all column)
-- id, salary, (specific column)
select id, salary from staffs;

-- alias (altas?)
select t.id, t.salary from staffs t where t.salary > 20000;

-- order by
select t.*
from staffs t
where t.salary > 18000
order by t.first_name; -- By default ascending order

select t.*
from staffs t
where t.salary > 18000
order by t.first_name desc; -- descending order

-- group by

create table books (
	title varchar(100),
    genre varchar(100),
    price numeric(65,2)
    );
    
insert into books values('book1', 'adventure', 11.90);
insert into books values('book2', 'fantasy', 8.49);
insert into books values('book3', 'romance', 9.99);
insert into books values('book4', 'adventure', 9.99);
insert into books values('book', 'fantasy', 7.99);
insert into books values('book6', 'romance', 5.88);

update books set title = 'book5' where title = 'book';
select * from books;
select b.genre, avg(b.price) as ave_price
from books b
group by b.genre;

select b.genre
, avg(b.price) as avg_price
, max(b.price) as max_price
, min(b.price) as min_price
, count(*) as no_of_books
, sum(b.price) as total_price
, min(length(b.title)) as min_length_title
-- , price
-- , title
from books b
group by b.genre;

-- Having -- filter group
select b.genre, sum(b.price) as total_price -- step 4
from books b
where b.price < 9 -- step 1
group by b.genre -- step 2
having sum(b.price) > 10; -- step 3

-- case insensitive
select * from staffs where last_name = 'chan';

-- String Operation
select t.*
, upper(t.first_name) upper_first_name
, lower (t.last_name) lower_last_name
, length(t.first_name)
, concat(t.first_name, ' ', t.last_name) as full_name
, substring(t.first_name, 1, 3) -- Starting from the 2nd char, get 3 charset()
, replace(t.first_name, 'J', 'X')
, instr(t.first_name, 's') -- not found: 0, Number of character: 2
from staffs t;

select b.genre
, round(avg(price), 2) avg_price
, floor(avg(price))
, ceil(avg(price))
, avg(price)
, power(2, 3)
from books b
group by b.genre;

-- Example
select b.price, count(*) no_of_books
from books b
group by b.price
having max(price) > 9; -- describe the state of group, not necessary to be selected

-- Add column
alter table staffs add join_date date;
select * from staffs;

update staffs set join_date = str_to_date('2020-06-30', '%Y-%m-%d')  where id = 1;
update staffs set join_date = str_to_date('2021-01-15', '%Y-%m-%d')  where id = 4;
update staffs set join_date = str_to_date('2010-12-20', '%Y-%m-%d')  where id = 3;

select * from staffs where join_date = STR_TO_DATE('2010-12-20', '%Y-%m-%d');
select * from staffs where join_date between '2020-01-01' and '2020-12-31';

select s.join_date, s.join_date + interval 3 month - interval 1 day as probation_end, s.*
from staffs s;

-- create table, varchar, numeric, integer, date, datetime
create table planets (
	no_from_sun int,
    planet_name varchar(7),
    distance_from_sun_Mkm numeric(65, 2),
    discover_date date
    );
    
-- insert
insert into planets values (1, 'Mercury', 58, null);
insert into planets values (2, 'Venus', 108, null);
insert into planets values (3, 'Earth', 150, null);
insert into planets values (4, 'Mars', 228, null);
insert into planets values (5, 'Jupiter', 778, null);
insert into planets values (6, 'Saturn', 1437, null);
insert into planets values (7, 'Uranus', 2871, '1781-04-26');
insert into planets values (8, 'Naptune', 4500, '1846-11-13');

alter table planets add moon_qty int;
update planets set moon_qty = 0 where no_from_sun = 1;
update planets set moon_qty = 0 where no_from_sun = 2;
update planets set moon_qty = 1 where no_from_sun = 3;
update planets set moon_qty = 2 where no_from_sun = 4;
update planets set moon_qty = 95 where no_from_sun = 5;
update planets set moon_qty = 274 where no_from_sun = 6;
update planets set moon_qty = 28 where no_from_sun = 7;
update planets set moon_qty = 16 where no_from_sun = 8;
select * from planets;
alter table planets add earth_year_length double;


update planets set earth_year_length = 88 / 365 where no_from_sun = 1;
update planets set earth_year_length = 225 / 365 where no_from_sun = 2;
update planets set earth_year_length = 365 / 365 where no_from_sun = 3;
update planets set earth_year_length = 687 / 365 where no_from_sun = 4;
update planets set earth_year_length = 4333 / 365 where no_from_sun = 5;
update planets set earth_year_length = 10759 / 365 where no_from_sun = 6;
update planets set earth_year_length = 30687 / 365 where no_from_sun = 7;
update planets set earth_year_length = 60190 / 365 where no_from_sun = 8;
select * from planets;
-- group by + agg functions (max, min, etc)
select planet_name, earth_year_length from planets where earth_year_length > 1;
select planet_name, round(earth_year_length * 365, 0)
	from planets
    as year_length_earthday;
alter table planets add year_length_earthday double;
update planets set year_length_earthday = 88 where no_from_sun = 1;
update planets set year_length_earthday = 225 where no_from_sun = 2;
update planets set year_length_earthday = 365 where no_from_sun = 3;
update planets set year_length_earthday = 687 where no_from_sun = 4;
update planets set year_length_earthday = 4333 where no_from_sun = 5;
update planets set year_length_earthday = 10759 where no_from_sun = 6;
update planets set year_length_earthday = 30687 where no_from_sun = 7;
update planets set year_length_earthday = 60190 where no_from_sun = 8;
select p.* from planets p;
select planet_name, moon_qty
	from planets where moon_qty > 1;
alter table planets add sun_rise_from_west boolean;
update planets set sun_rise_from_west = false;
update planets set sun_rise_from_west = true where no_from_sun = 2;
select p.* from planets p;
alter table planets add planet_type varchar(9);
update planets set planet_type = 'rocky' where no_from_sun = 1;
update planets set planet_type = 'rocky' where no_from_sun = 2;
update planets set planet_type = 'rocky' where no_from_sun = 3;
update planets set planet_type = 'rocky' where no_from_sun = 4;
update planets set planet_type = 'gas giant' where no_from_sun = 5;
update planets set planet_type = 'gas giant' where no_from_sun = 6;
update planets set planet_type = 'ice giant' where no_from_sun = 7;
update planets set planet_type = 'ice giant' where no_from_sun = 8;
select planet_name, year_length_earthday, moon_qty from planets where planet_type = 'gas giant';
-- group by + having
select planet_type, planet_name from planets group by planet_type;

select b.genre
, round(avg(price), 2) avg_price
, floor(avg(price))
, ceil(avg(price))
, avg(price)
, power(2, 3)
from books b
group by b.genre;

select p.planet_type
, avg(year_length_earthday)
from planets
group by planet_type;

-- Primary Key + Foreign Key
-- One to Many, Many to Many, One to One

-- A department has many employees
-- An Enployee belongs to one department (allow null department)
create table departments (
	id int primary key, -- safe guard repeated input
    description varchar(50),
    code varchar(5)
);
drop table departments;
drop table employees;
insert into departments values (1, 'Information Technology', 'IT');
select * from departments;
insert into departments values (2, 'Human Resource', 'HR');
select * from departments;
create table employees (
	id int primary key, -- PK = 'not null' + 'unique' + 'indexing'
    first_name varchar(50),
    last_name varchar(50),
    email varchar(50) not null unique, -- 'unique' is a constraint
    department_id int not null, -- not null is a constriant
    foreign key (department_id) references departments(id) -- validate if the demartment_id exists in table department
);
-- FK cnanot ensure the value of department_id is non-null value, FK for the 'many' field only.
-- Every table has its PK.

insert into employees values (1, 'John', 'Lau', 'john@gmail.com', 3); -- Technically error and date invalid OK (FK helps safeguard invalid data)
insert into departments values (3, 'Marketing', 'MKT');
insert into employees values (1, 'John', 'Lau', 'john@gmail.com', 3); -- Technically error and date invalid OK (FK helps safeguard invalid data)

select * from employees;
insert into employees values (2, 'Oscar', 'Wong','oscar@gmail.com', 1); -- after setting 'not null' to department_id, error
select * from employees;

-- inner join
-- John Lau Marketing
-- Oscar Wong information Technology
select e.first_name as employee_first_name
, e.last_name as employee_last_name
, d.description as department_name
from departments d inner join employees e on e.department_id = d.id;

create table employee_department (
	id int primary key,
	employee_id int not null,
    department_id int not null,
    foreign key (employee_id) references employees(id),
    foreign key (department_id) references departments(id)
);


drop table employees;

-- Many to Many (Students bs Courses)
create table students (
	id int primary key,
    student_card_id varchar(50) not null unique,
	name varchar(50) not null
);
create table subjects (
	id int primary key,
    description varchar(50) not null
);
-- A student has no duplicated subject
-- A subject would not belong to the same student twice
-- the student id exists in table students
-- The subject id exists in table subjects
create table student_subjects (
	id int primary key, -- e.g. datetime, when has course taken
    student_id int not null,
    subject_id int not null,
    foreign key (student_id) references students(id), -- validate if the demartment_id exists in table department
	foreign key (subject_id) references subjects(id), -- validate if the demartment_id exists in table department
	unique(student_id, subject_id) -- check(two columns join into one unique key)
);
insert into students values (1, 'NO123', 'John');
insert into students values (2, 'NO124', 'Chris');

insert into subjects values (1, 'History');
insert into subjects values (2, 'English');
insert into subjects values (3, 'Math');

insert into student_subjects values (1, 2, 2); -- Chris + English
insert into student_subjects values (2, 2, 3); -- Chris + Math
insert into student_subjects values (3, 1, 1); -- John + History
insert into student_subjects values (4, 2, 3);
insert into student_subjects values (5, 7, 3);
insert into student_subjects values (6, 1, 4);

select * from student_subjects;
drop table student_subjects;

-- Inner Join (~95%)
-- 2 * 3 * 3 = 18 rows (without 'on' when inner join)
select ss.id, stu.name, sub.description -- last step: you can pick any columns you want
from student_subjects ss
	inner join students stu on stu.id = ss.student_id
    inner join subjects sub on sub.id = ss.subject_id -- if without on, 2 * 3 * 3
	;

-- left Join
insert into students values (3, 'NO125', 'Mary');
-- Find all students and with his resistrated subjects, including those students without subject
select stu.*, ss.*
from students stu left join student_subjects ss on stu.id = ss.student_id;

-- right join
select stu.*, ss.*
from students stu right join student_subjects ss on stu.id = ss.student_id;
select stu.*, ss.*
from student_subjects ss right join students stu on stu.id = ss.student_id;