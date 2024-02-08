package ornekler;

public class matristekideğerleriküçüktenbüyüğesıralama {

	public static void main(String[] args) {
		int[][] matris = { { 100, 20, 300 }, { 44, 55, 666 }, { 44, 55, 666 }, { 10, 11, 12 } };
		// matris yazdırma
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%-4d", matris[i][j]);
			}
			System.out.println();

		} // matris yazdırma
		System.out.println("--------------------------");
		// matrisi diziye aktarma
		int[] dizi = new int[4 * 3];
		int sayac = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				dizi[sayac] = matris[i][j];
				sayac++;
			}
		} // matrisi diziye aktarma

		// diziyi yazdırma
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		} // diziyi yazdırma
		System.out.println("---------------------------");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[j] < dizi[i]) {
					int temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}
		sayac = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				matris[i][j] = dizi[sayac];
				sayac++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%-4d", matris[i][j]);
			}
			System.out.println();
		}

	}

}
