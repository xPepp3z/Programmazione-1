package abstract_es;

public class Rettangolo extends Forma {
	
	private double base;
	private double altezza;
	
	

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {

		return base * altezza;
	}

	@Override
	public double calcolaPerimetro() {

		return base*2+altezza*2;
	}
	
	
}
