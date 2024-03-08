/*
 * Trabalho de POO Questão proposta 3: Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em
 *Fahrenheit. Sabe-se que F = 180*(C + 32)/100.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		double Celsius = sc.nextDouble();
		// Calculo da temperatura de Celsius para Fahrenheit
		double Fahrenheit = 180*(Celsius + 32)/ 100;
		// Exibe o resultado.
		System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
		

		
		
		

	}

}
