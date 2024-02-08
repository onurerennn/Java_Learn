package Interface_Demo_3;

public class Mobil extends YazilimEkibi {

	Mobil() {

	}

	Mobil(String isimSoyisim, String unvan, String pozisyon, String birimi, int tecrubeYili, double maas,
			String yetenek) {
		super(isimSoyisim, unvan, pozisyon, birimi, tecrubeYili, maas, yetenek);

	}

	@Override
	public void calis() {// yazilimEkibi
		System.out.println("mobil ekibi çalışır");
	}

	@Override
	public void ogren() {// yazilimEkibi
		System.out.println("mobil ekibi öğrenmeye açıktır");
	}

	@Override
	public void uygula() {// yazilimEkibi
		System.out.println("mobil ekibi uygular");
	}

	@Override
	public void zamYap() {// Calisanlar

	System.out.println(	maas = maas * 3);

	}

	@Override
	public void zamYap(double nettutar) {// Calisanlar

		this.maas=maas+nettutar;
		System.out.println(this.maas);
	}

	@Override
	public void terfiYap() {// Calisanlar

		System.out.println("mobil ekibinde terfi yapıldı");
	}

	@Override
	public void terfiYap(String unvan) {// Calisanlar
		System.out.println("mobil ekibinde "+unvan+" unvanına terfi yapıldı");

	}

	@Override
	public void maasHesapla() {// Calisanlar

		System.out.println("maaş = "+maas);
	}

	@Override
	public void isC() {
		System.out.println("mobil ekibi c bilir");
	}

}
