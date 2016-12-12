select distinct city from station where substring(city, 1, 1) not IN ("a", "e", "o", "u", "i") order by city;
