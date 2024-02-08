package abastract_demo;

public abstract class Sekiller {
	private String renk;
	public int x_koordinant;
	public int y_koordinant;

	public abstract void Ciz();

	public abstract void Sil();

	public abstract void Zoom();

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
