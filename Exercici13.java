/* Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota 
igual a cuatro) y suspensos.  */
import java.util.Scanner;

public class Exercici13 {
    public static void main(String[] args) {
        System.out.println("Dime 6 calificaciones de alumnos");
        Scanner entrada= new Scanner(System.in);
        int nota [] = new int[6];
        int suspenso=0;
        for (int i = 0; i < 6; i++) {
        System.out.println("introduce la nota.");
        nota[i]=(int)(entrada.nextInt());
        if (nota[i]<5)
            suspenso++;
        }
        System.out.println("Hay "+suspenso+" suspensos");
        entrada.close();
    }
}
