package ornekler;

import java.util.Scanner;

public class isim_soyisim_ayırma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("isim soyisim girin");
		String as = sc.nextLine();
		String isim = as.substring(0, as.indexOf(" "));
		System.out.println("isim = " + isim);
		String soyisim = as.substring(as.indexOf(" "));
		System.out.println("soyisim = " + soyisim);
	}

}
