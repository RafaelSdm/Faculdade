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



SELECT P.rg, P.nome, P.idade, P.codcidade FROM paciente AS P, doenca, consulta
WHERE descricao = 'sarampo' AND  consulta.rg = P.rg;

SELECT DISTINCT P.* 
FROM paciente AS P
INNER JOIN consulta AS C ON P.rg = C.rg 
INNER JOIN  doenca AS D ON C.coddoenca =  D.coddoenca
WHERE D.descricao = 'sarampo';


SELECT M.*
FROM medico AS M
INNER JOIN especialidade AS E ON E.nome = 'Ortopedia'
WHERE M.idade > 40;


SELECT DISTINCT C.*
FROM consulta AS C
INNER JOIN medico AS M ON M.crm = C.crm
WHERE C.crm != 46  AND C.crm != 79;


SELECT A.*
FROM ambulatorio AS A
WHERE A.andar = 4 AND A.capacidade >= 50 OR A.andar >=3;

SELECT * FROM ambulatorio;

SELECT * FROM ambulatorio;

SELECT ambulatorio.numeroa, ambulatorio.capacidade, medico.nome FROM ambulatorio, medico
WHERE ambulatorio.andar = 5;


SELECT DISTINCT M.nome, E.nome  
FROM medico AS  M
INNER JOIN especialidade as E ON M.codesp = E.codesp;

SELECT A.numeroa
FROM ambulatorio AS A
WHERE A.andar = 3;

SELECT M.crm, C.data
FROM medico AS M
INNER JOIN consulta AS C ON C.crm = M.crm
INNER JOIN paciente AS P ON P.rg = 12312 OR P.rg = 45645; 


SELECT A.numeroa, A.andar, A.capacidade
FROM ambulatorio AS A
WHERE A.andar != 2 AND A.andar != 4 AND A.capacidade >= 50; 


SELECT M.nome, C.hora, C.data
FROM medico AS M
INNER JOIN consulta AS C ON M.crm = C.crm;


SELECT A.numeroa, A.capacidade, M.nome 
FROM ambulatorio AS A
LEFT JOIN medico as M ON A.numeroa = M.numeroa
WHERE A.andar = 5;
