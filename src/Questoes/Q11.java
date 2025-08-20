package Questoes;

import java.util.Scanner;

public class Q11 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Digite o número da tabuada que você deseja ver (0 a 10): ");
		int numero = scanner.nextInt();
		
		if (numero < 0 || numero > 10) {
			System.out.println ("Digite um número valido.");
		} else {
			System.out.println("A sua tabuada do número " + numero + " é:");
			for (int i = 0 ; i <= 10 ; i++) {
				int multiplicacao = numero * i;
				
				System.out.println (numero + " X " + i + " = " + multiplicacao);
			}
		}
		
		scanner.close();
	}

}
