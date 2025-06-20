package array_massimo;

public class array_massimo {
	
	public static void main(String[] args) {
		int[] numeri = {5, 2, 9, 1, 7}; // array di esempio

        int massimo = numeri[0]; // partiamo dal primo elemento

        for (int i = 1; i < numeri.length; i++) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        System.out.println("Il valore massimo è: " + massimo);
    }
	}

