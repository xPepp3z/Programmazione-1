package classi_scuola;

public class Docenti extends Person{
	float stipendio;
	int matricola;

public Docenti(String name, String surname, int age, float stipendio, int matricola) {
	super(name, surname, age);
	this.stipendio = stipendio;
	this.matricola = matricola;
}

}
