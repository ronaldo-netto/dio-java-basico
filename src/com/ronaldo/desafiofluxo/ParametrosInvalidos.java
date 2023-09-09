/*
 * @author Ronaldo Neto
 * @version 1.0
 * 
 * 
 */

//Controle de Fluxo - Desafio
package com.ronaldo.desafiofluxo;

import java.lang.Exception;

public class ParametrosInvalidos extends Exception {


	/**
     * Método para exibir a mensagem do erro.
     * @return String retorna uma mensagem de erro
     */
	public String mensagem() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}
