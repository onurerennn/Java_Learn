package ornekler;

import java.util.Random;
import java.util.Scanner;

public class girilensayıyınistenensayıyagörekuvettiolupolmama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		int sayıı = sayı;
		System.out.println("hangi sayının kuvveti isteniyor");
		int n = sc.nextInt();
		for (int i = n; i <= sayı; i++) {
			sayı = sayı / n;
		}
		
		if (sayı % n == 0) {
			System.out.println(n + " "  + "'nin kuvveti");
		} else {
			System.out.println(n + " "  + "'nin kuvveti değil");
		}

	}

}
