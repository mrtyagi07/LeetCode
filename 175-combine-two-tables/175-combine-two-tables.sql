# Write your MySQL query statement below
# SELECT FirstName, LastName, City, State
# FROM Person
# LEFT JOIN Address
# USING(PersonId);
SELECT p.firstName,p.lastName,a.city,a.state FROM person  AS p LEFT JOIN Address AS a on p.personId = a.personId