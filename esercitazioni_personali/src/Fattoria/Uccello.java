package Fattoria;

public class Uccello extends Animale implements Volante {

	public Uccello(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emettiverso() {
		System.out.println("Cip");
		
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!");
		
	}

}
