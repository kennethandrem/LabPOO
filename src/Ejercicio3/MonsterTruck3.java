package Ejercicio3;

/**
 * Created by kenne on 14/10/2016.
 */
public class MonsterTruck3 extends Camion3{


    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {
        super.m1();
    }

    @Override
    public String toString() {
        return "monster vroom...vroom";

    }
}
