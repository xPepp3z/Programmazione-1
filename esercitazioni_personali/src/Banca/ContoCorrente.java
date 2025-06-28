package Banca;

public class ContoCorrente extends Conto {

	public ContoCorrente(int numeroConto, double saldo) {
		super(numeroConto, saldo);
	}

	@Override
	public void preleva(double importo) {
		if(this.saldo<-500) {
		
			System.out.println("Prelievo non disponibile, sei sotto i 500€");
	}

}
}
