package metot_1;

import java.util.Scanner;

public class ornek_2 {
//iç içe metot kullandık
	//bir fonk cıktısı başka fonk giridisi oalbilir
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("birinci sayıyı girin");
		int sayi1=sc.nextInt();
		System.out.println("ikinci sayıyı girin");
		int sayi2=sc.nextInt();
		//if'in default değeri true dur
		if(kontrol_et(sayilari_topla(sayi1, sayi2))) //==true ile aynı şey  //ilk önce içteki fonk çalıştı 
		System.out.println("sayıalrın toplamı çift");
		else
			System.out.println("sayıların toplamı tek");
	}
	public static int sayilari_topla(int a,int b) {
		int toplam = a+b;
		return  toplam;//girdi değer
	}
	public static boolean kontrol_et(int c) {
		if(c%2==0)
			return true;
		else
			return false;//çıktı değer
	}

}
