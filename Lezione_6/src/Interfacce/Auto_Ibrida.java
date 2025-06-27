package Interfacce;

public class Auto_Ibrida extends Veicolo implements Ricaricabile, Connettivita{

	boolean connesso;
	
	public Auto_Ibrida(int batteria) {
		super(batteria);
		
	}


	@Override
	public void connetti() {
		connesso=true;
		System.out.println("Sei connesso via Bluetooth");
		
	}

	@Override
	public void disconnetti() {
		connesso=false;
		System.out.println("Sei disconnesso");
		
	}

	@Override
	public boolean isConnesso() {
		return connesso;
	}
		
	

	@Override
	public void ricarica() {
		this.batteria=100;
		System.out.print("Hai ricaricato la macchina al " +batteria+ "%");
		
	}
	
}
