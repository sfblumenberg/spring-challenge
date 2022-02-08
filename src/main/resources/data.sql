DROP TABLE IF EXISTS orders;
CREATE TABLE orders AS SELECT * FROM CSVREAD('src/main/resources/00.csv')
