/* Lógico_2: */

CREATE TABLE Ambulatorio (
    numeroA INTEGER PRIMARY KEY,
    andar INTEGER,
    capacidade INTEGER,
    Funcionario_rg VARCHAR
);

CREATE TABLE Cidade (
    codCidade VARCHAR PRIMARY KEY,
    descricao VARCHAR,
    uf VARCHAR
);

CREATE TABLE especialidade (
    codEsp VARCHAR PRIMARY KEY,
    nome VARCHAR
);

CREATE TABLE Medico (
    crm VARCHAR PRIMARY KEY,
    nome VARCHAR,
    idade INTEGER,
    especialidade_codEsp VARCHAR,
    Cidade_codCidade VARCHAR,
    Ambulatorio_numeroA INTEGER
);

CREATE TABLE Paciente (
    rg VARCHAR PRIMARY KEY,
    nome VARCHAR,
    idade INTEGER,
    Cidade_codCidade VARCHAR
);

CREATE TABLE Consulta (
    data DATE PRIMARY KEY,
    hora TIMESTAMP,
    Paciente_rg VARCHAR,
    Medico_crm VARCHAR,
    Doenca_codDoenca VARCHAR
);

CREATE TABLE Funcionario (
    rg VARCHAR PRIMARY KEY,
    nome VARCHAR,
    idade INTEGER,
    salario FLOAT,
    Cidade_codCidade VARCHAR
);

CREATE TABLE Doenca (
    codDoenca VARCHAR PRIMARY KEY,
    descricao VARCHAR
);
 
ALTER TABLE Ambulatorio ADD CONSTRAINT FK_Ambulatorio_2
    FOREIGN KEY (Funcionario_rg)
    REFERENCES Funcionario (rg)
    ON DELETE CASCADE;
 
ALTER TABLE Medico ADD CONSTRAINT FK_Medico_2
    FOREIGN KEY (especialidade_codEsp)
    REFERENCES especialidade (codEsp)
    ON DELETE CASCADE;
 
ALTER TABLE Medico ADD CONSTRAINT FK_Medico_3
    FOREIGN KEY (Cidade_codCidade)
    REFERENCES Cidade (codCidade)
    ON DELETE CASCADE;
 
ALTER TABLE Medico ADD CONSTRAINT FK_Medico_4
    FOREIGN KEY (Ambulatorio_numeroA)
    REFERENCES Ambulatorio (numeroA)
    ON DELETE CASCADE;
 
ALTER TABLE Paciente ADD CONSTRAINT FK_Paciente_2
    FOREIGN KEY (Cidade_codCidade)
    REFERENCES Cidade (codCidade)
    ON DELETE CASCADE;
 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_2
    FOREIGN KEY (Paciente_rg)
    REFERENCES Paciente (rg)
    ON DELETE RESTRICT;
 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_3
    FOREIGN KEY (Medico_crm)
    REFERENCES Medico (crm)
    ON DELETE CASCADE;
 
ALTER TABLE Consulta ADD CONSTRAINT FK_Consulta_4
    FOREIGN KEY (Doenca_codDoenca)
    REFERENCES Doenca (codDoenca)
    ON DELETE CASCADE;
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_2
    FOREIGN KEY (Cidade_codCidade)
    REFERENCES Cidade (codCidade)
    ON DELETE CASCADE;