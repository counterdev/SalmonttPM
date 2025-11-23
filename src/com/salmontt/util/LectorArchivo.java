package com.salmontt.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Herramienta utilitaria para la lectura de archivos de texto plano o CSV.
 * Esta clase es reutilizable para cualquier tipo de dato.
 */
public class LectorArchivo {

    /**
     * Lee un archivo y devuelve una lista con cada línea como un String.
     * * @param ruta Ruta del archivo a leer.
     * @return Lista de Strings con el contenido.
     * @throws IOException Si hay problemas al acceder al archivo.
     */
    public List<String> leerLineas(String ruta) throws IOException {
        List<String> lineas = new ArrayList<>();
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            throw new IOException("El archivo no existe en la ruta: " + ruta);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) { // Ignorar líneas vacías
                    lineas.add(linea);
                }
            }
        }
        return lineas;
    }
}