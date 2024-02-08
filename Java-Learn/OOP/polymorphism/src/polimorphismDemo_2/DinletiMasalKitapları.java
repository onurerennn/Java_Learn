package polimorphismDemo_2;

public class DinletiMasalKitapları extends MasalKitaplari{

	String yasAralıgı;
	double fiyat;
	DinletiMasalKitapları(){
		
		
	}

	void fiyatArtisiUygula() {
		double son_fiyat = fiyatHesapla() + fiyat * 0.40;
		this.fiyat = son_fiyat;
	}

	void fiyatIndirimUygula() {
		double son_fiyat = fiyatHesapla() - fiyat * 0.08;
		this.fiyat = son_fiyat;
	}

}
