package classi_scuola;

	
	public class Studenti extends Person{
		float media;
		int matricola;
	
	public Studenti(String name, String surname, int age, float media, int matricola) {
		super(name, surname, age);
		this.media = media;
		this.matricola = matricola;
	}

}