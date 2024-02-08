package BKI;

public class BKI {

	private int yas;
	private String isim;
	private double agirlik;
	private double boy;

	public BKI(String isim, int yas, double agirlik, double boy) {
		this.isim = isim;
		this.yas = yas;
		this.agirlik = agirlik;
		this.boy = boy;
	}

	public BKI(String isim, double agirlik, double boy) {
		this.isim = isim;
		this.agirlik = agirlik;
		this.boy = boy;
	}

	public double getBKI() {

		double bki = agirlik / (boy * boy);
		
		return bki;
	}

	public String getDurum() {
		double bki = getBKI();
		if (bki < 18.5) {
			return "zayıf";
		} else if (bki < 25) {
			return "normal";
		} else if (bki < 30) {
			return "kilolu";
		} else {
			return "obez";
		}

	}

	public int getYas() {
		return yas;
	}

	public String getIsim() {
		return isim;
	}

	public double getAgirlik() {
		return agirlik;
	}

	public double getBoy() {
		return boy;
	}

}
