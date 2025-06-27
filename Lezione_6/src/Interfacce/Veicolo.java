package Interfacce;

public class Veicolo {
	int batteria;

	public Veicolo(int batteria) {
		this.batteria = batteria;
	}
	
	public void caricaAttuale() {
		System.out.println("Sono al " +batteria+ "%");
	}
}
