package ornekler;

public class matrisdekenküçüküçüksayınınindisinibulma {
	public static void main(String[] args) {
		int[][] matris = { { 100, 20, 300 }, { 44, 55, 666 }, { 44, 55, 666 }, { 10, 11, 12 } };
		int enk = matris[0][0];
		int a = 0, b = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%-4d", matris[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (matris[i][j] < enk) {
					enk = matris[i][j];
					a = i;
					b = j;
				}

			}
		}
		System.out.println("en küçük eleman " + a + " " + b + " indislerindeki elemandır " + enk);

	}
}
