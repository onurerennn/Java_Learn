package ornekler;

public class enbPalindrom {
	/*
	 * Palindromik bir sayı her iki şekilde de aynı şeyi okur. 2 basamaklı iki
	 * sayının çarpımından elde edilen en büyük palindrom 9009=91×99'dur. 3
	 * basamaklı iki sayının çarpımından oluşan en büyük palindromu bulun.
	 */
	public static void main(String[] args) {

		int enBuyukPalindrom = 0;
		int a = 0;
		int b = 0;

		for (int i = 100; i <= 999; i++) {
			for (int j = i; j <= 999; j++) {
				int carpim = i * j;
				if (isPalindrom(carpim) && carpim > enBuyukPalindrom) {
					enBuyukPalindrom = carpim;
					a = i;
					b = j;
				}
			}
		}

		System.out.println(a + " x " + b + " = " + enBuyukPalindrom);
	}

	public static boolean isPalindrom(int sayi) {
		String sayiStr = Integer.toString(sayi);
		String tersSayiStr = new StringBuilder(sayiStr).reverse().toString();
		return sayiStr.equals(tersSayiStr);
	}
}