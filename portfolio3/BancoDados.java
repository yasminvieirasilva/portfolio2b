 CREATE TABLE restaurante(
  cnpj varchar (10) not null,
  garcons int ,
  mesas int, 
  cadeiras int,
  ComidaDisponivel int,
  PRIMARY KEY (cnpj)
  );
  
  CREATE TABLE estoque(
    totalDisponivel int not null,
    bebidas int,
    frutosMar int,
    verduras int,
    frutas int,
    carnes int,
    PRIMARY KEY (totalDisponivel)
    FOREIGN KEY (totalDisponivel)
    REFERENCES(disponivelEstoque)
    );
    
    CREATE TABLE funcionarios (
      cpf int not null,
        nome VARCHAR (20) not null,
        formacao VARCHAR (20) not NULL,
        setor VARCHAR (20) not null,
        salario int not null,
        turno int not null,
      PRIMARY KEY (cpf)
      );
      
     CREATE TABLE cardapio(
       DisponivelEstoque int not null,
       bebidasNAlcoolicas VARCHARr (10),
       alergias VARCHAR (20),
       bebidasAlcoolicas VARCHAR (20),
       saladas VARCHAR (20),
       sobremesas VARCHAR(20),
       pratos principais VARCHAR (20),
       PRIMARY KEY (disponivelEstoque)
       )
