WITH cte AS (
    SELECT customer_number AS n, COUNT(customer_number) AS c
    FROM Orders
    GROUP BY customer_number
)
SELECT n as customer_number 
FROM cte 
WHERE c = (SELECT MAX(c) FROM cte);
