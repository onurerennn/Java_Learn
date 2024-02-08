
public class Kopek extends Hayvan{

	Kopek(String ad, String tur) {
		super(ad, tur);
	
	}

	@Override
	public void yasar() { //hayvan sınıfında olmamasına rağmen kopek sınıfında da zorunlu overridin yaptık
		//çünkü IYasar interface'sini hayvan sınıfına implement etiik
	System.out.println("köpek yaşıyor");
		
	}

	@Override
	public boolean isSolunum() {
		
		return false;
	}

}
