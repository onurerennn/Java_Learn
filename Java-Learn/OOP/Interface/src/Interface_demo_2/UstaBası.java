package Interface_demo_2;

public class UstaBası extends  Personel implements IMuhasebe{

	UstaBası(){
		
		
	}
	UstaBası(String ad, double maas) {
		super(ad, maas);
	}

	public int cocukSayisi;
	@Override
	public void maasHesapla() {
		double maasHesapla;
		cocukSayisi=cocukSayisi(cocukSayisi);
		if (medeniHali(true)) {
			maasHesapla=super.maas+esYardimi+cocukSayisi*cocukYardimi+2500;
		System.out.println("UstaBası maaşı = "+maasHesapla);
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
		System.out.println("UstaBası maaş bilgileri yazdırılıyor");
	}
}
