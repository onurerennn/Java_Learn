package polimorphismDemo_2;

public class CocukKitaplari extends Kitaplar {
	String yasAraligi="0-12";
	private double fiyat;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	CocukKitaplari() {

	}

	void fiyatArtisiUygula() {
		double son_fiyat = getFiyat() + getFiyat() * 0.18 + getFiyat() * 0.60;

		System.out.println("zamlı ürün fiyatı " + son_fiyat);
	}

	void fiyatIndirimUygula() {
		double son_fiyat = getFiyat() + getFiyat() * 0.18 - getFiyat() * 0.12;

		System.out.println("indirimli ürün fiyatı " + son_fiyat);
	}

}
