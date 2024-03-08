/*
 * Trabalho de POO Questão 21: Uma pessoa deseja pregar um quadro em uma parede. Faça um programa para calcular e mostrar a
 *que distância a escada deve estar da parede. A pessoa deve fornecer o tamanho da escada e a altura em
 *que deseja pregar o quadro.
 *Lembre-se de que o tamanho da escada deve ser maior que a altura que se deseja alcançar.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da escada: ");
		double escadaT = sc.nextDouble();
		
		System.out.println("Altura que deseja pregar o quadro: ");
		double AlturaQ = sc.nextDouble();
		
		double escadaD = Math.pow(escadaT, 2) - Math.pow(AlturaQ, 2);
		double escadaD2 = Math.sqrt(escadaD);
		
		System.out.println("a distância que a escada deve estar da parede é: " + escadaD2);
		


	}

}
