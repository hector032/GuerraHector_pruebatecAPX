# Proyecto APX insert y select.

Este proyecto se centra en almacenar la información de un cliente en una base de datos Oracle mediante un proceso de inserción. Se han establecido restricciones y requisitos específicos para garantizar la consistencia y cumplir con los estándares requeridos.

## Restricciones

* El nombre de la tabla está dentro del esquema WIKJ con el nombre de T_WIKJ_HAB_PRUEBAFINAL.
* Se valida antes de hacer la inserción de la información que el nuip no se pueda repetir nunca en un registro, por lo cual en nuestro sql de la creación de la tabla ponemos el campo nuip como UNIQUE.
* Tenemos un DTO de salida y otro de entrada, ambos pasando obligatoriamente por la librería de negocio.

## Proceso y Salida

La salida esperada refleja la misma información proporcionada como entrada. Esta salida se obtiene realizando una consulta SELECT utilizando el ID recibido o devolviendo directamente la información de entrada.

## Herramientas y Procedimientos

* Utilizamos apx-cli para la creación del DTO, la librería y la transacción.
* Utilizamos la utilidad JDBC generada por apx-cli para gestionar la conexión con la base de datos Oracle.

## Pruebas y Validación

1. Verificamos en el header del postman, el campo logical-transaction-code = WIKJT456.
  ![1](https://github.com/hector032/GuerraHector_pruebatecAPX/blob/main/verificaciones/1.jpeg)


2. Insertamos valores a nuestra tabla con el id=1 y el nuip=1.
   ![2](https://github.com/hector032/GuerraHector_pruebatecAPX/blob/main/verificaciones/2.jpeg)


3. Revisamos que se haya agregado en la base de datos (DBeaver).
  ![3](https://github.com/hector032/GuerraHector_pruebatecAPX/blob/main/verificaciones/3.jpeg)


4. Intentamos insertar nuevos valores pero con el mismo nuip del registro anterior nuip=1 y confirmamos que da error porque el nuip es Unique y no permite registros que se repitan con el mismo nuip
  ![4](https://github.com/hector032/GuerraHector_pruebatecAPX/blob/main/verificaciones/4.jpeg)


## Importante
* Estamos trabajando sobre el DTO WIKJC456,  Libreria WIKJR456, y transaction WIKJT456

## Configuración y Ejecución

1. Clonar este repositorio.
2. Compilar y ejecutar el proyecto utilizando Docker y configurar las credenciales del WIKJ en el APX OPERATON CONSOLE.
3. Descargar el archivo pruebaTecnicaApx.sql para poder utilizar el proyecto con el mismo enfoque que el autor del mismo.
3. Realizar pruebas utilizando Postman u otra herramienta similar.

## Authors

- [@hector032](https://www.github.com/hector032)
