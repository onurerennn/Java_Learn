package örnek27;

//fibonacci
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		double[] dizi = new double[10];
		dizi[0] = 0;
		dizi[1] = 1;
		for (int i = 2; i < dizi.length; i++) {
			dizi[i] = dizi[i - 1] + dizi[i - 2];

		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}

}
