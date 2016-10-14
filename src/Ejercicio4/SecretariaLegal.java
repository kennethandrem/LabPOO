package Ejercicio4;

/**
 * Created by kenne on 14/10/2016.
 */
public class SecretariaLegal extends Secretaria{
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }

    public void archivaProtocolosLegales() {
        System.out.println("Podria archivar todo el dia!");
    }
}
