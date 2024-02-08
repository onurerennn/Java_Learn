package ornekler;

import java.util.Scanner;

public class hakverilipsayıtahmini {
	/*
	 * 10 sefer hakkınız var Kullanıcının tahminine göre tahmini yükselt yada
	 * tahmini azalt diyerek yönlendirme yapacak. Bulduğu sefer sayısını ekrana
	 * basacak veya üzgünüz bir daha ki sefere diyecek.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı tahmin edin");
		int pc = (int) (Math.random() * 100);
		int sen = sc.nextInt();
		int hak = 10;
		int s = 1;
		while (hak > 1) {
			if (sen == pc) {
				System.out.println("doğru bildiniz");
				System.out.println(s + "defada buldunuz");
				return;
			} else if (sen < pc) {
				System.out.println("daha büyük tahmin edin");
				sen = sc.nextInt();
				hak--;
			} else {
				System.out.println("daha küçük tahmin edin");
				sen = sc.nextInt();
				hak--;
			}
			s++;
		}
		System.out.println("hakkınız bitti");
		System.out.println("cevap " + pc + " olacaktı");
	}

}
