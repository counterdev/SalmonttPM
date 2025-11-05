package model;

/**
 * Clase base general que representa a una persona vinculada a la empresa.
 * Implementa la composición al tener un atributo de tipo Direccion.
 */
public class Persona {

    /**
     * Atributos privados. [cite: 57]
     */
    private String rut;
    private String nombre;
    private Direccion direccion; // Composición

    /**
     * Constructor definido para inicializar el objeto Persona. [cite: 60]
     *
     * @param rut       El RUT de la persona.
     * @param nombre    El nombre completo de la persona.
     * @param direccion El objeto Direccion asociado a la persona.
     */
    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Métodos públicos get y set. [cite: 58]
     */
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Método toString() sobrescrito. [cite: 59]
     *
     * @return Una cadena de texto con los datos de la persona.
     */
    @Override
    public String toString() {
        // Llama automáticamente al toString() de Direccion
        return "RUT: " + rut + " | Nombre: " + nombre + " | Dirección: " + direccion;
    }
}