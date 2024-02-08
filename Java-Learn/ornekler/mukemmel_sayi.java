package ornekler;

import java.util.Scanner;

//mükemmel sayı
public class main13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		int top = 0;
		for (int i = 1; i < sayı; i++) {
			if (sayı % i == 0) {
				top += i;
			}
		}
		if (sayı == top) {
			System.out.println("mükemmel sayı");
		} else {
			System.out.println("mükemmel sayı değildir");
		}
	}

}
