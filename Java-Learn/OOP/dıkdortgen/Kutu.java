package dıkdortgen;

public class Kutu {
	private int en;
	private int boy;
	private int yukseklık;

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public int getYukseklık() {
		return yukseklık;
	}

	public void setYukseklık(int yukseklık) {
		this.yukseklık = yukseklık;
	}

	public int hacim() {

		int hacim = en * boy * yukseklık;
		return hacim;
	}

}
