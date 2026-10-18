# Write your MySQL query statement below

select score, Dense_Rank() over (order by score desc) As 'rank' from Scores
order by score desc;
