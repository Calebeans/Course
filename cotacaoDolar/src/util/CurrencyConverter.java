package util;

public class CurrencyConverter {

	public static double valorDolar;
	public static double compraDolar;
	
	public static double calcularCotacao() {
		return ((compraDolar * 0.06) + compraDolar) * valorDolar; 
	}
}
