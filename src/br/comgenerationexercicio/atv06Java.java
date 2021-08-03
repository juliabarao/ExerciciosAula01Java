package br.comgenerationexercicio;

import java.util.Scanner;

public class atv06Java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valorConsumidor, valorFabrica, valorImposto, valorDistribuidor;
		
		System.out.println("Digite o custo de Fabrica de um carro novo: ");
		valorFabrica = entrada.nextInt();

		valorDistribuidor = valorFabrica*0.28;
		valorImposto = valorFabrica*0.45;

		valorConsumidor = valorFabrica + valorDistribuidor + valorImposto;
		
		System.out.println("O custo ao consumidor é: " + valorConsumidor);
		
		entrada.close();

	}

}
