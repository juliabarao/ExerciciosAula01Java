package br.comgenerationexercicio;

import java.util.Scanner;

public class atv01Java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos, meses, dias, tda, tdm, totaldedias;
		
		System.out.println("Digite sua idade: ");
		anos = entrada.nextInt();
		
		System.out.println("Digite quantos mases: ");
		meses = entrada.nextInt();
		
		System.out.println("Digite quantos dias: ");
		dias = entrada.nextInt();
		
		tda = anos * 365;
		
		tdm = meses * 30;
		
		totaldedias = tda + tdm + dias;
		
		System.out.println("Sua idade em dias �: " + totaldedias);
		
		entrada.close();


	}

}
