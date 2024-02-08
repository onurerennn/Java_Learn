package ornekler;

public class accıı {

	public static void main(String[] args) {

		char c1 = 'A', c2 = 'K';
		int d1 = (int) c2, d2 = (int) c1;
		System.out.printf("::%4c::->::%-4c::\n", c1, c2);
		System.out.println(c2 + "-->" + d2);
		d2--;
		--d2;
		System.out.print("(" + c1 + ">" + c2 + ")" + (char) d2);
		System.out.println((char) d1 + ":" + c1--);
		c1--;
		c1--;
		System.out.printf("%6c-->", --c1);
	}
	
}
