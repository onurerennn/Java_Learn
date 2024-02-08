package örnek29;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("satır sayısını girin");
		int satır = klavye.nextInt();
		System.out.println("sütün sayısını girin");
		int sutun = klavye.nextInt();
		int[][] matris = new int[satır][sutun];
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				if (i == j) {
					matris[i][j] = 1;
				} else
					matris[i][j] = 0;
			}
		}
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
	}
}
