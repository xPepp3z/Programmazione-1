package abstract_es;

public class Cerchio extends Forma{
	private double raggio; 
	
	
	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {

		return raggio*raggio*Math.PI;
	}

	@Override
	public double calcolaPerimetro() {

		return raggio*2*Math.PI;
	}
	
}
