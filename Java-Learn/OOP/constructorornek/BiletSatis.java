package constructorornek;

public class BiletSatis {
    // Bilet Satış
    // BiletSatış
    // BiletIptal
    private static int sefer_no=23001;
    private String firma;
    private String arac_plaka;
    private String arac_marka;
    private int arac_kapasite;
    private String yolcu_tc;
    private String yolcu_adsoyad;
    private int koltuk_sayisi;
    private boolean ek_bagaj_var_mi;
    private int ek_bagaj_sayisi;
    private double bilet_fiyat;
    BiletSatis(){
        firma="EJDER";
        arac_plaka="36EJD36";
        arac_marka="MERCEDES";
        arac_kapasite=50;
        yolcu_tc="11111111111";
        yolcu_adsoyad="Ejder Turizm Yolcusu";
        koltuk_sayisi=1;
        ek_bagaj_var_mi=false;
        ek_bagaj_sayisi=0;
        bilet_fiyat=100;
    }
    BiletSatis(String yolcutc,String yolcuadsoyad, int koltuksayisi, double fiyat, boolean ekbagaj, int ekbagajsayisi ){
        
        firma="EJDER";
        arac_plaka="36EJD36";
        arac_marka="MERCEDES";
        arac_kapasite=50;
        yolcu_tc=yolcutc;
        yolcu_adsoyad=yolcuadsoyad;
        koltuk_sayisi=koltuksayisi;
        ek_bagaj_var_mi=ekbagaj;
        ek_bagaj_sayisi=ekbagajsayisi;
        bilet_fiyat=fiyat;
    }
    public void BiletSat(){
        System.out.println("--------------------------------");
        System.out.println("Bilet satışı yapılıyor...");
        double islem_tutari;
        if (AracDurumKontrolOnay(koltuk_sayisi)) {
            islem_tutari=FiyatHesapla(koltuk_sayisi,bilet_fiyat,ek_bagaj_var_mi,ek_bagaj_sayisi);
            int guncel_kapasite=KapasiteGuncelle(koltuk_sayisi);
            IslemOzet("Bilet Satışı Yapıldı.",sefer_no,firma,arac_plaka,arac_marka,yolcu_tc,yolcu_adsoyad,guncel_kapasite,ek_bagaj_var_mi,ek_bagaj_sayisi,islem_tutari);
        }
        else System.out.println("Bilet Satışı Yapılamadı.");
        System.out.println("--------------------------------");        
    }
    public void BiletIptal(){
        System.out.println("--------------------------------");
        System.out.println("Bilet satışı iptal ediliyor...");
        double iade_tutari;
        if (BiletSatisIptalOnay(yolcu_tc)) {
            iade_tutari=FiyatHesapla(koltuk_sayisi,bilet_fiyat,ek_bagaj_var_mi,ek_bagaj_sayisi);
            arac_kapasite=arac_kapasite+koltuk_sayisi;
            IslemOzet("Bilet Satışı İptal Edildi.",sefer_no,firma,arac_plaka,arac_marka,yolcu_tc,yolcu_adsoyad,arac_kapasite,ek_bagaj_var_mi,ek_bagaj_sayisi,iade_tutari);
        }
        else System.out.println("Bilet İptali Yapılamadı.");
        System.out.println("--------------------------------");
    }
    private boolean BiletSatisIptalOnay(String tc){
        boolean onay=false;
        if (tc.equals(yolcu_tc)) {
            onay=true;
        }
        return onay;
    }
    private boolean AracDurumKontrolOnay(int koltuksayisi){
        boolean onay=false;
        if (koltuksayisi<arac_kapasite) {
            onay=true;
        }
        return onay;
    }
    private double FiyatHesapla(int koltuksayisi, double biletfiyati, boolean ekbagaj, int ekbagaj_sayisi){
        double toplam_ucret;
        if (ekbagaj) {
            toplam_ucret=koltuksayisi*biletfiyati+ekbagaj_sayisi*50;
        }
        else { 
            toplam_ucret=koltuksayisi*biletfiyati;
        }
        return toplam_ucret;    
    }
    private int KapasiteGuncelle(int koltuksayisi){
        arac_kapasite=arac_kapasite-koltuksayisi;
        return arac_kapasite;
    }
    public void IslemOzet(String mesaj, int seferno, String firma, String plaka, String marka, String tc, String adsoyad, int koltuksayisi, boolean ekbagaj, int ekbagajsayisi, double islem_total){
        System.out.println("--------------------------------");
        System.out.println(mesaj);
        System.out.println("Sefer No: "+ seferno);
        System.out.println("Firma Bilgisi: "+ firma);        
        System.out.println("Aracın Markası: "+ marka);
        System.out.println("Araç Plakası: "+ plaka);
        System.out.println("Yolcu TC: "+ tc);
        System.out.println("Yolcu Ad-Soyad: "+ adsoyad);
        System.out.println("Ek Bagaj Var mı?: "+ ekbagaj);
        System.out.println("Ek Bagaj Sayısı: "+ ekbagajsayisi);        
        System.out.println("Kalan Koltuk Sayısı: "+ koltuksayisi);
        System.out.println("Toplam İşlem Ücreti: "+ islem_total);
        System.out.println("--------------------------------");
    }
    public void SeferOzet(){
        System.out.println("--------------------------------");
        System.out.println("Sefer No: "+ sefer_no);
        System.out.println("Firma Bilgisi: "+ firma);        
        System.out.println("Aracın Markası: "+ arac_marka);
        System.out.println("Araç Plakası: "+ arac_plaka);
        System.out.println("Araç Kapasitesi: "+ arac_kapasite);
        System.out.println("--------------------------------");
    }
}