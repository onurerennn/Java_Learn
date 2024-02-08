package metot_1;

import java.util.Scanner;

public class Eslestirme {
//Parametre olarak kullanıcının girdiği cümlede yine kullanıcının seçtiği karakterden kaç tane olduğunu bulup ekrana 
//yazdıran programı fonksiyonlar kullanarak tasarlayınız.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("metin giriniz");
		String metin = sc.nextLine();
		System.out.println("hangi harfi adetini arıyorsunuz");

		char harf = sc.nextLine().charAt(0);
		System.out.println(adet(metin, harf));
	}

	public static int adet(String a, char b) {
		int sayac = 0;
		for (int i = 0; i < a.length(); i++) {
			if (b == (a.charAt(i))) {
				sayac++;
			}

		}

		return sayac;
	}

}
