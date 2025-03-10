WITH cte AS (
    SELECT managerID, COUNT(*) AS counts_
    FROM Employee
    WHERE managerID IS NOT NULL
    GROUP BY managerID
)
SELECT name 
FROM Employee
WHERE ID IN (
    SELECT managerID FROM cte WHERE counts_ >=5
);
