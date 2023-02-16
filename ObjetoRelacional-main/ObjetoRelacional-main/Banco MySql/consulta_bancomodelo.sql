USE db_prova;

SELECT * FROM aluno;

SELECT id, disciplina FROM db_prova.prova;

SELECT pergunta FROM db_prova.pergunta WHERE pergunta = 'O que';

SELECT nome, celular FROM aluno WHERE nome = 'lha';

SELECT pergunta, prova_id FROM perguntas, prova WHERE pergunta_id = 2 or 5 or 7;


SELECT 