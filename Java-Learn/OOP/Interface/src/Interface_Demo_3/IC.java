package Interface_Demo_3;

public interface IC {

	public static final boolean isC = true;

	public void isC();

	default void C() {
		System.out.println("default C ekibi");
	}

	static void mesajC1() {
		System.out.println("static C ekibi");
	}


}
