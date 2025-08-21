package Questoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Q18 {

    public static void main (String[] org) {

        Scanner scanner = new Scanner (System.in);

        int[] vetor = new int[10];

        for (var i = 0 ; i < 10 ; i ++) {
            System.out.println("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            vetor[i] = numero;
        }

        System.out.println("O tamanho do Array é: " + vetor.length);

        for (var j = vetor.length - 1 ; j >= 0 ; j --) {
            System.out.println(vetor[j]);
        }

        scanner.close();

    }

}
