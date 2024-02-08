package InterfaceDemo;

public interface IEKitapOlustur {
public static final String EKitapKaitesikalitesi=".pdf";
	
	
	public void EKitapOlustur();
	
	default void EKitapOlustur2() {
		
		System.out.println("e kitap oluşturuldu");
	}
}
