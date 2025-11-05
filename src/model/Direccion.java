package model;

/**
 * Representa una dirección física.
 * Se utiliza como un componente (composición) dentro de otras clases como Persona.
 */
public class Direccion {

    /**
     * Atributos privados, aplicando encapsulamiento. [cite: 57]
     */
    private String calle;
    private String ciudad;
    private String region;

    /**
     * Constructor definido para inicializar el objeto. [cite: 60]
     *
     * @param calle  Nombre de la calle y número.
     * @param ciudad Ciudad de la dirección.
     * @param region Región de la dirección.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Métodos públicos get y set. [cite: 58]
     */
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Método toString() sobrescrito para mostrar la dirección de forma legible. [cite: 59]
     *
     * @return Una cadena de texto con la dirección formateada.
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}