# Write your MySQL query statement below
select d.name AS Department, 
e.name AS Employee, e.salary As Salary from Employee e 
Join Department d ON e.departmentId= d.id
WHERE (e.departmentId, e.salary) IN (
SELECT departmentId, MAX(salary)
FROM Employee
group by departmentId
);