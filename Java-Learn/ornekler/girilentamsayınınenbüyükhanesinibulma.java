package ornekler;

import java.util.Scanner;

public class girilentamsayınınenbüyükhanesinibulma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		String a = Integer.toString(sayı);
		char[] dizi = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			dizi[i] = a.charAt(i);

		}

		System.out.println("---------------");
		int t = 0;
		int[] dizi2 = new int[a.length()];
		for (int i = 0; i < a.length(); i++) {
			dizi2[i] = Character.getNumericValue(dizi[i]);
			System.out.println(dizi2[i]);
			t = t + dizi2[i];
		}
		System.out.println("----------------");
		System.out.println("sayıların toplamı = " + t);
		System.out.println("---------------------");
		int enb = 0;
		for (int i = 0; i < a.length(); i++) {
			if (dizi2[i] > enb) {
				enb = dizi2[i];
			}
		}
		System.out.println("en büyük rakam = " + enb);
	}

}
