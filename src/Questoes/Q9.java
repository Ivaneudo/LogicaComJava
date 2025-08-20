package Questoes;

import java.util.Scanner;

public class Q9 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Escreva o primeiro número: ");
		double numero1 = scanner.nextDouble();
		System.out.println ("Escreva o segundo número: ");
		double numero2 = scanner.nextDouble();
		System.out.println ("Escreva o terceiro número: ");
		double numero3 = scanner.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println ("O número " + numero1 + " é o maior");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println ("O número " + numero2 + " é o maior");
		} else {
			System.out.println ("O número " + numero3 + " é o maior");
		}
		
		scanner.close();
	}

}
