/*
 * Trabalho de POO Questão 2:  Faça um programa que receba três notas, calcule e mostre a média 
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		// Números para médias
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int n3 = sc.nextInt();
		
		// Calcular média dos números
		int média = n1 + n2 + n3 / 3;
	    // Exibe o resultado.
		System.out.println("A média dos números é: " + média);
		
	

	}

}
