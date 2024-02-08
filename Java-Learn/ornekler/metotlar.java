
public class main {

	public static void main(String[] args) {
		/*
		 * exp(x) e^x değerini döndürür.
		 * 
		 * log(x) doğal logaritma ln(x) değerini döndürür. (log𝑒 𝑥)
		 * 
		 * log10(x) 10 tabanında logaritma x değerini döndürür. (log10 𝑥)
		 * 
		 * pow(a, b) a^b değerini döndürür.
		 * 
		 * sqrt(x) karekök x değerini döndürür.
		 */
		System.out.println(Math.pow(2, 5));
		System.out.println("---------------");
		/*
		 * -ceil(x) x üstteki en yakın tamsayıya yuvarlanır, dönen değer double olur.
		 * 
		 * -floor(x) x alttaki en yakın tamsayıya yuvarlanır, dönen değer double olur.
		 * 
		 * -rint(x) x en yakın tamsayıya yuvarlanır, dönen değer double olur.
		 * 
		 * x alt ve üst taraftaki tamsayıya eşit uzaklıkta ise çift sayı döner.
		 * 
		 * -round(x) x, float ise (int)Math.floor(x + 0.5) sonucunu döndürür.
		 * 
		 * x, double ise (long)Math.floor(x + 0.5) sonucunu döndürür.
		 * 
		 */
		System.out.println(Math.ceil(-2.8));
		System.out.println(Math.floor(-2.8));
		System.out.println(Math.rint(3.5));
		System.out.println("-------------------");
		/*
		 * min(x, y) iki sayıdan küçük olanı döndürür. (sayılar: int, long, float,
		 * double) max(x, y) iki sayıdan büyük olanı döndürür. (sayılar: int, long,
		 * float, double) abs(x) bir sayının mutlak değerini döndürür. (sayılar: int,
		 * long, float, double)
		 */

		System.out.println(Math.abs(-36));
		System.out.println(Math.max(12, 21));

		System.out.println("--------------------");
		/*
		 * Math.random() Bu yöntem 0.0’dan büyük veya eşit ve 1.0’den küçük rastgele bir
		 * double değer üretir. 0 <= Math.random() < 1.0
		 */
		System.out.println((int) (10 + Math.random() * 50));
		System.out.println("----------------------");
		/*
		 * '0' – '9' 48 – 57 \u0030 – \u0039 'A' – 'Z' 65 – 90 \u0041 – \u005A 'a' – 'z'
		 * 97 – 122 \u0061 – \u007A
		 */
		char harf = 'a';
		System.out.println(++harf);
		System.out.println("--------------");
		// escape(kaçış karakteri)
		System.out.println("Burasi \"Yazilim Muhendisligi\"");
		/*
		 * kaçış kodları adı Unicode kodu decimal değeri \b backspace \u0008 8 \t tab
		 * \u0009 9 \n linefeed \u000A 10 \f formfeed \u000C 12 \r carriage return
		 * \u000D 13 \\ backslash \u005C 92 \" double quote \u0022 34
		 */
		System.out.println("yazılım\nmühendisliği");
		System.out.println("yazılım\tmühendisliği");
		System.out.println("---------------"); // dönüşüm
		char ch = (char) 0XAB0041; /*
									 * En düşük 16-bit hexadecimal 0041 ch değişkenine atanıyor ch, A karakteridir.
									 */

		System.out.println(ch);
		char chr = (char) 65.25; /*
									 * Onluk 65 değeri, ch değişkenine atanıyor. ch, A karakteridir
									 */
		System.out.println(chr);

		int i = (int) 'A'; /*
							 * A karakterinin Unicode değeri, i değişkenine atanıyor. i, 65 olur.
							 */
		System.out.println(i);
		/*
		 * Onaltılık olarak 0 ile FFFF arasındaki herhangi bir pozitif tam sayı, kapalı
		 * çevrimle bir karaktere dönüştürülebilir. Bu aralıkta olmayan herhangi bir
		 * sayı açık çevrimle bir karaktere dönüştürülmelidir
		 */

		i = '2' + '3'; // int ))'2', 50 ve ( int ))'3', 51
		System.out.println("i:" + i);
		// i: 101

		int j = 5 + 'o';
		System.out.println("j:" + j); // sadece sayı kullanırsak int gerekmez. harf varsa int gerekir.

		System.out.println("---------------------");
		// İki karakter sayılar gibi Unicode değerleri üzerinden karşılaştırılabilir.
		System.out.println('a' < 'b'); // a=97, b=98 //true döner

		System.out.println("------------------------");
		/*
		 * (karşılaştırma) Program yazarken bir karakterin harf mi sayı mı, büyük harf
		 * mi yoksa küçük harf mi diye test etmemiz gerekebilir. Bunun için
		 * karakterlerin Unicode’larının bulunduğu ASCII karakter tablosundan
		 * faydalanabiliriz. Tablodan ' dan ' ye, ' dan ' ye ve '0' dan '9' sıralı bir
		 * şekilde ardışık olarak kodlar devam etmektedir.
		 */
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " karakteri büyük harftir");
		}
		System.out.println("----------------------------");

		// Character sınıfında aşağıdaki metotlar vardır.

		// metot açıklama
		// isDigit(ch) Belirtilen karakter sayı ise true döndürür.
		// isLetter(ch) Belirtilen karakter harf ise true döndürür.
		// isLetterOfDigit(ch) Belirtilen karakter sayı veya harf ise true döndürür.
		// isLowerCase(ch) Belirtilen karakter küçük harf ise true döndürür.
		// isUpperCase(ch) Belirtilen karakter BÜYÜK harf ise true döndürür.
		// toLowerCase(ch) Belirtilen karakteri küçük harfe çevirir.
		// toUpperCase(ch) Belirtilen karakteri BÜYÜK harfe çevirir.

		System.out.println("isDigit('a')" + Character.isDigit('a'));
		System.out.println(Character.isLetter(5));
		System.out.println(Character.isLetter('o'));
		System.out.println("-------------------------");
		// STRİNG

		// char sadece bir karakteri temsil eder.
		// String birden fazla karakter dizisini ifade eder.

		// String tipi için temel metotlar

		/*
		 * metot açıklama
		 * 
		 * length() dizideki karakter sayısını döndürür. charAt(index) dizideki
		 * belirtilen indeksteki karakteri döndürür. concat(s1) bu dizi ile s1 dizisini
		 * birleştirerek yeni bir dizi döndürür. toUpperCase() dizideki bütün
		 * karakterleri büyük harf yapıp yeni bir dizi döndürür. toLowerCase() dizideki
		 * bütün karakterleri küçük harf yapıp yeni bir dizi döndürür. trim() dizinin
		 * her iki yanındaki whitespace karakterleri (' ', t, f, r, n) yok ederek yeni
		 * bir dizi döndürür.
		 */

		String mesaj = "hello world";
		String mesaj2 = "merhaba dünya";
		System.out.println("mesajın uzunluğu = " + mesaj.length());
		System.out.println(mesaj.charAt(7));
		System.out.println(mesaj.concat(mesaj2));
		System.out.println(mesaj + "merhaba dünya");
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		int r = 2, t = 3;
		System.out.println("r+t = " + r + t);
		System.out.println("r+t = " + (r + t));

		// next Konsoldan string (dizi) girişi
		// nextLine Konsoldan satır girişi

		// Karakter Dizilerinin ( String ) Karşılaştırılması

		/*
		 * metot (yöntem) metot (yöntem) equals(s1) dizi, s1 dizisine eşit ise true
		 * döndürür. equalsIgnoreCase(s1) dizi, s1 dizisine eşit ise true döndürür,
		 * büyük küçük harf dikkate alınmaz. compareTo(s1) dizi, s1 dizisinden büyükse
		 * sıfırdan büyük bir sayı, eşitse sıfır ve küçükse sıfırdan küçük bir sayı
		 * döndürür. compareToIgnoreCase(s1) dizi, s1 dizisinden büyükse sıfırdan büyük
		 * bir sayı, eşitse sıfır ve küçükse sıfırdan küçük bir sayı döndürür, büyük
		 * küçük harf dikkate alınmaz startsWith(prefix) dizi, belirlenen bir önek ile
		 * başlamışsa true döndürür. endsWith(suffix) dizi, belirlenen bir sonek ile
		 * bitmişse true döndürür. contains(s1) dizinin içinde s1 alt stringi mevcut ise
		 * true döndürür.
		 */

		String s1 = "hello";
		String s2 = "HELLO";
		String s3 = "hello-world";
		String s4 = "abcdefgh";
		String s5 = "aaabcad";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.contains("l"));

		// substring (baslamaIndeksi , bitisIndeksi)= dizideki karakterleri
		// baslamaIndeksi nden bitisIndeksi -1 ’e kadar elde eder.

		System.out.println(s4.substring(3, 6));

		// Karakter ya da alt string Bulma

		/*
		 * metot (yöntem) açıklama indexOf(ch) dizi içindeki ilk ch’nin indeksini
		 * döndürür, eşleşme olmazsa -1 döndürür. //ilk görünen indeksi bulma
		 * indexOf(ch,indeksSonrasi) dizi içindeki indeksSonrasi’ndan itibaren ilk
		 * ch’nin indeksini döndürür, eşleşme olmazsa -1 döndürür. indexOf(s) dizi
		 * içindeki ilk s’nin indeksini döndürür, eşleşme olmazsa -1 döndürür.
		 * indexOf(s,indeksSonrasi ) dizi içindeki indeksSonrasi’ndan itibaren ilk s’nin
		 * indeksini döndürür , eşleşme olmazsa -1 döndürür. lastIndexOf(ch) dizi
		 * içindeki son ch’nin indeksini döndürür, eşleşme olmazsa -1 döndürür. //son
		 * görünen indeksi bulma lastIndexOf(ch,indeksSonrasi) dizi içindeki
		 * indeksSonrasi’ndan itibaren son ch’nin indeksini döndürür, eşleşme olmazsa -1
		 * döndürür. lastIndexOf(s) dizi içindeki son s’nin indeksini döndürür, eşleşme
		 * olmazsa -1 döndürür. lastIndexOf(s,indeksSonrasi) dizi içindeki
		 * indeksSonrasi’ndan itibaren son s’nin indeksini döndürür , eşleşme olmazsa -1
		 * döndürür.
		 */
		System.out.println(s1.indexOf("lo")); // birden fazla karakter için "" 3
		System.out.println(s1.indexOf('l')); // tek karakteri için '' 2
		System.out.println(s3.indexOf('o', 6)); // yazılan indexten sonra(5) sonra yazılan diziyi buluyor 7
		System.out.println(s5.lastIndexOf('a')); // sondakini buluyor 5
		System.out.println(s3.lastIndexOf("lo")); // 3
		System.out.println("-----------------------");
		// printf konsol çıktısı biçimlendirme
		// System.out.printf() ile konsol (siyah ekran) üzerinde program çıktılarının
		// biçimlerini düzenleyebilirsiniz.
		/*
		 * System.out.printf(" biçimli metin ", nesne1, nesne2, …, nesneN) nesne: sayı,
		 * karakter,true false değer, string olabilir. " biçimli metin": nesneleri ve
		 * diğer istenen metinleri (yazıları) barındıran
		 */

		// printf Sık kullanılan biçim tanımlayıcıları

		/*
		 * biçim tanımlayıcısı çıktı örnek %b boolean değer true boolean değer true %c
		 * karakter 'a' %d onluk tam sayı 200 %f ondalık sayı 45.4556 %e sayının
		 * bilimsel gösterimi 4.556000e+01 %s karakter dizisi, string "Java"
		 */

	}

}
