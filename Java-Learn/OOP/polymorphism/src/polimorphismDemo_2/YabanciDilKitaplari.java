package polimorphismDemo_2;

public class YabanciDilKitaplari extends Kitaplar {
	boolean isExercise;
	double fiyat;

	YabanciDilKitaplari() {

	}

	void fiyatArtisiUygula() {
		double son_fiyat = fiyatHesapla() + fiyat * 0.20;
		this.fiyat = son_fiyat;
	}

	void fiyatIndirimUygula() {
		double son_fiyat = fiyatHesapla() - fiyat * 0.15;
		this.fiyat = son_fiyat;
	}

}
