package Banca;

public class ContoRisparmio extends Conto{

	public ContoRisparmio(int numeroConto, double saldo) {
		super(numeroConto, saldo);

	}

	@Override
	public void preleva(double importo) {
		if (this.saldo>=importo) {
			System.out.println("Puoi prelevare!");
		} else {
			System.out.println("Non puoi prelevare/pagare, l'importo è maggiore del saldo");
		}
		
	}

}
