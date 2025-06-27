package Interfacce;

public class Main {

	public static void main(String[] args) {
		
		Auto_Ibrida a1 = new Auto_Ibrida(70);
		
		
		a1.disconnetti();
		
		System.out.println("Siamo connessi? " +a1.isConnesso());
		a1.caricaAttuale();	
		a1.ricarica();
	}

}
