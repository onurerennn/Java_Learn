package ornekler;

import java.util.Scanner;

// girilen iki sayı arasındaki çift sayıları yazdırma
public class main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a = ");
		System.out.println("b = ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int toplam = 0;
		int cifts = 0;
		int sayac = 1;

		for (int i = a; i < b; i++) {
			if (i % 2 == 0) {
				for (int j = sayac; j < i; j++) {
					System.out.println(j + ".sayı = " + i);
					sayac++;
					break;
				}
				toplam += i;
				cifts++;
			}

		}
		System.out.println("toplam = " + toplam);
		System.out.println("adet = " + cifts);
	}
}