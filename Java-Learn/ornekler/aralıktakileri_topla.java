package örnek5;

public class main {
//25 ile 50 arası tek sayıları toplamını ve adetini bulma ortalamsı
	public static void main(String[] args) {
		int toplam = 0;
		int teksayı = 0;

		for (int a = 25; a <= 50; a++) {
			if (a % 2 != 0) {
				System.out.println(a);
				toplam = toplam + a;
				teksayı++;

			}

		}
		System.out.println("toplam = " + toplam);
		System.out.println("adeti = " + teksayı);
		double ort = toplam / teksayı;
		System.out.println("ortalaması = " + ort);

	}

}
