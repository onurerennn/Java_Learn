package Interface_Demo_3;
//Interface_Demo_3_UML
public class main {

	public static void main(String[] args) {

		YazilimEkibi c1 = new Mobil();
		c1.maas=5000;
		c1.isC();//oyuna impleme etmedik ama yazilimEkibine ettik
		c1.calis();
		c1.maasHesapla();
		c1.uygula();
		c1.zamYap(5000);

		System.out.println("-------------------------");
		
		Oyun c2 = new Oyun();
		c2.maas=5000;
		c2.isC();
		c2.isBackEnd();
		c2.isFrontEnd();
		c2.isFullStack();
		c2.isC(); 
		c2.calis();
		c2.maasHesapla();
		c2.uygula();
		c2.zamYap();
		
		System.out.println("----------------------");
		
		
		HybritMobil c3 = new HybritMobil();
		c3.isC();
		
		
		
	}

}
