Proyecto: SalmonttPM (Gestión Modular)

Descripción del Sistema

SalmonttPM es una aplicación de gestión desarrollada en Java para la empresa salmonera Salmontt. Esta versión representa la segunda fase del desarrollo, enfocada en la modularidad, la validación de datos y la carga automatizada de información.

El sistema moderniza la administración de los centros de cultivo, permitiendo la carga masiva de registros desde archivos externos, validando la integridad de los datos numéricos y ofreciendo herramientas de búsqueda y filtrado. Su diseño modular (model, util, service, app) asegura la escalabilidad y facilita el mantenimiento futuro.

Estructura del Proyecto

El código fuente ha sido reorganizado bajo el dominio com.salmontt en paquetes funcionales para separar responsabilidades:

com.salmontt.model: Define las entidades del dominio.

CentroCultivo.java: Clase que modela un centro de cultivo con atributos encapsulados y validaciones internas.

com.salmontt.util: Librería personalizada de utilidades reutilizables.

LectorArchivo.java: Herramienta genérica para la lectura de archivos de texto plano o CSV.

Validador.java: Utilidad para la conversión y validación segura de datos numéricos.

com.salmontt.service: Lógica de negocio.

ServicioSalmonera.java: Gestiona la colección de centros, coordina la carga de datos utilizando la librería util y aplica la lógica de filtros.

com.salmontt.app: Punto de entrada.

Main.java: Clase principal limpia que inicia y orquesta la ejecución del sistema.

Funcionalidades Clave

Carga Dinámica: Lee archivos .txt o .csv y crea objetos automáticamente.

Validación de Datos: Detecta errores de formato numérico y evita la creación de objetos inválidos sin detener el programa.

Búsqueda y Filtrado: Permite filtrar centros de cultivo según criterios de producción (ej. > 1000 toneladas).

Reporte por Consola: Muestra la información de manera formateada y legible.

Instrucciones de Ejecución

Para ejecutar el programa desde IntelliJ IDEA o mediante el archivo JAR:

Asegúrate de que el archivo de datos centros.txt se encuentre en la carpeta resources en la raíz del proyecto.

Desde IntelliJ: Navega al paquete src/com/salmontt/app, haz clic derecho en Main.java y selecciona "Run 'Main.main()'".

Desde JAR: Si has generado el artefacto, ejecuta java -jar SalmonttPM.jar en la terminal, asegurándote de que la carpeta resources esté en el mismo directorio.