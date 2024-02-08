package Inheritancebasatkıkonsept;
//ilk baştaki

public class main {

	public static void main(String[] args) {
		BasiliKitap bk1 = new BasiliKitap();
		bk1.kitap_adi = "kitap 1";
		bk1.Isbn = "123456";
		bk1.Yazar = "yazar-1";// protect kendisinden türetilen sınıfa ulaşılabilir
		bk1.ciltKapak = "karton";
		// bk1.kitapSec();*/
		System.out.println("---------------");
		EKitap ek1 = new EKitap();
		ek1.Yazar = "yazar-2";
		ek1.kitap_adi = "E kitap-1";
		ek1.Isbn = "123456";
		ek1.isOriginal = true;
		System.out.println("---------------");
		Seslikitap sk1 = new Seslikitap();
		sk1.kitap_adi = "sesli kitap-1";
		sk1.Yazar = "yazar-3";
		sk1.Isbn = "1234567";
		sk1.seslendiren = "ses demo-1";
		System.out.println("---------------");
		Universite uk1 = new Universite(); // ilk önce kitapla ,basılıkıtplar, üniveriste böyle çalışır
		uk1.cevirmen = "çevirmen-1";
		uk1.ciltKapak = "karton";
		uk1.Isbn = "12345";
		uk1.Yazar = "yazar-5";
		uk1.kitap_adi = "üniversite kıtabı";
		System.out.println("---------------");
		Ingilizce ik1 = new Ingilizce(); // ilk önce kitapla ,basılıkıtplar, üniveriste böyle çalışır
		ik1.isexecise = true;
		ik1.ciltKapak = "karton";
		ik1.Isbn = "12345789";
		ik1.Yazar = "yazar-6";
		ik1.kitap_adi = "ingilizce kıtabı";

	}

}
