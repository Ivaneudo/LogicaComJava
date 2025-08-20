package Questoes;

import java.util.Scanner;

public class Q5 {
	
	private static final double PI = 3.14;
	
	public static void main (String[] org) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Escreva o valor do raio: ");
		double raio = scanner.nextDouble();
		
		double area = PI * (raio * raio);
		
		System.out.println ("A área do seu circulo é: " + area);
		
		
		scanner.close();
	}

}
