package Interface_Demo_3;

public abstract class Calisanlar {

	public String isimSoyisim;
	public String unvan;
	public String pozisyon;
	public String birimi;
	public int tecrubeYili;
	public double maas;

	Calisanlar() {

	}

	Calisanlar(String isimSoyisim, String unvan, String pozisyon, String birimi, int tecrubeYili, double maas) {
		this.isimSoyisim = isimSoyisim;
		this.birimi = birimi;
		this.maas = maas;
		this.pozisyon = pozisyon;
		this.tecrubeYili = tecrubeYili;
		this.unvan = unvan;

	}

	public abstract void zamYap();

	public abstract void zamYap(double nettutar);

	public abstract void terfiYap();

	public abstract void terfiYap(String unvan);

	public abstract void maasHesapla();

}
