package Interface_demo_2;

public class Tekniker extends Personel implements IMuhasebe{

	Tekniker(){
		
		
	}
	Tekniker(String ad, double maas) {
		super(ad, maas);
	}
	public int cocukSayisi;
	@Override
	public void maasHesapla() {
		double maasHesapla;
		cocukSayisi=cocukSayisi(cocukSayisi);
		if (medeniHali(true)) {
			maasHesapla=super.maas+esYardimi+cocukSayisi*cocukYardimi+3000;
		System.out.println("Tekniker maaşı = "+maasHesapla);
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
		System.out.println("Tekniker maaş bilgileri yazdırılıyor");
	}

}
