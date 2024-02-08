
public class main {

	public static void main(String[] args) {

		// exception-handling
		// hata yakalama,istisna ayıklama,istisna işleme,hata yakalama
		// kullanıcı arkadaki hatayı görmesin sadece anlıyacağı şeyleri görsün
		// exception -istisna durum-anormal durum
		// handling -nasıl cevap verecegiz-ele alma
		// program akışını bozmadan programın çalışmasının sağlanması işidir
		// try-catch-finaly kod blokları kullanılan temel yapılardır
		//iç içe yada yuvarlanmış try-catch kod blokları kullanılabilir
		// throw throws kendi oluşturacağımız istisnaları belirtmek için kullanılır
		// try dene, sıkıntılı yerleri ,hatayı kontrol editor
		// catch tut ,yakala
		// finally sonunda ne yapmak istiyorsan onu uygula , hata olsun olmasın herzaman
		// finali göreceğiz
		// try-catcfinally
		// try-catch
		// try-finally üç yapıda kullanılabilir

		//amacımız akışı bozmamak
		
		System.out.println("işlem başlatıldı");
		int a = 99, b = 0;
		try {
			int sonuc = a / b;// dene    //burada hata olduğu için diğer satırlara bakmaz
			System.out.println(sonuc); // e nesne oluşturduk sınıfı kullanmak için
			System.out.println("kontrol işlemi tamamlandı");
		} catch (ArithmeticException e) { // neyi kontrol etmek istiyon
			System.out.println("bölen hatası");// hatama yönlendir

		}
		System.out.println("işlem tamamlandı"); // işlemimi tamamla

		System.out.println("--------------------------------------------------"); // bölmede hata olmasın
		System.out.println("işlem başlatıldı");
		int c = 99, d = 9;
		try {
			int sonuc1 = c / d;
			System.out.println(sonuc1);
			System.out.println("kontrol işlemi tamamlandı");

		} catch (ArithmeticException e) { //hatayı catch doğrulamamız lazım, süphelendiğimiz şeyi yazmamız lazım
			System.out.println("bölen hatası");
		}
		System.out.println("işlem tamamlandı");
		System.out.println("-------------------");
		
		//burdaki hata aritmedik ama biz bulunmama hatası koyduk yine hata verir
		
		/*System.out.println("işlem başlatıldı");
		int e = 99, f = 0;
		try {
			int sonuc1 = e / f;
			System.out.println(sonuc1);
			System.out.println("kontrol işlemi tamamlandı");

		} catch (NullPointerException ex) {  değer ataması yok, bulamama
			System.out.println("bölen hatası");
		}*/

		//burdaki hata aritmedik ama biz bulunmama hatası koyduk yine hata verir

		System.out.println("-------------------------");
		System.out.println("işlem başlatıldı");
		//birden fazla kontrol istedik
		int x = 99, y = 0;
		try {
			int sonuc1 = x / y;
			System.out.println(sonuc1);
			System.out.println("kontrol işlemi tamamlandı");

		} catch (ArithmeticException e) { //hatayı catch doğrulamamız lazım, süphelendiğimiz şeyi yazmamız lazım
			System.out.println("bölen hatası");
		}
		catch (NullPointerException e) {
			System.out.println("null pointer hatası var"); //boş karakter hataası
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("index hatası vardır");
		}
		System.out.println("işlem tamamlandı");
		//birden fazla catch bloğu olabilir
		
		System.out.println("--------------------------------");
		System.out.println("işlem başlatıldı");
		int x1= 99, y1 = 9;
		int[]dizi = new int[5]; //0 1 2 3 4 
		try {
			int sonuc1 = x1 / y1;  //burada hata yok
			System.out.println(dizi[sonuc1]); //11 index  ilk hata 
			
			System.out.println(sonuc1);
			
			System.out.println("kontrol işlemi tamamlandı");

		} catch (ArithmeticException e) {
			System.out.println("bölen hatası");
		}
		catch (NullPointerException e) {
			System.out.println("null pointer hatası var");
		}
		catch (ArrayIndexOutOfBoundsException e) { //alt sınıf
			System.out.println("array index hatası vardır"); //kendi mesajımız
			 e.printStackTrace(); //hatam ne
			 System.out.println(e.getMessage());//hatamı yaz
			System.out.println(e.toString()); //mesajı yazdır
		//ilk önce küçük olanı kullanılm olmazsa üst te bak
		}
		catch (IndexOutOfBoundsException e) { //ata sınıf
			System.out.println("index hatası vardır");
		}
		catch (Exception e) { //bilmediğimiz hata
			System.out.println("beklenmedik hata meydana geldi");
		//exception en geniş hata sınıfın en başındaki
		 e.printStackTrace(); //hatam ne
		 System.out.println(e.getMessage());//hatamı yaz
		System.out.println(e.toString()); //mesajı yazdır
		}
		finally {//uyarı verdirmek her zaman çalışsın
			System.out.println("programımız her zaman kesintisiz çalışır");
			//hata alsamda almasamda
		}
			

		System.out.println("----------------------------");
		

		

	}

}
