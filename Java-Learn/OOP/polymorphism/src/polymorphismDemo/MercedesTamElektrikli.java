package polymorphismDemo;

public class MercedesTamElektrikli extends MercedesElektrikli {
	private double fiyat = 6000000;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public MercedesTamElektrikli() {
	}

	void yakitTipi() {
		System.out.println(model + " " + marka + " " + aracAdi + "tam elektrik li araçlarımız mevcuttur");
	}

	void mototHacmi() {
		System.out
				.println(model + " " + marka + " " + aracAdi + " tam elektrikli farklı hacim türünde araçlarımız mevcuttur");
	}

	double fiyatHesapla() {
		return fiyat + fiyat * 0.4 ;

	}
}
