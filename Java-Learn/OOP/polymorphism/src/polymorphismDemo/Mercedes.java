package polymorphismDemo;

public class Mercedes {
	String aracAdi = "binek";
	String marka = "mercedes";
	String model = "2023";
	private double fiyat = 2000000; // fiyat kargaşasını önlemek için her nesne kendi sınıfındaki fiyatı alsın

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	Mercedes() {

	}

	void yakitTipi() {
		System.out.println(model + " " + marka + " " + aracAdi + " çeşitli yakıt turlerinde ait araçlarımız mevcuttur");
	}

	void mototHacmi() {
		System.out
				.println(model + " " + marka + " " + aracAdi + " çeşitli motor hacimlerine ait araçlarımız mevcuttur");
	}

	double fiyatHesapla() {
		return fiyat + fiyat * 0.8;
	}

}
