package classi_scuola;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Giuseppe", "Gravagno", 21);
		
		Studenti s1 = new Studenti("Viggo", "Ponturo Nygaard", 20, 7.5f, 105);
		
		Docenti d1 = new Docenti("Ettore", "Condemi", 24, 2.000f, 001);
		
		Amministrazione a1 = new Amministrazione("Elisa", "grasso", 23, 1.600f);
		
		System.out.println(s1.name + " " + s1.surname + " " + s1.age + " " + s1.media + " " + s1.matricola);
		System.out.println(d1.name + " " + d1.surname + " " + d1.age + " " + d1.stipendio + " " + d1.matricola);
		System.out.println(a1.name + " " + a1.surname + " " + a1.age + " " + a1.stipendio);
	}

}
