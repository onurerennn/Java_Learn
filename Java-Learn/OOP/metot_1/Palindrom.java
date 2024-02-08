package metot_1;

import java.util.Scanner;

public class Palindrom {
//Baştan ve sondan aynı okunan kelimeye Palindrome Kelimeler denir. Parametre olarak verilen bir 
//kelimenin palindrome olup olmadığını bulan fonksiyonu yazınız.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kontrol edilecek metni bulunuz");
		String metin = sc.nextLine();
		System.out.println(ters_metin(metin));
		palindrom_mu(metin, ters_metin(metin));

	}

	public static String ters_metin(String a) {
		String ters = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			ters += a.charAt(i);
		}
		return ters;

	}

	public static void palindrom_mu(String a, String b) {
		if (a.equals(b)) {
			System.out.println("palindrom kelime");
		} else {
			System.out.println("palindrom kelime değil");
		}

		
	}

}
