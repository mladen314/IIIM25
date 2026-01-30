package cas_260123;

public class Ucenici {
	
	String ime;
	String prezime;
	int razred;
	double srednja_ocjena;
	private int pin = 1234;
	
	
	
	public Ucenici(String ime, String prezime, int razred, double srednja_ocjena, int pin) {
		this.ime = ime;
		this.prezime = prezime;
		this.razred = razred;
		this.srednja_ocjena = srednja_ocjena;
		this.pin = pin;
		
		this.info();
		
	}
	public Ucenici(String ime, String prezime, int razred, double srednja_ocjena) {
		this.ime = ime;
		this.prezime = prezime;
		this.razred = razred;
		this.srednja_ocjena = srednja_ocjena;
		
		this.info();
	}

	void info() {
		System.out.println("Ovaj objekat je "+ime+" "+prezime);
	}
	
	boolean ispravan_pin(int x) {
		return x==pin;
	}
	/*
	static void f() {
		System.out.println("RADI");
	}*/

}
