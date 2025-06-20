package es_overloading_list;

import java.util.ArrayList;

public class Carrello {
	ArrayList<String> carrello = new ArrayList<>();
	 
	String nome;
	int quantità;
	
	public void aggiungiProdotto(String nome) {
		carrello.add(nome);
		System.out.println(nome);
	}
	
	public void aggiungiProdotto(String nome, int quantità) {
		carrello.add(nome + quantità);
		System.out.println(nome + quantità);
	}
}
