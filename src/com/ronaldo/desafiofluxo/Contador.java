/*
 * @author Ronaldo Neto
 * @version 1.0
 * 
 */

//Controle de Fluxo - Desafio
package com.ronaldo.desafiofluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidos {

		Scanner scanner = new Scanner(System.in);
        
		int parametroUm;
		int parametroDois;

		System.out.print("Digite o primeiro parâmetro: ");
		parametroUm = scanner.nextInt();

		System.out.print("Digite o segundo parâmetro: ");
		parametroDois = scanner.nextInt();
        
	
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidos e) {
			System.out.println("Mensagem: " + e.mensagem());
		}
        
		scanner.close();

	}
   /**
    * 
    * @param parametroUm este é primeiro parâmetro do método
    * @param parametroDois este é o segundo parâmetro do método
    * @throws ParametrosInvalidosException se o parametroUm for maior que o parametroDois.
    */
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidos {

		int contagem = parametroDois - parametroUm;
        
		/**
		 * Lógica de processamento aqui
		 */
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidos();
		} else {
			for (int i = 0; i < contagem; i++) {
				System.out.println("Imprimindo o número: " + (i + 1));
			}
		}

	}

}