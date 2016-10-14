package Ejercicio2;

/**
 * Created by kenne on 14/10/2016.
 */
public class Camion2 extends Carro2{

    public void m1() {
        System.out.println("camion 1");
    }

    // Print del metodo m1 de la super clase Carro
    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + "…" +
                super.toString();
    }

}
