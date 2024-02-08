package InterfaceDemo;

public class CocukKitaplari  extends Kitaplar implements IBaskiAl,ISeslendir{

	@Override
	public void seslendir() {
		System.out.println("çocuk kitapları seslendirilebilir");
		
	}

	@Override
	public void BaskiAl() {
		System.out.println("çocuk kitapları baskı alınabilir");
		
	}

	@Override
	public void kitapSec() {
		
	}

	
}
