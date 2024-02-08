package ornekler;

import java.util.Scanner;

// 0 girilene kadar girilen tüm sayıların ortalamasını bulma
public class main7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayı girin");
		int top = 0, adet = 0;
		int a = scan.nextInt();
		while (a != 0) {
			top += a;
			a = scan.nextInt();
			adet++;
		}
		System.out.println("ortalama = " + (top / adet));

	}

}
