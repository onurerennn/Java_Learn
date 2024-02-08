package abstarct;
//hiyerarşının en üstünde bulunan sınıf	
//benim sınıfımdan nesne oluşturma  (abstarct) key yapılır
public abstract class Sekiller {
// <<abstract>> uml böyle gösterilir  yada italik yazar veya {} parantez arasına veya {a} sonuna yada basına eklenir 
	//metotlar içinde geçerli  daha çok italik kullanacağız
	
	//bir sınıfın soyut olup olmadığı abstract anlaşılır
	//soyut değilse sınıf somuttur concrete (bügüne kadar kullandığımız sınıflar)
	//abstract sınıftan diğer sınıflar türetilmelidir(somutlaştırıyoruz) tek başına bişey ifade etmez
	//abstract sınıf var ise nesne oluşturulmaz (örnek alamayız)
	//abstarct sınıfın hem concrete hemde abstract üyeleri olablir (somut fonk yazılabilir)
	//constructor vardır
	
	
	public abstract void yaz();//böyle tanımlanır gövdesiz
	//bir metodun soyut olup olmadığı abstract anlaşılır
	//abstract metodun gövdesi olmaz 
	//(zorunlu polymorphism) gövde boş olduğu için zorunlu overriding yapılacak (abstract metot concrete hale dönüştürülmeli)
	//abstarct metot sadece abstarck sınıf içinde tanımlanabilir
	//erişim belirteci kalıtım yapısına uygun public protected olmalıdır
	//static ve abstract metotlar bir arada kullanılmaz
	//abstract anahtar kelimesi ile  consctructor tanımlanamaz
	//final anahtar sözcüğü ile de kullanılmaz 
	
	
	
	
}
