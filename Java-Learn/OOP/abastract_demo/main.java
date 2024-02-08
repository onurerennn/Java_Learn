package abastract_demo;

//abastarct_demo_uml
public class main {

	public static void main(String[] args) {
		// Sekiller sekil1 = new Sekiller() ; böyle hata verir abstarct sınıfların
		// örneği olmaz

		Sekiller sekil1 = new Ucgen();
		sekil1.setRenk("sarı");
		
		// (sekil1.yaricap) ulasamaz data tipi ile constructor farklı old için
		// değişken old için varsa üst sınıfa git al yoksa alt sınıfa gitme
		sekil1.Ciz();
		sekil1.Zoom();
		sekil1.Sil();
		System.out.println("-----------------------");

		System.out.println("************************");

		Dikdortgen sekil2 = new Dikdortgen();
		sekil2.k_kenar=5;
		sekil2.u_kenar=10;
		sekil2.setRenk("mavi");
		sekil2.Ciz();
		sekil2.Zoom();
		sekil2.Sil(); 
		sekil2.info();

		System.out.println("-----------------------");

		System.out.println("************************");
		Cember sekil3 = new Cember();
		sekil3.setRenk("kırmızı");
		sekil3.yaricap=8;
		sekil3.Ciz();
		sekil3.Zoom();
		sekil3.Sil();
		sekil3.info();

	}

}
