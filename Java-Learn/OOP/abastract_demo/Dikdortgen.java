package abastract_demo;

public  class Dikdortgen extends Sekiller {

	public int k_kenar,u_kenar;
	Dikdortgen(){
		info();
	}
	void info() {
		System.out.println("dikdörtgeninin kısa kenarı :"+k_kenar);
		System.out.println("dikdörtgeninin uzun kenarı :"+u_kenar);
		System.out.println("dikdörtgeninin rengi :"+getRenk());

	}
	
	public void Ciz() {//overriding 
		System.out.println("-----------------------");
		System.out.println("dikdörtgen çizdiriliyor");
	}

	public void Sil() {
		System.out.println("-----------------------");
		System.out.println("dikdörtgen kaldırıldı");
	}

	public void Zoom() {
		System.out.println("-----------------------");
		System.out.println("dikdörtgen yakınlaştırılıyor");
	}
}
