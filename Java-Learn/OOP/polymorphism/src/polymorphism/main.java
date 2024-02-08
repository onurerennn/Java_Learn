package polymorphism;

public class main {

	public static void main(String[] args) {
		// çok biçimlilik late binding (geç bağlama)
		// bir metodu istediğimiz çıktıları alcak şekilde dizyn etmeye yarar(türetilen
		// sınıf base sınıfın metotlarını ezebilir)
		// overriding
		// bir eylemi birçok kez farklı şekilde gerçekleştirebilmemize izin verir
		// overloading 2 şekilde oluyordu (farklı adet parametre alacak,farklı veri
		// tipinde parametre alacak)
		// overriding metotları ezme işlemi sağlar metotlara öncelik verme
		// polimorphism = overloading + overriding
		// kodun okunabilirliğni arttırır
		// kodun değiştirilmesini kolaylaştırır

		Hayvan h1 = new Hayvan("gergedan");
		h1.seslendir();
		Kedi kedi1 = new Kedi("van");
		kedi1.seslendir();
		Kopek k1 = new Kopek("pitbul");
		k1.seslendir();
		Kus kus = new Kus("muhabbbet ");
		kus.seslendir();
		Kedi kedi2 = new Kedi("sokak");
		kedi2.seslendir("beyaz");
//üst sınıfın data sınıfı hayvan olabilir(super classı) ama constructorın çalıştığı kısım diğer kısım (köpek) kısmı 

		Hayvan kedi3 = new Kedi("erzurum kedisi"); // her kedi birer hayvandır
		kedi3.seslendir();

		// üst sınıfın data sınıfı hayvan olabilir(super classı) ama constructorın
		// çalıştığı kısım diğer kısım (köpek) kısmı
		Hayvan kopek2 = new Kopek("kangal");
		kopek2.seslendir();
		Hayvan kus2 = new Kus("kanarya");
		kus2.seslendir();

		// is-a ilişkisi olan clsslar için bu tanımlama kullanılabilir(her kanarya birer
		// hayvandı)
		Hayvan kanarya1 = new Kanarya("beyaz kanatli");
		kanarya1.seslendir();

		Kus kanarya2 = new Kanarya("gri kanatli"); // her kanarya birer kuştur (is-a) ilişkisi
		kanarya2.seslendir();

		Kanarya kanarya3 = new Kanarya("gri kanatli");
		kanarya2.seslendir();

		Hayvan hayvan3 = new Hayvan("kurbaga");
		System.out.println(hayvan3.omur);
		// data tipi ile constructor metot aynı ise doğrudan ilgili sınıfa gidilir
		// o sınıfın değişken ve metotlarına ulaşılır
		Kedi kedi4 = new Kedi("cins"); // kedi sınıfındaki ömrü aldı
		System.out.println(kedi4.omur);

		// data tipi ile constructor metot aynı isimde değilse
		// 1. metotlara erişim :overriding edilip edilmedğine bakılarak karar verilir
		// 2. değişkenlere erişim: ilk bulunan değişken değeri yazılır

		Hayvan kedi5 = new Kedi("renkli gozlu");
		System.out.println(kedi5.omur); // ilk ulaştığı değeri yazdı Hayvan türünde oluşturduğumuz için başa Hayvan
										// yazdık
		kedi5.seslendir();

		Kus kanarya5 = new Kanarya("renkli kanarya");
		System.out.println(kanarya5.omur); // ilk yazılan kus değerini aldı(25) oluşturulan ilk değişkene gider

		Kanarya kanarya6 = new Kanarya("yabani");
		System.out.println(kanarya6.omur); // direkt aynı sınıfa gider data tipi ile constructor aynı

		// Kus kanarya7 = new Kanarya("evci");
		// System.out.println(kanarya7.omur); eğer kuşun omru olmasaydı kanarya kusunda
		// bir ust atasından değeri alacaktı(20)

		Kus kanarya8 = new Kus("siyah"); // teker teker uğraşmaktansa böyle yaptık
		hayvanSeslendir(kanarya8);

		// data atipi sol taraf constructor sağ taraf
	}

	public static void hayvanSeslendir(Hayvan hayvan) {
		hayvan.seslendir();

	}

}// eğer omur değişkenini private yapsaydık get ve set metodunu kullanacaktık bü
	// yüzdende overriding olup olmadığına bakacaktık
//get ve set varsa hepsi metoda döner (değişken)
//late binding --- çalışma zamanındakı karar  üst sınıfın referansını alt sınıfın değişkenine eşitlemek 