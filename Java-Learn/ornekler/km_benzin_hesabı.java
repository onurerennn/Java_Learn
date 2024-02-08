
import java.util.Scanner;
//km ye göre benzin hesabı
public class main {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("lt girin");
		int n = Scan.nextInt();
		int toplam = 200;
		if (n <= 100) {
			System.out.println(toplam);
			return;
		}

		else if (n <= 150) {
			System.out.println(toplam + (n - 100) * 0.6);

			return;
		} else if (n <= 200) {
			System.out.println(toplam + ((50) * 0.6) + ((n - 150) * 0.5));
			return;
		} else if (n > 200) {
			System.out.println(toplam + ((50) * 0.6) + ((50) * 0.5) + ((n - 200) * 0.4));
		}

	}

}




