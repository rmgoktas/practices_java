package Hesap;

public class ucgenPrizma implements Shape3D{

	private double tabanAlani;
	private double yukseklik;
	private double tabanCevresi;
	
	
	public ucgenPrizma(double tabanAlani, double yukseklik, double tabanCevresi) {
	
		this.tabanAlani = tabanAlani;
		this.yukseklik = yukseklik;
		this.tabanCevresi = tabanCevresi;
	}

	@Override
	public double getHacim() {
		System.out.println("Ucgen Prizma'nin Hacmi = " + this.tabanAlani*yukseklik);
		return 0;
	}

	@Override
	public double getYuzeyAlani() {
		System.out.println("Ucgen Prizma'nin Yuzey Alani = " + this.tabanCevresi*yukseklik*tabanAlani*2);
		return 0;
	}

}
