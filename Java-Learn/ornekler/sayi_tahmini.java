package ornekler;

import java.util.Scanner;

//sayı tahmini
public class main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("tahmin edin");
		int a = (int) (Math.random() * 101);

		int t = -1;
		while (a != t) {
			t = scan.nextInt();
			if (t == a) {
				System.out.println("doğru");
				break;
			} else if (a < t) {
				System.out.println("büyük");
			} else {
				System.out.println("küçük");
			}
		}

	}

}
