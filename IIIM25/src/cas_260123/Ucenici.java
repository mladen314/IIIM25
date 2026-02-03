package cas_260123;

import java.util.Iterator;

public class Ucenici {
	
	String ime;
	String prezime;
	int razred;
	int [] ocjene;
	double srednja_ocjena;
	private int pin = 1234;
	
	
	
	public Ucenici(String ime, String prezime, int razred, int [] ocjene, int pin) {
		this.ime = ime;
		this.prezime = prezime;
		this.razred = razred;
		this.ocjene = ocjene;
		this.pin = pin;
		this.set_srednja_ocjena();
		this.info();
		
	}
	

	public String get_ime() {
		return ime;
	}


	public void set_ime(String ime) {
		this.ime = ime;
	}


	public String get_prezime() {
		return prezime;
	}


	public void set_prezime(String prezime) {
		this.prezime = prezime;
	}

	void set_srednja_ocjena() {
		double s=0;
		
		for (int i = 0; i < ocjene.length; i++) {
			s+=ocjene[i];
		}
		s/=ocjene.length;
		
		//ili moze na sledeci nacin
		s=0;
		for (int ocjena : ocjene) {
			s+=ocjena;
		}
		s/=ocjene.length;
		
		this.srednja_ocjena = Math.round(s*100)/100.0;
	}



	void info() {
		System.out.println("Ovaj objekat je "+ime+" "+prezime);
	}
	
	boolean ispravan_pin(int x) {
		return x==pin;
	}
	
	
	/*
	 * Uporedjuje ucenika sa drugim ucenikom po uspjehu
	 * 
	 */
	
	void uporedi(Ucenici s) {
		if(this.srednja_ocjena>s.srednja_ocjena) {
			System.out.println("Ja sam bolji ucenik");
		} else if(this.srednja_ocjena==s.srednja_ocjena) {
			System.out.println("Isti smo");
		} else {
			System.out.println(s.ime +" je bolji ucenik");
		}
	}
	
}
