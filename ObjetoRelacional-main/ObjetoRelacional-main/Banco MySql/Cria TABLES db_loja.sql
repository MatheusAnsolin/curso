USE db_loja;

create table filial (id INT NOT NULL AUTO_INCREMENT, 
cnpj VARCHAR(15) NOT NULL PRIMARY KEY ,
razaoSocial VARCHAR(15),
nomeFantasiaFilial VARCHAR(15),
 endereco VARCHAR(15),
 cidade VARCHAR(15),
 cep VARCHAR(15),
 estado VARCHAR(15),
 pais VARCHAR(15),
inscricaoEstadual VARCHAR(15));
 
create table prioridade(id INT NOT NULL AUTO_INCREMENT, nome VARCHAR(15));
create table fornecedor(id INT NOT NULL AUTO_INCREMENT, nome VARCHAR(15));




 