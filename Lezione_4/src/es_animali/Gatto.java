package es_animali;

public class Gatto extends Animale {

	public Gatto(String nome) {
		super(nome);
	}

	@Override
	public void emettiverso() {
		System.out.println("Il cane di nome "  +nome+ " dice Miao!");
		
	}
	

}
