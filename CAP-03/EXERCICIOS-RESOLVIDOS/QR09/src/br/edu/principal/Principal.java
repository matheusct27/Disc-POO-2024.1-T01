/*
 * Trabalho de POO Questão 9: 
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite aqui o Valor da base do seu triângulo: ");
		int Base = sc.nextInt();
		
		System.out.println("Digite aqui o valor da altura do seu triângulo: ");
		int Altura = sc.nextInt();
		// calculo da area
		int Area = (Base * Altura)/2;
		// Exibe o resultado
		System.out.println("A área do triângulo é: " + Area);
		
		
	}

}
