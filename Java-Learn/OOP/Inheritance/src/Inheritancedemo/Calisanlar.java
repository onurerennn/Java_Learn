package Inheritancedemo;

public class Calisanlar {
	public String isim;
	public String soyisim;
	public String departman;
	public int yillikIzinSayisi = 20;
	public double maas = 5000;
	public double ekUcret ;

	public Calisanlar(String isim, String soyisim) {
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public double maasHesapla() {
		double toplamMaas = maas+ekUcret+yillikIzinSayisi*100;
		return toplamMaas;
	}

	public void bilgileriYazdir() {
		System.out.println("-------------------------------");
		System.out.println("isim: " + isim);
		System.out.println("soyisim: " + soyisim);
		System.out.println("departman: " + departman);
		System.out.println("yıllık izin sayısı: " + yillikIzinSayisi);
		System.out.println("toplam maaş: " + maasHesapla());
		System.out.println("------------------------");
	}

}
