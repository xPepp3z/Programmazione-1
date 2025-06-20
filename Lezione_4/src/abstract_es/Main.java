package abstract_es;

public class Main {

	public static void main(String[] args) {
		Cerchio c = new Cerchio(5);
		double areaCerchio = c.calcolaArea();
		System.out.println("L'area del cerchio è:" +areaCerchio);
		
		Rettangolo rettangolo = new Rettangolo(5, 10);
		double perimentroRettangolo = rettangolo.calcolaPerimetro();
		System.out.println("Il perimetro del rettangolo è: " +perimentroRettangolo);

	}

}
