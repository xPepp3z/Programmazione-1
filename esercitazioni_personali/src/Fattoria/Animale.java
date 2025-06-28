package Fattoria;

public abstract class Animale {
	String nome;

	public Animale(String nome) {
		this.nome = nome;
	}
	
	public abstract void emettiverso();
	
	public void presentati() {
		System.out.println("Ciao, sono un animale di nome "+nome);
	}

	
}