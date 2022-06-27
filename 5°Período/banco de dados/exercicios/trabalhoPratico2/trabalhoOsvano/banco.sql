/* Lógico_4: */



CREATE DATABASE UNIPAC

CREATE TABLE cadastro_universidade (
    nome VARCHAR(70),
    sigla VARCHAR(70) PRIMARY KEY,
    cidade VARCHAR(70),
    endereco VARCHAR(70)
);

CREATE TABLE cadastro_faculdade (
    sigla VARCHAR(70) PRIMARY KEY,
    nome VARCHAR(70),
    cidade VARCHAR(70),
    enderoco VARCHAR(70),
    data_implatacao DATE,
    cadastro_universidade_sigla VARCHAR(70)
);

CREATE TABLE aluno (
    matricula VARCHAR(30) PRIMARY KEY,
    nome VARCHAR(30),
    cpf VARCHAR(30),
    endereco VARCHAR(30),
    telefone VARCHAR(30),
    turma_codigo VARCHAR(30),
	codigo_curso VARCHAR(30)
);

CREATE TABLE disciplina (
    codigo VARCHAR(30) PRIMARY KEY,
    carga_horaria INT,
    codigo_curso VARCHAR(30)	
);

CREATE TABLE conteudo (
    item VARCHAR(30) PRIMARY KEY,
    carga_horaria INT,
    disciplina_codigo VARCHAR(30)
);

CREATE TABLE curso (
    nome VARCHAR(70),
    codigo VARCHAR(30) PRIMARY KEY,
    duracao INT,
    cadastro_faculdade_sigla VARCHAR(70)
);

CREATE TABLE turma (
    codigo VARCHAR(30) PRIMARY KEY,
    ano_criacao DATE,
    sala_numero VARCHAR(70)
);
	
CREATE TABLE professor (
    nome VARCHAR(30),
    matricula VARCHAR(30),
    cpf VARCHAR(30) PRIMARY KEY,
    endereco VARCHAR(30),
    disciplina_codigo VARCHAR(30)
);

CREATE TABLE telefone (
    numero VARCHAR(30) PRIMARY KEY,
    tipo VARCHAR(30),
    professor_cpf VARCHAR(30)
);

CREATE TABLE cordenacao (
    sigla VARCHAR(30) PRIMARY KEY,
    codigo_bloco VARCHAR(30),
    codigo_sala VARCHAR(70),
    ramal VARCHAR(30),
    codigo_curso VARCHAR(30)
);

CREATE TABLE recursos_didaticos (
    nome VARCHAR(30),
    codigo VARCHAR(30) PRIMARY KEY,
    descricao VARCHAR(30),
    professor_cpf VARCHAR(30)
);

CREATE TABLE bloco (
    codigo_id VARCHAR(30) PRIMARY KEY,
    area FLOAT,
    bloco_TIPO VARCHAR(30),
    cadastro_faculdade_sigla VARCHAR(70)
);

CREATE TABLE sala (
    numero VARCHAR(70) PRIMARY KEY,
    area FLOAT,
    sala_TIPO VARCHAR(30),
    bloco_codigo_id VARCHAR(30),
);
 
ALTER TABLE cadastro_faculdade ADD CONSTRAINT FK_cadastro_faculdade_2
    FOREIGN KEY (cadastro_universidade_sigla)
    REFERENCES cadastro_universidade (sigla)
    ON DELETE NO ACTION;
 
ALTER TABLE aluno ADD CONSTRAINT FK_aluno_2
    FOREIGN KEY (turma_codigo)
    REFERENCES turma (codigo)
    ON DELETE NO ACTION;

ALTER TABLE aluno ADD CONSTRAINT FK_aluno_3
    FOREIGN KEY (codigo_curso)
    REFERENCES curso (codigo)
    ON DELETE NO ACTION;
 
