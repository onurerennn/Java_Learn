package ornekler;

import java.util.Scanner;

//Girilen decimal (onluk) bir sayının binary (ikilik) bir sayıya dönüştüren program
public class main15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayı = sc.nextInt();
		int b=2;
		int m;
		for(int i=sayı;i>=2;) {
			
			m=sayı%b;
			System.out.print(m);
			sayı=sayı/b;
		}
		
	}

}
