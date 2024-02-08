package TV;



public class main {

	public static void main(String[] args) {
		TV tv = new TV();

		tv.ac();
		tv.setKanal(22);
		tv.kanalyukari();
		tv.setSes(4);
		tv.sesArttir();
		tv.kapat();

		System.out.println("---------------------------------");

		TV tv1 = new TV(11, 2);

		tv1.ac();
		tv1.kanalAsagi();
		tv1.sesAzalt();
		tv1.kapat();

	}

}
