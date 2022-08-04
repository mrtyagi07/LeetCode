# Write your MySQL query statement below
SELECT (
    SELECT DISTINCT Salary
    FROM EMPLOYEE
    ORDER BY Salary DESC
    LIMIT 1,1
) AS SecondHighestSalary;
