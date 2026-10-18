# Write your MySQL query statement below
select s.name from SalesPerson s
where s.sales_id not IN (
select o.sales_id
from Orders o
JOIN Company c 
ON 
c.com_id=o.com_id 
where c.name='RED' 
);