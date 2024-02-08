package abstract_demo_2;

public abstract class Bankalar {

	int musteriHesapNo;
	String MusteriAdi;
	String HesapTipi;
	String adres;
	String iletisim;
	double bakiye;

	Bankalar() {

	}

	Bankalar(int musteriHesapNo,String musteriAdi,String hesapTipi,String adres,String iletisim,double bakiye) {
		this.musteriHesapNo=musteriHesapNo;
		this.MusteriAdi=musteriAdi;
		this.HesapTipi=hesapTipi;
		this.adres=adres;
		this.iletisim=iletisim;
		this.bakiye=bakiye;
	
		
	}
	abstract void krediCek();
	abstract void birikimYap();
	abstract void info();
	abstract void info(String mesaj);//overloading
	
}
