package Questoes;

import java.util.Scanner;

public class Q6 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Qual o nome do primeiro produto? ");
		var produto1 = scanner.nextLine();
		System.out.println ("Qual o valor do primerio produto? ");
		double valorProd1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println ("Qual o nome do segundo produto? ");
		var produto2 = scanner.nextLine();
		System.out.println ("Qual o valor do segundo produto? ");
		double valorProd2 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println ("Qual o nome do terceiro produto? ");
		var produto3 = scanner.nextLine();
		System.out.println ("Qual o valor do terceiro produto? ");
		double valorProd3 = scanner.nextDouble();
		scanner.nextLine();
		
		if (valorProd1 < valorProd2 && valorProd1 < valorProd3) {
			System.out.println ("O produto " + produto1 + " é o mais barato, custanto apenas: " + valorProd1);
		} else if (valorProd2 < valorProd1 && valorProd2 < valorProd3) {
			System.out.println ("O produto " + produto2 + " é o mais barato, custanto apenas: " + valorProd2);
		} else {
			System.out.println ("O produto " + produto3 + " é o mais barato, custanto apenas: " + valorProd3);
		}
		
		scanner.close();
	}

}
