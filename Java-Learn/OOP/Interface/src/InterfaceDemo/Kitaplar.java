package InterfaceDemo;

public abstract class Kitaplar implements IBaskiAl { //abstract sınıfat zorunlu polymorphism olmaz
	public String ad;
	public String isbn;
	public String yazar;
	public String basimYili;
	public double fiyat;

	Kitaplar() {

	}

	Kitaplar(String ad, String yazar, double fiyat) {

		this.ad = ad;
		this.yazar = yazar;
		this.fiyat = fiyat;

	}

	public abstract void kitapSec();

	void kitapSec2() {

	}

}
