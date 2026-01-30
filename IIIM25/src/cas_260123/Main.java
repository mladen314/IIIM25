package cas_260123;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ucenici x = new Ucenici("Marko", "Markovic", 3, 3.51);
		
	
		Ucenici y = new Ucenici("Ana", "Andric", 4, 4.51, 4321);
		
		Ucenici z = y;
		
		//System.out.println("Ucenik "+y.ime+" je "+y.razred+". razred.");
		
		x.info();
		y.info();
		System.out.println(x.ispravan_pin(123));
		//Ucenici.f();
	}

}
