package metot_1;

import java.util.Scanner;

public class Matriste_asal_bulma {
//Parametre olarak boyut değerlerini dışardan alıp 0-100 arasında rasgele sayılardan oluşan bir matris alıp bu
// matrisin asal olan elemanlarını fonksiyonlar yardımıyla yazdıran programı java dilinde geliştiriniz.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("satır sayısını girin");
		int satir = sc.nextInt();
		System.out.println("sütün sayısını girin");
		int sutun = sc.nextInt();
		asal(satir, sutun);

	}

	public static void asal(int a, int b) {
		int matris[][] = new int[a][b];
		int sayac = 0;
		int dizi[] = new int[a * b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matris[i][j] = (int) (Math.random() * 101);
				dizi[sayac] = matris[i][j];
				sayac++;
				System.out.print(matris[i][j] + " ");

			}
			System.out.println();
		}
		int s = 1;
		for (int i = 0; i < dizi.length; i++) {
			boolean asalmı = true;
			for (int j = 2; j < dizi[i]; j++) {

				if (dizi[i] % j == 0) {
					asalmı = false;
					break;
				}

			}

			if (asalmı == true) {
				if (dizi[i] == 0 || dizi[i] == 1) {
					asalmı = false;
					continue;

				}

				System.out.println(s + ".sayı = " + dizi[i]);
				s++;
			}

		}

	}

}
