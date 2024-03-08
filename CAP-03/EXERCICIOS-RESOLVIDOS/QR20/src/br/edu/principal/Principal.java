/*
 * Trabalho de POO Questão 20: Faça um programa que receba a medida do ângulo (em graus) formado por uma escada apoiada no
 *chão e encostada na parede e a altura da parede onde está a ponta da escada. Calcule e mostre a me-
 *dida dessa escada.
 *Observação: as funções trigonométricas implementadas nas linguagens de programação trabalham
 *com medidas de ângulos em radianos.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Digite a medida do ângulo(em graus): ");
	    double Angulo = sc.nextDouble();
	    
	    System.out.println("Digite a medida da altura da parede: ");
	    double Altura = sc.nextDouble();
	    // Calculo do Radiano e medida da escada
	    double Radiano = Angulo * Math.PI / 180;
	    double escada = Altura / Radiano;
	    // Exibe o resultado.
	    System.out.println("A medida da escada é: " + escada);
	    


	}

}
