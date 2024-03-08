/*
 * Trabalho de POO Questão proposta 5: Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número
 *de diagonais desse polígono. Sabe-se que ND = N * (N - 3)/2, em que N é o número de lados do
 *polígono.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de lados do polígono(convexo): ");
		double lados = sc.nextDouble();
		// Calculo das diagonais
		double Diagonais = lados * (lados-3)/2;
		// Exibe o resultado.
		System.out.println("O número de diagonais desse polígono é: " + Diagonais);

		
		
	}

}
