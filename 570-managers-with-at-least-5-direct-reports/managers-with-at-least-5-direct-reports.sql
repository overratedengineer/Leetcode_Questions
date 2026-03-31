select e.name 
from employee e
where e.id in (
    select managerId 
    from employee 
    group by managerId 
    having count(managerId) > 4
);