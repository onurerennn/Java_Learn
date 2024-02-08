package polimorphismDemo_2;

public class PastelBoyamaKitaplari extends BoyamaKitaplari{

	String yasAralıgı="0-3";
	double fiyat;
	PastelBoyamaKitaplari(){
		
		
	}

	void fiyatArtisiUygula() {
		double son_fiyat = fiyatHesapla() + fiyat * 0.30;
		this.fiyat = son_fiyat;
	}

	void fiyatIndirimUygula() {
		double son_fiyat = fiyatHesapla() - fiyat * 0.08;
		this.fiyat = son_fiyat;
	}

}
