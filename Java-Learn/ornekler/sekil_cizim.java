package algo;

public class main {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println("helloworld");
		}
		// ekrana 5 defa helloworld yazması
		System.out.println("-----------");

//*
//**
//***
//****
//*****

		for (int i = 0; i < 5; i++) { // satır sayısı
			for (int j = 0; j <= i; j++) { // satır sayısı.j'yi satır sayısına sabitledik
				System.out.print("*");

			}
			System.out.println(); // for görevini tamamladıktan sonra bir alt satıra geçmesi için
		}
		// yıldızlardan üçgen yapımı
		System.out.println("-----------------");
		float b = 20.5f;
		int a = (int) b;
		System.out.println(a);
		// tip dönüşümü
		System.out.println("------------");
		int m = 129;
		byte k = (byte) m;
		System.out.println(k);
		// taşma
		System.out.println("-------");
		System.out.println(12f + 32f);
		System.out.println(12 + 32);
		System.out.println(1f / 3f);
		System.out.println(1 / 3);
		System.out.println("------------------");
		int o = 9;
		o += 2; // => o=o+2
		System.out.println(o);
		o %= 2; // o=o%2
		System.out.println(o);
		System.out.println("----------");
		int r = 12;
		r *= 2; // r=r*2
		System.out.println(r);
		System.out.println("-----------");
		int h = 6;
		++h;
		System.out.println(h);
		System.out.println("---------");
		int f = 6;
		f++;
		System.out.println(f);
		System.out.println("------------");
		int e = 12;
		boolean sayı = e < 2;
		System.out.println(sayı);
		System.out.println("----------------");
		int g = 3;
		if (g > 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("------------");
		String metin = "12";
		int z = 12;
		System.out.println(metin + z);
		System.out.println("---------");
		int q = 12;
		int w = 53;
		System.out.println(q < w);
		System.out.println("----------");
		int in = 1, jn = 2, kn = 3;
		if (in > jn) {
			if (in > kn)
				System.out.println("A");
		} else
			System.out.println("B");
		System.out.println("----------------------");
		

	}

}
