package GestioneRegistro_nohash;

public class Main {

	public static void main(String[] args) {
		
		Utente u1 = new Utente("Giuseppe", "Gravagno", 3333333, "ggg@gmail.com", "1234");
		ListaUtenti l1 = new ListaUtenti();
		
		l1.aggiungiUtente(u1);
		l1.rimuoviUtente(u1);
		l1.rimuoviUtente(u1);

	}

}
