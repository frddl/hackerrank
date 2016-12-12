select distinct city from station where substring(city, length(city), 1) IN ("a", "e", "o", "u", "i") and substring(city, 1, 1) IN ("a", "e", "o", "u", "i") order by city asc;
