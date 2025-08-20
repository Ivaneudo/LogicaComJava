package Questoes;

import java.util.Scanner;

public class Q7 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Você deseja fazer uma média de quantas notas? ");
		int voltas = scanner.nextInt();
		
		double nota = 0;
		double soma = 0;
		
		for (int i = 0 ; i < voltas ; i++) {
			System.out.println("Digite o valor da sua nata");
			nota = scanner.nextDouble();
			
			soma += nota;
		}
		
		double media = soma / voltas;
		
		if (media > 7) {
			System.out.println("Você foi aprovado com média: " + media);
		}else {
			System.out.println("Você foi reprovado com média: " + media);
		}
		
		scanner.close();
	}

}
