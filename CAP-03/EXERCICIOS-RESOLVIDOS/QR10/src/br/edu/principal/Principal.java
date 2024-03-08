/*
 * Trabalho de POO Questão 10:  Faça um programa que calcule e mostre a área de um círculo.
 * Sabe-se que: Área = p * R²
 * Date: 02/03/24
 * LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite aqui o raio do seu círculo: ");
	double Raio = sc.nextDouble();
	// Valor de Pi
	double pi = Math.PI;
	
	// Calculo da Área
	double Area = pi * Math.pow(Raio, 2);
	// Exibe o Resultado.
	System.out.println("A área do seu círculo é: " + Area);
	
	
	
	}

}
