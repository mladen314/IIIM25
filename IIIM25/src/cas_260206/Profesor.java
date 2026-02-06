package cas_260206;

public class Profesor extends Osoba{
	
	String predmet;
	String [] odjeljenja;

	public Profesor(String ime, String prezime, int jmbg, String predmet, String [] odjelenja) {
		super(ime, prezime, jmbg);
		this.predmet = predmet;
		this.odjeljenja = odjelenja;
		
		
		
	}

	

}
