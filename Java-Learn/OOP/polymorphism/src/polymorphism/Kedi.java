package polymorphism;

public class Kedi extends Hayvan {
	public int omur =5;
	public Kedi(String isim) {
		super(isim);
	}
	
	//@override
	public void seslendir() {
		System.out.println(getIsim()+" kedisi miyav sesi cikariyor");
	}
	public void seslendir(String ozelIsmı) {
		System.out.println(getIsim()+ozelIsmı+" kedisi miyavmiyav sesi cikariyor");
	}
}
