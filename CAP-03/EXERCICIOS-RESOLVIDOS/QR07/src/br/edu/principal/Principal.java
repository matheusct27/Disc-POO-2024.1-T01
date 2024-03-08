/*
 * Trabalho de POO Questão 7: Faça um programa que receba o salário base de um funcionário, calcule e
 * mostre seu salário a receber, sabendo-se que o funcionário tem gratificação de R$50 e paga imposto
 * de 10% sobre o salário base.
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário base: ");
		int SalárioBase = sc.nextInt();
		// Calculo do Imposto
		int imp = SalárioBase * 10/100;
		// Calcula o salário a ser recebido
		int SalárioReceber = SalárioBase + 50 - imp;
		// Exibe o Resultado
		System.out.println("O salário a ser recebido é: " + SalárioReceber);
		
		
	}

}
