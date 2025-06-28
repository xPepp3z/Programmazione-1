package Banca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ContoCorrente cc1 = new ContoCorrente(999, -550);
		ContoRisparmio cr1 = new ContoRisparmio(333, 100);
		BancaCentrale bc1 = new BancaCentrale();
		
		bc1.aggiungiConto(cr1);
		bc1.aggiungiConto(cc1);
		bc1.stampaSaldi(cr1);
		bc1.stampaSaldi(cc1);
		
		cc1.preleva(600);
		bc1.stampaSaldi(cc1);
		
		cr1.preleva(150);
		bc1.stampaSaldi(cr1);
		
		cc1.versa(1000);
		bc1.stampaSaldi(cc1);
		
		

	}

}
