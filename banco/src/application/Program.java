package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.println("Cadastrando uma conta!");
		System.out.println("Informe o número da conta: ");
		int numConta = sc.nextInt();
		System.out.println("Informe o nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();

		System.out.println("Você quer fazer um depósito inicial? (s/n) ");
		char depositoOpcao = sc.next().charAt(0);
		if (depositoOpcao == 's') {
			System.out.println("Informe o saldo: ");
			double saldoInicial = sc.nextDouble();
			conta = new Conta(numConta, nomeTitular, saldoInicial);
		} else {
			conta = new Conta(numConta, nomeTitular);
		}
		System.out.println("Conta cadastrada!");

		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
