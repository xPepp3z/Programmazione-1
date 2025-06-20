package es_permessi;

public class Main {

	public static void main(String[] args) {
		GestioneUtenti sistema = new GestioneUtenti();
		
		Clienti u1 = new Clienti ("pippo03@gmail.com", "xPepp3z");
		Clienti u2 = new Clienti ("mario@gmail.com", "Mario11");
		Admin a1 = new Admin("admin1@gmail.com", "AdminSupremo099");
		Admin a2 = new Admin("admin2@gmail.com", "AdminSecondario88");
		
		sistema.aggiungiUtente(u1);
		sistema.aggiungiUtente(u2);
		sistema.aggiungiUtente(a1);
		sistema.aggiungiUtente(a2);
		
		sistema.stampaPermessi();
	}

}
