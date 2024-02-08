
public class Surungenler extends Hayvan implements IUyur {

	Surungenler(String ad, String tur) {
		super(ad, tur);
	}

	@Override
	public boolean isSolunum() {
		return false;
	}

	@Override
	public void uyu() {
		System.out.println("sürüngenler kışın " + uykuSuresi + " ay uyur");
	}

	@Override
	public void yasar() {//hayvana ımplement ettiğimiz için
		System.out.println("sürüngenler yaşıyo");
		
	}

}
