import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayı girin");
		double n = scan.nextDouble();
		double toplam = 0;
		for (double i = 1; i <= n; i++) {
			System.out.println(1 / i);
			toplam = toplam + (1 / i);

		}
		System.out.println(toplam);
	}

}
