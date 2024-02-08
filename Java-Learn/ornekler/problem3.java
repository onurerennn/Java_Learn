package ornekler;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner giriş = new Scanner(System.in);
		System.out.println("satış miktarı = ");
		int satışMiktarı = giriş.nextInt();
		final int sabitÜcret = 15;
		double ücret;
		if (satışMiktarı < 50) {
			ücret = sabitÜcret + (satışMiktarı * 1);
			System.out.println(ücret);
		} else {
			ücret = sabitÜcret + (50 * 2) + ((satışMiktarı - 50) * 3);
			System.out.println(ücret);

		}

	}
}
