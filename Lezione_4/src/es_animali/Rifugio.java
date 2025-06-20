package es_animali;

import java.util.ArrayList;


public class Rifugio {
	ArrayList<Animale> animali = new ArrayList<>();
		
		public void aggiungiAnimale(Animale a) {
			
			animali.add(a);
			
		}
		
		public void stampaVersi() {
			for(Animale a:animali) {
				a.emettiverso();
			}
		}
		
		public void descrizione() {
			for(Animale a: animali) {
				a.descrizione();
			}
		}
		

}
	



