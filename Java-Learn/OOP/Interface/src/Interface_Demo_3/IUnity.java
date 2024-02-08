package Interface_Demo_3;

public interface IUnity {
	
	public static final boolean isUnity = true;

	public void isUnity();

	default void Unity() {
		System.out.println("default Unity ekibi");
	}

	static void mesajUnity1() {
		System.out.println("static Unity ekibi");
	}

}
