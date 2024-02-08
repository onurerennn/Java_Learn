//uml diyagramı ss var

public class main {  

	public static void main(String[] args) {
		//inheritance (miras)
		// bir nesildeki özelliklerin diğer nesillere aktarılması
		// bir classtaki özellklerin ve metotların diğer classlara aktarılması
		// bir defa yaz çok defa kullan
		// extend anahatar kelimesi ile kalıtım yapılır
		// kalıtımda protected anahtar kelimesi ile erişime izin verilebilir
		// tekradan kurtulmamıza olanak verir(kod tekrarı)
		// kodun okunabilirliğini arttırır
		// daha az kod yazmamızı sağlar
		// kod güncellemelerini ve hata yakalama ihtimalini arttırır
		// bakım , test ve sürüm sürecini kolaylaştırır

		BasiliKitap bk1 = new BasiliKitap("kitap-1", "123456", "basili kitap yazar-1", "karton");
		System.out.println("---------------");
		EKitap ek1 = new EKitap("E kitap-1", "123456343", "elektronik kitap yazar-2", true);
		System.out.println("--------------------");
		Seslikitap sk1 = new Seslikitap("kitap 3", "123334565", "sesli kitap yazar 3", "ses demo 1");
		System.out.println("-------------------");
		Ingilizce ik1 = new Ingilizce("kitap-4", "12334547", "ingilizce kitap yazar 4", "karton", true);
		System.out.println("-------------------------");
		Universite uk1 = new Universite("kitap-4", "12334547", "universite kitap yazar 4", "karton", "çevirmen-1");

	}
}
