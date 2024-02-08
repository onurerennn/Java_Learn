package polymorphism;

public class Kus extends Hayvan {
	public Kus(String isim) {
		super(isim);
	}
	public int omur =25;
	//@override
	public void seslendir() {
		System.out.println(getIsim()+" kusu cik sesi cikariyor");
	}
}
