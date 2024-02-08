package ornekler;
//çift palindrom bulma 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ciftpalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı girin");
		int sayi =sc.nextInt();
		if(tabandonusumu(sayi)&&palindrom(sayi)) {
			System.out.println("çift palindrom");
		}
		else {
			System.out.println("çift palindrom değil");
		}
		
		

	}
	
	public static boolean tabandonusumu(int n) { //2 lik tabana çevrime 
		ArrayList <Integer> dizi = new ArrayList();
		ArrayList <Integer> dizi2 = new ArrayList();

		int mod=0;
		int i=0;
		while(n>0) {
			mod=n%2;
			n=n/2;
			dizi.add(mod);
			dizi2.add(mod);
			i++;
		}

		Collections.reverse(dizi);
		for (Integer dizii : dizi) {
		//	System.out.print(dizii+" ");
		}
		//System.out.println();
		for (Integer dizii : dizi2) {
			//System.out.print(dizii+" ");
		}
		//System.out.println();
		if(dizi.equals(dizi2)) {
		//	System.out.println("2 lik tabanda palindrom");
			return true;
		}
		else {
			//System.out.println("2 lik tabanda palindrom değil");
			return false;
		}
	}
	
	public static boolean palindrom(int n) {
		ArrayList <Integer> dizi2 = new ArrayList();
		int sayi = n;
		int kalan =0;
		while(n>0) {
			kalan=n%10;
			n=n-kalan;
			n=n/10;
			dizi2.add(kalan);
			
		}
		for (Integer integer : dizi2) {
		//	System.out.println(integer);
		}
	
        int birleşmişsayı = combineArrayListElements(dizi2);
        
        System.out.println(birleşmişsayı);
        if(birleşmişsayı==sayi) {
        	//System.out.println("palindrom sayı");
        	return true;
        }
        else {
       // System.out.println("palindrom sayı değil");
        return false;
        }
		
	}
	public static int combineArrayListElements(ArrayList<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();

        // ArrayList elemanlarını sırayla birleştir
        for (Integer num : list) {
            stringBuilder.append(num);
        }

        // Birleştirilmiş tam sayıyı elde et
        return Integer.parseInt(stringBuilder.toString());
    }
	
	
}
