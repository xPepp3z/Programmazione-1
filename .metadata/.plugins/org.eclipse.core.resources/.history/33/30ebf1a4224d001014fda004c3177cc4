package arraylist_classi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prodotti {

	String nome;
	String marca;
	String prezzo;
	LocalDate scadenza;

	
	public prodotti(String nome, String marca, String prezzo, LocalDate scadenza) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.scadenza = scadenza;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}


	public LocalDate getScadenza() {
		return scadenza;
	}


	public void setScadenza(LocalDate scadenza) {
		this.scadenza = scadenza;
	}
	
	public boolean isExpired(LocalDate dataInserita) {

		
		return scadenza.isBefore(dataInserita);
	}


	@Override
	public String toString() {
		return "arraylist_classi [nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", scadenza=" + scadenza
				+ "]";
	}
	


}
