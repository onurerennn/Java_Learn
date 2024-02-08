package constructor;

//yapıcı-kurucu metotlar
// sınıf ismi ile aynı isme sahip olamk zorunda
//sınıfın nesnesi oluşturulduğu zaman ilk çalıştırılacak fonksiyondur
//yapıcı metodun geri dönüş tipi olmaz(void,return)
//parametre alan ve almıyan şekilde oluşturulabilir
//aşırı yüklenebilir(farklı sayıda parametre veya farklı tipte parametre)
public class Constructor {
	private String ogrenci_ad;
	private double ogrenci_no;
	private int devamsizlik_sayisi;
	private boolean ceza;

	Constructor() {
		/*ogrenci_ad = "barış öztunç";   //eğer buraları yazmasak bilgi_yaz fonk default değerleri alarak çalışır
		ogrenci_no = 2300101;
		devamsizlik_sayisi = 0;
		ceza = false;*/

	}

	public void Bilgi_yaz() {

		System.out.println("öğrenci adı " + ogrenci_ad);
		System.out.println("öğrenci no " + ogrenci_no);
		System.out.println("öğrenci devamsızlık sayısı " + devamsizlik_sayisi);
		System.out.println("öğrenci ceza durumu " + ceza);
	}

}
