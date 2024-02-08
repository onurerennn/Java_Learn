package örnek22;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("kelime giriniz");
		String metin = scan.nextLine();
		System.out.println("y = ax+b denklem için a değerini giriniz");
		int a = scan.nextInt();
		System.out.println("y = ax+b denklem için b değerini  giriniz");
		int b = scan.nextInt();
		String affine = "";
		char karakter;
		for (int i = 0; i < metin.length(); i++) {
			karakter = metin.charAt(i);
			if (Character.isLetter(karakter)) {
				affine = affine + (char) (((a * (int) karakter) + b + 'A') % 26 + 'A');
			}
		}
		System.out.println("şifreli metin = " + affine);
	}

}
