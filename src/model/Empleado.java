package model;

/**
 * Clase que representa a un Empleado de Salmontt.
 * Hereda los atributos y métodos de la clase Persona.
 */
public class Empleado extends Persona {

    /**
     * Atributos propios de Empleado.
     */
    private String cargo;
    private double salario;

    /**
     * Constructor definido para inicializar el objeto Empleado.
     * Utiliza super() para pasar los datos al constructor de la clase padre (Persona).
     *
     * @param rut       El RUT del empleado (heredado).
     * @param nombre    El nombre del empleado (heredado).
     * @param direccion El objeto Direccion del empleado (heredado).
     * @param cargo     El cargo que ocupa el empleado.
     * @param salario   El salario del empleado.
     */
    public Empleado(String rut, String nombre, Direccion direccion, String cargo, double salario) {
        // 1. Llama al constructor de la clase padre (Persona)
        super(rut, nombre, direccion);

        // 2. Inicializa los atributos propios de Empleado
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Métodos públicos get y set para los atributos propios.
     */
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Método toString() sobrescrito.
     * Reutiliza el toString() de la clase padre (Persona) y añade la nueva información.
     *
     * @return Una cadena de texto con los datos completos del empleado.
     */
    @Override
    public String toString() {
        // Llama al toString() de Persona y le concatena los datos de Empleado
        return super.toString() + " | Cargo: " + cargo + " | Salario: $" + String.format("%.0f", salario);
    }
}