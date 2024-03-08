/*
 * Trabalho de POO Questão 1: Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses.
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */


package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Digite o primeiro número: ");
	   int n1 = sc.nextInt();
	   
	   System.out.println("Digite o segundo número: ");
	   int n2 = sc.nextInt();

	   System.out.println("Digite o terceiro número: ");
	   int n3 = sc.nextInt();
	   
	   // Calcula a soma
	   int soma = n1 + n2 + n3;
	   
	   // Exibe o Resultado.
	   System.out.println("A soma desses números é: " + soma);
	   
	  


	}

}
