package polymorphismDemo;

public class MercedesDizel extends Mercedes {
	double fiyat = 4000000;

	public MercedesDizel() {
	}

	public double getFiyat() {
		return  fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	void yakitTipi() {
		System.out.println(model + " " + marka + " " + aracAdi
				+ "dizel yakıt türünde araçlarımız mevcuttur araçlarımız mevcuttur");
	}

	void mototHacmi() {
		System.out.println(model + " " + marka + " " + aracAdi + "benzinli 2 Lt  hacim türünde araçlarımız mevcuttur");
	}

	double fiyatHesapla() {
		return fiyat + fiyat * 0.9;
	}
}
