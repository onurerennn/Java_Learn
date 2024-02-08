package ornekler;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

//(dizide en büyük bulma)
public class main11 {
	public static void main(String[] args) {
		int[] deste = new int[52];
		String[] gruplar = { "maça", "kupa", "karo", "sinek" };
		String[] sıralar = { "1", "2", "3", "4", "5", "6", "8", "9", "10", "vale", "kız", "papaz" };
		for (int i = 0; i < deste.length; i++) {
			deste[i] = i;
		}
		for (int i = 0; i < deste.length; i++) {
			int index = (int) Math.random() * deste.length;
			int temp = deste[i];
			deste[i] = deste[index];
			deste[index] = temp;

		}
		for (int i = 0; i < 4; i++) {
			String grup = gruplar[deste[i] / 13];
			String sıra = sıralar[deste[i] / 13];
			System.out.println("kart numarası " + deste[i] + ":" + sıra + "-" + grup);

		}

	}

}
