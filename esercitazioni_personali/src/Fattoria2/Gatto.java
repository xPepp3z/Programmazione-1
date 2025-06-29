package Fattoria2;

public class Gatto extends Animale{
	
		public Gatto(String nome) {
		super(nome);
		
	}

		@Override
		public void emettiverso() {
			System.out.println(nome+ " fa miao");
			
		}

	}

