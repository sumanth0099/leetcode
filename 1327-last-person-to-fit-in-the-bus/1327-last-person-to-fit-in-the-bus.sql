with cte as 
(select person_name ,sum(weight) over(order by turn)as total from queue)
select person_name from (select person_name from cte where total<=1000  order by total desc)where ROWNUM=1;