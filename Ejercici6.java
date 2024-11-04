/* Escribir una aplicación para aprender a contar, que pedirá un número n y 
mostrará todos los números del 1 a n. */
import java.util.Scanner;
public class Ejercici6 {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
    System.out.print("Dime cuantos numeros le quieres meter");
    int n=entrada.nextInt();
    int numero=0;
    if (n!=0){
        do{
            System.out.print(numero+ " , ");
            numero+=1;
            
        }while(numero!=n);
    }
        entrada.close();
    }
}
