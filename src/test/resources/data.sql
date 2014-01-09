/*INSERTAR USUARIOS*/
insert into usuario (id_usuario,nombre,apellido,tipo,telefono,celular,contrasena) 
values(1,'Hugo','Lezama','Admin','55555555','52555555','mipass');

/*INSERTAR CATEGORIA*/
insert into categoria (id_categoria,nombre,descripcion)
values (1,'Consultorio Estandar','Categoria de Consultorios Estandar');

insert into categoria (id_categoria,nombre,descripcion)
values (2,'Complemento Estandar','Categoria de Complementos Estandar');

/*INSERTAR CONSULTORIO*/
insert into consultorio (id_consultorio,nombre,descripcion,status,id_categoria)
values (1,'Consultorio 1','Consultorio de Prueba','Disponible',1);

/*INSERTAR COMPLEMENTO*/
insert into complemento (id_complemento,nombre,descripcion,status,id_categoria)
values (1,'Complemento 1','Complemento de Prueba 1','Disponible',2);

insert into complemento (id_complemento,nombre,descripcion,status,id_categoria)
values (2,'Complemento 2','Complemento de Prueba 2','Disponible',2);

/*INSERTAR TARIFA_CATEGORIA*/
insert into tarifa_categoria (id_tarifa,tarifa,descripcion,id_categoria)
values (1,100.00,'Tarifa para Consultorio Estandar',1);

insert into tarifa_categoria (id_tarifa,tarifa,descripcion,id_categoria)
values (2,50.00,'Tarifa para Complemento Estandar',2);

/*INSERTAR RESERVA*/
insert into reserva (id_reserva,id_usuario,id_consultorio,id_tarifa,fecha_inicial,fecha_final,estado)
values (1,1,1,1,'2014-01-09T14:00:00','2014-01-09T15:00:00','confirmado');

/*INSERTAR RESERVA_COMPLEMENTO*/
insert into reserva_complemento (id_reserva_complemento,id_reserva,id_complemento)
values(1,1,1);

insert into reserva_complemento (id_reserva_complemento,id_reserva,id_complemento)
values(2,1,2);
