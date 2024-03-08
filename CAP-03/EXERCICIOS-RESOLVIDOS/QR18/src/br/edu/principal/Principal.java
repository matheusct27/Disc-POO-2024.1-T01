/*
 * Trabalho de POO Questão 18: Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os quais fornece a
 *quantidade de ração em gramas. A quantidade diária de ração fornecida para cada gato é sempre a
 *mesma. Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para
 *cada gato, calcule e mostre quanto restará de ração no saco após cinco dias.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso do saco de ração(em KG): ");
		double PesoSaco = sc.nextDouble();
		
		System.out.println("Digite a quantia de ração para o primeiro gato(em gramas): ");
		double Gato1 = sc.nextDouble();
		
		System.out.println("Digite a quantia de ração para o segundo gato(em gramas): ");
		double Gato2 = sc.nextDouble();
		// Calculo ração de cada gato
		double RaçãoG1 = Gato1/1000;
		double RaçãoG2 = Gato2/1000;
		// Calculo resto da ração após 5 dias ( mesma quantidade aos dias)
		double RestoFinal = PesoSaco - 5 * (RaçãoG1 + RaçãoG2);
		// Exibe o resultado.
		System.out.println("O total que restará no saco de ração é de: " + RestoFinal);
		
		
		
		
		
	}

}
