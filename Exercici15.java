/* Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos 
de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4: 
* * * * 
* * * 
* * 
* */

import java.util.Scanner;

public class Exercici15 {
    public static void main(String[] args) {
        System.out.println("Dime un numero");
        Scanner entrada= new Scanner(System.in);
        int numeron=entrada.nextInt();
        for (int index = 0; index < numeron; index++) {
            System.out.println();
            for (int i = 0; i <= index; i++) {
                System.out.print("*");
            }
        }
        entrada.close();
    }
    
}
