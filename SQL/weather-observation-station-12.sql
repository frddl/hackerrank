select distinct city from station where substring(city, 1, 1) not in ("a", "e", "u", "i", "o") and substring(city, length(city), 1) not in ("a", "e", "u", "i", "o") order by city asc;
