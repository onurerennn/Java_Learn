package metot_1;

import java.util.Scanner;

public class dizi_enk_enb_bulma {
// Parametre olarak boyut değerlerini dışardan alıp 0-100 arasında rasgele sayılardan oluşan bir dizi alıp 
//bu dizinin en küçük ve en büyük değerini bulan programı fonksiyonlar yardımıyla java dilinde geliştiriniz.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dizinin boyutunu girin");
		int n = sc.nextInt();
		dizi(n);

	}

	public static void dizi(int a) {
		int dizi[] = new int[a];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 101);
		}
		int enk = Integer.MAX_VALUE;
		int enb = Integer.MIN_VALUE;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] > enb) {
				enb = dizi[i];
			}
			if (dizi[i] < enk) {
				enk = dizi[i];
			}

		}
		System.out.println("en küçük değer = "+enk);
		System.out.println("en büyük değer = "+enb);

	}

}
