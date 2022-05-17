/*
drop table ambulatorio;
drop table cidade;
drop table consulta;
drop table doenca;
drop table especialidade;
drop table funcionario;
drop table medico;
drop table paciente;
*/

CREATE DATABASE CONSULTA;

create table ambulatorio (
    numeroa integer identity(1, 1) not null,
    andar integer,
    capacidade integer,
    primary key (numeroa)
);

create table cidade (
    codcidade integer identity(1, 1) not null,
    descricao varchar(30),
    uf varchar(2),
    primary key (codcidade)
);

create table doenca (
    coddoenca integer identity(1, 1) not null,
    descricao varchar(30),
    constraint pk_doenca primary key (coddoenca)
);

create table especialidade (
    codesp integer identity(1, 1) not null,
    nome varchar(30),
    primary key (codesp)
);

create table medico (
    crm integer,
    nome varchar(30),
    idade integer,
    codcidade integer,
    codesp integer,
    numeroa integer,
    primary key (crm),
    foreign key (codcidade) references cidade (codcidade)
        on update cascade on delete cascade,
    foreign key (codesp) references especialidade (codesp)
        on update cascade on delete cascade,
    foreign key (numeroa) references ambulatorio (numeroa)
        on update cascade on delete cascade
);

create table paciente (
    rg integer,
    nome varchar(30),
    idade integer,
    codcidade integer,
    constraint pk_paciente primary key (rg),
    constraint paciente_cidade_fkey foreign key (codcidade)
        references cidade (codcidade) on update cascade on delete cascade
);

create table consulta (
    crm integer,
    rg integer,
    data date,
    hora integer,
    coddoenca integer,
    constraint pk_consulta primary key (crm, rg, data),
    constraint consulta_medico_fkey foreign key (crm)
        references medico (crm) on update cascade on delete cascade,
    constraint consulta_paciente_fkey foreign key (rg)
        references paciente (rg) on update no action on delete no action,
    constraint consulta_doenca_fkey foreign key (coddoenca)
        references doenca (coddoenca) on update cascade on delete cascade
);

create table funcionario (
    rg integer,
    nome varchar(30),
    idade integer,
    codcidade integer,
    salario float,
    constraint pk_funcionario primary key (rg),
    constraint funcionario_cidade_fkey foreign key (codcidade)
        references cidade (codcidade) on update cascade on delete cascade
);



ALTER TABLE ambulatorio 
ALTER COLUMN andar integer NOT NULL;

ALTER TABLE ambulatorio
ALTER COLUMN capacidade integer NOT NULL;


ALTER TABLE medico
ALTER COLUMN codesp integer NOT NULL;


ALTER TABLE [dbo].[medico] DROP CONSTRAINT [FK__medico__codesp__1920BF5C]


ALTER TABLE medico
  ADD FOREIGN KEY (codesp) REFERENCES especialidade (codesp)
  ON UPDATE CASCADE ON DELETE NO ACTION;


ALTER TABLE cidade
ALTER COLUMN descricao VARCHAR(30) NOT NULL;


ALTER TABLE cidade
ALTER COLUMN uf VARCHAR(2) NOT NULL;


ALTER TABLE medico
ALTER COLUMN codcidade integer NOT NULL;


ALTER TABLE [dbo].[medico] DROP CONSTRAINT [FK__medico__codcidad__182C9B23]

ALTER TABLE medico
  ADD FOREIGN KEY (codcidade) REFERENCES cidade (codcidade)
  ON UPDATE CASCADE ON DELETE NO ACTION;




ALTER TABLE consulta
ALTER COLUMN hora integer NOT NULL;

ALTER TABLE consulta
ALTER COLUMN coddoenca integer NOT NULL;



ALTER TABLE funcionario
ALTER COLUMN codcidade integer NOT NULL;



ALTER TABLE [dbo].[funcionario] DROP CONSTRAINT [funcionario_cidade_fkey]

ALTER TABLE funcionario
  ADD FOREIGN KEY (codcidade) REFERENCES cidade (codcidade)
  ON UPDATE CASCADE ON DELETE NO ACTION;


ALTER TABLE paciente
ALTER COLUMN nome VARCHAR(30) NOT NULL;

ALTER TABLE paciente
ALTER COLUMN idade integer NOT NULL;

ALTER TABLE paciente
ALTER COLUMN codcidade integer NOT NULL;




ALTER TABLE [dbo].[paciente] DROP CONSTRAINT [paciente_cidade_fkey]


ALTER TABLE paciente
  ADD FOREIGN KEY (codcidade) REFERENCES cidade (codcidade)
  ON UPDATE CASCADE ON DELETE NO ACTION;



ALTER TABLE especialidade
ALTER COLUMN nome VARCHAR(30) NOT NULL;

ALTER TABLE doenca
ALTER COLUMN descricao VARCHAR(30) NOT NULL;




ALTER TABLE [dbo].[consulta] DROP CONSTRAINT [consulta_paciente_fkey]

