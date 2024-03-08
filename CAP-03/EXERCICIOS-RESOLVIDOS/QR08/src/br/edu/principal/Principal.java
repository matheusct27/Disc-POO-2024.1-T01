/*
 * Trabalho de POO Questão 8: Faça um programa que receba o valor de um depósito e
 *  mostre o valor do rendimento e o valor total depois do rendimento.
 *  Date: 02/03/24
 *  LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do depósito: ");
		double Depósito = sc.nextDouble();
		System.out.println("Digite o valor da taxa de juros: ");
		double Taxa = sc.nextDouble();
		// Calculo do Rendimento, Valor total
		double Rendimento = Depósito * Taxa/100;
		double ValorTotal = Depósito + Rendimento;
		// Exibe o Resultado.
		System.out.println("O valor do rendimento é de: " + Rendimento);
		System.out.println("o valor total é de: " + ValorTotal);
		
		
	}

}
 