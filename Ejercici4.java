/* Un centro de investigación de la flora urbana necesita una aplicación que mues
tre cuál es el árbol más alto. Para ello se introducirá por teclado la altura (en 
centímetros) de cada árbol (terminando la introducción de datos cuando se uti
lice -1 como altura). Los árboles se identifican mediante etiquetas con números 
únicos correlativos, comenzando en O. Diseñar una aplicación que resuelva el 
problema planteado.  */
import java.util.Scanner;
public class Ejercici4 {
    public static void main(String[] args) {
        double numeromayor;
        double[] altura = {0};
        Scanner entrada = new Scanner(System.in);

        numeromayor = altura[0];

        for(int i=0; i<altura.length; i++){
            while (altura[i]>=0) {
                
            
            System.out.println("introduce un numero en cm");
            altura[i]=(int)(entrada.nextInt());
            if(altura[i]==-1){ // 
                numeromayor = altura[i];
                System.out.println("El numero mayor de los introducidos es "+numeromayor);
            }
        }
        }
        entrada.close();
           
         
        }
             
    }
