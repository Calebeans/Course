package pensionato;

import java.util.Scanner;

/**
 *
 * @author caleberibeiro
 */
public class Pensionato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        String name;
        String email;
        int numeroQuarto = 0;
        
        Aluno vetorPensionato[] = new Aluno[10];
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            numeroQuarto = sc.nextInt();
            
            vetorPensionato[numeroQuarto] = new Aluno(name, email);
        }
        
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if(vetorPensionato[i] != null){
                System.out.println(i + ": " + vetorPensionato[i]);
            }
        }
    }
    
}
