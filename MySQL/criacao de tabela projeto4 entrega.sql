CREATE DATABASE db_biblioteca;

USE db_biblioteca;


CREATE TABLE IF NOT EXISTS TBL_LIVROS (
id_livro smallint AUTO_INCREMENT PRIMARY KEY,
nome_livro varchar(50) NOT NULL,
data_pub date NOT NULL,
preco_livro decimal NOT NULL
);

CREATE TABLE IF NOT EXISTS id_pessoa (
id_pessoa smallint AUTO_INCREMENT PRIMARY KEY,
nome varchar(100) NOT NULL,
email varchar(100) NOT NULL,
CPF varchar(20) NOT NULL,
RG varchar(20) NOT NULL,
orgaomissorRG varchar(50) NOT NULL,
senha varchar(10) DEFAULT '123456',
idEndereco int NOT NULL
);

CREATE TABLE IF NOT EXISTS realiza (
    idpessoap INTEGER,
    idviagem INTEGER,
    PRIMARY KEY (idpessoap, idviagem)
);

CREATE TABLE IF NOT EXISTS viagem (
    idviagem INTEGER PRIMARY KEY,
    custo DECIMAL(8),
    tipo VARCHAR(70),
    partida INTEGER,
    destino VARCHAR(60),
    Km INTEGER,
    valor DECIMAL(8)
);

CREATE TABLE IF NOT EXISTS necessita (
    idViagem INTEGER,
    idVeiculo INTEGER,
    PRIMARY KEY (idViagem, idVeiculo)
);

CREATE TABLE IF NOT EXISTS veiculo (
    idveiculo INTEGER PRIMARY KEY,
    Km INTEGER,
    litros DECIMAL(3),
    lugares VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS fornece (
    fidFornece INTEGER,
    vidVeiculo INTEGER,
    PRIMARY KEY (fidFornece, vidVeiculo)
);

CREATE TABLE IF NOT EXISTS fornecedor (
    idfornecedor INTEGER PRIMARY KEY,
    tipoautomovel VARCHAR(45),
    valor DECIMAL(8)
);


CREATE TABLE IF NOT EXISTS pessoa_cliente (
    idpessoa INTEGER,
    idCliente INTEGER,
    PRIMARY KEY (idpessoa, idCliente)
);

CREATE TABLE IF NOT EXISTS cliente (
    idCliente INTEGER PRIMARY KEY,
    referencias VARCHAR(60),
    renda DECIMAL(8)
);

