package örnek14;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		System.out.println("ahmet oyuna başladı..");
		Random rnd = new Random();
		int a_atis_sayisi = 1, a_zar_top = 0;
		int a_zar1, a_zar2;
		while (a_zar_top != 12) {
			a_zar1 = rnd.nextInt(7) + 1;
			a_zar2 = rnd.nextInt(7) + 1;
			System.out.println(a_zar1 + " " + a_zar2);
			a_zar_top = a_zar1 + a_zar2;
			if (a_zar_top == 12) {
				System.out.println("ali" + a_atis_sayisi + ".atışta tuturdu");
			}
			a_atis_sayisi++;

		}
		System.out.println("haydar oyuna başladı..");

		int h_atis_sayisi = 1, h_zar_top = 0;
		int h_zar1, h_zar2;
		while (h_zar_top != 12) {
			h_zar1 = rnd.nextInt(7) + 1;
			h_zar2 = rnd.nextInt(7) + 1;
			System.out.println(h_zar1 + " " + h_zar2);
			h_zar_top = h_zar1 + h_zar2;
			if (h_zar_top == 12) {
				System.out.println("ahmet " + h_atis_sayisi + ".atışta tuturdu");
			}
			h_atis_sayisi++;

		}
		if (a_atis_sayisi > h_atis_sayisi) {
			System.out.println("haydar kazandı");
		} else {
			System.out.println("ahmet kazandı");
		}

	}

}
