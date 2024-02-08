package abstract_demo_2;

public class HalkBank extends DevletBankalari {
	HalkBank() {
	}

	boolean isKrediKarti;

	HalkBank(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
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
	void paraCek() { // ozel bankalardan ezildi
		System.out.println("HalkBank bankasından para çekildi");
	}

	@Override
	void paraYatir() {// ozel bankalardan ezildi
		System.out.println("HalkBank bankasına para yatırılıdı");

	}

	@Override
	void krediCek() { // bankalardan ezildi
		System.out.println("HalkBank bankasından kredi çekildi");

	}

	@Override
	void birikimYap() { // bankalardan ezildi
		System.out.println("HalkBank bankasından birikim işlemi başlatıldı");
	}

	@Override
	void info() {
		System.out.println("HalkBank bankasıyla işlem gerçeklerştirildi");
	}
	void info(String mesaj) {
		System.out.println(mesaj + "HalkBank bankasıyla işlem gerçeklerştirildi");

	}

}
