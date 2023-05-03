package correccionparcial;

public class Empresa {

    public static void main(String[] args) {

        //Prueba con empleado
//        Empleado empleado1 = new Empleado("Cristian","Estrada","0001","Norte",2,"111", 200000);
//        Empleado empleado2 = new Empleado("Jesus","Silva","0002","Sur",3,"222",250000);
//        Empleado empleado3 = new Empleado("Rosmery","Lindarte","003","Sur",4,"333",300000);
//        
//        System.out.println(empleado1.toString());
//        empleado1.cambiarSupervisor(empleado2);
//        empleado1.cambiarSupervisor(empleado3);
//        empleado1.incrementarSalario(0);
//        System.out.println(empleado1.toString());
//        empleado3.cambiarSupervisor(empleado1);
//        
//        System.out.println(empleado3.toString());
//        
//      //Fin Prueba con empleado
//        
//      //Prueba con secretario
//        Empleado secretario1 = new Secretario("Ronald","Estrada","0004","Sur",3,"444",250000,"Principal","0000000001");
//        Empleado empleado4 = new Empleado("Cristian","Estrada","0001","Norte",2,"111", 200000);
//        
//        System.out.println(secretario1.toString());
//        secretario1.cambiarSupervisor(empleado4);
//        secretario1.incrementarSalario(5);
//        System.out.println(secretario1.toString());
        ///Fin prueba con secretario
        //Prueba con Vendedor
//        Carro carro1 = new Carro("1", "2", "3");
//        Carro carro2 = new Carro("4", "5", "6");
//
//        Cliente cliente1 = new Cliente("Nombre1", "Identificacion1");
//        Cliente cliente2 = new Cliente("Nombre2", "Identificacion2");
//        Cliente cliente3 = new Cliente("Nombre3", "Identificacion3");
//
//        Vendedor vendedor1 = new Vendedor("Julian", "Alvarez","0005", "Norte", 1, "555", 700000, null, "General", 2);   
//       
//        
//        vendedor1.cambiarCarro(carro1);
//        vendedor1.darDeAltaCliente(cliente1);
//        vendedor1.darDeAltaCliente(cliente2);
//        vendedor1.darDeAltaCliente(cliente3);
//        vendedor1.darDeBajaCliente(cliente1);
//        vendedor1.incrementarSalario(10);
////        
//        System.out.println(vendedor1.toString());
//        Fin prueba con Vendedor
        
        //Prueba con Jefe de zona
        
        Secretario secretario1 = new Secretario("Ronald", "Estrada", "0004", "Sur", 3, "444", 250000, "Principal", "0000000001");
        Vendedor vendedor1 = new Vendedor("Julian", "Alvarez", "0005", "Norte", 1, "555", 700000, null, "General", 2);
        JefeZona jefe1 = new JefeZona("Marco", "Galvi", "0006", "centro", 2, "666", 800000, "principal");
        Carro carro2 = new Carro("4", "5", "6");
        Cliente cliente1 = new Cliente("Nombre1", "Identificacion1");
        jefe1.cambiarCarro(carro2);
        jefe1.incrementarSalario(20);
        jefe1.darDeAltaVendedor(vendedor1);
        vendedor1.darDeAltaCliente(cliente1);
        jefe1.cambiarSecretario(secretario1);
        System.out.println(jefe1.toString());
//        //Fin prueba jefe de zona
    }

}
