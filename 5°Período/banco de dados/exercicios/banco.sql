/* Lógico_2: */


CREATE DATABASE BANCO;
CREATE DATABASE BANCO1;


CREATE TABLE Banco (
    codigo VARCHAR(20) PRIMARY KEY NOT NULL,
    nome VARCHAR(50)
);



CREATE TABLE Agencia (
    numero_agencia VARCHAR(20) NOT NULL,
    endereco VARCHAR(76),
    Banco_codigo VARCHAR(20) NOT NULL,
    PRIMARY KEY (numero_agencia, Banco_codigo)
);



CREATE TABLE cliente (
    cpf VARCHAR(20) PRIMARY KEY NOT NULL,
    nome VARCHAR(50),
    sexo VARCHAR(1),
    endereco VARCHAR(50)
);



CREATE TABLE conta (
    numero_conta VARCHAR(20) PRIMARY KEY NOT NULL,
	banco_codigo VARCHAR(20),
    saldo FLOAT,
    tipo_conta VARCHAR(20),
    numero_agencia VARCHAR(20),
	
	
);



CREATE TABLE telefone (
    telefone VARCHAR(30) NOT NULL,
    cliente_cpf VARCHAR(20),
    PRIMARY KEY (telefone, cliente_cpf)
);



CREATE TABLE historico (
    data_inicio DATE,
    cliente_cpf VARCHAR(20),
    conta_numero_conta VARCHAR(20),
    PRIMARY KEY (cliente_cpf, conta_numero_conta)
);


 
ALTER TABLE Agencia ADD CONSTRAINT Agencia_2
    FOREIGN KEY (Banco_codigo)
    REFERENCES Banco (codigo)
    ON DELETE NO ACTION
	ON UPDATE NO ACTION;
 
ALTER TABLE conta ADD CONSTRAINT conta_2
    FOREIGN KEY (numero_agencia, banco_codigo )
    REFERENCES Agencia (numero_agencia, Banco_codigo)

    ON DELETE NO ACTION 
	ON UPDATE NO ACTION;
 
ALTER TABLE telefone ADD CONSTRAINT FK_telefone_2
    FOREIGN KEY (cliente_cpf)
    REFERENCES cliente (cpf)
    ON DELETE NO ACTION
	ON UPDATE NO ACTION;
 
ALTER TABLE historico ADD CONSTRAINT FK_historico_2
    FOREIGN KEY (cliente_cpf)
    REFERENCES cliente (cpf)
    ON DELETE CASCADE
	ON UPDATE NO ACTION;
 
ALTER TABLE historico ADD CONSTRAINT FK_historico_3
    FOREIGN KEY (conta_numero_conta)
    REFERENCES conta (numero_conta)
    ON DELETE CASCADE
	ON UPDATE NO ACTION;



INSERT INTO Banco(codigo, nome)
VALUES ('1', 'Banco Do Brasil');

INSERT INTO Banco(codigo, nome)
VALUES('4', 'CEF');


INSERT INTO Agencia(numero_agencia, endereco, Banco_codigo)
VALUES('0562', 'Rua Joaquim Teixeira alves, 1555','4');

INSERT INTO Agencia(numero_agencia, endereco, Banco_codigo)
VALUES('3153', 'Av. Marcelino Pires, 1960', '1');

INSERT INTO cliente(cpf, nome, sexo, endereco)
VALUES('111.222.333-44', 'Jennifer B Souza', 'F','Rua Cuiabá, 1050');

INSERT INTO cliente(cpf, nome, sexo, endereco)
VALUES('666.777.888-99', 'Caetano K Lima', 'M', 'Rua Ivinhema, 879');

INSERT INTO cliente(cpf, nome, sexo, endereco )
VALUES('555.444.777-33', 'Silvia Macedo', 'F', 'Rua Estados Unidos, 735');

INSERT INTO conta(numero_conta, saldo, tipo_conta, numero_agencia)
VALUES('86340-2', '763.05', '2', '3153');

INSERT INTO conta(numero_conta, saldo, tipo_conta,numero_agencia)
VALUES('23584-7', '3879.12', '1', '0562');



INSERT INTO historico(cliente_cpf, conta_numero_conta, data_inicio)
VALUES('111.222.333-44','23584-7','17-12-1997');

INSERT INTO historico(cliente_cpf, conta_numero_conta, data_inicio)
VALUES('666.777.888-99', '23584-7', '17-12-1997');

INSERT INTO historico(cliente_cpf, conta_numero_conta, data_inicio)
VALUES('555.444.777-33', '86340-2', '29-11-2010');


INSERT INTO telefone(cliente_cpf, telefone)
VALUES('111.222.333-44', '(67)3422-7788');

INSERT INTO telefone(cliente_cpf, telefone)
VALUES('666.777.888-99', '(67)3423-9900');

INSERT INTO telefone(cliente_cpf, telefone)
VALUES('666.777.888-99', '(67)8121-8833')


ALTER TABLE dbo.cliente
ADD Email VARCHAR(40);

SELECT cpf, endereco 
FROM cliente
WHERE nome = 'Paulo A Lima';

SELECT numero_agencia, endereco
FROM Agencia
WHERE Banco_codigo = '1';

SELECT numero_conta, numero_agencia, nome
FROM conta ,historico, cliente 
WHERE cpf = cliente_cpf AND numero_conta = conta_numero_conta;

SELECT *
FROM cliente
WHERE sexo = 'M';

SELECT *
FROM Agencia, Banco
WHERE numero_agencia = '0562' AND codigo = Banco_codigo;

DELETE FROM conta
WHERE numero_conta = '86340-2';


UPDATE Agencia
SET numero_agencia = '6342'
WHERE numero_agencia = '0562';

UPDATE conta
SET numero_agencia = '6342'
WHERE numero_agencia = '0562';

UPDATE cliente
SET Email = 'caetanolima@gmail.com. '
WHERE nome = 'Caetano K Lima';

UPDATE conta
SET saldo =  saldo * 1.1
WHERE numero_conta = '23584-7';
SELECT *
FROM conta;

