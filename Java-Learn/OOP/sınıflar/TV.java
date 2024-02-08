package TV;

public class TV {
	 int kanal;
	int sesSeviyesi;
	boolean acik;

	public TV() {

	}

	public TV(int kanal, int sesSeviyesi) {
		this.kanal = kanal;
		this.sesSeviyesi = sesSeviyesi;

	}

	public void ac() {
		if (acik == false) {
			System.out.println("tv açıldı");
		}
	}

	public void kapat() {
		if (acik == false) {
			System.out.println("tv kapandı");
		}

	}

	public void setKanal(int Kanal) {
		this.kanal = Kanal;

	}

	public void setSes(int SesSeviyesi) {
		this.sesSeviyesi = SesSeviyesi;

	}

	public void kanalyukari() {
		if (kanal < 120 && kanal >= 1 &&acik==true) {
			System.out.println("kanal artırıldı " + (++kanal));
		} else {
			System.out.println("kanal buluamadı");
		}

	}

	public void kanalAsagi() {
		if (kanal < 120 && kanal >= 1 &&acik==true) {
			System.out.println("kanal azaltıldı " + (--kanal));
		} else {
			System.out.println("kanal buluamadı");
		}

	}

	public void sesArttir() {
		if (sesSeviyesi < 7 && sesSeviyesi >= 1 &&acik==true) {
			System.out.println("ses seviyesi artırıldı " + (++sesSeviyesi));

		} else {
			System.out.println("HATA");
		}

	}

	public void sesAzalt() {
		if (sesSeviyesi < 7 && sesSeviyesi >= 1 &&acik==true) {
			System.out.println("ses seviyesi azaltıldı " + (--sesSeviyesi));

		} else {
			System.out.println("HATA");
		}
	}

}
