/* Pedir diez números enteros por teclado y mostrar la media. */
import java.util.Scanner;
public class Exercici8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosTotales;
        int numero;
        int suma=0;
        System.out.println("Quants numeros vols?");
        numerosTotales=entrada.nextInt();
        int divisor=numerosTotales;
        while (numerosTotales>0){
        System.out.println("Introduce un numero");
        numero=entrada.nextInt();
        suma+=numero;
        numerosTotales--;

        if (numerosTotales==0)
        System.out.println("La mitja és "+(suma/divisor));
    }
 
 entrada.close();
    }
}
