insert into odontologos(id,apellido,matricula,nombre)
values (1, 'Dozo', 123456789, 'Tomás');

insert into domicilios(id,calle,localidad,numero,provincia)
values(1,'San Martin','4561','Palermo','Bs As');

insert into pacientes(id,apellido,dni,fecha_ingreso,nombre,domicilio_id)
values (1,'Perez', '40789456','2023-06-15','Pepito', 1);


insert into turnos(id,fecha,odontologo_id,paciente_id)
values(1,'2023-06-20',1,1);


