package metot_1;

import java.util.Scanner;

public class ebob_ekok {
//Parametre olarak girilen 2 sayının EBOB ve EKOK’unu bulan fonksiyonları yazınız.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("birinci sayıyı girin");
		int sayi_1 = sc.nextInt();
		System.out.println("ikinci sayıyı girin");
		int sayi_2 = sc.nextInt();
		System.out.println("ebob = " + ebob(sayi_1, sayi_2));
		System.out.println("ekok = " + ekok(sayi_1, sayi_2));

	}

	public static int ebob(int a, int b) {
		int enb = 0, ebob = 0;
		if (a > enb)
			enb = a;
		else
			enb = b;
		for (int i = 2; i <= enb; i++) {
			if (a % i == 0 && b % i == 0) {
				ebob = i;
			}
		}
		return ebob;
	}

	public static int ekok(int a, int b) {
		int ekok = a * b / ebob(a, b);
		return ekok;
	}

}
