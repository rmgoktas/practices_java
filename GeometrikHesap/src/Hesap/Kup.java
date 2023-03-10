package Hesap;

public class Kup implements Shape3D {

	private double uzunluk;
	
	public Kup(double uzunluk) {
	
		this.uzunluk = uzunluk;
	}

	@Override
	public double getHacim() {
		
		System.out.println("Kup'un Hacmi = " + this.uzunluk*uzunluk*uzunluk);
		return 0;
	
	}

	@Override
	public double getYuzeyAlani() {
		System.out.println("Kup'un Yuzey Alani = " + this.uzunluk*uzunluk*6);
		return 0;
	}

}
