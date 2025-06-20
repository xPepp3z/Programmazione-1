package calcolatrice_funzioni;

import java.util.Scanner;

public class calcolatrice_funzioni {
	public static void main (String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		int numero = tastiera.nextInt();
		
		System.out.println("Inserisci un altro numero: ");
		int numero2 = tastiera.nextInt();
		
		tastiera.close();
		
		somma(numero, numero2);
		differenza(numero, numero2);
		moltiplicazione(numero, numero2);
		divisione(numero, numero2);
		
		}
	
	
		public static int somma(int numero, int numero2) {
			int somma= numero + numero2;
			System.out.println("L'addizione è: " +somma);
			return somma;
		}
		
		public static int differenza(int numero, int numero2) {
			int differenza= numero - numero2;
			System.out.println("La sottrazione è: " +differenza);
			return differenza;
		}
		
		public static int moltiplicazione(int numero, int numero2) {
			int moltiplicazione= numero * numero2;
			System.out.println("La moltiplicazione è: " +moltiplicazione);
			return moltiplicazione;
		}
		
		public static int divisione(int numero, int numero2) {
			int divisione= numero / numero2;
			System.out.println("La divisione è: " +divisione);
			return divisione;
		}


	}
	
	
	