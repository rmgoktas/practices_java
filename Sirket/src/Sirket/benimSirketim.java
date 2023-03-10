package Sirket;

public class benimSirketim {
	double bakiye;
	String departman1;
	String departman2;
	int calisanSayisi;
	


		public benimSirketim(int bakiye, String departman1,int calisanSayisi, int i, String departman2) {
			this.bakiye = bakiye;
			this.departman1 = departman1;
			this.departman2 = departman2;
			this.calisanSayisi = calisanSayisi;
		}


		public void bilgileriGoster() {
			System.out.println("Sirket bakiyesi =" + bakiye);
			System.out.println("Sirket departmanlari =" + departman1 + ", " + departman2);
			System.out.println("Sirket calisan sayisi= " + calisanSayisi);
		}
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	

