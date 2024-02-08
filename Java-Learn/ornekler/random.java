package örnek15;

import java.util.Random;
import java.util.Scanner;

public class main {
// random üretilen iki sayının kullanıcıya bulana kadar sorması
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int sayı1 = rnd.nextInt(101);
		int sayı2 = rnd.nextInt(101);

		do {
			sayı1 = rnd.nextInt(101);
			sayı2 = rnd.nextInt(101);

		} while (sayı1 < sayı2);
		System.out.println(sayı1 + "-" + sayı2);
		Scanner klavye = new Scanner(System.in);
		int k_sonuc = klavye.nextInt();
		int sonuc = 0;
		sonuc = sayı1 - sayı2;
		boolean tahmin = false;
		while (tahmin == false) {
			if (k_sonuc == sonuc) {
				System.out.println("doğru cevap");
				tahmin = true;
			} else {
				System.out.println("yanlış cevap.tekrar sonuç giriniz");
				k_sonuc = klavye.nextInt();
			}
		}

	}

}
