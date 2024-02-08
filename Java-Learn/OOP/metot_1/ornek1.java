package metot_1;

import java.util.Scanner;

public class ornek1 {
//faktöriyeli geriye değer döndüren ve döndürmüyen olarak yazma
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hesaplanacak sayıyı girin");
		int a = sc.nextInt();
		fak1(a);		
		
		
		System.out.println("girilen sayının faktöriyeli = "+fak3(a));
		
		
		System.out.println("girilen sayının faktöriyeli = "+fak2());	
		
		
		
		
	}

	public static void fak1(int a) { //geriye değer döndürmüyen
		int carp = 1;
		for (int i = 1; i <= a; i++) { 
			carp *= i;
		}
		System.out.println("girilen sayının faktöriyeli = "+carp);
	}
	public static int fak2() { //parametresiz değer döndüren
		System.out.println("parametresiz fonk için değer girin");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int carp = 1;
		for (int i = 1; i <= a; i++) {
			carp *= i;
		}
		 return carp;
	}
	public static int fak3(int a) { //parametre değer döndüren
		int carp = 1;
		for (int i = 1; i <= a; i++) {
			carp *= i;
		}
		 return carp;
	}
	

}
