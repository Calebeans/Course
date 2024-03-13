package alturas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caleberibeiro
 */
public class Alturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n;
        n = sc.nextInt();
        
        String vetorNome[] = new String[n];
        int vetorIdade[] = new int[n];
        double vetorAltura[] = new double[n];
        double somaAltura = 0.0;
        double contMenores = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            vetorNome[i] = sc.next();
            System.out.print("Idade: ");
            vetorIdade[i] = sc.nextInt();
            System.out.print("Altura: ");
            vetorAltura[i] = sc.nextDouble();
            somaAltura += vetorAltura[i];
            if(vetorIdade[i] < 16){
                contMenores++;
            }
        }
        
        double mediaAltura = 0.0;
        double porcentagemIdade = 0.0;
        
        mediaAltura = somaAltura/n;
        porcentagemIdade = (100*contMenores)/n;
        
        System.out.printf("Altura média: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemIdade);
        for (int i = 0; i < n; i++) {
            if(vetorIdade[i] < 16){
                System.out.println(vetorNome[i]);
            }
        }
    }
    
}
