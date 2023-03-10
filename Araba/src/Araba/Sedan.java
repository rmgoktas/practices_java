package Araba;

public class Sedan extends Car{
	
	public int length = 25 ;
	
	
	public Sedan(int speed, double regularPrice, String color) {
		
		super(speed, regularPrice, color);
		this.length = length;
	}
	@Override
	public void bilgileriGoster() {
		
		super.bilgileriGoster();
		System.out.println("Uzunluk: " + this.length);
		
	}
	
	public void setRegularPrice() {
		
		if (length > 20) {
		
			super.SalePrice = super.regularPrice * 95/100;
		}
		
		else {
			
			super.SalePrice = super.regularPrice * 90/100;
			
		}
		
		
		
	}
	
	
	}
	
	
	
	
	
	



	
	
		
			
	
		
		
		
		
		
		
		
	

