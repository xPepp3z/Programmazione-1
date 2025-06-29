package GestioneErrori;

import java.util.Scanner;



public class Main {
	int numero1;
	
	
	
	public Main(int numero1) {
		super();
		this.numero1 = numero1;
	}



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Inserisci un numero");
			double n1 =input.nextInt();
			System.out.println("Inserisci il secondo numero");
			double n2 = input.nextInt();
			double divisione = n1/n2;
			System.out.println(+divisione);
		} catch (Exception e) {
			System.out.println("Devi inserire numeri, non caratteri!");
		}


	} 

}
