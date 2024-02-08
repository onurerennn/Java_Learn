package polimorphismDemo_2;

//ortak değişkenleri kullanmamız için private yaptık(fiyat)
public class Kitaplar {
	public String adi;
	String yazari;
	int basimYili;
	protected int sayfaSayisi;
	double isbn;
	private double fiyat;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	Kitaplar() {

	}

	Kitaplar(String adi) {
		this.adi = adi;
	}

	double fiyatHesapla() {
		double kdv;
		return kdv = getFiyat() + getFiyat() * 0.18;
	}

	void fiyatArtisiUygula() {
		double son_fiyat = fiyat + fiyat * 0.18 + fiyat * 0.10;

		System.out.println("zamlı ürün fiyatı " + son_fiyat);
	}

	void fiyatIndirimUygula() {
		double son_fiyat = fiyat + fiyat * 0.18 - fiyat * 0.10;

		System.out.println("indirimli ürün fiyatı " + son_fiyat);
	}

}
