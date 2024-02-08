//umlde kesik çizgi ve okun ucu boş
public interface IYasar {
	//defult ve static inteface özgü anahtar kelimeler default erişim belirteci olan değil
	public void yasar(); 

	
	default String mesaj() {//bu şekilde gövdeli tanımlanır
		return "yaşıyor-1";
		
	}
	static String mesaj2() { //bu şekilde gövdeli tanımlanır
		return "yaşıyor-2";
	}
	
}
