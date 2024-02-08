package ornekler;

import java.util.Random;
import java.util.Scanner;

public class çekiliş {

	public static void main(String[] args) {
		/*
		 * 
		 * Bir bölümdeki 300 öğrencinin öğrenci numaraları 2023100, 2023101, 2023102,
		 * ,2023398, 2023399 şeklindedir. b) Bu bölümden rastgele seçilecek n adet
		 * öğrenci teknik geziye götürülecektir. c) Rastgele seçilen öğrencilerin
		 * numarası liste isimli diziye kaydedilecektir. d) Seçilen öğrenci numaraları
		 * alt alta konsol ekranında gösterilecektir. e) Programın adı OgrenciSecme
		 * olacaktır.
		 */
		int[] ogrn = new int[300];
		for (int i = 0; i < ogrn.length; i++) {
			ogrn[i] = 2023100 + i;
		}
		for (int i = 0; i < ogrn.length; i++) {
			System.out.println((i + 1) + ".öğrenci " + ogrn[i]);
		}

		System.out.println("------------");
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("kaç adet öğrenci gidecek =");
		int n = sc.nextInt();
		int[] liste = new int[n];

		for (int i = 0; i < liste.length; i++) {
			liste[i] = (int) (rnd.nextInt(299));
		}

		for (int i = 0; i < liste.length; i++) {
			ogrn[i] = liste[i];
		}
		for (int i = 0; i < liste.length; i++) {
			System.out.println((i + 1) + ".öğrenci = " + (2023100 + ogrn[i]));
		}
	}

}
