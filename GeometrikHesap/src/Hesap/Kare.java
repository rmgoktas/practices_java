package Hesap;

public class Kare implements Shape2D{
	
	private double uzunluk;
	
	
	
	public Kare(double uzunluk) {
		this.uzunluk = uzunluk;
		
	}

	@Override
	public double getAlan() {
		System.out.println("Kare'nin Alani = " + this.uzunluk*uzunluk);
		return 0;
	}
	@Override
	public double getCevre() {
		System.out.println("Kare'nin Cevresi = " + this.uzunluk*4);
		return 0;
	}
}

