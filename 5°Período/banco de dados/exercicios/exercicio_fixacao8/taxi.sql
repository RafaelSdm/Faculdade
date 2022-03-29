/* Lógico_1: */

CREATE TABLE Cliente (
    cliid INTEGER PRIMARY KEY,
    nome VARCHAR
);

CREATE TABLE taxi (
    placa VARCHAR PRIMARY KEY,
    modelo VARCHAR,
    marca VARCHAR,
    anofab DATE
);

CREATE TABLE Cliente_Empresa (
    cnpj VARCHAR,
    Cliente_cliid INTEGER PRIMARY KEY
);

CREATE TABLE Cliente_Particular (
    cpf VARCHAR,
    Cliente_cliid INTEGER PRIMARY KEY
);

CREATE TABLE corrida (
    Cliente_cliid INTEGER,
    taxi_placa VARCHAR,
    data_pedido DATE
);
 
ALTER TABLE Cliente_Empresa ADD CONSTRAINT FK_Cliente_Empresa_2
    FOREIGN KEY (Cliente_cliid)
    REFERENCES Cliente (cliid)
    ON DELETE CASCADE;
 
ALTER TABLE Cliente_Particular ADD CONSTRAINT FK_Cliente_Particular_2
    FOREIGN KEY (Cliente_cliid)
    REFERENCES Cliente (cliid)
    ON DELETE CASCADE;
 
ALTER TABLE corrida ADD CONSTRAINT FK_corrida_1
    FOREIGN KEY (Cliente_cliid)
    REFERENCES Cliente (cliid)
    ON DELETE SET NULL;
 
ALTER TABLE corrida ADD CONSTRAINT FK_corrida_2
    FOREIGN KEY (taxi_placa)
    REFERENCES taxi (placa)
    ON DELETE SET NULL;