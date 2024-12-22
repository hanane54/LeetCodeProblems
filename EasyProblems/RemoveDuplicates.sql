# Write your MySQL query statement below
# delete from Person where count(email)>1;
# I am using a cte that assigns a row_num to each row.
# Only rows with row_num > 1 are considered duplicates.
WITH CTE AS (
    SELECT 
        id, 
        ROW_NUMBER() OVER (PARTITION BY email ORDER BY id Asc) AS row_num
    FROM Person
)
DELETE FROM Person
WHERE id IN (
    SELECT id
    FROM CTE
    WHERE row_num > 1
);