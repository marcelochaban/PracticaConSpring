/* Populate tabla clientes */
INSERT INTO clientes (nombre, apellido, email, create_at)
VALUES ('John', 'Doe', 'johndoe@example.com', '2023-06-26');

INSERT INTO clientes (nombre, apellido, email, create_at)
VALUES ('Jane', 'Smith', 'janesmith@example.com', '2023-06-25');

INSERT INTO clientes (nombre, apellido, email, create_at)
VALUES ('Michael', 'Johnson', 'michaeljohnson@example.com', '2023-06-24');

INSERT INTO clientes (nombre, apellido, email, create_at)
VALUES ('Emily', 'Brown', 'emilybrown@example.com', '2023-06-23');

INSERT INTO clientes (nombre, apellido, email, create_at)
VALUES ('David', 'Wilson', 'davidwilson@example.com', '2023-06-22');


/*tabla de productos*/
INSERT INTO productos (nombre, descripcion, codigo, cantidad, precio, create_at)
VALUES ('lapicera', 'azul trazo fino', 'T034', 30, 200, '2023-06-22')


/*tabla de compras*/
INSERT INTO compras (create_at, total, numeroCompra, cliente_id)
VALUES ('2023-06-26', 50, 1, 1);

INSERT INTO compras (create_at, total, numeroCompra, cliente_id)
VALUES ('2023-06-25', 30, 2, 1);

INSERT INTO compras (create_at, total, numeroCompra, cliente_id)
VALUES ('2023-06-24', 20, 3, 2);

INSERT INTO compras (create_at, total, numeroCompra, cliente_id)
VALUES ('2023-06-23', 15, 4, 2);

INSERT INTO compras (create_at, total, numeroCompra, cliente_id)
VALUES ('2023-06-22', 40, 5, 3);
