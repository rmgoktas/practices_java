/**
 * 
 */
/**
 * @author rifatmetehangoktas
 *
 */
package Hesap;

public class main {

	public static void main(String[]args) {
		
		Daire daire = new Daire(3.14,5);
		Kare kare = new Kare(3);
		Ucgen ucgen = new Ucgen(6,12);
		Kup kup = new Kup(10);
		Dikdortgen dikdortgen = new Dikdortgen(10,25);
		dikdortgenPrizma dPrizma = new dikdortgenPrizma(3,4,5);
		Kure kure = new Kure(3.14,25);
		ucgenPrizma uPrizma = new ucgenPrizma(15,6,32);
		
		daire.getAlan();
		daire.getCevre();
		
		System.out.println();
		
		kare.getAlan();
		kare.getCevre();
		
		System.out.println();
		
		ucgen.getAlan();
		ucgen.getCevre();
		
		System.out.println();
		
		dikdortgen.getAlan();
		dikdortgen.getCevre();
		
		System.out.println();
		
		kup.getHacim();
		kup.getYuzeyAlani();
		
		System.out.println();
		
		dPrizma.getHacim();
		dPrizma.getYuzeyAlani();
		
		System.out.println();
		
		kure.getHacim();
		kure.getYuzeyAlani();

		System.out.println();
		
		uPrizma.getHacim();
		uPrizma.getYuzeyAlani();
		
		

	}

}
