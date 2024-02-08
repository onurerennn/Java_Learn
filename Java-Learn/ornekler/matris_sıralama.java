package ornekler;

import java.util.Random;
import java.util.Scanner;

public class matris_sıralama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("satır sayısını girin");
		int satır = sc.nextInt();
		System.out.println("sütün sayısını girin");
		int sutun = sc.nextInt();
		int matris[][] = new int[satır][sutun];
		int[] dizi = new int[satır * sutun];
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = rnd.nextInt(100);

			}
		} // matris yazma başlangıcı
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.printf("%-4d", matris[i][j]);
			}
			System.out.println();
		} // matris yazma sonu
		System.out.println("--------------");
		int sayac = 0;
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				dizi[sayac] = matris[i][j];
				sayac++;

			}
		}
		sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();
		System.out.println("\n------------------------------");
		// dizi sıralanması başlangıcı
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[j] < dizi[i]) {
					int temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}
		// dizi sıralanma sonu
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println("\n---------------------------");

		;
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = dizi[sayac];
				sayac++;
			}
		}
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.printf("%-3d", matris[i][j]);
			}
			System.out.println();
		}

	}

}
