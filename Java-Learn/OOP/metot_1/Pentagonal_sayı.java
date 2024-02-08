package metot_1;

import java.util.Scanner;

public class Pentagonal_sayı {
//Bir Pentagonal Sayı n=1,2,3,…,n için n(3n-1)/2 formülü kullanılarak hesaplanmaktadır. 
	//Parametre olarak n sayısını alıp ilk n Pentagonal sayıyı ekrana yazdıran fonksiyonu tasarlayınız
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("kaç tane pentagonal sayı istiyo");
		int sayi  =sc.nextInt();
		pentagonal(sayi);

	}
	public static void pentagonal(int a) {
		int sayac  =1;
		for(int i=1;i<=a;i++) {
			int c = i*(3*i-1)/2;
			System.out.println(sayac+". pentagonal sayı = "+c);
			sayac++;
		}
		
	}

}
