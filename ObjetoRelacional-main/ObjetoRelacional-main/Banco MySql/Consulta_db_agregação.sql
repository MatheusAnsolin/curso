USE sakila;

SELECT count(*) FROM film;

SELECT title FROM film where title like 'B%' OR 'H%' OR 'Z%';

SELECT CONCAT();


SELECT AVG(Val_Prod) FROM Produto WHERE Cod_Clas = 2;
SELECT AVG(Val_Prod) FROM Produto WHERE Cod_Clas = 4;



