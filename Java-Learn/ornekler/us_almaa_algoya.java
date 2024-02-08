package örnek17;

import java.util.Scanner;

// üs alma
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("taban girin");
		System.out.println("üs girin");
		int t = scan.nextInt();
		int u = scan.nextInt();
		int ç = t;
		for (int i = 1; i < u; i++) {
			ç = ç * t;

		}
		System.out.println(ç);
	}
}
