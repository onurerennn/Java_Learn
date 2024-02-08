package abstract_demo_2;

public class ZiraatKatilim extends Ziraat {
	ZiraatKatilim() {
	}

	boolean isEskiMusteri;

	ZiraatKatilim(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
			boolean isMaasMusterisi, boolean isKrediKarti,boolean isEskiMusteri) {

		super.musteriHesapNo = musteriHesapNo;
		super.MusteriAdi = musteriAdi;
		super.HesapTipi = hesapTipi;
		super.adres = adres;
		super.iletisim = iletisim;
		super.bakiye = bakiye;
		super.isMaasmusterisi = isMaasMusterisi;
		super.isKrediKarti = isKrediKarti;
		this.isEskiMusteri=isEskiMusteri;
	}
	//diğer metotları yazmasakta olur(@overriding) çünkü bir yerde overriding yapılması yeterli

	@Override
	void paraCek() { // ozel bankalaradan ezildi
		System.out.println("ZiraatKatilim bankasından para çekildi");
	}

	@Override
	void paraYatir() {// ozel bankalaradan ezildi
		System.out.println("ZiraatKatilim bankasına para yatırılıdı");

	}

	@Override
	void krediCek() { // bankalardan ezildi
		System.out.println("ZiraatKatilim bankasından kredi çekildi");

	}

	@Override
	void birikimYap() { // bankalardan ezildi
		System.out.println("ZiraatKatilim bankasından birikim işlemi başlatıldı");
	}

	@Override
	void info() {
		System.out.println("ZiraatKatilim bankasıyla işlem gerçeklerştirildi");
	}
	void info(String mesaj) {
		System.out.println(mesaj + "ZiraatKatilim bankasıyla işlem gerçeklerştirildi");

	}

	void durumGor() {//isteğe bağlı polymorphism
		System.out.println("ZiraatKatilim bankası müşteri durumu onaylandı");
	}


}
