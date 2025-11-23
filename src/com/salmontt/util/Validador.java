package com.salmontt.util;

/**
 * Clase utilitaria para validaciones de datos.
 */
public class Validador {

    /**
     * Intenta convertir un String a int. Retorna -1 si falla.
     */
    public static int intentarParsearEntero(String dato) {
        try {
            return Integer.parseInt(dato.trim());
        } catch (NumberFormatException e) {
            System.err.println("Advertencia: El dato '" + dato + "' no es un número válido.");
            return -1; // Retorno de error controlado
        }
    }
}