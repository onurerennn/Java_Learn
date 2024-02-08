package örnek28;

//tersten yazdırma
public class main {

	public static void main(String[] args) {
		int[] dizi = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int temp;
		for (int i = 0; i < dizi.length / 2; i++) {
			temp = dizi[i];
			dizi[i] = dizi[dizi.length - i - 1];
			dizi[dizi.length - i - 1] = temp;
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
	}
}
