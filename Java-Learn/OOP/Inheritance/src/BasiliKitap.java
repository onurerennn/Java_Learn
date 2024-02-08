
public class BasiliKitap extends Kitaplar {

	// türetilmiş sınıf , child sınıf , derived sınıf
	public String ciltKapak;
	public String kagıtCinsi = "A5";

	BasiliKitap(String kitap_adi, String Isbn, String Yazar, String ciltkapak) {
		super(kitap_adi, Isbn, Yazar); // super base classa parametre aktarmak
		this.ciltKapak = ciltkapak;
		// System.out.println("bu bir basılı kitaptır"+kagıtCinsi); böyle yazarsak en
		// son olan A5 yazar (super kullanımı)
		System.out.println("bu bir basılı kitaptır " + super.kagıtCinsi + super.Cevir()); // aynı değişken varsa base
																							// classtan alır
																							// metotlar içinde geçerli
																							// (1) çevirdi
		// System.out.println("bu bir basılı kitaptır"+this.kagıtCinsi); böyle yazarsak
		// en son olan A5 yazar
	}

	public int Cevir() {
		return 0;
	}

}
