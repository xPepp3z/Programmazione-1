package calcolatrice;

import java.util.Scanner;

public class Calcolatrice {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int numero = input.nextInt();
		
		System.out.print("Inserisci un altro numero: ");
		int numero2 = input.nextInt();
		
		int somma= numero + numero2;
		int differenza= numero - numero2;
		int moltiplicazione= numero * numero;
		float divisione= (float)numero / numero2;
		
		System.out.println("L'addizione è: " +somma);
		System.out.println("La sottrazione è: " +differenza);
		System.out.println("La moltiplicazione è: " +moltiplicazione);
		System.out.println("La divisione è: " +divisione);
		
		input.close();
	}
}
