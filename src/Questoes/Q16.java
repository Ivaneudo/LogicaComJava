package Questoes;

import java.util.Scanner;

public class Q16 {
	
	public static void main (String[] org) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Digite um número inteiro maior que 0: ");
		int numero = scanner.nextInt();
		int fatorial = 1;
		
		if (numero < 0) {
			System.out.println ("Número invalido.");
		} else if (numero == 0) {
			System.out.println ("O fatorial de 0 é 1");
		} else {
			for (int i = numero -1 ; i > 0 ; i--) {
				fatorial *= i;
			}
			
			System.out.println ("O fatorial de " + numero + " é " + fatorial);
		}
		
		scanner.close();
		
	}

}
