package esercitazioni_file_singoli;

import java.util.Scanner;

public class scan {

		public static void main(String[] args) {
			Scanner tastiera = new Scanner(System.in);
			

			System.out.println("Come ti chiami?");
			String nome = tastiera.nextLine();
			
			System.out.println("Quanti anni hai?");
			
			int eta = tastiera.nextInt();			
			if (eta < 0 ) {
			System.out.println("L'età non può essere negativa");
			System.exit(1);
			} else
			tastiera.nextLine();
			
			System.out.print("Qual'è il tuo numero di telefono?");
			String numero = tastiera.nextLine();
			if (numero.length() != 9) {
				System.out.println("Superato numero massimo di numeri");
				System.exit(1);
			}else
			tastiera.nextLine();
			
			tastiera.close();
			
			System.out.printf("Ottimo ti ho rubato i dati, so che ti chiami " +nome+ " e che hai " +eta+ "anni e il tuo numero è " +numero); 
		}
	}

