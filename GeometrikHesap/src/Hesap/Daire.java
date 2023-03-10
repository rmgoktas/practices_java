package Hesap;

public class Daire implements Shape2D {
	
	private double pi = 3.14;
	private double yaricap;
	
	
	public Daire(double pi, double yaricap) {
		this.pi = pi;
		this.yaricap = yaricap;
	}

	@Override
	public double getAlan() {
		System.out.println("Daire'nin Alanı = " + this.pi*yaricap*yaricap);
		return 0;
	}
	@Override
	public double getCevre() {
		System.out.println("Daire'nin Cevresi = " + this.pi*yaricap*2);
		return 0;
	}
}
