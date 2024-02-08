package polimorphismDemo_2;

public class UniversiteKitapları extends Kitaplar {

	boolean isOriginal;
	private double fiyat;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public UniversiteKitapları() {
		
	}

	void fiyatArtisiUygula() {
		double son_fiyat = fiyat + fiyat * 0.18 + fiyat * 0.08;

		System.out.println("zamlı ürün fiyatı " + son_fiyat);
	}

	void fiyatIndirimUygula() {
		double son_fiyat = fiyat + fiyat * 0.18 - fiyat * 0.15;

		System.out.println("indirimli ürün fiyatı " + son_fiyat);
	}

}
