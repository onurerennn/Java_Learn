package Interface_demo_2;

public class Muhendis extends Personel implements IMuhasebe {

	Muhendis() {

	}

	Muhendis(String ad, double maas) {
		super(ad, maas);
	}

	public int cocukSayisi;
	@Override
	public void maasHesapla() {
		double maasHesapla;
		cocukSayisi=cocukSayisi(cocukSayisi);
		if (medeniHali(true)) {
			maasHesapla=super.maas+esYardimi+cocukSayisi*cocukYardimi+5000;
		System.out.println("mühendis maaşı = "+maasHesapla);
		}
		else {
			System.out.println("maaş : "+super.maas+5000);
		}
	}

	@Override
	public boolean medeniHali(boolean medeniHali) {
		return medeniHali;
	}

	@Override
	public int cocukSayisi(int cocukSayisi) {
		return cocukSayisi;
	}

	@Override
	public void bilgiYaz() {
		System.out.println("mühendis maaş bilgileri yazdırılıyor");
	}

}
