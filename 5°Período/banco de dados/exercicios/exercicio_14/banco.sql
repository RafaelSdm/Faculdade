

CREATE DATABASE VENDA;


CREATE TABLE empresa(
	
	cnpj VARCHAR(30) NOT NULL,
	ie VARCHAR(20),
	razao_social VARCHAR(70),
	nome_fantasia VARCHAR(70),
	end_logradouro VARCHAR(70),
	end_numero INT,
	end_bairro VARCHAR(70),
	end_cidade VARCHAR(70),
	end_estado VARCHAR(70),
	end_cep VARCHAR(10),
	
	PRIMARY KEY(cnpj)


);

INSERT INTO empresa
VALUES('12345678910', '345678', 'mercadolivre', 'social', 'rua avenida m', 150, 'centro','barbacena', 'mg', '36290000');

INSERT INTO empresa
VALUES('2345678912', '46789', 'vale', 'social', 'rua avenida macedo', 1500, 'centro','capela nova', 'rg', '34560000');

CREATE TABLE cupon_fiscal (
	
	ccf INT NOT NULL,
	data DATE,
	hora TIME,
	valor_total FLOAT,
	empresa_cnpj VARCHAR(30),
	funcionario_caixa_idfuncionario_caixa INT
	
	PRIMARY KEY(ccf)

);

CREATE TABLE item_cupom_fiscal(
	

	cupom_fiscal_ccf INT NOT NULL,
	produto_idproduto INT NOT NULL,
	item INT NOT NULL,
	qtd VARCHAR(45),
	valor_item VARCHAR(45),

	PRIMARY KEY (cupom_fiscal_ccf, produto_idproduto, item)




);



CREATE TABLE produto (
	
	idproduto INT NOT NULL,
	nome  VARCHAR(70),
	descricao VARCHAR(100),
	unidade VARCHAR(45),
	preco_unitario FLOAT,

	PRIMARY KEY(idproduto)




);

CREATE  TABLE funcionario(
	
	cpf VARCHAR(20) NOT NULL,    
	nome VARCHAR(20),
	rg VARCHAR(20),
	end_logradouro VARCHAR(70),
	end_numero INT,
	end_cidade VARCHAR(70),
	end_bairro VARCHAR(70),
	end_estado VARCHAR(70),
	end_cep VARCHAR(70),
	data_admissao DATE,
	n_carteira_trabalho VARCHAR(45),

	PRIMARY KEY (cpf)


);

INSERT INTO funcionario 
VALUES('123.456.789.00', 'Roberto', '123.456.77', 'rua avenida dalas', 34, 'Carandai', 'centro', 'mg', '36290888', '20/01/2020', '123456789');

INSERT INTO funcionario 
VALUES('145.966.709.00', 'Luís', '133.556.88', 'rua avenida jose', 34, 'capela nova', 'centro', 'mg', '36290000', '14/05/2021', '123456777');

CREATE TABLE funcionario_caixa(
	
	idfuncionario_caixa INT NOT NULL,
	data_abertura DATE,
	hora_abertura TIME,
	valor_abertura FLOAT,
	data_fechamento DATE,
	hora_fechamento TIME,
	valor_fechamento FLOAT,
	funcionario_cpf VARCHAR(20),
	caixa_idcaixa INT,

	PRIMARY KEY(idfuncionario_caixa)



);

CREATE TABLE caixa(
	
	idcaixa INT,
	descricao VARCHAR(100),

	PRIMARY KEY(idcaixa)



);



/*

ALTER TABLE cadastro_faculdade ADD CONSTRAINT FK_cadastro_faculdade_2
    FOREIGN KEY (cadastro_universidade_sigla)
    REFERENCES cadastro_universidade (sigla)
    ON DELETE RESTRICT;



	COMO FAZER PROCEDURE

	PASTA PROGRAMACAO

*/


ALTER TABLE cupon_fiscal ADD CONSTRAINT FK_cupon_fiscal_2
	
	FOREIGN KEY(empresa_cnpj)
	REFERENCES empresa(cnpj)
	ON DELETE NO ACTION;
	




ALTER TABLE cupon_fiscal ADD CONSTRAINT FK_cupon_fiscal_3
	
	FOREIGN KEY(funcionario_caixa_idfuncionario_caixa)
	REFERENCES funcionario_caixa(idfuncionario_caixa)
	ON DELETE NO ACTION;


ALTER TABLE funcionario_caixa ADD CONSTRAINT FK_funcionario_caixa_2

	FOREIGN KEY(funcionario_cpf)
	REFERENCES funcionario(cpf)
	ON DELETE NO ACTION;

ALTER TABLE funcionario_caixa ADD CONSTRAINT FK_funcionario_caixa_3
	
	FOREIGN KEY (caixa_idcaixa)
	REFERENCES caixa(idcaixa);


ALTER TABLE funcionario_caixa
  ADD FOREIGN KEY (caixa_idcaixa) REFERENCES caixa(idcaixa)
  ON DELETE NO ACTION;



INSERT INTO cupon_fiscal
VALUES (000000, '01/01/1997', '12:00', 3.000, '12345678910', 01);

INSERT INTO cupon_fiscal(ccf, data, hora, valor_total, empresa_cnpj, funcionario_caixa_idfuncionario_caixa )
VALUES (000001, '02/01/1997', '12:10', 3.500, '12345678910', 02);

INSERT INTO item_cupom_fiscal
VALUES (000000, 11111, 001, '10', '250');

INSERT INTO item_cupom_fiscal
VALUES (000001, 22222,  002, '20', '500');

INSERT INTO produto
VALUES (11111, 'Vela Audi', 'Vela para motor', '12', 250);

INSERT INTO produto
VALUES (22222, 'Vela Mercedes', 'Vela para motor', '7', 500);

INSERT INTO funcionario_caixa
VALUES (01, '145.966.709.00', 11 , '01/01/1997', '08:00', 1.000, '01/01/1997', '18:00', 10.000);

INSERT INTO funcionario_caixa
VALUES (02, '123.456.789.00', 22 , '02/01/1997', '08:00', 1.000, '02/01/1997', '18:00', 15.000);

INSERT INTO caixa
VALUES (11, 'caixa 1');

INSERT INTO caixa
VALUES (22, 'caixa 2');

SELECT * FROM cupon_fiscal;