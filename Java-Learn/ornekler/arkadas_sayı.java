package ornekler;

import java.util.Scanner;

public class main14 {
//arkadaş sayı
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.sayıyı girin");
		int sayı1 = sc.nextInt();
		System.out.println("2.sayıyı girin");
		int sayı2 = sc.nextInt();
		int toplam1 = 0;
		int toplam2 = 0;
		for (int i = 1; i < sayı1; i++) {
			if (sayı1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int j = 1; j < sayı2; j++) {
			if (sayı2 % j == 0) {
				toplam2 += j;
			}
		}
		if (toplam1 == sayı2) {
			System.out.println("arkadaş sayılardır");
		} else if (toplam2 == sayı1) {
			System.out.println("arkadaş sayılardır");
		} else {
			System.out.println("arkadaş sayı değillerdir");
		}

	}

}
