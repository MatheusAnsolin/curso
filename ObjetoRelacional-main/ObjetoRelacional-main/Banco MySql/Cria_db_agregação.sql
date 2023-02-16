create database db_agregação;
use db_agregação;
DROP table classe, produto;
Create table classe(Cod_Clas int primary key, Nome_Clas VARCHAR(45));

CREATE TABLE produto (
    Cod_Prod INT KEY,
    Cod_Clas INT,
    Tip_Prod VARCHAR(45),
    Nome_Prod VARCHAR(45),
    Qnd_Prod INT,
    Val_Prod VARCHAR(45)
);

INSERT INTO classe(Cod_Clas, Nome_Clas) VALUES (1, 'animal'),
(2, 'nome'), 
(3, 'fruta'), 
(4, 'carro'), 
(5, 'livro'), 
(6, 'cidade'), 
(7, 'mercado'), 
(8, 'igreja');

INSERT INTO produto(Cod_Prod, Cod_Clas, Tip_Prod, Nome_Prod, Qnd_Prod, Val_Prod) VALUES 
/* foreign key, segundo campo, 1 */
( 1, 1, 'mamifero', 'girafa', 99, 1), 
( 2, 1, 'mamifero', 'macaco', 99, 1), 
( 3, 1, 'mamifero', 'morcego', 99, 1), 
( 4, 1, 'ave', 'papagaio',13,1), 
( 5, 1, 'peixe', 'tilapia', 13, 59),

/* foreign key, segundo campo, 3 */
( 6, 3, 'verde', 'kiwi', 17, 3),
( 7, 3, 'amarelo', 'banana', 10, 5),
( 8, 3, 'amarelo', 'mamão', 7, 8),
( 9, 3, 'vermelho', 'maça', 50, 13),

/* foreign key, segundo campo, 2 */
( 10, 2, 'homem', 'pedro', 2, 1),
( 11, 2, 'homem', 'jonas', 0, 1),
( 12, 2, 'mulher', 'maria', 99, 1),
( 13, 2, 'mulher', 'joberta', 0, 1),

/* foreign key, segundo campo, 4 */
( 14, 4, 'chevrolet', 'corsa', 99, 20),
( 15, 4, 'chevrolet', 'onix', 99, 60),
( 16, 4, 'fiat', 'palio', 99, 10);




