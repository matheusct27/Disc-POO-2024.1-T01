/*
 * Trabalho de POO Questão 4:Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,
 * sabendo-se que este sofreu um aumento de 25%.
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite aqui o salário inicial: ");
		int SalárioInicial = sc.nextInt();
		// Calculo do novo salário
		int NovoSalário = SalárioInicial + SalárioInicial * 25/100;
		//Exibe o Resultado.
		System.out.println("O novo salário será de: " + NovoSalário);
		
		
	}

}
