package Questoes;

import java.util.Scanner;

public class Q21 {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Digite a primeira palavra: ");
        var palavra1 = in.nextLine();
        System.out.println("Digite a segunda palavra: ");
        var palavra2 = in.nextLine();

        int tamanho1 = palavra1.length();
        int tamanho2 = palavra2.length();

        System.out.println("As palavras digitadas são: " + palavra1 + " e " + palavra2);

        if (tamanho1 == tamanho2) {
            System.out.println("As duas palavras tem o mesmo tamanho. " + tamanho1);
        } else {
            System.out.println("As palavras tem tamanhos diferentes, a " + palavra1 + " tem " + tamanho1 + " caracteres e a " + palavra2 + " tem " + tamanho2 + " caracteres.");
        }

        if (palavra1.equals(palavra2)) {
            System.out.println("As duas palavras tem o mesmo conteudo. ");
        } else {
            System.out.println("As palavras tem conteudos diferentes. ");
        }

        in.close();

    }

}
