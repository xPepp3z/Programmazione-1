package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Libro> aggiungiLibro = new ArrayList<>();
	ArrayList<Utente> aggiungiUtente = new ArrayList<>();
	
	public void aggiungiLibro (Libro libro) {
		aggiungiLibro.add(libro);
	}

	public void aggiungiUtente (Utente Utente) {
		aggiungiUtente.add(Utente);
	}
	
	
}
