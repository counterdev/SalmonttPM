# Proyecto: SalmonttPM

## Descripción del Propósito

Este proyecto es la implementación de un sistema base en Java para la empresa **Salmontt**. Su objetivo es digitalizar y estructurar la información de las personas vinculadas a la organización (empleados, etc.), resolviendo problemas de duplicación de datos y desorganización. Este modelo sienta las las bases para un sistema de gestión más completo, aplicando buenas prácticas de Programación Orientada a Objetos.

## Estructura de Paquetes y Clases

El proyecto está organizado en los siguientes paquetes y clases, según la funcionalidad:

* `app/`
    * **Main.java**: Clase principal que ejecuta el sistema. Se encarga de crear instancias de los objetos y mostrarlos por consola para validar el modelo.

* `model/`
    * **Direccion.java**: Representa una dirección física. Es utilizada por la clase `Persona` mediante **composición**.
    * **Persona.java**: Clase base que representa una entidad general, con atributos como RUT, nombre y su `Direccion` (composición).
    * **Empleado.java**: Clase que **hereda** de `Persona`, añadiendo atributos específicos como cargo y salario.

## Instrucciones de Compilación y Ejecución

1.  Clonar o descargar el repositorio.
2.  Abrir el proyecto en un IDE compatible con Java (ej. IntelliJ IDEA).
3.  Ubicar el archivo `Main.java` dentro del paquete `app`.
4.  Hacer clic derecho en `Main.java` y seleccionar "Run 'Main.main()'" (o presionar el ícono de "play").
5.  Los resultados de las 3 instancias creadas se mostrarán en la consola.a consola.