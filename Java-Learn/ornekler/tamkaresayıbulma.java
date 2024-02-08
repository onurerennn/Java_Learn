package ornekler;

import java.util.Scanner;

public class tamkaresayıbulma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 10; i < 1000; i++) {
			if (i % Math.sqrt(i) == 0) {
				System.out.println(i);
			}
		}
		System.out.println("---------");
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		if(sayı%Math.sqrt(sayı)==0) {
			System.out.println("sayı tam kare sayıdır");
			
		}
		else {
			System.out.println("tam kare sayı değildir");
		}
	}

}
