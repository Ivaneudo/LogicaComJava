package Questoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Q17 {
	
	public static void main (String[] org) {
		
		Scanner scanner = new Scanner (System.in);
		
		/*ArrayList<Integer> vetor = new ArrayList<>();*/
		int[] vetor = new int[5];

		for (var i = 0 ; i < 5 ; i ++) {
			System.out.println("Digite um número inteiro: ");
			int numero = scanner.nextInt();
			
			vetor[i] = numero;
		}

        for (var i = 0 ; i < vetor.length ; i ++) {
            System.out.println(vetor[i]);
        }
		
		scanner.close();
		
	}

}
