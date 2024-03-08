/*
 * Trabalho de POO Questão proposta 8: Faça um programa que calcule e mostre a área de um trapézio.
 *Sabe-se que: A = ((base maior + base menor) * altura)/2
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior: ");
		double baseM = sc.nextDouble();
		System.out.println("Digite o valor da base menor: ");
		double basem = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double Altura = sc.nextDouble();
		// calculo da área
		double Area = ((baseM + basem) * Altura) / 2;
		// Exibe o resultado.
		System.out.println("A área do trapézio é: " + Area);
		

		

	}

}
