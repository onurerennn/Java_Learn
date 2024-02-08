package metot_1;

import java.util.Scanner;

public class Metni_buyuk_kucuk_yazdırma {
	//Parametre olarak klavyeden girilen metni kfüçük harfle ve büyük harfle 
	//yazan programı fonksiyonlar kullanarak tasarlayınız
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("metin giriniz");
		String metin = sc.nextLine();
		System.out.println("seçiminizi yapın");
		System.out.println("1 = küçük harf");
		System.out.println("2 = büyük harf");
		int secim = sc.nextInt();
		
		switch(secim) {
		case 1:
			 kucuk_yaz(metin);
			break;
		case 2:
			buyuk_yaz(metin);
			break;
			default:
				System.out.println("hatalı seçim");
		}
		
	}
	
	public static void kucuk_yaz(String a) {
		System.out.println(a.toLowerCase());
	}
	public static void  buyuk_yaz(String b) {
		System.out.println(b.toUpperCase());
	}

}
