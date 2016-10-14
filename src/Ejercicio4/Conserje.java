package Ejercicio4;

/**
 * Created by kenne on 14/10/2016.
 */
public class Conserje extends Empleado {

    public int getHoras(){
        return super.getHoras()  * 2;
    }
    public double getSalario(){
        return super.getSalario() - 10000;
    }
    public int getDiasVacaciones(){
        return super.getDiasVacaciones()/2;
    }
    public void limpia(){
        System.out.println("Limpiando para el jefe");
    }
}
