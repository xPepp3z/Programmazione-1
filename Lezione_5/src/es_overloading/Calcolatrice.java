package es_overloading;

public class Calcolatrice {
	int i1;
	int i2;
	int i3;
	double d1;
	double d2;
	String s1;
	String s2;
	
	public int somma(int i1, int i2){
		return i1 +i2;
	}
	
	public int somma(int i1, int i2, int i3) {
		return i1+i2+i3;
	}
	
	public double somma(double d1, double d2) {
		return d1 + d2;
	}
	
	public String somma(String s1, String s2) {
		return s1 + s2;
	}


}
