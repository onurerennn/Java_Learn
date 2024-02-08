package abstract_demo_2;

public class Vakifbank extends DevletBankalari {
	Vakifbank() {
	}

	boolean isKrediKarti;

	Vakifbank(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
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
	void paraCek() { // devlet bankalaradan ezildi
		System.out.println("Vakifbank bankasından para çekildi");
	}

	@Override
	void paraYatir() {// devlet bankalaradan ezildi
		System.out.println("Vakifbank bankasına para yatırılıdı");

	}

	@Override
	void krediCek() { // bankalardan ezildi
		System.out.println("Vakifbank bankasından kredi çekildi");

	}

	@Override
	void birikimYap() { // bankalardan ezildi
		System.out.println("Vakifbank bankasından birikim işlemi başlatıldı");
	}

	@Override
	void info() {
		System.out.println("Vakifbank bankasıyla işlem gerçeklerştirildi");
	}
	void info(String mesaj) {
		System.out.println(mesaj + "Vakifbank bankasıyla işlem gerçeklerştirildi");

	}

}
