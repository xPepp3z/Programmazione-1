package classi_netflix;

public class Main {

	public static void main(String[] args) {
		
		serieTV serie1 = new serieTV("Io, tu e lei", "Romanzo", "2015");
		
		System.out.println(serie1.episodiTotali);
		
		serie1.setEpisodiTotali(30);
		
		System.out.println(serie1.episodiTotali);
		

	}


}
