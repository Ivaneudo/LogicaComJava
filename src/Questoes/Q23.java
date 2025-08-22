package Questoes;

import java.util.Scanner;

public class Q23 {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = in.nextDouble();
        in.nextLine();
        System.out.println("Digite o operador: ");
        System.out.println("( + ) - Adição \n( - ) - Subtração\n( * ) - Divisão\n( / ) - Divisão");
        var operador = in.nextLine();
        System.out.println("Digite o segundo número: ");
        double numero2 = in.nextDouble();

        double resultado = calc(numero1, operador, numero2);

        System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado );

        in.close();

    }

    public static double calc (double n1, String oper, double  n2) {

        if ( oper.equals("+")) {
            return n1 + n2;
        } else if (oper.equals("-")) {
            return n1 - n2;
        } else if (oper.equals("*")) {
            return n1 * n2;
        } else if (oper.equals("/")) {
            if (n2 == 0) {
                throw new ArithmeticException("Impossivel dividir por zero.");
            }
            return n1 / n2;
        } else {
            throw new ArithmeticException("Operador invalido: " + oper);
        }
    }

}
