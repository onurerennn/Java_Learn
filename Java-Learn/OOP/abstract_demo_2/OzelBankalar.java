package abstract_demo_2;

public abstract class OzelBankalar extends Bankalar {

	boolean isMaasmusterisi;

	OzelBankalar() {

	}

	OzelBankalar(int musteriHesapNo, String musteriAdi, String hesapTipi, String adres, String iletisim, double bakiye,
			boolean isMaasMusterisi) {
		
		super.musteriHesapNo=musteriHesapNo;
		super.MusteriAdi=musteriAdi;
		super.HesapTipi=hesapTipi;
		super.adres=adres;
		super.iletisim=iletisim;
		super.bakiye=bakiye;
		this.isMaasmusterisi=isMaasMusterisi;
	}

	abstract void paraCek();
	abstract void paraYatir();

	
	
}

