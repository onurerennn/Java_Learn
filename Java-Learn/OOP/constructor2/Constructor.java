package constructor2;

public class Constructor {
	private String ogrenci_ad;
	private double ogrenci_no;
	private int devamsizlik_sayisi;
	private boolean ceza;

	Constructor() {
		ogrenci_ad = "barış öztunç";   //eğer buraları yazmasak bilgi_yaz fonk default değerleri alarak çalışır
		ogrenci_no = 2300101;
		devamsizlik_sayisi = 0;
		ceza = false;

	}
	//overloading
	Constructor(String ogrenci_ad,int ogrenci_no){
		this.ogrenci_ad=ogrenci_ad;
		this.ogrenci_no=ogrenci_no;
		/*devamsizlik_sayisi = 0; 
		ceza = false;*/           //default  değeri alırlar
		
	}
	
		
	
	

	public void Bilgi_yaz() {

		System.out.println("öğrenci adı " + ogrenci_ad);
		System.out.println("öğrenci no " + ogrenci_no);
		System.out.println("öğrenci devamsızlık sayısı " + devamsizlik_sayisi);
		System.out.println("öğrenci ceza durumu " + ceza);
	}
}
