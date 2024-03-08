/*
 * Trabalho de POO Questão 15: O custo ao consumidor de um carro novo é a soma do preço
 * de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço
 * de fábrica. Faça um programa que receba o preço de fábrica de um veículo, o percentual
 *  de lucro do distribuidor e o percentual de impostos, calcule e mostre:
 *  a) o valor correspondente ao lucro do distribuidor; b) o valor correspondente aos impostos; 
 *  c) o preço final do veículo;
 *  Date: 02/03/24
 *  LastUpdate: 02/03/24
 */

package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor de fábrica do veículo: ");
	double valorFábrica = sc.nextDouble();
	
	System.out.println("Digite o percentual de lucro do distribuidor: ");
	double percentualLucro = sc.nextDouble();
	
    System.out.println("Digite o percentual do imposto: ");
    double percentualImposto = sc.nextDouble();
    // Calculo do lucro do distribuidor, imposto e preço final do veículo
    double lucroDistribuidor = valorFábrica * percentualLucro/100;
    double valorImposto = valorFábrica * percentualImposto/100;
    double preçoFinal = valorFábrica + lucroDistribuidor + valorImposto;
    // Exibe o resultado.
    System.out.println("o lucro do distribuidor será de: " + lucroDistribuidor);
    System.out.println("o valor do imposto será de: " + valorImposto);
    System.out.println("o preço final do veículo será de: " + preçoFinal);
    
    

	}

}
