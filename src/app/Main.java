package app;

// Importamos las clases del dominio que necesitamos
import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 * Clase principal para ejecutar el sistema y probar el modelo de clases.
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    public static void main(String[] args) {

        System.out.println("--- Sistema de Gestión Salmontt ---");

        // --- Creación de 3 instancias de objetos ---

        // 1. Creación del primer Empleado
        Direccion dir1 = new Direccion("Volcán Osorno 123", "Puerto Varas", "Los Lagos");
        Empleado emp1 = new Empleado("15.111.222-3", "Javier Torres", dir1, "Jefe de Cultivo", 2500000);

        // 2. Creación del segundo Empleado
        Direccion dir2 = new Direccion("Av. Costanera 456", "Puerto Montt", "Los Lagos");
        Empleado emp2 = new Empleado("18.444.555-6", "Ana Gutiérrez", dir2, "Analista de Calidad", 1800000);

        // 3. Creación de una Persona (para probar la clase base)
        Direccion dir3 = new Direccion("Ruta 5 Sur Km 1010", "Ancud", "Los Lagos");
        Persona p1 = new Persona("12.345.678-9", "Carlos Soto (Proveedor)", dir3);


        // --- Mostrar datos por consola usando toString() ---

        System.out.println("\n[Instancia 1]");
        System.out.println(emp1);

        System.out.println("\n[Instancia 2]");
        System.out.println(emp2);

        System.out.println("\n[Instancia 3]");
        System.out.println(p1);
    }
}