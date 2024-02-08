package örnek7;

import java.util.Scanner;

//klavyeden girilen on sayıyı tek çift ve ortalamasını bulma
public class main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayı, cift_say = 0, cift_top = 0, tek_sayı = 0, tek_top = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". sayıyı giriniz");
			sayı = klavye.nextInt();
			if (sayı % 2 == 0) {
				cift_say++;
				cift_top = sayı;
			} else {
				tek_sayı++;
				tek_top = sayı;
			}
		}
		System.out.println("tüm sayıların ortalaması = " + (tek_top + cift_top) / 10);
		System.out.println("çift sayıların ortalaması = " + (cift_top / cift_say));
		System.out.println("tek sayıların ortalaması = " + (tek_top / tek_sayı));

	}

}
