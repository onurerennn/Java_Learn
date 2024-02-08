package örnek16;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n değeri girin");
		int n = scan.nextInt();
		double top = 0;
		for (double i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				top = top + (1 / ((2 * i) - 1));
			} else {
				top = top - (1 / ((2 * i) - 1));
			}
		}
		System.out.println("girilen n değerine göre serinin toplamı = " + (5 * top));
	}

}
