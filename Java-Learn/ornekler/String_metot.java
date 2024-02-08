public class main {

	public static void main(String[] args) {
		String a = "hello world";
		String b = "Hello World";
		String c = "merhaba";
		String d = "ll";
		System.out.println(a.charAt(4)); //o
		System.out.println(a.codePointAt(4)); //Bir stringi oluşturan karakterlerden index numarası ile belirtilen dizinde bulunan karakterin ASCII kodunu verir.(111)
		System.out.println(a.codePointBefore(4)); //bir öncekinin unicode değerini alır
		System.out.println(a.codePointCount(2, 4));//arada kaç harf varsa onu gösterir
		System.out.println(a.compareTo(b)); //dizi, s1 dizisinden büyükse sıfırdan büyük bir sayı, eşitse sıfır ve küçükse sıfırdan küçük bir sayı döndürür(pozitif)
		System.out.println(a.compareToIgnoreCase(b)); /*dizi, s1 dizisinden büyükse sıfırdan büyük bir sayı, eşitse sıfır ve küçükse sıfırdan 
													  küçük bir sayı döndürür, büyük küçük harf dikkate alınmaz (eşit 0)*/
		System.out.println(a.concat(c));    //birleştiriyor (hello worldmerhaba)
		System.out.println(a.contains(b));  //dizinin içinde s1 alt stringi mevcut ise true döndürür.(false)
		System.out.println(a.endsWith("d")); //dizi, belirlenen bir sonek ile bitmişse true döndürür.(true)
		System.out.println(a.equals(b)); //dizi, s1 dizisine eşit ise true döndürür.(false)
		System.out.println(a.equalsIgnoreCase(b)); //dizi, s1 dizisine eşit ise true döndürür, büyük küçük harf dikkate alınmaz(true)
		System.out.println(a.indent(5));  //kaç hane boşluk bırakacağını gösteriyor(5tane)
		System.out.println(a.indexOf('l')); //dizi içindeki ilk ch’nin indeksini döndürür, eşleşme olmazsa -1 döndürür(2)
		System.out.println(a.lastIndexOf('l'));  //dizi içindeki son ch’nin indeksini döndürür, eşleşme olmazsa -1 döndürür.(9)
		System.out.println(a.length());  // dizinin uzunlugu(11)
		
		String m = "200";      //parseInt String türündeki veriyi int çevirdi
		int i = Integer.parseInt(m);
		System.out.println(m); //200
	
		String n = "300";   // valueOf String türündeki veriyi int çevirdi
		int j = Integer.valueOf(n);
		System.out.println(j+100); //400
		System.out.println(n+100);  //300100
		
		
		System.out.println(a.indent(2));  //indent = girilen sayı kadar başına boşluk ekliyor(  hello world)
		System.out.println(c.repeat(2));   //girilen sayı kadar tekrar yazdırıyor(merhabamerhaba)
		System.out.println(c.replace('a', 'b')); //yer değiştiriyor
		 
	}
	

}
