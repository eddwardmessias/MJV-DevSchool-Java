create database tab_ficha_profissional;

use tab_ficha_profissional;

create table dados_pessoais_candidato(
Id int not null primary key auto_increment,
Nome varchar(100) not null,
Email varchar(60) not null,
Telefone varchar(100) not null,
Lougradoro varchar(100) not null,
Numero varchar(6) not null,
Bairro varchar(50) not null,
Cidade varchar(50) not null,
Estado varchar(50) not null,
Salario_Minimo decimal(6,2) not null,
Salario_Maximo decimal(6,2) not null,
Estrangeiro bit(1) not null
);

insert into dados_pessoais_candidato ( Nome, Email, Telefone, Lougradoro, Numero, Bairro, Cidade, Estado,
Salario_Minimo, Salario_Maximo, Estrangeiro) 
value ('Eddward Messias', 'eddwardmessias@gmail.com', '083988639028', 'Av. Dom Pedro l', '1400-A', 'Itararé',
'Campina Grande', 'Paraiba', 1.500, 4.500, 0);

select * from dados_pessoais_candidato;

alter table dados_pessoais_candidato add column Profissao varchar(50) not null;

select * from dados_pessoais_candidato;

delete from dados_pessoais_candidato where Id = 1;

select * from dados_pessoais_candidato;

-- change =! modify, em que um modifica o nome, outro pode medimencionar 

alter table dados_pessoais_candidato modify column Email varchar(100) not null;

select * from dados_pessoais_candidatoTelefone;

alter table dados_pessoais_candidato modify column Numero varchar(15) not null;

select * from dados_pessoais_candidatoTelefone;

alter table dados_pessoais_candidato modify column Numero varchar(15) not null;

alter table dados_pessoais_candidato modify column Telefone varchar(15) not null;

