insert into odontologos(id,apellido,matricula,nombre)
values (1, 'Dozo', 123456789, 'Tomás');
insert into odontologos(id,apellido,matricula,nombre)
values (2, 'Dienton', 9874654, 'Juan');

insert into domicilios(id,calle,localidad,numero,provincia)
values(1,'San Martin','4561','Palermo','Bs As');
insert into domicilios(id,calle,localidad,numero,provincia)
values(2,'Cervantes','1854','Godoy Cruz','Mendoza');

insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (1,'Perez', '40789456','2023-06-15','Pepito', 1);
insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (2,'Redondo', '258458698','2023-08-15','Fernando', 2);

insert into turnos(id,fecha,odontologo_id,paciente_id)
values(1,'2023-06-20',1,1);
insert into turnos(id,fecha,odontologo_id,paciente_id)
values(2,'2023-09-20',2,2);

