DROP TABLE IF EXISTS reserva_complemento;
DROP TABLE IF EXISTS reserva;
DROP TABLE IF EXISTS tarifa_categoria;
DROP TABLE IF EXISTS complemento;
DROP TABLE IF EXISTS consultorio;
DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS categoria;

CREATE TABLE categoria (
  id_categoria mediumint(9) identity primary key,
  nombre varchar(50) NULL,
  descripcion varchar(200) NULL
);

CREATE TABLE usuario (
  id_usuario mediumint(9) identity primary key,
  nombre varchar(50) NULL,
  apellido varchar(50) NULL,
  tipo varchar(50) NULL,
  telefono varchar(50) NULL,
  celular varchar(50) NULL,
  contrasena varchar(50) NULL
);

CREATE TABLE consultorio (
  id_consultorio mediumint(9) identity primary key,
  nombre varchar(50) NULL,
  descripcion varchar(200) NULL,
  status varchar(50) NULL,
  id_categoria mediumint(9) NULL,
  FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE complemento (
  id_complemento mediumint(9) identity primary key,
  nombre varchar(50) NULL,
  descripcion varchar(200) NULL,
  status varchar(50) NULL,
  id_categoria mediumint(9) NULL,
  FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE tarifa_categoria (
  id_tarifa mediumint(9) identity primary key,
  tarifa float NULL,
  descripcion varchar(200) NULL,
  id_categoria mediumint(9) NULL,
  FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE reserva (
  id_reserva mediumint(9) identity primary key,
  id_usuario mediumint(9) NULL,
  id_consultorio mediumint(9) NULL,
  id_tarifa mediumint(9) NULL,
  fecha_inicial datetime NULL,
  fecha_final datetime NULL,
  estado varchar(50) NULL,
  FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
  FOREIGN KEY (id_consultorio) REFERENCES consultorio(id_consultorio),
  FOREIGN KEY (id_tarifa) REFERENCES tarifa_categoria(id_tarifa)
);

CREATE TABLE reserva_complemento (
  id_reserva_complemento identity primary key,
  id_complemento mediumint(9) NULL,
  id_reserva mediumint(9) NULL,
  FOREIGN KEY (id_complemento) REFERENCES complemento(id_complemento),
  FOREIGN KEY (id_reserva) REFERENCES reserva(id_reserva)
);