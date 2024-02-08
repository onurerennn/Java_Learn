package Interface_Demo_3;

public abstract class SistemEkibi extends Calisanlar {

	public String alani;

	SistemEkibi() {

	}

	SistemEkibi(String isimSoyisim, String unvan, String pozisyon, String birimi, int tecrubeYili, double maas,
			String alani) {
		super(isimSoyisim, unvan, pozisyon, birimi, tecrubeYili, maas);
		this.alani = alani;

	}

	public abstract void arastir();

	public abstract void bul();

	public abstract void coz();

}
