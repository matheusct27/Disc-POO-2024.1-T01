/*
 * Trabalho de POO Questão 25: Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo.
 *Esse programa deverá calcular e mostrar a quantidade de convites que devem ser vendidos para que,
 *pelo menos, o custo do espetáculo seja alcançado.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo do espetáculo teatral: ");
		double CustoTeatro = sc.nextDouble();
		
		System.out.println("Digite o custo do convite: ");
		double CustoConvite = sc.nextDouble();
		
		// Calculo da quantidade de convites necessária
		double  Quantidade = CustoTeatro/CustoConvite;
		// Exibe o resultado.
		System.out.println("A quantidade de convites necessária é: " + 	Quantidade);
		
		
		
	}

}
