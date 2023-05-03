package correccionparcial;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int antiguedad;
    private String telefono;
    double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion,int antiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antiguedad=antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    @Override
    public String toString() {

        String supervisorNombre;
        if (supervisor != null) {
            supervisorNombre = "Nombre:"+supervisor.nombre+ " "+"DNI:"+supervisor.DNI;
        } else {
            supervisorNombre = "Ninguno";
        }
        return   "\n-------- Inicio Informacion Personal Empleado--------\n"+
                "\nNombre: " + this.nombre 
                + "\nApellidos: " + this.apellidos 
                + "\nDNI: " + this.DNI 
                + "\nDireccion: " + this.direccion 
                +"\nAntiguedad year:"+this.antiguedad
                + "\nTelefono: " + this.telefono 
                + "\nSalario: " + this.salario 
                + "\nSupervisor: [" + supervisorNombre+"]"
                +"\n\n--------  Fin Informacion Personal Empleado----------";
    }

    public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
    }

    public void incrementarSalario(double porcentaje) {
        salario = (salario + (salario * porcentaje) / 100);

    }
}
