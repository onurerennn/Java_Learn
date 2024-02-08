package örnek32;

import java.util.Random;
import java.util.Scanner;
//sayı tahmin oyunu
public class main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Random rnd = new Random();
		String[] oyun = { "taş", "kağıt", "makas" };
		int pc = rnd.nextInt(3);
		System.out.println("taş=0,kağıt=1,makas=2");
		int oyuncu = klavye.nextInt();
		System.out.println("bilgisayar = " + pc);
		System.out.println("siz = " + oyuncu);
		if (pc == 0 && oyuncu == 2 || pc == 1 && oyuncu == 0 || pc == 2 && oyuncu == 1) {
			System.out.println("kaybettiniz");
		} else if (pc == 0 && oyuncu == 1 || pc == 1 && oyuncu == 2 || pc == 2 && oyuncu == 0) {
			System.out.println("kazandınız");
		} else {
			System.out.println("berabere");
		}

	}
}
