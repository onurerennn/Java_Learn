package Inheritancedemo;

public class GenelMudurluk extends Calisanlar {
	double ekOdenek;

	GenelMudurluk(String isim, String soyisim, double ekOdenek) { // ilk 2 parametreyi base classın constructorında var
		super(isim, soyisim);
		this.ekOdenek = ekOdenek; // yazılamsada olur
		super.ekUcret = ekOdenek; // base class daki ekucrete ekodeneği atadık

	}

}
