package Questoes;

import java.util.Scanner;

public class Q12 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Digite a sua nota (0 a 10): ");
		double nota = scanner.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println ("Digite uma nota valida (0 a 10): ");
			nota = scanner.nextDouble();
		}
		
		System.out.println ("Sua nota é: " + nota);
		
		scanner.close();
	}

}
