package es_permessi;

import java.util.ArrayList;

public abstract class Utente {
	String username;
	String email;
	
	public Utente(String username, String email){
		this.username = username;
		this.email = email;
	}
	
	public abstract ArrayList<String> getPermessi();
	
	public void stampaInfo() {
		System.out.println("Username: "+username+ "Email: " +email);
		
		
	}
}
