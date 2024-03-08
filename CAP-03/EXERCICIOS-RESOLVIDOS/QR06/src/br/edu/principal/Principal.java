/*
 * Trabalho de POO Quetão 6: Faça um programa que receba o salário base de um funcionário,
 * calcule e mostre o salário a receber, sabendo-se que o funcionário tem gratificação de 5%
 * sobre o salário base e paga imposto de 7% também sobre o salário base.
 * Date: 01/03/24
 * LastUpdate: 01/03/24 
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário base: ");
		int SalárioBase = sc.nextInt();
		// Calcula gratificação e imposto. (5% e 7% respectivamente.)
		int grat = SalárioBase * 5/100;
		int imp = SalárioBase * 7/100;
		// Calcula o salário a ser recebido.
		int SalárioReceber = SalárioBase + grat - imp;
		// Exibe o Resultado.
		System.out.println("O salário a receber é: " + SalárioReceber);
		
		
	}

}
