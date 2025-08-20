package Questoes;

import java.util.Scanner;

public class Q3 {
	
	public static void main (String[] org) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Digite a primeria nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println ("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.println ("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println ("A sua média é: " + media);
		
		scanner.close();
	}

}
