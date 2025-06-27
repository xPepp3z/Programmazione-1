package Biblioteca;

import java.util.ArrayList;

public class Utente {
	private String nome;
	private String iD;
	private ArrayList<Libro> ListaPrestiti = new ArrayList<>();
	private ArrayList<Utente> ListaUtenti = new ArrayList<>();
	
	public Utente(String nome, String iD) {
		super();
		this.nome = nome;
		this.iD = iD;
		this.ListaPrestiti = new ArrayList<>();
		this.ListaUtenti = new ArrayList<>();
	}
	
	public void prendiInPrestito(Libro ListaPrestiti){
		if (ListaPrestiti.isDisponibile()) {
			this.ListaPrestiti.add(ListaPrestiti);
			ListaPrestiti.setDisponibile(false);
			System.out.println("Libro prestato a " +this.nome+ ": " +ListaPrestiti.getTitolo());
		} else {
			System.out.println("Libro non disponibile");
		}
	}

	public void aggiungiUtente(Utente ListaUtenti) {
		this.ListaUtenti.add(ListaUtenti);
		
	}
}
