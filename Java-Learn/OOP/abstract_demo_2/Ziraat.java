package abstract_demo_2;

public class Ziraat extends DevletBankalari {
	Ziraat() {
	}

	boolean isKrediKarti;

	Ziraat(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
			boolean isMaasMusterisi, boolean isKrediKarti) {

		super.musteriHesapNo = musteriHesapNo;
		super.MusteriAdi = musteriAdi;
		super.HesapTipi = hesapTipi;
		super.adres = adres;
		super.iletisim = iletisim;
		super.bakiye = bakiye;
		super.isMaasmusterisi = isMaasMusterisi;
		this.isKrediKarti = isKrediKarti;
	}

	@Override
	void paraCek() { // ozel bankalaradan ezildi
		System.out.println("Ziraat bankasından para çekildi");
	}

	@Override
	void paraYatir() {// ozel bankalaradan ezildi
		System.out.println("Ziraat bankasına para yatırılıdı");

	}

	@Override
	void krediCek() { // bankalardan ezildi
		System.out.println("Ziraat bankasından kredi çekildi");

	}

	@Override
	void birikimYap() { // bankalardan ezildi
		System.out.println("Ziraat bankasından birikim işlemi başlatıldı");
	}

	@Override
	void info() {
		System.out.println("Ziraat bankasıyla işlem gerçeklerştirildi");
	}
	void info(String mesaj) {
		System.out.println(mesaj + "ziraat bankasıyla işlem gerçeklerştirildi");

	}

	void durumGor() {// overriding yok
		System.out.println("Ziraat bankası müşteri durumu onaylandı");
	}

}
