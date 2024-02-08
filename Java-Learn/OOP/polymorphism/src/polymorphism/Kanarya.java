package polymorphism;

public class Kanarya extends Kus {

	public Kanarya(String isim) {
		super(isim);
	}
	public int omur = 15;	
	public void seslendir() {
		System.out.println(getIsim()+"kanarya kusu ciiiiiiik sesi cikariyor");
	} //eğer burdaki seslendir fonk olmasaydı bi ust sınıfı olan kus sınıfındakı seslendiri çalışacaktı 
	//kus sınıfındada olmazsa Hayvan sınıfındakıne gidecek
	

}
