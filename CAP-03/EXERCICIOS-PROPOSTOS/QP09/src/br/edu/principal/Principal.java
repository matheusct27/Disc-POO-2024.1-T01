/*
 * Trabalho de POO Questão proposta 9: Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule
 *e mostre a quantidade de salários mínimos que esse funcionário ganha.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário mínimo: ");
		double SalarioMinimo = sc.nextDouble();
		System.out.println("Digite o valor do funcionário: ");
		double SalarioFuncionario = sc.nextDouble();
		// Calculo da quantidade de salários mínimos
		double SalarioQnt = SalarioFuncionario / SalarioMinimo;
		// Exibe o resultado
		System.out.println("O funcionário ganha " + SalarioQnt + "salários mínimos");


	}

}
