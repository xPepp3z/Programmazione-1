package Biblioteca;

public class Libro {
	private String titolo;
	private String autore;
	private String ISBN;
	private boolean disponibile;
	
	public Libro(String titolo, String autore, String iSBN, boolean disponibile) {
		this.titolo = titolo;
		this.autore = autore;
		ISBN = iSBN;
		this.disponibile = true;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	
	public void stampaDettagli() {
		System.out.println(""+titolo+ "," +autore+ "," +ISBN+ ", è disponibile?" +disponibile);
	
	}
}
