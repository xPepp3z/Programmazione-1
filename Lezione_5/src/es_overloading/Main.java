package es_overloading;

public class Main {

	public static void main(String[] args) {
		
		Calcolatrice calcoli = new Calcolatrice();
		
		System.out.println(calcoli.somma(3, 2));
		System.out.println(calcoli.somma(3, 2, 6));
		System.out.println(calcoli.somma(22, 33));
		System.out.println(calcoli.somma("Sei", " Giuseppe"));
	}

}
