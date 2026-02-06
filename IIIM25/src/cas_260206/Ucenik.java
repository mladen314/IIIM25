package cas_260206;

public class Ucenik extends Osoba{
	
	int razred;
	int [] ocjene;
	double srednja_ocjena;
	

	public Ucenik(String ime, String prezime, int jmbg, int razred, int [] ocjene) {
		super(ime, prezime, jmbg);

		this.razred = razred;
		this.ocjene = ocjene;
		this.set_srednja_ocjena();
	}
	
	void set_srednja_ocjena() {
		double s=0;
		for (int ocjena : ocjene) {
			s+=ocjena;
		}
		s/=ocjene.length;
		
		this.srednja_ocjena = Math.round(s*100)/100.0;
	}

}
