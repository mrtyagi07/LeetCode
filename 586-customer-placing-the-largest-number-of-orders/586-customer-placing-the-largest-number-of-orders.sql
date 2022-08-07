# Write your MySQL query statement below
# SELECT customer_number
# FROM orders
# GROUP BY 1
# HAVING COUNT(order_number) >= ALL (SELECT COUNT(order_number)
#                                   FROM orders
#                                   GROUP BY customer_number)

select customer_number from Orders
group by customer_number
ORDER BY COUNT(customer_number) DESC
limit 1 ;