package Banca;

public abstract class Conto {
	int numeroConto;
	double saldo;
	
	public Conto(int numeroConto, double saldo) {
		this.numeroConto = numeroConto;
		this.saldo = saldo;
	}
	
	public void versa(double importo) {
		this.saldo += importo;
		System.out.println("Hai aggiunto "+importo+  " ed adesso il tuo saldo è di " +this.saldo);
	}
	
	public abstract void preleva(double importo);
	
	public void mostraSaldo() {
		System.out.println("Il tuo saldo è di: " +this.saldo);
	}
}