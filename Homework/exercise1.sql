-- create new database
CREATE DATABASE BOOTCAMP_EXERCISE1;
-- get into database
USE BOOTCAMP_EXERCISE1;

create table regions (
	region_id int primary key,
    region_name varchar(25)
);
create table countries (
	country_id char(2) primary key,
    country_name varchar(40) unique,
    region_id int,
    foreign key (region_id) references regions(region_id)
);
create table locations (
	location_id int primary key,
    street_address varchar(25),
    postal_code varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    foreign key (country_id) references countries(country_id)
);
create table departments (
	department_id int primary key,
    department_name varchar(30) unique,
	manager_id numeric,
    location_id int not null,
    foreign key (location_id) references locations(location_id)
);
create table jobs (
	job_id varchar(10) primary key,
    job_title varchar(35),
	min_salary numeric,
    max_salary numeric
);
create table employees (
	employee_id int primary key,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25) not null unique,
    phone_number varchar(20) not null unique,
    hire_date date not null,
    job_id varchar(10),
    foreign key (job_id) references jobs(job_id),
    
    salary numeric,
    commission_pct numeric,
    manager_id int,
    department_id int,
    foreign key (department_id) references departments(department_id)
);
create table job_history (
	employee_id int not null,
    foreign key (employee_id) references employees(employee_id),
    
    start_date date not null,
    end_date date,
    job_id varchar(10),
    foreign key (job_id) references jobs(job_id),
    
    department_id int,
    foreign key (department_id) references departments(department_id),
    
    unique(employee_id, start_date)
);
create table job_grades (
	grade_level varchar(2) primary key,
    lowest_sal numeric,
    highest_sal numeric
);
insert into regions values (1, 'Europe');
insert into regions values (2, 'North America');
insert into regions values (3, 'Asia');
insert into regions values (4, 'South America');
insert into regions values (5, 'Africa');
insert into regions values (6, 'Oceania');
insert into countries values ('DE', 'Germany', 1);
insert into countries values ('IT', 'Italy', 1);
insert into countries values ('JP', 'Japan', 3);
insert into countries values ('US', 'United State', 2);
insert into locations values (1000, '1297 Via Cola di Rie'
								, 989, 'Roma', null, 'IT');
insert into locations values (1100, '93091 Calle della Te'
								, 10934, 'Venice', null, 'IT');
insert into locations values (1200, '2017 Shinjuku-ku'
								, 1689, 'Tokyo', 'Tokyo JP', null);
insert into locations values (1400, '2014 Jabberwocky Rd'
								, 26192, 'Southlake', 'Texas', 'US');
insert into departments values (10, 'Administration', 200, 1100);
insert into departments values (20, 'Marketing', 201, 1200);
insert into departments values (30, 'Purchasing', 202, 1400);

insert into jobs values ('IT_PROG', null, null, null);
insert into jobs values ('MK_REP', null, null, null);
insert into jobs values ('ST_CLERK', null, null, null);

insert into employees values (100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000.00, 0.00, 109, 10);
insert into employees values (101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568' , '1987-06-18', 'MK_REP' , 17000.00, 0.00, 103, 20);
insert into employees values (102, 'Lex', 'De Haan', 'LDEHAAN' , '515-1234569' , '1987-06-19', 'IT_PROG' , 17000.00, 0.00, 108, 30);
insert into employees values (103, 'Alexander', 'Hunold', 'AHUNOLD', '590-4234567' , '1987-06-20', 'MK_REP' , 9000.00, 0.00, 105, 20);
update employees set phone_number = '515-1234568' where employee_id = 101;
update employees set phone_number = '515-1234569' where employee_id = 102;
update employees set phone_number = '590-4234567' where employee_id = 103;

insert into job_history values (102, '1993-01-13', '1998-07-24', 'IT_PROG', 20);
insert into job_history values (101, '1989-09-21', '1993-10-27', 'MK_REP', 10);
insert into job_history values (101, '1993-10-28', '1997-03-15', 'MK_REP', 30);
insert into job_history values (100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
insert into job_history values (103, '1998-03-24', '1999-12-31', 'MK_REP', 20);

select * from employees;

-- 3. Write a query to find the location_id, street_address, city, state_province, country_name of locations
select * from locations;
select * from countries;
-- 4. Write a query to find the first_name, last name, department ID of all the employees.
select * from employees;
-- 5. Write a query to find the first_name, last_name, job_id, department ID of the employees who works in Japan.
select * from countries where country_id = 'JP';
update locations set country_id = 'JP' where city = 'Tokyo';
select * from locations where country_id = 'JP';
-- select * from departments where location_id = select * from locations where country_id = 'JP';
-- select first_name, last_name, job_id, department_id from employees where 
-- department_id = 
-- 6. Write a query to find the employee id, last_name along with their manager_id and last_name.
-- 7. Write a query to find the first_name, last_name and hire date of the employees who was hired after employee 'Lex De Haan'.
-- 8. Write a query to get the department name and number of employees of each the department.
-- 9. Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department ID 30.
-- 10. Write a query to display all department name, manager name, city and country name.
-- 11. Write a query to display the average salary of each department.
-- 12. Now, we try to perform normalization on table 'jobs'. 
--    a. How do you re-design the table 'jobs'? and adding table 'job_grades'?












