package Sirket;

public abstract class Personel implements Sirket{
	
	String[] isim;
	String[] soyIsim;
	String[] statu = {"Mudur", "yazi_isleri", "temizlik_isleri"};
	int maas;
	
	
	public Personel(String[] isim, String[] soyIsim, String[] statu) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.statu = statu;
	}



	
	}


