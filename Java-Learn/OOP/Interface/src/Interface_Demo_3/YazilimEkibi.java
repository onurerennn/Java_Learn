package Interface_Demo_3;

public abstract class YazilimEkibi extends Calisanlar implements IC {
//abstract sınıftan abstarct sınıf extends edilebilir
	// overridng abstarctan gelen ilk concreta sınıfa kalır

	public String yetenek;

	YazilimEkibi() {

	}

	YazilimEkibi(String isimSoyisim, String unvan, String pozisyon, String birimi, int tecrubeYili, double maas,
			String yetenek) {
		super(isimSoyisim, unvan, pozisyon, birimi, tecrubeYili, maas);
		this.yetenek = yetenek;

	}

	public abstract void calis();

	public abstract void ogren();

	public abstract void uygula();

}
