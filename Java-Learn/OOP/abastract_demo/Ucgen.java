package abastract_demo;

public  class Ucgen extends Sekiller {

	int kenar1,kenar2,kenar3;
	
	public void Ciz() {//overriding 
		System.out.println("-----------------------");
		System.out.println("üçgen çizdiriliyor");
	}

	public void Sil() {
		System.out.println("-----------------------");
		System.out.println("üçgen kaldırıldı");
	}

	public void Zoom() {
		System.out.println("-----------------------");
		System.out.println("üçgen yakınlaştırılıyor");
	}
}
