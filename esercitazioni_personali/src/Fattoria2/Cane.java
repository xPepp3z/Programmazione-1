package Fattoria2;

public class Cane extends Animale{

	public Cane(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emettiverso() {
		System.out.println(nome+ " fa bau");
		
	}

}
