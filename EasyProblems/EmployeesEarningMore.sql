-- can be found on https://leetcode.com/problems/employees-earning-more-than-their-managers/submissions/1674961168/
-- Runtime 388ms Beats 51.92%

SELECT name as Employee FROM 
    (SELECT a.name, b.name as manager_name
FROM Employee a
JOIN Employee b 
ON a.managerId = b.id
where a.salary > b.salary ) 
AS derived_table;