package örnek10;

public class main {
// ilk 50 asal sayı
	public static void main(String[] args) {
		int sayı = 3;
		System.out.println("ilk 50 asal sayı");
		System.out.println("2");
		boolean asal_mi = true;
		for (int i = 2; i <= 50;) {
			for (int j = 2; j <= Math.sqrt(sayı); j++) {
				if (sayı % j == 0) {
					asal_mi = false;
					break;
				}
			}
			if (asal_mi != false) {
				System.out.println(sayı);
				i++;
			}
			sayı++;
			asal_mi = true;
		}

	}

}
