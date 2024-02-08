package abstract_demo_2;
//abstract_demo_2_UML
public class main {

	public static void main(String[] args) {

		//Bankalar banka1 = new Bankalar(); abstarct classın örneği alınmaz
		//OzelBankalar banka2 = new OzelBankalar() abstarct classın örneği alınmaz
	//Bankalar banka3 = new DevletBankalari() veri tipi ile constructor farklı isimde ama ikiside abstarct
	
		Garanti m1 = new Garanti();
	//Garanti m2 = new Garanti(23, "müsteri adı", "hesap tipi", "adres", "iletişim",100, true, false);
	m1.krediCek();
	m1.birikimYap();
	m1.info(); //data tipi ile constructor aynı isim
	m1.info("garantilendik");
	m1.paraCek();
	m1.paraYatir();
	
	System.out.println("---------------------------");
	
	 OzelBankalar m3 = new Garanti();
	m3.krediCek();
	m3.birikimYap();
	m3.info(); 
	m3.info("garantilendik 1");
	m3.paraCek();
	m3.paraYatir();
	
	System.out.println("--------------------------");
	
	
	Ziraat m4 = new Ziraat();
	m4.krediCek();
	m4.birikimYap();
	m4.info(); 
	m4.info("Ziraatlendik ");
	m4.paraCek();
	m4.paraYatir();
	m4.durumGor();
	
	System.out.println("----------------------");
	

	Bankalar m5 = new Ziraat();
	m5.krediCek();
	m5.birikimYap();
	m5.info(); 
	m5.info("Ziraatlendik 1 ");
	/*m5.paraCek();
	m5.paraYatir();   hata verir  bankalarda yer almıyor (DevletBankalari) olsaydı hata vermezdi
	m5.durumGor();*/
	
	System.out.println("------------------------------------");
	

	DevletBankalari m6 = new HalkBank();
	m6.krediCek();
	m6.birikimYap();
	m6.info(); 
	m6.info("halklandık ");
	m6.paraCek();
	m6.paraYatir();
	m6.durumGor();//halkbank yok ama bi üst sınıftan alıyor
	
	System.out.println("-----------------------------------");
	
	Bankalar m7 = new ZiraatKatilim();
	m7.krediCek();
	m7.birikimYap();
	m7.info(); 
	m7.info("ziraatkatılımlandık ");
	/*m7.paraCek();
	m7.paraYatir();  hata verir  devletBankalari olsaydı vermezdi (ziratt) vermezdi
	m7.durumGor();*/
	
	System.out.println("--------------------------");
	
	DevletBankalari m8 = new VakifKatilim();
	m8.krediCek(); //overriding yapmadık vakıfbanktan geldi
	m8.birikimYap();//overriding yapmadık vakıfbanktan geldi
	m8.info(); //overriding yapmadık vakıfbanktan geldi
	m8.info("vakıf katılımdayız "); //overriding yaptık
	m8.paraCek();
	m8.paraYatir();
	m8.durumGor();
	
	
	
	
	
	
	
	
	
	}

}
