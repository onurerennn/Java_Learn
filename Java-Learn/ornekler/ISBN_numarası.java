package örnek18;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("9 haneli ISBN numarasını girin");
		Scanner klavye = new Scanner(System.in);
		String ilk = klavye.nextLine();
		int isbn = Integer.parseInt(ilk);
		int ara_deger = 9, top = 0, d;
		while (isbn != 0) {
			d = isbn % 10;
			top = top + (d * ara_deger);
			isbn = isbn - d;
			isbn = isbn / 10;
			ara_deger--;
		}
		int d10 = top % 11;
		if (d10 == 10) {
			System.out.println(ilk + "X");
		} else {
			System.out.println(ilk + Integer.toString(d10));
		}
	}

}
