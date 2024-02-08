package Interface_demo_2;
//Interface_demo_2_UML  proje ile uymuyo
public class main {

	public static void main(String[] args) {

		Yonetici p1 = new Yonetici();
		p1.cocukSayisi=5;
		p1.medeniHali(true);
		p1.bilgiYaz();
		System.out.println("çocuk sayısı "+p1.cocukSayisi(p1.cocukSayisi));
		p1.maasHesapla();
		System.out.println("---------------------------------");
		Muhendis p2 = new Muhendis();
		p2.cocukSayisi=5;
		p2.medeniHali(true);
		p2.bilgiYaz();
		System.out.println("çocuk sayısı "+p2.cocukSayisi(p2.cocukSayisi));
		p2.maasHesapla();
		
		
		
	}

}
