select distinct city from station where SUBSTRING(city, 1, 1) IN ("a", "e", "i", "o", "u") ORDER BY city asc;
