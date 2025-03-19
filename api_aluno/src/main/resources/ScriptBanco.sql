drop database if exists banco;

create database if not exists banco;

GRANT ALL PRIVILEGES ON banco.* TO 'root'@'localhost';

USE banco;

CREATE TABLE aluno(
    matricula INT NOT NULL PRIMARY KEY,
    nome VARCHAR (100) NOT NULL,
    idade INT NOT NULL CHECK (idade>=0 AND idade <= 99),
    email VARCHAR (100) NOT NULL UNIQUE
);