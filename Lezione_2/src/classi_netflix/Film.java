package classi_netflix;

public class Film extends Contenuto {
	int durata;
	
	public Film(String titolo, String genere, String anno, int durata) {
		super(titolo, genere, anno);
		this.durata = durata;
	}
	
}
