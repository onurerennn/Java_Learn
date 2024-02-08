package sınıflar;

public class inspimo {
	// içerisinde kendisine ait ortak özellikleri ve metotları olan yapılara sınıf
	// denir
	// araba sınıfı(marka, model_yılı, rengi, modeli) sınıfın temel özellikleri
	// var olan sınıftan bir örnek üretme işlemi nesne olarak tanımlanmaktadır
	// renault, 1992, beyaz, toros araba sınıfına ait özellikler
	// toyota, 1995, siyah, corolla her bir sınıftan örnek olarak türettiğimiz yeni
	// sınıf örneği var nesne denir
	public static void main(String[] args) {
		araclar a1 = new araclar();  //araclar sınıfına eriştik a1(nesne) bir örnek
		a1.marka = "renault";
		a1.model = "toros";
		a1.model_yili = 1992;
		a1.renk = "beyaz";
		a1.Ozellik_yazdir("birinci araç");
		araclar a2 = new araclar();
		a2.marka = "toyota";
		a2.model = "corolla";
		a2.model_yili = 1995;
		a2.renk = "siyah";
		a2.Ozellik_yazdir("ikinci arac");
		
	}

}
