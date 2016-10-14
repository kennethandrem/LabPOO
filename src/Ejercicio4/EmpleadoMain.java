package Ejercicio4;

/**
 * Created by kenne on 14/10/2016.
 */
public class EmpleadoMain {

    public static void main(String[] args) {
        Conserje conserje = new Conserje();
        System.out.println("Como conserje gano: Q" + conserje.getSalario() +
                ", tengo " + conserje.getDiasVacaciones() +
                " dias de vacaciones y trabajo " + conserje.getHoras() + " horas a la semana.");

        conserje.limpia();
    }
}
