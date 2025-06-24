
SELECT name as Employee FROM 
    (SELECT a.name, b.name as manager_name
FROM Employee a
JOIN Employee b 
ON a.managerId = b.id
where a.salary > b.salary ) 
AS derived_table;