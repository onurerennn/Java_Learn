package encapsulationDevamı;

public class Banka {
	private int hesap_no;
	private String Hesap_tipi;
	private String musteri_adi;
	private double hesap_bakiye;

//GET VE SET fonkksiyonlarını kullanarak encapsulation yapısını tamamlanmaktadır
	// get getir al demek karmaşıklık çıkmasın diye kullanıyoz
	// set ayarla kur
	public void BilgileriDoldur() {// private olan nesnelere erişeceğiz
		// public fonk içine private fonk yazark eriştik
		hesap_no = 2300102;
		Hesap_tipi = "dolar";
		musteri_adi = "Merve Kaplan";
		hesap_bakiye = 12500;
	}

	public int getHesap_no() { // anahtar kelimesi
		return hesap_no; // burdaki hesap_no global değişken yani üsttteki
	}

	public void setHesap_no(int hesap_no) {
		this.hesap_no = hesap_no; // baştaki hesap_no ile parametredeki hesap_no aynı anlamda
									// global değişkene değer aktarımı
	}

	public String getHesap_tipi() {
		return Hesap_tipi;
	}

	public void setHesap_tipi(String hesap_tipi) {
		Hesap_tipi = hesap_tipi;
	}

	public String getMusteri_adi() {
		return musteri_adi;
	}

	public void setMusteri_adi(String musteri_adi) {
		this.musteri_adi = musteri_adi;
	}

	public double getHesap_bakiye() {
		return hesap_bakiye;
	}

	public void setHesap_bakiye(double hesap_bakiye) {
		this.hesap_bakiye = hesap_bakiye;
	}

	public void BilgileriDisaridanDoldur(int hesap_no, String Hesap_tipi, String musteri_adi, double hesap_bakiye) { // farklı
																														// bir
																														// yol
		this.hesap_no = hesap_no; // private değerlere değer atatdık
		this.Hesap_tipi = Hesap_tipi;
		this.musteri_adi = musteri_adi;
		this.hesap_bakiye = hesap_bakiye;
	}

	public void ParaCek(double tutar, String doviz_tipi) { // değişkenlerin yaşam ömrü parantezin içinde başar ve
															// sonunda biter
		System.out.println("para çekme işlemi gerçeklerştiriliyor");
		System.out.println("-----------------------");
		double onceki_hesap = hesap_bakiye;
		if (ParaCekKontrolOnay(tutar, doviz_tipi)) {// defauşt dğeri true
			hesap_bakiye = hesap_bakiye - tutar;
			Islem_Yazdir("para çekme işlemi gerçekleştirildi", hesap_no, Hesap_tipi, musteri_adi, hesap_bakiye, tutar,
					onceki_hesap);
		} else {
			System.out.println("HATA:bakiye yetersiz veya döviz tipi uyumsuz");
		}

	}

	private boolean ParaCekKontrolOnay(double tutar, String doviz_tipi) {// paraCek olan değişkenlerden farklı
		boolean onay = false;
		if (tutar < hesap_bakiye && doviz_tipi.equals(Hesap_tipi)) {
			onay = true;
		}

		return onay;
	}

	public void ParaYatir(double tutar, String doviz_tipi) {
		System.out.println("para yatırma işlemi gerçeklerştiriliyor");
		System.out.println("-----------------------");
		double onceki_hesap = hesap_bakiye;
		if (ParaYatırKontrolOnay(doviz_tipi)) {
			hesap_bakiye = hesap_bakiye + tutar;
			Islem_Yazdir("para yatırma işlemi gerçekleştirildi", hesap_no, Hesap_tipi, musteri_adi, hesap_bakiye, tutar,
					onceki_hesap);
		} else {
			System.out.println("HATA:para yatırma işlemi için hesap tipi uygun değil.");
		}
	}

	private boolean ParaYatırKontrolOnay(String doviz_tipi) { // private oaln bir yapıya sadece o sınıf erişebilir
		boolean onay = false;
		if (doviz_tipi.equals(getHesap_tipi())) {
			onay = true;
		}

		return onay;
	}

	private void Islem_Yazdir(String mesaj, int hesap_no, String Hesap_tipi, String musteri_adi, double hesap_bakiye, // get
																														// gelecek
			double tutar, double onceki_hesap) {
		System.out.println("işlem özeti:" + mesaj);
		System.out.println("hesap no " + hesap_no);
		System.out.println("Hesap tipi " + Hesap_tipi);
		System.out.println("musteri bilgileri " + musteri_adi);
		System.out.println("önceki bakiye bilgisi " + onceki_hesap + " " + Hesap_tipi);
		System.out.println("işlem tutarı " + tutar + " " + Hesap_tipi);
		System.out.println("hesap bakiye bilgisi " + " " + hesap_bakiye);

	}

	public void Hesap_Ozet() {
		System.out.println("işlem özeti:");
		System.out.println("hesap no " + getHesap_no());
		System.out.println("Hesap tipi " + getHesap_tipi());
		System.out.println("musteri bilgileri " + getMusteri_adi());

		System.out.println("hesap bakiye bilgisi " + getHesap_bakiye() + " " + getHesap_tipi());

	}
}
