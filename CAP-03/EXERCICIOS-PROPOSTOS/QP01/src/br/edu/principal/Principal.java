/*
 * Trabalho de POO Questão Proposta 1: Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre o valor da hipotenusa.
 * Date: 06/03/24
 * LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro cateto: ");
		double cateto1 = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo cateto: ");
		double cateto2 = sc.nextDouble();
		// Calculo da hipotenusa.
		double Hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2*cateto2);
		// Exibe o resultado.
		System.out.println("o valor da hipotenusa é: " + Hipotenusa);
		

	}

}
