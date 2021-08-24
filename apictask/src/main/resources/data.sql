CREATE TABLE TB_ET_TASK (
	id int PRIMARY KEY auto_increment,
	title varchar(200),
	description TEXT,
	points int
);

INSERT INTO TB_ET_TASK VALUES (1, 'Criar BD', 'Criar banco de dados na nuvem',50);
INSERT INTO TB_ET_TASK VALUES (2, 'Protótipo', 'Prototipação de alta fidelidade',30);
INSERT INTO TB_ET_TASK VALUES (3, 'API Rest', 'Criar a API para endpoint da aplicação',150);

