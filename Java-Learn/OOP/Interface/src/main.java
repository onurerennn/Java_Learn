//interface_UML_1
public class main {

	public static void main(String[] args) {

	//İNTERFACE özellikleri
	//interface anahtar kelimesi kullanılır
	// kendisine implement edecek sınıfa yetenek ve özellik kazandırmak için kullanılır
	//(can-do) ilişkisi var (is-a) diğerlerinde var
	//interface tanımlarken başına(I) koyarız
	//çoklu kalıtım yapısını tamamlar
	//çoklu implement özelliğni destekler
	//interface sınıflar diğer sınıflarda (implements) anahtar kelimesiyle uygulanır
	//değişkenler (public static final)  tanımlanır
	
	
	
	//-----İNTERFACE-----
	//interface içindeki metodun gövdesi yoktur(zorunlu polymorphism) yapmak */abstract oladabili olmayadabilir*/
		//ancak default veya static anahtar kelimeleriyle metot gövdesi inşaa edilebilir
	//erişim belirteci her zaman PUBLİC olacak
	//static metotlar tanımlanamaz(default ve static anahtar kelimeleri ile karıştırılmamalı)
	//yapıcı ve yıkıcı metotlar kullanılmaz
	//metotlar imzaya sahip olabilir
	//interface'ler başka sınıfı ve diğer interfaceleri extends veya implement edemez
	//can-do ilişkisi var
	//new anahtar sözcüğü ile instance(örnek) oluşturulamaz
	
	
	//-----ABSTARCT-----
	//abstract metotların gövdesi yoktur
	//kalıtım yapısına uygun erişim belirteçleri kullanılabilir
	//static metotlar tanımlanabilir
	//yapıcı ve yıkıcı metotlar kullanılır
	//metotlar imzaya sahip olabilir
	//abstract sınıfı  başka sınıfı ve diğer interfaceleri extends veya implement edebilir
	//is-a ilişkisi var
	//	//instance(örnek) oluşturulamaz

	 
	
	//Hayvan h1 = new Hayvan();	hata verir abstract örneği olmaz
	
	Hayvan h2 = new Kedi("kedi-1", "van");
	
	//IYasar h = new IYasar(); böyle bişey olamaz zaten constructor yok
	
	IYasar h3 = new Kedi("kedi-2","çorum");
	// Kedi h4 = new IYasar();  //böylede olmaz interface new ile kullanılmaz
	
	Kedi h4 = new Kedi("kedi-3", "tekirdağ");
	System.out.println(h4.mesaj());
	h4.yasar();
	h4.besle();  
	h4.olsun("kedicik");
	System.out.println("-------------------------------");
	
	Surungenler s1 = new Surungenler("surungen-1","tür1");
	s1.yasar();
	System.out.println(s1.uykuSuresi);
	s1.isSolunum();
	s1.uyu();
	

	
	
	
}

}

