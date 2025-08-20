package Questoes;

import java.util.Scanner;

public class Q4 {

	public static void main (String[] org) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Digite quantos metros você deseja converter em centimetros: ");
		double metros = scanner.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println (metros + "m em centimetros é = " + centimetros + ("cm"));
		
		scanner.close();
		
	}
	
}
