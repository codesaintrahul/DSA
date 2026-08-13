# Write your MySQL query statement below
SELECT s.user_id,ROUND(COALESCE(SUM(c.action="confirmed")/COUNT(c.action),0),2)
AS confirmation_rate
FROM Signups s LEFT JOIN Confirmations c ON s.user_id=c.user_id 
Group by s.user_id;