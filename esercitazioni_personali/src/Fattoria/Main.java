package Fattoria;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animale> a1 = new ArrayList<>();
		
		a1.add(new Cane("Fido"));
		a1.add(new Gatto("Micio"));
		a1.add(new Cane("Rex"));
		a1.add(new Uccello("Salvador"));
		
		
		for (Animale animale : a1) {
			animale.emettiverso();
		}
		
	}



}
