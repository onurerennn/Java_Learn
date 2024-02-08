package metot_1;

import java.util.Scanner;

public class Deger_goster {
//Klavyeden her hangi bir değer girildiğinde harf mı, sayı mı, yoksa bir karakter mi olduğunu gösteren Goster() 
//isimli fonksiyonun overloading edilecek şekilde tasarlayınız.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("bir harf, sayı veya karakter girin");
		char karakter = sc.next().charAt(0);
		if (Character.isDigit(karakter)) {
			goster(Integer.parseInt(String.valueOf(karakter)));
		} else if (Character.isLetter(karakter)) {
			goster(String.valueOf(karakter));
		} else {
			goster(karakter);

		}
	}

	public static void goster(int c) {
		System.out.println(c + " bir rakamdır");
	}

	public static void goster(String c) {
		System.out.println(c + " bir harftir");
	}

	public static void goster(char c) {
		System.out.println(c + " bir harf veya rakam değil farklı bir karakterdir");
	}

}
