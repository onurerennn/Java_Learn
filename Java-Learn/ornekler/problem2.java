package ornekler;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("gelir giriniz");
		double vergi;
		double gelir = giris.nextDouble();
		if(gelir<150000000) {
			vergi = gelir*(0.25);
			System.out.println(vergi);
			
		}
		else if(gelir<=300000000) {
			vergi=gelir%30;
			System.out.println(vergi);
		}
		else if(gelir<=600000000) {
			vergi = gelir%35;
			System.out.println(vergi);
			
					
		}
		else if(gelir<=1200000000) {
			vergi=gelir%40;
			System.out.println(vergi);
		}
		else {
			vergi=gelir%50;
			System.out.println(vergi);
					
		}

	}
}
