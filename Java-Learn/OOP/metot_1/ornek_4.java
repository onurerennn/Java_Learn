package metot_1;

import java.util.Scanner;

public class ornek_4 {
	// Parametre olarak yazdırmak istediğiniz mesajı ve ekrana kaç kez
	// yazdırılması gerektiğini alan fonksiyonu uygun şekilde oluşturunuz.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("yazdırmak istediğniz mesajı girin");
		String mesaj = sc.nextLine();
		System.out.println("kaç kere yazılmasını istiyorsunuz");
		int adet = sc.nextInt();
		cevap(adet, mesaj);
	}

	public static void cevap(int a, String mesaj) {
		for (int i = 0; i < a; i++) {
			System.out.println(mesaj);
		}

	}


}
