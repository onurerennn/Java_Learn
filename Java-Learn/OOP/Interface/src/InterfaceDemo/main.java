package InterfaceDemo;

//Interface_demo_1_UML
public class main {

	public static void main(String[] args) {

		// Kitaplar k1 = new Kitaplar() hata veriir abstract sınıftan örnek alınamaz

		Kitaplar k1 = new Universite();
		k1.BaskiAl();
		System.out.println("---------------------");
		Universite k2 = new Universite();
		k2.EKitapOlustur();
		// k2.baskikalitesi="A5"; değeri değişemez
		System.out.println(k2.baskikalitesi);
		k2.EKitapOlustur();
		k2.EKitapOlustur2();
		
		/*IBaskiAl b1 = new Universite();
		b1.BaskiAl();*/ //hata vermez

	}

}
