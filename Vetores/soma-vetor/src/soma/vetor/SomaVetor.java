package soma.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caleberibeiro
 */
public class SomaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        
        double vetor[] = new double[n];
        
        double soma = 0.0;
        double media = 0.0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        media = soma/n;
        
        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\nSoma = " + soma);
        System.out.println("Media = " + media);
    }
    
}
