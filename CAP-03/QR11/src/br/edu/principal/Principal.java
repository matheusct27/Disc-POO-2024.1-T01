/*
 * Trabalho de POO Questão 11:Faça um programa que receba um número positivo e maior que zero,
 * calcule e mostre: numero digitado ao quadrado, cubo, raiz quadrada do numero, raiz cubica do numero.
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite um número positivo e maior que zero: ");
	double numero = sc.nextDouble();
	// IF para assumir que o valor é maior que 0
	if(numero > 0) {
		// Calculo do quadrado, cubo, raizQ, raizC
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow (numero, 3);
		double raizQuadrada = Math.sqrt(numero);
		double raizCubica = Math.cbrt(numero);
		// Exibe o Resultado
		System.out.println("O número ao quadrado é: " + quadrado);
		System.out.println("O número ao cubo é: " + cubo);
		System.out.println("A raiz quadrada do número é: " + raizQuadrada);
		System.out.println("A raiz cúbica do número é: " + raizCubica);
		
	} else {
		// Exibe o erro
			System.out.println("O número digitado é invalido");
		}

	 
	
	}
	
	}


