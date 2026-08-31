# Informe 2 - Pruebas Unitarias

## Descripción

Proyecto desarrollado en Java utilizando Maven y JUnit para la implementación y ejecución de pruebas unitarias.

El proyecto contiene dos operaciones básicas: multiplicación y división. Cada operación cuenta con su respectiva prueba unitaria.

Además, se utilizó Git para el control de versiones, GitHub como repositorio remoto y GitHub Actions para automatizar la ejecución de las pruebas.

## Tecnologías utilizadas

- Java
- Maven
- JUnit
- Git
- GitHub
- GitHub Actions

## Estructura del proyecto

```text
informe-2/
├── .github/
│   └── workflows/
│       └── ci.yml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── informe2/
│   │           ├── Multiplicacion.java
│   │           └── Division.java
│   └── test/
│       └── java/
│           └── informe2/
│               ├── MultiplicacionTest.java
│               └── DivisionTest.java
├── .gitignore
├── pom.xml
└── README.md
```

## Pruebas unitarias

Se implementaron dos pruebas unitarias para comprobar el funcionamiento de las operaciones.

### Multiplicación

Se verifica que la multiplicación de 4 por 3 entregue como resultado 12.

### División

Se verifica que la división de 10 por 2 entregue como resultado 5.

### Ejecución de las pruebas

Las pruebas pueden ejecutarse utilizando Maven mediante:

```
mvn test
```

La ejecución local de las pruebas finalizó correctamente, sin fallos ni errores.

## Control de versiones

Se utilizó Git para registrar los cambios realizados durante el desarrollo.

La rama utilizada para trabajar con las pruebas es:

```
feature/pruebas-unitarias
```

También se cuenta con una rama principal:

```
main
```

## Integración continua

Se configuró un pipeline mediante GitHub Actions para ejecutar automáticamente las pruebas.

El workflow se encuentra en:

```
.github/workflows/ci.yml
```

El pipeline configura Java y ejecuta las pruebas utilizando Maven.

### Reporte de pruebas

Los resultados generados por Maven Surefire son almacenados como un artefacto del pipeline, permitiendo consultar posteriormente los resultados de las pruebas ejecutadas.

## .gitignore

Se incorporó un archivo `.gitignore` para evitar subir al repositorio archivos generados por Maven y configuraciones propias del entorno de desarrollo.
