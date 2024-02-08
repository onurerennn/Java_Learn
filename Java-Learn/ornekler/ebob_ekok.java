package ornekler;

// ebob ekok  bulma
import java.util.Scanner;

public class main9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayı1 = ");
		System.out.println("sayı2 = ");
		int sayı1 = scan.nextInt();
		int sayı2 = scan.nextInt();
		int k = 2;
		int ebob = 0;
		while (k <= sayı1 && k <= sayı2) {
			if (sayı1 % k == 0 && sayı2 % k == 0)
				ebob = k;
			k++;

		}
		System.out.println("ebob = " + ebob);
		System.out.println("ekok = " + (sayı1 * sayı2) / ebob);
	}

}
