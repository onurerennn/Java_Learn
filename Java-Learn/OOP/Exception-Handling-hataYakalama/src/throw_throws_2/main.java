package throw_throws_2;

//kendimiz oluşturacağız
public class main {

	public static void main(String[] args) throws BankaIstisna {

		System.out.println("program başlatıldı");

		try {
			Banka.musterHesapontrol("12233");

		} catch (BankaIstisna e) {

			System.out.println("HATA : " + e.getMessage());
		}

		System.out.println("program bitti");

	}

}
