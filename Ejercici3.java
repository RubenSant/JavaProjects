/* Codificar el juego «el número secreto», que consiste en acertar un número entre 
1 y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie 
de números, para los que se indica: «mayor» o «menor», según sea mayor o 
menor con respecto al número secreto. El proceso termina cuando el usuario 
acierta o cuando se rinde (introduciendo un -1).  */
import java.util.Scanner;     
public class Ejercici3 {
            public static void main(String[] args) {
                
                int numSecret;
                int resposta;
                int intentos = 3;
                
                Scanner scanner = new Scanner(System.in);
                System.out.print("Anem a jugar a un joc... ");
        
                do {
                    numSecret = (int)(Math.random() * 100) + 1;
                    System.out.println("Dis-me un numero");
                    resposta = scanner.nextInt();
                    intentos--;
        
                    if (resposta==numSecret) {
                        System.out.print("¡Ole tú! Et quedaven "+intentos +" intentos");                
                    } else 
                        if (resposta != numSecret) {
                         System.out.println("Provem altra vegada");
                        }
                        if(intentos==0) {
                            System.out.println("Ja no et queden intentos, has perdut");
                    }
                        
                }while (intentos>0);

                
        scanner.close();
            }
        }
        

            

