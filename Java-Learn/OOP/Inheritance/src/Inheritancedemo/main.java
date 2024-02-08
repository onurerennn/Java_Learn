package Inheritancedemo;
//uml ınheritancedemo
public class main {

	public static void main(String[] args) {
		Calisanlar c1 = new Calisanlar("cem", "bayram");
		c1.departman="bilgi işlem";
		c1.bilgileriYazdir(); 
		
		GenelMudurluk gm1 = new GenelMudurluk("berkay", "toprak", 5000);
		gm1.departman="genel müdürlük";
		gm1.yillikIzinSayisi=10;
		gm1.bilgileriYazdir();
		
		IsciSinifi isc1 = new IsciSinifi("cengiz", "turan", 25);
		isc1.departman="ekip-1";
		isc1.bilgileriYazdir();  
		
		TeknikPersonel tpc1 = new TeknikPersonel("mustafa", "gür", 20, 1000);
		tpc1.departman="teknik birim";
		tpc1.maas=9000;         //sabit olmak zorunda değil
		tpc1.yillikIzinSayisi=30;//istesek değişebiliriz
		tpc1.bilgileriYazdir();
	}

}
