
public class EKitap extends Kitaplar {
	public boolean isOriginal;

	EKitap(String kitap_adi, String Isbn, String Yazar, boolean isOrignal) {// miras aldığımız sınftan dolayı geldi
																			// türetilen sınıf ana sınıfın şartlarını
																			// almak zorunda
		super(kitap_adi, Isbn, Yazar);// super classa aktardık
										// super anahtar kelimesi ile ana sınıfa götürecek
		this.isOriginal = isOrignal;

		System.out.println("bu bir Elektronik kitaptır");// constructor

	}
}
