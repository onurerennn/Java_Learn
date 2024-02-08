package polymorphismDemo;

public class MercedesBenzinli extends Mercedes {

	public MercedesBenzinli() {
	}
	

	void yakitTipi() {
		System.out.println(model + " " + marka + " " + aracAdi + "benzinli yakıt türünde araçlarımız mevcuttur araçlarımız mevcuttur");
	}

	void mototHacmi() {
		System.out.println(model + " " + marka + " " + aracAdi + "benzinli 1.6 Lt  hacim türünde araçlarımız mevcuttur");
	}

	double fiyatHesapla() {
		return getFiyat() + getFiyat() * 0.6;
	}

}
