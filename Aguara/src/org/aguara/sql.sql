select  max(i.id) from personas i;
drop table personas, tecnico
drop table productos, pedidoservicio, detallepedido, servicio, solicitudes;
select * from solicitudes;
ALTER TABLE solicitudes DROP prioridad; 
drop table pedidoservicio, detallepedido;
select * from productos
delete from productos where id=0;
select max(i.id)from Productos i