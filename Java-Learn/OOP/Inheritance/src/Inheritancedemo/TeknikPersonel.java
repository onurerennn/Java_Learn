package Inheritancedemo;

public class TeknikPersonel extends IsciSinifi {
	double gorevlendirmeUcreti;

	TeknikPersonel(String isim, String soyisim, int mesai, double gorevlendirmeUcrei) {
		super(isim, soyisim, mesai);
		this.gorevlendirmeUcreti = gorevlendirmeUcrei;
		super.ekUcret = gorevlendirmeUcretiHesapla(mesai, gorevlendirmeUcrei);
	}

	double gorevlendirmeUcretiHesapla(int mesai, double gorevlendirmeUcreti) {
		return ((mesai * 100) + gorevlendirmeUcreti);
	}
}
