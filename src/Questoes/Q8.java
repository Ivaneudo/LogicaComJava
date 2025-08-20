package Questoes;

import java.util.Scanner;

public class Q8 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Digite o valor da sua primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println ("Digite o valor da sua segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media < 4) {
			System.out.println ("Você está reprovado. Sua média foi: " + media);
		} else if (media >=4 && media < 7) {
			System.out.println ("Você ira precisar fazer uma Avaliação Final. Sua nota não atingiu a média exigida pelo curso.");
			System.out.println ("");
			System.out.println ("Digite o valor da sua Avaliação Final: ");
			double AvaliacaoFinal = scanner.nextDouble();
			double MediaFinal = (media + AvaliacaoFinal) / 2;
			
			if (AvaliacaoFinal >= 4 && MediaFinal >= 5) {
				System.out.println ("Você foi aprovado(a). Sua nota na Avaliação Final foi de: " + AvaliacaoFinal + " e sua média final é de: " + MediaFinal);
			}
		} else {
			System.out.println ("Você foi aprovado com média: " + media);
		}
		
		scanner.close();
	}

}
