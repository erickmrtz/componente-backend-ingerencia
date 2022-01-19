# inGERENCIA

## Prueba Componente Backend

### Requisitos Previos

Se recomienda tener los siguientes programas instalados:

* Java 11 (Oracle - Windows | OpenJDK - Linux/MacOS)
* Maven (3.8.2)
* Configurar variable JAVA_HOME con la ruta del JDK

### Configuración Opcional

En el archivo **application.yml** se puede configurar los siguientes variables:

* _cl.ingerencia.hacker-news.url_
* _cl.ingerencia.hacker-news.path_

### Ejecución

> Utilizando Maven directamente
> 
> ```shell
> cd <base-project-path>
> mvn spring-boot:run
> ```

> Empaquetando el servicio en un archivo JAR
> 
> ```shell
> cd <base-project-path>
> mvn clean package
> java -jar target/postulacion-0.0.1-SNAPSHOT.jar
> ```

### Servicios

El servicio para consultar los articulos recientes sobre Java
* Articulos: `GET /api/news/latest`

Revisar documentación en swagger (disponible una vez se ejecuta el servicio)
* [Swagger-UI](http://localhost:8080/api/swagger-ui/index.html) 