package throw_throws_2;

public class Banka {

	public static void musterHesapontrol(String musteriNo) throws BankaIstisna {

		if (musteriNo.equals("123456789")) {
			System.out.println("doğru");
		} else {
			throw new BankaIstisna("müşteri hesabı geçersiz");
		}

	}

}