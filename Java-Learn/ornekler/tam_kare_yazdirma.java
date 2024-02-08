package ornekler;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int a = 10;
		int b = 1000;
		for (int i = a; i <= b; i++) {
			
			for (int j =0; j < i/2; j++) {
				if (j * j == i) {
					System.out.println(i);


				}

			}

		}

	}
}
//10 ile 1000 arasındaki tam kareleri yazdırma