package örnek13;

import java.util.Scanner;

public class main {
//girilen sayının tersini bulma
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("tersi girilecek sayı girin");
		int sayı = scan.nextInt();
		int ters = 0, kalan;
		while (sayı != 0) {
			kalan = sayı % 10;
			sayı = sayı - kalan;
			sayı = sayı / 10;
			ters = (ters * 10) + kalan;
		}
		System.out.println("girilen sayının tersi =" + ters);

	}

}
