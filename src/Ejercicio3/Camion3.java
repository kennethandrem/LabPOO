package Ejercicio3;

/**
 * Created by kenne on 14/10/2016.
 */
public class Camion3 extends Carro3 {
    public void m1() {
        System.out.println("camion 1");
        super.m1();
    }

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + "â€¦" + super.toString();
    }
}
