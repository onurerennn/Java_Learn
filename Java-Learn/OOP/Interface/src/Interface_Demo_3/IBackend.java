package Interface_Demo_3;

public interface IBackend {
	public static final boolean isBackEnd = true;

	public void isBackEnd();

	default void mesajBackEnd() {
		System.out.println("default backend ekibi");
	}

	static void mesajBackEnd1(String mesaj) {
		System.out.println("static backend ekibi");
	}

}
