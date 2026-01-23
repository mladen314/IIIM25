package cas_260123;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ucenici x = new Ucenici();
		x.ime="Marko";
		x.prezime = "Markovic";
		x.razred = 3;
		x.srednja_ocjena = 3.51;
		
		Ucenici y = new Ucenici();
		y.ime="Ana";
		y.prezime = "Andric";
		y.razred = 4;
		y.srednja_ocjena = 4.51;
		
		Ucenici z = y;
		
		System.out.println("Ucenik "+y.ime+" je "+y.razred+". razred.");
		
		
	}

}
