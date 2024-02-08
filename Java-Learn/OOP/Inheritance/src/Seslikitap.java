
public class Seslikitap extends Kitaplar{
	public String seslendiren;
	Seslikitap(String kitap_adi, String Isbn, String Yazar,String seslendiren){
		super(kitap_adi, Isbn, Yazar);
		this.seslendiren=seslendiren;
		System.out.println("bu bir sesli kitaptır");//constructor
	}
}
