package metot_1;

import java.util.Scanner;

public class SumPrime_sayısı {
//Klavyeden girilen bir sayının rakamları toplamı bir asal sayıya eşit ise bu sayıya SumPrime sayısı denir.
// Parametre olarak klavyeden girilen sayıyı alıp geriye sayının rakamları toplamını döndüren ve parametre olarak sayının rakamları 
//toplamını alıp geriye asal olup olmadığını döndüren fonksiyonları tasarlayıp bu fonksiyonları test ediniz.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayıyı girin");
		int sayı = sc.nextInt();
		sumprime(sayı);
		int top = sumprime(sayı);
		System.out.println("girilen sayının rakamları toplamı =  "+top);
		asal_mı(top);
	}

	public static int sumprime(int a) {
		int toplam = 0,kalan=0;
		while(a!=0) {
			kalan=a%10;
			toplam+=kalan;
			a=a-kalan;
			a=a/10;
		}
		

		return toplam;
	}
	public static boolean asal_mı(int a) {
		boolean asalmı = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				asalmı = false;
				break;
			}
		} 	
		if (asalmı == true) {
			System.out.println("sum prime sayı");
		} else
			System.out.println("değil");
		return true;
	}

}
