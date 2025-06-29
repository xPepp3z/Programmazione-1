package Fattoria2;

public abstract class Animale {
	String nome;

	public Animale(String nome) {
		this.nome = nome;
	}
	
	public abstract void emettiverso();
}