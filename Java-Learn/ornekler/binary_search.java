package örnek4;
//binary search
import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("tahmin = ");
		int sayı[] = new int[100];
		for (int i = 0; i < 100; i++) {
			sayı[i] = i;

		}
		int hedef = Scan.nextInt();
		int sol = sayı[0];
		int sağ = sayı[99];
		int tahmin;
		int temp;

		for (int i = 0; i < 7; i++) {

			tahmin = (sol + sağ) / 2;
			if (tahmin == hedef) {
				System.out.println(i + ". tahmin" + tahmin);
				System.out.println("doğru");
				break;
			} else if (tahmin < hedef) {
				System.out.println(i + ". tahmin" + tahmin);
				sol = tahmin + 1;

			} else {
				System.out.println(i + ". tahmin" + tahmin);
				sağ = tahmin - 1;
			}

		}

	}

}
