package Questoes;

import java.util.Scanner;

public class Q22 {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Escreva um número inteiro: ");
        int numero = in.nextInt();

        String convertendo = String.valueOf(numero);
        String invertida = new StringBuilder(convertendo).reverse().toString();

        System.out.println(numero + " <--> " + invertida);

        in.close();

    }

}
