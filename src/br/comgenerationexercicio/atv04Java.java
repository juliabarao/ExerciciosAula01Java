package br.comgenerationexercicio;

import java.util.Scanner;

public class atv04Java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextInt();

		r = Math.pow((a + b), 2.0);
		s = Math.pow((b + c), 2.0);
		d = ((r + s) / 2);
		

		System.out.println("O valor de R �: " + r);
		System.out.println("O valor de S �: " + s);
		System.out.println("O valor de D �: " + d);
		
		entrada.close();

	}

}
