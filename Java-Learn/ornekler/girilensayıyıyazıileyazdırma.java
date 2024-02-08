package ornekler;

import java.util.Scanner;

public class girilensayıyıyazıileyazdırma {

	public static void main(String[] args) {
//kullanıcıdan alınan 4 basamaklı bir sayıyı yazı ile yazma
//3215 girilip "üç bin iki yüz on beş" yazdırılsın
		Scanner sc = new Scanner(System.in);
		System.out.println("4 basamaklı sayı girin = ");
		int sayı = sc.nextInt();
		int br, on, yz, bn;
		char c;
		c = Integer.toString(sayı).charAt(0);
		bn = Integer.parseInt(Character.toString(c));
		System.out.println(bn);

		c = Integer.toString(sayı).charAt(1);
		yz = Integer.parseInt(Character.toString(c));
		System.out.println(yz);

		c = Integer.toString(sayı).charAt(2);
		on = Integer.parseInt(Character.toString(c));
		System.out.println(on);

		c = Integer.toString(sayı).charAt(3);
		br = Integer.parseInt(Character.toString(c));
		System.out.println(br);

		String[] binler = { " ", "bin", "ikibin", "üçbin", "dörtbin", "beşbin", "altıbin", "yedibin", "sekizbin",
				"dokuzbin" };
		String[] yüzler = { " ", "yüz", "ikiyüz", "üçyüz", "dörtyüz", "beşyüz", "altıyüz", "yediyüz", "sekizyüz",
				"dokuzyüz" };
		String[] onlar = { " ", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan" };
		String[] birler = { " ", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz" };
		System.out.println(binler[bn] + " " + yüzler[yz] + " " + onlar[on] + " " + birler[br]);

	}

}
