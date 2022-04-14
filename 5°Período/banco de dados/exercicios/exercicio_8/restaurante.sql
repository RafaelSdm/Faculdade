/* Lógico_1: */

CREATE DATABASE RESTAURANTE;

CREATE SCHEMA SERVICE;

CREATE TABLE SERVICE.Restaurante (
    cnpj VARCHAR(16) PRIMARY KEY NOT NULL ,
    nome VARCHAR(50),
    numero INT,
    descricao VARCHAR(200),
    categoria_restaurante_id INT,
    shopping_cnpj VARCHAR(16)
);

CREATE TABLE SERVICE.shopping (
    cnpj VARCHAR(16) PRIMARY KEY NOT NULL,
    nome VARCHAR(50),
    latitute FLOAT,
    longitude FLOAT,
    cidade VARCHAR(100),
    estado VARCHAR(30),
    pais VARCHAR(50),
    bairro VARCHAR(50),
    rua VARCHAR(50),
    numero INTEGER
);

CREATE TABLE SERVICE.item_cardapio (
    id INTEGER PRIMARY KEY NOT NULL,
    nome VARCHAR(50),
    valor FLOAT,
    descricao VARCHAR(200),
    tempo_preparo TIME,
    categoria_cardapio_id INTEGER
);

CREATE TABLE SERVICE.cardapio (
    id INTEGER PRIMARY KEY NOT NULL,
    descricao VARCHAR(200),
    Restaurante_cnpj VARCHAR(16)
);

CREATE TABLE SERVICE.categoria_Item (
    id INTEGER PRIMARY KEY NOT NULL,
    titulo VARCHAR(50),
    descricao VARCHAR(60),
    obrigatorio BIT,
    qtd_itens INTEGER,
    item_cardapio_id INTEGER
);

CREATE TABLE SERVICE.opcao_categoria (
    id INTEGER PRIMARY KEY NOT NULL,
    titulo VARCHAR(50),
    descricao VARCHAR(50),
    valor FLOAT,
    categoria_Item_id INTEGER
);

CREATE TABLE SERVICE.horario_funcionamento (
    idDia INTEGER PRIMARY KEY NOT NULL,
    hora_inicial TIME,
    hora_final TIME,
    Restaurante_cnpj VARCHAR(16)
);

CREATE TABLE SERVICE.telefone (
    telefone VARCHAR(11) PRIMARY KEY NOT NULL,
    shopping_cnpj VARCHAR(16)
);

CREATE TABLE SERVICE.categoria_cardapio (
    id INTEGER PRIMARY KEY NOT NULL,
    descricao VARCHAR(200),
    cardapio_id INTEGER
);

CREATE TABLE SERVICE.categoria_restaurante (
    id INTEGER PRIMARY KEY NOT NULL,
    nome VARCHAR(60)
);
 
ALTER TABLE SERVICE.Restaurante ADD CONSTRAINT FK_Restaurante_categoria
    FOREIGN KEY (categoria_restaurante_id)
    REFERENCES SERVICE.categoria_restaurante (id)
    ON DELETE  NO ACTION;
 
ALTER TABLE SERVICE.Restaurante ADD CONSTRAINT FK_Restaurante_shopping
    FOREIGN KEY (shopping_cnpj)
    REFERENCES SERVICE.shopping (cnpj)
    ON DELETE  NO ACTION;
 
ALTER TABLE SERVICE.item_cardapio ADD CONSTRAINT FK_item_cardapio_categoria_cardapio
    FOREIGN KEY (categoria_cardapio_id)
    REFERENCES SERVICE.categoria_cardapio (id)
    ON DELETE  NO ACTION;
 
ALTER TABLE SERVICE.cardapio ADD CONSTRAINT FK_cardapio_restaurante
    FOREIGN KEY (Restaurante_cnpj)
    REFERENCES SERVICE.Restaurante (cnpj)
    ON DELETE  NO ACTION;
 
ALTER TABLE SERVICE.categoria_Item ADD CONSTRAINT FK_categoria_Item_item_cardapio
    FOREIGN KEY (item_cardapio_id)
    REFERENCES SERVICE.item_cardapio (id)
    ON DELETE  NO ACTION;
 
ALTER TABLE SERVICE.opcao_categoria ADD CONSTRAINT FK_opcao_categoria_categoria_item
    FOREIGN KEY (categoria_Item_id)
    REFERENCES SERVICE.categoria_Item (id)
    ON DELETE  NO ACTION;
 
ALTER TABLE SERVICE.horario_funcionamento ADD CONSTRAINT FK_horario_funcionamento_restaurante
    FOREIGN KEY (Restaurante_cnpj)
    REFERENCES SERVICE.Restaurante (cnpj)
    ON DELETE NO ACTION;
 
ALTER TABLE SERVICE.telefone ADD CONSTRAINT FK_telefone_shopping
    FOREIGN KEY (shopping_cnpj)
    REFERENCES SERVICE.shopping (cnpj)
    ON DELETE CASCADE;
 
ALTER TABLE SERVICE.categoria_cardapio ADD CONSTRAINT FK_categoria_cardapio_id
    FOREIGN KEY (cardapio_id)
    REFERENCES SERVICE.cardapio (id)
    ON DELETE  NO ACTION;