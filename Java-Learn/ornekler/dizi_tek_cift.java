package örnek26;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("dizinin  boyutunu girin = ");
		int n = klavye.nextInt();
		Random rnd = new Random();
		int t = 0, ç = 0;
		int[] dizi = new int[n];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rnd.nextInt(101);

			if (dizi[i] % 2 == 0) {
				System.out.println("dizinin çift olan üyesi = " + dizi[i]);
				t++;
			} else {
				System.out.println("dizinin tek olan üyesi = " + dizi[i]);
				ç++;
			}

		}
		System.out.println(t);
		System.out.println(ç);
	}

}
