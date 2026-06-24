-- Write your PostgreSQL query statement below
select p.product_id,round(sum(case when units is null then 0 else price*units end)*1.0/ coalesce(sum(units),1),2) as average_price
from prices as p
left join unitssold as u 
on p.product_id = u.product_id
and u.purchase_date between p.start_date and p.end_date 
group by p.product_id;

