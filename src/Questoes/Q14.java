package Questoes;

import java.util.Scanner;

public class Q14 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0 ; i < 10 ; i ++) {
			System.out.println("Digite um número inteiro: ");
			int numero = scanner.nextInt();
			
			if (primo(numero)) {
				System.out.println ("O número " + numero + " é primo");
			} else {
				System.out.println ("O númeor " + numero + " não é primo");
			}
		}
		
		scanner.close();
	}
	
	public static boolean primo (int n) {
		if (n <= 0) return false;
		if (n == 2 ) return false;
		if (n % 2 == 0) return true;
		
		for (int i = 3; i * i <= n ; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
