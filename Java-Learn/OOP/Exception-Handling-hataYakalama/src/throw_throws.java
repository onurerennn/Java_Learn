import java.io.IOException;

public class throw_throws {
//kendi hatalarımızı oluşturacağız
	public static void main(String[] args)  throws IOException {  //throws IOException //bir tane metot hata fırlatıyor dikkat et

		vergiHesapla(100, 5);  //hata vermez
		System.out.println("---------------");
		//ekrana hiçbirşey yazmaz	
	/*	
	 try {
			vergiHesapla(100, 2);//hata fırlatır
		} catch (ArithmeticException e) {
			e.getMessage();//ekrana kırmızı uyarıyı verme
		}   
		*/
		//ekrana hiçbirşey yazmaz	
		
		/*
		//1.ihtimal
		
		System.out.println("program başlatıldı");
		yasHesapla(17); //sadece böyle kırmızı ekran veriri  o zmn throw ve throws tek başına yeterli olmadı
		//başa throws IOException bununla beraber  hertürlü hata mesajı geliyordu
		System.out.println("program tamamlanmadı");
		*/
		
		System.out.println("program başlatıldı");
		try {
			yasHesapla(17);
		} catch (IOException e) {		//try-catch kullanacağız
			System.out.println(e.toString());
		
		}
		System.out.println("program tamamlanmadı");
		//hata olmasına rağmen program akışına yansıtmadık
		
		
	}
	
	
//throws hatayı gösterme  istisna durumu kullan
	public static void vergiHesapla(double tutar, double oran) throws ArithmeticException {

		if (oran < 3) {
			//throw hata fırlatmak
			throw new ArithmeticException(); // matematiksel hata ver
			//kendi hatamızı oluşturduk
		} else {
			System.out.println(tutar + ((tutar * oran)/100));
		}
		
		
		

	}
	//throws kullanımı zorunlu hale getirdik kontrol zorunlu oluyor
	public static void yasHesapla(int yas) throws IOException   {

		if (yas < 18) {
			//throw hata fırlatmak
			throw new IOException();//okuma yazma hatası
			//kendi hatamızı oluşturduk
		} else {
			System.out.println("yaş müsait");
		}
		

	}
	
	
	
}



