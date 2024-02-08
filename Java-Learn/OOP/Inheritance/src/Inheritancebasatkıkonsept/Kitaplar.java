package Inheritancebasatkıkonsept;

public class Kitaplar {
	public String kitap_adi; // public her yerden erişebliri packageler farklı olsada
	String Isbn; // default aynı package içerisinde
	protected String Yazar; // türetilmiş tüm sınıflardan (türetilmişler arasında erişim belirteci) kalıtım
							// olan yerde
	private int Sayfa_sayisi; // sadece kendi classı içerisnde
	private double fiyat;

	Kitaplar() {

		System.out.println("kitap oluşturuldu");// ilk önce base classın constructorı çalışır

	}

	void kitapSec() {
		System.out.println(kitap_adi);
		System.out.println(Isbn);
		System.out.println(Yazar);

	}
}
