package es_permessi;

import java.util.ArrayList;

public class Clienti extends Utente{

	public Clienti(String username, String email) {
		super(username, email);

	}
	
	@Override
	public ArrayList<String> getPermessi() {
		ArrayList<String> permessi = new ArrayList<>();
			
			permessi.add("READ");
			
			return permessi;
	}
	
	
}
