package encapculation;//gizleme

public class main {
	/*
	 * banka adında bir sınıf tasarlayınuız.bu sınıf musteri_hesap_no, musteri_ad ve
	 * özellşklerine sahip olsun. Ayrıca bu sınıf ParaCek ve ParaYatir adında
	 * fonksiyonlara sahip olsun. her bir para çekme ve para yatırma işlemlerinde
	 * tüm işlemi IslemKontrol adında fonksiyonlarda değerlendirsin.Hesap bu işleme
	 * uygunsa onay verilsin.Son olarak Hesap_Ozet adındaki fonksiyonda ise tüm
	 * bilgileri ekranda gösteren bir diğer metot daha bu sınıfta yer
	 * almaktadır.Başka bir sınıfan bu sınıfın özelliklerini ve metotlarına erişip
	 * farklı müşteriler için bu sınıfa ait nersneler oluşturunuz.Her bir nesne için
	 * oluşturduğunuz sınıfın test işlemini sağlayınız
	 */
	public static void main(String[] args) {
		/*Banka m1 = new Banka();      
		m1.hesap_no=2300101;
		m1.Hesap_tipi="TL";
		m1.musteri_adi="yusuf ahmet çokyaşar";
		m1.hesap_bakiye=7500;
		System.out.println("----------------------------");
		m1.Hesap_Ozet();
		System.out.println("----------------------------");
		m1.ParaCek(500, "TL");
		System.out.println("---------------");
		m1.ParaYatir(8500,"TL");
		System.out.println("-----------------");
		m1.Hesap_Ozet();*/
		//private olan nesnelere erişeceğiz
		Banka m2 = new Banka();
		m2.BilgileriDoldur();
		m2.Hesap_Ozet();
		m2.ParaCek(500, "dolar");
		m2.ParaYatir(2500, "dolar");
		System.out.println("-------------- ");
		m2.Hesap_Ozet();
		System.out.println("-----------------");
		System.out.println("-----------------");
		Banka m3 = new Banka();
		m3.BilgileriDisaridanDoldur(2300103, "TL", "Berkay Uzunçay", 22100);
		m3.Hesap_Ozet();
		m3.ParaYatir(900,"TL");
		m3.ParaCek(3000,"TL");
		m3.Hesap_Ozet();
		
	}

}
