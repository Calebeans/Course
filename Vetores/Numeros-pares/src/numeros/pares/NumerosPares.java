package numeros.pares;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caleberibeiro
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int numeros[] = new int[n];
        int contPares = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                contPares++;
            }
        }
        
        System.out.println("Numeros pares: ");
        for (int i = 0; i < n; i++) {
            if(numeros[i] % 2 ==0){
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println("\nQuantidade de pares = " + contPares);
    }
    
}
