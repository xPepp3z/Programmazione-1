package Biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca();
		
		Libro l1 = new Libro("Il palazzo nero", "Mario Rossi", "22424", true);
		Utente u1 = new Utente("Giuseppe", "0309");
		
		l1.stampaDettagli();
		b1.aggiungiLibro(l1);
		u1.aggiungiUtente(u1);
		u1.prendiInPrestito(l1);
		l1.stampaDettagli();
		
	}

}
