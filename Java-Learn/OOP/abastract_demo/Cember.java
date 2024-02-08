package abastract_demo;

//abstarct metotların gövdesi olmadığı için alt sınıflarda overriding yapılacak
public  class Cember extends Sekiller {
	public double yaricap;
	Cember(){
		info();
	}
	void info() {
		System.out.println("çemberinin yarıçapı :"+yaricap);
		System.out.println("dikdörtgeninin rengi :"+getRenk());

	}
	
	public void Ciz() {// overriding
		System.out.println("-----------------------");
		System.out.println("çember çizdiriliyor");
	}

	public void Sil() {
		System.out.println("-----------------------");
		System.out.println("çember kaldırıldı");
	}

	public void Zoom() {
		System.out.println("-----------------------");
		System.out.println("çember yakınlaştırılıyor");
	}

}
