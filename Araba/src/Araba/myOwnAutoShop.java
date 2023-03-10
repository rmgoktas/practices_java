package Araba;

public class myOwnAutoShop {

	public static void main(String[] args) {
		
		
		
		Sedan sedan = new Sedan (250, 200000, "Kırmızı");
		Ford ford1 = new Ford (210, 350000, "Mavi");
		Ford ford2 = new Ford (180, 400000, "Siyah");
		
		System.out.println("SEDAN Özellik: " );
		sedan.bilgileriGoster();
		
		System.out.println("FORD1 Özellik: ");
		ford1.bilgileriGoster();
		
		System.out.println("FORD2 Özellik: ");
		ford2.bilgileriGoster();
		
		
	}

}
