package abstract_demo_2;

public class YapiKredi extends OzelBankalar {


	boolean isKrediKarti;

	YapiKredi() {

	}
	YapiKredi(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
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
	void paraCek() { //ozel bankalaradan ezildi
		System.out.println("yapı kredi bankasından para çekildi");
	}

	@Override
	void paraYatir() {//ozel bankalaradan ezildi
		System.out.println("yapı kredi bankasına para yatırılıdı");

	}

	@Override
	void krediCek() { //bankalardan ezildi
		System.out.println("yapı kredi bankasından kredi çekildi");

	}

	@Override
	void birikimYap() { //bankalardan ezildi
		System.out.println("yapı kredi bankasından birikim işlemi başlatıldı");
	}

	@Override
	void info() {//bankalardan ezildi
		System.out.println("yapı kredi bankasıyla işlem gerçeklerştirildi");
	}
	void info(String mesaj) {
		System.out.println(mesaj + "yapı kredi bankasıyla işlem gerçeklerştirildi");

	}
}
