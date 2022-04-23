﻿# Actividad-13-Registros


Hacer una base de datos que almacene datos de personas y una fecha particular (nombre, apellido, edad, sexo, estatura, peso, IMC, fecha).

Hacer un servicio web basado en REST que use los verbos GET y PUT, de tal forma que se consulten las personas por 
cualquiera de los elementos que componen a un registro y que también se pueda agregar gente a través de dicho
servicio web en caso de que no exista ya un registro igual.

La respuesta de la API REST debe estar en formato JSON.


# creacion de base de datos en MySQL

CREATE SCHEMA `bdpersona` DEFAULT CHARACTER SET utf8 ;

USE bdpersona;

CREATE TABLE Persona
(
IdPersona int primary key not null  auto_increment,
Nombres varchar (45) not null,
Apellidos varchar (45) not null,
Edad int not null,
Sexo varchar (45) not null,
Estatura FLOAT not null,
Peso FLOAT not null,
Imc FLOAT not null,
Fecha DATE
);

INSERT INTO Persona (IdPersona,Nombres, Apellidos, Edad,Sexo,Estatura,Peso,Imc,Fecha) VALUES
('0','daniel','perez','22','hombre','1.65','85','27.755','2020-03-25');
