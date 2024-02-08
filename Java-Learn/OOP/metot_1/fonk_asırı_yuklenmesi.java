package metot_1;

import java.util.Scanner;

//void veya return olamsı önemli değil
public class fonk_asırı_yuklenmesi {
//tüm fonk aynı isme sahip oluyor
	//farlı  sayıda parametre alabilir
	//fonk kendini çalıştırırken İMZASINA bakar
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("birinci sayıyı girin");
		int sayi1 = sc.nextInt();
		System.out.println("ikinci sayıyı girin");
		int sayi2 = sc.nextInt();
		System.out.println("üçüncü sayıyı girin");
		int sayi3 = sc.nextInt();
		topla();
		topla(sayi1, sayi2);
		topla(sayi1, sayi2, sayi3);
		//değişkenlerin tipi değiştirilerekte aşırı yüklenebilir
		System.out.println("dördüncü sayıyı girin");
		double sayi4 = sc.nextDouble();
		System.out.println("beşinci sayıyı girin");
		double sayi5 = sc.nextDouble();
		topla(sayi4, sayi5);
	}

	public static void topla() {
		System.out.println("toplanacak sayı bulunamadı");
	}

	public static void topla(int a, int b) {
		System.out.println("klavyeden girilen iki sayının toplamı = " + (a + b));
	}
	public static void topla(double a,double b) {
		System.out.println("kalvyeden girilen iki ondalıklı sayının toplamı = "+(a+b));
	}

	public static void topla(int a, int b, int c) {
		System.out.println("klavyeden girilen üç sayının toplamı = " + (a + b + c));
	}
	

}
