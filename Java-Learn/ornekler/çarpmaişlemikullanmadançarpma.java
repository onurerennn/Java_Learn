package ornekler;

import java.util.Random;
import java.util.Scanner;

public class çarpmaişlemikullanmadançarpma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("1.sayıyı girin = ");
		int sayı1 = sc.nextInt();
		System.out.println("2.sayıyı girin");
		int sayı2 = sc.nextInt();
		int c = 0;
		for (int i = 0; i < sayı2; i++) {
			c += sayı1;
		}
		System.out.println(c);
	}

}
