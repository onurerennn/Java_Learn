package polymorphism;

public class Kopek  extends Hayvan{
	public int omur =10;
	public Kopek(String isim) {
		super(isim);
	}
	
	//@override
	public void seslendir() { 
		System.out.println(getIsim()+" kopegi hav sesi cikariyor");
	}
}
