/* Lógico_2: */

CREATE TABLE Funcionario (
    Pnome VARCHAR,
    Minicial VARCHAR,
    Unome VARCHAR,
    cpf VARCHAR PRIMARY KEY,
    Datanas DATE,
    Endereco VARCHAR,
    Sexo VARCHAR,
    Salario FLOAT,
    Dnr VARCHAR,
    fk_Departamento_Dnumero INTEGER
);

CREATE TABLE Departamento (
    Dnome VARCHAR,
    Dnumero INTEGER PRIMARY KEY,
    DataInicioGerente DATE
);

CREATE TABLE Projeto (
    ProjNome VARCHAR,
    Projnumero INTEGER PRIMARY KEY,
    Projlocal VARCHAR
);

CREATE TABLE Dependente (
    nome_dependente VARCHAR PRIMARY KEY,
    sexo VARCHAR,
    Datanasc DATE,
    Parentesco VARCHAR,
    fk_Funcionario_cpf VARCHAR
);

CREATE TABLE localizacaoDep (
    fk_Departamento_Dnumero INTEGER,
    fk_Departamento_Dnumero_ INTEGER,
    local_dep VARCHAR PRIMARY KEY
);

CREATE TABLE supervisor (
    fk_Funcionario_cpf VARCHAR,
    fk_Funcionario_cpf_ VARCHAR,
    cpf_supervisor VARCHAR PRIMARY KEY
);

CREATE TABLE controla (
    fk_Departamento_Dnumero INTEGER,
    fk_Projeto_Projnumero INTEGER
);

CREATE TABLE trabalha_em (
    fk_Funcionario_cpf VARCHAR,
    fk_Projeto_Projnumero INTEGER
);
 
ALTER TABLE Funcionario ADD CONSTRAINT FK_Funcionario_2
    FOREIGN KEY (fk_Departamento_Dnumero)
    REFERENCES Departamento (Dnumero)
    ON DELETE RESTRICT;
 
ALTER TABLE Dependente ADD CONSTRAINT FK_Dependente_2
    FOREIGN KEY (fk_Funcionario_cpf)
    REFERENCES Funcionario (cpf)
    ON DELETE CASCADE;
 
ALTER TABLE localizacaoDep ADD CONSTRAINT FK_localizacaoDep_2
    FOREIGN KEY (fk_Departamento_Dnumero)
    REFERENCES Departamento (Dnumero)
    ON DELETE CASCADE;
 
ALTER TABLE localizacaoDep ADD CONSTRAINT FK_localizacaoDep_3
    FOREIGN KEY (fk_Departamento_Dnumero_)
    REFERENCES Departamento (Dnumero)
    ON DELETE CASCADE;
 
ALTER TABLE supervisor ADD CONSTRAINT FK_supervisor_2
    FOREIGN KEY (fk_Funcionario_cpf)
    REFERENCES Funcionario (cpf)
    ON DELETE RESTRICT;
 
ALTER TABLE supervisor ADD CONSTRAINT FK_supervisor_3
    FOREIGN KEY (fk_Funcionario_cpf_)
    REFERENCES Funcionario (cpf)
    ON DELETE RESTRICT;
 
ALTER TABLE controla ADD CONSTRAINT FK_controla_1
    FOREIGN KEY (fk_Departamento_Dnumero)
    REFERENCES Departamento (Dnumero)
    ON DELETE RESTRICT;
 
ALTER TABLE controla ADD CONSTRAINT FK_controla_2
    FOREIGN KEY (fk_Projeto_Projnumero)
    REFERENCES Projeto (Projnumero)
    ON DELETE SET NULL;
 
ALTER TABLE trabalha_em ADD CONSTRAINT FK_trabalha_em_1
    FOREIGN KEY (fk_Funcionario_cpf)
    REFERENCES Funcionario (cpf)
    ON DELETE RESTRICT;
 
ALTER TABLE trabalha_em ADD CONSTRAINT FK_trabalha_em_2
    FOREIGN KEY (fk_Projeto_Projnumero)
    REFERENCES Projeto (Projnumero)
    ON DELETE SET NULL;