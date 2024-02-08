package örnek38;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı giriniz");
		int ay = sc.nextInt();
		String[] aylar = { "", "ocak", "şubat", "mart", "nisan", "mayıs", "haziran", "temmuz", "ağustos", "eylül",
				"ekim", "kasım", "aralık" };
		if (ay > 0 && ay < 13) {
			System.out.println(ay + "numaralı ay = " + aylar[ay]);

		} else {
			System.out.println("geçersiz ay");
		}

	}

}
