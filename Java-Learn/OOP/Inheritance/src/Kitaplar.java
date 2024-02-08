
public class Kitaplar {
//  base temel sınıf , ana sınıf,  super sınıf, parent sınıf
	// 3 çeşit kalıtım var
	// sıngular(kedi hayvanın tüm özellşklerini taşır)
	// hiyerarşik(kedide , köpekte hayvandır)
	// multilevel(hayvan,kedi,çita çita hem kedinin hemde hayvanın özellşklerini
	// taşır)(aşamalı)

	public String kitap_adi; // public her yerden erişebliri packageler farklı olsada
	String Isbn; // default aynı package içerisinde
	protected String Yazar; // türetilmiş tüm sınıflardan (türetilmişler arasında erişim belirteci) kalıtım
							// olan yerde
	private int Sayfa_sayisi; // sadece kendi classı içerisnde
	private double fiyat;
	public String kagıtCinsi = "A4";

	Kitaplar(String kitap_adi, String Isbn, String Yazar) {
		this.kitap_adi = kitap_adi;
		this.Isbn = Isbn;
		this.Yazar = Yazar;
		System.out.println("kitap oluşturuldu");// ilk önce base classın constructorı çalışır

	}

	void kitapSec() {
		System.out.println(kitap_adi);
		System.out.println(Isbn);
		System.out.println(Yazar);

	}

	public int Cevir() {
		return 1;
	}
}
