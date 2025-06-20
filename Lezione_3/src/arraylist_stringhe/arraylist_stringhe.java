package arraylist_stringhe;

import java.util.ArrayList;

					
					
					public class arraylist_stringhe {

					    public static void main(String[] args) {
					        ArrayList<String> prodotti = new ArrayList<>();

					        prodotti.add("Pane");
					        prodotti.add("Latte");
					        prodotti.add("Uova");
					        prodotti.remove("Latte");
					        prodotti.add( 0, "Coca");
					        

					        System.out.println("Nel carrello ci sono: " +prodotti.size() + "prodotti");
					        System.out.println(prodotti);
					    }
					}

