select * from employee order by title DESC;
select billing_country, count(*) from invoice group by billing_country limit 1;
select * from invoice order by total desc limit 3;
select billing_city, sum(total) as sum_total from invoice group by billing_city order by sum_total desc;