package dıkdortgen;

public class main {
	/*
	 * en, boy ve yukseklik özelliklerine sahip Kutu adında bir sınıf tasarlayınız.
	 * Daha sonra TestKutu adında bir uygulama ile bir kutu örneğinin hacmini
	 * hesaplayınız.
	 */
	public static void main(String[] args) {

		Kutu k1 = new Kutu();
		k1.setBoy(3);
		k1.setEn(4);
		k1.setYukseklık(5);
		System.out.println(k1.hacim());
	}

}
