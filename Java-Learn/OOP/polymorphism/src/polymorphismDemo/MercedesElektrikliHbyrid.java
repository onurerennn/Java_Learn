package polymorphismDemo;

public class MercedesElektrikliHbyrid extends MercedesElektrikli {
	double fiyat = 7000000;

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public MercedesElektrikliHbyrid() {
	}

	void yakitTipi() {
		System.out.println(model + " " + marka + " " + aracAdi + "Hbyrid araçlarımız mevcuttur");
	}

	void mototHacmi() {
		System.out.println(model + " " + marka + " " + aracAdi + " Hbyrid farklı hacim türünde araçlarımız mevcuttur");
	}

	double fiyatHesapla() {
		return fiyat + fiyat * 0.2;

	}
}
