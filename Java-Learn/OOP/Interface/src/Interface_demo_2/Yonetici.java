package Interface_demo_2;

public class Yonetici extends Personel implements IMuhasebe {
	public int cocukSayisi;

	@Override
	public void maasHesapla() {
		double maasHesapla;
		cocukSayisi = cocukSayisi(cocukSayisi);
		if (medeniHali(true)) {
			maasHesapla = super.maas + esYardimi + cocukSayisi * cocukYardimi + 10000;
			System.out.println("yönetici maaşı = " + maasHesapla);
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
		System.out.println("yönetici maaş bilgileri yazdırılıyor");
	}

}
