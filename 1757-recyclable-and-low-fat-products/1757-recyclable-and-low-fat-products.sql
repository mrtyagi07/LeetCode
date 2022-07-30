# Write your MySQL query statement below
/*select product_id from Products where low_fats="Y" AND recyclable= "Y";
*/

select product_id from products 
where low_fats = 'Y' and recyclable = 'Y';