package Questoes;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int multi = 1;

        /*ArrayList<Integer> vetor = new ArrayList<>();*/
        int[] vetor = new int[5];

        for (var i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            vetor[i] = numero;
        }

        System.out.println("A soma dos números é: ");

        for (var s = 0; s < vetor.length; s++) {
            soma += vetor[s];
        }
        System.out.println(soma);

        System.out.println("A multiplicação dos números é: ");

        for (var m = 0 ; m < vetor.length ; m++) {
            multi *= vetor[m];
        }
        System.out.println(multi);

        System.out.println("Os números eram: ");

        for (var i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
