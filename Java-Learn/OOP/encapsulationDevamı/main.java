package encapsulationDevamı;

public class main {

	public static void main(String[] args) {
		Banka m4 = new Banka();
		System.out.println("--------------------------");
		m4.setHesap_no(2300104);
		m4.setHesap_tipi("TL");
		m4.setMusteri_adi("oğuzhan kaplan");
		m4.setHesap_bakiye(50000);
		m4.Hesap_Ozet();
		System.out.println("--------------------------");
		m4.ParaYatir(5000, "TL");
		System.out.println("--------------------------");
		m4.ParaCek(500, "TL");
		System.out.println("--------------------------");
		m4.Hesap_Ozet();
	}

}
