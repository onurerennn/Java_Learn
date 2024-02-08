package Inheritancedemo;

public class IsciSinifi extends Calisanlar {
	int mesai;

	IsciSinifi(String isim, String soyisim, int mesai) {
		super(isim, soyisim);
		this.mesai = mesai;
		super.ekUcret = mesaiUcretiHesapla(mesai);
	}

	double mesaiUcretiHesapla(int mesai) {
		return mesai * 100;
	}

}
