package correccionparcial;

import java.util.ArrayList;

public class Vendedor extends Empleado {

    private Carro carro;
    private String areaVenta;
    private ArrayList<Cliente> listaClientes;
    private double comisionVentas;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int antiguedad, String telefono, double salario, Carro carro, String areaVenta, double comisionVentas) {

        super(nombre, apellidos, DNI, direccion, antiguedad, telefono, salario);
        this.carro = carro;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<>();
        this.comisionVentas = comisionVentas;
//        incrementarSalario(10);
    }

    public void darDeAltaCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void darDeBajaCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public void cambiarCarro(Carro nuevoCarro) {
        this.carro = nuevoCarro;
    }

    @Override
    public String toString() {

        return super.toString()
                + "\n--------Informacion Principal Vendedor---------------\n"
                + "\nCarro: [" + carro + "]"
                + "\nArea Venta: " + areaVenta
                + "\nLista Clientes: " + listaClientes
                + "\nComision Ventas: " + comisionVentas
                + "\nPuesto: Vendedor"
                + "\n--------Fin Informacion Principal Vendedor-----------\n";
    }

  
//    @Override
//    public void incrementarSalario(double porcentaje) {
//        salario = (salario + (salario * 10) / 100);
//
//    }
}
