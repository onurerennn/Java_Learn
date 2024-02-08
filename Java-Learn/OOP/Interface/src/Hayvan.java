
public abstract class Hayvan implements IYasar { 
	public String ad;
	public String tur;
	Hayvan(String ad,String tur){
		this.ad=ad;
		this.tur=tur;
	}
	
	public abstract boolean isSolunum();
	
	public  boolean isCanli() {
		return true;
	}
	public void yasHesapla() {
		
		
	}

}
