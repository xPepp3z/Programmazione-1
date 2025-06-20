package classi_scuola;


	public class Amministrazione extends Person{
		float stipendio;
		int matricola;

	public Amministrazione(String name, String surname, int age, float stipendio) {
		super(name, surname, age);
		this.stipendio = stipendio;
	}
}
