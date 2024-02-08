package ornekler;

import java.util.Scanner;

public class main12 {
//girilen kelimenin ince veya kalın sesli olmasaı
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sesli harf girin");
		String harf = sc.next();
		String[] kalın = { "a", "ı", "o", "u" };
		String[] ince = { "e", "i", "ö", "ü" };
		for (int i = 0; i < kalın.length; i++) {
			if (harf.equalsIgnoreCase(kalın[i])) {
				System.out.println("kalın harf girdiniz");
				return;
			}

		}
		for (int j = 0; j < ince.length; j++) {
			if (harf.equalsIgnoreCase(ince[j])) {
				System.out.println("ince harf girdiniz");
				return;
			}
		}
		System.out.println("girdiğiniz harf sesli harf değil");
	}

}
