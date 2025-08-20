package Questoes;

import java.util.Scanner;

public class Q13 {
	
	public static void main (String[] org) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual o número de eleitores? ");
		int eleitores = scanner.nextInt();
		int candidato;
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		int nulos = 0;
		
		for (var i = 0 ; i < eleitores ; i++) {
			System.out.println("( 1 ) - Candidato 1\n( 2 ) - Candidato 2\n( 3 ) - Candidato 3");
			System.out.println("Digite um númeor para votar: ");
			candidato = scanner.nextInt();
			
			if (candidato == 1) {
				candidato1 ++;
			} else if (candidato == 2) {
				candidato2 ++;
			} else if (candidato == 3){
				candidato3 ++;
			} else {
				nulos ++;
			}
		}
		
		System.out.println ("Candidato 1 com " + candidato1 + " votos.\nCandidato 2 com " + candidato2 + " votos.\nCandidato 3 com " + candidato3 + " votos.\n" + nulos + " votos nulos.");
		
		scanner.close();
	}

}
