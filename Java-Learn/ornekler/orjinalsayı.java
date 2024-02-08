package ornekler;

import java.util.Scanner;

public class orjinalsayı {
	// Girilen dört basamaklı sayılardan ilk iki basamağı ile son iki basamağının
	// toplamının karesi, sayının kendine eşit olan sayılara orijinal sayı denir.
	// Girilen sayının orijinal olup olmadığını bulan programın
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4 basamaklı sayı girin = ");
		int sayı = sc.nextInt();
		String a = Integer.toString(sayı);
		char b[] = new char[4];
		for (int i = 0; i < b.length; i++) {
			b[i] = a.charAt(i);
		}

		int c[] = new int[4];
		for (int i = 0; i < 4; i++) {
			c[i] = Character.getNumericValue(b[i]);
		}
		String g = "";

		for (int i = 0; i < 2; i++) {

			String ğ = Integer.toString(c[i]);
			g += ğ;
		}

		int ı = Integer.parseInt(g);

		String s = "";
		for (int i = 2; i < 4; i++) {
			String ş = Integer.toString(c[i]);
			s += ş;
		}
		int ö = Integer.parseInt(s);
		int m = ö + ı;
		int n = m * m;
		if (sayı == n) {
			System.out.println("orjinal sayıdır");
		} else {
			System.out.println("orjinal sayı değildir");
		}
	}

}
