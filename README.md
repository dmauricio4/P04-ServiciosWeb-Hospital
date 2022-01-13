# P04-ServiciosWeb-Hospital


## Objetivos

1. Diseña y desarrolla servicios restful para los roles de paciente y cita médica, de acuerdo a los requisitos funcionales establecidos en el documento.
2. Probar los servicios con Postman para verificar la funcionalidad correctamente.

## Estructura del proyecto

1. JPA

![JPA](https://user-images.githubusercontent.com/49213231/149355769-9d6dd8a2-4e09-4175-a84c-544f4c0eecd4.png)

2. Packages
![packages](https://user-images.githubusercontent.com/49213231/149355587-1c953bad-586e-409e-a4ef-9e91911581b4.png)

## Servicios

## PacienteResource
   1. Login. Servicio para el login del paciente y la prueba en el postman.
        
![1 loginPaciente](https://user-images.githubusercontent.com/49213231/149356964-85a18c2e-1859-4339-ac5d-0f35ffe06b04.png)


![p1](https://user-images.githubusercontent.com/49213231/149357479-0e123d13-5858-423b-82de-f4ace64e9cad.png)


   2. Listar pacientes por Especialidad
    
![2 listar](https://user-images.githubusercontent.com/49213231/149357061-95b1143b-a997-4a1b-b739-87b2cc9508c4.png)


![p2](https://user-images.githubusercontent.com/49213231/149357538-d10d82a7-7971-4500-a6df-5821ac43d439.png)


   3. Buscar Doctor por id.
 
![3 buscar](https://user-images.githubusercontent.com/49213231/149357143-6aab3651-10e1-4da1-ad20-38945102803c.png)

![p3](https://user-images.githubusercontent.com/49213231/149357584-6497c57e-8955-421e-bb4f-a2b35ed76472.png)

      
  ## CitaResource
   1. Crear una Cita Medica.

![1 crear](https://user-images.githubusercontent.com/49213231/149358006-633902ec-c004-450f-a1a3-9cfdda7ff126.png)

![p1](https://user-images.githubusercontent.com/49213231/149358622-e6e9beb7-23eb-4b6f-bb83-dd122980755b.png)

   2. Actualizar Cita Medica.

![2 actualizar estado](https://user-images.githubusercontent.com/49213231/149358016-cba56ad9-de92-4b0a-8a88-6929c998405f.png)

![p2](https://user-images.githubusercontent.com/49213231/149358633-f88d84af-ba72-4e63-95c5-c7605c3c5f95.png)

   3. Cancelar Cita Medica.
 
![3 cancela r citamedica](https://user-images.githubusercontent.com/49213231/149358032-7d492919-3833-41c4-92ff-75b4390d1ddd.png)

![p3](https://user-images.githubusercontent.com/49213231/149358644-27a85067-6d53-42d8-89fe-e9937284a593.png)

   4. Listar estado Cita Médica.

![4 listar estado](https://user-images.githubusercontent.com/49213231/149358037-50983140-4d19-40b8-b819-c58eb25e8182.png)

![p4](https://user-images.githubusercontent.com/49213231/149358653-892306ae-e580-4028-9d79-fbef9eb940de.png)

   5. Listar estado de la Cita Mèdica por fecha.

![5 lista estado por fecha](https://user-images.githubusercontent.com/49213231/149358045-79761865-2441-491e-b9c1-6c702de386de.png)

![p5](https://user-images.githubusercontent.com/49213231/149358662-538152ee-3480-43d7-b894-8bb338946b72.png)

## Datos en la BD Postgresql-

## Paciente

![pacbd](https://user-images.githubusercontent.com/49213231/149359513-524a7a8e-4dae-43de-8ba2-04814eedeed3.png)

## Cita Medica

![citabd](https://user-images.githubusercontent.com/49213231/149359524-25885288-c5d1-4580-890f-f73a0051120a.png)

## Resultados obtenidos.

Con la guía del Diagrama de clases se implementó los servicios RestFul para Paciente y la creación de Citas Médicas, cada servicio fue puesto a prueba con el software Postman y funciono de acuerdo a los establecido en los requerimientos.

## Conclusiones.

RESTFUL es uno de los servicios web más importantes, más usados, está basado en la arquitectura REST y se basan en HTTP para el intercambio de información, realiza peticiones a recursos (servidor) y no necesita ningún tipo de encapsulado extra. Este servicio es más ligero, pero a la vez tiene más limitaciones a comparación del servicio web SOAP. De acuerdo con la documentación SOAP tiene la capacidad para integrar en sistemas heterogéneos mientras que Restful es usado en la web y está dirigida para clientes desconocidos.


## Integrantes

1. Magna Mejía
2. Andres Bermeo
3. Diego Castro
4. Vinicio Veletanga
5. Domenica Muñoz
