package metot_1;

import java.util.Scanner;

//Parametre olarak rasgele sayılardan oluşan bir dizi alıp bu diziyi küçükten büyüğe ve
//büyükten küçüğe sıralanmış bir şekilde geri döndüren fonksiyonu tanımlayınız
public class Dizi_sıralama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dizinin boyutunu girin");
		int n = sc.nextInt();
		System.out.println("büyükten küçüğe sıralandı ");
		B_K_sirala(n);
		System.out.println("--------------------");
		System.out.println("küçükten büyüğe sıralandı");
		K_B_sirala(n);

	}

	public static void B_K_sirala(int a) {
		int dizi[] = new int[a];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 101);
		}
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[j] < dizi[i]) {
					int temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}

	public static void K_B_sirala(int a) {

		int dizi[] = new int[a];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 101);
		}
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[j] > dizi[i]) {
					int temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}

	}

}
