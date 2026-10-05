# Write your MySQL query statement below

select id, count(*) AS num from
(select requester_id AS id from RequestAccepted 
UNION ALL 
select accepter_id AS id from RequestAccepted) t

group by id order by num desc limit 1;