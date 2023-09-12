insert into odontologo(apellido, matricula, nombre, id)
values ('Dozo', 123456789, 'Tomás', 1);

insert into domicilio(id,calle,numero,localidad,provincia)
values(1,'San Martin','4561','Palermo','Bs As');

insert into paciente(id, nombre,apellido, dni, fecha_ingreso, domicilio_id)
values (1,'Perez', '40789456','2023-06-15',"Pepito", 1);


insert into turno(id,paciente_id,odontologo_id,fecha)
values(1,1,1,'2023-06-20 15:00');