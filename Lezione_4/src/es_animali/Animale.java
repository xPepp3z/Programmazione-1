package es_animali;

public abstract class Animale {
	String nome;
	public abstract void  emettiverso();
	public void descrizione() {
		System.out.println("Sono un animale di nome " +nome);
	};
	
	public Animale(String nome) {

		this.nome = nome;
	}
	
	}
