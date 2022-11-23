create table livraria (
  nome VARCHAR (20) not null,
  cnpj int not null,
  locali VARCHAR (20) not null,
  estantes int not null,
  primary KEY(cnpj),
  );
  create table livros(
    nome VARCHAR (20) not null,
  editora VARCHAR (20) not null,
    genero VARCHAR (20) not null,
    NumeroPaginas int not null,
    autor VARCHAR (25) not null,
    QuantidadeEstoque int not null,
    primary key (nome)
    );
    create TABLE clientes(
      nome VARCHAR (20) not null,
      cpf int not null,
      email VARCHAR (50) not NULL,
      telefone int not null,
      primary key (cpf)
      );
      create table funcionarios(
        cpf int not null,
        nome VARCHAR (20) not null,
        formacao VARCHAR (20) not NULL,
        setor VARCHAR (20) not null,
        salario int not null,
        turno int not null,
        primary key (cpf)
        )
      
