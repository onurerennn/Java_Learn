package metot_1;

import java.util.Scanner;

public class Matris_siralama {
//Rasgele sayılardan oluşan bir matrisi küçükten büyüğe ve büyükten küçüğe 
//sıralayan programın java kodunu fonksiyonlar kullanarak oluşturunuz.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("satır sayısını girin");
		int satir = sc.nextInt();
		System.out.println("sütün sayısını girin");
		int sutun = sc.nextInt();
		System.out.println("küçükten büyüğe sıralandı");
		K_B_sirala(satir, sutun);
		System.out.println("büyükten küçüğe sıralandı");
		B_K_sirala(satir, sutun);
	}

	public static void K_B_sirala(int a, int b) {
		int[][] matris = new int[a][b];
		int dizi[] = new int[a * b];
		int sayac = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matris[i][j] = (int) (Math.random() * 101);
				dizi[sayac] = matris[i][j];
				sayac++;
			}

		}
		for (int k = 0; k < dizi.length; k++) {
			for (int m = k + 1; m < dizi.length; m++) {
				if (dizi[m] < dizi[k]) {
					int temp = dizi[k];
					dizi[k] = dizi[m];
					dizi[m] = temp;
				}
			}
		}
		int sayacy = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matris[i][j] = dizi[sayacy];
				System.out.printf("%-4d", matris[i][j]);
				sayacy++;
			}
			System.out.println();
		}

	}

	public static void B_K_sirala(int a, int b) {
		int[][] matris = new int[a][b];
		int dizi[] = new int[a * b];
		int sayac = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matris[i][j] = (int) (Math.random() * 101);
				dizi[sayac] = matris[i][j];
				sayac++;
			}

		}
		for (int k = 0; k < dizi.length; k++) {
			for (int m = k + 1; m < dizi.length; m++) {
				if (dizi[m] > dizi[k]) {
					int temp = dizi[k];
					dizi[k] = dizi[m];
					dizi[m] = temp;
				}
			}
		}
		int sayacy = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				matris[i][j] = dizi[sayacy];
				System.out.printf("%-4d", matris[i][j]);
				sayacy++;
			}
			System.out.println();
		}

	}

}
