package es_permessi;

import java.util.ArrayList;

public class GestioneUtenti {
	ArrayList<Utente> utenti= new ArrayList<>();
	
	public void aggiungiUtente(Utente u) {
	    utenti.add(u);  											//aggiunge l'oggetto alla lista
	}

    public void stampaPermessi() {
        for (Utente u : utenti) {
            u.stampaInfo(); 										// stampa username ed email
            System.out.println("Permessi: " + u.getPermessi());
        }
    }
}
