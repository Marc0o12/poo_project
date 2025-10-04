CREATE TABLE tbprodutos
(
	id SERIAL NOT NULL,
	name VARCHAR(30) NOT NULL,
	price NUMERIC(10,2) NOT NULL,
	quantity INT NOT NULL DEFAULT 0,
	CONSTRAINT pk_tbprodutos PRIMARY KEY (id)
);
SELECT * FROM tbproducts;

CREATE TABLE tbvendas
(
	id SERIAL NOT NULL,
	name VARCHAR(30) NOT NULL,
	price NUMERIC(10,2) NOT NULL,
	quantity INT NOT NULL DEFAULT 0,
	CONSTRAINT pk_tbprodutos PRIMARY KEY (id)
);
SELECT * FROM tbvendas;