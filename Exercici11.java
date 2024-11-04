/* Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 
5! y es igual a 5 x 4×3×2×1 = 120. */

import java.util.Scanner;

public class Exercici11 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner entrada=new Scanner(System.in);
        int numeroIntroducido= entrada.nextInt();
        int resultado=1;
        System.out.print(numeroIntroducido);
        while (numeroIntroducido!=1){
        numeroIntroducido--;
        System.out.print(" x "+numeroIntroducido);
        resultado=resultado*numeroIntroducido;
    }
System.out.print(" = "+resultado);
        entrada.close();
    }
    
}
