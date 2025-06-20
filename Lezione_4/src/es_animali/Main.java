package es_animali;

public class Main {

	public static void main(String[] args) {
		
		Cane cane1 = new Cane("Pluto");
		Gatto gatto1= new Gatto("Yuri");
		
		Rifugio rifugio = new Rifugio();
		rifugio.aggiungiAnimale(cane1);
		rifugio.aggiungiAnimale(gatto1);
		
		rifugio.stampaVersi();
		rifugio.descrizione();

	}

}
