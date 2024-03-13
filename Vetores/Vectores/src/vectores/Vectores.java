package vectores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caleberibeiro
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int vetor[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Numeros Negativos:");
        for (int i = 0; i < n; i++) {
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
    }
    
}
