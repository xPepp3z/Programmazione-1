package es_animali;

public class Cane extends Animale {
	
	
	
	public Cane(String nome) {
		super(nome);
		
	}

	@Override
	public void emettiverso() {
		System.out.println("Il cane di nome " +nome+ " dice Bau!");
		
	}
	


}
