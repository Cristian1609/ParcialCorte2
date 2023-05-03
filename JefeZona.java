package correccionparcial;

import java.util.ArrayList;
import java.util.List;

public class JefeZona extends Empleado {

    private String despacho;
    private Secretario secretario;
    private List<Vendedor> listaVendedores;
    private Carro carroEmpresa;

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono,
            double salario, String despacho) {
        super(nombre, apellidos, DNI, direccion,antiguedad, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.listaVendedores = new ArrayList<Vendedor>();
        this.carroEmpresa = carroEmpresa;
//        incrementarSalario(20);
    }


    @Override
    public String toString() {
        return super.toString()
                +"\n--------Informacion Principal Jefe Zona-------------------\n"
                +"\nDespacho:" + despacho 
                + "\nSecretario:" + secretario 
                + "\nListaVendedores:\n" + listaVendedores
                + "\nCarroEmpresa:" + carroEmpresa
                +"\nPuesto:Jefe zona"
                +"\n-------- Fin Informacion Principal Jefe Zona------------\n";
    }
    
    

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void cambiarCarro(Carro nuevoCarro) {
        this.carroEmpresa = nuevoCarro;
    }

    public void darDeAltaVendedor(Vendedor vendedor) {
        listaVendedores.add(vendedor);
    }

    public void darDeBajaVendedor(Vendedor vendedor) {
        listaVendedores.remove(vendedor);
    }
//    @Override
//     public void incrementarSalario(double porcentaje) {
//        salario = (salario + (salario * 20) / 100);
//
//    }
}
