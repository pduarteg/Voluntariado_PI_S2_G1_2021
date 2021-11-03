create database delhersapp;
use delhersapp;

create table usuario(
id_usuario int auto_increment primary key,
nombre varchar(20) unique not null,
pass varchar(15) not null
);

alter table usuario change column nombre nombre varchar(20) unique not null;
select * from usuario;
create table boleta(
numboleta int primary key,
numrecibo int,
dateboleta varchar(15) not null,
datefactura varchar(15),
monto decimal not null,
factura int,
id_usuario int not null,
id_region int,
tipo int,
foreign key (id_usuario) references usuario(id_usuario),
foreign key (id_region) references region(idregion),
foreign key (tipo) references tipo (idtipo)
);

create table region(
idregion int primary key auto_increment,
nombre varchar(50) not null
);

create table tipo(
idtipo int primary key auto_increment,
descripcion varchar(30)
);

drop table tipo;
drop table region;