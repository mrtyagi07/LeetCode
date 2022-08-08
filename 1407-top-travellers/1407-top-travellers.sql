# Write your MySQL query statement below
select name , sum(case when distance is null then 0 else distance end) as 'Travelled_Distance' from users u
left join rides r
on u.id=r.user_id 
group by user_id 
order by 2 desc ,1;

