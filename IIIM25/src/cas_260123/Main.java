package cas_260123;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ocjene = {5, 4, 2, 3, 5, 5};
		Ucenici x = new Ucenici("Marko", "Markovic", 3, ocjene ,5324);
		
		int [] ocjene2 = {5, 4, 5, 3, 5, 4};
		Ucenici y = new Ucenici("Ana", "Andric", 4, ocjene2, 4321);
		
		Ucenici z = y;
		
		//System.out.println("Ucenik "+y.ime+" je "+y.razred+". razred.");
		
		x.info();
		y.info();
		System.out.println(x.ispravan_pin(1234));
		//Ucenici.f();
		
		x.uporedi(y);
		y.uporedi(x);
		System.out.println(x.ime + ": " + x.srednja_ocjena);
		System.out.println(y.ime + ": " + y.srednja_ocjena);
		
	}

}
