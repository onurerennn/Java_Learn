package ornekler;

import java.util.Scanner;

public class enbAsalSayi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayı = sc.nextInt();

		int enBuyukAsalCarpan = 0;
		int i = 2;
		while (sayı > 1) {
			if (sayı % i == 0) {
				sayı /= i;
				enBuyukAsalCarpan = i;
			} else {
				i++;
			}
		}

		System.out.println("En büyük asal çarpan: " + enBuyukAsalCarpan);

	}

}
