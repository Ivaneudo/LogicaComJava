package Questoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Q17 {
	
	public static void main (String[] org) {
		
		Scanner scanner = new Scanner (System.in);
		
		ArrayList<Integer> vetor = new ArrayList<>();
		
		for (var i = 0 ; i < 5 ; i ++) {
			System.out.println("Digite um número inteiro: ");
			int numero = scanner.nextInt();
			
			vetor.add(numero);
		}
		
		System.out.println(vetor);
		
		scanner.close();
		
	}

}
