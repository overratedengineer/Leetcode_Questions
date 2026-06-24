-- # Write your MySQL query statement below
select s.user_id,round(avg(case when action='confirmed' then 1 else 0 end),2) as Confirmation_rate
from 
Signups as s
left outer join 
Confirmations as c
on s.user_id=c.user_id
group by s.user_id;

