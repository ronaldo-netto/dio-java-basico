package abrindocontas;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		/**
		 * Lendo os dados de Entrada:
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Número da conta: ");
		int numeroConta = scanner.nextInt();

		scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta

		System.out.print("Nome do titular: ");
		String nomeTitular = scanner.nextLine();

		System.out.print("Saldo da conta: ");
		double saldo = scanner.nextDouble();

		/**
		 * Criando uma instância de "ContaBancaria" com os valores de Entrada.
		 */

		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

		/**
		 * Imprimindo as informações da conta usando o objeto criado no acima.
		 */

		System.out.println("\nInformacoes:");
		System.out.println("Conta: " + contaBancaria.numero);
		System.out.println("Titular: " + contaBancaria.titular);
		System.out.println("Saldo: R$ " + contaBancaria.saldo);

		scanner.close();
	}
}

class ContaBancaria {
	int numero;
	String titular;
	double saldo;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ContaBancaria() {

	};

	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
}
