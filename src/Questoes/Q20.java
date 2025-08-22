package Questoes;

import java.util.Scanner;
import java.util.ArrayList;

public class Q20 {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        int[] numeros = new int[20];
        ArrayList<Integer> Par = new ArrayList<>();
        ArrayList<Integer> Impar = new ArrayList<>();


        for (var i = 0 ; i < 20 ; i++) {
            System.out.println("Digite um número inteiro: ");
            var num = in.nextInt();

            if (par(num)) {
                Par.add(num);
            } else {
                Impar.add(num);
            }

            numeros[i] = num;
        }

        System.out.println("Os números do seu Array são: ");
        for (var j = 0 ; j < 20 ; j++) {
            System.out.println(numeros[j]);
        }

        System.out.println("Os números pares são: ");
        for (var p = 0 ; p < Par.size() ; p ++ ) {
            System.out.println(Par.get(p));
        }

        System.out.println("Os números impares são: ");
        for (var i = 0 ; i < Impar.size() ; i ++ ) {
            System.out.println(Impar.get(i));
        }

        in.close();
    }

    public static boolean par (int num) {
        return num % 2 == 0;
    }
}
