/*
 * Trabalho de POO Questão 23: Faça um programa que receba um número real, encontre e mostre:
 *a) a parte inteira desse número;
 *b) a parte fracionária desse número;
 *c) o arredondamento desse número.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		double numero = sc.nextDouble();
		// Calcul número inteiro, parte fracionária, arredondado
		int numeroInt = (int)numero;
		double parteFracionaria = numero - numeroInt;
		long Arredondado = Math.round(numero);
		
		// Exibe o resultado.
		System.out.println("A parte inteira do número é: " + numeroInt);
		System.out.println("A parte fracionária do número é: " + parteFracionaria);
		System.out.println("O número arredondado é: " + Arredondado);

	}

}
