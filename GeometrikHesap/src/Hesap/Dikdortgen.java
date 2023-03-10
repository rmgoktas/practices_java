package Hesap;

public class Dikdortgen implements Shape2D {
	
	private double yukseklik;
	private double genislik;
	
	
	public Dikdortgen(double yukseklik, double genislik) {
		this.yukseklik = yukseklik;
		this.genislik = genislik;
	}

	@Override
	public double getAlan() {
		System.out.println("Dikdortgen'in Alani = " + this.yukseklik*genislik);
		return 0;
	}
	@Override
	public double getCevre() {
		System.out.println("Dikdortgen'in Cevresi = " + this.yukseklik*2+genislik*2);
		return 0;
	}
}