ALTER TABLE disciplina ADD CONSTRAINT FK_disciplina_2
    FOREIGN KEY (codigo_curso)
    REFERENCES curso (codigo)
    ON DELETE NO ACTION;
 
ALTER TABLE conteudo ADD CONSTRAINT FK_conteudo_2
    FOREIGN KEY (disciplina_codigo)
    REFERENCES disciplina (codigo)
    ON DELETE NO ACTION;
 
ALTER TABLE curso ADD CONSTRAINT FK_curso_4
    FOREIGN KEY (cadastro_faculdade_sigla)
    REFERENCES cadastro_faculdade (sigla)
    ON DELETE CASCADE;
 
ALTER TABLE turma ADD CONSTRAINT FK_turma_2
    FOREIGN KEY (sala_numero)
    REFERENCES sala (numero)
    ON DELETE NO ACTION;
 
ALTER TABLE professor ADD CONSTRAINT FK_professor_2
    FOREIGN KEY (disciplina_codigo)
    REFERENCES disciplina (codigo)
    ON DELETE NO ACTION;
 
ALTER TABLE telefone ADD CONSTRAINT FK_telefone_2
    FOREIGN KEY (professor_cpf)
    REFERENCES professor (cpf)
    ON DELETE CASCADE;
 
ALTER TABLE cordenacao ADD CONSTRAINT FK_cordenacao_2
    FOREIGN KEY (codigo_curso)
    REFERENCES curso (codigo); 
 
 ALTER TABLE cordenacao ADD CONSTRAINT FK_cordenacao_3
    FOREIGN KEY (codigo_curso)
    REFERENCES curso (codigo);

ALTER TABLE cordenacao ADD CONSTRAINT FK_cordenacao_4
    FOREIGN KEY (codigo_bloco)
    REFERENCES bloco(codigo_id);

ALTER TABLE cordenacao ADD CONSTRAINT FK_cordenacao_5
    FOREIGN KEY (codigo_sala)
    REFERENCES sala(numero);

ALTER TABLE recursos_didaticos ADD CONSTRAINT FK_recursos_didaticos_2
    FOREIGN KEY (professor_cpf)
    REFERENCES professor (cpf)
    ON DELETE NO ACTION;
 
ALTER TABLE bloco ADD CONSTRAINT FK_bloco_2
    FOREIGN KEY (cadastro_faculdade_sigla)
    REFERENCES cadastro_faculdade (sigla)
    ON DELETE CASCADE;
 
ALTER TABLE sala ADD CONSTRAINT FK_sala_2
    FOREIGN KEY (bloco_codigo_id)
    REFERENCES bloco (codigo_id)
    ON DELETE CASCADE; 


INSERT INTO cadastro_universidade
VALUES ('Universidade Federal de Alfenas', 'UNIFAL', 'Alfenas', 'Av.Celina Ferreira Ottoni, 4000');

INSERT INTO cadastro_faculdade
VALUES ( 'UNIFALP', 'Universidade Federal de Alfenas - Campus Poços de Caldas', 'Alfenas', 'R.Gabriel Monteiro da Silva, 700', '01-07-2005', 'UNIFAL');

INSERT INTO cadastro_faculdade
VALUES ( 'UNIFALV', 'Universidade Federal de Alfenas - Campus Varginha', 'Varginha', 'Av.Celina Ferreira Ottoni, 4000', '01-03-2010', 'UNIFAL');

INSERT INTO bloco
VALUES ( '201745', 2000, 'Didatico', 'UNIFALV');

INSERT INTO bloco
VALUES ( '547102', 1500, 'Administrativo', 'UNIFALP');

INSERT INTO sala
VALUES ('1101', 50, 'Administrativo', '201745');

INSERT INTO sala
VALUES ('1102', 55, 'Didatico', '201745');

INSERT INTO sala
VALUES ('1103', 60, 'Didatico', '201745');

INSERT INTO sala
VALUES ('1104', 45, 'Didatico', '201745');

