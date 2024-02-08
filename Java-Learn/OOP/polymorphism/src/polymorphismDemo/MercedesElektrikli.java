package polymorphismDemo;

public class MercedesElektrikli extends Mercedes {
	private double fiyat = 5000000;
	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public MercedesElektrikli() {
	}

	void yakitTipi() {
		System.out.println(model + " " + marka + " " + aracAdi + "elektrik li araçlarımız mevcuttur");
	}

	void mototHacmi() {
		System.out.println(model + " " + marka + " " + aracAdi + "elektrikli farklı hacim türünde araçlarımız mevcuttur");
	}

	double fiyatHesapla() {
		return fiyat + fiyat * 0.5;
	}

}
