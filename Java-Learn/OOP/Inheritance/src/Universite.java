
public class Universite extends BasiliKitap {// multiLevelInheritance
	public String cevirmen;

	Universite(String kitap_adi, String Isbn, String Yazar, String ciltKapak,String cevirmen) {
		super(kitap_adi, Isbn, Yazar, ciltKapak);//tek ciltKapak basilidan geldi diğerleri kitaplardan geldi
		this.cevirmen=cevirmen;

		System.out.println("üniversite kıtabı oluşturuldu");
	}

}
