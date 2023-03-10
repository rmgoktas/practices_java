package Hesap;

public class dikdortgenPrizma implements Shape3D {

	private double yukseklik;
	private double genislik;
	private double uzunluk;
	
	
	public dikdortgenPrizma(double yukseklik, double genislik, double uzunluk) {
		this.yukseklik = yukseklik;
		this.genislik = genislik;
		this.uzunluk = uzunluk;
	}

	@Override
	public double getHacim() {
		System.out.println("Dikdortgen Prizma Hacmi = " + this.yukseklik*uzunluk*genislik);
		return 0;
	}

	@Override
	public double getYuzeyAlani() {
		System.out.println("Dikdortgen Prizma Yuzey Alani = " + this.yukseklik*2+uzunluk*2+genislik*2);
		return 0;
	}

	
}
