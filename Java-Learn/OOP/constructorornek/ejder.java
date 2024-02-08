package constructorornek;

public class Inspimo {
	public static void main(String[] args) {

		BiletSatis b1 = new BiletSatis();
		b1.SeferOzet();
		b1.BiletSat();
		b1.BiletSat();
		b1.BiletSat();
		b1.BiletSat();
		b1.BiletSat();
		b1.SeferOzet();
		b1.BiletIptal();
		b1.SeferOzet();
		System.out.println("---------------------------");
		System.out.println("Yeni Bilet Satılıyor");
		BiletSatis b2 = new BiletSatis("14414415522", "Mustafa Açıkkapı", 5, 150, true, 5);
		b2.SeferOzet();
		b2.BiletSat();
		b2.BiletIptal();

	}
}
