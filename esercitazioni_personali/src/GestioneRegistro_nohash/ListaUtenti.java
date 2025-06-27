package GestioneRegistro_nohash;

import java.util.ArrayList;


public class ListaUtenti {
	ArrayList<Utente> list = new ArrayList<>();


	
	public void aggiungiUtente(Utente list) {
		this.list.add(list);
		System.out.println("Utente aggiunto");
	}
	
	public void rimuoviUtente(Utente list) {
		
		if (this.list.remove(list)){
			System.out.println("Utente rimosso");
		} else {
			System.out.println("Non puoi rimuovere un utente che non esiste!");
		}
		
	}
}