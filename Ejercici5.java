/* Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El 
jugador tendrá que introducir la solución de la suma de dos números aleatorios 
comprendidos entre 1 y 100. Mientras la solución introducida sea correcta, el 
juego continuará. En caso contra rio, el programa terminará y mostrará el 
número de operaciones realizadas correctamente. */
import java.util.Scanner;     
public class Ejercici5 {
            public static void main(String[] args) {
                
                int numSecreto;
                int respuesta;
                int intentos = 0;
                
                Scanner scanner = new Scanner(System.in);
                System.out.print("Anem a jugar a un joc... ");
        
                do {
                    int num1 = (int)(Math.random() * 100) + 1;
                    int num2 = (int)(Math.random() * 100) + 1;
                    numSecreto = (num1+num2);
                    System.out.println("dime quant es la suma entre "+num1+ " i " +num2);
                    respuesta = scanner.nextInt();
        
                    if (respuesta==numSecreto) {
                        intentos++;
                        System.out.print("¡Ole tú! Juguem altra vegada. ");                
                    } else {
                        if (intentos == 0) {
                            System.out.println("¡Fallaste! Fin de la partida. No acertaste ni una sola respuesta.");
                        } else if (intentos == 1){
                            System.out.println("¡Fallaste! Fin de la partida. Acertaste 1 vegada.");
                        } else {
                            System.out.println("¡Fallaste! Fin de la partida. Acertaste un total de "+intentos+" vegades.");
                        }   
                    }
                }while (respuesta == numSecreto);
                scanner.close();
            }
}
