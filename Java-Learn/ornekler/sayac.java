package drive;

public class main {

	public static void main(String[] args) {
		// a'yı a'ya ekledi sonra artırma işlemini yaptı
		double a;
		// a=a+(a+1)
		// a=a-(a+1)
		a = 6.5;
		a += a + 1;
		System.out.println(a);
		// 14

		a = 6;
		a /= 2;
		System.out.println(a);
		// 3

		a = 10;
		a = a + 1;
		System.out.println(a);
		// 11

		a = 14;
		a++;
		System.out.println(a);
		// 15

		a = 12;
		a--;
		System.out.println(a);
		// 11

		++a;
		System.out.println(a);
		// 12

		a++;
		System.out.println(a);
		// 13

		a = 12;
		a -= a - 1;
		System.out.println(a);
		// a=a-(a-1)

		double b;
		b = 15;
		b *= b + 1;
		// b=b*(b+1)
		System.out.println(b);

		b = 8;
		b *= b + (b + 2);
		System.out.println(b);
		// b=b*(b+2)

	}

}
