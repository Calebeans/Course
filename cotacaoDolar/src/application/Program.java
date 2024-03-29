package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("What is the dollar price? ");
			CurrencyConverter.valorDolar = sc.nextDouble();
			System.out.print("How many dollars will be bought? ");
			CurrencyConverter.compraDolar = sc.nextDouble();
		}
		
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.calcularCotacao());
		
		

	}

}
