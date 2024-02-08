package örnek37;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] dizi = { 200, 100, 50, 20, 10, 5, 1 };
		System.out.println("para miktarını girin");
		Scanner sc = new Scanner(System.in);
		int AnaPara = sc.nextInt();
		int banknot_sayısı;
		for (int i = 0; i < dizi.length; i++) {
			banknot_sayısı = AnaPara / dizi[i];
			if (AnaPara != 0) {
				System.out.println(banknot_sayısı + " adet " + dizi[i] + "tl öder");
			}
			AnaPara = AnaPara - banknot_sayısı * dizi[i];
		}
	}
}
