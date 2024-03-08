/*
 * Trabalho de POO Questão proposta 4:Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se
que este sofreu um desconto de 10%.
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		double Produto = sc.nextDouble();
		// Calculo do desconto
		double Desconto = Produto * 10/100;
		double ProdutoD = Produto - Desconto;
		// Exibe o resultado.
		System.out.println("O preço do produto com o desconto de 10% é: " + ProdutoD);
		

		


	}

}
