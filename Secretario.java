package correccionparcial;

public class Secretario extends Empleado {

    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion,int antiguedad, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, DNI, direccion,antiguedad, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
//        incrementarSalario(5);
    }
    

    @Override
    public String toString() {
        return super.toString() 
                +"\n--------Informacion Principal Secretario------------\n"
                + "\nDespacho=" + this.despacho 
                + "\nFax=" + this.fax 
                + "\nPuesto : secretario"
                +"\n\n--------Fin Informcaion Secretario----------------";
    }

//     @Override
//     public void incrementarSalario(double porcentaje) {
//        salario = (salario + (salario *5) / 100);
//
//    }
}
