CREATE TABLE emp_manager(
    Emp_ID int,
    LastName varchar(255),
    FirstName varchar(255),
    Salary decimal(10,2),
    Address varchar(255)
);



select * from emp_manager;

select * from emp_manager where salary=10000

INSERT INTO emp_manager VALUES (3,'India', 'Sai', 'Koushik', 60000);

select * from emp_manager;
