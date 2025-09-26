# Write your MySQL query statement below
delete p1 from person p1 inner join person p2 where p1.email=p2.email and p2.id<p1.id;