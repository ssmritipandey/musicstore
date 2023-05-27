create table invoice_cust as (select customer_id, sum(total) as cust_total from invoice group by customer_id order by customer_id); 
	select invoice_cust.cust_total, customer.first_name from invoice_cust join customer on customer.customer_id = invoice_cust.customer_id;

select customer.first_name,customer.last_name,customer.email, genre.name from customer join invoice on customer.customer_id = invoice.customer_id join invoice_line on invoice_line.invoice_id= invoice.invoice_id join track on track.track_id = invoice_line.track_id join genre on track.genre_id=genre.genre_id where genre.genre_id =1 and customer.email like 'a%' order by customer.first_name;

create table artist_count as (select artist_id, count(artist_id) as no_of_song from artist group by artist_id);
	select artist.name, artist_count.artist_id, artist_count.no_of_song from artist_count join artist on artist.artist_id = artist_count.artist_id join musicalbum on artist_count.artist_id = musicalbum.artist_id join track on musicalbum.album_id = track.album_id join genre on track.genre_id=genre.genre_id;

select name, milliseconds from track where milliseconds > (select avg(milliseconds) from track) order by milliseconds desc; 

select * from invoice_cust;
delete from invoice_cust where customer_id =60;