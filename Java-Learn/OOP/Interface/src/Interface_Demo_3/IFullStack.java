package Interface_Demo_3;

public interface IFullStack {

	public static final boolean isFullStack = true;

	public void isFullStack();

	default void FullStack() {
		System.out.println("default FullStack ekibi");
	}

	static void mesajFullStack1() {
		System.out.println("static FullStack ekibi");
	}

}
