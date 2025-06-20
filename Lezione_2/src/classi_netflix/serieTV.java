package classi_netflix;

public class serieTV extends Contenuto {

	int numeroStagioni;
	int episodiTotali;
	
	public serieTV(String titolo, String genere, String anno/*, int numeroStagioni, int episodiTotali*/) {
		super(titolo, genere, anno);
		/*this.numeroStagioni = numeroStagioni;
		this.episodiTotali = episodiTotali;*/
	}

	public int getNumeroStagioni() {
		return numeroStagioni;
	}

	public void setNumeroStagioni(int numeroStagioni) {
		this.numeroStagioni = numeroStagioni;
	}

	public int getEpisodiTotali() {
		return episodiTotali;
	}

	public void setEpisodiTotali(int episodiTotali) {
		this.episodiTotali = episodiTotali;
	}
	
}
