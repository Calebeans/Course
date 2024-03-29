package entities;

public class Conta {

	private int numeroDaConta;
	private String nomeDoTitular;
	private double balance;
	
	public Conta(int numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public Conta(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		deposit(depositoInicial);
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	
	public String toString() {
		return "Account "
				+ numeroDaConta
				+ ", Holder: "
				+ nomeDoTitular
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
	
	
}
