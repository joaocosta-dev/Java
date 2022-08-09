create database if not exists HomeMarket;
use HomeMarket;

drop table usuario;
create table usuario(
login varchar(25),
senha varchar(25)
);