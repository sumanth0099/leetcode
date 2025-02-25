select id,
CASE
 when mod(id,2)=1 THEN LEAD(student,1,student) OVER(order by id)
  else LAG(student,1) OVER(order by id)
  END AS student
  from seat;