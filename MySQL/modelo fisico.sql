/* Lógico_1: */

CREATE TABLE pessoa(
nome varchar(100) NOT NULL,
email varchar(100) NOT NULL,
CPF varchar(20) NOT NULL,
RG varchar(20) NOT NULL,
orgaomissorRG varchar(50) NOT NULL,
senha varchar(10) DEFAULT '123456',
idEndereco int NOT NULL,
CONSTRAINT pk_pessoa PRIMARY KEY(CPF),
CONSTRAINT fk2_pessoa FOREIGN KEY(idEndereco) REFERENCES endereco(idEndereco),
CHECK (email LIKE '%_@_%_.__%'),
CHECK (CPF LIKE '___.___.___-__')
);

CREATE TABLE realiza (
    idpessoap INTEGER,
    idviagem INTEGER,
    PRIMARY KEY (idpessoap, idviagem)
);

CREATE TABLE viagem (
    idviagem INTEGER PRIMARY KEY,
    custo DECIMAL(8),
    tipo VARCHAR(70),
    partida INTEGER,
    destino VARCHAR(60),
    Km INTEGER,
    valor DECIMAL(8)
);

CREATE TABLE necessita (
    idViagem INTEGER,
    idVeiculo INTEGER,
    PRIMARY KEY (idViagem, idVeiculo)
);

CREATE TABLE veiculo (
    idveiculo INTEGER PRIMARY KEY,
    Km INTEGER,
    litros DECIMAL(3),
    lugares VARCHAR(45)
);

CREATE TABLE fornece (
    fidFornece INTEGER,
    vidVeiculo INTEGER,
    PRIMARY KEY (fidFornece, vidVeiculo)
);

CREATE TABLE fornecedor (
    idfornecedor INTEGER PRIMARY KEY,
    tipoautomovel VARCHAR(45),
    valor DECIMAL(8)
);

CREATE TABLE pessoa_fornecedor (
    idPessoap INTEGER,
    idFornecedor INTEGER,
    PRIMARY KEY (idPessoap, fidFornecedor)
);

CREATE TABLE pessoa_cliente (
    idpessoa INTEGER,
    idCliente INTEGER,
    PRIMARY KEY (idpessoa, idCliente)
);

CREATE TABLE cliente (
    idCliente INTEGER PRIMARY KEY,
    referencias VARCHAR(60),
    renda DECIMAL(8)
);

ALTER TABLE viagem ADD CONSTRAINT FK_viagem_2
    FOREIGN KEY (partida, ???)
    REFERENCES realiza (idviagem, ???);
 
ALTER TABLE veiculo ADD CONSTRAINT FK_veiculo_2
    FOREIGN KEY (Km, ???)
    REFERENCES fornece (vidVeiculo, ???);