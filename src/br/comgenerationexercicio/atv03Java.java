package br.comgenerationexercicio;

import java.util.Scanner;

public class atv03Java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int horas, minutos, segundos, resto1, resto2;
		
		System.out.println("Digite a dura��o do evento em segundos: ");
		segundos = entrada.nextInt();
		
		horas = segundos / 3600;
		resto1 = segundos % 3600;
    	minutos = resto1 / 60;
    	resto2 = resto1 % 60;
      	
    	System.out.println("A dura��o do evento foi de " + horas + " horas, " + minutos + " minutos e " + resto2 + " segundos.");
		
		entrada.close();

	}

}
