package Hesap;

public class Kure implements Shape3D {

private double pi = 3.14;
private double yaricap;
	
	public Kure(double pi, double yaricap) {
	
		this.pi = pi;
		this.yaricap = yaricap;
		
	}

	@Override
	public double getHacim() {
		System.out.println("Kure'nin Hacmi = " + this.yaricap*yaricap*yaricap*pi*4/3);
		return 0;
	}

	@Override
	public double getYuzeyAlani() {
		System.out.println("Kure'nin Yuzey Alani = " + this.yaricap*yaricap*pi*4);
		return 0;
	}
}
