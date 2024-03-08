/*
 * Trabalho de POO Questão proposta 2:Faça um programa que receba três números, calcule e mostre a multiplicação desses números.
 * Date: 06/03/24
 * LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double n3 = sc.nextDouble();
        //Calculo de multiplicação dos três números
		double multiplicação = n1*n2*n3;
		
		System.out.println("O resultado da multiplicação é: " + multiplicação);
		

	}

}
