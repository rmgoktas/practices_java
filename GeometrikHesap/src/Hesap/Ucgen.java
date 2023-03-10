package Hesap;

public class Ucgen implements Shape2D{
	
	private double tabanUzunluk;
	private double yukseklik;
	
	
	public Ucgen(double tabanUzunluk, double yukseklik) {
		this.tabanUzunluk = tabanUzunluk;
		this.yukseklik = yukseklik;
	}

	@Override
	public double getAlan() {
		System.out.println("Ucgen'in Alani = " + this.tabanUzunluk*yukseklik);
		return 0;
	}
	@Override
	public double getCevre() {
		System.out.println("Ucgen'in Cevresi = " + this.tabanUzunluk*3);
		return 0;
	}
}
