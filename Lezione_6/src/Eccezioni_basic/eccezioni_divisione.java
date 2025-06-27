package Eccezioni_basic;

import java.util.Scanner;

public class eccezioni_divisione {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci il primo numero");
		int primo_numero = input.nextInt();
		System.out.println("Inserisci il primo numero");
		int secondo_numero = input.nextInt();
		
		try {
			int divisione = primo_numero/secondo_numero;
			System.out.println("Risultato: " +divisione);
		} catch (Exception e) {
			System.out.println("Non puoi dividere per 0!");
		}
		

	}

}
