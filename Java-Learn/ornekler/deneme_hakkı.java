import java.util.Scanner;

public class main {
// 5 hak verilip şifre girilmesi
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("şifre girin");
		String sifre = "yazilim2022";
		System.out.println("şifrenizi girin");
		String pass = klavye.nextLine();
		int deneme = 1;
		while (deneme < 6) {
			if (sifre.equals(pass)) {
				System.out.println("tebrikler...Hoş geldiniz");
				break;
			} else {
				deneme++;
				System.out.println("yanlış şifre tekrar deneyin");
				pass = klavye.nextLine();

			}

		}
	}

}
