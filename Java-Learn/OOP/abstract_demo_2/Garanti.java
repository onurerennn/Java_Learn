package abstract_demo_2;

public class Garanti extends OzelBankalar {

	boolean isKrediKarti;

	Garanti() {

	}

	Garanti(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
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
		System.out.println("garnti bankasından para çekildi");
	}

	@Override
	void paraYatir() {// ozel bankalaaradan ezildi
		System.out.println("garanti bankasına para yatırılıdı");

	}

	@Override
	void krediCek() { // bankalardan ezildi
		System.out.println("garanti bankasından kredi çekildi");

	}

	@Override
	void birikimYap() { // bankalardan ezildi
		System.out.println("garanti bankasından birikim işlemi başlatıldı");
	}

	@Override
	void info() {
		System.out.println("garanti bankasıyla işlem gerçeklerştirildi");
	}

	void info(String mesaj) {
		System.out.println(mesaj + "garanti bankasıyla işlem gerçeklerştirildi");

	}
}
