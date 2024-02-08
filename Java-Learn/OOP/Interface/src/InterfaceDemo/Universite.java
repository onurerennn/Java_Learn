package InterfaceDemo;

public class Universite extends Kitaplar implements IBaskiAl,IEKitapOlustur {

	@Override
	public void EKitapOlustur() {
		System.out.println("üniversite kitapları E-Kitap olarak oluşturulabilir");
	}

	@Override
	public void BaskiAl() {
		System.out.println("üniversite kitapları baskı alınabilir");
	}

	@Override
	public void kitapSec() { //abstract 
		
	}

	
	
}
