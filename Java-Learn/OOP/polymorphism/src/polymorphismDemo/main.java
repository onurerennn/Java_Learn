package polymorphismDemo;

public class main {

	public static void main(String[] args) {
		Mercedes a1 = new Mercedes();
		System.out.println("güncel  fiyat" + a1.getFiyat() + "TL");
		a1.mototHacmi();
		a1.yakitTipi();
		System.out.println("güncel KDV dahil fiyat" + a1.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesBenzinli a2 = new MercedesBenzinli();
		System.out.println(" güncel  fiyat " + a2.getFiyat() + "TL"); // fiyat özelliği yoktu bir üst sınıfa gitti onun
																		// değerini aldı
		a2.mototHacmi();
		a2.yakitTipi();
		System.out.println("güncel KDV dahil fiyat" + a2.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesDizel a3 = new MercedesDizel();
		System.out.println("güncel  fiyat" + a3.fiyat + "TL");
		a3.mototHacmi();
		a3.yakitTipi();
		System.out.println("güncel KDV dahil fiyat" + a3.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesElektrikli a4 = new MercedesElektrikli();
		System.out.println("güncel  fiyat" + a4.getFiyat() + "TL");
		a4.mototHacmi();
		a4.yakitTipi();
		System.out.println("güncel KDV dahil fiyat" + a4.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesTamElektrikli a5 = new MercedesTamElektrikli();
		System.out.println("güncel  fiyat" + a5.getFiyat() + "TL");
		a5.mototHacmi();
		a5.yakitTipi();
		System.out.println("güncel KDV dahil fiyat" + a5.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesElektrikliHbyrid a6 = new MercedesElektrikliHbyrid();
		System.out.println("güncel  fiyat" + a6.fiyat + "TL");
		a6.mototHacmi();
		a6.yakitTipi();
		System.out.println("güncel KDV dahil fiyat" + a6.fiyatHesapla() + "TL");

		// data tipi ile constructor metot aynı isimde değilse
		// 1. metotlara erişim :overriding edilip edilmedğine bakılarak karar verilir
		// 2. değişkenlere erişim: ilk bulunan değişken değeri yazılır
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		Mercedes a7 = new MercedesBenzinli();
		System.out.println("güncel  fiyat" + a7.getFiyat() + "TL"); // burda ilk değişkene erişiyor (mercedes)
		a7.mototHacmi(); // overriding edilmiş
		a7.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahil fiyat" + a7.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		Mercedes a8 = new MercedesDizel();
		System.out.println("güncel  fiyat" + a8.getFiyat() + "TL"); // burda ilk değişkene erişiyor (mercedes)
		a8.mototHacmi(); // overriding edilmiş
		a8.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahil fiyat" + a8.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		Mercedes a9 = new MercedesElektrikli();
		System.out.println("güncel  fiyat" + a9.getFiyat() + "TL"); // burda ilk değişkene erişiyor (mercedes)
		a9.mototHacmi(); // overriding edilmiş
		a9.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahil fiyat" + a9.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		Mercedes a10 = new MercedesTamElektrikli();
		System.out.println("güncel  fiyat" + a10.getFiyat() + "TL"); // burda ilk değişkene erişiyor (mercedes)
		a10.mototHacmi(); // overriding edilmiş
		a10.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahil fiyat" + a10.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		Mercedes a11 = new MercedesElektrikliHbyrid();
		System.out.println("güncel  fiyat" + a11.getFiyat() + "TL"); // burda ilk değişkene erişiyor (mercedes)
		a11.mototHacmi(); // overriding edilmiş
		a11.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahil fiyat" + a11.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesElektrikli a12 = new MercedesElektrikliHbyrid();
		System.out.println("güncel  fiyat" + a12.getFiyat() + "TL"); // burda ilk değişkene erişiyor (mercedes)
		a12.mototHacmi(); // overriding edilmiş
		a12.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahil fiyat" + a12.fiyatHesapla() + "TL");
		System.out.println("-----------------------");
		MercedesElektrikli a13 = new MercedesTamElektrikli();
		System.out.println("güncel  fiyat" + a13.getFiyat() + "TL"); // fiyat yazsam sadece data classdaki değeri alı
		a13.mototHacmi(); // overriding edilmiş
		a13.yakitTipi(); // overriding edilmiş
		System.out.println("güncel KDV dahils fiyat" + a13.fiyatHesapla() + "TL");

	}

}
