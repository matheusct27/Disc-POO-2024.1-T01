/*
 * Trabalho de POO Questão proposta 7:Faça um programa que receba uma hora (uma variável para hora e outra para minutos), calcule e mostre:
 *a) a hora digitada convertida em minutos;
 *b) o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
 *c) o total dos minutos convertidos em segundos.
 *Date: 06/03/24
 *LastUpdate: 06/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora:");
		int Horas = sc.nextInt();
		
		System.out.println("Digite os minutos: ");
		int Minutos = sc.nextInt();
		// Calculo horas em minutos, total de minutos, minutos em segundos
		int HorasEmMin = Horas*60;
		int totalMin = HorasEmMin + Minutos;
		int Segundos = totalMin * 60;
		
		// Exibe o resultado.
		System.out.println("A hora digitada em minutos é: " + HorasEmMin);
		System.out.println("Os minutos totais são: " + totalMin);
		System.out.println("A quantidade total de segundos é: " + Segundos);
		
	
			

	}

}
