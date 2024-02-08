package metot_1;

import java.util.Scanner;

public class ornek_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("birinci sayıyı girin");
		int sayi = sc.nextInt(); //10 ve 15 satırdaki sayi farklı değşkenler
		arttir(sayi); //değişkenin yaşam ömrü o fonk içinde  //parametrenin içindeki sayı artırılıyor
		System.out.println(sayi);  //burda sayının değeri 10 satırdakı değerle aynı
	}

	public static void arttir(int sayi) {
		sayi++;
		System.out.println(sayi);
	}

}
