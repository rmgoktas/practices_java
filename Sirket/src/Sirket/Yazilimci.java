package Sirket;

public abstract class Yazilimci implements Sirket{
	String[] isim;
	String[] soyIsim;
	String[] statu = {"Junior", "Senior", "Intern"};
	int maas;
	
	
	public Yazilimci(String[] isim, String[] soyIsim, String[] statu) {
		
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.statu = statu;
	}
	
	public void bilgileriGoster() {
		System.out.println("Yazilimci Ismi =" + isim);
		System.out.println("Yazilimci soyismi ="  + soyIsim);
		System.out.println("Yazilimci title'ı= " + statu);
		}


	@Override
	public double getYapilanIs() {
		Object int calismaSüresi;
		
		if (this.statu.equals("Junior")) {
			this.maas = calismaSüresi * 115;
			this.is(calismaSüresi);
		} 
		else if (this.statu.equals("Senior")) {
			this.maas = calismaSüresi * 130;
			this.is(calismaSüresi);
		} 
		else if (this.statu.equals("İntern")) {
			this.maas = calismaSüresi * 150;
			this.is(calismaSüresi);
		return 0;
	}


	
		
	}



	protected abstract void is(int calismaSüresi);






	
	
}
