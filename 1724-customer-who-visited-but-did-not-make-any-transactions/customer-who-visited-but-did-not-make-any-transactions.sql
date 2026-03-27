# Write your MySQL query statement below
select customer_id ,COUNT(v.visit_id) AS count_no_trans
from visits as v
left join transactions as t on v.visit_id=t.visit_id 
where transaction_id is null group by v.customer_id;