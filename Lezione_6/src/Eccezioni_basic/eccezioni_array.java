package Eccezioni_basic;

import java.util.Scanner;

public class eccezioni_array {

	public static void main(String[] args) {
		String[] nomi = {"Paolo", "Jessica", "Giuseppe", "Maria"};

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ho un lista di nomi nascosta, in base al numero che digiterai ti do il nome");
		int indice= input.nextInt();
		
		try {
			System.out.println(nomi[indice]);
		} catch (Exception e) {
			System.out.println("Non ci sono nomi per questa posione :(");
		} finally {
			input.close();
		}
		
	}

}