INSERT INTO sala
VALUES ('2101', 45, 'Didático', '547102');

INSERT INTO sala
VALUES ('2102', 45, 'Administrativo', '547102');

INSERT INTO sala
VALUES ('2103', 48, 'Administrativo', '547102');

INSERT INTO sala
VALUES ('2104', 52, 'Administrativo', '547102');

INSERT INTO curso
VALUES ('Medicina', '159753', 10, 'UNIFALP');

INSERT INTO curso
VALUES ('Odontologia', '357951', 10, 'UNIFALV');

INSERT INTO cordenacao
VALUES ('CM','201745', '1101', '9', '159753');

INSERT INTO cordenacao
VALUES ('CO','547102', '2102', '1', '357951');

INSERT INTO turma
VALUES ('852258', '01-07-2005', '2101');

INSERT INTO turma
VALUES ('456654', '01-03-2010', '1104');

INSERT INTO aluno
VALUES ('202-00020', 'Bernardo Resende Andrés', '105.104.103-22', 'R. Floriano Peixoto', '(32)99934-4366', '852258', '159753');

INSERT INTO aluno
VALUES ('202-00030', 'Rafael de Souza Damasceno', '112.204.528-33', 'R. Coronel Onorio', '(32)98427-8796', '852258', '357951');

INSERT INTO aluno
VALUES ('203-00040', 'Claudimar José da Cruz', '132.306.934-44', 'Av. Olegário Maciel', '(32)98829-8668', '456654', '159753');

INSERT INTO aluno
VALUES ('203-00050', 'Pedro Paes', '193.454.207-55', 'R. Bom Jardim', '(32)99452-9173', '456654', '357951');

INSERT INTO disciplina
VALUES ('8264', 80, '159753');

INSERT INTO disciplina
VALUES ('4628', 120, '159753');

INSERT INTO disciplina
VALUES ('9272', 60, '357951');

INSERT INTO disciplina
VALUES ('2729', 80, '357951');

INSERT INTO conteudo
VALUES ('Anatomia', 120, '4628');

INSERT INTO conteudo
VALUES ('Biologia celular e molecular', 80, '8264');

INSERT INTO conteudo
VALUES ('Prótese dentária', 60, '9272');

INSERT INTO conteudo
VALUES ('Periodontia', 80, '2729');

INSERT INTO professor
VALUES ('Nairon Neri', '300-01020', '206.545.207-66', 'Av. Rio Branco', '8264');

INSERT INTO professor
VALUES ('Marcos Grisse', '300-02030', '602.454.703-77', 'R. José Martins', '4628');

INSERT INTO professor
VALUES ('Robson Souza', '300-03040', '853.496.579-88', 'R. São Miguel', '9272');

INSERT INTO professor
VALUES ('José Osvano', '300-04050', '474.285.314-99', 'Av. 23 de Maio', '2729');

INSERT INTO telefone
VALUES('(31)98733-6060', 'celular', '206.545.207-66')

INSERT INTO telefone
VALUES('(31)98743-6790', 'celular', '602.454.703-77');

INSERT INTO telefone
VALUES('(31)9973-7090', 'celular', '853.496.579-88');

INSERT INTO telefone
VALUES('(31)9563-1540', 'celular', '474.285.314-99');

INSERT INTO recursos_didaticos
VALUES ('Kit educativo tridimensional', '963', 'Material tridimensional','206.545.207-66');

INSERT INTO recursos_didaticos
VALUES ('Atlas de anatomia humana', '752', 'Livro sobre anatomia humana','602.454.703-77');

INSERT INTO recursos_didaticos
VALUES ('Kit protese dentaria', '027', 'próteses dentarias','853.496.579-88');

INSERT INTO recursos_didaticos
VALUES ('Manual de instrumentação', '764', 'Livro com instruções ','474.285.314-99');

select * from cadastro_universidade;

select * from listar_professor;


