package örnek19;

import java.util.Scanner;

public class main {
//hashard sayı
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kontrol edilecek sayıyı girin");
		int sayı = scan.nextInt();
		int ters = 0, kalan = 0, rakam_top = 0;
		while (sayı != 0) {
			kalan = sayı % 10;
			rakam_top = rakam_top + kalan;
			sayı = sayı - kalan;
			sayı = sayı / 10;
			ters = (ters * 10) + kalan;
		}
		System.out.println(ters);
		if (ters % rakam_top == 0) {
			System.out.println("hashard sayı");
		} else {
			System.out.println("hashard sayı değil");
		}
	}
}
