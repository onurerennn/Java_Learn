package metot_1;

import java.util.Scanner;

//Her basamağın, sayının basamak sayısı kadar kuvvetinin alınıp toplanmaları ile elde edilen sonuç o sayıya eşit ise,
//sayıya Armstrong sayı denir. Kullanıcı tarafından girilen bir sayının Armstrong sayı olup olmadığını bulan programı 
//fonksiyonlar kullanarak tasarlayınız.
//örnek = 153 = 1^3 + 5^3 + 3^3 = 153 Armstrong bir sayıdır.
public class Armstrong_sayı {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kontrol edilecek sayıyı girin");
		int sayı = sc.nextInt();
		if (sayı == arm(sayı)) {
			System.out.println("sayı armstrong sayı");
		} else {
			System.out.println("sayı armstrong sayı değil");
		}

	}

	public static int arm(int a) {
		int top = 0, ae = a, kalan = 0, basamak_adeti = 0;
		while (a != 0) {
			kalan = a % 10;
			basamak_adeti++;
			a = a - kalan;
			a = a / 10;

		}
		int kalany = 0;

		while (ae != 0) {
			kalany = ae % 10;
			top = top + (int) ((Math.pow(kalany, basamak_adeti)));
			ae = ae - kalany;
			ae = ae / 10;

		}
		return top;

	}

}
