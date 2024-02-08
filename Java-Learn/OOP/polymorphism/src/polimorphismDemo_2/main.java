package polimorphismDemo_2;
//polimorphismDemo_2_UML
public class main {

	public static void main(String[] args) {
		// 1.DURUM
		// data tipi ile constructor aynı isimde ise
		// ilgili sınıfın değişkenlerine ve metotlarına doğrudan erişilir
		Kitaplar kitap1 = new Kitaplar();
		kitap1.setFiyat(100);
		System.out.println("KDV'siz kitap fiyatı " + kitap1.getFiyat());
		System.out.println("KDV dahil kitap fiyatı " + kitap1.fiyatHesapla());
		kitap1.fiyatArtisiUygula();
		kitap1.fiyatIndirimUygula();
		System.out.println("--------------------------");
		UniversiteKitapları kitap2 = new UniversiteKitapları();
		kitap2.setFiyat(200);
		System.out.println("KDV'siz kitap fiyatı " + kitap2.getFiyat());
		System.out.println("KDV dahil kitap fiyatı " + kitap2.fiyatHesapla());
		kitap2.fiyatArtisiUygula();
		kitap2.fiyatIndirimUygula();
		System.out.println("--------------------------");

		// 2.DURUM
		// data tipi ile constructor farklı isimde ise(is-a ilişkisi varsa)
		// 1.değişkenlere erişim
		// data tipini sınıfına git değeri al ve dönder
		// 2.metotlara erişim
		// metodun overriding edilip edilmediğine bakarak karar verecektir

		Kitaplar kitap3 = new BoyamaKitaplari();
		kitap3.setFiyat(100);// 3 defa overriding edilmis en son constructorda edildiği için ordaki değeri
								// alır
		System.out.println("KDV'siz kitap fiyatı " + kitap3.getFiyat());// tek kitaplarda olduğu için orada çalışır
		System.out.println("KDV dahil kitap fiyatı " + kitap3.fiyatHesapla());
		kitap3.fiyatArtisiUygula();
		kitap3.fiyatIndirimUygula();
		System.out.println("--------------------------");
		BoyamaKitaplari kitap4 = new PastelBoyamaKitaplari();
		System.out.println(	kitap4.yasAraligi);//üst sınıfından alır değeri alt sınıfından almaz
		System.out.println("--------------------------");
		
	}

}
