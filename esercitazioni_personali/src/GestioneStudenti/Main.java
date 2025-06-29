package GestioneStudenti;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Studente s1 = new Studente("Giuseppe", "Gravagno", 25);
		Studente s2 = new Studente("Vincenzo", "Albertini", 19);
		Studente s3 = new Studente("Ilaria", "Rapisarda", 18);
		
		ArrayList<Studente> studenti = new ArrayList<>();
		
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		
		for (Studente studente : studenti) {
			if (studente.getVotofinale()>24) {
				System.out.println(studente.getNome());
			}
			
		}
		

	}

}
