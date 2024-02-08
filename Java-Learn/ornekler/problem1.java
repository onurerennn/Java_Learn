package örnek2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ay giriniz");
		System.out.println("makine sayısı giriniz");
		int ay = input.nextInt();
		int makina = input.nextInt();

		int süre;
		int aralık;

		if (ay > 2 && ay < 9) {
			süre = 480;
			aralık = 45;

		} else {
			süre = 480;
			aralık = 30;

		}
		for (int i = makina; i > 0; i--) {
			System.out.print(süre + "-");
			süre = süre - aralık;

		}

	}

}
