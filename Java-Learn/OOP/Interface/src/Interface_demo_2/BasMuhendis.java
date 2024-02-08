package Interface_demo_2;

public class BasMuhendis extends Muhendis implements IMuhasebe{

	BasMuhendis(){
		
		
	}
	BasMuhendis(String ad, double maas) {
		super(ad, maas);
	}


	public int cocukSayisi;
	@Override
	public void maasHesapla() {
		double maasHesapla;
		cocukSayisi=cocukSayisi(cocukSayisi);
		if (medeniHali(true)) {
			maasHesapla=super.maas+esYardimi+cocukSayisi*cocukYardimi+6000;
		System.out.println("BasMuhendis maaşı = "+maasHesapla);
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
		System.out.println("BasMuhendis maaş bilgileri yazdırılıyor");
	}
}
