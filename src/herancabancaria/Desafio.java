/*
 * @author Ronaldo Neto
 * 
 * 
 */
package herancabancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/**
		 * Atributos da classe desafio
		 */
		String titular;
		int numeroConta;
		double saldo;
		double taxaJuros;
		
		/**
		 * Lendo os dados de Entrada:
		 */
		System.out.print("Nome do titular: ");
		titular = scanner.next();
		
		System.out.print("Número da conta: ");
		numeroConta = scanner.nextInt();
		
		System.out.print("Saldo atual da conta: ");
		saldo = scanner.nextDouble();
		
		System.out.println("Taxa de juros: ");
		taxaJuros = scanner.nextDouble();

		/**
		 * Criando instância da classe conta poupança
		 */
		ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);
        
		/**
		 * Exibindo as informações
		 */
		System.out.println("\nImprimindo informações da conta...\n");
		System.out.println("Conta Poupanca:");
		contaPoupanca.exibirInformacoes();

		scanner.close();
	}
}

class ContaBancaria {
	/**
	 * Atributos da classe conta bancaria.
	 */
	protected int numero;
	protected String titular;
	protected double saldo;

	/**
	 * Construtor padrão
	 */
	public ContaBancaria() {

	}

	/**
	 * 
	 * @param numero  O úmero da conta bancária.
	 * @param titular O nome do titular da conta.
	 * @param saldo   O saldo inicial da conta.
	 */
	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	/**
	 * Método para exibir as informações do usuário.
	 */
	public void exibirInformacoes() {

		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		System.out.println("Nome do titular: " + titular);
		System.out.println("Número da conta: " + numero);
		System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
	}
}

class ContaPoupanca extends ContaBancaria {
	/**
	 * Atributo da classe conta poupanca
	 */
	private double taxaJuros;

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	/**
	 * Construtor padrão
	 */
	public ContaPoupanca() {
	}

	/**
	 * 
	 * @param numero    O úmero da conta bancária.
	 * @param titular   O nome do titular da conta.
	 * @param saldo     O saldo inicial da conta.
	 * @param taxaJuros A taxa de juros associada á conta.
	 */
	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
		super.numero = numero;
		super.titular = titular;
		super.saldo = saldo;
		this.taxaJuros = taxaJuros;
	}

	/**
	 * Método para exibir as informações do usuário.
	 */
	public void exibirInformacoes() {
		DecimalFormat decimalFormat = new DecimalFormat("#.0");

		super.exibirInformacoes();

		System.out.println("Taxa de juros: " + decimalFormat.format(this.taxaJuros) + "%");
	}
}