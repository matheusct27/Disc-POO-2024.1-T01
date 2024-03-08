/*
 * Trabalho de POO Questão proposta 6:Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre esse peso em gramas.
 * Date: 06/03/24
 * LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu peso em quilos: ");
		double kgP = sc.nextDouble();
		// Calculo de quilos para gramas
		double gramas = kgP*1000;

		System.out.println("O seu peso em gramas é: " + gramas);
		

		
	}

}
