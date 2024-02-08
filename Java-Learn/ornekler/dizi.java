package örnek24;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("dizi boyutunu giriniz");
		int n = klavye.nextInt();
		int[] dizi = new int[n];
		double en_kucuk = Double.POSITIVE_INFINITY;
		double en_buyuk = Double.NEGATIVE_INFINITY;
		// diziyi oluşturduk
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("dizinin " + (i + 1) + ".elemanını girin");
			dizi[i] = klavye.nextInt();
		}
		int en_kucuk_indis = 0, en_buyuk_indis = 0;
		// dizide dolaşalım
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] < en_kucuk) {
				en_kucuk = dizi[i];
				en_kucuk_indis = i;
			}
			if (dizi[i] > en_buyuk) {
				en_buyuk = dizi[i];
				en_buyuk_indis = i;
			}
		}
		System.out.println("dizinin en küçük elemanı=" + en_kucuk + "ve indis numarası" + en_kucuk_indis);
		System.out.println("dizinin en büyük elemanı=" + en_buyuk + "ve indis numarası" + en_buyuk_indis);

	}
}
