/* Escribir todos los múltiplos de 7 menores que 100. */
public class Ejercici7 {
    public static void main(String[] args) {
        int numeroActual=0;
        System.out.println("los multiplos de 7 hasta 100 son"); 
        do{
        System.out.print(numeroActual+" , ");
            numeroActual+=7;
        }while(numeroActual<100);
        
    }
}
