package dosyaokuma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {

		// dosya yapısı
		// 1-) dosya oluşturulması (kaydedilebilir)
		// 2-) dosya yazma içerik ekleme
		// 3-) dosya okuma işlemleri
		// dosya kapatma
		// dosya silme işlemi

		dosyaOlusturma();
		dosyaYazma();
		dosyaYazma2(); // herşeyi siler ve üstüne yazar
		dosyaYazma3(); // üste yazmaya devam eder
		dosyaYazma4();
		dosyaYazma5();
		dosyaOku();
		dosyaOku2();
		dosyaOku3();
		
	}

	// dosya oluşturulması
	public static void dosyaOlusturma() throws IOException { // yoksa hata ver
		String pathname = "C:/Users/ASUS/OneDrive/Masaüstü/javainsoop/dosyaokuma/src/deneme.txt"; // uzun yol
		File dosya = new File(pathname); // file sınıfını kullandık
		try {
			boolean dosyadurumu = dosya.createNewFile();// dosya oluştur

			if (dosyadurumu) {
				System.out.println("yeni dosya oluşturuldu");
			} else {
				System.out.println("aynı isimli dosya mevcut");
			}

		} catch (Exception e) {
			e.getStackTrace();

		}
		System.out.println("dosya oluşturma gerçeleştirildi");
	}
									// <<<<<<<<dosya yazma işlemleri>>>>>>>>>>>>>

	// filewrite, printwrite , outstring (farklı yolar)

	// FileWriter
	public static void dosyaYazma() throws IOException {

		String pathname = "src/deneme.txt"; // kısa yol
		File dosya = new File(pathname);
		try {
			FileWriter fw = new FileWriter(dosya);

			for (int i = 0; i < 11; i++) {
				fw.write(i + " " + "\n");
			}
			fw.close();// kapatılmalı

		} catch (Exception e) {

			e.getStackTrace();
		}
		System.out.println("FileWriter ile dosya yazma ile gerçekleştirildi");

	}

	// FileWriter append true ile
	public static void dosyaYazma3() throws IOException {

		String pathname = "src/deneme.txt"; // kısa yol
		File dosya = new File(pathname);
		try {
			FileWriter fw = new FileWriter(dosya, true);

			for (int i = 0; i < 11; i++) {
				fw.write(i + " " + "\n");
			}
			fw.close();// kapatılmalı

		} catch (Exception e) {

			e.getStackTrace();
		}
		System.out.println("FileWriter append ile dosya yazma ile gerçekleştirildi");

	}

	// printwrite
	public static void dosyaYazma2() throws IOException {
		String pathname = "src/deneme.txt";
		File dosya = new File(pathname);
		try {
			PrintWriter pw = new PrintWriter(dosya);
			pw.println("deneme");
			pw.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println("PrintWriter ile dosya yazma ile gerçekleştirildi");

	}

	// FileOutStream
	public static void dosyaYazma4() throws IOException {

		String pathname = "src/deneme.txt"; // kısa yol
		File dosya = new File(pathname);
		String mesaj = "FileOutStream denemesi yapılıyor";
		try {
			FileOutputStream fw = new FileOutputStream(dosya);

			fw.write(mesaj.getBytes());
			fw.close();// kapatılmalı

		} catch (Exception e) {

			e.getStackTrace();
		}
		System.out.println("FileOutStream ile dosya yazma ile gerçekleştirildi");

	}

	//// FileOutStream append true ile
	public static void dosyaYazma5() throws IOException {

		String pathname = "src/deneme.txt"; // kısa yol
		File dosya = new File(pathname);
		String mesaj = "FileOutStream denemesi yapılıyor";
		try {
			FileOutputStream fw = new FileOutputStream(dosya, true);

			fw.write(mesaj.getBytes());
			fw.close();// kapatılmalı

		} catch (Exception e) {

			e.getStackTrace();
		}
		System.out.println("FileOutStream append true ile dosya yazma ile gerçekleştirildi");

	}
								// <<<<<dosya okuma işlemleri >>>>>>

	// fileReader ile
	public static void dosyaOku() throws IOException {
		File dosya = new File("src/deneme.txt");
		try {
			FileReader fr = new FileReader(dosya);
			int i= fr.read();
			while(i!=-1) { //-1 son
				System.out.print((char)i);//char demesek ascı okur
				i= fr.read();

			}
			
			
			fr.close();

		} catch (Exception e) {
			e.getStackTrace();
			
		}
		System.out.println("FileReader ile dosya okuma gerçekleştirildi");

	}
	
	//Scanner ile okuma
	public static void dosyaOku2() throws IOException {
		File dosya = new File("src/deneme.txt");
		try {
			Scanner oku = new Scanner(dosya);
			String i;
			//System.out.println(oku.hasNext()); //true yazar (yani okunabilir)
		while(oku.hasNext()) {
			 i= oku.next(); //ne olduğu belli değil
			System.out.print(i+" ");
		}
		oku.close();
		} catch (Exception e) {
			e.getStackTrace();
			
		}
		System.out.println("Scanner sınıfı ile dosya okuma gerçekleştirildi");

	}
	
	//FileInputStream   ile
	public static void dosyaOku3() throws IOException {
		File dosya = new File("src/deneme.txt");
		
		try {
			FileInputStream oku = new FileInputStream(dosya);
			int i = oku.read();
			while(i!=-1) {
				System.out.print((char)i);
			i=oku.read(); //ilkini okduktan sonra devam et
			}
			oku.close();
		
		} catch (Exception e) {
			e.getStackTrace();
			
		}
		System.out.println("");
		System.out.println("FileInputStream ile dosya okuma gerçekleştirildi");

	}
	

}
