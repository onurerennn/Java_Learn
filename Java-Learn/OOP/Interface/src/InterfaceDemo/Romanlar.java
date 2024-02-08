package InterfaceDemo;

public class Romanlar extends Kitaplar implements IBaskiAl,ISeslendir,IEKitapOlustur{

	@Override
	public void EKitapOlustur() {
		System.out.println("roman kitapları E-Kitap olarak oluşturulabilir");

	}

	@Override
	public void seslendir() {
		System.out.println("roman kitapları seslendirilebilir");
		
	}

	@Override
	public void BaskiAl() {
		System.out.println("roman kitapları baskı alınabilir");
		
	}

	@Override
	public void kitapSec() {
		// TODO Auto-generated method stub
		
	}

}
