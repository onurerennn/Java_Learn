package metot_1;

import java.util.Scanner;

//Bir Palindrome sayının rakamları toplamı bu sayıyı tam bölebiliyorsa bu sayıya SuperPalindrome Sayı denir. 
//Kullanıcının girdiği bir sayının SuperPalindrome sayı olup olmadığını bulan programı fonksiyonlar kullanarak test ediniz.
public class Super_palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		palindrom_mu(sayı);
		if (palindrom_mu(sayı) == true) {
			if (sayı % top(sayı) == 0) {
				System.out.println("süper palindrom");

			} else {
				System.out.println("süper palindrom değil");
			}
		} else {
			System.out.println("süper palindrom değil");
		}

	}

	public static boolean palindrom_mu(int a) {
		int aeski = a;
		int ters = 0, kalan = 0;
		while (a != 0) {
			kalan = a % 10;
			a = a - kalan;
			a = a / 10;
			ters = (ters * 10) + kalan;

		}

		if (aeski == ters) {

			return true;
		} else {

			return false;
		}

	}

	public static int top(int a) {
		int top = 0, kalan = 0;
		while (a != 0) {
			kalan = a % 10;
			top += kalan;
			a = a - kalan;
			a = a / 10;
		}
		return top;

	}

}
 