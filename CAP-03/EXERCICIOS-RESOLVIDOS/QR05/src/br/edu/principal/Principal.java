/*
 * Trabalho de POO Questão 5:Faça um programa que receba o salário de um funcionário e
 * o percentual de aumento, calcule e mostre o valor do aumento e o novo salário:
 * Date: 01/03/24
 * LastUpdate: 01/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário inicial: ");
		double SalárioInicial = sc.nextDouble();
		
		System.out.println("Digite o percentual de aumento: ");
	    double PercentualAumento = sc.nextDouble();
		
	    // Calcula o valor do aumento
		double Aumento = SalárioInicial * (SalárioInicial/ 100.0);
		// Calcula o valor do novo salário
		double NovoSalário = SalárioInicial + Aumento;
		//Exibe o Resultado
		System.out.println("O aumento é de: " + Aumento);
		System.out.println("O novo salário é de: " + NovoSalário);

		
		
	}

}
