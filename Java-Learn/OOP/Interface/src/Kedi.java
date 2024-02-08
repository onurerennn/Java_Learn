
public class Kedi extends Hayvan implements IYasar,IBeslenir, IOlur { //çoklu kalıtım

	Kedi(String ad, String tur) {
		super(ad, tur);
	}

	@Override
	public boolean isSolunum() {

		return true;
	}

	@Override // interfacedekini zorunlu polymorphism yaptık
	public void yasar() {
System.out.println("kedi yaşıyor");
	}

	@Override // interfacedekini zorunlu polymorphism yaptık
	public void besle() {
		System.out.println("kedi besleniyor");
		
	}

	@Override
	public void olsun(String mesaj) {
		System.out.println("kedi öldü");
		
	}

}
