package ornekler;

import java.util.Random;

public class matristoplamı {

	public static void main(String[] args) {
		// 3*3 ten oluşmuş rastegele iki amtrisin toplamı
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		int[][] top = new int[3][3];
		Random rnd = new Random();
		// m1 matrisi
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m1[i][j] = rnd.nextInt(5);
				System.out.print(m1[i][j] + "   ");

			}
			System.out.println();
		}
		System.out.println();
		// m2 matrisi
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m2[i][j] = rnd.nextInt(5);
				System.out.print(m2[i][j] + "   ");

			}
			System.out.println();
		}
		System.out.println();
		// toplam matris
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				top[i][j] = m1[i][j] + m2[i][j];
				System.out.print(top[i][j] + "   ");

			}
			System.out.println();
		}

	}

}
