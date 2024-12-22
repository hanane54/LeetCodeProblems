# Write your MySQL query statement below
# we are looking for the customers who never ordered in two different tables 
SELECT C.name  as Customers
FROM Customers C
LEFT JOIN Orders O ON C.id = O.customerId
WHERE O.id IS NULL;