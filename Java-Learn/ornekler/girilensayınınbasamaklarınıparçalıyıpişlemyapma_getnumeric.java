package ornekler;

import java.util.Random;
import java.util.Scanner;

public class girilensayınınbasamaklarınıparçalıyıpişlemyapma_getnumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		String a = Integer.toString(sayı);
		char[] m = new char[sayı];
		for (int i = 0; i < a.length(); i++) {
			m[i] = a.charAt(i);
		}
		int[] d = new int[sayı];
		for (int i = 0; i < a.length(); i++) {
			d[i] = Character.getNumericValue(m[i]);
		}
		int top = 0;
		int t = 0, f = 0;
		for (int i = 0; i < a.length(); i++) {
			top += d[i];
			t = d[i] * d[i] * d[i];
			f += t;
		}
		System.out.println("basamaklarının küpleri toplamı = " + f);
		System.out.println("rakamları toplamı =" + top);

	}

}
