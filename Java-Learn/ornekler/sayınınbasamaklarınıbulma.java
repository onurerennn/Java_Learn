package ornekler;

import java.util.Scanner;

public class sayınınbasamaklarınıbulma {
	// 4 haneli bir sayının birler, onlar, yüzler ve binler hanesini bulan programın
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bas[] = { "birler", "onlar", "yüzler", "binler" };
		System.out.println("4 basamaklı sayı girin = ");
		int sayı = sc.nextInt();
		int k = 0, c = 0;
		for (int i = 0; i < 4; i++) {
			k = sayı % 10;
			c = sayı - k;
			sayı = c / 10;
			System.out.println(bas[i] + " basamağı " + k);
		}
	}

}
