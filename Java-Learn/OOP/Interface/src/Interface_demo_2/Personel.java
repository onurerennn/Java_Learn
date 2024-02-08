package Interface_demo_2;

public abstract class Personel implements IMuhasebe {
	public static final String sirketAdi = "İNSPİMO";
	public static final String sirketAdresi = "elazığ";
	public String ad;
	public String tc;
	public String iletisim;
	public String personelNo;
	public String isBaslamaTarihi;
	public String sigortaNo;
	public double maas = 10000;

	Personel() {

	}

	Personel(String ad, double maas) {
		this.ad = ad;
		this.maas = maas;

	}
	public abstract void bilgiYaz();

}
