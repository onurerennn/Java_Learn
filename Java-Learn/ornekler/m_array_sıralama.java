package örnek39;

//satır ve sütünu kullanıcı tarafından girilen random sayılar üreten matrisin enbüyük enkücük elemanı bulma 
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
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = rnd.nextInt(101);
			}
		} // matrisin oluşumu tamamlandı
			// matris yazdırma
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		} // matris yazdırıldı
		int enkucuk = Integer.MAX_VALUE;
		int enbuyuk = Integer.MIN_VALUE;
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				if (matris[i][j] < enkucuk) {
					enkucuk = matris[i][j];
				}
				if (matris[i][j] > enbuyuk) {
					enbuyuk = matris[i][j];

				}
			}
		}
		System.out.println("matrisin en büyük elemanı = " + enbuyuk);
		System.out.println("matrisin en küçük elemanı = " + enkucuk);
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				if (matris[i][j] == enkucuk) {
					System.out.println("en küçük elemaının indisi [" + i + "]" + "[" + j + "]");
				}
				if (matris[i][j] == enbuyuk) {
					System.out.println("en büyük elemaının indisi [" + i + "]" + "[" + j + "]");

				}
			}
		}

	}

}
