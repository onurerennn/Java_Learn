package örnek21;

import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("metin giriniz");
		String metin = scan.nextLine();
		String sesli = "aeıioöü";
		int sesli_say = 0, sessiz_say = 0, bosluk_say = 1;
		for (int i = 0; i < metin.length() - 1; i++) {
			if (metin.charAt(i) == ' ') {
				bosluk_say++;
			} else {
				for (int j = 0; j < sesli.length() - 1; j++) {
					if (metin.charAt(i) == sesli.charAt(j)) {
						sesli_say++;
					}
				}

			}
		}
		sessiz_say = metin.length() - sesli_say - bosluk_say;
		System.out.println("girilen metin " + bosluk_say + " adet kelimeden oluşmaktadır");
		if (sesli_say >= sessiz_say) {
			System.out.println("bu ne ses");
		} else {
			System.out.println("bu ne sesizlik");
		}
	}
}
