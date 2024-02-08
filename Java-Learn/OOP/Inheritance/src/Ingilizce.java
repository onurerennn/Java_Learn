
public class Ingilizce extends BasiliKitap {// multiLevelInheritance
	public boolean isexecise;

	Ingilizce(String kitap_adi, String Isbn, String Yazar, String ciltkapak, boolean İsexercise) {
		super(kitap_adi, Isbn, Yazar, ciltkapak);
		this.isexecise = isexecise;
		System.out.println("ingilizce kitabı oluşturuldu");

	}

}
