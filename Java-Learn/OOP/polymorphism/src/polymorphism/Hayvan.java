package polymorphism;

public class Hayvan {
	private String isim;
	public int omur =20;
	Hayvan(String isim) {
		setIsim(isim);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	public void seslendir() {
		System.out.println(getIsim()+" tanimlanamiyan ses cikariyor");
	}

}
