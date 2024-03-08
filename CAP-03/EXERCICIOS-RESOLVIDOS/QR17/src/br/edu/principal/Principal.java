/*
 *Trabalho de POO Questão 17: Um trabalhador recebeu seu salário e o depositou em sua conta bancária. 
 * Esse trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. Sabe-se que cada operação
 * bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta está zerado.
 *Date: 05/03/24
 *LastUpdate: 05/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		double Salário = sc.nextDouble();
		
		System.out.println("Digite o valor do primeiro cheque: ");
		double Cheque1 = sc.nextDouble();
		
		System.out.println("Digite o valor do segundo cheque: ");
		double Cheque2 = sc.nextDouble();
		
		double cpmf1 = Cheque1 * 0.38/100;
		double cpmf2 = Cheque2 * 0.38/100;
		double Saldo = Salário - Cheque1 - Cheque2 - cpmf1 - cpmf2;
		
		System.out.println("O valor do saldo é de: " + Saldo);
		
		

	}

}
