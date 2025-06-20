package arraylist_classi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main (String[] args) {
		
		ArrayList<prodotti> carrello = new ArrayList<>();
		
				carrello.add(new prodotti("Mela", "Melinda", "1.50€", LocalDate.of(2025, 9, 3)));
				carrello.add(new prodotti("Gocciole", "Pavesi", "3€", LocalDate.of(2025, 2, 27)));
				carrello.remove(0);
				carrello.add(1, new prodotti("Panbauletto", "Mulino Bianco", "2€", LocalDate.of(2025, 8, 23)));
				
				
				Scanner inputScanner = new Scanner(System.in);
				
				System.out.print("Inserisci una data di scadenza: ");
				String dataInserita =  inputScanner.nextLine();
				
				DateTimeFormatter dataGiustaDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataUtenteDate = LocalDate.parse(dataInserita, dataGiustaDateTimeFormatter);
				
				
				
		        for (prodotti prodottotemp : carrello ) {
		            System.out.println("Nome: " + prodottotemp.nome);
		            System.out.println("Marca: " + prodottotemp.marca);
		            System.out.println("Prezzo: " + prodottotemp.prezzo);
		            System.out.println("Scadenza: " + prodottotemp.scadenza);
		            System.out.println("-----------");
		            
		            
		            if (prodottotemp.isExpired(dataUtenteDate)) {
		            	
		            	System.out.println(prodottotemp.getNome() + " è SCADUTO");
		            }else 
		            		System.out.println(prodottotemp.getNome() + " è VALIDO");
		            
					}
		        }

	}

