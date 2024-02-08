package ornekler;

public class palindromsayı {

	public static void main(String[] args) {

		int i, j;
		String duz;
		String ters;
		for (i = 1000; i < 10000; i++) {

			duz = Integer.toString(i);
			ters = "";
			for (j = duz.length() - 1; j >= 0; j--) {

				ters += duz.charAt(j);

			}
			if (duz.equals(ters)) {
				System.out.print(i + "-");
			}
		}
	}

}
