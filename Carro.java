
package correccionparcial;

public class Carro {
    
    private String matricula;
    private String marca;
    private String modelo;

    public Carro() {
    }

    public Carro(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "Matricula: " + matricula + " - Marca: " + marca + " - Modelo: " + modelo;
    }
    
    
}
