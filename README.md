# Informe 2 - Pruebas Unitarias y BDD

## Descripción

Proyecto desarrollado en Java utilizando Maven, JUnit 4 y Cucumber para la implementación y ejecución de pruebas unitarias y pruebas basadas en comportamiento (BDD).

El proyecto implementa operaciones de multiplicación y división, utilizando pruebas automatizadas para verificar su funcionamiento.

También se utilizó Git y GitHub para el control de versiones y GitHub Actions para ejecutar las pruebas mediante integración continua.

## Tecnologías utilizadas

- Java
- Maven
- JUnit 4.13.2
- Cucumber
- Gherkin
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
│   │           ├── Divide.java
│   │           └── Multiplica.java
│   │
│   └── test/
│       ├── java/
│       │   └── informe2/
│       │       ├── CucumberTest.java
│       │       ├── DivideTest.java
│       │       ├── MultiplicaTest.java
│       │       ├── PerformanceTest.java
│       │       └── steps/
│       │           └── DivideSteps.java
│       │
│       └── resources/
│           └── features/
│               └── divide.feature
│
├── .gitignore
├── pom.xml
└── README.md
```

## Pruebas unitarias

Se implementaron pruebas unitarias utilizando JUnit 4.13.2 para comprobar las operaciones de multiplicación y división.

### Multiplicación

Se verifica que la multiplicación de 4 por 3 entregue como resultado 12.

### División

Se verifica que la división de 10 por 2 entregue como resultado 5.

### Ejecución de las pruebas

Las pruebas se ejecutan mediante Maven:

```
mvn test
```

## Pruebas BDD

Para la prueba de división se utilizó Cucumber y Gherkin.

Se implementó:

- Un escenario de división.
- Un `Scenario Outline`.
- Una tabla `Examples` con diferentes casos de prueba.
- Step Definitions para conectar los escenarios con el código Java.

El archivo de escenarios se encuentra en:

```
src/test/resources/features/divide.feature
```

Las Step Definitions se encuentran en:

```
src/test/java/informe2/steps/DivideSteps.java
```

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

Las pruebas fueron incorporadas al flujo de integración continua mediante GitHub Actions.

El workflow se encuentra en:

```
.github/workflows/ci.yml
```

El pipeline configura Java y ejecuta las pruebas utilizando Maven:

```
mvn test
```

La ejecución permite comprobar automáticamente que las pruebas unitarias y BDD continúen funcionando correctamente.

### Reporte de pruebas

Los resultados generados por Maven Surefire son almacenados como un artefacto del pipeline, permitiendo consultar posteriormente los resultados de las pruebas ejecutadas.

### Reporte BDD

Cucumber fue configurado para generar un reporte HTML:

```
target/cucumber-report.html
```

Este reporte permite revisar los resultados de los escenarios ejecutados.

## Prueba de performance

Se implementó una prueba básica de rendimiento sobre la operación de división.

Se realizaron 10.000 operaciones y se registraron:

- TPS.
- Latencia promedio.
- Porcentaje de errores.

Los resultados obtenidos durante la ejecución fueron:

- TPS: 28.441.410,69 operaciones/segundo.
- Latencia promedio: 0,00003516 ms.
- Errores: 0 %.

## Dashboard

Se elaboró un dashboard para resumir los principales resultados de las pruebas unitarias, BDD y performance.

Los indicadores considerados fueron:

- Cantidad de pruebas ejecutadas.
- Pruebas exitosas.
- Escenarios BDD.
- TPS.
- Latencia.
- Porcentaje de errores.
- Estado de la ejecución del CI.

## Alertas

Se definieron alertas para identificar posibles problemas durante la ejecución de las pruebas.

Se consideraron como situaciones de alerta:

- Fallos en pruebas unitarias.
- Fallos en escenarios BDD.
- Porcentaje de errores superior al límite definido.
- Aumento de la latencia por sobre el límite establecido.

## .gitignore

Se incorporó un archivo `.gitignore` para evitar subir al repositorio archivos generados por Maven y configuraciones propias del entorno de desarrollo.

## Resultado final

La última ejecución de Maven obtuvo:

```
Tests run: 7
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

Esto indica que las pruebas unitarias, los escenarios BDD y la prueba de performance se ejecutaron correctamente.
