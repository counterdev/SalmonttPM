package com.salmontt.model;

/**
 * Clase que representa un Centro de Cultivo.
 * Cumple con el principio de encapsulamiento (atributos privados).
 */
public class CentroCultivo {

    private String nombre;
    private String comuna;
    private int toneladas;

    // Constructor vacío
    public CentroCultivo() {
    }

    // Constructor con parámetros
    public CentroCultivo(String nombre, String comuna, int toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        if (toneladas < 0) {
            throw new IllegalArgumentException("Las toneladas no pueden ser negativas.");
        }
        this.toneladas = toneladas;
    }

    // Método toString sobrescrito para mostrar información clara
    @Override
    public String toString() {
        return "Centro: " + String.format("%-20s", nombre) +
                " | Comuna: " + String.format("%-15s", comuna) +
                " | Producción: " + toneladas + " Toneladas";
    }
}