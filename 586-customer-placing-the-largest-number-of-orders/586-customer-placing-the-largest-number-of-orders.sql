# Write your MySQL query statement below
SELECT customer_number
FROM orders
GROUP BY 1
HAVING COUNT(order_number) >= ALL (SELECT COUNT(order_number)
                                  FROM orders
                                  GROUP BY customer_number)