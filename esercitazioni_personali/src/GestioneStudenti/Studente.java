package GestioneStudenti;

public class Studente {
	private String nome;
	private String cognome;
	private int votofinale;
	
	public Studente(String nome, String cognome, int votofinale) {
		this.nome = nome;
		this.cognome = cognome;
		this.votofinale = votofinale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getVotofinale() {
		return votofinale;
	}

	public void setVotofinale(int votofinale) {
		this.votofinale = votofinale;
	}
	
	
	
	
	
	
	
	
	
}
