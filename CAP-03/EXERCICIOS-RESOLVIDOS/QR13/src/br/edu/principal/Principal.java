/*
 * Trabalho de POO Questão 14: Faça um programa que receba uma medida em pés,
 * faça as conversões a seguir e mostre os resultados: a) polegadas; b) jardas; c) milhas;
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida em pés: ");
		double pés = sc.nextDouble();
		// Calculo de polegadas, jardas e milhas
		double polegadas = pés * 12;
		double jardas = pés/3;
		double milhas = pés/1760;
		// Exibe o resuiltado.
		System.out.println("A medida em polegadas é: " + polegadas);
		System.out.println("A medida em jardas é: " + jardas);
		System.out.println("A medida em milhas é: " + milhas);
		
		
		
		
		

	}

}
