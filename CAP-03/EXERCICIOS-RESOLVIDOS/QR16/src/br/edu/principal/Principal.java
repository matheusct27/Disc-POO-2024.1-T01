/*
 * Trabalho de POO Questão 16:Faça um programa que receba o número de horas trabalhadas e o valor
 * do salário mínimo, calcule e mostre o salário a receber, seguindo estas regras: a) a hora trabalhada vale a metade do salário mínimo.
 * b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada.
 * c) o imposto equivale a 3% do salário bruto.
 * d) o salário a receber equivale ao salário bruto menos o imposto.
 * Date: 05/03/24
 * LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de horas trabalhadas: ");
		int HorasT = sc.nextInt();
		
		System.out.println("Digite o valor do salário minimo: ");
		double Saláriom = sc.nextInt();
		// Calculo do salário liquído
		double valorhorasT = Saláriom / 2;
		double SalárioBruto = HorasT*valorhorasT;
		double imposto = SalárioBruto* 3/100;
		double SalárioLiq = SalárioBruto - imposto;
		// Exibe o Resultado.
		System.out.println("O valor do salário liquido é: " + SalárioLiq);
		

		
	}

}
