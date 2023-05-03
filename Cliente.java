
package correccionparcial;


public class Cliente {
     private String nombre;
    private String  identificacion;

    public Cliente() {
    }

    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nIdentificacion: " + identificacion;
    }
    
    
}
