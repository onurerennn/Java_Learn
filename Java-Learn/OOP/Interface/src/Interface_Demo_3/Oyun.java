package Interface_Demo_3;

public class Oyun extends YazilimEkibi implements IBackend, IFrontEnd, IFullStack, IUnity {

	Oyun() {

	}

	Oyun(String isimSoyisim, String unvan, String pozisyon, String birimi, int tecrubeYili, double maas,
			String yetenek) {
		super(isimSoyisim, unvan, pozisyon, birimi, tecrubeYili, maas, yetenek);

	}

	@Override
	public void calis() {// yazilimEkibi
		System.out.println("oyun ekibi çalışır");
	}

	@Override
	public void ogren() {// yazilimEkibi
		System.out.println("oyun ekibi öğrenmeye açıktır");
	}

	@Override
	public void uygula() {// yazilimEkibi
		System.out.println("oyun ekibi uygular");
	}

	@Override
	public void zamYap() {// Calisanlar

		this.maas = maas * 5;
		System.out.println(this.maas);

	}

	@Override
	public void zamYap(double nettutar) {// Calisanlar

		maas = maas + nettutar;
	}

	@Override
	public void terfiYap() {// Calisanlar

		System.out.println("oyun ekibinde terfi yapıldı");
	}

	@Override
	public void terfiYap(String unvan) {// Calisanlar
		System.out.println("oyun ekibinde " + unvan + " unvanına terfi yapıldı");

	}

	@Override
	public void maasHesapla() {// Calisanlar

		System.out.println("oyun ekibi maaş = " + this.maas);
	}

	@Override
	public void isC() {
		System.out.println("oyun ekibi c bilir");
	}

	@Override
	public void isUnity() {
		System.out.println("oyun ekibi unity bilir ");

	}

	@Override
	public void isFullStack() {
		System.out.println("oyun ekibinde fullstack'ci vardır ");

	}

	@Override
	public void isFrontEnd() {
		System.out.println("oyun ekibinde frontend'ci vardır ");

	}

	@Override
	public void isBackEnd() {
		System.out.println("oyun ekibinde backend'ci vardır ");
	}
}
