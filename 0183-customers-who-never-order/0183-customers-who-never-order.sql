# Write your MySQL query statement below
select c.name AS customers from
customers c
LEFT JOIN 
orders o
ON c.id=o.customerid
where o.id is null;