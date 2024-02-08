package örnek11;

import java.util.Scanner;

public class main {
//girilen sayının asal çarpanlarını bulma
	public static void main(String[] args) {
		System.out.println("sayı girin");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		int bolen = 2;
		int bolunen = sayi;
		while (bolen <= sayi) {
			if (bolunen % bolen == 0) {
				System.out.println(bolen);
				bolunen /= bolen;

			} else {
				bolen++;
			}
		}
	}

}
