package com.salmontt.app;

import com.salmontt.service.ServicioSalmonera;

/**
 * Clase principal. Punto de entrada de la aplicación.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN SALMONTT 2.0 ===");

        // 1. Instanciar el servicio
        ServicioSalmonera servicio = new ServicioSalmonera();

        // 2. Carga de datos desde archivo externo (resources)
        // Nota: Asegúrate de que el archivo existe en la raíz del proyecto o carpeta resources
        servicio.cargarDatosDesdeArchivo("resources/centros.txt");

        // 3. Listar todos los datos cargados
        servicio.listarTodo();

        // 4. Búsqueda/Filtrado (Requisito Paso 3)
        servicio.filtrarPorProduccionMayorA(1000);

        // Prueba de filtro con otro valor
        servicio.filtrarPorProduccionMayorA(2000);
    }
}