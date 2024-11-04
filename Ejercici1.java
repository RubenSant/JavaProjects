/* Diseñar un programa que muestre, para cada número introducido por teclado, si 
es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número 
introducido sea 0. */

import java.util.Scanner;

public class Ejercici1{
    public static void main(String[] args) {
        System.out.println("introduce un numero entero");
        Scanner entrada = new Scanner(System.in);
        int numeroIntroducido = entrada.nextInt();
        while (numeroIntroducido!=0) {
            if (numeroIntroducido%2==0)
            System.out.println("Es par");
            else
            System.out.println("Es impar");
            if (numeroIntroducido>0) 
            System.out.println("Es positivo");
            else
            System.out.println("Es negativo");
            int cuadrado = numeroIntroducido*numeroIntroducido;
            System.out.println("El cuadrado es "+cuadrado);
            System.out.println("Introduce un numero entero o 0 para salir");
            numeroIntroducido= entrada.nextInt();
            System.out.println("\033[H\033[2J");
            System.out.println("Has introducido "+numeroIntroducido);
            
        }
        entrada.close();
    }
}
        
        
    
