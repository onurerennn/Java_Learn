package abstract_demo_2;

public class VakifKatilim extends Vakifbank {
	VakifKatilim() {
	}

	boolean isEskiMusteri;

	VakifKatilim(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
			boolean isMaasMusterisi, boolean isKrediKarti, boolean isEskiMusteri) {

		super.musteriHesapNo = musteriHesapNo;
		super.MusteriAdi = musteriAdi;
		super.HesapTipi = hesapTipi;
		super.adres = adres;
		super.iletisim = iletisim;
		super.bakiye = bakiye;
		super.isMaasmusterisi = isMaasMusterisi;
		super.isKrediKarti = isKrediKarti;
		this.isEskiMusteri = isEskiMusteri;
	}
	// diğer metotları yazmasakta olur(@overriding) çünkü bir yerde overriding
	// yapılması yeterli

	@Override
	void durumGor() {// isteğe bağlı polymorphism
		System.out.println("VakifKatilim bankası müşteri durumu onaylandı");
	
	}
}
