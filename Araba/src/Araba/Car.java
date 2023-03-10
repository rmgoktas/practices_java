package Araba;

public class Car {

	int speed;
	double regularPrice;
	String color;
	double SalePrice = 200000;
	
	public Car(int speed, double regularPrice, String color) {
		
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
		
	}
		
	
	public double getRegularPrice() {
		return regularPrice;
	}


	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}


	public void bilgileriGoster(){
		
		System.out.println("Bilgiler: ");
		System.out.println("Max hız: " + this.speed);
		System.out.println("Renk: " + this.color);
		System.out.println("Liste Fiyatı: " + this.regularPrice);
		System.out.println("Satış Fiyatı: " + this.SalePrice);
		
		
	}

		
	

}
