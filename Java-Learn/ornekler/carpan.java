package örnek6;

public class main {

	public static void main(String[] args) {
		int toplam = 0;
		int sayı = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0 && i % 7 == 0 && i % 5 != 0) {

				System.out.println(i);
				toplam = toplam + i;
				sayı++; /// sayı=sayı+1
			}
		}
		System.out.println("toplam = " + toplam);
		System.out.println("adat = " + sayı);
		double ortalama = toplam / sayı;
		System.out.println("ortalama = " + ortalama);

	}

}
