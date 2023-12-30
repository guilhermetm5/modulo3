REM   Script: entrega2
REM   quase la

CREATE TABLE cliente ( 
    id_cliente INTEGER, 
    nome VARCHAR2(20), 
    cpf VARCHAR2(14) 
);

CREATE TABLE vendedor ( 
    id_vendedor INTEGER, 
    nome VARCHAR2(20) 
);

CREATE TABLE pedido ( 
    id_cliente INTEGER, 
    id_vendedor INTEGER, 
    valor NUMBER (5,2) 
);

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Joao Silva', '010020003');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Pedro Pedra', '010020004');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Paulo Antonio', '0010030044');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Rosa Bege', '0090030004');

INSERT INTO cliente (id_cliente, nome, cpf) VALUES (1, 'Ana Maria', '0050523000');

SELECT * FROM cliente;

INSERT INTO vendedor (id_vendedor, nome) VALUES (1, 'Robernilson') 
INSERT INTO vendedor (id_vendedor, nome) VALUES (2, 'Fabilson') 
INSERT INTO vendedor (id_vendedor, nome) VALUES (3, 'Amarilson');

INSERT INTO vendedor (id_vendedor, nome) VALUES (1, 'Robernilson');

INSERT INTO vendedor (id_vendedor, nome) VALUES (2, 'Fabilson');

INSERT INTO vendedor (id_vendedor, nome) VALUES (3, 'Amarilson');

UPDATE cliente 
SET id_cliente = 2 
WHERE nome = 'Pedro Pedra';

UPDATE cliente 
SET id_cliente = 3 
WHERE nome = 'Paulo Antonio';

UPDATE cliente 
SET id_cliente = 4 
WHERE nome = 'Rosa Bege';

UPDATE cliente 
SET id_cliente = 5 
WHERE nome = 'Ana Maria';

SELECT * FROM cliente;

INSERT INTO pedido (id_cliente, id_vendedor, valor) VALUES (1, 1, 27.99);

INSERT INTO pedido (id_cliente, id_vendedor, valor) VALUES (2, 3, 27.99);

INSERT INTO pedido (id_cliente, id_vendedor, valor) VALUES (3, 2, 27.99);

ALTER TABLE cliente ADD CONSTRAINT id_cliente_pk PRIMARY KEY (id_cliente);

ALTER TABLE vendedor ADD CONSTRAINT id_vendedor_pk PRIMARY KEY (id_vendedor);

ALTER TABLE pedido ADD CONSTRAINT id_cliente_fk FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente);

ALTER TABLE pedido ADD CONSTRAINT id_vendedor_fk FOREIGN KEY (id_vendedor) REFERENCES vendedor(id_vendedor);

SELECT * FROM pedido;

UPDATE pedido 
    SET valor = 129.99 
    WHERE idcliente = 2;

UPDATE pedido 
    SET valor = 129.99 
    WHERE id_cliente = 2;

UPDATE pedido 
    SET valor = 229.99 
    WHERE id_cliente = 3;

SELECT * FROM pedido;

CREATE TABLE produto ( 
    id_produto INTEGER, 
    nome VARCHAR2(20), 
    peso NUMBER(5,2) 
);

INSERT INTO produto (id_produto, nome, peso) VALUES (1, 'Carro de Controle Remoto', 5.0);

INSERT INTO produto (id_produto, nome, peso) VALUES (2, 'Boneca Barbie', 1.0);

INSERT INTO produto (id_produto, nome, peso) VALUES (3, 'Max Steel', 2.0);

SELECT * FROM produto;

INSERT INTO produto (id_produto, nome, peso) VALUES (1, 'Carro de Brinquedo', 5.0);

SELECT * FROM produto;

ALTER TABLE pedido ADD id_produto INTEGER;

ALTER TABLE pedido ADD CONSTRAINT id_produto_fk FOREIGN KEY (id_produto) REFERENCES produto(id_produto);

SELECT * FROM pedido;

ALTER TABLE produto ADD CONSTRAINT id_produto_pk PRIMARY KEY (id_produto);

ALTER TABLE pedido ADD CONSTRAINT id_produto_fk FOREIGN KEY (id_produto) REFERENCES produto(id_produto);

SELECT * FROM pedido;

SELECT cliente.nome, pedido.valor 
FROM cliente 
INNER JOIN pedido ON cliente.id_cliente = pedido.id_cliente;

