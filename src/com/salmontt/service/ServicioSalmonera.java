package com.salmontt.service;

import com.salmontt.model.CentroCultivo;
import com.salmontt.util.LectorArchivo;
import com.salmontt.util.Validador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de la lógica de negocio de Salmontt.
 * Gestiona la colección de centros de cultivo.
 */
public class ServicioSalmonera {

    // Colección principal para almacenar objetos (Requisito Paso 3)
    private List<CentroCultivo> listaCentros;
    private LectorArchivo lector;

    public ServicioSalmonera() {
        this.listaCentros = new ArrayList<>();
        this.lector = new LectorArchivo();
    }

    /**
     * Carga datos desde un archivo CSV/TXT utilizando la librería utilitaria.
     */
    public void cargarDatosDesdeArchivo(String ruta) {
        System.out.println("Cargando datos desde: " + ruta + "...");
        try {
            List<String> lineas = lector.leerLineas(ruta);

            for (String linea : lineas) {
                procesarLinea(linea);
            }
            System.out.println("Carga finalizada. Total registros: " + listaCentros.size());

        } catch (IOException e) {
            System.err.println("Error crítico al leer archivo: " + e.getMessage());
        }
    }

    /**
     * Procesa una línea de texto, valida y crea el objeto.
     */
    private void procesarLinea(String linea) {
        String[] partes = linea.split(";");

        // Validación básica de integridad de datos
        if (partes.length == 3) {
            String nombre = partes[0];
            String comuna = partes[1];
            int toneladas = Validador.intentarParsearEntero(partes[2]);

            if (toneladas >= 0) {
                CentroCultivo centro = new CentroCultivo(nombre, comuna, toneladas);
                listaCentros.add(centro);
            }
        }
    }

    /**
     * Muestra todos los registros por consola.
     */
    public void listarTodo() {
        if (listaCentros.isEmpty()) {
            System.out.println("No hay datos registrados.");
            return;
        }
        System.out.println("\n--- LISTADO GENERAL ---");
        for (CentroCultivo c : listaCentros) {
            System.out.println(c);
        }
    }

    /**
     * Filtra y muestra centros que superan X toneladas.
     */
    public void filtrarPorProduccionMayorA(int limite) {
        System.out.println("\n--- FILTRO: Producción mayor a " + limite + " Ton ---");
        boolean encontrado = false;

        for (CentroCultivo c : listaCentros) {
            if (c.getToneladas() > limite) {
                System.out.println(c);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron centros con ese criterio.");
        }
    }
}