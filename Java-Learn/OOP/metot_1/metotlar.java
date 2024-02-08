package metot_1;

import java.util.Scanner;

public class metotlar {
	public static void topla2() {

	}

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("1. sayıyı girin");
		int birinci_sayı = klavye.nextInt();
		System.out.println("2.sayıyı girin");
		int ikinci_sayı = klavye.nextInt();
		topla(birinci_sayı, ikinci_sayı);
		System.out.println(topla3());  //döndürülen değeri yazar
		String kucuk_mu = topla4(6,8);
		System.out.println(kucuk_mu);
	}

	
	public static void topla(int a, int b) { // parametreli ve geriye değer döndürmüyen
		int toplam = a + b;
//a birinci_sayı ya b ikinci_sayı ya aktarılacak
		System.out.println("girilen sayıların toplamı = " + toplam);

	}
	
	

	public static String topla3() { //parametre almıyan ve geriye değer döndüren
		return "parametre almıyan ve geriye değer döndüren fonksiyon çalıştı";
	}
	
	
	
	
	 //int değer parametresi alıp string değer döndüren fonksiyon nasıl yazılır
	public static String topla4(int a ,int b) {
		if(a<=b)
			return "a küçük sayıdır";
		else
			return "b küçük sayıdır";
	}//parametre alıp geriye değer döndüren
	
	

}
//FONKSİYONLAR
//Yazılan kodun okunabilirliğini artırır
//Kod tekrarını önler
//fonksiyonlar birkez yaz tekrar kullan mantığındadır
//parametre alan ve parametre almıyan
//her zaman ilk önce main metodu başlar nerede olursa olsun
//Geriye değer döndüren(return) ve geriye değer döndürmeyen fonksiyonlar (void) biri olmak zorunda
//return kullanıcaksak veri tipi yazılmalı
