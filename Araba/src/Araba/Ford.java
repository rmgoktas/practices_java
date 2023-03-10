package Araba;

public class Ford extends Car{
	
	public int year = 2009;
	public int manifecturerDiscount = -150000;
	
	public Ford(int speed, double regularPrice, String color) {
		
		super(speed, regularPrice, color);
		
	}

	@Override
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Üretim Yılı: " + this.year);
		System.out.println("Üretici İndirimi " + this.manifecturerDiscount);
		
	}



}
