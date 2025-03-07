WITH cte AS (
    SELECT 
        Department.name AS Department, 
        Employee.name AS Employee, 
        Employee.salary AS Salary, 
        dense_RANK() OVER (PARTITION BY Department.name ORDER BY Employee.salary desc) AS ranks
    FROM Employee 
    JOIN Department ON Employee.departmentID = Department.ID
)
SELECT Department, Employee, Salary 
FROM cte
WHERE ranks<=3;
