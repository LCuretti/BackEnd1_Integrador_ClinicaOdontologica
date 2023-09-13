insert into odontologos(id,apellido,matricula,nombre)
values (1, 'Barril', 123456789, 'Alejandro');
insert into odontologos(id,apellido,matricula,nombre)
values (2, 'Dienton', 9874654, 'Juan');
insert into odontologos(id,apellido,matricula,nombre)
values (3, 'Colmillo', 65465, 'Aníbal');
insert into odontologos(id,apellido,matricula,nombre)
values (4, 'Encias', 9874654, 'Roberto');

insert into domicilios(id,calle,localidad,numero,provincia)
values(1,'San Martin','4561','Palermo','Bs As');
insert into domicilios(id,calle,localidad,numero,provincia)
values(2,'Cervantes','1854','Godoy Cruz','Mendoza');
insert into domicilios(id,calle,localidad,numero,provincia)
values(3,'Sagrada Familia','1011','Parque Tablada','Córdoba');
insert into domicilios(id,calle,localidad,numero,provincia)
values(4,'Emilio Civit','2015','Ciudad','Mendoza');

insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (1,'Perez', '40789456','2023-06-15','Pepito', 1);
insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (2,'Redondo', '258458698','2023-08-15','Fernando', 2);
insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (3,'Messi', '35254568','2023-09-15','Leonel', 3);
insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (4,'Mendez', '22546588','2023-07-15','Federico', 4);

insert into turnos(id,fecha,odontologo_id,paciente_id)
values(1,'2023-06-20',1,1);
insert into turnos(id,fecha,odontologo_id,paciente_id)
values(2,'2023-09-20',2,2);
insert into turnos(id,fecha,odontologo_id,paciente_id)
values(3,'2023-09-21',3,3);
insert into turnos(id,fecha,odontologo_id,paciente_id)
values(4,'2023-09-22',4,4);

