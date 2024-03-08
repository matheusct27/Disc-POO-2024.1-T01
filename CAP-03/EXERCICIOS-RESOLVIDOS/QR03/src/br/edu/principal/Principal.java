/*
 * Trabalho de POO Questão 3: Faça um programa que receba três notas e seus respectivos pesos, calcule
 * e mostre a média ponderada.
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite o peso da primeira nota: ");
		double peso1 = sc.nextDouble();
		
	    System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite o peso da segunda nota: ");
		double peso2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		System.out.println("Digite o peso da terceira nota: ");
		double peso3 = sc.nextDouble();
		
	
		
		// Calcular a média ponderada dos números
		double médiaP = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 / peso1 + peso2 + peso3;
		
		// Exibe o Resultado.
		System.out.println("A média ponderada é: " + médiaP);
		
	
		

	}

}
