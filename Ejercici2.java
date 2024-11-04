/* Implementar una aplicación para calcular datos estadísticos de las edades de los 
alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos 
sea negativo, y se mostrará: la suma de todas las edades introducidas, la media, 
el número de alumnos y cuántos son mayores de edad.  */

import java.util.Scanner;

public class Ejercici2 {
    public static void main(String[] args) {
    
        int[] edad = {};
        int suma=0;
        Scanner entrada = new Scanner(System.in);
        int media=0;
        int mayoredad=0;

        for(int i=0; i<edad.length; i++){
            while (edad[i]>=0) {
            System.out.println("introduce la edad");
            edad[i]=(int)(entrada.nextInt());
            suma += edad[i];
            media=(suma+edad[i])/2;
            
            if(edad[i]<0){
                System.out.println("La suma total es  "+suma);
                System.out.println("La media es "+media);
                System.out.println("Y los mayores de edad son "+mayoredad);
            }else if (edad[i]>18)
            mayoredad++;
        }
        }
        entrada.close();
    }
}
