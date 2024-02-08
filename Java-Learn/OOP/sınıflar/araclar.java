package sınıflar;

public class araclar {
	//araba sınıfı(marka, model_yılı, rengi, modeli) özellikleri
	public String marka;
	public int model_yili;
	public String renk ;
	public String model;

	public void Ozellik_yazdir(String mesaj) { //fonk yaptık
		System.out.println(mesaj);
		System.out.println("araç markası "+marka);
		System.out.println("araç modeli "+model);
		System.out.println("araç modeli "+model_yili);
		System.out.println("aracın rengi "+renk);
	}
}
