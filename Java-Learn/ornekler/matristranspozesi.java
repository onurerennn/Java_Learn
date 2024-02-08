package ornekler;

import java.util.Random;
import java.util.Scanner;

public class matristranspozesi {

	public static void main(String[] args) {
//kullanıcın giridiği m*n boyutunda matris oluşturup
// matrisi rastegele sayılarla doldurup
// matrisin transpozesini bulun(satır ve sütün yer değiştirmesi)
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("satır sayısını girin");
		int satır = sc.nextInt();
		System.out.println("sütün sayısını girin");
		int sutun = sc.nextInt();
		int[][] matris = new int[satır][sutun];
		for (int i = 0; i < satır; i++) {
			for (int j = 0; j < sutun; j++) {
				matris[i][j] = rnd.nextInt(5);
				System.out.printf("%-3d", matris[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nmatris transpzesi");
		int t[][] = new int[sutun][satır];
		for (int i = 0; i < sutun; i++) {
			for (int j = 0; j < satır; j++) {
				t[i][j] = matris[j][i];
				System.out.printf("%-3d", t[i][j]);
			}
			System.out.println();
		}

	}

}
