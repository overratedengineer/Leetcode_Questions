SELECT a.id
FROM Weather as a 
join Weather as b

WHERE DATEDIFF(a.recordDate,b.recordDate) = 1
    AND a.temperature > b.temperature
;