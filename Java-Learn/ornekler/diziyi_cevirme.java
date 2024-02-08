package örnek40;

//büyükten küçüğe çevirme
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("satır sayısını girin");
		int satır = sc.nextInt();
		System.out.println("sütün sayısını girin");
		int sutun = sc.nextInt();
		// matrisin oluşturulması
		int[][] matris = new int[satır][sutun];
		int[] dizi = new int[satır * sutun]; // matris diziye aktarıldı
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = rnd.nextInt(101);
			}

		} // matrisin oluşumu tamamlandı
			// matris yazdırma
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.printf("%4d", matris[i][j]);
			}
			System.out.println();
		} // matris yazdırıldı
		int sayac = 0;
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				dizi[sayac] = matris[i][j];
				sayac++;
			}
		}
		// dizi elemanları sıralanıyor
		int temp;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[j] < dizi[i]) {
					temp = dizi[j];
					dizi[j] = dizi[i];
					dizi[i] = temp;
				}
			}

		}
		System.out.println("sıralanmış matris yazdırılıyor");
		System.out.println();
		// sıralı matrise aktarma ve yazdırma
		sayac = 0;
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = dizi[sayac];
				sayac++;
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}

	}

}