ALTER TABLE consulta
  ADD FOREIGN KEY (rg) REFERENCES  paciente (rg)
  ON UPDATE NO ACTION ON DELETE NO ACTION;



ALTER TABLE medico
ALTER COLUMN nome VARCHAR(30) NOT NULL; 

ALTER TABLE medico
ALTER COLUMN idade integer NOT NULL; 

ALTER TABLE consulta 
ALTER COLUMN hora integer NOT NULL;




ALTER TABLE [dbo].[consulta] DROP CONSTRAINT [consulta_medico_fkey]

ALTER TABLE consulta
  ADD FOREIGN KEY (crm) REFERENCES  medico (crm)
  ON UPDATE CASCADE ON DELETE NO ACTION;



insert into ambulatorio (andar, capacidade) values (1, 100);
insert into ambulatorio (andar, capacidade) values (1, 10);
insert into ambulatorio (andar, capacidade) values (2, 120);
insert into ambulatorio (andar, capacidade) values (3, 50);
insert into ambulatorio (andar, capacidade) values (4, 70);
insert into ambulatorio (andar, capacidade) values (4, 63);
insert into ambulatorio (andar, capacidade) values (5, 30);
insert into ambulatorio (andar, capacidade) values (5, 140);
insert into ambulatorio (andar, capacidade) values (5, 110);

insert into cidade (descricao, uf) values ('Barbacena', 'MG');
insert into cidade (descricao, uf) values ('Carandaí', 'MG');
insert into cidade (descricao, uf) values ('Juiz de Fora', 'MG');
insert into cidade (descricao, uf) values ('Belo Horizonte', 'MG');
insert into cidade (descricao, uf) values ('São João del Rei', 'MG');

insert into consulta values (12345, 12312,  '2015-01-03', 14, 1);
insert into consulta values (12133, 13123,  '2015-01-05', 15, 1);
insert into consulta values (65464, 34345,  '2015-02-01', 16, 1);
insert into consulta values (65464, 45645,  '2015-02-03', 17, 1);
insert into consulta values (23424, 67867,  '2015-03-03', 18, 1);
insert into consulta values (85675, 56757,  '2015-04-22', 20, 2);
insert into consulta values (12345, 35435,  '2015-05-24', 10, 2);
insert into consulta values (12133, 53453,  '2015-05-23', 11, 2);
insert into consulta values (23424, 64758,  '2015-05-29', 12, 2);
insert into consulta values (85675, 97865,  '2015-05-30', 14, 2);
insert into consulta values (12345, 12312,  '2014-06-03', 14, 1);
insert into consulta values (12133, 13123,  '2014-06-05', 15, 1);
insert into consulta values (65464, 34345,  '2014-06-01', 16, 1);
insert into consulta values (65464, 45645,  '2014-07-03', 17, 1);
insert into consulta values (23424, 67867,  '2014-08-03', 18, 1);
insert into consulta values (85675, 56757,  '2014-08-22', 20, 2);
insert into consulta values (12345, 35435,  '2014-10-24', 10, 2);
insert into consulta values (12133, 53453,  '2014-11-23', 11, 2);
insert into consulta values (23424, 64758,  '2013-12-29', 12, 2);
insert into consulta values (85675, 97865,  '2013-12-30', 14, 2);

insert into doenca (descricao) values ('sarampo');
insert into doenca (descricao) values ('rubeola');

insert into especialidade (nome) values ('Ortopedia');
insert into especialidade (nome) values ('Infectologia');

insert into funcionario values (2324234, 'João Ramos', 55, 1, 1200);
insert into funcionario values (3454464, 'Bianca Silva', 23, 2, 500);
insert into funcionario values (4343242, 'Ana Duarte', 34, 3, 550);
insert into funcionario values (4565756, 'Mariana Souza', 44, 4, 601);
insert into funcionario values (8678678, 'Daniel Ventura', 23, 5, 1900);
insert into funcionario values (4563434, 'João Ramos', 54, 5, 2000);

insert into medico values (12345, 'João da Silva', 39, 1, 2, 2);
insert into medico values (12133, 'Camila da Silva Santos', 45, 2, 1, 1);
insert into medico values (65464, 'João dos Santos', 35, 3, 2, 3);
insert into medico values (23424, 'Jose da Silva', 55, 4, 1, 5);
insert into medico values (85675, 'Joana Vieira', null, 3, 2, 7);

insert into paciente values (12312, 'Camila Vieira', 12, 1);
insert into paciente values (13123, 'Caio da Silva', 15, 2);
insert into paciente values (34345, 'Joana Pereira', 7, 3);
insert into paciente values (45645, 'Não Informado', 9, 4);
insert into paciente values (67867, 'Tiago Santos', 14, 5);
insert into paciente values (56757, 'Guilherme Vieira', 12, 1);
insert into paciente values (35435, 'Não Informado', 11, 2);
insert into paciente values (53453, 'Renata Salvador', 9, 3);
insert into paciente values (64758, 'Jessica Souza', 10, 4);
insert into paciente values (97865, 'Bianca Souza', 10, 5);






