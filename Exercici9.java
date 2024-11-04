/* Implementar una aplicación que pida al usuario un número comprendido entre 1 
y 10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de 
que el número introducido se encuentra en el rango establecido. */
import java.util.Scanner;
public class Exercici9 {
    public static void main(String[] args) {
        int i=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entre 1 y 10 para tablas de multiplicar, pulse otra tecla para finalizar");
        int numero= entrada.nextInt();
        while ((numero<=10 && numero>=0)&&i<=10) {
        System.out.println(numero+" x "+i+" = "+(numero*i));
        i++;
}
System.out.println("Has acabado");
        entrada.close();
    }
}
