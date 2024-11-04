/* Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso. */

import java.util.Scanner;

public class Exercici12 {
    public static void main(String[] args) {
        System.out.println("Dime 5 calificaciones de alumnos");
        Scanner entrada= new Scanner(System.in);
        int nota [] = new int[5];
        int suspenso=0;
        for (int i = 0; i < 5; i++) {
        System.out.println("introduce la nota.");
        nota[i]=(int)(entrada.nextInt());
        if (nota[i]<5)
            suspenso++;
        }
        System.out.println("Hay "+suspenso+" suspensos");
        entrada.close();
    }
}
