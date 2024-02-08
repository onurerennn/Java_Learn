package Interface_Demo_3;

public interface IFrontEnd {

	public static final boolean isFrontEnd = true;

	public void isFrontEnd();

	default void mesajFrontEnd() {
		System.out.println("default FrontEnd ekibi");
	}

	static void mesajFrontEnd1() {
		System.out.println("static FrontEnd ekibi");
	}

}
