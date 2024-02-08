package örnek20;

//girilen kelimenin tersini bulma
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("bir metin giriniz = ");
		Scanner scan = new Scanner(System.in);
		String kelime = scan.nextLine();
		String ters = "";
		for (int i = kelime.length() - 1; i >= 0; i--) {
			ters = ters + kelime.charAt(i);
		}
		System.out.println(ters);
	}

}
